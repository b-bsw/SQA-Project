package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 'a', byteArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(356L, byteArray6, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 356=544 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 1, (int) (byte) 1, zipEncoding17);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 2, (int) (byte) 1, zipEncoding17);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, (int) (short) 0, (int) (byte) 1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray27, 0, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10 };
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, (int) (byte) 1, zipEncoding48);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, (int) (byte) 0, (int) (byte) -1, zipEncoding48);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) ' ', (int) (byte) 0, zipEncoding48);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 1, zipEncoding48);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 3, byteArray5, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 3=3 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\001" + "'", str18, "\001");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\001" + "'", str49, "\001");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "d" + "'", str52, "d");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 101L + "'", long53 == 101L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 1, (int) (byte) 1, zipEncoding18);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, 1, zipEncoding18);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, 2, 1);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = null;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) -1, (int) (byte) -1, zipEncoding57);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 1, (int) (byte) 1, zipEncoding66);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        boolean boolean70 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray63, 0);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, 1, zipEncoding78);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) '4', (int) (byte) 0, zipEncoding78);
        int int82 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray31, 0, 2, zipEncoding78);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001\ufffd", byteArray3, (int) '4', 100, zipEncoding78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 54 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001" + "'", str19, "\001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11L + "'", long24 == 11L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ufffd" + "'", str38, "\ufffd");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 356L + "'", long39 == 356L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 356L + "'", long50 == 356L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\001" + "'", str67, "\001");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\001" + "'", str79, "\001");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\n" + "'", str80, "\n");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(41L, byteArray7, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 1, (int) (byte) 0, zipEncoding40);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray6, (int) (short) 100, 100, zipEncoding40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 102 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray6, 0, 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(41L, byteArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(101L, byteArray4, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 0, 3);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (short) 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray21, 0, (int) (byte) 100);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (int) (byte) 0, zipEncoding42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (byte) -1, zipEncoding42);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, (int) (short) 1, (int) (short) 1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(1L, byteArray4, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 48 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 58L + "'", long50 == 58L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-1));
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray4, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 3);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (byte) -1);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (-1));
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (short) -1, (int) (short) 0, zipEncoding40);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray37);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray37);
        byte[] byteArray47 = new byte[] { (byte) 10 };
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 1, (int) (byte) 1, zipEncoding56);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) 0, (int) (byte) -1, zipEncoding56);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (-1), zipEncoding56);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, 0);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray37);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (short) -1, zipEncoding69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, 3, zipEncoding69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\001" + "'", str57, "\001");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = null;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, (int) (byte) -1, zipEncoding31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray37);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray37, 0);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, 1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) '4', (int) (byte) 0, zipEncoding52);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray5, 0, 2, zipEncoding52);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(58L, byteArray5, 5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 58=72 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ufffd" + "'", str12, "\ufffd");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 356L + "'", long13 == 356L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 356L + "'", long24 == 356L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\n" + "'", str54, "\n");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (byte) 0, (int) (byte) -1, zipEncoding44);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray35);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) (short) -1, (int) (short) 0, zipEncoding57);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray54);
        boolean boolean60 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray54);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 0, (-1), zipEncoding73);
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray35, (int) (byte) 0, (int) (byte) 1, zipEncoding73);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, 2, zipEncoding73);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (byte) 0);
        long long86 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(201L, byteArray4, 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 201=311 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\nd" + "'", str78, "\nd");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray6, (int) (byte) 0, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray1, 0, 1, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, (int) (short) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) ' ', (-1));
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) -1, 0);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray32, (int) (byte) 0);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray32, (int) (short) 1, 0);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) ' ', 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 100, (int) (byte) 0, zipEncoding49);
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (short) -1, (int) (short) 0, zipEncoding60);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray57);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray57);
        byte[] byteArray67 = new byte[] { (byte) 10 };
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding76 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, 1, (int) (byte) 1, zipEncoding76);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (byte) 0, (int) (byte) -1, zipEncoding76);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 0, (-1), zipEncoding76);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, 0);
        boolean boolean83 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray57);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, (int) (short) -1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 0, 0, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', (int) (byte) -1, zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray6, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 49, (byte) 52, (byte) 52 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 256L + "'", long22 == 256L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 256L + "'", long23 == 256L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 320L + "'", long51 == 320L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\001" + "'", str77, "\001");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (byte) 1);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(303L, byteArray6, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 303=457 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) -1, (int) (short) 0, zipEncoding12);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, (-1));
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (short) -1, (int) (short) 0, zipEncoding31);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        byte[] byteArray38 = new byte[] { (byte) 10 };
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray38);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding47 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, 1, (int) (byte) 1, zipEncoding47);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) (byte) 0, (int) (byte) -1, zipEncoding47);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 0, (-1), zipEncoding47);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, 0);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray28, (int) (byte) 0, 2);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding81 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, 1, (int) (byte) 1, zipEncoding81);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (short) 1, (int) (byte) 0, zipEncoding81);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (-1), (int) (short) -1, zipEncoding81);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 10, (int) (short) -1, zipEncoding81);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (-1), zipEncoding81);
        boolean boolean87 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(775L, byteArray2, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 775=1407 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\001" + "'", str48, "\001");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L + "'", long72 == 10L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\001" + "'", str82, "\001");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 1, (int) (byte) 1, zipEncoding16);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 2, (int) (byte) 1, zipEncoding16);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 4, byteArray5, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray5, (int) (byte) 0, (int) (byte) 1, zipEncoding21);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 266L + "'", long26 == 266L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 266L + "'", long27 == 266L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n\001\ufffd" + "'", str30, "\n\001\ufffd");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, 3, 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(115L, byteArray6, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 115=163 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (short) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, 3);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = null;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) -1, (int) (byte) -1, zipEncoding46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray52, 0);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 0, 1, zipEncoding67);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) '4', (int) (byte) 0, zipEncoding67);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (byte) -1, zipEncoding67);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ndd" + "'", str26, "\ndd");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 356L + "'", long39 == 356L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\n" + "'", str69, "\n");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 1, zipEncoding12);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 0, (int) (byte) -1, zipEncoding12);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) -1, (int) (short) 0, zipEncoding25);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 0, (-1), zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (byte) 0, (int) (byte) 1, zipEncoding41);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) -1, zipEncoding53);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, 1);
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 3, byteArray3, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001" + "'", str13, "\001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 104L + "'", long62 == 104L);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 1, byteArray4, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, 2);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dd" + "'", str23, "dd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray2, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray15, (int) (short) 0, (int) (byte) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray15, 0, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray15, (int) (short) 1, (int) (short) 0);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray32);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (short) -1, (int) (short) 0, zipEncoding54);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray51);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray51);
        byte[] byteArray61 = new byte[] { (byte) 10 };
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 1, (int) (byte) 1, zipEncoding70);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (byte) 0, (int) (byte) -1, zipEncoding70);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 0, (-1), zipEncoding70);
        int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray32, (int) (byte) 0, (int) (byte) 1, zipEncoding70);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 1, (int) (byte) 1, zipEncoding82);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (short) 10, (int) (byte) -1, zipEncoding82);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray15, (int) (short) 0, 2, zipEncoding82);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray4, 0, (int) (short) 0, zipEncoding82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 356L + "'", long6 == 356L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\001" + "'", str71, "\001");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\001" + "'", str83, "\001");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(201L, byteArray7, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 201=311 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (-1));
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 0, (int) (byte) 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray21, 0);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) -1, (int) (short) 0, zipEncoding36);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 0, (-1), zipEncoding52);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 1, 0);
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray33, (int) (byte) 0, 2);
        byte[] byteArray65 = new byte[] { (byte) 10 };
        long long66 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray65);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding74 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, 1, (int) (byte) 1, zipEncoding74);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, (int) (byte) 0, (int) (byte) -1, zipEncoding74);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray65);
        long long78 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray65);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding86 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray83, 1, (int) (byte) 1, zipEncoding86);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, (int) (short) 1, (int) (byte) 0, zipEncoding86);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (-1), (int) (short) -1, zipEncoding86);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1), zipEncoding86);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 3, 0, zipEncoding86);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 256L + "'", long12 == 256L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L + "'", long66 == 10L);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\001" + "'", str75, "\001");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L + "'", long78 == 10L);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\001" + "'", str87, "\001");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) -1);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray18, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) ' ', (-1));
        byte[] byteArray40 = new byte[] { (byte) 10 };
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 1, (int) (byte) 1, zipEncoding49);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) (byte) 0, (int) (byte) -1, zipEncoding49);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 0, (int) (short) 0, zipEncoding49);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding49);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '4', (int) (byte) 0, zipEncoding49);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\001" + "'", str50, "\001");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 1, 1, zipEncoding41);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray4, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, 2);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(12L, byteArray6, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "dd" + "'", str24, "dd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 256L + "'", long13 == 256L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, 0, 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 2, (int) (byte) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray6, 1, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 303L + "'", long18 == 303L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 303L + "'", long19 == 303L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, (int) (byte) 0, zipEncoding23);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray5, 2, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 304L + "'", long14 == 304L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 304L + "'", long15 == 304L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("h", byteArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray6, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 3);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) ' ', (-1));
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (short) -1, (int) (short) 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        byte[] byteArray41 = new byte[] { (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 0, (int) (byte) -1, zipEncoding50);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (short) -1, (int) (short) 0, zipEncoding63);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray60);
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray60);
        byte[] byteArray70 = new byte[] { (byte) 10 };
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (byte) 0, (int) (byte) -1, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 0, (-1), zipEncoding79);
        int int83 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray41, (int) (byte) 0, (int) (byte) 1, zipEncoding79);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 0, 0, zipEncoding79);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 100, (-1), zipEncoding79);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(160L, byteArray7, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 320L + "'", long35 == 320L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\001" + "'", str51, "\001");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray4, 0, 2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (int) (short) 0, zipEncoding39);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        byte[] byteArray47 = new byte[] { (byte) 10 };
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 1, (int) (byte) 1, zipEncoding56);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) 0, (int) (byte) -1, zipEncoding56);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        boolean boolean60 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray47);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, (int) (short) -1, (int) (short) 0, zipEncoding69);
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray66);
        boolean boolean72 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray66);
        byte[] byteArray76 = new byte[] { (byte) 10 };
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray76);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, (int) (byte) 0, (int) (byte) -1, zipEncoding85);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 0, (-1), zipEncoding85);
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray47, (int) (byte) 0, (int) (byte) 1, zipEncoding85);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding92 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 0, (int) (byte) 0, zipEncoding92);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (short) -1, zipEncoding92);
        boolean boolean95 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long96 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long99 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\001" + "'", str57, "\001");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(zipEncoding92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 203L + "'", long96 == 203L);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray7, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (short) -1, zipEncoding36);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray4, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 0, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 256L + "'", long29 == 256L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) 1, 1, zipEncoding40);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, 3);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, 100);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 115L + "'", long53 == 115L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 115L + "'", long54 == 115L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (short) -1, (int) (short) 0, zipEncoding56);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray53);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray53);
        byte[] byteArray63 = new byte[] { (byte) 10 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding72 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray69, 1, (int) (byte) 1, zipEncoding72);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (byte) 0, (int) (byte) -1, zipEncoding72);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 0, (-1), zipEncoding72);
        int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray34, (int) (byte) 0, (int) (byte) 1, zipEncoding72);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, 2, zipEncoding72);
        boolean boolean78 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\001" + "'", str73, "\001");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\nd" + "'", str77, "\nd");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, 1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = null;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) -1, (int) (byte) -1, zipEncoding30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray36);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray36, 0);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 0, 1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) '4', (int) (byte) 0, zipEncoding51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 4, 100, zipEncoding51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 356L + "'", long23 == 356L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n" + "'", str53, "\n");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray4, (int) (short) 0, 3);
        java.lang.Class<?> wildcardClass34 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 48, (byte) 32 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray4, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, (int) (byte) 1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray5, 2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 104, (byte) 48, (byte) 32 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, 0, 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 2, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 100, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 3);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray5, (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 1, (int) (byte) 1, zipEncoding17);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 0, 1, zipEncoding17);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\001" + "'", str18, "\001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 710L + "'", long6 == 710L);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (short) -1, (int) (short) 0, zipEncoding39);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray36);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray36);
        byte[] byteArray46 = new byte[] { (byte) 10 };
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (byte) 0, (int) (byte) -1, zipEncoding55);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 0, (-1), zipEncoding55);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, 0);
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray36, (int) (byte) 0, 2);
        byte[] byteArray68 = new byte[] { (byte) 10 };
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding77 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, 1, (int) (byte) 1, zipEncoding77);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, (int) (byte) 0, (int) (byte) -1, zipEncoding77);
        long long80 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, (int) (short) 1, (int) (byte) 0, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (-1), (int) (short) -1, zipEncoding89);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1), zipEncoding89);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), (int) (short) 0, zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray2, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\001" + "'", str78, "\001");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L + "'", long80 == 10L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(254L, byteArray1, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 254=376 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (int) (short) 0, zipEncoding17);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray29, (int) (short) 0, (int) (byte) 1);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray29, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray29, (int) (short) 0);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray46, (int) (short) 0, (int) (byte) 1);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray46, 0, (int) (byte) 100);
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding65 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) -1, (int) (short) 0, zipEncoding65);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray62);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray62);
        byte[] byteArray72 = new byte[] { (byte) 10 };
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding81 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, 1, (int) (byte) 1, zipEncoding81);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) (byte) 0, (int) (byte) -1, zipEncoding81);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, 0, (-1), zipEncoding81);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, 1, 0);
        boolean boolean88 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray62);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding94 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, 1, (int) (short) -1, zipEncoding94);
        java.lang.String str96 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (byte) 1, 1, zipEncoding94);
        java.lang.String str97 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 3, 0, zipEncoding94);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray7, 2, (int) (short) 10, zipEncoding94);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 320L + "'", long20 == 320L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 256L + "'", long37 == 256L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 256L + "'", long55 == 256L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\001" + "'", str82, "\001");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(zipEncoding94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "\001" + "'", str96, "\001");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray4, 0, 2);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray32);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) -1);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray32, (int) (byte) 0, (int) (byte) -1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray48);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) -1);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray48, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) ' ', (-1));
        byte[] byteArray70 = new byte[] { (byte) 10 };
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (byte) 0, (int) (byte) -1, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, (int) (short) 0, zipEncoding79);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) 'a', (int) (byte) -1, zipEncoding79);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray32, 0, (-1), zipEncoding79);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding87 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 100, (int) (short) -1, zipEncoding87);
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding87);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray3, 1, (int) '#', zipEncoding87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 4 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 21L + "'", long40 == 21L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray19, 0, (int) (short) 0, zipEncoding29);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray6, 3, (int) (byte) -1, zipEncoding29);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) ' ', (-1));
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) -1, 0);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray44, (int) (byte) 0);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray61);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray61);
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray61);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) ' ', (-1));
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) (byte) -1, 0);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray74);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding84 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray74, 0, (int) (short) 0, zipEncoding84);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray61, 3, (int) (byte) -1, zipEncoding84);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) '4', (int) (short) 0, zipEncoding84);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray6, (int) ' ', 1, zipEncoding84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 33 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 21L + "'", long35 == 21L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 320L + "'", long53 == 320L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 21L + "'", long64 == 21L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(zipEncoding84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (short) -1);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) 1, zipEncoding33);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) 0, (int) (byte) -1, zipEncoding33);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray7, 0, (int) (byte) 0, zipEncoding33);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(201L, byteArray7, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\001" + "'", str34, "\001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) -1);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray25, (int) (byte) 0, (int) (byte) -1);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) -1);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray41, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) ' ', (-1));
        byte[] byteArray63 = new byte[] { (byte) 10 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding72 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray69, 1, (int) (byte) 1, zipEncoding72);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (byte) 0, (int) (byte) -1, zipEncoding72);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 0, (int) (short) 0, zipEncoding72);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) 'a', (int) (byte) -1, zipEncoding72);
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray25, 0, (-1), zipEncoding72);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, 1, zipEncoding72);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, 1);
        long long82 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 21L + "'", long33 == 21L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\001" + "'", str73, "\001");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 220L + "'", long82 == 220L);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 2, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, (int) (short) 0, (int) (byte) 1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray27, 0, (int) (byte) 100);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, (int) (short) 1, (int) (short) 0);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, (int) (byte) 1, zipEncoding48);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray45, 0);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, (int) (byte) 1, zipEncoding60);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 0, 1, zipEncoding60);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 100, (int) (short) -1, zipEncoding60);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 4, 0, zipEncoding60);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray5, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 256L + "'", long19 == 256L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 256L + "'", long40 == 256L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\001" + "'", str49, "\001");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\001" + "'", str61, "\001");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\n" + "'", str62, "\n");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(184L, byteArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(110L, byteArray6, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 256L + "'", long12 == 256L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 256L + "'", long17 == 256L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray7, (int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        byte[] byteArray2 = new byte[] {};
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 1, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) ' ', (-1));
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding64 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (short) -1, (int) (short) 0, zipEncoding64);
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray61);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray61);
        byte[] byteArray71 = new byte[] { (byte) 10 };
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray71);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding80 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, 1, (int) (byte) 1, zipEncoding80);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) (byte) 0, (int) (byte) -1, zipEncoding80);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 0, (-1), zipEncoding80);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray42, (int) (byte) 0, (int) (byte) 1, zipEncoding80);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 0, 0, zipEncoding80);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (short) 100, (int) (short) -1, zipEncoding80);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (short) 0, (int) (byte) -1, zipEncoding80);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(110L, byteArray2, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 110=156 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 320L + "'", long36 == 320L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L + "'", long72 == 10L);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\001" + "'", str81, "\001");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 1, 1, zipEncoding41);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray58);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, 1, (int) (byte) -1);
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray58, (int) (byte) 1);
        long long66 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray73 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean74 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray73);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray73);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray73);
        boolean boolean77 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray73);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray73, 2, (int) (byte) 1, zipEncoding85);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray58, 2, 0, zipEncoding85);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1), zipEncoding85);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 21L + "'", long63 == 21L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 21L + "'", long66 == 21L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3 + "'", int87 == 3);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 10, (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 1, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(203L, byteArray4, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) -1, (int) (byte) -1, zipEncoding28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray34, 0);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 1, (int) (byte) 1, zipEncoding49);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, 1, zipEncoding49);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) '4', (int) (byte) 0, zipEncoding49);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 5, 0, zipEncoding49);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(186L, byteArray5, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 186=272 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 356L + "'", long21 == 356L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\001" + "'", str50, "\001");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\n" + "'", str51, "\n");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (byte) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) -1);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray24, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, (int) ' ', (-1));
        byte[] byteArray46 = new byte[] { (byte) 10 };
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (byte) 0, (int) (byte) -1, zipEncoding55);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 0, (int) (short) 0, zipEncoding55);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) 'a', (int) (byte) -1, zipEncoding55);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 2, (int) (byte) 1, zipEncoding55);
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray8, 1, (int) (short) 1);
        int int66 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray8, (int) (short) 0, 1);
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass68 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 110L + "'", long67 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) 0, (int) (byte) -1, zipEncoding27);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) 1, (int) (byte) 0, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 100, (-1), zipEncoding39);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray4, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\001" + "'", str28, "\001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) -1);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray24, (int) (byte) 0, (int) (byte) -1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 3);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 1);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding47 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (short) -1, (int) (short) 0, zipEncoding47);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray44, (int) (short) 0);
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (short) 1, (int) (byte) 0, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (short) 100, (-1), zipEncoding79);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (-1), (int) (byte) 0, zipEncoding79);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 2, zipEncoding79);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(186L, byteArray5, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 21L + "'", long32 == 21L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 110L + "'", long54 == 110L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 21L + "'", long85 == 21L);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray3, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) 1);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) ' ', (-1));
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) -1, 0);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray36);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray36, 0, (int) (short) 0, zipEncoding46);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray23, 3, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (int) (short) 0, zipEncoding46);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray6, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 21L + "'", long26 == 21L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (short) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, 1, (int) (short) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass15 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11L + "'", long16 == 11L);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 2, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray26, (int) (short) 0, (int) (byte) 1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray26, 0, (int) (byte) 100);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray26, (int) (short) 1, (int) (short) 0);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding47 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, 1, (int) (byte) 1, zipEncoding47);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray44, 0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding59 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 1, (int) (byte) 1, zipEncoding59);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, 0, 1, zipEncoding59);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 100, (int) (short) -1, zipEncoding59);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, 0, zipEncoding59);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long67 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 256L + "'", long13 == 256L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 256L + "'", long18 == 256L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 256L + "'", long39 == 256L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\001" + "'", str48, "\001");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\001" + "'", str60, "\001");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\n" + "'", str61, "\n");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) (short) -1, (int) (short) 0, zipEncoding53);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray50);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray50);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 0, (-1), zipEncoding69);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray31, (int) (byte) 0, (int) (byte) 1, zipEncoding69);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 0, 0, zipEncoding69);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (short) 1, zipEncoding69);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray4, 3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356L + "'", long9 == 356L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "d" + "'", str75, "d");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 356L + "'", long76 == 356L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 356L + "'", long77 == 356L);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(91L, byteArray2, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 91=133 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 5, byteArray6, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, (int) (byte) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) -1);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray25, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) ' ', (-1));
        byte[] byteArray47 = new byte[] { (byte) 10 };
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 1, (int) (byte) 1, zipEncoding56);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) 0, (int) (byte) -1, zipEncoding56);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 0, (int) (short) 0, zipEncoding56);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) 'a', (int) (byte) -1, zipEncoding56);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 2, (int) (byte) 1, zipEncoding56);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray9, 1, (int) (short) 1);
        int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray9, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray9, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\001" + "'", str57, "\001");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) 1, 1, zipEncoding40);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) 1, 1, zipEncoding40);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, 100);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 115L + "'", long47 == 115L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) -1, zipEncoding20);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001\ufffd", byteArray5, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 256L + "'", long13 == 256L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '4', (int) (short) -1);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 320L + "'", long21 == 320L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 0, (int) (short) 100);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray14, 0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (short) -1, (int) (short) 0, zipEncoding29);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) 1, zipEncoding45);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) 0, (int) (byte) -1, zipEncoding45);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 0, (-1), zipEncoding45);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, 0);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray26, (int) (byte) 0, 2);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (short) 1, (int) (byte) 0, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (-1), (int) (short) -1, zipEncoding79);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) ' ', (-1), zipEncoding79);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 4, (int) (byte) 0, zipEncoding79);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(90L, byteArray5, 5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 90=132 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\001" + "'", str46, "\001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(238L, byteArray6, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 4, (int) (byte) 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 1, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray15, (int) (byte) 1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 0, (int) (byte) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        byte[] byteArray41 = new byte[] { (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 0, (int) (byte) -1, zipEncoding50);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, (int) (short) 0, zipEncoding50);
        int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray15, (int) (byte) 1, 1, zipEncoding50);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1, zipEncoding50);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray7, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 21L + "'", long20 == 21L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 21L + "'", long26 == 21L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\001" + "'", str51, "\001");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 41L + "'", long59 == 41L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 41L + "'", long60 == 41L);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, 3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 0);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray41, (int) (short) 0, (int) (byte) 1);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray41, 0, (int) (byte) 100);
        byte[] byteArray53 = new byte[] { (byte) 10 };
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray53);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, 1, (int) (byte) 1, zipEncoding62);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (byte) 0, (int) (byte) -1, zipEncoding62);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) ' ', (int) (byte) 0, zipEncoding62);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) 10, (int) (byte) -1, zipEncoding62);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, (int) (byte) -1, zipEncoding62);
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(160L, byteArray5, 3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 160=240 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 256L + "'", long13 == 256L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\001" + "'", str28, "\001");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\001" + "'", str63, "\001");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 256L + "'", long68 == 256L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, (int) (byte) 1, zipEncoding54);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(12L, byteArray7, 5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 20L + "'", long60 == 20L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 20L + "'", long61 == 20L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 20L + "'", long65 == 20L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 0);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, 1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) -1, zipEncoding39);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(58L, byteArray7, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\001" + "'", str28, "\001");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n" + "'", str41, "\n");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(90L, byteArray7, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 90=132 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (short) 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray21, 0, (int) (byte) 100);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (int) (byte) 0, zipEncoding42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (byte) -1, zipEncoding42);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, (int) (short) 1, (int) (short) 1);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray4, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 32 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 58L + "'", long53 == 58L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 104, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 1, (int) (byte) 1, zipEncoding16);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 2, (int) (byte) 1, zipEncoding16);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 101L + "'", long23 == 101L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 101L + "'", long25 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 101L + "'", long26 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(254L, byteArray6, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 254=376 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray6, 2, (int) (byte) 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(115L, byteArray6, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 115=163 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 48, (byte) 32 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 184L + "'", long15 == 184L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11L + "'", long17 == 11L);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0, zipEncoding8);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (-1), zipEncoding24);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray5, 0, 2);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray5, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 203L + "'", long38 == 203L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 203L + "'", long39 == 203L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0, zipEncoding23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(91L, byteArray2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, (int) (short) 0, (int) (byte) 1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray20, 0, (int) (byte) 100);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (int) (byte) 0, zipEncoding41);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) -1, zipEncoding41);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray3, (int) (short) 1, (int) (short) 1);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) ' ', (int) (byte) 0);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (short) -1, (int) (short) 0, zipEncoding60);
        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean70 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray69);
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray69);
        int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray69, (int) (short) 0, (int) (byte) 1);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray69, 0, (int) (byte) 100);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray69, (int) (byte) 0, (int) (byte) 1, zipEncoding85);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (-1), (-1), zipEncoding85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 0, (int) (byte) 100, zipEncoding85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 48 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) -1);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray24, (int) (byte) 0, (int) (byte) -1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 3);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 1);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding47 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (short) -1, (int) (short) 0, zipEncoding47);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray44, (int) (short) 0);
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (short) 1, (int) (byte) 0, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (short) 100, (-1), zipEncoding79);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (-1), (int) (byte) 0, zipEncoding79);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 2, zipEncoding79);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray5, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 21L + "'", long32 == 21L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 110L + "'", long54 == 110L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(20L, byteArray4, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 20=24 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356L + "'", long9 == 356L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 356L + "'", long14 == 356L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-1), byteArray5, (int) (short) 1, 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (byte) 0, 2);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 110L + "'", long32 == 110L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray4, 0, 2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (int) (short) 0, zipEncoding39);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray11 = new byte[] {};
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray11);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray11);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) 0, (int) (byte) -1, zipEncoding27);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) 1, (int) (byte) 0, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 10, 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, (int) (byte) 0, zipEncoding39);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\001" + "'", str28, "\001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray8, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) -1);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray22, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) ' ', (-1));
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (int) (short) 0, zipEncoding53);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) 'a', (int) (byte) -1, zipEncoding53);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 1, (int) (byte) 0, zipEncoding53);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass61 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 21L + "'", long59 == 21L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 21L + "'", long60 == 21L);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray4, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, (int) (short) 0, (int) (byte) 1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray20, 0, (int) (byte) 100);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (int) (byte) 0, zipEncoding41);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) -1, zipEncoding41);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 1, (int) (byte) 1, zipEncoding19);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) (byte) -1, zipEncoding19);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, (int) (byte) 0, zipEncoding31);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) 0, zipEncoding31);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(186L, byteArray2, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 186=272 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\001" + "'", str20, "\001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(254L, byteArray6, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 254=376 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (-1));
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray33, (int) (short) 0, (int) (byte) 1);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray33, 0, (int) (byte) 100);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) ' ', (int) (byte) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (int) (byte) 0, zipEncoding54);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding61 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 10, (int) (byte) 10, zipEncoding61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 320L + "'", long26 == 320L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 0, (int) (byte) 0);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray15, 0, 1);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (short) -1, (int) (short) 0, zipEncoding30);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 0, (-1), zipEncoding46);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, 0);
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray27, 0, 100);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (byte) -1, (int) (short) 0);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean70 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray69);
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray69);
        int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray69, (int) (short) 0, (int) (byte) 1);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray69, 0, (int) (byte) 100);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray69, (int) (byte) 0, (int) (byte) 1, zipEncoding85);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray27, (int) (short) 0, (-1), zipEncoding85);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) 'a', (int) (byte) 0, zipEncoding85);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) -1, zipEncoding85);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 48, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 0, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 256L + "'", long29 == 256L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 256L + "'", long36 == 256L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) ' ', (-1));
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) -1, 0);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray29, 0, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray16, 3, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 5, (int) (byte) 0, zipEncoding39);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (short) -1, (int) (short) 0, zipEncoding56);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray53);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray53);
        byte[] byteArray63 = new byte[] { (byte) 10 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding72 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray69, 1, (int) (byte) 1, zipEncoding72);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (byte) 0, (int) (byte) -1, zipEncoding72);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 0, (-1), zipEncoding72);
        int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray34, (int) (byte) 0, (int) (byte) 1, zipEncoding72);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, 2, zipEncoding72);
        boolean boolean78 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 0, (int) (short) 10);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\001" + "'", str73, "\001");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\nd" + "'", str77, "\nd");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(20L, byteArray1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) -1);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray19, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        byte[] byteArray41 = new byte[] { (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 0, (int) (byte) -1, zipEncoding50);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, (int) (short) 0, zipEncoding50);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) 'a', (int) (byte) -1, zipEncoding50);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '4', (int) (byte) 0, zipEncoding50);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(160L, byteArray5, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 160=240 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\001" + "'", str51, "\001");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, (int) (short) 0, (int) (byte) 1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray20, 0, (int) (byte) 100);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (int) (byte) 0, zipEncoding41);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) -1, zipEncoding41);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray3, (int) (short) 1, (int) (short) 1);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) ' ', (int) (byte) 0);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 48 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 58L + "'", long52 == 58L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 58L + "'", long53 == 58L);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(710L, byteArray5, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 710=1306 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) -1);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 2, (int) (short) -1, zipEncoding25);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 256L + "'", long28 == 256L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356L + "'", long9 == 356L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 356L + "'", long10 == 356L);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray5, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) 1, (int) (byte) 0, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) 'a', (int) (byte) 0, zipEncoding51);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray5, (int) (byte) 0, (int) (byte) 1, zipEncoding51);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 256L + "'", long11 == 256L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 256L + "'", long18 == 256L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray19, 0, (int) (short) 0, zipEncoding29);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray6, 3, (int) (byte) -1, zipEncoding29);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray6, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 0, 4);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 100, (int) (short) 1, zipEncoding35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 256L + "'", long32 == 256L);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 0, (int) (short) 0, zipEncoding42);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 1, 1, zipEncoding42);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray7, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 3, byteArray7, 5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 48, (byte) 32, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, (int) (byte) 0, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 256L + "'", long19 == 256L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) -1, (int) (short) 0, zipEncoding23);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 0, (-1), zipEncoding39);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, 0);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray20, 0, 2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) 0, (int) (short) 0, zipEncoding55);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 4, zipEncoding55);
        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray65);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray65);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray65, (int) (short) 0, (int) (byte) 1);
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray65, 0, (int) (byte) 100);
        byte[] byteArray80 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray80);
        boolean boolean82 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray80);
        boolean boolean83 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray80);
        boolean boolean84 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray80);
        byte[] byteArray89 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding92 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray89, 1, (int) (byte) 1, zipEncoding92);
        int int94 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray80, 2, (int) (byte) 1, zipEncoding92);
        int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray65, (int) (byte) 0, 0, zipEncoding92);
        int int96 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 2, (int) (short) 1, zipEncoding92);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "dd\nd" + "'", str57, "dd\nd");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\001" + "'", str93, "\001");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 3 + "'", int96 == 3);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray14, (int) (short) 0, (int) (byte) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray14, 0, (int) (byte) 100);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding33);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        byte[] byteArray40 = new byte[] { (byte) 10 };
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 1, (int) (byte) 1, zipEncoding49);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) (byte) 0, (int) (byte) -1, zipEncoding49);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, (-1), zipEncoding49);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, 0);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (short) -1, zipEncoding62);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 1, 1, zipEncoding62);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', 0, zipEncoding62);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray5, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 256L + "'", long23 == 256L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\001" + "'", str50, "\001");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, (int) (short) -1, (int) (short) 0, zipEncoding52);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        byte[] byteArray59 = new byte[] { (byte) 10 };
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding68 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, 1, (int) (byte) 1, zipEncoding68);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (byte) 0, (int) (byte) -1, zipEncoding68);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 0, (-1), zipEncoding68);
        int int72 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray30, (int) (byte) 0, (int) (byte) 1, zipEncoding68);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, 0, zipEncoding68);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (int) (short) 1, zipEncoding68);
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long79 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 356L + "'", long8 == 356L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\001" + "'", str69, "\001");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "d" + "'", str74, "d");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 356L + "'", long75 == 356L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 356L + "'", long76 == 356L);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) 1);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 320L + "'", long31 == 320L);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray5, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray5, 2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, 2, zipEncoding17);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray4, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n\001" + "'", str18, "\n\001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11L + "'", long19 == 11L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 356L + "'", long8 == 356L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray5, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 10, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 0, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(254L, byteArray4, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 254=376 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (short) 1);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray5, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray26, (int) (short) 0, (int) (byte) 1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray26, 0, (int) (byte) 100);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (short) -1, (int) (short) 0, zipEncoding45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        byte[] byteArray52 = new byte[] { (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray52);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding61 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, 1, (int) (byte) 1, zipEncoding61);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) (byte) 0, (int) (byte) -1, zipEncoding61);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 0, (-1), zipEncoding61);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, 0);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding74 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (short) -1, zipEncoding74);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (byte) 1, 1, zipEncoding74);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 0, 0, zipEncoding74);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 256L + "'", long35 == 256L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\001" + "'", str62, "\001");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(zipEncoding74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\001" + "'", str76, "\001");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray6, (int) (byte) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 50, (byte) 53, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 256L + "'", long14 == 256L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 1, (int) (byte) -1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray16, (int) (byte) 0, (int) (byte) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray32);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) -1);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray32, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) ' ', (-1));
        byte[] byteArray54 = new byte[] { (byte) 10 };
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 1, (int) (byte) 1, zipEncoding63);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) (byte) 0, (int) (byte) -1, zipEncoding63);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 0, (int) (short) 0, zipEncoding63);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) 'a', (int) (byte) -1, zipEncoding63);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray16, 0, (-1), zipEncoding63);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 100, (int) (short) -1, zipEncoding71);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(220L, byteArray5, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 21L + "'", long24 == 21L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray6, (int) (byte) 0, (-1));
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ndd\n" + "'", str19, "\ndd\n");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) (byte) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) 'a');
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (-1));
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(160L, byteArray6, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 38 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 21L + "'", long22 == 21L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, (int) (byte) 1, zipEncoding54);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (-1));
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(203L, byteArray7, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 203=313 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }
}

