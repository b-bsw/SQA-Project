package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11L + "'", long15 == 11L);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray4, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (short) 1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (-1));
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 0, (int) (byte) 0);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) -1, 0);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray34, (int) (short) 1);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 1, (-1));
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray34, 0, (int) (byte) 0);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray60);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray60);
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray60, (int) (short) 0, (int) (byte) 1);
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray60, 0, (int) (byte) 100);
        byte[] byteArray72 = new byte[] { (byte) 10 };
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding81 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, 1, (int) (byte) 1, zipEncoding81);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) (byte) 0, (int) (byte) -1, zipEncoding81);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (int) (byte) 0, zipEncoding81);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 10, (int) (byte) 0, zipEncoding81);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000h", byteArray9, 0, (-1), zipEncoding81);
        long long87 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(356L, byteArray9, 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000h", byteArray9, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 53, (byte) 52, (byte) 52, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 320L + "'", long52 == 320L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 320L + "'", long53 == 320L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\001" + "'", str82, "\001");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 320L + "'", long87 == 320L);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
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
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray7, 3, (int) (short) 0);
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 320L + "'", long48 == 320L);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 2, (int) (short) -1);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray39);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) -1);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray39, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) ' ', (-1));
        byte[] byteArray61 = new byte[] { (byte) 10 };
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 1, (int) (byte) 1, zipEncoding70);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (byte) 0, (int) (byte) -1, zipEncoding70);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 0, (int) (short) 0, zipEncoding70);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, (int) 'a', (int) (byte) -1, zipEncoding70);
        int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray22, 1, (int) (byte) 0, zipEncoding70);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1, zipEncoding70);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean78 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(60L, byteArray6, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 60=74 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 21L + "'", long27 == 21L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\001" + "'", str71, "\001");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\n" + "'", str76, "\n");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 320L + "'", long77 == 320L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(90L, byteArray4, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 51, (byte) 50 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray35);
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
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 0, 0, zipEncoding86);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 100, (int) (short) -1, zipEncoding86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 5, 5, zipEncoding86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 256L + "'", long10 == 256L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 21L + "'", long24 == 21L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
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
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray7, (int) (byte) 0, (int) (byte) 0);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, 5);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray5, 0, 1);
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
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray17, 0, 100);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) -1, (int) (short) 0);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean60 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray59);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray59);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray59, (int) (short) 0, (int) (byte) 1);
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray59, 0, (int) (byte) 100);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, 1, (int) (byte) 1, zipEncoding75);
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray59, (int) (byte) 0, (int) (byte) 1, zipEncoding75);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray17, (int) (short) 0, (-1), zipEncoding75);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (byte) 0, zipEncoding75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\001" + "'", str76, "\001");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 203L + "'", long37 == 203L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 203L + "'", long38 == 203L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray43, 0);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray56 = new byte[] { (byte) 10 };
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray56);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray56);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (short) 1, (int) (byte) 0, zipEncoding85);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) 'a', (int) (byte) 0, zipEncoding85);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 3, (int) (short) 0, zipEncoding85);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001\ufffd", byteArray5, (int) (short) 100, (-1), zipEncoding85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 11L + "'", long52 == 11L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L + "'", long76 == 10L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 3);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 3, 0);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(266L, byteArray8, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 2);
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\n" + "'", str84, "\n");
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\nd", byteArray4, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 102 out of bounds for byte[3]");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray6, 2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(20L, byteArray6, 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 50, (byte) 52 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray6, 0, 3);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(41L, byteArray6, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 775L + "'", long22 == 775L);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(11L, byteArray5, 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -2");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 101L + "'", long25 == 101L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
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
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
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
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(60L, byteArray4, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 0, (int) (short) 0, zipEncoding16);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray5, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) ' ', (-1));
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) -1, 0);
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
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray42, 0, 2);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 1, (int) (byte) 1, zipEncoding82);
        boolean boolean84 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray79);
        boolean boolean86 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray79, 0);
        byte[] byteArray91 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding94 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray91, 1, (int) (byte) 1, zipEncoding94);
        java.lang.String str96 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 0, 1, zipEncoding94);
        int int97 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding94);
        int int98 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray28, (int) (short) 1, 1, zipEncoding94);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\001", byteArray5, (int) (short) -1, (int) (short) 10, zipEncoding94);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -3, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
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
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\001" + "'", str83, "\001");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "\001" + "'", str95, "\001");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "\n" + "'", str96, "\n");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
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
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 3);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) ' ', (-1));
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (byte) -1, 0);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray59, (int) (byte) 0);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray59, (int) (short) 1, 0);
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray59);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray76);
        boolean boolean83 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray76, 0);
        byte[] byteArray88 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding91 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray88, 1, (int) (byte) 1, zipEncoding91);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 0, 1, zipEncoding91);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (byte) 1, (int) (short) -1, zipEncoding91);
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, 0, zipEncoding91);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(120L, byteArray6, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\001" + "'", str80, "\001");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "\001" + "'", str92, "\001");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\n" + "'", str93, "\n");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, 100, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 356L + "'", long10 == 356L);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
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
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 0, 100);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, (int) (short) 0);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray46, (int) (short) 0, (int) (byte) 1);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray46, 0, (int) (byte) 100);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, 1, (int) (byte) 1, zipEncoding62);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray46, (int) (byte) 0, (int) (byte) 1, zipEncoding62);
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray4, (int) (short) 0, (-1), zipEncoding62);
        java.lang.Class<?> wildcardClass66 = byteArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\001" + "'", str63, "\001");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
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
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray38, (int) (short) 0, (int) (byte) 1);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray38, 2);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray38, (int) (byte) 0, 0);
        byte[] byteArray52 = new byte[] { (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray52);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray52);
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
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) 'a', (int) (byte) 0, zipEncoding81);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray38, 0, (int) (byte) 1, zipEncoding81);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001\ufffd", byteArray4, 10, (int) 'a', zipEncoding81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 13 out of bounds for byte[3]");
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 110L + "'", long29 == 110L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 1, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
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
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (short) 100, (int) (short) -1, zipEncoding79);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, (int) (short) 0, (int) (byte) -1, zipEncoding79);
        long long87 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean88 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(320L, byteArray4, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 110L + "'", long33 == 110L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray22, (int) (short) 0, (int) ' ');
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray22, 0, 3);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, (int) (short) 0, (int) (byte) 1);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray45, 0, (int) (byte) 100);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, (int) (short) 1, (int) (short) 0);
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 1, (int) (byte) 1, zipEncoding66);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        boolean boolean70 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray63, 0);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, 1, zipEncoding78);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 100, (int) (short) -1, zipEncoding78);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, 1, zipEncoding78);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (-1), zipEncoding78);
        // The following exception was thrown during execution in test generation
        try {
            long long86 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 256L + "'", long10 == 256L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 21L + "'", long27 == 21L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 21L + "'", long32 == 21L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 256L + "'", long58 == 256L);
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\377" + "'", str82, "\377");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 320L + "'", long21 == 320L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
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
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (byte) 0);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) -1);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray62);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray62);
        int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray62, (int) (short) 0, (int) (byte) 1);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray62, 0, (int) (byte) 100);
        byte[] byteArray77 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean78 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray77);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray77);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray77);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray77);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        int int91 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray77, 2, (int) (byte) 1, zipEncoding89);
        int int92 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray62, (int) (byte) 0, 0, zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray6, (int) ' ', (int) (short) 1, zipEncoding89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 33 out of bounds for byte[4]");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0, zipEncoding26);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 0, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 5, byteArray5, (int) (byte) 1, 1);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 53, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 256L + "'", long30 == 256L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 308L + "'", long41 == 308L);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
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
            long long39 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
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
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        byte[] byteArray0 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (byte) 0, (int) (byte) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, (int) (short) -1);
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
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray26, 0, 2);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 1, (int) (byte) 1, zipEncoding66);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        boolean boolean70 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray63, 0);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, 1, zipEncoding78);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray26, (int) (byte) 0, (int) (byte) -1, zipEncoding78);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (int) (short) 0, zipEncoding78);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (short) 10, 0, zipEncoding78);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) 1, (int) (byte) 0, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) 0, zipEncoding52);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, (int) (byte) 0, (int) (byte) 1, zipEncoding52);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(186L, byteArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 256L + "'", long12 == 256L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 256L + "'", long19 == 256L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\nd", byteArray1, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
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
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray4, 0, 2, zipEncoding51);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 356L + "'", long12 == 356L);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 455L + "'", long56 == 455L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(104L, byteArray6, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 104=150 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 0, zipEncoding16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray5, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, (int) (byte) 1, zipEncoding32);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (byte) 0, (int) (byte) -1, zipEncoding32);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) 1, (int) (byte) 0, zipEncoding44);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, (int) (short) 0, (-1), zipEncoding44);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\001" + "'", str33, "\001");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 320L + "'", long50 == 320L);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (byte) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 2);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 0, (int) (byte) -1);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray7, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "dd" + "'", str25, "dd");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 3);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 21L + "'", long20 == 21L);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray6, 0, 3);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray29, (int) (short) 0, (int) (byte) 1);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray29, 0, (int) (byte) 100);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 1, (int) (byte) 1, zipEncoding56);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray44, 2, (int) (byte) 1, zipEncoding56);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray29, (int) (byte) 0, 0, zipEncoding56);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) 0, zipEncoding56);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\001" + "'", str57, "\001");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray5, 1, 1);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, 2, zipEncoding34);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, 0, zipEncoding34);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 21L + "'", long31 == 21L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n\001" + "'", str35, "\n\001");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
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
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11L + "'", long49 == 11L);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray7, 0, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray7, 2, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 1, (int) (short) -1);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) -1);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray28, (int) (byte) 0, (int) (byte) -1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray28, 3);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray28, 1);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) (short) -1, (int) (short) 0, zipEncoding51);
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray48);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray48);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray48, (int) (short) 0);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray48);
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray48);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) 1, zipEncoding71);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        long long74 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) 1, (int) (byte) 0, zipEncoding83);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) (short) 100, (-1), zipEncoding83);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (-1), (int) (byte) 0, zipEncoding83);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001\ufffd", byteArray7, 3, (-1), zipEncoding83);
        // The following exception was thrown during execution in test generation
        try {
            long long91 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 304L + "'", long16 == 304L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 304L + "'", long17 == 304L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 21L + "'", long36 == 21L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 110L + "'", long58 == 110L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\001" + "'", str72, "\001");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10L + "'", long74 == 10L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        java.lang.Class<?> wildcardClass53 = byteArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 0, (int) (byte) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) 'a');
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (-1));
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 21L + "'", long21 == 21L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001\ufffd", byteArray3, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[2]");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(160L, byteArray2, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 1");
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
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, 0);
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
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 21L + "'", long55 == 21L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) 1, zipEncoding8);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 1, (int) (short) 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001\ufffd", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(238L, byteArray5, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001" + "'", str9, "\001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11L + "'", long17 == 11L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1));
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (byte) -1, 0);
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
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray37, 0, 2);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding77 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, 1, (int) (byte) 1, zipEncoding77);
        boolean boolean79 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray74);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray74, 0);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, 0, 1, zipEncoding89);
        int int92 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding89);
        int int93 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray23, (int) (short) 1, 1, zipEncoding89);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (short) -1, zipEncoding89);
        boolean boolean95 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass96 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 256L + "'", long10 == 256L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -3, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
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
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\001" + "'", str78, "\001");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\n" + "'", str91, "\n");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2 + "'", int93 == 2);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 256L + "'", long13 == 256L);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray5, 0, 1);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, 2);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, 0, (int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray8, 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(104L, byteArray8, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 104=150 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 48, (byte) 48, (byte) 48, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "dd" + "'", str26, "dd");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, 0, 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 2, (int) (byte) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray6, 1, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 303L + "'", long20 == 303L);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) 'a');
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) -1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray30, (int) (byte) 1);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 1, (int) (byte) 1, zipEncoding57);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, 2, (int) (byte) 1, zipEncoding57);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray30, 2, 0, zipEncoding57);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray7, 0, (int) (short) -1, zipEncoding57);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray7, 5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 54 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 21L + "'", long35 == 21L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 21L + "'", long38 == 21L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\001" + "'", str58, "\001");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-1));
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(12L, byteArray4, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray2, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
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
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray4, 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 110L + "'", long34 == 110L);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
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
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, (int) (byte) 1, zipEncoding53);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass66 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 20L + "'", long59 == 20L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 20L + "'", long60 == 20L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 20L + "'", long64 == 20L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 20L + "'", long65 == 20L);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 2);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 100, 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
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
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, (int) (byte) 1, zipEncoding53);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 20L + "'", long59 == 20L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 20L + "'", long60 == 20L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding23);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        byte[] byteArray41 = new byte[] { (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 0, (int) (byte) -1, zipEncoding50);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, (int) (short) 0, zipEncoding50);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray34, 0);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) ' ', (-1));
        byte[] byteArray70 = new byte[] { (byte) 10 };
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, 1, (int) (byte) 1, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (byte) 0, (int) (byte) -1, zipEncoding79);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, (int) (short) 0, zipEncoding79);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (-1), (int) (byte) -1, zipEncoding79);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray7, 0, (int) (byte) 0, zipEncoding79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(710L, byteArray7, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
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
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
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
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 0, 0);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 21L + "'", long56 == 21L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
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
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001\ufffd", byteArray5, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 104 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 21L + "'", long56 == 21L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\000\n\001\n" + "'", str59, "\000\n\001\n");
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
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
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) ' ', (-1));
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray44);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (short) -1, (int) (short) 0, zipEncoding66);
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        boolean boolean69 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        byte[] byteArray73 = new byte[] { (byte) 10 };
        long long74 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray73);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 1, (int) (byte) 1, zipEncoding82);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, (int) (byte) 0, (int) (byte) -1, zipEncoding82);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 0, (-1), zipEncoding82);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray44, (int) (byte) 0, (int) (byte) 1, zipEncoding82);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, 0, 0, zipEncoding82);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) '#', (int) '4', zipEncoding82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 36 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 320L + "'", long20 == 320L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 320L + "'", long38 == 320L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10L + "'", long74 == 10L);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\001" + "'", str83, "\001");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
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
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(11L, byteArray4, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
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
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) (short) 100);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(304L, byteArray7, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 304=460 will not fit in octal number buffer of length -3");
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 20L + "'", long60 == 20L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 20L + "'", long65 == 20L);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray6, 0, 2);
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
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, (int) (byte) 1, zipEncoding39);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        byte[] byteArray51 = new byte[] { (byte) 10 };
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, (int) (byte) 1, zipEncoding60);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (byte) 0, (int) (byte) -1, zipEncoding60);
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray51);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (short) -1, (int) (short) 0, zipEncoding73);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        byte[] byteArray80 = new byte[] { (byte) 10 };
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray80);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) (byte) 0, (int) (byte) -1, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 0, (-1), zipEncoding89);
        int int93 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray51, (int) (byte) 0, (int) (byte) 1, zipEncoding89);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, 1, zipEncoding89);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 49, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 160L + "'", long44 == 160L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\001" + "'", str61, "\001");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "1" + "'", str94, "1");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
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
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("01\n", byteArray5, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray6, (int) (short) 0, (int) (byte) 1);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 2, (int) (byte) -1);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 10, (int) (short) 0);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) ' ', (-1));
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (byte) -1, 0);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray51);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray51);
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray51, (int) (byte) 1, (-1));
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (short) 0, (int) (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) ' ', (-1));
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) (byte) -1, 0);
        boolean boolean85 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray77, (int) (byte) 0);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray77, (int) (short) 1, 0);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) ' ', 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding94 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) (byte) 100, (int) (byte) 0, zipEncoding94);
        java.lang.String str96 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) 'a', 0, zipEncoding94);
        java.lang.String str97 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (-1), (-1), zipEncoding94);
        java.lang.String str98 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', (-1), zipEncoding94);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 356L + "'", long34 == 356L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 356L + "'", long39 == 356L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 320L + "'", long59 == 320L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 320L + "'", long60 == 320L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 320L + "'", long61 == 320L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(zipEncoding94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 3, (int) (byte) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 100, (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
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
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 320L + "'", long32 == 320L);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
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
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(103L, byteArray4, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) -1, 0);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) -1);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray38);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 2, (int) (short) -1);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray55);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, 1, (int) (byte) -1);
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray55, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) ' ', (-1));
        byte[] byteArray77 = new byte[] { (byte) 10 };
        long long78 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray77);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding86 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray83, 1, (int) (byte) 1, zipEncoding86);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, (int) (byte) 0, (int) (byte) -1, zipEncoding86);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 0, (int) (short) 0, zipEncoding86);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, (int) 'a', (int) (byte) -1, zipEncoding86);
        int int91 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray38, 1, (int) (byte) 0, zipEncoding86);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) 0, (int) (short) 1, zipEncoding86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 5, 4, zipEncoding86);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 21L + "'", long43 == 21L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L + "'", long78 == 10L);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\001" + "'", str87, "\001");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "\n" + "'", str92, "\n");
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
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
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(20L, byteArray5, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 21L + "'", long56 == 21L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\000\n\001\n" + "'", str59, "\000\n\001\n");
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 356L + "'", long5 == 356L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 356L + "'", long6 == 356L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 356L + "'", long7 == 356L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 356L + "'", long8 == 356L);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        byte[] byteArray41 = new byte[] { (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 0, (int) (byte) -1, zipEncoding50);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, (int) (short) 0, zipEncoding50);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (byte) -1, zipEncoding50);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 5, byteArray2, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5=5 will not fit in octal number buffer of length -3");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray6, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
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
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean69 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray68);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) -1);
        int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray68, (int) (byte) 0, (int) (byte) -1);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, 2, zipEncoding79);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (short) -1, zipEncoding79);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray7, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 12 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 21L + "'", long76 == 21L);
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\n\001" + "'", str80, "\n\001");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) -1);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) -1, (int) (short) 0, zipEncoding26);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 0, (-1), zipEncoding42);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, 0);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray23, 0, 2);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 1, (int) (byte) 1, zipEncoding63);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray60);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray60, 0);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, 1, (int) (byte) 1, zipEncoding75);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 0, 1, zipEncoding75);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray23, (int) (byte) 0, (int) (byte) -1, zipEncoding75);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (int) (short) 0, zipEncoding75);
        // The following exception was thrown during execution in test generation
        try {
            long long82 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\001" + "'", str76, "\001");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\n" + "'", str77, "\n");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
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
        // The following exception was thrown during execution in test generation
        try {
            long long82 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (short) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, 1, (int) (byte) -1);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray31);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray31, 0, 2);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (short) -1, (int) (short) 0, zipEncoding48);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        byte[] byteArray55 = new byte[] { (byte) 10 };
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding64 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 1, (int) (byte) 1, zipEncoding64);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, (int) (byte) 0, (int) (byte) -1, zipEncoding64);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 0, (-1), zipEncoding64);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray31, (int) (byte) 0, (int) (byte) 1, zipEncoding64);
        int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 3, (-1), zipEncoding64);
        java.lang.Class<?> wildcardClass70 = zipEncoding64.getClass();
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
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 49, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\001" + "'", str65, "\001");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0, zipEncoding8);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 2, (int) (short) -1);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) -1);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray38, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) ' ', (-1));
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 0, (int) (short) 0, zipEncoding69);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) 'a', (int) (byte) -1, zipEncoding69);
        int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, 1, (int) (byte) 0, zipEncoding69);
        int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray5, (int) (short) 1, (int) (short) 0, zipEncoding69);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(304L, byteArray5, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 21L + "'", long26 == 21L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray21, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray38, (int) (short) 0, (int) (byte) 1);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray38, 0, (int) (byte) 100);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding59 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 1, (int) (byte) 1, zipEncoding59);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) (byte) 0, (int) (byte) -1, zipEncoding59);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (int) (byte) 0, zipEncoding59);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 10, (int) (byte) -1, zipEncoding59);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 5, zipEncoding59);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\001" + "'", str60, "\001");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\ndd\nd" + "'", str64, "\ndd\nd");
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 256L + "'", long19 == 256L);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
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
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean63 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(455L, byteArray8, 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(455L, byteArray8, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 55, (byte) 48, (byte) 55, (byte) 32 });
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 20L + "'", long61 == 20L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 20L + "'", long62 == 20L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray16, 0, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 1, (int) (short) 0);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) (short) -1, (int) (short) 0, zipEncoding55);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) 1, zipEncoding71);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 0, (-1), zipEncoding71);
        int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray33, (int) (byte) 0, (int) (byte) 1, zipEncoding71);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) 10, (int) (byte) -1, zipEncoding83);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray16, (int) (short) 0, 2, zipEncoding83);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray5, 0, (int) (short) 0, zipEncoding83);
        boolean boolean88 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\001", byteArray5, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 356L + "'", long7 == 356L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\001" + "'", str72, "\001");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 256L + "'", long20 == 256L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) 'a');
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) -1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray30, (int) (byte) 1);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 1, (int) (byte) 1, zipEncoding57);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, 2, (int) (byte) 1, zipEncoding57);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray30, 2, 0, zipEncoding57);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray7, 0, (int) (short) -1, zipEncoding57);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(103L, byteArray7, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 21L + "'", long35 == 21L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 21L + "'", long38 == 21L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\001" + "'", str58, "\001");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (-1));
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 12 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray6, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 49, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) -1, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray18, 0, (int) (short) 0, zipEncoding28);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray5, 3, (int) (byte) -1, zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 10, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
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
        // The following exception was thrown during execution in test generation
        try {
            int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray4, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
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
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
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
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(238L, byteArray4, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 238=356 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, 0, 1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001" + "'", str13, "\001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
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
        boolean boolean68 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray5, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 3, 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray6, (int) (byte) 0, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray4, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356L + "'", long9 == 356L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray3, (int) (short) 1, (int) (short) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 49 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) -1);
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
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0, zipEncoding54);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (-1));
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 3, byteArray6, 0, 4);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 48, (byte) 51, (byte) 32 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, (int) (short) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray23, 0);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 0, 1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 100, (int) (short) -1, zipEncoding38);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
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
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, 0);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray49, 0, 100);
        byte[] byteArray85 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray85, (int) (short) -1, (int) (short) 0, zipEncoding88);
        int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray49, (int) (byte) 1, 0, zipEncoding88);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, (int) (byte) 1, zipEncoding88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 256L + "'", long18 == 256L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n" + "'", str40, "\n");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray5, 0, 3);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray28, (int) (short) 0, (int) (byte) 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray28, 0, (int) (byte) 100);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray43, 2, (int) (byte) 1, zipEncoding55);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray28, (int) (byte) 0, 0, zipEncoding55);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) 0, zipEncoding55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray5, 2, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 356L + "'", long10 == 356L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 356L + "'", long15 == 356L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 610L + "'", long19 == 610L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray1, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
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
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-1), byteArray6, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 99 out of bounds for byte[4]");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
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
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray3, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 11L + "'", long46 == 11L);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 100, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray28, (int) (short) 0, (int) (byte) 1);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray28, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray28, 0, (int) (byte) 100);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray28, 0);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray47);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray47, 0);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray64 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray64);
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray64);
        int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray64, (int) (short) 0, (int) (byte) 1);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray64, 0, (int) (byte) 100);
        byte[] byteArray76 = new byte[] { (byte) 10 };
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray76);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, (int) (byte) 0, (int) (byte) -1, zipEncoding85);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) ' ', (int) (byte) 0, zipEncoding85);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) 10, (int) (byte) -1, zipEncoding85);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (short) 1, (int) (byte) -1, zipEncoding85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, (int) (byte) 100, zipEncoding85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 21L + "'", long21 == 21L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 256L + "'", long36 == 256L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\001" + "'", str51, "\001");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray6, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
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
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 110L + "'", long31 == 110L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 110L + "'", long32 == 110L);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 3);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(238L, byteArray8, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
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
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray41);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray41, 2, (int) (byte) 1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (short) -1, zipEncoding53);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 0);
        boolean boolean60 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (byte) 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 110L + "'", long34 == 110L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 3);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, (int) (short) 0, (int) (byte) 1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray27, 0, (int) (byte) 100);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray42, 2, (int) (byte) 1, zipEncoding54);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray27, (int) (byte) 0, 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 0, zipEncoding54);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass60 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, 0);
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
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray33);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray33, 0, 2);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        boolean boolean77 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray70, 0);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 0, 1, zipEncoding85);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding85);
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray19, (int) (short) 1, 1, zipEncoding85);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 0, zipEncoding85);
        java.lang.Class<?> wildcardClass91 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -3, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\n" + "'", str87, "\n");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
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
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(101L, byteArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 101=145 will not fit in octal number buffer of length -2");
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
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
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
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 100, 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) -1, zipEncoding21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(41L, byteArray2, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 41=51 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 0, (int) (short) 100);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray13);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray13, 0);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (short) -1, (int) (short) 0, zipEncoding28);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (byte) 0, (int) (byte) -1, zipEncoding44);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (-1), zipEncoding44);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, 0);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray25, (int) (byte) 0, 2);
        byte[] byteArray57 = new byte[] { (byte) 10 };
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 1, (int) (byte) 1, zipEncoding66);
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (byte) 0, (int) (byte) -1, zipEncoding66);
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (short) 1, (int) (byte) 0, zipEncoding78);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (-1), (int) (short) -1, zipEncoding78);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) ' ', (-1), zipEncoding78);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, (int) (byte) 0, zipEncoding78);
        java.lang.Class<?> wildcardClass84 = zipEncoding78.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\001" + "'", str67, "\001");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\001" + "'", str79, "\001");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
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
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray24);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray24, 0);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, 1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 100, (int) (short) -1, zipEncoding39);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, (int) (short) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 32, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 256L + "'", long19 == 256L);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(710L, byteArray5, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\nd", byteArray7, (int) (byte) 0, 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray7, (int) (byte) 0, (int) (short) 0);
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
        // The following exception was thrown during execution in test generation
        try {
            int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\001", byteArray7, (-1), (int) 'a', zipEncoding47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
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
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray5, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 49, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, 1, (int) (short) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) -1, (int) (short) 0, zipEncoding26);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 0, (-1), zipEncoding42);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, 0);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray23, 0, 100);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (byte) -1, (int) (short) 0);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray65);
        boolean boolean67 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray65);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray65, (int) (short) 0, (int) (byte) 1);
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray65, 0, (int) (byte) 100);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding81 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, 1, (int) (byte) 1, zipEncoding81);
        int int83 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray65, (int) (byte) 0, (int) (byte) 1, zipEncoding81);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray23, (int) (short) 0, (-1), zipEncoding81);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (int) (short) -1, zipEncoding81);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long91 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\001" + "'", str82, "\001");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) -1);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray26, (int) (byte) 0, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) -1);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray42, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) ' ', (-1));
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 0, (int) (short) 0, zipEncoding73);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) 'a', (int) (byte) -1, zipEncoding73);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray26, 0, (-1), zipEncoding73);
        int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, 1, zipEncoding73);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray7, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 102 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 220L + "'", long81 == 220L);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, (int) (byte) 0, (int) (byte) 1, zipEncoding22);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, (int) (byte) 0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray36);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) -1);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray36, (int) (byte) 0, (int) (byte) -1);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) -1);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray52, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) ' ', (-1));
        byte[] byteArray74 = new byte[] { (byte) 10 };
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray74);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) (byte) 0, (int) (byte) -1, zipEncoding83);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 0, (int) (short) 0, zipEncoding83);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) 'a', (int) (byte) -1, zipEncoding83);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray36, 2, (int) (byte) 1, zipEncoding83);
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) (short) 0, zipEncoding83);
        long long90 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 21L + "'", long44 == 21L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 266L + "'", long90 == 266L);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-1), byteArray6, (int) (short) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(160L, byteArray1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 160=240 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 1, byteArray6, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray7, (int) (byte) 0, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(256L, byteArray7, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 256L + "'", long20 == 256L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
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
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray4, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0, zipEncoding8);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray5, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(zipEncoding8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 11L + "'", long8 == 11L);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
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
            int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(12L, byteArray5, 5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 103 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, (int) (short) 0, zipEncoding18);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 10, (int) (byte) -1, zipEncoding18);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zipEncoding18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
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
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 100, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 21L + "'", long56 == 21L);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) -1);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 2, (int) (byte) -1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 10, (int) (short) 0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) -1);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray42, (int) (byte) 0, (int) (byte) -1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray58);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, 1, (int) (byte) -1);
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray58, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, (int) ' ', (-1));
        byte[] byteArray80 = new byte[] { (byte) 10 };
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray80);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) (byte) 0, (int) (byte) -1, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, 0, (int) (short) 0, zipEncoding89);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) 'a', (int) (byte) -1, zipEncoding89);
        int int94 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray42, 2, (int) (byte) 1, zipEncoding89);
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 10, (int) (short) 0, zipEncoding89);
        int int96 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray5, 1, 3, zipEncoding89);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 356L + "'", long25 == 356L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 356L + "'", long30 == 356L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 21L + "'", long50 == 21L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 4 + "'", int96 == 4);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 356L + "'", long10 == 356L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
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
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(228L, byteArray4, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
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
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(186L, byteArray6, 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, 1, (int) (short) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray4, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
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
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray5, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 356L + "'", long77 == 356L);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass15 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) -1);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray26, (int) (byte) 0, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) -1);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray42, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) ' ', (-1));
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 0, (int) (short) 0, zipEncoding73);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) 'a', (int) (byte) -1, zipEncoding73);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray26, 0, (-1), zipEncoding73);
        int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, 1, zipEncoding73);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        boolean boolean82 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray7, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-1));
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray4, (int) (short) 0, (int) (short) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray7, (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
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
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(160L, byteArray4, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 160=240 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 110L + "'", long33 == 110L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 110L + "'", long36 == 110L);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 1);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (int) (byte) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 1, 2);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (short) 0, (int) (byte) 0);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray55);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, 1, (int) (byte) -1);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray55, (int) (byte) 1);
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        boolean boolean72 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        boolean boolean73 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        boolean boolean74 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray70);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 1, (int) (byte) 1, zipEncoding82);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray70, 2, (int) (byte) 1, zipEncoding82);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray55, 2, 0, zipEncoding82);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) '4', (-1), zipEncoding82);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 0, (int) (byte) 0, zipEncoding82);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (-1), zipEncoding82);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, 1);
        long long92 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 320L + "'", long28 == 320L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "dd" + "'", str37, "dd");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 320L + "'", long38 == 320L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 21L + "'", long60 == 21L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 21L + "'", long63 == 21L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\001" + "'", str83, "\001");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\001" + "'", str91, "\001");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 11L + "'", long92 == 11L);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 0, (int) (short) 0, zipEncoding51);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (byte) -1, zipEncoding51);
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        boolean boolean65 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray63);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray63, (int) (short) 0, (int) (byte) 1);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray63, 0, (int) (byte) 100);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (short) 0, (int) (short) -1);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray63, 2, (int) (short) -1, zipEncoding83);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, (int) (short) 0, zipEncoding83);
        long long87 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean89 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int92 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray6, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 256L + "'", long72 == 256L);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 320L + "'", long87 == 320L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray6, 0, 3);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray29, (int) (short) 0, (int) (byte) 1);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray29, 0, (int) (byte) 100);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray29, (int) (short) 1, (int) (short) 0);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding50 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 1, (int) (byte) 1, zipEncoding50);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray47);
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray47, 0);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, 1, (int) (byte) 1, zipEncoding62);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 0, 1, zipEncoding62);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 100, (int) (short) -1, zipEncoding62);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, 1, zipEncoding62);
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, (int) (short) 0);
        boolean boolean71 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 53 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 256L + "'", long42 == 256L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\001" + "'", str51, "\001");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\001" + "'", str63, "\001");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\n" + "'", str64, "\n");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\377" + "'", str66, "\377");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 775L + "'", long72 == 775L);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray19, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray19, 0, (int) (byte) 100);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (int) (byte) 0, zipEncoding40);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 10, (int) (byte) -1, zipEncoding40);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.Class<?> wildcardClass47 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 11L + "'", long45 == 11L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 11L + "'", long46 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) 'a');
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) -1);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray30, (int) (byte) 1);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 1, (int) (byte) 1, zipEncoding57);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, 2, (int) (byte) 1, zipEncoding57);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray30, 2, 0, zipEncoding57);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray7, 0, (int) (short) -1, zipEncoding57);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 4, byteArray7, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 4=4 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 21L + "'", long35 == 21L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 21L + "'", long38 == 21L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\001" + "'", str58, "\001");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
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
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) ' ');
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 3);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 21L + "'", long20 == 21L);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray7, 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 90L + "'", long51 == 90L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 90L + "'", long52 == 90L);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
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
        long long66 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, 0, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 20L + "'", long66 == 20L);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(220L, byteArray6, 5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray4, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 103 out of bounds for length 2");
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
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(303L, byteArray5, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 303=457 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray12 = new byte[] {};
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
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
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 10, 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, (int) (byte) 0, zipEncoding40);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(82L, byteArray6, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 82=122 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 0, (int) (short) 0, zipEncoding16);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 10, (int) (byte) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 4, byteArray4, 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
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
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 0, (int) (byte) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) 'a');
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) (short) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 21L + "'", long21 == 21L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 21L + "'", long22 == 21L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 21L + "'", long26 == 21L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, (-1));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 110L + "'", long33 == 110L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 110L + "'", long35 == 110L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray5, 2, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, 2, (int) (byte) 1, zipEncoding39);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray49);
        int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray49, (int) (short) 0, (int) (byte) 1);
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray49, 0, (int) (byte) 100);
        byte[] byteArray61 = new byte[] { (byte) 10 };
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 1, (int) (byte) 1, zipEncoding70);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (byte) 0, (int) (byte) -1, zipEncoding70);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, (int) ' ', (int) (byte) 0, zipEncoding70);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (short) 0, (int) (short) 1, zipEncoding70);
        int int75 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\nd", byteArray5, (int) (short) 0, (int) (short) 0, zipEncoding70);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 356L + "'", long10 == 356L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 356L + "'", long15 == 356L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 610L + "'", long19 == 610L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 610L + "'", long20 == 610L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\001" + "'", str71, "\001");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "d" + "'", str74, "d");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 610L + "'", long76 == 610L);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 0, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray5, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 3, byteArray6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 3=3 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass23 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
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
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray4, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 2");
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\n" + "'", str55, "\n");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) -1, (int) (short) 0, zipEncoding22);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 0, (int) (byte) -1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 0, (-1), zipEncoding38);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, 0);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray19, 0, 2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 0, (int) (short) 0, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 4, zipEncoding54);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "dd\nd" + "'", str56, "dd\nd");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 256L + "'", long21 == 256L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("h", byteArray4, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 104, (byte) 0 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, 0, 4);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray8, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) -1, (int) (short) 0, zipEncoding22);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 0, (int) (byte) -1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 0, (-1), zipEncoding38);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, 0);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray19);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(21L, byteArray19, 0, 2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) 0, (int) (short) 0, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 4, zipEncoding54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 50, (byte) 53, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "dd\nd" + "'", str56, "dd\nd");
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (short) -1, (int) (short) 0, zipEncoding24);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (-1), zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (byte) 0, (int) (byte) 1, zipEncoding40);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding47 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 0, (int) (byte) 0, zipEncoding47);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(zipEncoding47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 104L + "'", long49 == 104L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 104L + "'", long50 == 104L);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray28);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray28, (int) (short) 0, (int) (byte) 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray28, 0, (int) (byte) 100);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray43);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray43, 2, (int) (byte) 1, zipEncoding55);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000\n", byteArray28, (int) (byte) 0, 0, zipEncoding55);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 0, zipEncoding55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(356L, byteArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 356=544 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 52, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) ' ', (-1));
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (byte) -1, 0);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) ' ', (int) (byte) -1);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (short) -1);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) -1);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray52);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray52, 0, 2);
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
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray52, (int) (byte) 0, (int) (byte) 1, zipEncoding85);
        int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray27, 3, (-1), zipEncoding85);
        int int91 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, (int) (byte) 1, zipEncoding85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(304L, byteArray6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 304=460 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 320L + "'", long35 == 320L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 320L + "'", long36 == 320L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 100, (byte) 49, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray16, 0, (int) (byte) 100);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, (int) (byte) 1, zipEncoding32);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray16, (int) (byte) 0, (int) (byte) 1, zipEncoding32);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), (-1), zipEncoding32);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 3, byteArray4, (int) (short) 1, 2);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 48, (byte) 51 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\001" + "'", str33, "\001");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
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
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("25", byteArray7, 3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-1));
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 3, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(12L, byteArray4, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
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
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(12L, byteArray4, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 12=14 will not fit in octal number buffer of length -1");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
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
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(254L, byteArray6, 2, 3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 51, (byte) 55, (byte) 54 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.Class<?> wildcardClass15 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(104L, byteArray1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 104=150 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) -1, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (byte) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (byte) 1);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (byte) 0, 3);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (byte) -1);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(186L, byteArray9, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
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
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 0, 2);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 4, byteArray5, (int) (byte) 0, 2);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray5, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 52, (byte) 32, (byte) 100 });
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 110L + "'", long36 == 110L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 110L + "'", long37 == 110L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray6, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) 32, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (short) -1, (int) (short) 0, zipEncoding17);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray14);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) 1, zipEncoding33);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) 0, (int) (byte) -1, zipEncoding33);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 0, (-1), zipEncoding33);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 1, 0);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray14, (int) (byte) 0, 2);
        byte[] byteArray46 = new byte[] { (byte) 10 };
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (byte) 0, (int) (byte) -1, zipEncoding55);
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (short) 1, (int) (byte) 0, zipEncoding67);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (-1), (int) (short) -1, zipEncoding67);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) ' ', (-1), zipEncoding67);
        boolean boolean73 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("h", byteArray2, 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\001" + "'", str34, "\001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass13 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, (int) (byte) 1, zipEncoding32);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (byte) 0, (int) (byte) -1, zipEncoding32);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
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
        int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray23, (int) (byte) 0, (int) (byte) 1, zipEncoding61);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) 10, (int) (byte) -1, zipEncoding73);
        int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 0, 2, zipEncoding73);
        boolean boolean77 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long78 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\001" + "'", str33, "\001");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 256L + "'", long78 == 256L);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
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
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, (int) (byte) 1, zipEncoding53);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (-1));
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long69 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 20L + "'", long59 == 20L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 20L + "'", long60 == 20L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) (byte) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd\n", byteArray6, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 104 out of bounds for byte[4]");
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
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray23, 0);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding38);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray35);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray35);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 0, (-1), zipEncoding54);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, 0);
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray35, (int) (byte) 0, 2);
        byte[] byteArray67 = new byte[] { (byte) 10 };
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding76 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, 1, (int) (byte) 1, zipEncoding76);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (byte) 0, (int) (byte) -1, zipEncoding76);
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        long long80 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        byte[] byteArray85 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray85, 1, (int) (byte) 1, zipEncoding88);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (short) 1, (int) (byte) 0, zipEncoding88);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (-1), (int) (short) -1, zipEncoding88);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1), zipEncoding88);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), (int) (short) 0, zipEncoding88);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\001" + "'", str77, "\001");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10L + "'", long79 == 10L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L + "'", long80 == 10L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\001" + "'", str89, "\001");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }
}

