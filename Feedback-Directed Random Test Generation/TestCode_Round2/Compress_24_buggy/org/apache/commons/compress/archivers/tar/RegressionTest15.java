package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
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
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (-1));
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(304L, byteArray8, 0, 4);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(11L, byteArray8, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 52, (byte) 54, (byte) 48, (byte) 32 });
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 20L + "'", long67 == 20L);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 186L + "'", long71 == 186L);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) -1, 0);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray20, 0, (int) (short) 0, zipEncoding30);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray7, 3, (int) (byte) -1, zipEncoding30);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray7, 3, 0);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(20L, byteArray7, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 21L + "'", long35 == 21L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\nd", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (byte) -1, zipEncoding16);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(115L, byteArray4, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 356L + "'", long21 == 356L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 356L + "'", long22 == 356L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0, zipEncoding8);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 10, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (byte) 1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray5, (int) (byte) 0, (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(104L, byteArray5, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 104=150 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0, zipEncoding20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        byte[] byteArray27 = new byte[] { (byte) 10 };
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 1, (int) (byte) 1, zipEncoding36);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (byte) 0, (int) (byte) -1, zipEncoding36);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (-1), zipEncoding36);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 1, 0);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        byte[] byteArray48 = new byte[] { (byte) 10 };
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray48);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 1, (int) (byte) 1, zipEncoding57);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) (byte) 0, (int) (byte) -1, zipEncoding57);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray48);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray48);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (short) -1, (int) (short) 0, zipEncoding70);
        boolean boolean72 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray67);
        boolean boolean73 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray67);
        byte[] byteArray77 = new byte[] { (byte) 10 };
        long long78 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray77);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding86 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray83, 1, (int) (byte) 1, zipEncoding86);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) (byte) 0, (int) (byte) -1, zipEncoding86);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 0, (-1), zipEncoding86);
        int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray48, (int) (byte) 0, (int) (byte) 1, zipEncoding86);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) 1, 2, zipEncoding86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', (int) (short) 10, zipEncoding86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\001" + "'", str37, "\001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\001" + "'", str58, "\001");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L + "'", long78 == 10L);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\001" + "'", str87, "\001");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\nd" + "'", str91, "\nd");
    }
}

