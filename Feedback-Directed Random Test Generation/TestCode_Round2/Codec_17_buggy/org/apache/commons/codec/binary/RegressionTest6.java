package org.apache.commons.codec.binary;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\ufffd" + "'", str3, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufffd" + "'", str4, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ufffd" + "'", str5, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6869\ufffd" + "'", str7, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6869\ufffd" + "'", str8, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\303\276\303\277ih\303\277\303\275", (java.lang.CharSequence) "\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd??????" + "'", str2, "\ufffd\ufffd??????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\u3f3f\u3f3f\u3f3f" + "'", str3, "\ufeff\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test3005(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
// flaky "1) test3005(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff" + "'", str2, "\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\u6869\ufdff");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "i\000\000\000h\000\000\000?\000\000\000?\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???h???????????: java.io.UnsupportedEncodingException: i???h???????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd?hi!", (java.lang.CharSequence) "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue3bc\ubfef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000?\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\343\274\277\357\277\275" + "'", str2, "\343\274\277\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue3bc\ubfef\ubfbd" + "'", str4, "\ue3bc\ubfef\ubfbd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000", (java.lang.CharSequence) "\ufeff\376\377\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("???????");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????h???????i???????!?: java.io.UnsupportedEncodingException: ??????????????????h???????i???????!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ue3bc\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000?\000?\000?\000?\000?", (java.lang.CharSequence) "\u3f3f??ih??");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test3014(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
// flaky "2) test3014(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\uefbf\ubdef\ubfbd" + "'", str3, "\u6869\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -2, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 105 });
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("??????hi??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u6869\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u6869\u3f3f");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\000?\000h\000i\000!" + "'", str2, "\357\277\275\357\277\275\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\357\277\275\357\277\275\000?\000h\000i\000!" + "'", str3, "\357\277\275\357\277\275\000?\000h\000i\000!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\346\241\251\353\277\257\356\276\275\353\266\277", (java.lang.CharSequence) "\uefbf\ubde6\ua1a9\uefb7\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\376\000\377\000h\000?\000!\000i\000", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????h?i????: java.io.UnsupportedEncodingException: ???????????????h?i????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\376\377ih\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh?!i" + "'", str2, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u683f\u2169" + "'", str3, "\ufffd\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdh?!i" + "'", str4, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\u683f\u2169" + "'", str5, "\ufffd\u683f\u2169");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u6800\u6900\uff00\ufd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str3, "\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff", "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???a????????????: java.io.UnsupportedEncodingException: ???a????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377\000\000i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377" + "'", str2, "\375\377\375\377\000\000i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6900\u6800\uef00\ubf00\ubd00\uef00\ubf00\ubd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str4, "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u3f68\u6921", "\303\277\303\276h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: A??A??h?i?!?: java.io.UnsupportedEncodingException: A??A??h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f3f\u3f3f\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6869\u3f3f\u3f3f\u3f3f", "\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufdff", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????: java.io.UnsupportedEncodingException: ???????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\000?\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\000?\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufdff\ufdff\000\ufdff\000\ufdff\000\u3f00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str3, "\ufffd\ufdff\ufdff\000\ufdff\000\ufdff\000\u3f00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a5\ua8ef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -91, (byte) -26, (byte) -17, (byte) -88, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufa3d\ufffd" + "'", str2, "\ufffd\ufffd\ufa3d\ufffd");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue6a5\ua8ef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\346\245\250\357\277\275" + "'", str2, "\346\245\250\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ue6a5\ua8ef\ubfbd" + "'", str3, "\ue6a5\ua8ef\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ue6a5\ua8ef\ubfbd" + "'", str5, "\ue6a5\ua8ef\ubfbd");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u3f3f\000i\000h\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -69, (byte) -17, (byte) -17, (byte) -65, (byte) -67, (byte) -65, (byte) -65, (byte) -17, (byte) 0, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -3, (byte) -1 });
// flaky "3) test3039(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubbef\uefbf\ubdbf\ubfef\275\ufdff" + "'", str2, "\ubbef\uefbf\ubdbf\ubfef\275\ufdff");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000?\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: h?i?!?: java.io.UnsupportedEncodingException: h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000i\000h\000?\000?\000?\000?\000?\000?" + "'", str2, "??\000i\000h\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000i\000h\000?\000?\000?\000?\000?\000?" + "'", str3, "??\000i\000h\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3fih??????" + "'", str4, "\u3f3fih??????");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3fhi??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\357\273\277\357\277\275\357\277\275\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000" + "'", str3, "\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377ih\375\377" + "'", str2, "\376\377ih\375\377");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("hi\357\277\275\357\277\275");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi??: java.io.UnsupportedEncodingException: ?hi??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
// flaky "4) test3047(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
// flaky "3) test3047(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky "1) test3047(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275" + "'", str2, "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275" + "'", str3, "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\000\377\000\000\000\376\000\000\000\377\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\000?\000?\000?\000?", (java.lang.CharSequence) "\ufeff\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uc3be\uc3bf\uc3bf\uc3bd\uc3bd\uc3bf\uc3bf\uc3bd\uc3bf\uc3bd\u6869\uc3bd\uc3bf", "\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\000i\000h\000\ufffd\000\ufffd\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????i?h?????: java.io.UnsupportedEncodingException: ????????i?h?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\ufffd", "\ubce3\ue3bf\ubfbc\ua1e6\uefa9\ubdbf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????: java.io.UnsupportedEncodingException: ????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "5) test3053(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf", (java.lang.CharSequence) "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000i\377\375\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufeff\343\275\250\346\244\241");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffdhi??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u3f00\u6800\000\u6900\000\u2100\000" + "'", str2, "\u3f00\u3f00\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?\000?\000h\000\000\000i\000\000\000!\000\000\000" + "'", str3, "?\000?\000h\000\000\000i\000\000\000!\000\000\000");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000h\000i\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\ufffd\ufffd\000\000\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\376\377ih\377\375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????h???????i???????!?: java.io.UnsupportedEncodingException: ??????????????????h???????i???????!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000" + "'", str2, "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("?\000?\000h\000?\000!\000i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h?!i" + "'", str2, "??h?!i");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u3f3f\u6968\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd??????ih??" + "'", str2, "\ufffd\ufffd??????ih??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u3f3f\u3f3f\u3f3f\u6869\u3f3f" + "'", str3, "\ufffd\u3f3f\u3f3f\u3f3f\u6869\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufeff\u3f3f\u3f3f\u3f3f\u6968\u3f3f" + "'", str4, "\ufeff\u3f3f\u3f3f\u3f3f\u6968\u3f3f");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275" + "'", str2, "\376\377\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubfef\u68bd\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -65, (byte) -17, (byte) 104, (byte) -67, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\uefbf\ubd68\u6921" + "'", str2, "\ufffd\uefbf\ubd68\u6921");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test3067(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????i?h?????: java.io.UnsupportedEncodingException: ????????????i?h?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000?\000h\000i\000!" + "'", str4, "\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6800\000\u6900\000\u2100\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ua0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd\ufffd\ufffd\ub0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000?\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test3074(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str2, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377h?!i" + "'", str3, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\376\000\377\000h\000?\000!\000i" + "'", str4, "\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\376\000\377\000h\000?\000!\000i" + "'", str5, "\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377h?!i" + "'", str6, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str7, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\000\000h\000\000\000i\000\000\000!" + "'", str2, "\376\377\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufdff\ufdff\000\u6800\000\u6900\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) -26, (byte) -92, (byte) -128, (byte) 0, (byte) -30, (byte) -124, (byte) -128 });
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\346\240\277\342\205\251");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -96, (byte) 0, (byte) -65, (byte) 0, (byte) -30, (byte) 0, (byte) -123, (byte) 0, (byte) -87 });
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000i\000h\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377h?!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?h?!i: java.io.UnsupportedEncodingException: ?y?h?!i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375" + "'", str2, "\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufdffhi\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\ubce3\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u6800\u6900\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128 });
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\uff00\ufd00\u6800\u3f00\u2100\u6900", (java.lang.CharSequence) "\377\375\377\375\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\377\375\377\375hi\375\377");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -3, (byte) 0, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000" + "'", str2, "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000\000\000h\000\000\000i\000\000\000!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????: java.io.UnsupportedEncodingException: ?????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f\u3f3f\u6869\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd??????", (java.lang.CharSequence) "\376\377\246\303\245\302\250\302\256\303\276\302\277\302\253\303\267\302\257\302\253\303\276\302\275\302");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u6800\000\u6900\000\u2100\000", "\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ubfef\uefbd\ubdbfhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????hi!: java.io.UnsupportedEncodingException: ???????hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufdff\ufdff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ua0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd\ufffd\ufffd\ub0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufffd\ufffd\u6869\ufdff" + "'", str2, "\ufffd\ufdff\ufffd\ufffd\u6869\ufdff");
// flaky "8) test3095(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\u6f69\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ih??????: java.io.UnsupportedEncodingException: ih??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377????\377\375", (java.lang.CharSequence) "\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\000h\000i\000!" + "'", str2, "\u3f3f\u3f3f\000h\000i\000!");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u6800\u6900\ufdff\ufdff", (java.lang.CharSequence) "\000?\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("ih\375\377");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) 0, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000i\000h\000\375\000\377" + "'", str2, "\376\377\000i\000h\000\375\000\377");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufdff\ufdff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufffd\ufffd\u6869\ufdff" + "'", str2, "\ufffd\ufdff\ufffd\ufffd\u6869\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufffd\ufdff\ufdff\u6968\ufffd" + "'", str3, "\ufeff\ufffd\ufdff\ufdff\u6968\ufffd");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000h\000\000\000i\000\000\000!\000", "\ufeff\ufffd\ufffd\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????h?i?!: java.io.UnsupportedEncodingException: ????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ue6a1\ua9ee\ubebf\uebb7\uafeb\ubebd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??????\000\000\000?\000\000\000?\000\000\000?" + "'", str2, "??????\000\000\000?\000\000\000?\000\000\000?");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ue3bc\ubfe3\ubcbf\ue3bc\ubfe3\ubcbf\ue3bc\ubfe3\ubcbf\ue3bc\ubfef\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd?hi!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd?hi!");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00" + "'", str2, "\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u6800\000\u6900\000\u2100\000" + "'", str2, "\ufeff\u6800\000\u6900\000\u2100\000");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uafe9\ueeaa\u83aa\u8ae8\uea97\uaa8f\uaaee\ue882\ubb8e\uafeb\ueeab\u82ae\u8ae8\ueabf\uaabf\uaeee\ue883\u9f8a\ubfeb\ueeaa\u82aa\u8ee8\uebaf\uabaf\uaeee\ue882\ub78a");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
// flaky "9) test3117(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\ufffd" + "'", str3, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufffd" + "'", str4, "\u6968\ufffd");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffdh\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3fhi!" + "'", str2, "\u3f3fhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??h\000i\000!\000" + "'", str3, "??h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??h\000i\000!\000" + "'", str4, "??h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "??h\000i\000!\000" + "'", str5, "??h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "??h\000i\000!\000" + "'", str6, "??h\000i\000!\000");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6900\u6800\uef00\ubf00\ubd00\uef00\ubf00\ubd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "i\000h\000?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i?h?????: java.io.UnsupportedEncodingException: i?h?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\357\277\275\357\277\275" + "'", str2, "ih\357\277\275\357\277\275");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd" + "'", str2, "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd" + "'", str3, "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000?\000?\000h\000\000\000i\000\000\000!\000\000" + "'", str2, "\000?\000?\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("ih\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u3f3f" + "'", str2, "\u6968\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\u3f3f" + "'", str3, "\u6968\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\u3f3f" + "'", str4, "\u6968\u3f3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih??" + "'", str5, "ih??");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\000\ufe00\000\uff00\000\u6800\000\u3f00\000\u2100\000\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!: java.io.UnsupportedEncodingException: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\376\377\000\376\000\377\000h\000?\000!\000i" + "'", str2, "\ufffd\376\377\000\376\000\377\000h\000?\000!\000i");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\uff7d\ufffd?\000h\000i\000!\000", (java.lang.CharSequence) "\ufeff\ufffd\u6869\ufdff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\376\377\000\376\000\377\000h\000?\000!\000i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd" + "'", str2, "\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\u683f\u2169" + "'", str3, "\ufeff\u683f\u2169");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test3129(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
// flaky "4) test3129(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u3f3f" + "'", str2, "\u6869\u3f3f");
// flaky "2) test3129(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\u3f3f" + "'", str3, "\u6968\u3f3f");
// flaky "1) test3129(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\u3f3f" + "'", str4, "\u6968\u3f3f");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375", "\ufffd\ufffd\000?\000?\000?\000?\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????: java.io.UnsupportedEncodingException: ??????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\ufffd" + "'", str3, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi\377\375" + "'", str4, "hi\377\375");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6968\ufdff" + "'", str5, "\u6968\ufdff");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ubbef\uefbf\ubdbf\ubfef\275\ufffd", "\376\377\277\357h\275!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??i?h?!i: java.io.UnsupportedEncodingException: ?y??i?h?!i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\376\000\377\000h\000?\000!\000i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) 0, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\303\276\303\277\303\276\000\303\277\000h\000?\000!\000i\000" + "'", str2, "\303\276\303\277\303\276\000\303\277\000h\000?\000!\000i\000");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u3f00" + "'", str2, "\u3f00\u3f00");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\375\377\375\377\000\000i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubdc3\ubfc3\ubdc3\ubfc3\000i\000h\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3" + "'", str2, "\ubdc3\ubfc3\ubdc3\ubfc3\000i\000h\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test3136(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
// flaky "5) test3136(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("????\000i\000h\000?\000?\000?\000?\000?\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000?\000?\000?\000?\000\000\000i\000\000\000h\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?" + "'", str2, "\376\377\000?\000?\000?\000?\000\000\000i\000\000\000h\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\000\377\000\000\000\376\000\000\000\377\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000" + "'", str2, "\ufffd\ufffd\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\000\377\000h\000?\000!\000i\000" + "'", str2, "\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\000\ufffd\000h\000?\000!\000i\000" + "'", str3, "\ufffd\000\ufffd\000h\000?\000!\000i\000");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!", "\ufeff\ufffd\ufdff\ufdff\u6968\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("?????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\303\277\303\276h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: A??A??h?i?!?: java.io.UnsupportedEncodingException: A??A??h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("????????????hi????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????hi????" + "'", str2, "????????????hi????");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff???", "\ufdff\ufdff\ufe00\uff00\u6900\u6800\uff00\ufd00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("?hi??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000h\000i\000?\000?\000" + "'", str2, "?\000h\000i\000?\000?\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f00\u6800\u6900\u3f00\u3f00" + "'", str3, "\u3f00\u6800\u6900\u3f00\u3f00");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "??h\000i\000!\000", (java.lang.CharSequence) "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd", (java.lang.CharSequence) "\375\377\375\377i\000h\000\375\377\375\377");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str2, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u6800\u6900\u2100" + "'", str3, "\ufffd\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str4, "\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi??????");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u6800\u6900\u3f00\u3f00\u3f00\u3f00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????: java.io.UnsupportedEncodingException: ??????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u3f3f\000i\000h\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bc\ubfe3\ubcbfih\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf" + "'", str2, "\ue3bc\ubfe3\ubcbfih\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf\343\ubcbf");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377??i??h\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000h\000\000\000i\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????h???i???!?: java.io.UnsupportedEncodingException: ??????????????????h???i???!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdffhi\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "12) test3159(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\343\274\277\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\343\274\277\357\277\275" + "'", str2, "\343\274\277\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\343\274\277\357\277\275" + "'", str3, "\343\274\277\357\277\275");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue3bc\ubfef\ubfbd" + "'", str4, "\ue3bc\ubfef\ubfbd");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "13) test3162(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "6) test3162(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375" + "'", str2, "\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubbef\uefbf\ubdbf\ubfef\275\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "14) test3163(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -69, (byte) -17, (byte) -17, (byte) -65, (byte) -67, (byte) -65, (byte) -65, (byte) -17, (byte) 0, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6869\ufdff" + "'", str2, "\ufffd\u6869\ufdff");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??????hi??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??????hi??" + "'", str2, "??????hi??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?" + "'", str3, "\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u6800\u6900\u3f00\u3f00" + "'", str4, "\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u6800\u6900\u3f00\u3f00");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6900\u6800\uff00\ufd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000\376\000\377\000h\000?\000!\000i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\376\000\377\000h\000?\000!\000i" + "'", str2, "\376\377\000\376\000\377\000h\000?\000!\000i");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uc3bf\uc3be\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\303\277\303\276h\000i\000!\000" + "'", str2, "\303\277\303\276h\000i\000!\000");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd", (java.lang.CharSequence) "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\000?\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\273\277\346\240\200\346\244\200\342\204\200");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????" + "'", str2, "????????????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str3, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\ufffd" + "'", str2, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\ufffd" + "'", str4, "\u6869\ufffd");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?: java.io.UnsupportedEncodingException: ?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "15) test3175(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky "7) test3175(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str3, "\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i\000h\000\ufffd\000\ufffd\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000" + "'", str2, "i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ubfef\u68bd\u2169", (java.lang.CharSequence) "\ufffd\u3f00\u3f00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a5\ua8ef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ue6a5\ua8ef\ubfbd" + "'", str2, "\ufeff\ue6a5\ua8ef\ubfbd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\346\245\250\357\277\275" + "'", str3, "\376\377\346\245\250\357\277\275");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000h\000i\000!" + "'", str2, "??\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000h\000i\000!" + "'", str3, "??\000h\000i\000!");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000?\000?");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??????????\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????" + "'", str2, "??????????\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) -27, (byte) -88, (byte) -82, (byte) -2, (byte) -65, (byte) -85, (byte) -9, (byte) -81, (byte) -85, (byte) -2, (byte) -67, (byte) 63 });
// flaky "16) test3182(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd" + "'", str3, "\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\u6900\000\u6800\000\u3f3f\000\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\346\245\250\356\276\277\353\267\257\353\276\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\346\000\245\000\250\000\356\000\276\000\277\000\353\000\267\000\257\000\353\000\276\000\275" + "'", str2, "\376\377\000\346\000\245\000\250\000\356\000\276\000\277\000\353\000\267\000\257\000\353\000\276\000\275");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375\375\377\375\377\375\377\375\377i\000h\000\375\377\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ubce3\uefbf\ubdbf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -21, (byte) -77, (byte) -93, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -74, (byte) -65 });
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("ih\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6900\u6800\uff00\ufd00" + "'", str3, "\u6900\u6800\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000i\000h\000\377\000\375" + "'", str4, "\000i\000h\000\377\000\375");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffdhi??");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??hi??: java.io.UnsupportedEncodingException: ??hi??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) 104, (byte) 105, (byte) -65, (byte) -61, (byte) -67, (byte) -61 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubec3\ubfc3\u6869\ubfc3\ubdc3" + "'", str2, "\ubec3\ubfc3\u6869\ubfc3\ubdc3");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000?\000?");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -21, (byte) -65, (byte) -81, (byte) -18, (byte) -66, (byte) -67, (byte) -21, (byte) -74, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf" + "'", str2, "\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6" + "'", str3, "\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\376\377ih\377\375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uff7d\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????hi????: java.io.UnsupportedEncodingException: ???????hi????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "17) test3193(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f", "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????????????????????????????: java.io.UnsupportedEncodingException: ??????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\346\241\251\353\277\257\356\276\275\353\266\277", "\u5a2e\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????: java.io.UnsupportedEncodingException: ?????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ubbef\uefbf\ubdbf\ubfef\275\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ubec3\ubfc3\ubfc3\ubdc3\ubdc3\ubfc3\ubfc3\ubdc3\ubfc3\ubdc3\u6968\ubdc3\ubfc3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????????????????????????????: java.io.UnsupportedEncodingException: ?????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "18) test3197(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63 });
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000h\000i\000!" + "'", str2, "\ufeff\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\000h\000i\000!" + "'", str3, "\ufeff\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str5, "\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377\000\000\000h\000\000\000i\000\000\000!" + "'", str6, "\376\377\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\376\000\377\000h\000?\000!\000i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???y??h???!?i: java.io.UnsupportedEncodingException: ???y??h???!?i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\000\377\000h\000?\000!\000i\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000\ufffd\000\ufffd\000i\000h\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????i?h????: java.io.UnsupportedEncodingException: ???????i?h????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -95, (byte) -87, (byte) -21, (byte) -65, (byte) -81, (byte) -18, (byte) -66, (byte) -67, (byte) -21, (byte) -74, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf" + "'", str3, "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf" + "'", str4, "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\376\377\346\241\251\353\277\257\356\276\275\353\266\277" + "'", str5, "\376\377\346\241\251\353\277\257\356\276\275\353\266\277");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -90, (byte) -62, (byte) -91, (byte) -62, (byte) -88, (byte) -61, (byte) -82, (byte) -62, (byte) -66, (byte) -62, (byte) -65, (byte) -61, (byte) -85, (byte) -62, (byte) -73, (byte) -62, (byte) -81, (byte) -61, (byte) -85, (byte) -62, (byte) -66, (byte) -62, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc3a6\uc2a5\uc2a8\uc3ae\uc2be\uc2bf\uc3ab\uc2b7\uc2af\uc3ab\uc2be\uc2bd" + "'", str2, "\uc3a6\uc2a5\uc2a8\uc3ae\uc2be\uc2bf\uc3ab\uc2b7\uc2af\uc3ab\uc2be\uc2bd");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -65, (byte) -17, (byte) -17, (byte) -67, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf" + "'", str2, "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377h?!i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000\000\000i\000\000\000!\000\000" + "'", str2, "\000h\000\000\000i\000\000\000!\000\000");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u683f\u2169", (java.lang.CharSequence) "\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f??ih??");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6968\uc3af\uc2bf\uc2bd\uc3af\uc2bf\uc2bd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -20, (byte) -114, (byte) -81, (byte) -20, (byte) -118, (byte) -65, (byte) -20, (byte) -118, (byte) -67, (byte) -20, (byte) -114, (byte) -81, (byte) -20, (byte) -118, (byte) -65, (byte) -20, (byte) -118, (byte) -67 });
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\376\377\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000\000", "\357\267\277\357\267\277\000\346\240\200\000\346\244\200\000\342\204\200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???i????????????a???: java.io.UnsupportedEncodingException: i???i????????????a???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str2, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000h\000i\000\377\000\375" + "'", str3, "\376\377\000h\000i\000\377\000\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str4, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi\377\375" + "'", str5, "hi\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str6, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\376\377\000h\000i\000\377\000\375" + "'", str7, "\376\377\000h\000i\000\377\000\375");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffd\000h\000i\000\ufffd\000\ufffd" + "'", str8, "\ufffd\ufffd\000h\000i\000\ufffd\000\ufffd");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff\u3f3f\ufffd", "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\375\377\375\377\000\000i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377", (java.lang.CharSequence) "\uefbb\ubf69\u68c3\ubdc3\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375", "\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufdff\u6968\ufffd", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd??????ih??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f00\u3f00\u6900\u6800\u3f00\u3f00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???????" + "'", str2, "???????");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uff00\ufd00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -65, (byte) -17, (byte) -26, (byte) -67, (byte) -87, (byte) -95, (byte) -73, (byte) -17, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "19) test3229(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("????\000\000\000i\000\000\000h\000\000??\000\000??\000\000??\000\000??\000\000??\000\000??");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffdhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\377\375\000h\000i\000!" + "'", str2, "\376\377\377\375\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffdhi!" + "'", str3, "\ufffdhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffdhi!" + "'", str4, "\ufffdhi!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000i\000\000\000h\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\000\000\000i\000\000\000h\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??h???i???!???: java.io.UnsupportedEncodingException: ??h???i???!???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
// flaky "20) test3235(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
// flaky "8) test3235(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky "3) test3235(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6968\ufdff" + "'", str5, "\u6968\ufdff");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\000\u6900\000\u6800\uff00\ufd00\uff00\ufd00" + "'", str2, "\ufffd\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\000\u6900\000\u6800\uff00\ufd00\uff00\ufd00");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6", "\uefbb\ubf69\u68c3\ubdc3\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "21) test3239(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "9) test3239(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u6968\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u6968\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -21, (byte) -65, (byte) -81, (byte) -18, (byte) -66, (byte) -67, (byte) -21, (byte) -74, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf" + "'", str2, "\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\uff00\ufe00\u6800\000\u6900\000\u2100\000" + "'", str2, "\ufffd\uff00\ufe00\u6800\000\u6900\000\u2100\000");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ubfc3\ubdc3\ubfc3\ubdc3\ubfc3\ubdc3\ubfc3\ubdc3\u6900\u6800\ubfc3\ubdc3\ubfc3\ubdc3");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ue3bc\ubfef\ubfbd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -114, (byte) -68, (byte) -21, (byte) -65, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd?\000h\000i\000!\000", "\ufffd\ufffd\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????h???i???!???: java.io.UnsupportedEncodingException: ????h???i???!???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000" + "'", str2, "\ufffd\000\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufdff\ufffd\ufffdh\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -3, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000i\000h\000\377\000\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????h???i????????: java.io.UnsupportedEncodingException: ?????????h???i????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi\377\375" + "'", str3, "hi\377\375");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100" + "'", str2, "\ufe00\uff00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\uff7d\ufffd?\000h\000i\000!\000", "\ufffd\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????????????: java.io.UnsupportedEncodingException: ???????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\uefbf\ubde6\ua1a9\uefb7\ufffd", (java.lang.CharSequence) "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("?hi\377\375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ue6a1\ua9ee\ubebf\uebb7\uafeb\ubebd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????: java.io.UnsupportedEncodingException: ????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\ufdff" + "'", str3, "\u6968\ufdff");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffdhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f68\u6921" + "'", str2, "\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?hi!" + "'", str3, "?hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u683f\u2169" + "'", str4, "\u683f\u2169");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f68\u6921" + "'", str2, "\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd?hi!" + "'", str3, "\ufffd\ufffd?hi!");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("ih\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\ufffd" + "'", str2, "\u6968\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeffhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?hi!" + "'", str2, "?hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000?\000h\000i\000!" + "'", str3, "\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000?\000h\000i\000!" + "'", str4, "\000?\000h\000i\000!");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\ufffd\ufdff\ufdff\u6968\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -3, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\303\276\303\277ih\303\277\303\275", "??????\000?\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????h?i?!: java.io.UnsupportedEncodingException: ?????????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??????\000\000\000?\000\000\000?\000\000\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ubfef\uefbd\ubdbf\u3f00\u6800\u6900\u2100" + "'", str4, "\ubfef\uefbd\ubdbf\u3f00\u6800\u6900\u2100");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\ue53f\uaea8\ubffe\uf7ab\uabaf\ubdfe\ufffd", "\ubce3\ue3bf\ubfbc\ubce3\ue6bf\ua8a5\ubce3\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????: java.io.UnsupportedEncodingException: ????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\u6869\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\357\277\275\343\274\200\346\240\200\346\244\200\342\204\200");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufeff\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -61, (byte) -81, (byte) 0, (byte) -62, (byte) -65, (byte) 0, (byte) -62, (byte) -67, (byte) 0, (byte) -61, (byte) -81, (byte) 0, (byte) -62, (byte) -65, (byte) 0, (byte) -62, (byte) -67 });
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\u3f3f", (java.lang.CharSequence) "\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uefbb\ubf69\u68c3\ubdc3\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -17, (byte) -69, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -67, (byte) -61, (byte) -1, (byte) -3 });
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ua0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd\ufffd\ufffd\ub0c2\ufffd\ufffd\ufffd\ua083\ufffd\ufffd\ufffd\ub082\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\ue6bd\ua9a1\ub7ef\ufffd" + "'", str2, "\ubfef\ue6bd\ua9a1\ub7ef\ufffd");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test3282(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375" + "'", str2, "\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\000i\000h\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?", (java.lang.CharSequence) "??????\000?\000h\000i\000!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\277\357h\275!i", (java.lang.CharSequence) "?????????????");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100" + "'", str2, "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\ue53f\uaea8\ubffe\uf7ab\uabaf\ubdfe\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -18, (byte) -108, (byte) -65, (byte) -22, (byte) -70, (byte) -88, (byte) -21, (byte) -65, (byte) -66, (byte) -17, (byte) -98, (byte) -85, (byte) -22, (byte) -82, (byte) -81, (byte) -21, (byte) -73, (byte) -66, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff", (java.lang.CharSequence) "\343\274\277");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubec3\ubfc3\ubfc3\ubdc3\ubdc3\ubfc3\ubfc3\ubdc3\ubfc3\ubdc3\u6968\ubdc3\ubfc3");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\376\377ih\377\375", (java.lang.CharSequence) "\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?hi!" + "'", str3, "?hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?hi!" + "'", str4, "?hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00" + "'", str2, "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\343\275\250\346\244\241");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) -29, (byte) -67, (byte) -88, (byte) -26, (byte) -92, (byte) -95 });
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\346\245\250\356\276\277\353\267\257\353\276\275" + "'", str2, "\346\245\250\356\276\277\353\267\257\353\276\275");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375", "\u6968\uc3bf\uc3bd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u6900\u6800\u3f3f\u3f3f", "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u6968\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("????\000i\000h\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375?\000h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uefbb\ubfe6\ua0bf\ue285\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???\000h\000i\000!\000" + "'", str2, "???\000h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f00\u6800\u6900\u2100" + "'", str3, "\u3f3f\u3f00\u6800\u6900\u2100");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\357\277\275\357\277\275\000?\000h\000i\000!", "\303\277\303\276h\000i\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: A??A??h?i?!?: java.io.UnsupportedEncodingException: A??A??h?i?!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd??????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "23) test3301(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "10) test3301(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "4) test3301(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000i\000\000\000h\000\000\000\ufffd\000\000\000\ufffd\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000" + "'", str2, "\ufffd\000\ufffd\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufe00\uff00\000\000\000\u6900\000\000\000\u6800\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00" + "'", str3, "\ufe00\uff00\000\000\000\u6900\000\000\000\u6800\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufdff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\u6968\ufffd" + "'", str2, "\ufdff\u6968\ufffd");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubfc3\ubec3hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -65, (byte) -61, (byte) -66, (byte) -61, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff\ufdff\000\u6800\000\u6900\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) 0, (byte) 0, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\uc3bf\uc3bd\000\uc3bf\uc3bd" + "'", str2, "\000i\000h\000\uc3bf\uc3bd\000\uc3bf\uc3bd");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ua5e6\uefa8\ubdbf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -91, (byte) -26, (byte) -17, (byte) -88, (byte) -67, (byte) -65 });
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a5\ua8ef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -91, (byte) -26, (byte) -17, (byte) -88, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\245\346\357\250\275\277" + "'", str2, "\245\346\357\250\275\277");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufa3d\ufffd" + "'", str3, "\ufffd\ufffd\ufa3d\ufffd");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h???????i???????!??????: java.io.UnsupportedEncodingException: ???h???????i???????!??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000?\000\000\000h\000\000\000i\000\000\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????h???i???!: java.io.UnsupportedEncodingException: ???????????????????h???i???!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000\000\000i\000\000\000h\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???i???h????????: java.io.UnsupportedEncodingException: ???i???h????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) -26, (byte) -92, (byte) -128, (byte) 0, (byte) -30, (byte) -124, (byte) -128, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000" + "'", str2, "\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) -1, (byte) -3 });
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("????\000\000\000i\000\000\000h\000\000??\000\000??\000\000??\000\000??\000\000??\000\000??");
        java.lang.Class<?> wildcardClass2 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????????????????????????????h?i????????????: java.io.UnsupportedEncodingException: ?????????????????????????????????????h?i????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6900\u6800\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\ufffd\ufdff\ufdff\u6968\ufffd", (java.lang.CharSequence) "\ufffd\ufffd\ufa3d\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubde3\ue6a8\ubfa4\ubfef\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -67, (byte) -29, (byte) -26, (byte) -88, (byte) -65, (byte) -92, (byte) -65, (byte) -17, (byte) -1, (byte) -3 });
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd?\000h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\375\377" + "'", str2, "ih\375\377");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\375\377" + "'", str3, "ih\375\377");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufdff" + "'", str4, "\u6968\ufdff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih\375\377" + "'", str5, "ih\375\377");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\277\357h\275!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??i?h?!i: java.io.UnsupportedEncodingException: ?y??i?h?!i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "24) test3329(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "11) test3329(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u3f3f\u3f3f\u3f3f" + "'", str2, "\u6968\u3f3f\u3f3f\u3f3f");
// flaky "5) test3329(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\u3f3f\u3f3f\u3f3f" + "'", str3, "\u6968\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6968\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str3, "\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd" + "'", str5, "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc3be\uc3bf\u6968\uc3bf\uc3bd" + "'", str2, "\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc3be\uc3bf\u6968\uc3bf\uc3bd" + "'", str3, "\uc3be\uc3bf\u6968\uc3bf\uc3bd");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue3bc\ubfef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bc\ubfef\ubfbd" + "'", str2, "\ue3bc\ubfef\ubfbd");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u6968\uefbf\ubdef\ubfbd", "\ufeff\u3f68\u6921");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufdff\ufdff\000\u6800\000\u6900\000\ufdff\000\ufdff");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "?hi??");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi??: java.io.UnsupportedEncodingException: ?hi??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a0\ubfe2\u85a9");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -96, (byte) -26, (byte) -30, (byte) -65, (byte) -87, (byte) -123 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\233\352\352\203\202\227\243\352\352\202\203\273\273\353\353\202\202\277\257\352\353\203\202\237\277\352\352\202\203\257\273\353\353\202\202\267" + "'", str2, "\233\352\352\203\202\227\243\352\352\202\203\273\273\353\353\202\202\277\257\352\353\203\202\237\277\352\352\202\203\257\273\353\353\202\202\267");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7" + "'", str3, "\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000h\000\000\000i\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????h???i???!?: java.io.UnsupportedEncodingException: ??????????h???i???!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeffhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683f\u2169" + "'", str3, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?hi!" + "'", str4, "?hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u3f68\u6921" + "'", str5, "\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u683f\u2169" + "'", str6, "\u683f\u2169");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\346\241\251\353\277\257\356\276\275\353\266\277");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\375\375\377\375\377\375\377\375\377i\000h\000\375\377\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????" + "'", str2, "?????");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufdff\ufffd\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\377\375\375\377\377\375\377\375hi\375\377" + "'", str2, "\376\377\377\375\375\377\377\375\377\375hi\375\377");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufffd\ufdff\ufffd\ufffd\u6869\ufdff" + "'", str3, "\ufeff\ufffd\ufdff\ufffd\ufffd\u6869\ufdff");
// flaky "25) test3345(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375" + "'", str2, "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f68\u693f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd", (java.lang.CharSequence) "\ua5e6\uefa8\ubdbf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) 0, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\357\273\277\346\245\250\357\277\275", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\ufffd\ufdff\ufdff\u6800\000\u6900\000\u2100\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\376\000\377\000h\000?\000!\000i\000" + "'", str2, "\376\377\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str3, "\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000" + "'", str4, "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffdhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a0\u8000\ue6a4\u8000\ue284\u8000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) -26, (byte) -92, (byte) -128, (byte) 0, (byte) -30, (byte) -124, (byte) -128, (byte) 0 });
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -65, (byte) -17, (byte) -17, (byte) -67, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "26) test3357(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ue3bc\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("ih\357\277\275\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih??????" + "'", str2, "ih??????");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275" + "'", str2, "\ufeff\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??????????\000i\000h????");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\377\375?hi!", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????ih??: java.io.UnsupportedEncodingException: ????ih??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275" + "'", str2, "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "27) test3365(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str2, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\000h\000i\000\377\000\375" + "'", str3, "\376\377\000h\000i\000\377\000\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str4, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi\377\375" + "'", str5, "hi\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str6, "\ufffd\u6800\u6900\uff00\ufd00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u6800\u6900\uff00\ufd00" + "'", str7, "\ufffd\u6800\u6900\uff00\ufd00");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("ih\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000i\000h\000\377\000\375" + "'", str3, "\000i\000h\000\377\000\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000i\000h\000\ufffd\000\ufffd" + "'", str4, "\000i\000h\000\ufffd\000\ufffd");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "28) test3368(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "12) test3368(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "6) test3368(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "2) test3368(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6800\u6900\ufdff\ufdff" + "'", str4, "\u6800\u6900\ufdff\ufdff");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????: java.io.UnsupportedEncodingException: i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????i???????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf", "\376\377\377\375\377\375\000\000\000h\000\000\000?\000\000\000!\000\000\000i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?y?y????h???????!???i: java.io.UnsupportedEncodingException: ?y?y?y?y?y????h???????!???i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ubbef\ue6bf\ubfa0\u85e2\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -26, (byte) -96, (byte) -65, (byte) -30, (byte) -123, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("???");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdffhi\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377ih\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bc\ubfe3\ubcbf\ue3bc\ufffd" + "'", str2, "\ue3bc\ubfe3\ubcbf\ue3bc\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ue3bc\ubfe3\ubcbf\ue3bc\ufffd" + "'", str3, "\ue3bc\ubfe3\ubcbf\ue3bc\ufffd");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f69\u683f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????" + "'", str3, "????");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u6968\ufdff", (java.lang.CharSequence) "\ufeffhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ubec3\ubfc3\u6869\ubfc3\ubdc3" + "'", str2, "\ufffd\ubec3\ubfc3\u6869\ubfc3\ubdc3");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6900\u6800\uef00\ubf00\ubd00\uef00\ubf00\ubd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\u683f\u2169");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u6869\u3f3f", (java.lang.CharSequence) "\u6869\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\u6869\ufdff");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -65 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("?????????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\000\u3f00\000\u3f00\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000i\000h\000\375\000\377");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??i?h?y??y?: java.io.UnsupportedEncodingException: ?y??i?h?y??y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str3, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str4, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff???????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\000h\000i\377\375\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6869\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -95, (byte) -87, (byte) -29, (byte) -68, (byte) -65 });
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f68\u693f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeffhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?hi!" + "'", str2, "?hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683f\u2169" + "'", str3, "\u683f\u2169");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uc3a6\uc2a5\uc2a8\uc3ae\uc2be\uc2bf\uc3ab\uc2b7\uc2af\uc3ab\uc2be\uc2bd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -90, (byte) -61, (byte) -91, (byte) -62, (byte) -88, (byte) -62, (byte) -82, (byte) -61, (byte) -66, (byte) -62, (byte) -65, (byte) -62, (byte) -85, (byte) -61, (byte) -73, (byte) -62, (byte) -81, (byte) -62, (byte) -85, (byte) -61, (byte) -66, (byte) -62, (byte) -67, (byte) -62 });
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ubec3\ubfc3\ubfc3\ubdc3\ubdc3\ubfc3\ubfc3\ubdc3\ubfc3\ubdc3\u6968\ubdc3\ubfc3", "\uefbb\ubf69\u68c3\ubdc3\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("??????????????????????????????????????");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeffhi\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u3f69\ufffd" + "'", str2, "\u683f\u3f69\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?hi??" + "'", str3, "?hi??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u683f\u3f69\ufffd" + "'", str4, "\u683f\u3f69\ufffd");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("?????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????" + "'", str2, "?????");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbf\ubdef\ubfbd?hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -17, (byte) -17, (byte) -67, (byte) -67, (byte) -65, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubdef\ubfbd?hi!" + "'", str2, "\uefbf\ubdef\ubfbd?hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\uff7d\ufffd?\000h\000i\000!\000" + "'", str3, "\ufffd\ufffd\uff7d\ufffd?\000h\000i\000!\000");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6800\u6900\u2100" + "'", str6, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000i\000h\000\377\000\375", "\ufffd\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("?hi\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -29, (byte) -68, (byte) -128, (byte) -29, (byte) -68, (byte) -128 });
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd", "h\000\000\000i\000\000\000!\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: h???i???!???: java.io.UnsupportedEncodingException: h???i???!???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????" + "'", str3, "????");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\u3f3fih??????");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\346\245\250\356\276\277\353\267\257\353\276\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -26, (byte) 0, (byte) -91, (byte) 0, (byte) -88, (byte) 0, (byte) -18, (byte) 0, (byte) -66, (byte) 0, (byte) -65, (byte) 0, (byte) -21, (byte) 0, (byte) -73, (byte) 0, (byte) -81, (byte) 0, (byte) -21, (byte) 0, (byte) -66, (byte) 0, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\245\250\356\276\277\353\267\257\353\276\275" + "'", str3, "\346\245\250\356\276\277\353\267\257\353\276\275");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u3f3f???????????????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h?i?!: java.io.UnsupportedEncodingException: ???h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\357\267\277\357\267\277\000\346\240\200\000\346\244\200\000\342\204\200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) -3, (byte) -1 });
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\343\275\250\346\244\241");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -29, (byte) 0, (byte) -67, (byte) 0, (byte) -88, (byte) 0, (byte) -26, (byte) 0, (byte) -92, (byte) 0, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\343\000\275\000\250\000\346\000\244\000\241" + "'", str2, "\376\377\000\343\000\275\000\250\000\346\000\244\000\241");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubfef\u68bd\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "?hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?hi!: java.io.UnsupportedEncodingException: ?hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -65, (byte) -17, (byte) 104, (byte) -67, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\277\357h\275!i" + "'", str2, "\376\377\277\357h\275!i");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????????????" + "'", str3, "????????????");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "????????????" + "'", str4, "????????????");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uefbb\ubf69\u68c3\ubdc3\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -66, (byte) -69, (byte) -21, (byte) -67, (byte) -87, (byte) -26, (byte) -93, (byte) -125, (byte) -21, (byte) -73, (byte) -125, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ue3bc\ubfe3\ubcbf\ue3bc\ubfe3\ubcbf\ue3bc\ubfe3\ubcbf\ue3bc\ubfef\ubfbd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "29) test3418(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "30) test3419(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubec3\ubfc3\u6869\ubfc3\ubdc3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????: java.io.UnsupportedEncodingException: ???????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) 104, (byte) 105, (byte) -65, (byte) -61, (byte) -67, (byte) -61 });
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6968\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("ih\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\377\375\377\375hi\375\377");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?y?y?hiy?y?: java.io.UnsupportedEncodingException: ?y?y?y?y?y?hiy?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "???" + "'", str5, "???");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000!" + "'", str2, "\000h\000i\000!");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\000\000\000i\000\000\000h\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????\000\000\000i\000\000\000h\000\000??\000\000??\000\000??\000\000??\000\000??\000\000??" + "'", str2, "????\000\000\000i\000\000\000h\000\000??\000\000??\000\000??\000\000??\000\000??\000\000??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f" + "'", str3, "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\uefbf\ubde6\ua1a9\uefb7\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000", (java.lang.CharSequence) "h\000i\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6869\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\ufffd" + "'", str4, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000\ufffd\000\ufffd\000h\000?\000!\000i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6869\u3f3f\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\346\240\277\342\205\251", (java.lang.CharSequence) "??????hi??");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ubce3\ue3bf\ubfbc\ubce3\ufffd", "\ufffd\ufffd\ufffd\ufffd?hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????hi!: java.io.UnsupportedEncodingException: ?????hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\377\375?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str3, "\ufdff\ufdff\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\273\277\000i\000h\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275" + "'", str2, "\357\273\277\000i\000h\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\u6900\u6800\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -17, (byte) -17, (byte) -67, (byte) -67, (byte) -65, (byte) -95, (byte) -26, (byte) -17, (byte) -87, (byte) -65, (byte) -73 });
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f00\u3f00\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375" + "'", str2, "\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffdh\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\uefbd\ubdbfhi!" + "'", str2, "\ubfef\uefbd\ubdbfhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ubfef\uefbd\ubdbfhi!" + "'", str3, "\ubfef\uefbd\ubdbfhi!");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\000?\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???i???i???i???i???i??????h?i?!: java.io.UnsupportedEncodingException: i???i???i???i???i???i??????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd" + "'", str3, "\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd" + "'", str4, "\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "???" + "'", str4, "???");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "???" + "'", str5, "???");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\ufeff\u6968\ufffd", (java.lang.CharSequence) "\u3f3f\u3f69\u683f\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????" + "'", str3, "????");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\u3f3f" + "'", str4, "\u3f3f\u3f3f");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("???");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "???" + "'", str4, "???");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue3bc\ubfef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\343\274\277\357\277\275" + "'", str2, "\343\274\277\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue3bc\ubfef\ubfbd" + "'", str4, "\ue3bc\ubfef\ubfbd");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ubeee\uebbf\uafb7\u9eeb\ueebf\ubfbe\ub7eb\uebaf\ubdbe\u9aee\ueaa1\uafa7\u9eeb\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "31) test3465(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "32) test3466(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
// flaky "13) test3466(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u3f3f" + "'", str2, "\u6968\u3f3f");
// flaky "7) test3466(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih??" + "'", str3, "ih??");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("ih\357\ubfbd\357\ubfbd", "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????h?i?????????: java.io.UnsupportedEncodingException: ????????????????????????h?i?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff???????????????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi??????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000?\000?\000?\000?\000?\000?" + "'", str2, "\000h\000i\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\346\000\245\000\250\000\356\000\276\000\277\000\353\000\267\000\257\000\353\000\276\000\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?" + "'", str2, "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2\u3f00\u6800\u6900\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ??????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufeff\ufffd\u6869\ufdff");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u693f\u3f68\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\376\000\377\000h\000?\000!\000i\000" + "'", str2, "\376\377\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\376\000\377\000h\000?\000!\000i\000" + "'", str3, "\376\377\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000" + "'", str4, "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000\ufffd\000\ufffd\000i\000h\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str3, "\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\303\276\303\277ih\303\277\303\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -61, (byte) 0, (byte) -66, (byte) 0, (byte) -61, (byte) 0, (byte) -65, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -61, (byte) 0, (byte) -65, (byte) 0, (byte) -61, (byte) 0, (byte) -67 });
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\000h\000i\000!", (java.lang.CharSequence) "\376\377ih\375\377");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("?\000?\000?\000?\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbb\ubfef\ubfbd\uefbf\ubde6\ua1a9\uefb7\ufffd" + "'", str2, "\uefbb\ubfef\ubfbd\uefbf\ubde6\ua1a9\uefb7\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ubbef\uefbf\ubdbf\ubfef\ue6bd\ua9a1\ub7ef\ufffd" + "'", str4, "\ubbef\uefbf\ubdbf\ubfef\ue6bd\ua9a1\ub7ef\ufffd");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("??????????\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????\000\000\000\000????");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\000?\000h\000i\000!", "\245\346\357\250\275\277");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??i????: java.io.UnsupportedEncodingException: ??i????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "33) test3488(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000i\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000i\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky "14) test3488(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375\377\375\377\375\377\375\377\375\377\375\000\000\000i\000\000\000h\377\375\377\375\377\375\377\375" + "'", str3, "\377\375\377\375\377\375\377\375\377\375\377\375\000\000\000i\000\000\000h\377\375\377\375\377\375\377\375");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u9aee\ueba0\ua2bf\u96e8\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -23, (byte) -85, (byte) -82, (byte) -18, (byte) -82, (byte) -96, (byte) -22, (byte) -118, (byte) -65, (byte) -23, (byte) -101, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u3f3f\u3f3f", "\376\377\277\357h\275!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??i?h?!i: java.io.UnsupportedEncodingException: ?y??i?h?!i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\u3f3f\u3f3f\u3f3f\u6968\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\376\377\377\375\375\377\377\375\377\375hi\375\377");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubeee\uebbf\uafb7\u9eeb\ueebf\ubfbe\ub7eb\uebaf\ubdbe\u9aee\ueaa1\uafa7\u9eeb\ufffd" + "'", str2, "\ubeee\uebbf\uafb7\u9eeb\ueebf\ubfbe\ub7eb\uebaf\ubdbe\u9aee\ueaa1\uafa7\u9eeb\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf" + "'", str3, "\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\u6968\ufffd" + "'", str2, "\ufffd\ufdff\ufdff\u6968\ufffd");
// flaky "34) test3496(org.apache.commons.codec.binary.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6900\000\u6800\000\u3f00\000\u3f00\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????h?i????: java.io.UnsupportedEncodingException: ?????????????h?i????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ua5e6\uefa8\ubdbf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}
