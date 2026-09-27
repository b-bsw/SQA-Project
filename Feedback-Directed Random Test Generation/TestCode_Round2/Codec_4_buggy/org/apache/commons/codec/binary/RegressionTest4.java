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
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray14, false);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false, false);
        byte[] byteArray22 = base64_3.encode(byteArray14);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, true, false, (int) (byte) 100);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray27, false);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, true);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray27);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        java.lang.Class<?> wildcardClass11 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_2T_ZAA" + "'", str9, "_2T_ZAA");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        byte[] byteArray14 = base64_1.encode(byteArray11);
        byte[] byteArray15 = null;
        byte[] byteArray16 = base64_1.encode(byteArray15);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray28);
        base64_19.decode(byteArray28, (int) (short) 10, 0);
        boolean boolean34 = base64_19.hasData();
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false, true);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray45);
        base64_36.decode(byteArray45, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger60 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray59);
        java.lang.String str61 = base64_52.encodeToString(byteArray59);
        int int64 = base64_36.readResults(byteArray59, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray65 = base64_19.decode(byteArray59);
        byte[] byteArray67 = base64_19.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray67);
        java.lang.String str69 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray67);
        base64_1.encode(byteArray67, (int) (byte) 100, (int) (byte) -1);
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "CgABZP9k" + "'", str61, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hg" + "'", str69, "hg");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray16);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "WHpKVVgxcEJRUT09DQo" + "'", str17, "WHpKVVgxcEJRUT09DQo");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0" + "'", str20, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(1, byteArray10);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, true);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        base64_13.setInitialBuffer(byteArray24, (-1), (int) 'a');
        byte[] byteArray29 = base64_13.decode("hi!");
        byte[] byteArray30 = base64_11.decode(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray29);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray35 = base64_33.decode("XzJUX1pBQQ");
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, true);
        java.math.BigInteger bigInteger45 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray44);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, true, true);
        base64_33.setInitialBuffer(byteArray46, (int) (byte) 0, 0);
        byte[] byteArray54 = null;
        base64_33.decode(byteArray54, 1, (int) (short) 0);
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, false, true);
        java.math.BigInteger bigInteger69 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray68);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray68);
        base64_59.decode(byteArray68, (int) (short) 10, 0);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray68);
        byte[] byteArray77 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray74, false, false);
        base64_33.setInitialBuffer(byteArray77, 6, (int) (byte) 100);
        org.apache.commons.codec.binary.Base64 base64_82 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray84 = base64_82.decode("");
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray84);
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray85);
        byte[] byteArray87 = base64_33.encode(byteArray86);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray87);
        byte[] byteArray89 = base64_31.encode(byteArray88);
        byte[] byteArray90 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray88);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray3 = base64_1.decode("XzJUX1pBQQ");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false, (int) ' ');
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, false);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false);
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 86, (byte) 48, (byte) 104, (byte) 119, (byte) 83, (byte) 49, (byte) 90, (byte) 87, (byte) 90, (byte) 51, (byte) 104, (byte) 106, (byte) 82, (byte) 85, (byte) 112, (byte) 83, (byte) 86, (byte) 86, (byte) 81, (byte) 119, (byte) 79, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 86, (byte) 48, (byte) 104, (byte) 119, (byte) 83, (byte) 49, (byte) 90, (byte) 87, (byte) 90, (byte) 51, (byte) 104, (byte) 106, (byte) 82, (byte) 85, (byte) 112, (byte) 83, (byte) 86, (byte) 86, (byte) 81, (byte) 119, (byte) 79, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean4 = base64_3.isUrlSafe();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray16 = base64_3.encode(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray13);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(12, byteArray18, false);
        java.lang.Class<?> wildcardClass21 = byteArray18.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        java.lang.String str12 = base64_3.encodeToString(byteArray10);
        boolean boolean13 = base64_3.hasData();
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        java.lang.String str24 = base64_15.encodeToString(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22);
        int int28 = base64_3.readResults(byteArray22, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray29 = base64_1.encode(byteArray22);
        byte[] byteArray31 = base64_1.decode("XzJUX1pBQQ==\r\n");
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray41);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray42, false);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray42);
        byte[] byteArray48 = base64_1.encode(byteArray47);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true, true);
        java.lang.String str52 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray47);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CgABZP9k" + "'", str12, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CgABZP9k" + "'", str24, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81 });
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(1, byteArray9);
        byte[] byteArray12 = base64_10.decode("hi!");
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(bigInteger13);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (42) than the specified maxium size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str6, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str7, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        java.lang.Class<?> wildcardClass12 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger15);
        byte[] byteArray17 = base64_1.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray28);
        base64_19.setInitialBuffer(byteArray30, (-1), (int) 'a');
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, false, true);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, true, false);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray42);
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        int int50 = base64_19.readResults(byteArray46, (int) 'a', (int) (byte) -1);
        java.lang.String str51 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray46);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46);
        byte[] byteArray53 = base64_1.encode(byteArray46);
        int int54 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "XzJUX1pBQQ==\r\n" + "'", str51, "XzJUX1pBQQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 12 + "'", int54 == 12);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.lang.String str42 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray41);
        byte[] byteArray43 = base64_18.decode(byteArray41);
        base64_1.setInitialBuffer(byteArray41, (int) '#', (int) (short) 100);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        java.lang.String str27 = base64_18.encodeToString(byteArray25);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = base64_1.decode(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.lang.String str42 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray41);
        boolean boolean43 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray41);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray41);
        java.lang.String str45 = base64_32.encodeToString(byteArray41);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, false, true);
        java.math.BigInteger bigInteger55 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray54);
        java.math.BigInteger bigInteger56 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray54);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54, false, false);
        base64_32.setInitialBuffer(byteArray54, 10, (int) (short) 10);
        java.math.BigInteger bigInteger63 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray54);
        int int66 = base64_1.readResults(byteArray54, (int) (byte) 10, 100);
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray72, false, true);
        java.math.BigInteger bigInteger76 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray75);
        java.math.BigInteger bigInteger77 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray75);
        byte[] byteArray78 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger77);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray78);
        base64_1.decode(byteArray78, (int) (short) 100, (int) (short) -1);
        byte[] byteArray84 = base64_1.decode("V0hwS1ZWZ3hjRUpSVVQwOURRbw");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CgABZP9k" + "'", str27, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = base64_1.decode(byteArray24);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, true, false);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray26);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("aGc9PQ0K");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [hg==??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((-1), byteArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [?d?d?]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, true);
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger27);
        boolean boolean30 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        base64_1.setInitialBuffer(byteArray31, 4, 10);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, true, false);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, false);
        base64_1.setInitialBuffer(byteArray41, 2, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger57 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray56);
        java.lang.String str58 = base64_49.encodeToString(byteArray56);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray59);
        byte[] byteArray62 = base64_1.decode(byteArray59);
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray68, false, true);
        java.math.BigInteger bigInteger72 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray71);
        java.math.BigInteger bigInteger73 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray71);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger73);
        byte[] byteArray75 = base64_1.encode(byteArray74);
        java.lang.Class<?> wildcardClass76 = byteArray75.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CgABZP9k" + "'", str58, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        boolean boolean11 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray14, true);
        boolean boolean17 = base64_16.hasData();
        byte[] byteArray18 = null;
        base64_16.decode(byteArray18, 12, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, true, true);
        java.lang.Class<?> wildcardClass20 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_5.setInitialBuffer(byteArray7, (int) (short) 0, (int) (byte) 1);
        byte[] byteArray12 = base64_1.encode(byteArray7);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean3 = base64_2.isUrlSafe();
        boolean boolean4 = base64_2.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        int int7 = base64_6.avail();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray14);
        int int18 = base64_6.readResults(byteArray14, (int) (short) -1, 10);
        base64_2.setInitialBuffer(byteArray14, 0, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(10, byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [???d?d]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(1, byteArray9);
        byte[] byteArray12 = base64_10.decode("Af8KAQ==");
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray16);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64("Af8KAQ");
        java.lang.String str13 = base64_1.encodeToString(byteArray12);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Af8KAQ==" + "'", str13, "Af8KAQ==");
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = null;
        java.lang.String str21 = base64_19.encodeToString(byteArray20);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        base64_19.setInitialBuffer(byteArray30, (int) ' ', (int) (short) 1);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, true, false, (int) (short) 100);
        byte[] byteArray38 = base64_1.encode(byteArray37);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, true, (int) ' ');
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray40);
        byte[] byteArray46 = base64_1.decode(byteArray45);
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 104, (byte) 103 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, true);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        base64_5.decode(byteArray14, (int) (short) 10, 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger27);
        base64_5.setInitialBuffer(byteArray29, (int) ' ', 1);
        boolean boolean33 = base64_5.hasData();
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, true);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38);
        java.lang.String str40 = base64_5.encodeToString(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray39);
        java.lang.String str42 = base64_1.encodeToString(byteArray39);
        byte[] byteArray44 = base64_1.decode("Af8KAQ==\r\n");
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray44);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str40, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str42, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81 });
        org.junit.Assert.assertNotNull(bigInteger46);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        int int2 = base64_1.avail();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        int int13 = base64_1.readResults(byteArray9, (int) (short) -1, 10);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        java.lang.String str23 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray22);
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray22);
        base64_1.setInitialBuffer(byteArray25, (int) (byte) 0, (int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean31 = base64_30.isUrlSafe();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger39);
        java.lang.String str41 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40);
        byte[] byteArray43 = base64_30.encode(byteArray42);
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, false, true);
        java.math.BigInteger bigInteger55 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray54);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray54);
        base64_45.setInitialBuffer(byteArray56, (-1), (int) 'a');
        byte[] byteArray61 = base64_45.decode("hi!");
        byte[] byteArray62 = base64_30.encode(byteArray61);
        base64_1.setInitialBuffer(byteArray62, (int) (short) 100, 0);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger73 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray72);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger73);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger73);
        byte[] byteArray77 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray75, false);
        byte[] byteArray78 = base64_1.encode(byteArray77);
        int int79 = base64_1.avail();
        byte[] byteArray81 = base64_1.decode("THpKVUwxcEJRVDA9");
        byte[] byteArray83 = base64_1.decode("V0hwS1ZWZ3hjRUpSVVQwOURRbz0NCg==\r\n");
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean6 = base64_5.isUrlSafe();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray18 = base64_5.encode(byteArray15);
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray15);
        java.lang.String str20 = base64_1.encodeToString(byteArray15);
        byte[] byteArray22 = base64_1.decode("WkZFOVBRPT0NCg");
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        java.lang.String str11 = base64_2.encodeToString(byteArray9);
        boolean boolean12 = base64_2.hasData();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger20);
        java.lang.String str22 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23);
        base64_2.encode(byteArray23, (int) (byte) 0, (int) ' ');
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray23);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray30);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CgABZP9k" + "'", str11, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        java.lang.String str21 = base64_12.encodeToString(byteArray19);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        java.lang.String str23 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray19);
        java.lang.String str24 = base64_1.encodeToString(byteArray19);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger34 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray33);
        java.lang.String str35 = base64_26.encodeToString(byteArray33);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37);
        byte[] byteArray39 = base64_1.decode(byteArray37);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray44, false);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, true, true);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64((-1), byteArray44);
        boolean boolean51 = base64_50.hasData();
        byte[] byteArray52 = null;
        byte[] byteArray53 = base64_50.decode(byteArray52);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger61);
        java.lang.String str63 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray62);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, true, false);
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray67);
        java.lang.String str69 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray68);
        int int72 = base64_50.readResults(byteArray68, 0, (int) 'a');
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray68);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray68);
        org.apache.commons.codec.binary.Base64 base64_76 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray74, false);
        byte[] byteArray78 = base64_76.decode("Cg==\r\n");
        byte[] byteArray79 = base64_1.encode(byteArray78);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray79, false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CgABZP9k" + "'", str21, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CgABZP9k\r\n" + "'", str23, "CgABZP9k\r\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CgABZP9k" + "'", str24, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CgABZP9k" + "'", str35, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 67, (byte) 103, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 81, (byte) 50, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("CgABZP9k\r\n");
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 78, (byte) 67, (byte) 103 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 78, (byte) 79, (byte) 81, (byte) 50, (byte) 99, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true, false);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (byte) 0, byteArray5);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64((int) (byte) -1);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, false, true);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true, false);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray23);
        byte[] byteArray28 = base64_14.encode(byteArray27);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, true);
        java.math.BigInteger bigInteger38 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        base64_14.encode(byteArray37, (int) (short) 1, 0);
        java.lang.String str43 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray37);
        boolean boolean44 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            base64_12.encode(byteArray37, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Af8KAQ" + "'", str6, "Af8KAQ");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "XzJUX1pBQQ" + "'", str43, "XzJUX1pBQQ");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray3, false);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(6, byteArray3, false);
        boolean boolean10 = base64_9.hasData();
        boolean boolean11 = base64_9.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray4, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(6, byteArray4, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64("V0hwS1ZWZ3hjRUpSVVQwOURRbz0");
        base64_10.setInitialBuffer(byteArray12, (int) '4', 14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [V0hwS1ZWZ3hjRUpSVVQwOURRbz0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        int int17 = base64_1.avail();
        boolean boolean18 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        java.lang.String str29 = base64_20.encodeToString(byteArray27);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray27);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray27);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, false, true);
        java.math.BigInteger bigInteger36 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        base64_1.decode(byteArray35, 10, 76);
        java.lang.String str40 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CgABZP9k" + "'", str29, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115 });
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTJkQlFscFFPV3M" + "'", str40, "UTJkQlFscFFPV3M");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(1, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, true);
        java.math.BigInteger bigInteger22 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        base64_12.setInitialBuffer(byteArray23, (-1), (int) 'a');
        byte[] byteArray28 = base64_12.decode("hi!");
        byte[] byteArray29 = base64_10.decode(byteArray28);
        boolean boolean30 = base64_10.hasData();
        int int31 = base64_10.avail();
        boolean boolean32 = base64_10.hasData();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray42);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray45);
        java.lang.String str47 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray45);
        int int50 = base64_10.readResults(byteArray45, (int) (short) 10, 76);
        int int51 = base64_10.avail();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true, false, (int) '4');
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, true, true);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 77, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray24);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(8, byteArray12, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray3 = base64_1.decode("");
        boolean boolean4 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        java.lang.String str15 = base64_6.encodeToString(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        base64_1.setInitialBuffer(byteArray18, 76, 0);
        boolean boolean22 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean26 = base64_25.hasData();
        byte[] byteArray28 = base64_25.decode("XzJUX1pBQQ");
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger36 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger36);
        java.lang.String str38 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray37);
        boolean boolean39 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray37);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray37);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        base64_25.encode(byteArray41, 100, 10);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger52 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray51);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger52);
        java.lang.String str54 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray53);
        byte[] byteArray56 = base64_25.encode(byteArray53);
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray53);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray53);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray58);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray59);
        base64_1.setInitialBuffer(byteArray59, 11, 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CgABZP9k" + "'", str15, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 77, (byte) 57, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        boolean boolean16 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray12);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray12);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "WHpKVVgxcEJRUT09DQo" + "'", str17, "WHpKVVgxcEJRUT09DQo");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("dQ==\r\n");
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 117 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dQ==\r\n" + "'", str2, "dQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        byte[] byteArray14 = base64_1.encode(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, false, true);
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        base64_16.setInitialBuffer(byteArray27, (-1), (int) 'a');
        byte[] byteArray32 = base64_16.decode("hi!");
        byte[] byteArray33 = base64_1.encode(byteArray32);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(0);
        int int36 = base64_35.avail();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger44 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        int int47 = base64_35.readResults(byteArray43, (int) (short) -1, 10);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray55, false, true);
        java.math.BigInteger bigInteger59 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray58);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray58);
        base64_49.decode(byteArray58, (int) (short) 10, 0);
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger71 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray70);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger71);
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger71);
        base64_49.setInitialBuffer(byteArray73, (int) ' ', 1);
        byte[] byteArray77 = base64_35.encode(byteArray73);
        base64_1.setInitialBuffer(byteArray73, 1, 10);
        java.math.BigInteger bigInteger81 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger81);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray14, false);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray14);
        base64_1.setInitialBuffer(byteArray18, 1, 0);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, true);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true);
        byte[] byteArray33 = base64_1.decode(byteArray32);
        java.math.BigInteger bigInteger34 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray32);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger34);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger34);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        int int17 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray28);
        base64_19.setInitialBuffer(byteArray30, (-1), (int) 'a');
        byte[] byteArray34 = null;
        base64_19.encode(byteArray34, (int) 'a', 0);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, true);
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray46);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray46);
        base64_19.decode(byteArray46, (int) (short) 1, (-1));
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray55 = null;
        java.lang.String str56 = base64_54.encodeToString(byteArray55);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, false, true);
        base64_54.setInitialBuffer(byteArray65, (int) ' ', (int) (short) 1);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, true, false, (int) (short) 100);
        java.lang.String str73 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray72);
        base64_19.decode(byteArray72, (int) (byte) -1, (int) (short) 100);
        base64_1.decode(byteArray72, (int) (byte) 100, 12);
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger88 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray87);
        byte[] byteArray89 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger88);
        org.apache.commons.codec.binary.Base64 base64_90 = new org.apache.commons.codec.binary.Base64(1, byteArray89);
        byte[] byteArray92 = base64_90.decode("hi!");
        java.lang.String str93 = base64_1.encodeToString(byteArray92);
        byte[] byteArray95 = org.apache.commons.codec.binary.Base64.decodeBase64("XzJUX1pBQQ==");
        byte[] byteArray96 = base64_1.encode(byteArray95);
        java.lang.Class<?> wildcardClass97 = byteArray95.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "WHpKVVgxcEJRUT09DQo" + "'", str73, "WHpKVVgxcEJRUT09DQo");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hg==\r\n" + "'", str93, "hg==\r\n");
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, true);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        base64_5.decode(byteArray14, (int) (short) 10, 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger27);
        base64_5.setInitialBuffer(byteArray29, (int) ' ', 1);
        boolean boolean33 = base64_5.hasData();
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, true);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38);
        java.lang.String str40 = base64_5.encodeToString(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray39);
        java.lang.String str42 = base64_1.encodeToString(byteArray39);
        boolean boolean43 = base64_1.isUrlSafe();
        boolean boolean44 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str40, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n" + "'", str42, "VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, false);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        java.math.BigInteger bigInteger16 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger16);
        byte[] byteArray18 = base64_2.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray17);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [LzJUL1pBQT0=??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "WHpKVVgxcEJRUT09\r\n" + "'", str17, "WHpKVVgxcEJRUT09\r\n");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_2.setInitialBuffer(byteArray13, (-1), (int) 'a');
        byte[] byteArray18 = base64_2.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray21 = null;
        java.lang.String str22 = base64_20.encodeToString(byteArray21);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, true);
        base64_20.setInitialBuffer(byteArray31, (int) ' ', (int) (short) 1);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31, true, false, (int) (short) 100);
        byte[] byteArray39 = base64_2.encode(byteArray38);
        base64_0.decode(byteArray38, (int) (byte) 0, (int) (byte) 100);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray38);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38, true);
        java.lang.String str46 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray45);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -122 });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0NCg==\r\n" + "'", str46, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0NCg==\r\n");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, true);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTJkQlFscFFPV3M" + "'", str17, "UTJkQlFscFFPV3M");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ZFE9PQ" + "'", str16, "ZFE9PQ");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(100, byteArray1, false);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(1, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, false, true);
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        base64_16.setInitialBuffer(byteArray27, (-1), (int) 'a');
        byte[] byteArray32 = base64_16.decode("hi!");
        byte[] byteArray33 = base64_14.decode(byteArray32);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        int int44 = base64_14.readResults(byteArray40, (int) (byte) 100, (int) (byte) 1);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, false, true);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray50);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50);
        base64_14.encode(byteArray50, (int) (byte) 0, 100);
        boolean boolean59 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray50);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, false);
        base64_3.decode(byteArray61, (int) '#', (int) (short) -1);
        java.math.BigInteger bigInteger65 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray61);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger65);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(1);
        int int2 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.lang.String str13 = base64_4.encodeToString(byteArray11);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, true, (int) '#');
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true);
        java.lang.String str24 = base64_1.encodeToString(byteArray23);
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CgABZP9k" + "'", str13, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Q2dBQlpQOWsNCg==" + "'", str24, "Q2dBQlpQOWsNCg==");
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        byte[] byteArray0 = null;
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 4);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray3 = base64_1.decode("");
        boolean boolean4 = base64_1.isUrlSafe();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(1, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, true);
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        base64_17.setInitialBuffer(byteArray28, (-1), (int) 'a');
        byte[] byteArray33 = base64_17.decode("hi!");
        byte[] byteArray34 = base64_15.decode(byteArray33);
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, true);
        java.math.BigInteger bigInteger44 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray43);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray45);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray45, true, true);
        byte[] byteArray50 = base64_15.encode(byteArray45);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, true);
        byte[] byteArray53 = base64_1.encode(byteArray52);
        byte[] byteArray55 = base64_1.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray59 = base64_57.decode("hg==\r\n");
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.decodeBase64("V0hwS1ZWZ3hjRUpSVVE=\r\n");
        base64_57.encode(byteArray61, 0, (int) (short) 10);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray61);
        int int68 = base64_1.readResults(byteArray65, 12, (int) 'a');
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray65);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray69);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray70);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray16 = null;
        base64_1.encode(byteArray16, (int) 'a', 0);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        base64_1.decode(byteArray28, (int) (short) 1, (-1));
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false, true);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray45);
        base64_36.setInitialBuffer(byteArray47, (-1), (int) 'a');
        boolean boolean51 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray47);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true, true);
        base64_1.setInitialBuffer(byteArray55, 1, 1);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        java.lang.String str64 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray63);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray63, true, false);
        base64_1.encode(byteArray67, 0, 76);
        boolean boolean71 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray67);
        java.math.BigInteger bigInteger72 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray67);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Af8KAQ" + "'", str64, "Af8KAQ");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(bigInteger72);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray3 = null;
        java.lang.String str4 = base64_2.encodeToString(byteArray3);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        base64_2.setInitialBuffer(byteArray13, (int) ' ', (int) (short) 1);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger24);
        java.lang.String str26 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25);
        int int30 = base64_2.readResults(byteArray25, 1, 100);
        byte[] byteArray32 = base64_2.decode("Af8KAQ");
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray36 = base64_34.decode("XzJUX1pBQQ");
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false, true);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray45);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray47);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true, true);
        base64_34.setInitialBuffer(byteArray47, (int) (byte) 0, 0);
        int int57 = base64_2.readResults(byteArray47, (int) 'a', (int) (byte) 100);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_61 = new org.apache.commons.codec.binary.Base64(12, byteArray47, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [XzJUX1pBQQ==??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        base64_1.setInitialBuffer(byteArray12, (int) ' ', (int) (short) 1);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        int int29 = base64_1.readResults(byteArray24, 1, 100);
        byte[] byteArray31 = base64_1.decode("Af8KAQ");
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false, true);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray37);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray42);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, true, (int) (byte) -1);
        base64_1.setInitialBuffer(byteArray47, (-1), 6);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, false, false, (int) (byte) 10);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray8 = base64_5.decode("XzJUX1pBQQ");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray10 = base64_1.decode(byteArray8);
        int int11 = base64_1.avail();
        int int12 = base64_1.avail();
        byte[] byteArray14 = base64_1.decode("WHpKVVgxcEJRUT09DQo=");
        int int15 = base64_1.avail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("Q2dBQlpQOWs=\r\n");
        boolean boolean3 = base64_0.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0, byteArray15, false);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        int int16 = base64_1.readResults(byteArray11, 0, (int) '4');
        boolean boolean17 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean3 = base64_2.isUrlSafe();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray15 = base64_2.encode(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(10, byteArray14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        byte[] byteArray18 = base64_1.decode("VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnowPQ0K");
        int int19 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        base64_1.setInitialBuffer(byteArray12, (int) ' ', (int) (short) 1);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        int int29 = base64_1.readResults(byteArray24, 1, 100);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray33, false);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, true);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(6, byteArray33, false);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray48);
        byte[] byteArray50 = base64_39.encode(byteArray48);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray48);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray52, 42, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false, 12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        base64_1.setInitialBuffer(byteArray25, (int) ' ', 1);
        boolean boolean29 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false, true);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray40);
        base64_31.decode(byteArray40, (int) (short) 10, 0);
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger53 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray52);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger53);
        base64_31.setInitialBuffer(byteArray55, (int) ' ', 1);
        java.lang.String str59 = base64_1.encodeToString(byteArray55);
        int int60 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_62 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger70 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray69);
        java.lang.String str71 = base64_62.encodeToString(byteArray69);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray69);
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray72);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray73);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray74);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray74, true, false, 22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = base64_1.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "CgABZP9k" + "'", str71, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 77, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 77, (byte) 57, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        byte[] byteArray49 = base64_1.decode("hi!");
        boolean boolean50 = base64_1.isUrlSafe();
        int int51 = base64_1.avail();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger60 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger60);
        java.lang.String str62 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray61);
        boolean boolean63 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray61);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray61);
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray64, true);
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray64);
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray64);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray64);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray64);
        boolean boolean71 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = base64_1.encode((java.lang.Object) boolean71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.lang.String str42 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray41);
        byte[] byteArray43 = base64_18.decode(byteArray41);
        base64_1.setInitialBuffer(byteArray41, (int) '#', (int) (short) 100);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger54 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger54);
        java.lang.String str56 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray55);
        byte[] byteArray57 = base64_1.decode(byteArray55);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger66 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray65);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger66);
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64(1, byteArray67);
        java.math.BigInteger bigInteger69 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray67);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray67);
        byte[] byteArray71 = base64_1.encode(byteArray67);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray67);
        byte[] byteArray76 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray72, true, true, 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray13);
        boolean boolean15 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray13);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray4 = base64_1.decode("XzJUX1pBQQ");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        base64_1.encode(byteArray15, (int) (byte) 100, 100);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0);
        int int21 = base64_20.avail();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        int int32 = base64_20.readResults(byteArray28, (int) (short) -1, 10);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, true);
        java.math.BigInteger bigInteger44 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray43);
        base64_34.decode(byteArray43, (int) (short) 10, 0);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger56 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray55);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger56);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger56);
        base64_34.setInitialBuffer(byteArray58, (int) ' ', 1);
        byte[] byteArray62 = base64_20.encode(byteArray58);
        java.math.BigInteger bigInteger63 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray62);
        base64_1.decode(byteArray62, 1, 76);
        java.lang.String str67 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 117 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean4 = base64_3.hasData();
        byte[] byteArray6 = base64_3.decode("XzJUX1pBQQ");
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray15);
        boolean boolean17 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        base64_3.encode(byteArray19, 100, 10);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger30);
        java.lang.String str32 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31);
        byte[] byteArray34 = base64_3.encode(byteArray31);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray31);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, true);
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        base64_37.setInitialBuffer(byteArray48, (-1), (int) 'a');
        boolean boolean52 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray48);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray48);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray53);
        java.lang.String str55 = base64_35.encodeToString(byteArray53);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64(2, byteArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [WHpKVVgxcEJRUT09DQo=]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=" + "'", str55, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=");
        org.junit.Assert.assertNotNull(byteArray56);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        byte[] byteArray49 = base64_1.decode("hi!");
        boolean boolean50 = base64_1.isUrlSafe();
        boolean boolean51 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        java.lang.String str62 = base64_53.encodeToString(byteArray60);
        java.math.BigInteger bigInteger63 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray60);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray60);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, true, false, (int) '4');
        java.lang.String str70 = base64_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base64 base64_72 = new org.apache.commons.codec.binary.Base64(false);
        int int73 = base64_72.avail();
        boolean boolean74 = base64_72.isUrlSafe();
        byte[] byteArray77 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_79 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray77, false);
        byte[] byteArray82 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray77, true, true);
        java.lang.String str83 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray77);
        byte[] byteArray84 = base64_72.decode(byteArray77);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = base64_1.readResults(byteArray77, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 22 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CgABZP9k" + "'", str62, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UTJkQlFscFFPV3M9DQo=\r\n" + "'", str70, "UTJkQlFscFFPV3M9DQo=\r\n");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 67, (byte) 103, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Cg==\r\n" + "'", str83, "Cg==\r\n");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        byte[] byteArray5 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray5, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true, true);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((-1), byteArray5);
        boolean boolean12 = base64_11.hasData();
        byte[] byteArray13 = null;
        byte[] byteArray14 = base64_11.decode(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger22 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger22);
        java.lang.String str24 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true, false);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray28);
        java.lang.String str30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray29);
        int int33 = base64_11.readResults(byteArray29, 0, (int) 'a');
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray35, false);
        byte[] byteArray38 = null;
        base64_37.setInitialBuffer(byteArray38, 2, 100);
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger50 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray49);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger50);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger50);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52, true, true);
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) '#', byteArray52, false);
        byte[] byteArray58 = base64_37.decode(byteArray52);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64(0, byteArray58, true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 67, (byte) 103, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        boolean boolean48 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger19);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(1, byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, false, true);
        java.math.BigInteger bigInteger33 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray32);
        base64_23.setInitialBuffer(byteArray34, (-1), (int) 'a');
        byte[] byteArray39 = base64_23.decode("hi!");
        byte[] byteArray40 = base64_21.decode(byteArray39);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        int int51 = base64_21.readResults(byteArray47, (int) (byte) 100, (int) (byte) 1);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57, false, true);
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray60);
        byte[] byteArray63 = base64_21.decode(byteArray60);
        base64_1.setInitialBuffer(byteArray63, 0, 0);
        boolean boolean67 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_69 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger77 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray76);
        java.lang.String str78 = base64_69.encodeToString(byteArray76);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray76);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray76);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray80);
        int int84 = base64_1.readResults(byteArray80, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.codec.binary.Base64 base64_86 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean87 = base64_86.hasData();
        byte[] byteArray89 = base64_86.decode("XzJUX1pBQQ");
        byte[] byteArray90 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray89);
        java.math.BigInteger bigInteger91 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray90);
        byte[] byteArray95 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray90, true, true, 76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = base64_1.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "CgABZP9k" + "'", str78, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray10, false);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray10);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, true, false);
        int int32 = base64_1.readResults(byteArray29, 6, (int) '4');
        boolean boolean33 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray29);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, false);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, false);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger15);
        byte[] byteArray17 = base64_1.decode(byteArray16);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray16);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray16);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LzJUL1pBQT0=\r\n" + "'", str18, "LzJUL1pBQT0=\r\n");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "THpKVUwxcEJRVDA9DQo" + "'", str20, "THpKVUwxcEJRVDA9DQo");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 84, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 85, (byte) 119, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(100, byteArray1, false);
        boolean boolean4 = base64_3.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray3, false);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(6, byteArray3, false);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64("V0hwS1ZWZ3hjRUpSVVQwOURRbz0");
        base64_9.setInitialBuffer(byteArray11, (int) '4', 14);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=\r\n" + "'", str16, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=\r\n");
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        java.lang.String str27 = base64_18.encodeToString(byteArray25);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = base64_1.decode(byteArray28);
        byte[] byteArray32 = base64_1.decode("dQ==\r\n");
        boolean boolean33 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CgABZP9k" + "'", str27, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 117 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray12, false);
        int int16 = base64_15.avail();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger25);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64(1, byteArray26);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, true);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray38);
        base64_29.setInitialBuffer(byteArray40, (-1), (int) 'a');
        byte[] byteArray45 = base64_29.decode("hi!");
        byte[] byteArray46 = base64_27.decode(byteArray45);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger54 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray53);
        int int57 = base64_27.readResults(byteArray53, (int) (byte) 100, (int) (byte) 1);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray63, false, true);
        java.math.BigInteger bigInteger67 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray66);
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray66);
        byte[] byteArray69 = base64_27.decode(byteArray66);
        byte[] byteArray70 = base64_15.decode(byteArray66);
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger79 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray78);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger79);
        java.lang.String str81 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray80);
        boolean boolean82 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray80);
        byte[] byteArray83 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray80);
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray80);
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray84);
        org.apache.commons.codec.binary.Base64 base64_87 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray85, true);
        byte[] byteArray89 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray85, true);
        byte[] byteArray92 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray89, false, true);
        java.lang.String str93 = base64_15.encodeToString(byteArray89);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray3, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, true);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((-1), byteArray3);
        boolean boolean10 = base64_9.hasData();
        byte[] byteArray11 = null;
        byte[] byteArray12 = base64_9.decode(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger20);
        java.lang.String str22 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, true, false);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray26);
        java.lang.String str28 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray27);
        int int31 = base64_9.readResults(byteArray27, 0, (int) 'a');
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        java.lang.String str33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray27);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray3 = base64_1.decode("");
        boolean boolean4 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = base64_6.decode("CgABZP9k");
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        int int12 = base64_1.readResults(byteArray8, 10, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean15 = base64_14.isUrlSafe();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray27 = base64_14.encode(byteArray26);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, true);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray38);
        base64_29.setInitialBuffer(byteArray40, (-1), (int) 'a');
        byte[] byteArray45 = base64_29.decode("hi!");
        byte[] byteArray46 = base64_14.encode(byteArray45);
        int int49 = base64_1.readResults(byteArray45, 10, 4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("aGc9PQ0K");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -122 });
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=\r\n");
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(8, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [/2T/ZAA=]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean4 = base64_3.hasData();
        boolean boolean5 = base64_3.hasData();
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean8 = base64_7.hasData();
        byte[] byteArray10 = base64_7.decode("XzJUX1pBQQ");
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        byte[] byteArray12 = base64_3.decode(byteArray10);
        int int13 = base64_3.avail();
        int int14 = base64_3.avail();
        byte[] byteArray16 = base64_3.decode("WHpKVVgxcEJRUT09DQo=");
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        int int19 = base64_18.avail();
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray28);
        java.lang.String str31 = base64_18.encodeToString(byteArray30);
        base64_3.setInitialBuffer(byteArray30, (int) (short) 10, 0);
        java.lang.String str35 = base64_1.encodeToString(byteArray30);
        boolean boolean36 = base64_1.isUrlSafe();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger45 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger45);
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64(1, byteArray46);
        byte[] byteArray49 = base64_47.decode("Af8KAQ==");
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray49);
        java.math.BigInteger bigInteger51 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray49);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger51);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray52);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52, false, false);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray56);
        base64_1.decode(byteArray56, (int) (short) 10, 100);
        byte[] byteArray62 = base64_1.decode("AQoACgEB");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "WHpKVVgxcEJRUT09DQo=" + "'", str31, "WHpKVVgxcEJRUT09DQo=");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "WHpKVVgxcEJRUT09DQo=" + "'", str35, "WHpKVVgxcEJRUT09DQo=");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81 });
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray3 = base64_1.decode("XzJUX1pBQQ");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WHpKVVgxcEJRUT09DQo" + "'", str7, "WHpKVVgxcEJRUT09DQo");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray16 = base64_1.encode(byteArray13);
        byte[] byteArray17 = null;
        base64_1.setInitialBuffer(byteArray17, 22, (int) (byte) 1);
        byte[] byteArray21 = null;
        base64_1.setInitialBuffer(byteArray21, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger8);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray10, true);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, false, true);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true, false);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray23);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray30 = base64_14.decode(byteArray29);
        java.lang.String str31 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray29);
        java.lang.String str32 = base64_12.encodeToString(byteArray29);
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38, false, true);
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray41);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, true, false);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray41);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, true);
        java.lang.String str51 = base64_12.encodeToString(byteArray50);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57, false, true);
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray60);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray62);
        java.lang.String str64 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray63);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray63);
        int int68 = base64_12.readResults(byteArray63, 0, 0);
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger76 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray75);
        byte[] byteArray77 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger76);
        java.lang.String str78 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray77);
        boolean boolean79 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray77);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray77);
        byte[] byteArray82 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray80, true);
        byte[] byteArray83 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray80);
        base64_12.decode(byteArray83, 0, 10);
        java.math.BigInteger bigInteger87 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray83);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger87);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LzJUL1pBQT0=\r\n" + "'", str31, "LzJUL1pBQT0=\r\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LzJUL1pBQT0" + "'", str32, "LzJUL1pBQT0");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "WHpKVVgxcEJRUQ" + "'", str51, "WHpKVVgxcEJRUQ");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0NCg==\r\n" + "'", str64, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0NCg==\r\n");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean4 = base64_3.hasData();
        boolean boolean5 = base64_3.hasData();
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean8 = base64_7.hasData();
        byte[] byteArray10 = base64_7.decode("XzJUX1pBQQ");
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        byte[] byteArray12 = base64_3.decode(byteArray10);
        int int13 = base64_3.avail();
        int int14 = base64_3.avail();
        byte[] byteArray16 = base64_3.decode("WHpKVVgxcEJRUT09DQo=");
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        int int19 = base64_18.avail();
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray28);
        java.lang.String str31 = base64_18.encodeToString(byteArray30);
        base64_3.setInitialBuffer(byteArray30, (int) (short) 10, 0);
        java.lang.String str35 = base64_1.encodeToString(byteArray30);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger43 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger43);
        java.lang.String str45 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, true, false);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray49);
        byte[] byteArray51 = base64_1.encode(byteArray49);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "WHpKVVgxcEJRUT09DQo=" + "'", str31, "WHpKVVgxcEJRUT09DQo=");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "WHpKVVgxcEJRUT09DQo=" + "'", str35, "WHpKVVgxcEJRUT09DQo=");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        int int2 = base64_1.avail();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        int int13 = base64_1.readResults(byteArray9, (int) (short) -1, 10);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        java.lang.String str23 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray22);
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray22);
        base64_1.setInitialBuffer(byteArray25, (int) (byte) 0, (int) (short) 1);
        boolean boolean29 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        java.lang.String str5 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray1);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "WHpKVVgxcEJRUT09DQo=\r\n" + "'", str5, "WHpKVVgxcEJRUT09DQo=\r\n");
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray16);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, true);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray16);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LzJUL1pBQT0" + "'", str17, "LzJUL1pBQT0");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LzJUL1pBQT0=\r\n" + "'", str20, "LzJUL1pBQT0=\r\n");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64("Af8KAQ");
        java.lang.String str13 = base64_1.encodeToString(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, true);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, true, false);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray24);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        byte[] byteArray31 = base64_15.decode(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray30);
        base64_1.encode(byteArray30, (int) (byte) 1, (int) (short) 0);
        byte[] byteArray37 = base64_1.decode("hg");
        boolean boolean38 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray37);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Af8KAQ==" + "'", str13, "Af8KAQ==");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger15);
        byte[] byteArray17 = base64_1.decode(byteArray16);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray16);
        boolean boolean19 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray16);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LzJUL1pBQT0" + "'", str18, "LzJUL1pBQT0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, true, (int) (byte) -1);
        java.math.BigInteger bigInteger17 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((-1), byteArray16);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray16 = null;
        base64_1.encode(byteArray16, (int) 'a', 0);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        base64_1.decode(byteArray28, (int) (short) 1, (-1));
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray37 = null;
        java.lang.String str38 = base64_36.encodeToString(byteArray37);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, false, true);
        base64_36.setInitialBuffer(byteArray47, (int) ' ', (int) (short) 1);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true, false, (int) (short) 100);
        java.lang.String str55 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray54);
        base64_1.decode(byteArray54, (int) (byte) -1, (int) (short) 100);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray54);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray60);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "WHpKVVgxcEJRUT09DQo" + "'", str55, "WHpKVVgxcEJRUT09DQo");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray61);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_2.setInitialBuffer(byteArray13, (-1), (int) 'a');
        byte[] byteArray18 = base64_2.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(22, byteArray18, false);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, true, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 104, (byte) 103 });
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean3 = base64_2.isUrlSafe();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray15 = base64_2.encode(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray12);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 2);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray16 = null;
        base64_1.encode(byteArray16, (int) 'a', 0);
        int int20 = base64_1.avail();
        boolean boolean21 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        base64_1.setInitialBuffer(byteArray12, (int) ' ', (int) (short) 1);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true, false, (int) (short) 100);
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger20);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger20);
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false, (int) (short) 100);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, true);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray17);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/2T/ZAA=\r\n" + "'", str10, "/2T/ZAA=\r\n");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 84, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 85, (byte) 119, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        base64_1.setInitialBuffer(byteArray25, (int) ' ', 1);
        boolean boolean29 = base64_1.hasData();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger37 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger37);
        java.lang.String str39 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray40);
        int int44 = base64_1.readResults(byteArray41, (int) ' ', (int) (short) 1);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, false, true);
        java.math.BigInteger bigInteger54 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray53);
        java.math.BigInteger bigInteger55 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray53);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray53, false, false);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58);
        java.lang.String str60 = base64_1.encodeToString(byteArray59);
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray59);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger61);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOQ==\r\n" + "'", str60, "V0hwS1ZWZ3hjRUpSVVQwOQ==\r\n");
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57 });
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean4 = base64_3.isUrlSafe();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray16 = base64_3.encode(byteArray13);
        byte[] byteArray17 = null;
        byte[] byteArray18 = base64_3.encode(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        base64_21.decode(byteArray30, (int) (short) 10, 0);
        boolean boolean36 = base64_21.hasData();
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, false, true);
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray47);
        base64_38.decode(byteArray47, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger62 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray61);
        java.lang.String str63 = base64_54.encodeToString(byteArray61);
        int int66 = base64_38.readResults(byteArray61, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray67 = base64_21.decode(byteArray61);
        byte[] byteArray69 = base64_21.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_70 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray69);
        java.lang.String str71 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray69);
        base64_3.encode(byteArray69, (int) (byte) 100, (int) (byte) -1);
        org.apache.commons.codec.binary.Base64 base64_75 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray69);
        byte[] byteArray77 = base64_75.decode("hg");
        org.apache.commons.codec.binary.Base64 base64_79 = new org.apache.commons.codec.binary.Base64(2, byteArray77, false);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray77);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "CgABZP9k" + "'", str63, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hg" + "'", str71, "hg");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -122 });
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        base64_1.setInitialBuffer(byteArray12, (int) ' ', (int) (short) 1);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64("XzJUX1pBQQ");
        java.lang.String str18 = base64_1.encodeToString(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray17);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray19);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "XzJUX1pBQQ==" + "'", str18, "XzJUX1pBQQ==");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 117 });
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        base64_1.setInitialBuffer(byteArray12, (int) ' ', (int) (short) 1);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64("XzJUX1pBQQ");
        java.lang.String str18 = base64_1.encodeToString(byteArray17);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, true);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "XzJUX1pBQQ==" + "'", str18, "XzJUX1pBQQ==");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("Af8KAQ==");
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(76, byteArray2, false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean4 = base64_3.isUrlSafe();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        base64_3.decode(byteArray15, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        java.lang.String str29 = base64_20.encodeToString(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray32 = base64_3.decode(byteArray30);
        byte[] byteArray33 = base64_1.encode(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CgABZP9k" + "'", str29, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, true, false);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray28);
        java.math.BigInteger bigInteger33 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger33);
        byte[] byteArray35 = base64_19.decode(byteArray34);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray34);
        byte[] byteArray37 = base64_1.encode(byteArray36);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, true);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, true, false);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray46);
        java.math.BigInteger bigInteger51 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52);
        base64_1.encode(byteArray53, (int) ' ', 100);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, false, true);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray61);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray61);
        java.lang.String str64 = base64_1.encodeToString(byteArray61);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray61);
        boolean boolean66 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray65);
        java.math.BigInteger bigInteger67 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray65);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbw==" + "'", str64, "V0hwS1ZWZ3hjRUpSVVQwOURRbw==");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(bigInteger67);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean3 = base64_2.isUrlSafe();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray15 = base64_2.encode(byteArray12);
        byte[] byteArray16 = null;
        byte[] byteArray17 = base64_2.encode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        base64_20.decode(byteArray29, (int) (short) 10, 0);
        boolean boolean35 = base64_20.hasData();
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, true);
        java.math.BigInteger bigInteger47 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        base64_37.decode(byteArray46, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        java.lang.String str62 = base64_53.encodeToString(byteArray60);
        int int65 = base64_37.readResults(byteArray60, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray66 = base64_20.decode(byteArray60);
        byte[] byteArray68 = base64_20.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_69 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray68);
        java.lang.String str70 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray68);
        base64_2.encode(byteArray68, (int) (byte) 100, (int) (byte) -1);
        org.apache.commons.codec.binary.Base64 base64_74 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray68);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray68);
        boolean boolean76 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CgABZP9k" + "'", str62, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hg" + "'", str70, "hg");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.isUrlSafe();
        boolean boolean3 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0);
        int int6 = base64_5.avail();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        int int17 = base64_5.readResults(byteArray13, (int) (short) -1, 10);
        base64_1.setInitialBuffer(byteArray13, 0, 14);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger29);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(1, byteArray30);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, false, true);
        java.math.BigInteger bigInteger43 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray42);
        base64_33.setInitialBuffer(byteArray44, (-1), (int) 'a');
        byte[] byteArray49 = base64_33.decode("hi!");
        byte[] byteArray50 = base64_31.decode(byteArray49);
        byte[] byteArray51 = base64_1.encode(byteArray50);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray6);
        boolean boolean11 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AQoACgEB" + "'", str9, "AQoACgEB");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.lang.String str42 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray41);
        byte[] byteArray43 = base64_18.decode(byteArray41);
        base64_1.setInitialBuffer(byteArray41, (int) '#', (int) (short) 100);
        byte[] byteArray48 = base64_1.decode("XzJUX1pBQQ==");
        boolean boolean49 = base64_1.hasData();
        int int50 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, false, true);
        java.math.BigInteger bigInteger62 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray61);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray61);
        base64_52.decode(byteArray61, (int) (short) 10, 0);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray61, false, false, 100);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray70);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray70);
        int int75 = base64_1.readResults(byteArray70, (int) (byte) 1, 0);
        boolean boolean76 = base64_1.hasData();
        byte[] byteArray82 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray82, false, true);
        java.math.BigInteger bigInteger86 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray82);
        byte[] byteArray87 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger86);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger86);
        byte[] byteArray89 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger86);
        byte[] byteArray93 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray89, false, false, (int) ' ');
        int int96 = base64_1.readResults(byteArray89, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        java.lang.String str27 = base64_18.encodeToString(byteArray25);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = base64_1.decode(byteArray28);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray28);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CgABZP9k" + "'", str27, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        byte[] byteArray14 = base64_1.encode(byteArray11);
        byte[] byteArray15 = null;
        byte[] byteArray16 = base64_1.encode(byteArray15);
        byte[] byteArray18 = base64_1.decode("");
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, true, false);
        int int36 = base64_1.readResults(byteArray33, (int) (byte) 10, (int) (short) -1);
        int int37 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray41 = base64_39.decode("");
        boolean boolean42 = base64_39.hasData();
        org.apache.commons.codec.binary.Base64 base64_44 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray46 = base64_44.decode("");
        base64_39.decode(byteArray46, 76, (int) (byte) 0);
        byte[] byteArray51 = base64_39.decode("Q2dBQlpQOWsNCg==");
        java.lang.String str52 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray51);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray51);
        base64_1.decode(byteArray51, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Q2dBQlpQOWsNCg" + "'", str52, "Q2dBQlpQOWsNCg");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_2.decode(byteArray11, (int) (short) 10, 0);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [XzJUX1pBQQ==??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_2.decode(byteArray11, (int) (short) 10, 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger24);
        base64_2.setInitialBuffer(byteArray26, (int) ' ', 1);
        boolean boolean30 = base64_2.hasData();
        int int31 = base64_2.avail();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger39);
        java.lang.String str41 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray42);
        byte[] byteArray44 = base64_2.decode(byteArray43);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray43);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray45);
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = base64_46.decode(obj47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray4 = base64_1.decode("XzJUX1pBQQ");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray10);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, true, true);
        java.lang.String str36 = base64_16.encodeToString(byteArray35);
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, false, true);
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray47);
        base64_38.setInitialBuffer(byteArray49, (-1), (int) 'a');
        boolean boolean53 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray49);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray49);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray54);
        java.lang.Object obj56 = base64_16.encode((java.lang.Object) byteArray55);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray64, false, true);
        java.math.BigInteger bigInteger68 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray67);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray67);
        base64_58.setInitialBuffer(byteArray69, (-1), (int) 'a');
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger80 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray79);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger80);
        java.lang.String str82 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray81);
        byte[] byteArray83 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray81);
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray81, true, false);
        int int89 = base64_58.readResults(byteArray86, 6, (int) '4');
        boolean boolean90 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray86);
        java.lang.String str91 = base64_16.encodeToString(byteArray86);
        byte[] byteArray93 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray86, true);
        org.apache.commons.codec.binary.Base64 base64_94 = new org.apache.commons.codec.binary.Base64(2, byteArray93);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "WHpKVVgxcEJRUQ0K" + "'", str36, "WHpKVVgxcEJRUQ0K");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] {});
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        boolean boolean15 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray14);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        java.lang.String str26 = base64_17.encodeToString(byteArray24);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        int int32 = base64_1.readResults(byteArray29, 0, (-1));
        boolean boolean33 = base64_1.isUrlSafe();
        byte[] byteArray35 = base64_1.decode("WHpKVVgxcEJRUT09DQo");
        boolean boolean36 = base64_1.hasData();
        byte[] byteArray38 = base64_1.decode("Q2c");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CgABZP9k" + "'", str26, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 67, (byte) 103 });
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = base64_1.decode(byteArray24);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger36 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        java.lang.String str37 = base64_28.encodeToString(byteArray35);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35);
        java.lang.String str39 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray35);
        byte[] byteArray40 = base64_1.encode(byteArray35);
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger48);
        java.lang.String str50 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray49);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray49);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray51);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, false, true, (int) '#');
        base64_1.encode(byteArray56, (int) (short) 1, 0);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56, true);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray61);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray61);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CgABZP9k" + "'", str37, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CgABZP9k\r\n" + "'", str39, "CgABZP9k\r\n");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        java.lang.Class<?> wildcardClass18 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(1, byteArray10);
        byte[] byteArray13 = base64_11.decode("Af8KAQ==");
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray13, false);
        byte[] byteArray19 = base64_17.decode("UTJkQlFscFFPV3NOQ2c9PQ0K");
        int int20 = base64_17.avail();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, true);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, true, false);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray44);
        java.math.BigInteger bigInteger49 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray44);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger49);
        byte[] byteArray51 = base64_35.decode(byteArray50);
        java.lang.String str52 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray50);
        java.lang.String str53 = base64_33.encodeToString(byteArray50);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray59, false, true);
        java.math.BigInteger bigInteger63 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray62);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray62);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, true, false);
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray62);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, false, true);
        java.lang.String str72 = base64_33.encodeToString(byteArray71);
        boolean boolean73 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray71);
        byte[] byteArray74 = base64_17.decode(byteArray71);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81 });
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 78, (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "LzJUL1pBQT0=\r\n" + "'", str52, "LzJUL1pBQT0=\r\n");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LzJUL1pBQT0" + "'", str53, "LzJUL1pBQT0");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "WHpKVVgxcEJRUQ" + "'", str72, "WHpKVVgxcEJRUQ");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray3 = base64_1.decode("");
        boolean boolean4 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean8 = base64_7.isUrlSafe();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false, true);
        java.math.BigInteger bigInteger18 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        base64_7.decode(byteArray19, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, false, true);
        java.math.BigInteger bigInteger34 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray33);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray33);
        base64_24.decode(byteArray33, (int) (short) 10, 0);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger46);
        java.lang.String str48 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray47);
        byte[] byteArray49 = base64_24.decode(byteArray47);
        base64_7.setInitialBuffer(byteArray47, (int) '#', (int) (short) 100);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger60 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger60);
        java.lang.String str62 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray61);
        byte[] byteArray63 = base64_7.decode(byteArray61);
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger72 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray71);
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger72);
        org.apache.commons.codec.binary.Base64 base64_74 = new org.apache.commons.codec.binary.Base64(1, byteArray73);
        java.math.BigInteger bigInteger75 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray73);
        byte[] byteArray76 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray73);
        byte[] byteArray77 = base64_7.encode(byteArray73);
        byte[] byteArray78 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray73);
        org.apache.commons.codec.binary.Base64 base64_80 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray73, true);
        byte[] byteArray81 = base64_1.encode(byteArray73);
        boolean boolean82 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger57 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray56);
        java.lang.String str58 = base64_49.encodeToString(byteArray56);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray59);
        byte[] byteArray62 = base64_1.decode(byteArray59);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray62);
        boolean boolean64 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray62);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray62);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CgABZP9k" + "'", str58, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(2);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("QWY4S0FRPT0=\r\n");
        byte[] byteArray4 = base64_1.encode(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("V0hwS1ZWZ3hjRUpSVVE=\r\n");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, true, true);
        base64_1.setInitialBuffer(byteArray9, 32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 65, (byte) 102, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 81, (byte) 87, (byte) 89, (byte) 52, (byte) 83, (byte) 48, (byte) 70, (byte) 82, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 86, (byte) 48, (byte) 104, (byte) 119, (byte) 83, (byte) 49, (byte) 90, (byte) 87, (byte) 90, (byte) 51, (byte) 104, (byte) 106, (byte) 82, (byte) 85, (byte) 112, (byte) 83, (byte) 86, (byte) 86, (byte) 69, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray10);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        java.lang.String str14 = base64_1.encodeToString(byteArray10);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, false, true);
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, false);
        base64_1.setInitialBuffer(byteArray23, 10, (int) (short) 10);
        java.lang.String str32 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray23);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray23);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "XzJUX1pBQQ==\r\n" + "'", str32, "XzJUX1pBQQ==\r\n");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        java.lang.String str19 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray18);
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray18);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "WHpKVVgxcEJRUQ0K\r\n" + "'", str19, "WHpKVVgxcEJRUQ0K\r\n");
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        int int18 = base64_1.avail();
        boolean boolean19 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray10, false);
        int int15 = base64_14.avail();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        int int3 = base64_2.avail();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        int int14 = base64_2.readResults(byteArray10, (int) (short) -1, 10);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [u]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 117 });
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(1, byteArray10);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger12);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray14, true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray11, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        java.lang.String str19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray11, true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        boolean boolean11 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(4, byteArray13);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, true);
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray24);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, false);
        java.lang.String str33 = base64_15.encodeToString(byteArray26);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "WHpKVVgxcEJRUT09DQo=" + "'", str33, "WHpKVVgxcEJRUT09DQo=");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 1);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, false, (int) (short) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, true);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray19);
        base64_1.decode(byteArray19, 6, (int) (short) 1);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/2T/ZAA=\r\n" + "'", str12, "/2T/ZAA=\r\n");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "THpKVUwxcEJRVDA9DQo=\r\n" + "'", str20, "THpKVUwxcEJRVDA9DQo=\r\n");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 84, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 85, (byte) 119, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "THpKVUwxcEJRVDA9DQo" + "'", str25, "THpKVUwxcEJRVDA9DQo");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        int int2 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray6 = base64_4.decode("");
        boolean boolean7 = base64_4.hasData();
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) '#');
        byte[] byteArray11 = base64_9.decode("");
        base64_4.decode(byteArray11, 76, (int) (byte) 0);
        byte[] byteArray16 = base64_4.decode("Q2dBQlpQOWsNCg==");
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        java.lang.String str19 = base64_1.encodeToString(byteArray16);
        int int20 = base64_1.avail();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Q2dBQlpQOWsNCg" + "'", str17, "Q2dBQlpQOWsNCg");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Q2dBQlpQOWsNCg==\r\n" + "'", str19, "Q2dBQlpQOWsNCg==\r\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray12, false);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray20 = base64_1.encode(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, true);
        java.math.BigInteger bigInteger32 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray31);
        base64_22.setInitialBuffer(byteArray33, (-1), (int) 'a');
        byte[] byteArray38 = base64_22.decode("hi!");
        byte[] byteArray39 = base64_1.encode(byteArray38);
        byte[] byteArray41 = base64_1.decode("WHpKVVgxcEJRUT09DQo");
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean3 = base64_2.hasData();
        byte[] byteArray5 = base64_2.decode("XzJUX1pBQQ");
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray14);
        boolean boolean16 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray14);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        base64_2.encode(byteArray18, 100, 10);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger29);
        java.lang.String str31 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray33 = base64_2.encode(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray30);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false, true);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray45);
        base64_36.setInitialBuffer(byteArray47, (-1), (int) 'a');
        boolean boolean51 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray47);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray52);
        java.lang.String str54 = base64_34.encodeToString(byteArray52);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=" + "'", str54, "V0hwS1ZWZ3hjRUpSVVQwOURRbz0=");
        org.junit.Assert.assertNotNull(byteArray56);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.lang.String str10 = base64_1.encodeToString(byteArray8);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger19);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(1, byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, false, true);
        java.math.BigInteger bigInteger33 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray32);
        base64_23.setInitialBuffer(byteArray34, (-1), (int) 'a');
        byte[] byteArray39 = base64_23.decode("hi!");
        byte[] byteArray40 = base64_21.decode(byteArray39);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        int int51 = base64_21.readResults(byteArray47, (int) (byte) 100, (int) (byte) 1);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57, false, true);
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray60);
        byte[] byteArray63 = base64_21.decode(byteArray60);
        base64_1.setInitialBuffer(byteArray63, 0, 0);
        boolean boolean67 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_69 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger77 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray76);
        java.lang.String str78 = base64_69.encodeToString(byteArray76);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray76);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray76);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray80);
        int int84 = base64_1.readResults(byteArray80, (int) (byte) 10, (int) (byte) 1);
        java.math.BigInteger bigInteger85 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray80);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CgABZP9k" + "'", str10, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "CgABZP9k" + "'", str78, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(bigInteger85);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        byte[] byteArray49 = base64_1.decode("hi!");
        boolean boolean50 = base64_1.isUrlSafe();
        boolean boolean51 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        java.lang.String str62 = base64_53.encodeToString(byteArray60);
        java.math.BigInteger bigInteger63 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray60);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray60);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, true, false, (int) '4');
        java.lang.String str70 = base64_1.encodeToString(byteArray69);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.decodeBase64("THpKVUwxcEJRVDA9\r\n");
        // The following exception was thrown during execution in test generation
        try {
            int int75 = base64_1.readResults(byteArray72, 12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 34 out of bounds for byte[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CgABZP9k" + "'", str62, "CgABZP9k");
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UTJkQlFscFFPV3M9DQo=\r\n" + "'", str70, "UTJkQlFscFFPV3M9DQo=\r\n");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_1.decode(byteArray13, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.lang.String str42 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray41);
        byte[] byteArray43 = base64_18.decode(byteArray41);
        base64_1.setInitialBuffer(byteArray41, (int) '#', (int) (short) 100);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger54 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger54);
        java.lang.String str56 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray55);
        byte[] byteArray57 = base64_1.decode(byteArray55);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray57);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false, true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 87, (byte) 107, (byte) 90, (byte) 70, (byte) 79, (byte) 86, (byte) 66, (byte) 82, (byte) 80, (byte) 84, (byte) 48, (byte) 78, (byte) 67, (byte) 103 });
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        byte[] byteArray2 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger11);
        byte[] byteArray14 = base64_3.encode(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray28, false);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, false);
        byte[] byteArray36 = base64_17.encode(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, false, true);
        java.math.BigInteger bigInteger48 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray47);
        base64_38.setInitialBuffer(byteArray49, (-1), (int) 'a');
        byte[] byteArray54 = base64_38.decode("hi!");
        byte[] byteArray55 = base64_17.encode(byteArray54);
        java.lang.String str56 = base64_15.encodeToString(byteArray55);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean59 = base64_58.isUrlSafe();
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, false, true);
        java.math.BigInteger bigInteger69 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray68);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray68);
        base64_58.decode(byteArray70, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_75 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger83 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray82);
        java.lang.String str84 = base64_75.encodeToString(byteArray82);
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray82);
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray85);
        byte[] byteArray87 = base64_58.decode(byteArray85);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray87);
        java.lang.String str89 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray88);
        byte[] byteArray90 = base64_15.encode(byteArray88);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "aGc9PQ0K" + "'", str56, "aGc9PQ0K");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "CgABZP9k" + "'", str84, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Q2dBQlpQOWsNCg" + "'", str89, "Q2dBQlpQOWsNCg");
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 78, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("CgABZP9k\r\n");
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray1);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true, (int) (short) 100);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CgABZP9k\r\n" + "'", str2, "CgABZP9k\r\n");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = null;
        java.lang.String str21 = base64_19.encodeToString(byteArray20);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        base64_19.setInitialBuffer(byteArray30, (int) ' ', (int) (short) 1);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, true, false, (int) (short) 100);
        byte[] byteArray38 = base64_1.encode(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray38);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(bigInteger41);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray24);
        byte[] byteArray26 = base64_1.decode(byteArray24);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        java.lang.String str30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray28);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        boolean boolean16 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray12);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray17);
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger19);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        int int18 = base64_1.avail();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        byte[] byteArray33 = base64_1.encode(byteArray32);
        byte[] byteArray34 = null;
        byte[] byteArray35 = base64_1.decode(byteArray34);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false, true, (int) ' ');
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray37, 11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 104, (byte) 103 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -122 });
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray1);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        base64_4.setInitialBuffer(byteArray15, (-1), (int) 'a');
        boolean boolean19 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray15);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        base64_2.setInitialBuffer(byteArray20, (-1), (int) (short) -1);
        boolean boolean25 = base64_2.isUrlSafe();
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.decodeBase64("hg==\r\n");
        byte[] byteArray28 = base64_2.decode(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray51 = base64_49.decode("CgABZP9k");
        byte[] byteArray52 = base64_1.decode(byteArray51);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger61 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray60);
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger61);
        org.apache.commons.codec.binary.Base64 base64_63 = new org.apache.commons.codec.binary.Base64(1, byteArray62);
        org.apache.commons.codec.binary.Base64 base64_65 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray71, false, true);
        java.math.BigInteger bigInteger75 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray74);
        byte[] byteArray76 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray74);
        base64_65.setInitialBuffer(byteArray76, (-1), (int) 'a');
        byte[] byteArray81 = base64_65.decode("hi!");
        byte[] byteArray82 = base64_63.decode(byteArray81);
        byte[] byteArray83 = base64_1.decode(byteArray81);
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray81);
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray84);
        boolean boolean86 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray84);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        int int2 = base64_1.avail();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        int int13 = base64_1.readResults(byteArray9, (int) (short) -1, 10);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, true);
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray24);
        base64_15.decode(byteArray24, (int) (short) 10, 0);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger37 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger37);
        base64_15.setInitialBuffer(byteArray39, (int) ' ', 1);
        byte[] byteArray43 = base64_1.encode(byteArray39);
        int int44 = base64_1.avail();
        byte[] byteArray46 = null;
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray46);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger55 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray54);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger55);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger55);
        byte[] byteArray58 = base64_47.encode(byteArray57);
        int int61 = base64_1.readResults(byteArray58, 0, 100);
        byte[] byteArray63 = base64_1.decode("VjBod1MxWldaM2hqUlVwU1ZWUXdPVVJSYnc9PQ==\r\n");
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray63);
        boolean boolean65 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        boolean boolean3 = base64_2.hasData();
        byte[] byteArray5 = base64_2.decode("hg==\r\n");
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray5);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, true);
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray19);
        base64_10.setInitialBuffer(byteArray21, (-1), (int) 'a');
        byte[] byteArray25 = null;
        base64_10.encode(byteArray25, (int) 'a', 0);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, true);
        java.math.BigInteger bigInteger38 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        base64_10.decode(byteArray37, (int) (short) 1, (-1));
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true, true);
        int int49 = base64_8.readResults(byteArray46, 76, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean3 = base64_2.isUrlSafe();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray15 = base64_2.encode(byteArray12);
        java.math.BigInteger bigInteger16 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(10, byteArray12, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        int int2 = base64_1.avail();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        int int13 = base64_1.readResults(byteArray9, (int) (short) -1, 10);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray9);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true, (int) '4');
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CgABZP9k" + "'", str14, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) -1);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        byte[] byteArray15 = base64_1.encode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger25 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        java.lang.String str26 = base64_17.encodeToString(byteArray24);
        byte[] byteArray27 = base64_1.encode(byteArray24);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger36 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger36);
        java.lang.String str38 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true, false);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37);
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64(0, byteArray43, false);
        boolean boolean46 = base64_45.hasData();
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52, false, true);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray52);
        java.math.BigInteger bigInteger57 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray52);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger57);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger57);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray59);
        byte[] byteArray61 = base64_45.encode(byteArray59);
        byte[] byteArray62 = base64_1.decode(byteArray61);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray62);
        java.lang.String str64 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray63);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CgABZP9k" + "'", str26, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 90, (byte) 70, (byte) 69, (byte) 57, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 117 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "dQ==\r\n" + "'", str64, "dQ==\r\n");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.decode(byteArray10, (int) (short) 10, 0);
        boolean boolean16 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_18.decode(byteArray27, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        java.lang.String str43 = base64_34.encodeToString(byteArray41);
        int int46 = base64_18.readResults(byteArray41, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray47 = base64_1.decode(byteArray41);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger57 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray56);
        java.lang.String str58 = base64_49.encodeToString(byteArray56);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray59);
        byte[] byteArray62 = base64_1.decode(byteArray59);
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray68, false, true);
        java.math.BigInteger bigInteger72 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray71);
        java.math.BigInteger bigInteger73 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray71);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger73);
        byte[] byteArray75 = base64_1.encode(byteArray74);
        byte[] byteArray76 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray75);
        byte[] byteArray77 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray75);
        byte[] byteArray78 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray77);
        java.lang.String str79 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray78);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CgABZP9k" + "'", str43, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CgABZP9k" + "'", str58, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 84, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 85, (byte) 119, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "THpKVUwxcEJRVDA9DQo=\r\n" + "'", str79, "THpKVUwxcEJRVDA9DQo=\r\n");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        base64_2.decode(byteArray11, (int) (short) 10, 0);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 100);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.String str22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray21);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [?d?d?]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "XzJUX1pBQQ" + "'", str22, "XzJUX1pBQQ");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray12);
        base64_3.decode(byteArray12, (int) (short) 10, 0);
        boolean boolean18 = base64_3.hasData();
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        base64_20.decode(byteArray29, (int) (short) 10, 0);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger44 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        java.lang.String str45 = base64_36.encodeToString(byteArray43);
        int int48 = base64_20.readResults(byteArray43, (int) (short) 100, (int) (byte) 100);
        byte[] byteArray49 = base64_3.decode(byteArray43);
        byte[] byteArray51 = base64_3.decode("hi!");
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray51);
        java.lang.String str53 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray51);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, true, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64(8, byteArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [hg==??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CgABZP9k" + "'", str45, "CgABZP9k");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 117 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hg" + "'", str53, "hg");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 0);
        boolean boolean17 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray16);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray16);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray4 = base64_1.decode("hg==\r\n");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        base64_1.encode(byteArray16, 8, (int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        base64_21.decode(byteArray30, (int) (short) 10, 0);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, false, false, 100);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray39);
        java.lang.String str41 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40);
        java.lang.String str43 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray40);
        base64_1.decode(byteArray40, (int) '4', (int) 'a');
        boolean boolean47 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "XzJUX1pBQQ" + "'", str41, "XzJUX1pBQQ");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "XzJUX1pBQQ==\r\n" + "'", str43, "XzJUX1pBQQ==\r\n");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray1, false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(22);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("WHpKVVgxcEJRUT09DQo=");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, true);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, true);
        base64_1.setInitialBuffer(byteArray3, 11, 14);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0);
        int int16 = base64_15.avail();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray23);
        int int27 = base64_15.readResults(byteArray23, (int) (short) -1, 10);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger35 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray34);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger35);
        java.lang.String str37 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray36);
        boolean boolean38 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray36);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray36);
        base64_15.setInitialBuffer(byteArray39, (int) (byte) 0, (int) (short) 1);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray39);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, false, false, 1);
        base64_1.setInitialBuffer(byteArray47, 100, 11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 87, (byte) 72, (byte) 112, (byte) 75, (byte) 86, (byte) 86, (byte) 103, (byte) 120, (byte) 99, (byte) 69, (byte) 74, (byte) 82, (byte) 85, (byte) 84, (byte) 48, (byte) 57, (byte) 68, (byte) 81, (byte) 111 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 0);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, true, 14);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false, (int) (byte) 100);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, true, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(100, byteArray1, false);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        java.lang.String str14 = base64_5.encodeToString(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        java.lang.String str18 = base64_3.encodeToString(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean21 = base64_20.isUrlSafe();
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        base64_20.decode(byteArray32, (int) (short) 1, (int) '4');
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true, false);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false);
        java.lang.String str43 = base64_20.encodeToString(byteArray42);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42, false, false);
        base64_3.setInitialBuffer(byteArray46, (int) (byte) 1, (int) (byte) 10);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray55, false, true);
        java.math.BigInteger bigInteger59 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray58);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray58);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, true, false);
        boolean boolean64 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray58);
        base64_3.encode(byteArray58, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CgABZP9k" + "'", str14, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTJkQlFscFFPV3M9\r\n" + "'", str18, "UTJkQlFscFFPV3M9\r\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        java.lang.Class<?> wildcardClass17 = bigInteger13.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 47, (byte) 50, (byte) 84, (byte) 47, (byte) 90, (byte) 65, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(2, byteArray9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [_2T_ZAA]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XzJUX1pBQQ" + "'", str11, "XzJUX1pBQQ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "XzJUX1pBQQ" + "'", str12, "XzJUX1pBQQ");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray1, false);
        boolean boolean4 = base64_3.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        java.lang.String str15 = base64_6.encodeToString(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) '4');
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, false);
        base64_3.setInitialBuffer(byteArray24, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CgABZP9k" + "'", str15, "CgABZP9k");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 66, (byte) 90, (byte) 80, (byte) 57, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 108, (byte) 112, (byte) 81, (byte) 79, (byte) 87, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 115, (byte) 99, (byte) 70, (byte) 70, (byte) 80, (byte) 86, (byte) 51, (byte) 77, (byte) 57, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 86, (byte) 86, (byte) 82, (byte) 75, (byte) 97, (byte) 49, (byte) 70, (byte) 115, (byte) 82, (byte) 110, (byte) 78, (byte) 106, (byte) 82, (byte) 107, (byte) 90, (byte) 81, (byte) 86, (byte) 106, (byte) 78, (byte) 78, (byte) 79, (byte) 81, (byte) 48, (byte) 75 });
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_1.setInitialBuffer(byteArray12, (-1), (int) 'a');
        byte[] byteArray17 = base64_1.decode("hi!");
        int int18 = base64_1.avail();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger29);
        byte[] byteArray33 = base64_1.encode(byteArray32);
        byte[] byteArray34 = null;
        byte[] byteArray35 = base64_1.decode(byteArray34);
        byte[] byteArray37 = base64_1.decode("THpKVUwxcEJRVDA");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 76, (byte) 122, (byte) 74, (byte) 85, (byte) 76, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 84, (byte) 48 });
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_5.setInitialBuffer(byteArray7, (int) (short) 0, (int) (byte) 1);
        byte[] byteArray12 = base64_1.encode(byteArray7);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        byte[] byteArray2 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger11);
        byte[] byteArray14 = base64_3.encode(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, true);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        base64_17.decode(byteArray29, (int) (short) 1, (int) '4');
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, true);
        java.math.BigInteger bigInteger44 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray43);
        base64_34.decode(byteArray43, (int) (short) 10, 0);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger56 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray55);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger56);
        java.lang.String str58 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray57);
        byte[] byteArray59 = base64_34.decode(byteArray57);
        base64_17.setInitialBuffer(byteArray57, (int) '#', (int) (short) 100);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger70 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray69);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger70);
        java.lang.String str72 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray71);
        byte[] byteArray73 = base64_17.decode(byteArray71);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.math.BigInteger bigInteger82 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray81);
        byte[] byteArray83 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger82);
        org.apache.commons.codec.binary.Base64 base64_84 = new org.apache.commons.codec.binary.Base64(1, byteArray83);
        java.math.BigInteger bigInteger85 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray83);
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray83);
        byte[] byteArray87 = base64_17.encode(byteArray83);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray83);
        byte[] byteArray90 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray88, true);
        java.math.BigInteger bigInteger91 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray88);
        // The following exception was thrown during execution in test generation
        try {
            base64_15.encode(byteArray88, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 95, (byte) 50, (byte) 84, (byte) 95, (byte) 90, (byte) 65, (byte) 65 });
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 88, (byte) 122, (byte) 74, (byte) 85, (byte) 88, (byte) 49, (byte) 112, (byte) 66, (byte) 81, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger91);
    }
}

