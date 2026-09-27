package org.apache.commons.codec.binary;

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
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("i\000h\000\377\000\375\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377????????????ih????");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?????????????ih????: java.io.UnsupportedEncodingException: ?y?????????????ih????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377ih\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffdh?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh?!i" + "'", str2, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000h\000?\000!\000i" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\000h\000?\000!\000i");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?", "\ufeff\ufffd\ufdff\ufdff\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\377\375\000h\000i\000!", "\uefbf\ubdef\ubfbd\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????: java.io.UnsupportedEncodingException: ???????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "1) test5007(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "1) test5007(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\000i\000h\377\375\377\375" + "'", str2, "\377\375\377\375\000i\000h\377\375\377\375");
// flaky "1) test5007(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\377\375\377\375\000i\000h\377\375\377\375" + "'", str3, "\377\375\377\375\000i\000h\377\375\377\375");
// flaky "1) test5007(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
// flaky "1) test5007(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str6, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h?!i" + "'", str2, "h?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683f\u2169" + "'", str3, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f68\u6921" + "'", str4, "\u3f68\u6921");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "2) test5009(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "2) test5009(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\u3f3f\u3f3f\u3f3f" + "'", str2, "\u6968\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd" + "'", str2, "\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd" + "'", str4, "\ufffd");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u3f00\u3f00" + "'", str2, "\u3f00\u3f00\u3f00");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6869\uafc3\ubfc2\ubdc2\uafc3\ubfc2\ubdc2");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 105, (byte) -81, (byte) -61, (byte) -65, (byte) -62, (byte) -67, (byte) -62, (byte) -81, (byte) -61, (byte) -65, (byte) -62, (byte) -67, (byte) -62 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\000\000\000\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000\000\000", (java.lang.CharSequence) "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h??i\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 63, (byte) 63, (byte) 105, (byte) -1, (byte) -3 });
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00" + "'", str2, "\ufdff\ufdff\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\375\377\375\377\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000" + "'", str3, "\375\377\375\377\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?" + "'", str4, "\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -20, (byte) -114, (byte) -66, (byte) -20, (byte) -114, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -20, (byte) -114, (byte) -65, (byte) -20, (byte) -114, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd" + "'", str2, "\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\uc3be\uc3bf\u6968\uc3bf\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\uc3be\uc3bf\u6968\uc3bf\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\uc3be\uc3bf\u6968\uc3bf\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\uc3be\uc3bf\u6968\uc3bf\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -65 });
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?\000?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????h?i?????????: java.io.UnsupportedEncodingException: ????????????????????????h?i?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6800\u6900\u2100" + "'", str4, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h\000i\000!\000" + "'", str6, "h\000i\000!\000");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\uefbb\ubfe6\ua0bf\ue285\ufffd", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -95, (byte) -87, (byte) -21, (byte) -65, (byte) -81, (byte) -18, (byte) -66, (byte) -67, (byte) -21, (byte) -74, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6" + "'", str2, "\ufffd\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubdee\ubebf\uebb5\ua8e6\ua4a1", "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y????h???iy?y?y?y?y?y?y?y?: java.io.UnsupportedEncodingException: ?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y?y????h???iy?y?y?y?y?y?y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\376\377\346\241\251\353\277\257\356\276\275\353\266\277");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y????e???i???e???: java.io.UnsupportedEncodingException: ?y????e???i???e???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\000\ufe00\000\uff00\000\u6800\000\u3f00\000\u2100\000\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\376\377\000\376\000\377\000h\000?\000!\000i" + "'", str2, "\ufffd\376\377\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufe00\uff00\000\ufe00\000\uff00\000\u6800\000\u3f00\000\u2100\000\u6900" + "'", str3, "\ufeff\ufe00\uff00\000\ufe00\000\uff00\000\u6800\000\u3f00\000\u2100\000\u6900");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "3) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "3) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\u6968\uefbf\ubdef\ubfbd");
// flaky "2) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
// flaky "2) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str4, "\u6968\uefbf\ubdef\ubfbd");
// flaky "2) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ubfef\uefbd\ubdbf" + "'", str5, "\u6869\ubfef\uefbd\ubdbf");
// flaky "1) test5026(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str6, "\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y?y?y?y?y?y?y?y??i?hy?y?y?y?: java.io.UnsupportedEncodingException: y?y?y?y?y?y?y?y??i?hy?y?y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bc\ubfe3\ubcbf" + "'", str2, "\ue3bc\ubfe3\ubcbf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\343\274\277\343\274\277" + "'", str3, "\343\274\277\343\274\277");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uefbb\ubfe3\ubcbf\uefbf\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -69, (byte) -17, (byte) -29, (byte) -65, (byte) -65, (byte) -68, (byte) -65, (byte) -17, (byte) -3, (byte) -1 });
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "4) test5031(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 104, (byte) 63, (byte) 63, (byte) 105, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\uefbf\ubdef\ubfbd\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf", "\376\377\000h\000i\000\377\000\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y??h?i?y??y?: java.io.UnsupportedEncodingException: ?y??h?i?y??y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u683f\u3f69\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f68\u693f\ufdff" + "'", str2, "\u3f68\u693f\ufdff");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ubfef\u68bd\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -65, (byte) -17, (byte) 104, (byte) -67, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\277\357h\275!i" + "'", str2, "\376\377\277\357h\275!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ubfef\u68bd\u2169" + "'", str3, "\ufeff\ubfef\u68bd\u2169");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\u6968\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????????????????????: java.io.UnsupportedEncodingException: ??????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????????????h?i?!: java.io.UnsupportedEncodingException: ?????????????????????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000?\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\000\ufffd\000\ufffd\000\000\000\000\000\ufffd\000\ufffd\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???????" + "'", str2, "???????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\u3f3f\ufffd" + "'", str3, "\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3fhi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000h\000i\000!" + "'", str2, "??\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u6800\u6900\u2100" + "'", str3, "\u3f3f\u6800\u6900\u2100");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\000\377\000\000\000\376\000\000\000\377\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000", (java.lang.CharSequence) "\u3f00\u3f00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ubce3\ufdff");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\357\267\277\357\267\277\000\346\240\200\000\346\244\200\000\342\204\200");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ubec3\ubfc3\ubfc3\ubdc3\ubdc3\ubfc3\ubfc3\ubdc3\ubfc3\ubdc3\u6968\ubdc3\ubfc3");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\000\ufffd\000\ufffd\000\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ua5e6\ueea8\ubfbe\ub7eb\uebaf\ubdbe", (java.lang.CharSequence) "\000\000\000i\000\000\000h\000\000??\000\000??");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ubbef\ue6bf\ubfa0\u85e2\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????" + "'", str2, "?????");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\343\000\275\000\250\000\346\000\244\000\241");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\000\u6800\000\u6900\uff00\ufd00\uff00\ufd00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?" + "'", str3, "?");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "?" + "'", str4, "?");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f68\u6921" + "'", str2, "\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u683f\u2169" + "'", str3, "\ufffd\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377?hi!" + "'", str4, "\376\377?hi!");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ih????????????: java.io.UnsupportedEncodingException: ih????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue3bc\ubf3f\u3f3f\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) 63, (byte) 63, (byte) 63, (byte) -1, (byte) -3 });
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("?\000?\000h\000\000\000i\000\000\000!\000\000\000", "\u6869\uefbf\ubdef\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("????????????????????????????????");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??h?!i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375" + "'", str2, "\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375" + "'", str3, "\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375\000\000\000\000\000\000\377\375\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\ufffd\ufffd\ufffd\ufffd?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\000i\000h\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?", (java.lang.CharSequence) "\ufffd\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683f\u2169" + "'", str2, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377h?!i" + "'", str3, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u683f\u2169" + "'", str4, "\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdh?!i" + "'", str5, "\ufffd\ufffdh?!i");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??: java.io.UnsupportedEncodingException: ??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "5) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "4) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\u6968\uefbf\ubdef\ubfbd");
// flaky "3) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
// flaky "3) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str4, "\u6968\uefbf\ubdef\ubfbd");
// flaky "3) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ubfef\uefbd\ubdbf" + "'", str5, "\u6869\ubfef\uefbd\ubdbf");
// flaky "2) test5062(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str6, "\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00", "\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????i??h??: java.io.UnsupportedEncodingException: ????i??h??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\000\000\000\000\000\000\000?\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("???????hi????");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000i\000h\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?i?h????: java.io.UnsupportedEncodingException: ?i?h????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -67, (byte) -88, (byte) -26, (byte) -92, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue3bd\ua8e6\ua4a1" + "'", str2, "\ue3bd\ua8e6\ua4a1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ue3bd\ua8e6\ua4a1" + "'", str3, "\ue3bd\ua8e6\ua4a1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f68\u6921" + "'", str4, "\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ubde3\ue6a8\ua1a4" + "'", str5, "\ubde3\ue6a8\ua1a4");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i\000\000\000h\000\000\000?\000\000\000?\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd?hi!" + "'", str2, "\ufffd\ufffd?hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f68\u6921" + "'", str3, "\u3f68\u6921");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("??????\000?\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi\375\377");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -3, (byte) 0, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\000\ufffd\000\ufffd" + "'", str2, "\000h\000i\000\ufffd\000\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000\ufffd\000\ufffd" + "'", str3, "\000h\000i\000\ufffd\000\ufffd");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\376hi\375\377");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -65, (byte) -61, (byte) -66, (byte) 104, (byte) 105, (byte) -61, (byte) -67, (byte) -61, (byte) -65 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000h\000\000\000i\000\000\000!\000" + "'", str2, "\000\000h\000\000\000i\000\000\000!\000");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufeffh?!i");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a5\ua8ef\ubfbd");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -91, (byte) -26, (byte) -17, (byte) -88, (byte) -67, (byte) -65 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "6) test5077(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 63, (byte) 63, (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000\377\000\375\000\377\000\375\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375" + "'", str2, "\376\377\000\377\000\375\000\377\000\375\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375\000\377\000\375");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000\343\000\274\000\277\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) 0, (byte) 0, (byte) -26, (byte) -92, (byte) -128, (byte) 0, (byte) 0, (byte) 0, (byte) -30, (byte) -124, (byte) -128, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -20, (byte) -114, (byte) -66, (byte) -20, (byte) -114, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -20, (byte) -114, (byte) -65, (byte) -20, (byte) -114, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\354\216\276\354\216\277\346\245\250\354\216\277\354\216\275" + "'", str2, "\354\216\276\354\216\277\346\245\250\354\216\277\354\216\275");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!", "\u3f3f\u6968\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377h?!i" + "'", str2, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\376\377h?!i" + "'", str3, "\ufeff\376\377h?!i");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\000\000\000i\000\000\000h\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        java.lang.Class<?> wildcardClass2 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000\000\000i\000\000\000h\000?\000?\000?\000?", "\u3f3f\u3f3f\u3f3f\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??ih??: java.io.UnsupportedEncodingException: ??ih??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377??????ih??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6800\u6900\uff00\ufd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdffhi\377\375" + "'", str2, "\ufdffhi\377\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh\000i\000\ufffd\000\ufffd\000" + "'", str3, "\ufffd\ufffdh\000i\000\ufffd\000\ufffd\000");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uefbf\ubde6\ua1a9\uefb7\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufdff\375\377\375\377ih\357\277\275\357\277\275");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?y?ihi???i???: java.io.UnsupportedEncodingException: ?y?y?y?y?ihi???i???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff" + "'", str2, "\ufffd\ubfef\ue6bd\ua9a1\ub7ef\ufdff");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u6900\000\u6800\000\ufdff\000\ufdff\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0, (byte) -3, (byte) -1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6900\000\u6800\000\ufdff\000\ufdff\000" + "'", str2, "\ufffd\u6900\000\u6800\000\ufdff\000\ufdff\000");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\343\000\274\000\277\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -29, (byte) 0, (byte) -68, (byte) 0, (byte) -65, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeffih\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 0 });
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??????????????????????????????????????????????????????");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals(charSequence0, (java.lang.CharSequence) "\ufffd\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\000\u6900\000\u2100\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000" + "'", str2, "\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffdh\000i\000!\000" + "'", str3, "\ufffdh\000i\000!\000");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000?\000?\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\u3f00\000\u3f00\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000" + "'", str2, "\ufffd\000\u3f00\000\u3f00\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\377\375?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\ufffd\000\ufffd", "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????h???i????????: java.io.UnsupportedEncodingException: ???????h???i????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375", (java.lang.CharSequence) "\000i\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\000\000i\000\000\000h\000\000\000\303\000\000\000\257\000\000\000\302\000\000\000\277\000\000\000\302\000\000\000\275\000\000\000\303\000\000\000\257\000\000\000\302\000\000\000\277\000\000\000\302\000\000\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\000?\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000", (java.lang.CharSequence) "\u3f3f\u3f3f\u3f3f\u6869\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "7) test5105(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str13 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\ufffd\ufdff\ufdff\u6968\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000?\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????????????????????????????????????????????????????????????h???i????????????????????????: java.io.UnsupportedEncodingException: ???????????????????????????????????????????????????????????????????????????h???i????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f3f\u6968\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\uefbf\ubd68\u6921");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3fhi!", (java.lang.CharSequence) "\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "8) test5114(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "5) test5114(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
// flaky "4) test5114(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375" + "'", str3, "\376\377\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "?\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("????ih??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\376\377\376\377\377\375\375\377\377\375\377\375hi\375\377");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\377\000\376\000\377\000h\000?\000!\000i", "\u3f3f\u3f00\u6800\u6900\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "9) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "6) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str2, "\u6968\uefbf\ubdef\ubfbd");
// flaky "5) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
// flaky "4) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str4, "\u6968\uefbf\ubdef\ubfbd");
// flaky "4) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ubfef\uefbd\ubdbf" + "'", str5, "\u6869\ubfef\uefbd\ubdbf");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd" + "'", str6, "\ufffd\ufffd");
// flaky "3) test5119(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ih\357\277\275\357\277\275" + "'", str7, "ih\357\277\275\357\277\275");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffd" + "'", str8, "\ufffd\ufffd");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -20, (byte) -114, (byte) -66, (byte) -20, (byte) -114, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -20, (byte) -114, (byte) -65, (byte) -20, (byte) -114, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd" + "'", str2, "\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc3be\uc3bf\u6968\uc3bf\uc3bd" + "'", str3, "\uc3be\uc3bf\u6968\uc3bf\uc3bd");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "10) test5122(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\u3f3f\u3f3f\u3f3f");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????" + "'", str2, "????????????");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("?????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?" + "'", str2, "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "11) test5128(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\343\274\277\357\277\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -29, (byte) 0, (byte) -68, (byte) 0, (byte) -65, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("i\000\000\000h\000\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 63, (byte) 63, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f", "\343\000\274\000\277\000\357\000\277\000\275\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: a??????i??????: java.io.UnsupportedEncodingException: a??????i??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000i\000h\000\357\000\277\000\275\000\357\000\277\000\275");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
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
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\u3f00\000\u6800\000\u6900\000\u2100" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\u3f00\000\u6800\000\u6900\000\u2100");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "??" + "'", str5, "??");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\377\375?\000h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000\000" + "'", str2, "\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000\000");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uefbf\ubdef\ub7bf\uefbf\ubdef\ubfbd\ue6a1\ua9ef\ub7bf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) -27, (byte) -88, (byte) -82, (byte) -2, (byte) -65, (byte) -85, (byte) -9, (byte) -81, (byte) -85, (byte) -2, (byte) -67, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ue53f\uaea8\ubffe\uf7ab\uabaf\ubdfe\ufffd" + "'", str2, "\u3f3f\ue53f\uaea8\ubffe\uf7ab\uabaf\ubdfe\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd" + "'", str3, "\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6900\u6800\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377h?!i" + "'", str2, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str3, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str2, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\376\377\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\343\274\277");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "12) test5146(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "7) test5146(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "6) test5146(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\ufdff\ufdff" + "'", str3, "\u6800\u6900\ufdff\ufdff");
// flaky "5) test5146(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "5) test5146(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000h\000i\377\375\377\375" + "'", str5, "\000h\000i\377\375\377\375");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\u3f3f" + "'", str2, "\ufdff\u3f3f");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f3f\u6800\u6900\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377\246\303\245\302\250\302\256\303\276\302\277\302\253\303\267\302\257\302\253\303\276\302\275\302" + "'", str4, "\376\377\246\303\245\302\250\302\256\303\276\302\277\302\253\303\267\302\257\302\253\303\276\302\275\302");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufeff\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2" + "'", str5, "\ufeff\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -96, (byte) -65, (byte) -30, (byte) -123, (byte) -87 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ue6a0\ubfe2\u85a9" + "'", str2, "\ue6a0\ubfe2\u85a9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\240\277\342\205\251" + "'", str3, "\346\240\277\342\205\251");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("???????????????");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufdff\ufdff\000\u6900\000\u6800\000\ufdff\000\ufdff\000\ufdff\000\ufdff\000\ufdff\000\ufdff", (java.lang.CharSequence) "\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u3f3f??ih??", "\ufffd\ufffd\ufa3d\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000\ufffd\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000??\000\000\000??\000\000\000??\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000" + "'", str2, "??\000??\000\000\000??\000\000\000??\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??\000??\000\000\000??\000\000\000??\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000" + "'", str3, "??\000??\000\000\000??\000\000\000??\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000\ufffd\000\ufffd\000h\000?\000!\000i", (java.lang.CharSequence) "\357\273\277\346\240\200\346\244\200\342\204\200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\uef00\ubf00\ubd00\uef00\ubf00\ubd00\uef00\ubf00\ubd00\uef00\ubf00\ubd00\uef00\ubf00\ubd00\uef00\ubf00\ubd00\000\u3f00\000\u6800\000\u6900\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\u6968\uc3af\uc2bf\uc2bd\uc3af\uc2bf\uc2bd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 104, (byte) -61, (byte) -81, (byte) -62, (byte) -65, (byte) -62, (byte) -67, (byte) -61, (byte) -81, (byte) -62, (byte) -65, (byte) -62, (byte) -67 });
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\377\375?hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\u3f68\u6921" + "'", str2, "\ufeff\ufffd\u3f68\u6921");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\377\375\377\375\377\375\377\375\000i\000h\377\375\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y?y?y?y?y?y?y?y??i?hy?y?y?y?: java.io.UnsupportedEncodingException: ?y?y?y?y?y?y?y?y??i?hy?y?y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -90, (byte) -61, (byte) -91, (byte) -62, (byte) -88, (byte) -62, (byte) -82, (byte) -61, (byte) -66, (byte) -62, (byte) -65, (byte) -62, (byte) -85, (byte) -61, (byte) -73, (byte) -62, (byte) -81, (byte) -62, (byte) -85, (byte) -61, (byte) -66, (byte) -62, (byte) -67, (byte) -62 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2" + "'", str2, "\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f" + "'", str3, "\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "????" + "'", str4, "????");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u3f3f\u3f3f" + "'", str5, "\u3f3f\u3f3f");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\000\ufdff\000\u6800\000\u3f00\000\u2100\000\u6900\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) -29, (byte) -68, (byte) -128, (byte) 0, (byte) -30, (byte) -124, (byte) -128, (byte) 0, (byte) -26, (byte) -92, (byte) -128, (byte) 0 });
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\ufeff\ufffd\u3f00\u6800\u6900\u2100");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
// flaky "13) test5167(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377\376\377ih\377\375" + "'", str3, "\376\377\376\377ih\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\u6869\ufdff" + "'", str4, "\ufffd\ufffd\u6869\ufdff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufeff\ufeff\u6968\ufffd" + "'", str5, "\ufeff\ufeff\u6968\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\ufffd\000\ufffd\000\000\000?\000\000\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\303\276\303\277ih\303\277\303\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377ih\377\375" + "'", str2, "\376\377ih\377\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc3be\uc3bf\u6968\uc3bf\uc3bd" + "'", str3, "\uc3be\uc3bf\u6968\uc3bf\uc3bd");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\303\276\303\277ih\303\277\303\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 105, (byte) 104, (byte) -61, (byte) -65, (byte) -61, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubec3\ubfc3\u6869\ubfc3\ubdc3" + "'", str2, "\ubec3\ubfc3\u6869\ubfc3\ubdc3");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000i\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377??i??h\377\375", (java.lang.CharSequence) "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000i\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "14) test5174(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\000\000i\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\000\000\000i\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -91, (byte) -26, (byte) -18, (byte) -88, (byte) -65, (byte) -66, (byte) -73, (byte) -21, (byte) -21, (byte) -81, (byte) -67, (byte) -66 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua5e6\ueea8\ubfbe\ub7eb\uebaf\ubdbe" + "'", str2, "\ua5e6\ueea8\ubfbe\ub7eb\uebaf\ubdbe");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufd00\uff00\ufd00\uff00\u6900\u6800\uef00\ubf00\ubd00\uef00\ubf00\ubd00");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("?hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f00\u6800\u6900\u2100" + "'", str2, "\ufffd\u3f00\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000?\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000?\000h\000i\000!" + "'", str4, "\ufffd\ufffd\000?\000h\000i\000!");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufdff\ufdff\000\u6900\000\u6800\000\ufdff\000\ufdff\000\ufdff\000\ufdff\000\ufdff\000\ufdff");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h\000i\000!\000" + "'", str3, "h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h\000i\000!\000" + "'", str4, "h\000i\000!\000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\303\257\302\277\302\275\303\257\302\277\302\275\303\257\302\277\302\275\303\257\302\277\302\275\303\257\302\277\302\275\303\257\302\277\302\275\000?\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u6968\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\346\245\250\356\276\277\353\267\257\353\276\275" + "'", str3, "\346\245\250\356\276\277\353\267\257\353\276\275");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd" + "'", str4, "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6968\uefbf\ubdef\ubfbd" + "'", str6, "\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufdff\375\377\375\377ih\357\277\275\357\277\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377?hi!", (java.lang.CharSequence) "\375\377\375\377ih\357\277\275\357\277\275");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\uefbf\ubd68\u6921");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -75, (byte) -88, (byte) -26, (byte) -92, (byte) -95 });
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000i\000h\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000i\000h\000?\000?\000?\000?\000?\000?" + "'", str2, "??\000i\000h\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00" + "'", str3, "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi??");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi??" + "'", str2, "hi??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi??" + "'", str3, "hi??");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ue6a5\ua8e3\ubcbf\ue3bc\ubfe3\ubcbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -102, (byte) -91, (byte) -22, (byte) -93, (byte) -93, (byte) -21, (byte) -78, (byte) -65, (byte) -18, (byte) -114, (byte) -68, (byte) -21, (byte) -65, (byte) -93, (byte) -21, (byte) -78, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uee9a\ua5ea\ua3a3\uebb2\ubfee\u8ebc\uebbf\ua3eb\ub2bf" + "'", str2, "\uee9a\ua5ea\ua3a3\uebb2\ubfee\u8ebc\uebbf\ua3eb\ub2bf");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("?ih\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3fhi!" + "'", str2, "\u3f3fhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u6800\u6900\u2100" + "'", str3, "\u3f3f\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3fhi!" + "'", str4, "\u3f3fhi!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????" + "'", str2, "?????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str3, "\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str4, "\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f\u3f00\u3f00\u6900\u6800\u3f00\u3f00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\000\000i\000\000\000h\000\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????i???h?????????????????????????: java.io.UnsupportedEncodingException: ??????i???h?????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u3f3f\u3f3f\u6968\u3f3f");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?" + "'", str2, "?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?" + "'", str3, "?");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\000?\000?\000?\000?" + "'", str2, "\376\377\000?\000?\000?\000?");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff????" + "'", str3, "\ufeff????");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ue6a1\ua9e3\ubcbf\ue3bc\ubfe3\ubcbf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -26, (byte) -95, (byte) -87, (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65, (byte) -29, (byte) -68, (byte) -65 });
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("ih\353\277\203\354\214\200\302\275", "\u3f3f\u3f3f\u6800\000\u6900\000\u2100\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375" + "'", str2, "\ufeff\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals(charSequence0, (java.lang.CharSequence) "\376\377\376\377\377\375\375\377\377\375\377\375hi\375\377");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f68\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??i!?: java.io.UnsupportedEncodingException: ??i!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000\ufffd\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000h\000\000\000?\000\000\000!\000\000\000i", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????: java.io.UnsupportedEncodingException: ???????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\233\352\352\203\202\227\243\352\352\202\203\273\273\353\353\202\202\277\257\352\353\203\202\237\277\352\352\202\203\257\273\353\353\202\202\267");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\u9b00\uea00\uea00\u8300\u8200\u9700\ua300\uea00\uea00\u8200\u8300\ubb00\ubb00\ueb00\ueb00\u8200\u8200\ubf00\uaf00\uea00\ueb00\u8300\u8200\u9f00\ubf00\uea00\uea00\u8200\u8300\uaf00\ubb00\ueb00\ueb00\u8200\u8200\ub700" + "'", str2, "\ufe00\uff00\u9b00\uea00\uea00\u8300\u8200\u9700\ua300\uea00\uea00\u8200\u8300\ubb00\ubb00\ueb00\ueb00\u8200\u8200\ubf00\uaf00\uea00\ueb00\u8300\u8200\u9f00\ubf00\uea00\uea00\u8200\u8300\uaf00\ubb00\ueb00\ueb00\u8200\u8200\ub700");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u6900\000\u6800\000\ufdff\000\ufdff\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -92, (byte) -128, (byte) 0, (byte) -26, (byte) -96, (byte) -128, (byte) 0, (byte) -17, (byte) -73, (byte) -65, (byte) 0, (byte) -17, (byte) -73, (byte) -65, (byte) 0 });
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?\000h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f00\u3f00\u6900\u6800\u3f00\u3f00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????: java.io.UnsupportedEncodingException: ???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\u683f\u2169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f3f\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???h?i?!: java.io.UnsupportedEncodingException: ???h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -26, (byte) -96, (byte) -65, (byte) -30, (byte) -123, (byte) -87 });
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\277\275\357\277\275\346\241\251\357\267\277");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\303\276\303\277\303\276\000\303\277\000h\000?\000!\000i\000", "\ufdff\ufdff\ufdff\ufdff\u3f00\u6800\u6900\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd\000", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????h?i?!: java.io.UnsupportedEncodingException: ??????????h?i?!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\377\375\377\375\377\375\377\375\377\375\377\375\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377h?!i" + "'", str2, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\000\ufffd\000h\000?\000!\000i\000" + "'", str3, "\ufffd\000\ufffd\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str4, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ue3bc\ubfe3\ubcbf\ue3bc\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -68, (byte) -29, (byte) -29, (byte) -65, (byte) -65, (byte) -68, (byte) -68, (byte) -29, (byte) -3, (byte) -1 });
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\000\377\000\000\000\376\000\000\000\377\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ubdc3\ubfc3\ubdc3\ubfc3\000i\000h\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3\000\ubdc3\ubfc3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????i?h??????????????????????????????????????????: java.io.UnsupportedEncodingException: ?????????????i?h??????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufeff???????????????");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
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
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
// flaky "15) test5219(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky "8) test5219(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd" + "'", str4, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ufffd" + "'", str5, "\u6869\ufffd");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\356\232\240\353\277\242\350\226\251");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ue6a1\ua9eb\ubfaf\ueebe\ubdeb\ub6bf");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufa3d\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -18, (byte) -102, (byte) -95, (byte) -22, (byte) -89, (byte) -85, (byte) -21, (byte) -66, (byte) -81, (byte) -18, (byte) -70, (byte) -66, (byte) -21, (byte) -73, (byte) -85, (byte) -21, (byte) -102, (byte) -65 });
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\376h\000i\000!\000" + "'", str2, "\377\376h\000i\000!\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh\000i\000!\000" + "'", str3, "\ufffd\ufffdh\000i\000!\000");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\000?\000?\000?\000?\000\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\000?\000?\000\000\000\000\000?\000?\000\000\000\000\000?\000?\000\000\000\000\000?\000?\000\000\000\000\000?\000?\000\000\000\000\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????????i???????h????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ?????????????????i???????h????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "16) test5226(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "9) test5226(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000h\000i\377\375\377\375" + "'", str2, "\000h\000i\377\375\377\375");
// flaky "7) test5226(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\000h\000\ufffd\ufffd\ufffd\ufffd");
// flaky "6) test5226(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\377\375\377\375" + "'", str4, "\000h\000i\377\375\377\375");
// flaky "6) test5226(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000h\000i\377\375\377\375" + "'", str5, "\000h\000i\377\375\377\375");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd" + "'", str6, "\ufffd\ufffd");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\346\245\250\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -26, (byte) 0, (byte) -91, (byte) 0, (byte) -88, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd" + "'", str2, "\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ue6a5\ua8ef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f?hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i?h?????????????: java.io.UnsupportedEncodingException: i?h?????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6800\u6900\u2100" + "'", str4, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6800\u6900\u2100" + "'", str5, "\u6800\u6900\u2100");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\000\u3f00\000\u3f00\000\u6800\000\000\000\u6900\000\000\000\u2100\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u3f00\u3f00\u3f00\000\u3f00\000\u3f00\ufffd" + "'", str2, "\u3f00\u3f00\u3f00\u3f00\000\u3f00\000\u3f00\ufffd");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375" + "'", str5, "\376\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6869\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\u3f3f" + "'", str2, "\u6869\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\u6869\u3f3f" + "'", str3, "\ufeff\u6869\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\376\377hi??" + "'", str4, "\376\377hi??");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\376\377hi??" + "'", str5, "\376\377hi??");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua5e6\ueea8\ubfbe\ub7eb\uebaf\ubdbe" + "'", str2, "\ua5e6\ueea8\ubfbe\ub7eb\uebaf\ubdbe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd" + "'", str4, "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd????????????" + "'", str2, "\ufffd\ufffd\ufffd\ufffd????????????");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("?\000?\000h\000?\000!\000i\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000?\000h\000?\000!\000i\000" + "'", str2, "?\000?\000h\000?\000!\000i\000");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\357\277\275\357\277\275\346\241\251\357\267\277", (java.lang.CharSequence) "\u3f3f\u3f3f\u6869\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\343\000\274\000\277\000\357\000\277\000\275\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd" + "'", str2, "\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd" + "'", str4, "\uefbb\ubfef\ubfbd\uefbf\ubd00\u6800\u6900\ufffd");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -73, (byte) -65, (byte) -17, (byte) -73, (byte) -65, (byte) -26, (byte) -91, (byte) -88, (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67 });
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\000?\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??????????????????????????????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str3, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ih\357\277\275\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -61, (byte) -81, (byte) -62, (byte) -65, (byte) -62, (byte) -67, (byte) -61, (byte) -81, (byte) -62, (byte) -65, (byte) -62, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\357\277\275\357\277\275" + "'", str2, "ih\357\277\275\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih\357\277\275\357\277\275" + "'", str3, "ih\357\277\275\357\277\275");
// flaky "17) test5247(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377\000?\000?\000?\000?");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ue6a0\ubfe2\u85a9", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????hi??: java.io.UnsupportedEncodingException: ????hi??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\376\377\377\375\375\377\377\375\377\375hi\375\377");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f??????hi??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("ih\357\ubfbd\357\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd" + "'", str2, "\000i\000h\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\ufdff" + "'", str2, "\u6968\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\ufffd" + "'", str3, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufdff" + "'", str4, "\u6968\ufdff");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?", (java.lang.CharSequence) "i\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\377\376h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\376h\000i\000!\000" + "'", str2, "\377\376h\000i\000!\000");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffdh?!i" + "'", str2, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\u683f\u2169" + "'", str3, "\ufffd\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdh?!i" + "'", str4, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdh?!i" + "'", str5, "\ufffd\ufffdh?!i");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????" + "'", str2, "????????????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????????????" + "'", str3, "????????????");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "????????????" + "'", str4, "????????????");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("??????\000?\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uc3be\uc3bfhi\303\ubf00\uc3bd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -61, (byte) -65, (byte) 0, (byte) -61, (byte) -67 });
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\303\277\303\276h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd", (java.lang.CharSequence) "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\000\u6800\000\u6900\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("???????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???????" + "'", str2, "???????");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\ubce3\ufdff");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6800\u6900\u2100" + "'", str4, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6800\u6900\u2100" + "'", str5, "\u6800\u6900\u2100");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\377\375\377\375\000\000\000h\000\000\000i\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi??" + "'", str2, "hi??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\u3f3f" + "'", str3, "\u6869\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\u3f3f" + "'", str4, "\u6869\u3f3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6968\u3f3f" + "'", str5, "\u6968\u3f3f");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("?hi??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ua1e6\ueba9\uafbf\ubeee\uebbd\ubfb6");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -95, (byte) -26, (byte) -21, (byte) -87, (byte) -81, (byte) -65, (byte) -66, (byte) -18, (byte) -21, (byte) -67, (byte) -65, (byte) -74 });
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u3f3f\000h\000i\000!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\uc3bd\uc3bf\uc3bd\uc3bf\u6900\u6800\uc3bd\uc3bf\uc3bd\uc3bf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -67, (byte) -61, (byte) -65, (byte) -61, (byte) -67, (byte) -61, (byte) -65, (byte) -61 });
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufe00\uff00\u9b00\uea00\uea00\u8300\u8200\u9700\ua300\uea00\uea00\u8200\u8300\ubb00\ubb00\ueb00\ueb00\u8200\u8200\ubf00\uaf00\uea00\ueb00\u8300\u8200\u9f00\ubf00\uea00\uea00\u8200\u8300\uaf00\ubb00\ueb00\ueb00\u8200\u8200\ub700");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u6869\u3f3f");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\uefbb\ubfe6\ua5a8\uefbf\ufffd", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000\000\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff" + "'", str2, "\ufffd\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f3f\u3f3f\u6968\u3f3f\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f3f\u3f3f\u6869\u3f3f\u3f3f\u3f3f" + "'", str2, "\ufffd\u3f3f\u3f3f\u6869\u3f3f\u3f3f\u3f3f");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??h\000i\000!\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("i\000\000\000h\000\000\000?\000\000\000?\000\000\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufa3d\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u6968\ufffd" + "'", str2, "\ufeff\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377ih\377\375" + "'", str3, "\376\377ih\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufffd" + "'", str4, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6968\ufffd" + "'", str5, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufeff\u6968\ufffd" + "'", str6, "\ufeff\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u6869\ufdff" + "'", str7, "\ufffd\u6869\ufdff");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6800\u6900\u2100" + "'", str2, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6800\u6900\u2100" + "'", str3, "\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h\000i\000!\000" + "'", str5, "h\000i\000!\000");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "18) test5292(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "10) test5292(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbb\ubfef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubd69\u68ef\ubfbd\uefbf\ufffd" + "'", str2, "\uefbb\ubfef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubd69\u68ef\ubfbd\uefbf\ufffd");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbb\ubfe6\ua080\ue6a4\u80e2\u8480");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -26, (byte) -96, (byte) -128, (byte) -26, (byte) -92, (byte) -128, (byte) -30, (byte) -124, (byte) -128 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u6800\u6900\u2100" + "'", str2, "\ufeff\u6800\u6900\u2100");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufe00\uff00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufeff\ufffd\ufffd\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\ufffd\ufffd\000h\000i\000!" + "'", str2, "\ufeff\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\376\377\377\375\377\375hi\277\357\357\275\275\277");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -65, (byte) -17, (byte) -17, (byte) -67, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf" + "'", str2, "\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u3f3f\u3f3f\ufffd", "\ubfef\ue6bd\ua9a1\ub7ef\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\376\377\377\375\377\375hi\375\377");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd\000" + "'", str2, "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd\000");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ue3bc\ubfe3\ubcbf\ue3bc\ubfe6\ua1a9\ue3bc\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -114, (byte) -68, (byte) -21, (byte) -65, (byte) -93, (byte) -21, (byte) -78, (byte) -65, (byte) -18, (byte) -114, (byte) -68, (byte) -21, (byte) -65, (byte) -90, (byte) -22, (byte) -122, (byte) -87, (byte) -18, (byte) -114, (byte) -68, (byte) -17, (byte) -65, (byte) -67 });
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\uff7d\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "19) test5300(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\377\375h?!i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\357\273\277\000i\000h\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275\000\357\277\275", (java.lang.CharSequence) "\u3f3f\u6800\u6900\u3f00\u3f00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\ufffd\u3f68\u6921");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f3f\u6869\ufffd", "\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????: java.io.UnsupportedEncodingException: ????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\000i\000h\000\ufffd\000\ufffd\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0 });
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u683f\u6900\u2100\ufffd", (java.lang.CharSequence) "\ufffd\ufffd?hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "20) test5308(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff" + "'", str2, "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\u6900\000\u6800\000\u3f3f\000\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f00\u3f00\u3f00\u3f00" + "'", str2, "\u3f00\u3f00\u3f00\u3f00");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufeff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6869\ufdff" + "'", str2, "\ufffd\u6869\ufdff");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
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
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u3f00\u6800\u6900\u2100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ubde3\ue6a8\ubfa4\ubfef\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeffhi\377\375", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ubce3\ue3bf\ubfbc\ubce3\ue3bf\ubfbc", (java.lang.CharSequence) "\000i\000h\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275\000\303\203\000\302\257\000\303\202\000\302\277\000\303\202\000\302\275");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 105, (byte) 104, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\u6968\ufffd" + "'", str2, "\ufffd\ufffd\u6968\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufeff\376\377ih\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -2, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd\357\ubfbd\uefbf\ubdef\ubfbd", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "\u3f3f\u6869\ufffd");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375\000\000\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
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
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\000\ufffd\000\ufffd\000h\000?\000!\000i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000h\000i\000!" + "'", str3, "\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000h\000i\000!" + "'", str4, "\000h\000i\000!");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\u3f3f");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("i\000h\000?\000?\000");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
// flaky "21) test5331(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi\377\375" + "'", str3, "hi\377\375");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\ufffd" + "'", str4, "\u6869\ufffd");
// flaky "11) test5331(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi\377\375" + "'", str6, "hi\377\375");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\000\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\ufffd\ufffd\u6869\ufdff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 63, (byte) 0, (byte) 63 });
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("ih\357\ubfbd\357\ubfbd", "\ufffd\ufffd\000\000\000?\000\000\000?\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????????h???????i???????!????: java.io.UnsupportedEncodingException: ?????????????h???????i???????!????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufeff\376\377ih\377\375", "\u3f3f\u3f69\u683f\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????: java.io.UnsupportedEncodingException: ????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\uefbf\ubdef\ubfbdh\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\000?\000?", (java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe" + "'", str2, "\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe" + "'", str3, "\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe\ubeee\uebbf\uafb7\ubeeb\ueebd\ubfbe\ub7eb\uebaf\ubdbe");
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
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
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\000h\000i\377\375\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?h?iy?y?y?y?: java.io.UnsupportedEncodingException: ?h?iy?y?y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "22) test5340(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) 0, (byte) 105, (byte) 0, (byte) 104, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3 });
// flaky "12) test5340(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\375\377\375\000i\000h\377\375\377\375\377\375\377\375\377\375\377\375" + "'", str2, "\377\375\377\375\000i\000h\377\375\377\375\377\375\377\375\377\375\377\375");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\377\375?\000h\000i\000!\000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????" + "'", str3, "????");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("??\345?\256\250\277\376\367\253\253\257\275\376\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\303\245?\302\256\302\250\302\277\303\276\303\267\302\253\302\253\302\257\302\275\303\276\303\277\303\275" + "'", str2, "??\303\245?\302\256\302\250\302\277\303\276\303\267\302\253\302\253\302\257\302\275\303\276\303\277\303\275");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????????????????????????????????????????????" + "'", str2, "?????????????????????????????????????????????");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\357\273\277\346\240\200\346\244\200\342\204\200");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\357\273\277\346\240\200\346\244\200\342\204\200" + "'", str2, "\357\273\277\346\240\200\346\244\200\342\204\200");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000h\000i\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\000h\000i\377\375\377\375" + "'", str2, "\ufeff\000h\000i\377\375\377\375");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\000\u6800\000\u6900\uff00\ufd00\uff00\ufd00" + "'", str3, "\ufffd\000\u6800\000\u6900\uff00\ufd00\uff00\ufd00");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\u6869\ubfef\uefbd\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\000?\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y???????: java.io.UnsupportedEncodingException: ?y???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 104, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377ih\357\277\275\357\277\275" + "'", str2, "\375\377\375\377ih\357\277\275\357\277\275");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd" + "'", str3, "\ufdff\ufdff\u6968\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\uff00\ufd00\ufd00\uff00\uff00\ufd00\uff00\ufd00\u6800\u6900\ufd00\uff00");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\376\000\377\000\376\000\000\000\377\000\000\000h\000\000\000?\000\000\000!\000\000\000i\000\000\000", "i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i???h???y?y???y?y???: java.io.UnsupportedEncodingException: i???h???y?y???y?y???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??????????????????????????????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??????????????????????????????????????" + "'", str3, "??????????????????????????????????????");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000\000\000i\000\000\000h\000\000\377\375\000\000\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 63, (byte) 63, (byte) 0, (byte) 0, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\u6900\000\u6800\000\u3f3f\000\u3f3f" + "'", str2, "\000\u6900\000\u6800\000\u3f3f\000\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000i\000\000\000h\000\000??\000\000??" + "'", str3, "\000\000\000i\000\000\000h\000\000??\000\000??");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\376\377\377\375\377\375hi\375\377", (java.lang.CharSequence) "???????hi????");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\uefbb\ubfef\ubfbd\uefbf\ubde6\ua1a9\uefb7\ufffd", (java.lang.CharSequence) "\u6869\u3f3f\u3f3f\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\000\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000", (java.lang.CharSequence) "\uc3a6\uc2a5\uc2a8\uc3ae\uc2be\uc2bf\uc3ab\uc2b7\uc2af\uc3ab\uc2be\uc2bd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377h\000i\000!\000" + "'", str2, "\376\377h\000i\000!\000");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdh\000i\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeffhi!" + "'", str2, "\ufeffhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str3, "\ufffd\ufffd\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\000h\000i\000!" + "'", str4, "\ufffd\ufffd\000h\000i\000!");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u3f3f\u3f3f?hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u6800\u6900\u2100" + "'", str2, "\ufeff\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377h\000i\000!\000" + "'", str3, "\376\377h\000i\000!\000");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\376\377ih\377\375");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd\000\000\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff" + "'", str2, "\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff\000\000\ufdff\ufdff");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u3f00\u3f00\u3f00\u3f00\000\u3f00\000\u3f00\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) -1, (byte) -3 });
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("hi\277\357\357\275\275\277");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f", (java.lang.CharSequence) "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("?\000?\000?\000?\000?\000?\000?\000");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\000\ufffd\000?\000\000\000h\000\000\000i\000\000\000!\000\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\275\ubfef\275?\000h\000i\000!\000" + "'", str2, "\ubfef\275\ubfef\275?\000h\000i\000!\000");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufeff\ufffd\ufffd\ufffd\ufffd?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "??\345?\256\250\277\376\367\253\253\257\275\376\377\375");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??a????????????y?y?: java.io.UnsupportedEncodingException: ??a????????????y?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000?\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\u6968\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "???" + "'", str2, "???");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???" + "'", str3, "???");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "???" + "'", str5, "???");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ue6a5\ua8ef\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\ufdff" + "'", str3, "\u6968\ufdff");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "23) test5374(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
// flaky "13) test5374(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str2, "i\000h\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("?????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?" + "'", str2, "\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\u3f00\u3f00\u3f00", "\ufffd\ufffd\000?\000?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ue3bc\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("????\000h\000i????", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????h???i???????: java.io.UnsupportedEncodingException: ????????????h???i???????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u6968\ufffd", (java.lang.CharSequence) "\ubde3\ue6a8\ubfa4\ubfef\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("hi!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6968\ufffd" + "'", str2, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\ufffd" + "'", str3, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ufffd" + "'", str5, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6968\ufffd" + "'", str6, "\u6968\ufffd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6869\ufffd" + "'", str8, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6968\ufffd" + "'", str9, "\u6968\ufffd");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufe00\uff00\u6800\u3f00\u2100\u6900");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\376\000\377\000h\000?\000!\000i\000" + "'", str2, "\376\377\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str3, "\ufeff\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000" + "'", str4, "\ufffd\ufffd\ufffd\000\ufffd\000h\000?\000!\000i\000");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("ih\353\277\203\354\214\200\302\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih????????" + "'", str2, "ih????????");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\u3f00\u3f00\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -29, (byte) -68, (byte) -128, (byte) -29, (byte) -68, (byte) -128, (byte) -29, (byte) -68, (byte) -128, (byte) -29, (byte) -68, (byte) -128 });
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????" + "'", str3, "????");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\u3f3f" + "'", str4, "\u3f3f\u3f3f");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100" + "'", str2, "\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\375\377\375\377h\000\000\000i\000\000\000!\000\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\376\377\346\245\250\357\277\275");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y????i???: java.io.UnsupportedEncodingException: ?y????i???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u6800\000\u6900\000\u2100\000" + "'", str2, "\u3f3f\u3f3f\u6800\000\u6900\000\u2100\000");
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u3f3f\u3f3f\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) -1, (byte) -3 });
// flaky "24) test5387(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd" + "'", str2, "\ufffd\ufffd");
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\377\375\377\375\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ua5e6\uefa8\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) -91, (byte) -88, (byte) -17, (byte) -65, (byte) -67 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua5e6\uefa8\ubdbf" + "'", str2, "\ua5e6\uefa8\ubdbf");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\277\275\356\252\233\350\217\252\351\236\202\356\252\243\350\213\252\353\256\203\356\256\273\350\213\253\353\276\202\356\252\257\350\217\253\351\276\202\356\252\277\350\213\252\352\276\203\356\256\273\350\213\253\353\236\202");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????????????????????????????????????????????????????????" + "'", str2, "?????????????????????????????????????????????????????????");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\uefbf\ubdef\ubfbdh\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -18, (byte) -66, (byte) -65, (byte) -21, (byte) -73, (byte) -81, (byte) -21, (byte) -66, (byte) -67, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubeee\uebbf\uafb7\ubeeb\u68bd\u6900\u2100\ufffd" + "'", str2, "\ubeee\uebbf\uafb7\ubeeb\u68bd\u6900\u2100\ufffd");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\375\377" + "'", str2, "ih\375\377");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6968\ufdff" + "'", str3, "\u6968\ufdff");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\376\377\346\240\277\342\205\251");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -61, (byte) -66, (byte) -61, (byte) -65, (byte) -61, (byte) -90, (byte) -62, (byte) -96, (byte) -62, (byte) -65, (byte) -61, (byte) -94, (byte) -62, (byte) -123, (byte) -62, (byte) -87 });
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u3f3f\u3f3f?hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\uec8e\ubeec\u8ebf\ue6a5\ua8ec\u8ebf\uec8e\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\ufffd\ufffd", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: : java.io.UnsupportedEncodingException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf\ubfef\uefbd\ubdbf");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufdff\ufdff\000\u6900\000\000\000\u6800\000\000\000\ufdff\000\000\000\ufdff\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???????????????????: java.io.UnsupportedEncodingException: ???????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ue6a5\ua8ee\ubebf\uebb7\uafeb\ubebd", (java.lang.CharSequence) "??????\000\000\000?\000\000\000?\000\000\000?");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\000h\000\000\000i\000\000\000!\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000");
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\u3f68\u693f\u3f3f", "i\000h\000\375\000\377\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i?h?y??y??: java.io.UnsupportedEncodingException: i?h?y??y??");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ua6c3\ua5c2\ua8c2\uaec3\ubec2\ubfc2\uabc3\ub7c2\uafc2\uabc3\ubec2\ubdc2");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7" + "'", str2, "\u9bea\uea83\u8297\ua3ea\uea82\u83bb\ubbeb\ueb82\u82bf\uafea\ueb83\u829f\ubfea\uea82\u83af\ubbeb\ueb82\u82b7");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782" + "'", str3, "\uea9b\u83ea\u9782\ueaa3\u82ea\ubb83\uebbb\u82eb\ubf82\ueaaf\u83eb\u9f82\ueabf\u82ea\uaf83\uebbb\u82eb\ub782");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\uefbf\ubd68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????????????????????????????????????????????????????????????????????????????????????????????????: java.io.UnsupportedEncodingException: ????????????????????????????????????????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubd68\u6921" + "'", str2, "\uefbf\ubd68\u6921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\357\277\275hi!" + "'", str3, "\357\277\275hi!");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\000\ufffd\000\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????h???????i???????!?: java.io.UnsupportedEncodingException: ??????????h???????i???????!?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\000h\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "25) test5409(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67 });
// flaky "14) test5409(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd" + "'", str2, "\uefbf\ubdef\ubfbd\uefbf\ubdef\ubfbd");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "???" + "'", str4, "???");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f", (java.lang.CharSequence) "\ufdff\ufdff\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00\000\u3f00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\375\377\375\377i\000h\000\375\377\375\377", "\uff00\ufd00\u6800\u3f00\u2100\u6900");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\376\377\377\375?hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\uefbb\ubfe3\ubcbf\uefbf\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????????: java.io.UnsupportedEncodingException: ?????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\000h\000\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????i\000h\000????" + "'", str2, "????????????i\000h\000????");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\376\377\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??\000h\000i\000!" + "'", str2, "??\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u6800\u6900\u2100" + "'", str3, "\u3f3f\u6800\u6900\u2100");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000h\000i\000\ufffd\000\ufffd", (java.lang.CharSequence) "\ue3bc\ubfe3\ubcbf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000i\000h\000\377\000\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000i\000h\000\377\000\375" + "'", str2, "\000i\000h\000\377\000\375");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\375\377" + "'", str2, "ih\375\377");
// flaky "26) test5418(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6869\ufffd" + "'", str4, "\u6869\ufffd");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("??ih??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f3f\u3f3f\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????" + "'", str2, "????");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\357\273\277\346\245\250\357\277\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) 0, (byte) -69, (byte) 0, (byte) -65, (byte) 0, (byte) -26, (byte) 0, (byte) -91, (byte) 0, (byte) -88, (byte) 0, (byte) -17, (byte) 0, (byte) -65, (byte) 0, (byte) -67, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000" + "'", str2, "\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000\ufffd\000");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ubfef\ue6bd\ua9a1\ub7ef\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -65, (byte) -17, (byte) -26, (byte) -67, (byte) -87, (byte) -95, (byte) -73, (byte) -17, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ubfef\ue6bd\ua9a1\ub7ef\ufffd" + "'", str2, "\ubfef\ue6bd\ua9a1\ub7ef\ufffd");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ubce3\ue3bf\ubfbc\ubce3\ue3bf\ubfbc\ubce3\ue3bf\ubfbc\ubce3\uefbf\ubdbf");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\345\250\256\376\277\253\367\257\253\376\275\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "???????????????" + "'", str3, "???????????????");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\000\ufffd\000\ufffd\000\000\000?\000\000\000?");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000?\000", (java.lang.CharSequence) "\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\377\376hi\375\377");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: y??hiy?y?: java.io.UnsupportedEncodingException: y??hiy?y?");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "27) test5427(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "15) test5427(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f" + "'", str2, "\u3f3f\u3f3f");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufeff\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufeff\376\377\000\376\000\377\000h\000?\000!\000i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??y????y??h???!?i: java.io.UnsupportedEncodingException: ??y????y??h???!?i");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\000\u6800\000\u6900\000\u2100", (java.lang.CharSequence) "\ufffd\ufffd\ufeff\ufffd\ufffd\000h\000i\000\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000i\000\000\000\000\000\000\000h\000\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd\000\000\000\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        byte[] byteArray0 = null;
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newString(byteArray0, "??\345?\256\250\277\376\367\253\253\257\275\376\377\375");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "28) test5432(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "\ufeff???????????????");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????????: java.io.UnsupportedEncodingException: ????????????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f3f\u6968\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\ufffd" + "'", str2, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\ufffd" + "'", str3, "\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f\ufffd" + "'", str4, "\u3f3f\ufffd");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\uefbb\ubfef\ubfbd\uefbf\ubde6\ua1a9\uefb7\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -17, (byte) -69, (byte) -65, (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) -26, (byte) -95, (byte) -87, (byte) -17, (byte) -73, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\377\357\273\277\357\277\275\357\277\275\346\241\251\357\267\377\375" + "'", str2, "\376\377\357\273\277\357\277\275\357\277\275\346\241\251\357\267\377\375");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\ufffd\ufdff\ufdff\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????????" + "'", str2, "?????????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\ufffd" + "'", str3, "\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -29, (byte) -67, (byte) -88, (byte) -26, (byte) -92, (byte) -95 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f68\u6921" + "'", str2, "\ufffd\u3f68\u6921");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000\000\000\000\000\000\000\000\000" + "'", str2, "\000\000\000\000\000h\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000i\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000!\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str3, "\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000" + "'", str4, "\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000\000\000\000\000");
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("h??i\377\375", "\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????: java.io.UnsupportedEncodingException: ????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u6800\u6900\u3f00\u3f00", (java.lang.CharSequence) "\u3f3f\u6968\u3f3f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uefbf\ubdef\ubfbd?hi!" + "'", str3, "\uefbf\ubdef\ubfbd?hi!");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ua5e6\uefa8\ubdbf");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -91, (byte) -26, (byte) -17, (byte) -88, (byte) -67, (byte) -65 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufa3d\ufffd" + "'", str2, "\ufffd\ufffd\ufa3d\ufffd");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\u3f3f\u3fe5\ua8ae\ufebf\uabf7\uafab\ufebd\ufffd", (java.lang.CharSequence) "\u6869\ubfef\uefbd\ubdbf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("?\000?\000\000\000h\000\000\000i\000\000\000?\000\000\000?\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?\000?\000\000\000h\000\000\000i\000\000\000?\000\000\000?\000" + "'", str2, "?\000?\000\000\000h\000\000\000i\000\000\000?\000\000\000?\000");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("????????????");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????" + "'", str2, "????????????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "????????????" + "'", str3, "????????????");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufe00\uff00\000\000\000\u6900\000\000\000\u6800\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u3f68\u6921");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f" + "'", str2, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "??" + "'", str3, "??");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "??" + "'", str4, "??");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "??" + "'", str5, "??");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\000i\000h\000\303\000\257\000\302\000\277\000\302\000\275\000\303\000\257\000\302\000\277\000\302\000\275");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000i\000\000\000h\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000" + "'", str2, "\000\000i\000\000\000h\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000\000\000\ufffd\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000i\000h\000\303\000\257\000\302\000\277\000\302\000\275\000\303\000\257\000\302\000\277\000\302\000\275" + "'", str3, "\000i\000h\000\303\000\257\000\302\000\277\000\302\000\275\000\303\000\257\000\302\000\277\000\302\000\275");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\uff00\ufd00\uff00\ufd00\000\000\000\u6800\000\000\000\u6900\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00" + "'", str2, "\ufffd\uff00\ufd00\uff00\ufd00\000\000\000\u6800\000\000\000\u6900\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00\uff00\ufd00");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufeff\u6968\uefbf\ubdef\ubfbd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "?????" + "'", str2, "?????");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?????" + "'", str3, "?????");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\346\245\250\356\276\277\353\267\257\353\276\275", "\uefbf\ubdee\ubebf\uebb5\ua8e6\ua4a1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????????: java.io.UnsupportedEncodingException: ??????????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\377h?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufe00\uff00\u6800\u3f00\u2100\u6900" + "'", str2, "\ufe00\uff00\u6800\u3f00\u2100\u6900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\376\377h?!i" + "'", str3, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\376\000\377\000h\000?\000!\000i" + "'", str4, "\000\376\000\377\000h\000?\000!\000i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\376\377h?!i" + "'", str5, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\376\377h?!i" + "'", str6, "\376\377h?!i");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\376\377h?!i" + "'", str7, "\376\377h?!i");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????hi??: java.io.UnsupportedEncodingException: ????hi??");
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
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("\ufffd\ufffd\000?\000h\000i\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -17, (byte) -65, (byte) -67, (byte) -17, (byte) -65, (byte) -67, (byte) 0, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ubfef\uefbd\ubdbf\u3f00\u6800\u6900\u2100" + "'", str4, "\ubfef\uefbd\ubdbf\u3f00\u6800\u6900\u2100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000?\000h\000i\000!");
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("??h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h\000i\000!\000" + "'", str2, "??h\000i\000!\000");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufdff\ufdff\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00\u6900\u6800\u3f00\u3f00");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u3f3f\u3f00\u6800\u6900\u2100");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\ufffd");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\u6869\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1, (byte) -3, (byte) 104, (byte) 105, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u6869\ufdff" + "'", str2, "\ufffd\u6869\ufdff");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\u6968\ufffd" + "'", str3, "\ufdff\u6968\ufffd");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        java.nio.ByteBuffer byteBuffer1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("\000?\000?\000?\000?\000?\000?\000h\000i\000?\000?");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u683f\u2169");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufeff\u683f\u2169" + "'", str2, "\ufeff\u683f\u2169");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdh?!i" + "'", str3, "\ufffd\ufffdh?!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffdh?!i" + "'", str4, "\ufffd\ufffdh?!i");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\376\000\377\000h\000?\000!\000i\000");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -2, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 104, (byte) 0, (byte) 0, (byte) 0, (byte) 63, (byte) 0, (byte) 0, (byte) 0, (byte) 33, (byte) 0, (byte) 0, (byte) 0, (byte) 105, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\375\377\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375\377\375", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufe00\uff00\000\000\000\u6900\000\000\000\u6800\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00\000\000\uff00\ufd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\000\u3f00\000\u3f00\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f" + "'", str2, "\u3f3f\000\u3f00\000\u3f00\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("?\000?\000\000\000h\000\000\000i\000\000\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\u3f00\000\u3f00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000" + "'", str2, "\ufffd\u3f00\000\u3f00\000\000\000\u6800\000\000\000\u6900\000\000\000\u2100\000");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\ufffd\ufffd\ufffd\ufffdh\000\000\000i\000\000\000!\000\000\000", (java.lang.CharSequence) "\u3f3f\u6900\u6800\u3f00\u3f00\u3f00\u3f00\u3f00\u3f00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "29) test5468(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -3, (byte) -1, (byte) -3, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
// flaky "16) test5468(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\375\377\375\377i\000h\000\375\377\375\377" + "'", str2, "\375\377\375\377i\000h\000\375\377\375\377");
// flaky "8) test5468(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufdff\ufdff\u6900\u6800\ufdff\ufdff" + "'", str3, "\ufdff\ufdff\u6900\u6800\ufdff\ufdff");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) -1, (byte) -3 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6869\ufffd" + "'", str2, "\u6869\ufffd");
// flaky "30) test5469(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufdff" + "'", str4, "\u6968\ufdff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6869\ufffd" + "'", str5, "\u6869\ufffd");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufe00\uff00\u9b00\uea00\uea00\u8300\u8200\u9700\ua300\uea00\uea00\u8200\u8300\ubb00\ubb00\ueb00\ueb00\u8200\u8200\ubf00\uaf00\uea00\ueb00\u8300\u8200\u9f00\ubf00\uea00\uea00\u8200\u8300\uaf00\ubb00\ueb00\ueb00\u8200\u8200\ub700", "\u3f3f\u3f3f\u3f3f\u6869\u3f3f");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?????: java.io.UnsupportedEncodingException: ?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd", "\376\377\000\346\000\245\000\250\000\356\000\276\000\277\000\353\000\267\000\257\000\353\000\276\000\275");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ?y????????i??????e??????e?????: java.io.UnsupportedEncodingException: ?y????????i??????e??????e?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u3f3f\u3f3f\000i\000h\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f" + "'", str2, "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f" + "'", str3, "\u3f3f\u3f3f\000\u6900\000\u6800\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f\000\u3f3f");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\000h\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "31) test5474(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000\000\000?\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u6869\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 104, (byte) -3, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih\375\377" + "'", str2, "ih\375\377");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6869\ufffd" + "'", str3, "\u6869\ufffd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6968\ufdff" + "'", str4, "\u6968\ufdff");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\357\277\275hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("????ih??");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 105, (byte) 104, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\u6900\u6800\uff00\ufd00");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -1, (byte) 0, (byte) -3, (byte) 0 });
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\ufffd\u3f00\u6800\u6900\u2100");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -2, (byte) -1, (byte) -1, (byte) -3, (byte) 63, (byte) 0, (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str6 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str12 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffdh?!i");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 104, (byte) 63, (byte) 33, (byte) 105 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??h?!i" + "'", str2, "??h?!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u683f\u2169" + "'", str3, "\u3f3f\u683f\u2169");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("\ufffd\ufffd\000?\000h\000i\000!", "\ufeff\ufffd\ufdff\ufdff\u6968\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ??????: java.io.UnsupportedEncodingException: ??????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\uc3be\uc3bf\u6968\uc3bf\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        boolean boolean2 = org.apache.commons.codec.binary.StringUtils.equals((java.lang.CharSequence) "\375\377\375\377\000\000i\000\000\000h\000\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377\000\000\375\377", (java.lang.CharSequence) "\ufdff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked("", "ih\357\ubfbd\357\ubfbd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ihi????i????: java.io.UnsupportedEncodingException: ihi????i????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000\000\000\000h\000\000\000\000\000\000\000i\000\000\000\000\000\000\000!\000");
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\u6968\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        java.lang.String str4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??" + "'", str2, "??");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f" + "'", str3, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u3f3f" + "'", str4, "\u3f3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u3f3f" + "'", str5, "\u3f3f");
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("???????????????????\000h\000i\000!\000");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\375\377h?!i");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -3, (byte) 0, (byte) -1, (byte) 0, (byte) 104, (byte) 0, (byte) 63, (byte) 0, (byte) 33, (byte) 0, (byte) 105 });
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("??????\000\000\000?\000\000\000?\000\000\000?");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "??????\000\000\000?\000\000\000?\000\000\000?" + "'", str2, "??????\000\000\000?\000\000\000?\000\000\000?");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\ufffd\000\ufffd\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("ih\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd\357\ubfbd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\000i\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ????????????h?i???: java.io.UnsupportedEncodingException: ????????????h?i???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "32) test5494(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 104, (byte) 105, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
// flaky "17) test5494(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "????????????hi????" + "'", str2, "????????????hi????");
// flaky "9) test5494(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u6968\u3f3f\u3f3f" + "'", str3, "\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u3f3f\u6968\u3f3f\u3f3f");
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufffd\u6800\u6900\uff00\ufd00");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "i\000h\000?\000?\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: i?h?????: java.io.UnsupportedEncodingException: i?h?????");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?????" + "'", str3, "?????");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii("\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff\ufdff");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u3f3f\u3f3f\u3f3f\u3f3f\ufffd" + "'", str2, "\u3f3f\u3f3f\u3f3f\u3f3f\ufffd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?????????" + "'", str3, "?????????");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("h\000i\000!\000");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 0, (byte) 105, (byte) 0, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\000i\000!\000" + "'", str2, "h\000i\000!\000");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\377\375\377\375\377\375\377\375\000\000\000h\000\000\000i\377\375\377\375\377\375\377\375");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\ufffd\ufffd");
        java.lang.String str2 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky "33) test5499(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 105, (byte) 0, (byte) 104, (byte) 0, (byte) -3, (byte) -1, (byte) -3, (byte) -1 });
// flaky "18) test5499(org.apache.commons.codec.binary.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6900\u6800\ufdff\ufdff" + "'", str2, "\u6900\u6800\ufdff\ufdff");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        byte[] byteArray1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\346\245\250\356\276\277\353\267\257\353\276\275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.codec.binary.StringUtils.newString(byteArray1, "\u3f3f\u6869\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ???: java.io.UnsupportedEncodingException: ???");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -26, (byte) 0, (byte) -91, (byte) 0, (byte) -88, (byte) 0, (byte) -18, (byte) 0, (byte) -66, (byte) 0, (byte) -65, (byte) 0, (byte) -21, (byte) 0, (byte) -73, (byte) 0, (byte) -81, (byte) 0, (byte) -21, (byte) 0, (byte) -66, (byte) 0, (byte) -67, (byte) 0 });
    }
}
