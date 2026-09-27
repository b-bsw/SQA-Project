package org.apache.commons.codec.net;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.Object obj2 = quotedPrintableCodec0.decode((java.lang.Object) "");
        java.lang.String str4 = quotedPrintableCodec0.encode("UTF-8");
        java.lang.String str5 = quotedPrintableCodec0.getDefaultCharset();
        java.util.BitSet bitSet6 = null;
        java.util.BitSet bitSet7 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet7, byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray16);
        byte[] byteArray19 = quotedPrintableCodec0.encode(byteArray16);
        java.lang.String str20 = quotedPrintableCodec0.getDefaultCharset();
        java.util.BitSet bitSet21 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec22 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str24 = quotedPrintableCodec22.decode("hi!");
        java.lang.String str26 = quotedPrintableCodec22.encode("hi!");
        java.util.BitSet bitSet27 = null;
        java.util.BitSet bitSet28 = null;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray36 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet28, byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet27, byteArray36);
        byte[] byteArray39 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray36);
        byte[] byteArray40 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray36);
        byte[] byteArray41 = quotedPrintableCodec22.decode(byteArray40);
        java.lang.String str42 = quotedPrintableCodec22.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec44 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet45 = null;
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray53 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet45, byteArray52);
        byte[] byteArray54 = quotedPrintableCodec44.decode(byteArray52);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = quotedPrintableCodec44.decode(obj55);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec57 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str60 = quotedPrintableCodec57.decode("", "UTF-8");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec61 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec62 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str64 = quotedPrintableCodec62.decode("hi!");
        java.lang.String str66 = quotedPrintableCodec62.encode("hi!");
        java.util.BitSet bitSet67 = null;
        java.util.BitSet bitSet68 = null;
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray76 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet68, byteArray75);
        byte[] byteArray77 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray76);
        byte[] byteArray78 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet67, byteArray76);
        byte[] byteArray79 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray76);
        byte[] byteArray80 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray76);
        byte[] byteArray81 = quotedPrintableCodec62.decode(byteArray80);
        byte[] byteArray82 = quotedPrintableCodec61.decode(byteArray81);
        byte[] byteArray83 = quotedPrintableCodec57.encode(byteArray81);
        byte[] byteArray84 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray83);
        byte[] byteArray85 = quotedPrintableCodec44.encode(byteArray83);
        byte[] byteArray86 = quotedPrintableCodec22.decode(byteArray83);
        byte[] byteArray87 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet21, byteArray83);
        byte[] byteArray88 = quotedPrintableCodec0.decode(byteArray87);
        java.lang.String str90 = quotedPrintableCodec0.decode("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = quotedPrintableCodec0.decode("UTF-8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF-8" + "'", str20, "UTF-8");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF-8" + "'", str42, "UTF-8");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "UTF-8" + "'", str90, "UTF-8");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str3 = quotedPrintableCodec0.decode("", "UTF-8");
        java.lang.String str5 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str8 = quotedPrintableCodec0.decode("", "UTF-8");
        java.lang.String str9 = quotedPrintableCodec0.getDefaultCharset();
        java.lang.Class<?> wildcardClass10 = quotedPrintableCodec0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str5 = quotedPrintableCodec0.decode("hi!", "UTF-8");
        byte[] byteArray6 = null;
        byte[] byteArray7 = quotedPrintableCodec0.decode(byteArray6);
        java.lang.String str9 = quotedPrintableCodec0.decode("UTF-8");
        java.lang.String str10 = quotedPrintableCodec0.getDefaultCharset();
        java.lang.String str12 = quotedPrintableCodec0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str4 = quotedPrintableCodec0.encode("UTF-8");
        java.lang.String str5 = quotedPrintableCodec0.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec0.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec7 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str9 = quotedPrintableCodec7.decode("hi!");
        java.util.BitSet bitSet10 = null;
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray18 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet10, byteArray17);
        byte[] byteArray19 = quotedPrintableCodec7.encode(byteArray18);
        java.lang.String str21 = quotedPrintableCodec7.encode("UTF-8");
        java.lang.String str23 = quotedPrintableCodec7.decode("UTF-8");
        java.lang.String str26 = quotedPrintableCodec7.encode("hi!", "UTF-8");
        java.util.BitSet bitSet27 = null;
        java.util.BitSet bitSet28 = null;
        java.util.BitSet bitSet29 = null;
        java.util.BitSet bitSet30 = null;
        java.util.BitSet bitSet31 = null;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray39 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet31, byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet30, byteArray39);
        byte[] byteArray42 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet29, byteArray39);
        byte[] byteArray43 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet28, byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet27, byteArray43);
        byte[] byteArray45 = quotedPrintableCodec7.encode(byteArray44);
        java.lang.Object obj46 = quotedPrintableCodec0.encode((java.lang.Object) byteArray44);
        byte[] byteArray47 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-8" + "'", str23, "UTF-8");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray11 = quotedPrintableCodec1.decode(byteArray9);
        java.lang.String str12 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str13 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str16 = quotedPrintableCodec1.decode("UTF-8", "UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: ");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-8" + "'", str16, "UTF-8");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str4 = quotedPrintableCodec0.encode("hi!");
        java.util.BitSet bitSet5 = null;
        java.util.BitSet bitSet6 = null;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet5, byteArray14);
        byte[] byteArray17 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray19 = quotedPrintableCodec0.decode(byteArray18);
        java.lang.String str21 = quotedPrintableCodec0.decode("UTF-8");
        java.lang.String str23 = quotedPrintableCodec0.encode("");
        java.lang.String str25 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str26 = quotedPrintableCodec0.getDefaultCharset();
        java.lang.String str28 = quotedPrintableCodec0.encode("UTF-8");
        java.util.BitSet bitSet29 = null;
        java.util.BitSet bitSet30 = null;
        java.util.BitSet bitSet31 = null;
        java.util.BitSet bitSet32 = null;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray40 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet32, byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray40);
        byte[] byteArray42 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet31, byteArray40);
        byte[] byteArray43 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray40);
        byte[] byteArray44 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray40);
        byte[] byteArray45 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet30, byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet29, byteArray46);
        byte[] byteArray48 = quotedPrintableCodec0.decode(byteArray46);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = quotedPrintableCodec0.encode(obj49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-8" + "'", str26, "UTF-8");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTF-8" + "'", str28, "UTF-8");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str5 = quotedPrintableCodec0.decode("hi!", "UTF-8");
        java.lang.String str6 = quotedPrintableCodec0.getDefaultCharset();
        java.lang.String str8 = quotedPrintableCodec0.decode("");
        java.lang.String str10 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str12 = quotedPrintableCodec0.decode("UTF-8");
        java.lang.String str14 = quotedPrintableCodec0.encode("");
        java.lang.String str16 = quotedPrintableCodec0.decode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray14);
        java.lang.Class<?> wildcardClass16 = byteArray14.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 61, (byte) 51, (byte) 68, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 51, (byte) 68, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.decode("hi!");
        java.lang.String str4 = quotedPrintableCodec0.encode("hi!");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec6 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet7 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet7, byteArray14);
        byte[] byteArray16 = quotedPrintableCodec6.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec0.encode(byteArray14);
        java.lang.String str19 = quotedPrintableCodec0.decode("");
        java.util.BitSet bitSet20 = null;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet20, byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = quotedPrintableCodec0.decode(byteArray28);
        java.lang.String str32 = quotedPrintableCodec0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 61, (byte) 70, (byte) 70, (byte) 100, (byte) 61, (byte) 48, (byte) 48, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }
}

