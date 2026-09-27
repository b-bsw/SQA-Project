package org.apache.commons.codec.binary;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1 };
        long long9 = base32_5.getEncodedLength(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str17 = base32_5.encodeToString(byteArray16);
        byte[] byteArray18 = base32_2.decode(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32((byte) 0);
        boolean boolean22 = base32_20.isInAlphabet("\ufffd\ufffd\ufffd\ufffdd\n\001");
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray32, false);
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32(0, byteArray32);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_42 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray40, false);
        java.lang.String str43 = base32_35.encodeToString(byteArray40);
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32((int) (byte) 0, byteArray40, false, (byte) 1);
        byte[] byteArray48 = new byte[] {};
        org.apache.commons.codec.binary.Base32 base32_51 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray48, false, (byte) 1);
        java.lang.String str52 = base32_46.encodeToString(byteArray48);
        org.apache.commons.codec.binary.Base32 base32_55 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) -1 };
        long long59 = base32_55.getEncodedLength(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray64, false);
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean74 = base32_66.isInAlphabet(byteArray72, false);
        long long75 = base32_55.getEncodedLength(byteArray72);
        java.lang.String str76 = base32_46.encodeToString(byteArray72);
        boolean boolean78 = base32_25.isInAlphabet(byteArray72, true);
        boolean boolean80 = base32_25.isInAlphabet("IFAUCV2JHU6T2ddd");
        byte[] byteArray86 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base32 base32_89 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray86, false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_91 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray86, true);
        byte[] byteArray93 = base32_91.decode("IFAUCV2JHU6T2===");
        long long94 = base32_25.getEncodedLength(byteArray93);
        java.lang.String str95 = base32_20.encodeAsString(byteArray93);
        byte[] byteArray96 = base32_2.encode(byteArray93);
        boolean boolean98 = base32_2.isInAlphabet((byte) 10);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
// flaky "1) test2001(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AAAWI===" + "'", str43, "AAAWI===");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 8L + "'", long59 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 8L + "'", long75 == 8L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "75SP6ZAA" + "'", str76, "75SP6ZAA");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -109, (byte) -43, (byte) -26, (byte) 124, (byte) 83, (byte) -113, (byte) -115, (byte) -47 });
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 16L + "'", long94 == 16L);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "SPK6M7CTR6G5C\000\000\000" + "'", str95, "SPK6M7CTR6G5C\000\000\000");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 83, (byte) 80, (byte) 75, (byte) 54, (byte) 77, (byte) 55, (byte) 67, (byte) 84, (byte) 82, (byte) 54, (byte) 71, (byte) 53, (byte) 67, (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray6, false);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(0, byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray14, false);
        java.lang.String str17 = base32_9.encodeToString(byteArray14);
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray14, false);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        boolean boolean27 = base32_25.isInAlphabet((byte) 10);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_37 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_44 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray42, false);
        long long45 = base32_37.getEncodedLength(byteArray42);
        org.apache.commons.codec.binary.Base32 base32_47 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray52, false);
        long long55 = base32_47.getEncodedLength(byteArray52);
        byte[] byteArray56 = base32_37.encode(byteArray52);
        java.lang.String str57 = base32_35.encodeToString(byteArray56);
        java.lang.String str58 = base32_25.encodeAsString(byteArray56);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray64, false);
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32(0, byteArray64);
        byte[] byteArray68 = base32_25.decode(byteArray64);
        byte[] byteArray69 = base32_22.encode(byteArray64);
        boolean boolean71 = base32_19.isInAlphabet(byteArray69, true);
        boolean boolean73 = base32_19.isInAlphabet("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        boolean boolean75 = base32_19.isInAlphabet((byte) 0);
        boolean boolean77 = base32_19.isInAlphabet((byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AAAWI===" + "'", str17, "AAAWI===");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 8L + "'", long45 == 8L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 8L + "'", long55 == 8L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 87, (byte) 73, (byte) 61, (byte) 61, (byte) 61 });
// flaky "2) test2002(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\ufffd\ufffd\ufffdd\n\001" + "'", str57, "\ufffd\ufffd\ufffdd\n\001");
// flaky "1) test2002(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str58, "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 87, (byte) 73, (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1 };
        long long10 = base32_6.getEncodedLength(byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str18 = base32_6.encodeToString(byteArray17);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray17, true);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray17, false);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32((int) (short) -1, byteArray17);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32((int) (byte) 0, byteArray17);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 8L + "'", long10 == 8L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
// flaky "3) test2003(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str18, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray8, false);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(0, byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray16, false);
        java.lang.String str19 = base32_11.encodeToString(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray16, true, (byte) 1);
        byte[] byteArray24 = base32_22.decode("000M8\001\001\001");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32((int) (short) 1, byteArray24, false);
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32(76, byteArray24, true);
        boolean boolean30 = base32_28.isInAlphabet((byte) 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AAAWI===" + "'", str19, "AAAWI===");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray6, false);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean16 = base32_8.isInAlphabet(byteArray14, false);
        long long17 = base32_1.getEncodedLength(byteArray14);
        boolean boolean19 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray21 = base32_1.decode("");
        boolean boolean23 = base32_1.isInAlphabet("\ufffd\ufffdd\000");
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32((byte) 100);
        boolean boolean27 = base32_25.isInAlphabet("AAAWI===");
        boolean boolean29 = base32_25.isInAlphabet("75SP6ZAA");
        byte[] byteArray31 = base32_25.decode("hi!");
        boolean boolean33 = base32_25.isInAlphabet("000VU2G1VS======\000\001d");
        byte[] byteArray35 = base32_25.decode("MQFAC===\000\001d");
        boolean boolean37 = base32_1.isInAlphabet(byteArray35, false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 8L + "'", long17 == 8L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray6, false);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(0, byteArray6);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray16, false);
        long long19 = base32_11.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray26, false);
        long long29 = base32_21.getEncodedLength(byteArray26);
        byte[] byteArray30 = base32_11.encode(byteArray26);
        long long31 = base32_9.getEncodedLength(byteArray26);
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray26, false);
        byte[] byteArray37 = new byte[] {};
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray37, false, (byte) 1);
        org.apache.commons.codec.binary.Base32 base32_41 = new org.apache.commons.codec.binary.Base32(100, byteArray37);
        byte[] byteArray43 = base32_41.decode("75SP6ZAA");
        byte[] byteArray45 = base32_41.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32((int) (short) 1, byteArray45);
        byte[] byteArray47 = null;
        byte[] byteArray48 = base32_46.decode(byteArray47);
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) -1 };
        long long57 = base32_53.getEncodedLength(byteArray56);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str65 = base32_53.encodeToString(byteArray64);
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true);
        org.apache.commons.codec.binary.Base32 base32_69 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray64, false);
        byte[] byteArray70 = base32_46.encode(byteArray64);
        byte[] byteArray71 = base32_33.encode(byteArray70);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 8L + "'", long29 == 8L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 87, (byte) 73, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 8L + "'", long31 == 8L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
// flaky "4) test2006(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str65, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 55, (byte) 54, (byte) 67, (byte) 81, (byte) 66, (byte) 55, (byte) 52, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray71);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1 };
        long long9 = base32_5.getEncodedLength(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str17 = base32_5.encodeToString(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true);
        byte[] byteArray21 = base32_19.decode("JFDECVKDKYZEUSCVGZKDEAIBAE======");
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32(0, byteArray21, true, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
// flaky "5) test2007(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -101, (byte) -38, (byte) -26, (byte) 126, (byte) -115, (byte) -93, (byte) -67, (byte) -58, (byte) 126, (byte) 20, (byte) 107, (byte) -107, (byte) 37, (byte) -87 });
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray6, true);
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32((int) '4', byteArray6);
        java.lang.Class<?> wildcardClass13 = base32_12.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray3 = base32_1.decode("VTIFUP00");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        boolean boolean9 = base32_7.isInAlphabet((byte) 10);
        boolean boolean11 = base32_7.isInAlphabet("");
        boolean boolean13 = base32_7.isInAlphabet((byte) 1);
        byte[] byteArray15 = new byte[] {};
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray15, false, (byte) 1);
        java.lang.String str19 = base32_7.encodeToString(byteArray15);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32((int) '4', byteArray15, true, (byte) 100);
        boolean boolean24 = base32_22.isInAlphabet("CG502===");
        boolean boolean26 = base32_22.isInAlphabet("CG5Q====");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = base32_1.encode((java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -84, (byte) -48, (byte) 90 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        long long8 = base32_4.getEncodedLength(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray13, false);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean23 = base32_15.isInAlphabet(byteArray21, false);
        long long24 = base32_4.getEncodedLength(byteArray21);
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32((int) (short) -1, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray21, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_37 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray35, false);
        long long38 = base32_30.getEncodedLength(byteArray35);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_47 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray45, false);
        long long48 = base32_40.getEncodedLength(byteArray45);
        byte[] byteArray49 = base32_30.encode(byteArray45);
        byte[] byteArray50 = base32_28.encode(byteArray45);
        boolean boolean52 = base32_28.isInAlphabet("CJVG====\000\001\ufffd\n\001\ufffd");
        java.lang.Class<?> wildcardClass53 = base32_28.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8L + "'", long8 == 8L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8L + "'", long24 == 8L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 8L + "'", long48 == 8L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 87, (byte) 73, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 77, (byte) 56, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1 };
        long long15 = base32_11.getEncodedLength(byteArray14);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.String str23 = base32_11.encodeToString(byteArray22);
        byte[] byteArray24 = base32_8.decode(byteArray22);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray24, false);
        java.lang.String str27 = base32_4.encodeToString(byteArray24);
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray24, true, (byte) 100);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray24);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 8L + "'", long15 == 8L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
// flaky "6) test2011(org.apache.commons.codec.binary.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray6, false);
        long long9 = base32_1.getEncodedLength(byteArray6);
        boolean boolean11 = base32_1.isInAlphabet((byte) 1);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray15 = base32_13.decode("VTIFUP00");
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32(0);
        boolean boolean19 = base32_17.isInAlphabet("\ufffd\ufffd\ufffd");
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray26, false);
        long long29 = base32_21.getEncodedLength(byteArray26);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32(0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) '#', byteArray36, false);
        long long39 = base32_31.getEncodedLength(byteArray36);
        byte[] byteArray40 = base32_21.encode(byteArray36);
        long long41 = base32_17.getEncodedLength(byteArray40);
        byte[] byteArray42 = base32_13.decode(byteArray40);
        java.lang.String str43 = base32_1.encodeToString(byteArray40);
        byte[] byteArray45 = base32_1.decode("000M8===\000\001\ufffd\n\001\ufffd");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -84, (byte) -48, (byte) 90 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 8L + "'", long29 == 8L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 8L + "'", long39 == 8L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 87, (byte) 73, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 16L + "'", long41 == 16L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IFAUCV2JHU6T2===" + "'", str43, "IFAUCV2JHU6T2===");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
    }
}
