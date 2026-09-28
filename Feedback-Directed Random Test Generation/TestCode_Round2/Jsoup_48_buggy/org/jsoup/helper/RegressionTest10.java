package org.jsoup.helper;

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
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("Content-Encoding");
        java.util.Map map7 = response1.headers();
        boolean boolean9 = response1.hasHeader("hi!==");
        org.jsoup.Connection.Base base11 = response1.removeHeader("hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base6 = response1.removeHeader("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        int int16 = response0.statusCode();
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!=", "Content-Encoding==");
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        boolean boolean11 = response0.hasHeader("hi!");
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Base base15 = response0.header("Content-Encoding=Content-Encoding===hi!==hi!", "Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!=", "");
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!===Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!===");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("Content-Encoding=");
        java.lang.String str17 = keyVal16.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.value("hi!===hi!=");
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        java.io.InputStream inputStream23 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal21.inputStream(inputStream23);
        java.io.InputStream inputStream25 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal21.inputStream(inputStream25);
        java.io.InputStream inputStream27 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = keyVal26.inputStream(inputStream27);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(keyVal28);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!=");
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        java.lang.String str18 = keyVal17.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=hi!=" + "'", str18, "hi!=hi!=");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        boolean boolean15 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        boolean boolean15 = response0.hasCookie("hi!=");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.Connection.Base base19 = response14.removeHeader("Content-Encoding");
        java.util.Map map20 = response14.headers();
        java.lang.String str21 = response14.contentType();
        boolean boolean23 = response14.hasCookie("Content-Encoding");
        java.lang.String str24 = response14.contentType();
        java.util.Map map25 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        boolean boolean28 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!=hi!=");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal3.inputStream(inputStream14);
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.key("hi!=Content-Encoding");
        java.lang.String str14 = keyVal3.key();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal3.inputStream(inputStream15);
        java.lang.String str17 = keyVal16.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=Content-Encoding" + "'", str14, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=Content-Encoding=hi!=" + "'", str17, "hi!=Content-Encoding=hi!=");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.lang.String str9 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.charset();
        boolean boolean17 = response0.hasHeader("hi!=Content-Encoding=");
        java.util.Map map18 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        org.jsoup.Connection.Base base22 = response19.removeHeader("Content-Encoding");
        java.util.Map map23 = response19.headers();
        java.util.Map map24 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        boolean boolean28 = response0.hasHeaderWithValue("Content-Encoding=", "Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding", "hi!==", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==" + "'", str4, "hi!==");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal7.inputStream();
        boolean boolean11 = keyVal7.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=", "Content-Encoding=Content-Encoding==");
        boolean boolean16 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base19 = response17.removeCookie("Content-Encoding");
        java.lang.String str21 = response17.header("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base24 = response22.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("hi!");
        java.util.Map map28 = response25.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Base base32 = response17.removeCookie("Content-Encoding");
        int int33 = response17.statusCode();
        int int34 = response17.statusCode();
        java.util.Map map35 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        boolean boolean39 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=");
        boolean boolean41 = response0.hasHeader("hi!==");
        boolean boolean43 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = response0.hasHeaderWithValue("", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str9, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        boolean boolean8 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        java.lang.String str16 = response9.statusMessage();
        org.jsoup.Connection.Method method17 = response9.method();
        org.jsoup.Connection.Base base20 = response9.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map21 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response0.charset();
        java.lang.String str24 = response0.statusMessage();
        java.util.Map map25 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!===");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.toString();
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding==", "hi!===hi!=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.key();
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str4, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str5, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!===hi!=" + "'", str6, "hi!===hi!=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str7, "Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasHeader("Content-Encoding=");
        java.lang.String str18 = response0.header("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        java.util.Map map16 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding==hi!===hi!=");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.charset();
        boolean boolean17 = response0.hasHeader("hi!=Content-Encoding=");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.header("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!===Content-Encoding=");
        org.jsoup.Connection.Method method21 = response0.method();
        boolean boolean23 = response0.hasHeader("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        int int24 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=");
        int int10 = response0.statusCode();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        boolean boolean8 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        java.lang.String str16 = response9.statusMessage();
        org.jsoup.Connection.Method method17 = response9.method();
        org.jsoup.Connection.Base base20 = response9.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map21 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response0.charset();
        java.lang.String str24 = response0.statusMessage();
        boolean boolean26 = response0.hasHeader("hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!===hi!=");
        java.lang.String str12 = keyVal9.key();
        boolean boolean13 = keyVal9.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!===hi!=" + "'", str12, "hi!===hi!=");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response8.method();
        java.lang.String str15 = response8.statusMessage();
        org.jsoup.Connection.Method method16 = response8.method();
        org.jsoup.Connection.Base base18 = response8.removeCookie("hi!=");
        java.util.Map map19 = response8.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        boolean boolean22 = response1.hasHeader("hi!=");
        org.jsoup.Connection.Base base25 = response1.header("Content-Encoding=Content-Encoding=", "Content-Encoding");
        org.jsoup.Connection.Method method26 = response1.method();
        int int27 = response1.statusCode();
        java.util.Map map28 = response1.cookies();
        java.lang.String str30 = response1.cookie("hi!==");
        int int31 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        java.util.Map map12 = response0.cookies();
        boolean boolean14 = response0.hasHeader("hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        java.util.Map map16 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        int int18 = response0.statusCode();
        java.net.URL uRL19 = response0.url();
        boolean boolean21 = response0.hasHeader("hi!===hi!==");
        org.jsoup.Connection.Method method22 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.contentType();
        boolean boolean16 = response0.hasCookie("hi!===Content-Encoding=");
        int int17 = response0.statusCode();
        org.jsoup.Connection.Method method18 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        java.util.Map map13 = response0.cookies();
        java.lang.String str15 = response0.header("");
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.String str18 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.jsoup.Connection.Base base21 = response0.header("hi!==hi!=hi!=", "Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        java.lang.String str12 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==hi!===hi!=");
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        java.lang.String str7 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding==hi!===hi!=" + "'", str7, "Content-Encoding==hi!===hi!=");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        org.jsoup.Connection.Base base9 = response5.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method10 = response5.method();
        org.jsoup.Connection.Method method11 = response5.method();
        org.jsoup.Connection.Method method12 = response5.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.Connection.Base base18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method19 = response13.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        boolean boolean26 = response0.hasCookie("hi!==hi!");
        java.lang.String str27 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeHeader("Content-Encoding=");
        boolean boolean19 = response0.hasHeader("hi!===Content-Encoding=");
        java.lang.String str20 = response0.charset();
        java.util.Map map21 = response0.cookies();
        org.jsoup.Connection.Method method22 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Base base5 = response1.removeHeader("hi!");
        java.util.Map map6 = response1.headers();
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Base base11 = response1.header("Content-Encoding=Content-Encoding=Content-Encoding=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset();
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Base base8 = response1.header("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=hi!", "hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=Content-Encoding=", "hi!==hi!=Content-Encoding");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=");
        java.util.Map map14 = response0.cookies();
        boolean boolean17 = response0.hasHeaderWithValue("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!==");
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        int int16 = response0.statusCode();
        java.lang.String str18 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        boolean boolean20 = response0.hasHeader("hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding==", "hi!===");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        boolean boolean6 = keyVal4.hasInputStream();
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("Content-Encoding=Content-Encoding==hi!=");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding" + "'", str10, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str9 = keyVal3.key();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str9, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===Content-Encoding=", "hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.charset();
        boolean boolean17 = response0.hasHeader("hi!=Content-Encoding=");
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str20 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str14 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        boolean boolean11 = keyVal10.hasInputStream();
        java.lang.String str12 = keyVal10.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        boolean boolean15 = keyVal10.hasInputStream();
        boolean boolean16 = keyVal10.hasInputStream();
        boolean boolean17 = keyVal10.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str12, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.header("");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Method method13 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!==");
        java.util.Map map12 = response0.cookies();
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        boolean boolean18 = response0.hasHeader("hi!===hi!=");
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        boolean boolean5 = keyVal3.hasInputStream();
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        boolean boolean10 = keyVal9.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding" + "'", str4, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding" + "'", str6, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.charset();
        java.lang.String str17 = response0.charset();
        org.jsoup.Connection.Method method18 = response0.method();
        java.lang.String str20 = response0.header("hi!===hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        java.lang.String str12 = response0.charset();
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.charset();
        int int12 = response0.statusCode();
        org.jsoup.Connection.Base base15 = response0.header("hi!===hi!=", "hi!=hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str19 = response16.header("Content-Encoding");
        org.jsoup.Connection.Base base21 = response16.removeHeader("hi!");
        java.lang.String str22 = response16.statusMessage();
        int int23 = response16.statusCode();
        java.lang.String str25 = response16.cookie("Content-Encoding");
        java.util.Map map26 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.key("Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base5 = response3.removeCookie("Content-Encoding");
        java.lang.String str7 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.util.Map map14 = response11.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str18 = response3.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response3.removeHeader("Content-Encoding=");
        java.util.Map map21 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        int int23 = response0.statusCode();
        org.jsoup.Connection.Method method24 = response0.method();
        java.lang.String str25 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base17 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.lang.String str18 = response0.contentType();
        org.jsoup.Connection.Base base20 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!==", "");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!=Content-Encoding");
        boolean boolean12 = response0.hasCookie("hi!==hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "hi!==hi!");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str14 = response0.contentType();
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        boolean boolean7 = keyVal4.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.key("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Method method17 = response0.method();
        java.net.URL uRL18 = response0.url();
        java.lang.String str19 = response0.statusMessage();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!==", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!==" + "'", str4, "hi!=hi!==");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=" + "'", str10, "hi!=");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        java.lang.String str8 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str8, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.header("hi!=Content-Encoding");
        java.lang.String str11 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.charset();
        int int13 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding==hi!===hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        int int13 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("hi!");
        org.jsoup.Connection.Base base18 = response14.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.Connection.Method method20 = response14.method();
        org.jsoup.Connection.Method method21 = response14.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.headers();
        java.lang.String str25 = response22.header("Content-Encoding");
        org.jsoup.Connection.Base base27 = response22.removeHeader("hi!");
        org.jsoup.Connection.Method method28 = response22.method();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str35 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray36 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==hi!");
        org.jsoup.Connection.Base base15 = response0.cookie("Content-Encoding=Content-Encoding", "hi!==hi!");
        boolean boolean17 = response0.hasCookie("hi!=Content-Encoding=");
        org.jsoup.Connection.Method method18 = response0.method();
        java.lang.String str20 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str7 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!" + "'", str3, "hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding===hi!==hi!");
        boolean boolean14 = response0.hasHeader("Content-Encoding=");
        org.jsoup.Connection.Base base17 = response0.cookie("Content-Encoding", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method18 = response0.method();
        boolean boolean21 = response0.hasHeaderWithValue("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==", "Content-Encoding=hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.Class<?> wildcardClass6 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasCookie("hi!===hi!==");
        boolean boolean13 = response0.hasHeader("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        int int9 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Method method10 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.cookie("", "Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!==");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=Content-Encoding=");
        int int13 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        boolean boolean11 = keyVal10.hasInputStream();
        java.lang.String str12 = keyVal10.value();
        boolean boolean13 = keyVal10.hasInputStream();
        java.lang.String str14 = keyVal10.toString();
        java.io.InputStream inputStream15 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str14, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.headers();
        java.lang.Class<?> wildcardClass9 = map8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=");
        boolean boolean14 = keyVal5.hasInputStream();
        java.lang.String str15 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str15, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL8 = response1.url();
        java.lang.String str10 = response1.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = response1.contentType();
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Base base14 = response1.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Base base18 = response1.cookie("Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding===hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        org.jsoup.Connection.Method method16 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        int int5 = response0.statusCode();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Method method17 = response0.method();
        java.net.URL uRL18 = response0.url();
        java.util.Map map19 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.lang.String str13 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal10.value("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal10.key("hi!===hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal10.value("hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding=Content-Encoding==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding=Content-Encoding==");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!===hi!==");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("hi!");
        java.util.Map map15 = response12.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        boolean boolean19 = response9.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean22 = response9.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Base base24 = response9.removeCookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.Connection.Base base30 = response25.removeHeader("hi!");
        org.jsoup.Connection.Method method31 = response25.method();
        java.lang.String str32 = response25.statusMessage();
        org.jsoup.Connection.Method method33 = response25.method();
        org.jsoup.Connection.Base base35 = response25.removeCookie("hi!=");
        java.util.Map map36 = response25.cookies();
        java.util.Map map37 = response25.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response8.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.statusMessage();
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("hi!=");
        java.lang.String str16 = keyVal15.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal15.key("hi!==hi!");
        java.io.InputStream inputStream19 = keyVal18.inputStream();
        java.lang.String str20 = keyVal18.value();
        java.io.InputStream inputStream21 = keyVal18.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=" + "'", str16, "hi!=");
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        org.jsoup.Connection.Base base4 = response1.removeHeader("Content-Encoding");
        java.util.Map map5 = response1.headers();
        java.util.Map map6 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("hi!=");
        java.lang.String str13 = response0.contentType();
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        boolean boolean13 = response0.hasCookie("hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.cookie("", "hi!==hi!=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        java.lang.String str9 = response5.cookie("Content-Encoding");
        java.lang.String str10 = response5.statusMessage();
        java.lang.String str11 = response5.charset();
        boolean boolean13 = response5.hasCookie("Content-Encoding");
        java.util.Map map14 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        java.net.URL uRL17 = response0.url();
        org.jsoup.Connection.Base base20 = response0.cookie("Content-Encoding=Content-Encoding=", "");
        java.lang.String str22 = response0.cookie("hi!=hi!=");
        java.net.URL uRL23 = response0.url();
        java.lang.String str25 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.header("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        org.jsoup.Connection.Base base20 = response17.removeHeader("Content-Encoding");
        java.util.Map map21 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.Connection.Base base24 = response0.removeHeader("hi!==hi!");
        java.lang.String str25 = response0.contentType();
        java.util.Map map26 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.cookie("Content-Encoding=Content-Encoding=");
        java.util.Map map9 = response1.headers();
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        java.lang.String str9 = response5.cookie("Content-Encoding");
        java.lang.String str10 = response5.statusMessage();
        java.lang.String str11 = response5.charset();
        boolean boolean13 = response5.hasCookie("Content-Encoding");
        java.util.Map map14 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding", "hi!=");
        java.lang.String str20 = response0.charset();
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Method method22 = response0.method();
        org.jsoup.Connection.Base base24 = response0.removeCookie("Content-Encoding=hi!");
        java.lang.String str26 = response0.header("hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.lang.String str8 = response0.cookie("hi!===hi!==");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("hi!");
        java.lang.String str13 = response9.cookie("Content-Encoding");
        java.lang.String str14 = response9.statusMessage();
        org.jsoup.Connection.Base base16 = response9.removeCookie("Content-Encoding");
        java.lang.String str17 = response9.contentType();
        java.lang.String str18 = response9.statusMessage();
        org.jsoup.Connection.Base base20 = response9.removeHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base23 = response21.removeHeader("hi!");
        java.util.Map map24 = response21.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str28 = response0.cookie("Content-Encoding===hi!==hi!");
        java.lang.String str30 = response0.cookie("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        java.lang.String str12 = keyVal11.key();
        boolean boolean13 = keyVal11.hasInputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.inputStream(inputStream14);
        java.io.InputStream inputStream16 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding" + "'", str12, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!=", "");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==hi!");
        java.net.URL uRL10 = response0.url();
        java.lang.String str11 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("hi!");
        org.jsoup.Connection.Base base10 = response6.removeCookie("Content-Encoding");
        int int11 = response6.statusCode();
        boolean boolean13 = response6.hasCookie("hi!=");
        java.util.Map map14 = response6.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        int int16 = response0.statusCode();
        boolean boolean18 = response0.hasCookie("hi!=Content-Encoding=");
        boolean boolean20 = response0.hasHeader("hi!===Content-Encoding=");
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.lang.String str9 = response0.statusMessage();
        boolean boolean12 = response0.hasHeaderWithValue("hi!=", "hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding=hi!", "Content-Encoding=hi!=");
        java.lang.String str17 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base20 = response15.removeHeader("hi!");
        boolean boolean22 = response15.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str24 = response15.header("hi!==hi!");
        java.util.Map map25 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.util.Map map27 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("hi!=Content-Encoding=hi!=", "hi!=hi!==hi!===hi!=");
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        boolean boolean7 = keyVal6.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str14 = response0.charset();
        java.lang.String str15 = response0.contentType();
        java.net.URL uRL16 = response0.url();
        boolean boolean18 = response0.hasHeader("hi!=hi!==hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.headers();
        java.lang.String str10 = response7.header("Content-Encoding");
        org.jsoup.Connection.Base base12 = response7.removeHeader("hi!");
        org.jsoup.Connection.Method method13 = response7.method();
        java.lang.String str14 = response7.statusMessage();
        org.jsoup.Connection.Method method15 = response7.method();
        org.jsoup.Connection.Base base17 = response7.removeCookie("hi!=");
        java.util.Map map18 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        boolean boolean21 = response0.hasHeader("hi!=");
        org.jsoup.Connection.Base base24 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding");
        org.jsoup.Connection.Method method25 = response0.method();
        int int26 = response0.statusCode();
        org.jsoup.Connection.Base base28 = response0.removeCookie("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base30 = response0.removeHeader("Content-Encoding==");
        java.util.Map map31 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=Content-Encoding===hi!", "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("Content-Encoding");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        boolean boolean7 = keyVal4.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        java.lang.String str15 = response0.header("hi!===hi!==");
        java.lang.String str16 = response0.statusMessage();
        java.lang.String str18 = response0.cookie("hi!===hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!", "hi!==hi!=Content-Encoding=Content-Encoding===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean10 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.util.Map map11 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=", "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!==");
        java.lang.String str19 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.util.Map map20 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base23 = response21.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str26 = response24.cookie("hi!");
        java.util.Map map27 = response24.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response21.cookie("Content-Encoding");
        org.jsoup.Connection.Method method31 = response21.method();
        boolean boolean34 = response21.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!==");
        java.util.Map map35 = response21.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.Connection.Base base39 = response0.cookie("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(base39);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        java.lang.String str17 = response0.header("hi!==hi!");
        org.jsoup.Connection.Base base19 = response0.removeCookie("hi!==hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "hi!==hi!=hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding");
        java.util.Map map12 = response0.headers();
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!==hi!=Content-Encoding=Content-Encoding===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        java.lang.String str6 = response0.charset();
        boolean boolean9 = response0.hasHeaderWithValue("hi!===hi!==", "hi!=hi!=");
        java.lang.String str11 = response0.header("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        java.lang.String str8 = keyVal6.value();
        java.lang.String str9 = keyVal6.value();
        java.io.InputStream inputStream10 = keyVal6.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("Content-Encoding==");
        java.lang.String str13 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal6.value("Content-Encoding=hi!=Content-Encoding=");
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.inputStream(inputStream16);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding===hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding===hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        boolean boolean13 = response0.hasHeaderWithValue("hi!=", "hi!===hi!=");
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.net.URL uRL3 = response0.url();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base6 = response4.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base9 = response4.cookie("Content-Encoding", "hi!");
        java.lang.String str10 = response4.charset();
        org.jsoup.Connection.Base base12 = response4.removeHeader("hi!=");
        java.lang.String str13 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.Connection.Base base19 = response14.removeHeader("hi!");
        org.jsoup.Connection.Method method20 = response14.method();
        java.lang.String str21 = response14.statusMessage();
        java.net.URL uRL22 = response14.url();
        boolean boolean25 = response14.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method26 = response14.method();
        org.jsoup.Connection.Base base28 = response14.removeCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.headers();
        org.jsoup.Connection.Base base32 = response29.removeHeader("Content-Encoding");
        java.util.Map map33 = response29.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        org.jsoup.Connection.Method method37 = response0.method();
        org.jsoup.Connection.Base base40 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding==");
        boolean boolean42 = response0.hasHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Method method43 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(method43);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        boolean boolean11 = keyVal10.hasInputStream();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.net.URL uRL3 = response0.url();
        java.lang.String str4 = response0.statusMessage();
        int int5 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Method method13 = response0.method();
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        boolean boolean12 = response0.hasCookie("hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("Content-Encoding=");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.header("hi!");
        java.lang.String str16 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("Content-Encoding");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        java.lang.String str18 = response15.header("Content-Encoding");
        int int19 = response15.statusCode();
        java.lang.String str21 = response15.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.headers();
        java.lang.String str25 = response22.header("Content-Encoding");
        org.jsoup.Connection.Base base27 = response22.removeHeader("hi!");
        org.jsoup.Connection.Method method28 = response22.method();
        java.lang.String str29 = response22.statusMessage();
        org.jsoup.Connection.Method method30 = response22.method();
        org.jsoup.Connection.Base base32 = response22.removeCookie("hi!=");
        java.util.Map map33 = response22.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str37 = response0.cookie("Content-Encoding=Content-Encoding");
        java.lang.String str39 = response0.header("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        int int5 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("hi!");
        java.lang.String str10 = response6.cookie("Content-Encoding");
        java.lang.String str11 = response6.statusMessage();
        java.lang.String str12 = response6.charset();
        boolean boolean14 = response6.hasCookie("Content-Encoding");
        java.util.Map map15 = response6.cookies();
        int int16 = response6.statusCode();
        java.lang.String str17 = response6.statusMessage();
        java.util.Map map18 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding=Content-Encoding");
        int int22 = response0.statusCode();
        org.jsoup.Connection.Base base24 = response0.removeHeader("hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal8.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.value("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!==", "hi!==");
        java.net.URL uRL17 = response0.url();
        boolean boolean20 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=hi!=");
        java.lang.String str21 = response0.contentType();
        java.lang.String str23 = response0.cookie("hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding==", "");
        java.lang.String str9 = response0.cookie("Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        java.lang.String str12 = response8.contentType();
        java.util.Map map13 = response8.cookies();
        java.lang.String str15 = response8.header("Content-Encoding");
        java.util.Map map16 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("hi!", "hi!");
        java.lang.String str22 = response18.charset();
        java.lang.String str24 = response18.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL25 = response18.url();
        org.jsoup.Connection.Base base28 = response18.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str30 = response18.header("hi!=");
        java.lang.String str31 = response18.statusMessage();
        java.lang.String str32 = response18.charset();
        java.lang.String str34 = response18.header("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.headers();
        org.jsoup.Connection.Base base38 = response35.removeHeader("Content-Encoding");
        java.util.Map map39 = response35.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        org.jsoup.Connection.Method method42 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(method42);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        boolean boolean11 = keyVal10.hasInputStream();
        java.lang.String str12 = keyVal10.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.inputStream(inputStream15);
        boolean boolean17 = keyVal16.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.key("hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str12, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        boolean boolean11 = keyVal10.hasInputStream();
        boolean boolean12 = keyVal10.hasInputStream();
        java.io.InputStream inputStream13 = keyVal10.inputStream();
        java.lang.String str14 = keyVal10.toString();
        java.io.InputStream inputStream15 = keyVal10.inputStream();
        java.lang.String str16 = keyVal10.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str14, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str16, "Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        java.lang.String str16 = response9.header("hi!");
        java.lang.String str17 = response9.statusMessage();
        java.util.Map map18 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        java.lang.String str23 = response20.header("Content-Encoding");
        org.jsoup.Connection.Base base25 = response20.removeHeader("hi!");
        org.jsoup.Connection.Method method26 = response20.method();
        java.lang.String str27 = response20.statusMessage();
        org.jsoup.Connection.Method method28 = response20.method();
        org.jsoup.Connection.Base base31 = response20.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map32 = response20.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        boolean boolean35 = response0.hasHeader("hi!===hi!=");
        org.jsoup.Connection.Base base38 = response0.cookie("Content-Encoding=hi!=hi!=", "");
        java.lang.String str40 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base42 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(base42);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.cookie("Content-Encoding=hi!=hi!=");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("hi!===hi!");
        java.lang.String str9 = keyVal8.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!===hi!=Content-Encoding" + "'", str9, "hi!===hi!=Content-Encoding");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        boolean boolean9 = keyVal8.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("Content-Encoding=Content-Encoding");
        boolean boolean12 = keyVal11.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!==hi!");
        java.lang.String str15 = keyVal14.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=Content-Encoding=hi!==hi!" + "'", str15, "Content-Encoding=Content-Encoding=hi!==hi!");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.cookie("Content-Encoding");
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Base base8 = response1.removeCookie("Content-Encoding");
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response1.header("hi!==");
        org.jsoup.Connection.Base base16 = response1.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base19 = response1.header("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base22 = response1.header("Content-Encoding=Content-Encoding==", "hi!==");
        java.net.URL uRL23 = response1.url();
        java.lang.String str25 = response1.cookie("hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("Content-Encoding=Content-Encoding==", "");
        java.lang.String str17 = response0.cookie("hi!");
        boolean boolean19 = response0.hasHeader("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        java.util.Map map12 = response0.cookies();
        boolean boolean15 = response0.hasHeaderWithValue("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "hi!=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.header("", "Content-Encoding=Content-Encoding===hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str15 = response0.charset();
        boolean boolean17 = response0.hasHeader("hi!=hi!==Content-Encoding=");
        boolean boolean19 = response0.hasHeader("Content-Encoding=hi!");
        org.jsoup.Connection.Base base22 = response0.header("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base24 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        boolean boolean6 = keyVal4.hasInputStream();
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        java.io.InputStream inputStream8 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.util.Map map3 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.statusMessage();
        java.util.Map map13 = response0.headers();
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.cookie("hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        boolean boolean12 = response0.hasHeaderWithValue("hi!==hi!", "hi!=");
        boolean boolean14 = response0.hasCookie("hi!=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str13 = response0.charset();
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base17 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.lang.String str9 = response0.header("hi!===Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal3.key("Content-Encoding=hi!==hi!");
        java.lang.String str15 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=hi!==hi!" + "'", str15, "Content-Encoding=hi!==hi!");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!=hi!=");
        boolean boolean14 = keyVal13.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass17 = keyVal13.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding==");
        java.lang.String str23 = response0.cookie("hi!==");
        java.lang.String str25 = response0.cookie("hi!=hi!=Content-Encoding=");
        java.lang.String str27 = response0.cookie("Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!", "hi!==hi!=Content-Encoding");
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        java.lang.String str13 = response9.contentType();
        int int14 = response9.statusCode();
        java.util.Map map15 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        java.lang.String str17 = response0.contentType();
        java.lang.String str18 = response0.contentType();
        java.lang.String str20 = response0.cookie("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base23 = response0.cookie("Content-Encoding", "Content-Encoding=");
        java.net.URL uRL24 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = keyVal7.inputStream();
        java.lang.String str10 = keyVal7.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal7.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=" + "'", str10, "Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.header("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!===Content-Encoding=");
        org.jsoup.Connection.Method method21 = response0.method();
        org.jsoup.Connection.Base base23 = response0.removeCookie("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.jsoup.Connection.Base base25 = response0.removeCookie("hi!===hi!==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str11 = response0.contentType();
        boolean boolean13 = response0.hasCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("hi!");
        java.lang.String str18 = response14.cookie("Content-Encoding");
        java.lang.String str19 = response14.statusMessage();
        org.jsoup.Connection.Base base21 = response14.removeCookie("Content-Encoding");
        java.net.URL uRL22 = response14.url();
        org.jsoup.Connection.Base base25 = response14.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base27 = response14.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str28 = response14.contentType();
        java.util.Map map29 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding=");
        java.lang.Class<?> wildcardClass12 = base11.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.header("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("hi!===Content-Encoding=");
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        boolean boolean14 = response0.hasCookie("hi!==hi!");
        java.lang.String str15 = response0.contentType();
        int int16 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasHeader("hi!===hi!==hi!=");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        int int13 = response9.statusCode();
        java.lang.String str15 = response9.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str19 = response16.header("Content-Encoding");
        org.jsoup.Connection.Base base21 = response16.removeHeader("hi!");
        org.jsoup.Connection.Method method22 = response16.method();
        java.lang.String str23 = response16.statusMessage();
        org.jsoup.Connection.Method method24 = response16.method();
        org.jsoup.Connection.Base base26 = response16.removeCookie("hi!=");
        java.util.Map map27 = response16.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response30.removeCookie("Content-Encoding");
        java.util.Map map33 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.Class<?> wildcardClass35 = map33.getClass();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        boolean boolean12 = response0.hasHeaderWithValue("hi!==hi!", "hi!=");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.cookie("hi!=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        boolean boolean15 = keyVal10.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding==", "");
        java.lang.String str9 = response0.cookie("Content-Encoding==hi!===hi!=");
        int int10 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        java.net.URL uRL8 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding===hi!==hi!");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("hi!");
        org.jsoup.Connection.Base base10 = response6.removeCookie("Content-Encoding");
        int int11 = response6.statusCode();
        boolean boolean13 = response6.hasCookie("hi!=");
        java.util.Map map14 = response6.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        int int16 = response0.statusCode();
        boolean boolean18 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method19 = response0.method();
        org.jsoup.Connection.Method method20 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean20 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "");
        java.lang.String str21 = response0.contentType();
        java.util.Map map22 = response0.cookies();
        org.jsoup.Connection.Base base25 = response0.cookie("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str14 = response0.contentType();
        java.net.URL uRL15 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        boolean boolean16 = response0.hasHeaderWithValue("hi!", "hi!=");
        org.jsoup.Connection.Base base19 = response0.header("hi!===hi!=", "hi!===hi!==");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base22 = response20.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base25 = response23.removeCookie("Content-Encoding");
        java.lang.String str27 = response23.header("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base30 = response28.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str33 = response31.cookie("hi!");
        java.util.Map map34 = response31.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.String str38 = response23.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base40 = response23.removeHeader("Content-Encoding=");
        java.util.Map map41 = response23.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.lang.String str44 = response0.contentType();
        java.util.Map map45 = response0.headers();
        java.util.Map map46 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.charset();
        boolean boolean7 = response0.hasHeaderWithValue("hi!=Content-Encoding", "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.charset();
        int int6 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str11 = response1.header("hi!=");
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Method method13 = response1.method();
        boolean boolean16 = response1.hasHeaderWithValue("hi!==", "Content-Encoding=");
        org.jsoup.Connection.Base base19 = response1.cookie("hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method20 = response1.method();
        java.lang.String str22 = response1.cookie("hi!===hi!=");
        java.lang.String str23 = response1.statusMessage();
        java.lang.String str24 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.lang.String str7 = keyVal3.key();
        java.lang.String str8 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = keyVal10.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("hi!===Content-Encoding=");
        java.lang.String str14 = keyVal10.toString();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.inputStream(inputStream15);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str7, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str11, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding=hi!===Content-Encoding=" + "'", str14, "Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response8.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!");
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding==");
        boolean boolean25 = response0.hasHeaderWithValue("hi!=hi!==", "hi!=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.contentType();
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!==hi!=hi!=");
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!=");
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!===hi!=");
        org.jsoup.Connection.Base base21 = response0.removeHeader("hi!===hi!");
        org.jsoup.Connection.Base base23 = response0.removeHeader("hi!=hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("hi!=");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.inputStream(inputStream12);
        java.lang.String str14 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        java.lang.String str9 = response5.cookie("Content-Encoding");
        java.lang.String str10 = response5.statusMessage();
        java.lang.String str11 = response5.charset();
        boolean boolean13 = response5.hasCookie("Content-Encoding");
        java.util.Map map14 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        org.jsoup.Connection.Base base18 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        boolean boolean20 = response0.hasCookie("hi!=Content-Encoding");
        java.util.Map map21 = response0.headers();
        boolean boolean24 = response0.hasHeaderWithValue("hi!=hi!=", "hi!");
        org.jsoup.Connection.Method method25 = response0.method();
        java.lang.String str26 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeHeader("Content-Encoding=");
        boolean boolean19 = response0.hasHeader("hi!===Content-Encoding=");
        java.lang.String str20 = response0.charset();
        java.util.Map map21 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.key("hi!===hi!=");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.inputStream(inputStream17);
        java.lang.String str19 = keyVal18.value();
        java.lang.String str20 = keyVal18.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str19, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str20, "Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base9 = response7.removeHeader("hi!");
        org.jsoup.Connection.Method method10 = response7.method();
        java.lang.String str12 = response7.header("Content-Encoding");
        java.util.Map map13 = response7.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        boolean boolean14 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding", "Content-Encoding");
        java.lang.String str19 = response0.header("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=Content-Encoding===hi!", "hi!=hi!=hi!==Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.value("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean8 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=hi!==hi!");
        java.lang.String str15 = response0.cookie("Content-Encoding=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response16.removeCookie("Content-Encoding");
        java.lang.String str20 = response16.header("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base23 = response21.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str26 = response24.cookie("hi!");
        java.util.Map map27 = response24.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.util.Map map30 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map32 = response31.headers();
        java.lang.String str34 = response31.header("Content-Encoding");
        org.jsoup.Connection.Base base36 = response31.removeHeader("hi!");
        org.jsoup.Connection.Method method37 = response31.method();
        java.lang.String str38 = response31.statusMessage();
        org.jsoup.Connection.Method method39 = response31.method();
        org.jsoup.Connection.Base base41 = response31.removeCookie("hi!=");
        java.lang.String str43 = response31.header("Content-Encoding=");
        java.util.Map map44 = response31.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        org.jsoup.Connection.Method method47 = response0.method();
        java.lang.String str48 = response0.contentType();
        java.lang.String str50 = response0.cookie("hi!");
        boolean boolean53 = response0.hasHeaderWithValue("hi!=hi!==hi!", "hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding");
        java.lang.String str9 = response0.charset();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=Content-Encoding");
        boolean boolean7 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==");
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        java.net.URL uRL20 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.header("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        org.jsoup.Connection.Base base20 = response17.removeHeader("Content-Encoding");
        java.util.Map map21 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.Connection.Method method23 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        boolean boolean7 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding==hi!=Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasHeader("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=hi!==hi!===hi!=", "hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        java.io.InputStream inputStream11 = keyVal5.inputStream();
        java.lang.String str12 = keyVal5.value();
        boolean boolean13 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.key("hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream13 = keyVal9.inputStream();
        java.io.InputStream inputStream14 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.header("hi!=Content-Encoding");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base5 = response3.removeCookie("Content-Encoding");
        java.lang.String str7 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.util.Map map14 = response11.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str18 = response3.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response3.removeHeader("Content-Encoding=");
        java.util.Map map21 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.net.URL uRL23 = response0.url();
        java.net.URL uRL24 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=hi!==hi!");
        boolean boolean3 = keyVal2.hasInputStream();
        boolean boolean4 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str8 = response0.cookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("hi!==");
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==");
        java.lang.String str14 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.cookie("hi!===Content-Encoding=", "hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!=");
        org.jsoup.Connection.Base base14 = response0.header("hi!===hi!==hi!==hi!=hi!=", "hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.String str7 = keyVal3.toString();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!=hi!==Content-Encoding=");
        boolean boolean17 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL18 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        org.jsoup.Connection.Base base15 = response0.header("Content-Encoding=hi!=hi!=", "Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        boolean boolean13 = keyVal12.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.value("hi!===hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("Content-Encoding=Content-Encoding==");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        boolean boolean4 = response0.hasCookie("hi!");
        java.util.Map map5 = response0.headers();
        boolean boolean8 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasHeader("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.charset();
        int int6 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base17 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.lang.String str19 = response0.header("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("Content-Encoding=hi!");
        java.io.InputStream inputStream14 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        java.lang.String str11 = keyVal5.key();
        java.lang.String str12 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("hi!===hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding==hi!===hi!=");
        java.lang.String str17 = keyVal16.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.value("hi!");
        boolean boolean20 = keyVal16.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding==hi!===hi!=" + "'", str17, "Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==");
        java.lang.String str13 = response0.contentType();
        boolean boolean15 = response0.hasHeader("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.lang.String str10 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal7.key("Content-Encoding=Content-Encoding===hi!");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.lang.String str15 = keyVal12.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=Content-Encoding===hi!" + "'", str15, "Content-Encoding=Content-Encoding===hi!");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!==");
        java.lang.String str19 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.lang.String str20 = response0.statusMessage();
        org.jsoup.Connection.Method method21 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map17 = response0.headers();
        java.util.Map map18 = response0.cookies();
        int int19 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method12 = response0.method();
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.header("hi!=hi!=", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.cookie("hi!=hi!===Content-Encoding=", "Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!=");
        boolean boolean11 = response0.hasHeader("hi!=");
        boolean boolean14 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding=");
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=hi!==hi!", "Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.header("hi!==Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasHeader("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base21 = response0.removeHeader("hi!=hi!=");
        int int22 = response0.statusCode();
        boolean boolean24 = response0.hasCookie("hi!=Content-Encoding");
        boolean boolean26 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
        java.util.Map map27 = response0.cookies();
        org.jsoup.Connection.Base base30 = response0.cookie("Content-Encoding=hi!=hi!=", "Content-Encoding=hi!");
        java.lang.String str31 = response0.charset();
        org.jsoup.Connection.Base base33 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        java.lang.String str34 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!=" + "'", str4, "hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        java.lang.String str16 = response0.statusMessage();
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean21 = response0.hasHeaderWithValue("Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        java.util.Map map22 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        boolean boolean15 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeHeader("Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=Content-Encoding===hi!", "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding=Content-Encoding=hi!===Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.key();
        java.lang.String str12 = keyVal10.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=" + "'", str12, "hi!=");
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.header("hi!", "Content-Encoding=Content-Encoding=");
        boolean boolean5 = response0.hasHeader("Content-Encoding==");
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding==");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.statusMessage();
        boolean boolean14 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.Connection.Base base17 = response0.header("hi!", "hi!");
        int int18 = response0.statusCode();
        boolean boolean20 = response0.hasHeader("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!===Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response16.removeHeader("hi!");
        java.util.Map map19 = response16.cookies();
        java.util.Map map20 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.headers();
        java.lang.String str24 = response21.header("Content-Encoding");
        org.jsoup.Connection.Base base26 = response21.removeHeader("hi!");
        org.jsoup.Connection.Method method27 = response21.method();
        java.lang.String str28 = response21.statusMessage();
        java.net.URL uRL29 = response21.url();
        java.util.Map map30 = response21.cookies();
        org.jsoup.Connection.Base base32 = response21.removeHeader("Content-Encoding=");
        boolean boolean35 = response21.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        boolean boolean38 = response21.hasHeaderWithValue("Content-Encoding=Content-Encoding", "");
        java.util.Map map39 = response21.headers();
        java.util.Map map40 = response21.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.util.Map map43 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        java.lang.String str6 = response0.contentType();
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding===hi!==hi!", "Content-Encoding===hi!==hi!");
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding==hi!=Content-Encoding");
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding==hi!===hi!=", "Content-Encoding=");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!", "hi!===hi!==Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!===Content-Encoding=");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.cookie("Content-Encoding=");
        int int8 = response0.statusCode();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base12 = response0.cookie("Content-Encoding=Content-Encoding===hi!==hi!", "");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=hi!=hi!==hi!");
        boolean boolean11 = response0.hasCookie("hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=");
        java.util.Map map11 = response0.headers();
        int int12 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.inputStream(inputStream12);
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal9.inputStream(inputStream14);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasHeader("hi!==hi!");
        java.lang.String str11 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=" + "'", str3, "Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!" + "'", str3, "hi!==hi!");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        boolean boolean10 = keyVal5.hasInputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("Content-Encoding==hi!===hi!==hi!=");
        java.io.InputStream inputStream15 = keyVal12.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        boolean boolean14 = response1.hasHeaderWithValue("hi!=hi!==hi!===hi!=", "hi!=hi!");
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("hi!=hi!", "Content-Encoding=hi!");
        org.jsoup.Connection.Base base17 = response0.cookie("hi!=Content-Encoding", "hi!=Content-Encoding=");
        org.jsoup.Connection.Base base19 = response0.removeCookie("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=hi!=");
        boolean boolean10 = response0.hasHeader("hi!");
        boolean boolean13 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=", "");
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!===");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        org.jsoup.Connection.Base base21 = response17.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base24 = response17.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base27 = response17.header("Content-Encoding=", "hi!=hi!=");
        java.lang.String str28 = response17.charset();
        org.jsoup.Connection.Base base31 = response17.header("hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=hi!=hi!=");
        int int32 = response17.statusCode();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response33.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str38 = response36.cookie("hi!");
        java.util.Map map39 = response36.headers();
        response33.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.lang.String str41 = response33.charset();
        java.lang.String str42 = response33.contentType();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base45 = response43.removeCookie("Content-Encoding");
        boolean boolean47 = response43.hasCookie("hi!");
        java.util.Map map48 = response43.headers();
        java.util.Map map49 = response43.cookies();
        response33.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str17 = response0.contentType();
        org.jsoup.Connection.Base base20 = response0.cookie("hi!=hi!==hi!===hi!=", "Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str22 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.lang.String str23 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        java.util.Map map12 = response0.cookies();
        java.net.URL uRL13 = response0.url();
        int int14 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        java.util.Map map11 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("hi!");
        java.lang.String str16 = response12.cookie("Content-Encoding");
        java.lang.String str18 = response12.header("hi!=");
        java.lang.String str20 = response12.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str22 = response12.cookie("hi!=");
        boolean boolean25 = response12.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.util.Map map26 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base30 = response0.cookie("hi!=hi!==hi!===hi!=", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base30);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        boolean boolean14 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.value();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.value("Content-Encoding=Content-Encoding");
        java.lang.String str13 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str13, "hi!=Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base5 = response0.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.inputStream(inputStream12);
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.inputStream(inputStream14);
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.inputStream(inputStream16);
        boolean boolean18 = keyVal13.hasInputStream();
        boolean boolean19 = keyVal13.hasInputStream();
        java.io.InputStream inputStream20 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal13.inputStream(inputStream20);
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal21.value("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.cookie("hi!===hi!=");
        boolean boolean13 = response0.hasHeader("hi!===Content-Encoding=");
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str18 = response0.cookie("hi!=Content-Encoding=");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=Content-Encoding==");
        java.lang.String str7 = keyVal6.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str7, "Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=", "hi!");
        java.util.Map map15 = response0.cookies();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method19 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=", "hi!");
        java.util.Map map15 = response0.cookies();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        boolean boolean11 = keyVal10.hasInputStream();
        java.lang.String str12 = keyVal10.toString();
        java.lang.String str13 = keyVal10.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str12, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str13, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding=", "hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3, "Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==");
        org.jsoup.Connection.Base base19 = response0.cookie("hi!==", "hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        java.lang.String str17 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=", "Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal6.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.inputStream(inputStream11);
        java.io.InputStream inputStream13 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str10, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.value("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        boolean boolean12 = response0.hasCookie("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        boolean boolean6 = keyVal4.hasInputStream();
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.inputStream(inputStream8);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!");
        boolean boolean15 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!==");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!==hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        java.net.URL uRL16 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        int int18 = response0.statusCode();
        org.jsoup.Connection.Base base20 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str22 = response0.header("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method23 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("hi!=Content-Encoding=hi!=", "hi!=hi!==hi!===hi!=");
        java.util.Map map14 = response0.headers();
        boolean boolean16 = response0.hasCookie("hi!===Content-Encoding==hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        int int4 = response0.statusCode();
        java.net.URL uRL5 = response0.url();
        boolean boolean8 = response0.hasHeaderWithValue("hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        java.lang.String str9 = response5.cookie("Content-Encoding");
        java.lang.String str10 = response5.statusMessage();
        java.lang.String str11 = response5.charset();
        boolean boolean13 = response5.hasCookie("Content-Encoding");
        java.util.Map map14 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        java.net.URL uRL17 = response0.url();
        java.util.Map map18 = response0.headers();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.Connection.Base base22 = response0.cookie("hi!===hi!==hi!==hi!=hi!=", "Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        org.jsoup.Connection.Base base9 = response5.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method10 = response5.method();
        org.jsoup.Connection.Method method11 = response5.method();
        org.jsoup.Connection.Method method12 = response5.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.Connection.Base base18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method19 = response13.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.net.URL uRL25 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(uRL25);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.inputStream(inputStream10);
        java.lang.String str12 = keyVal8.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.headers();
        org.jsoup.Connection.Base base10 = response7.removeHeader("Content-Encoding");
        int int11 = response7.statusCode();
        java.util.Map map12 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        java.util.Map map14 = response0.headers();
        java.lang.String str16 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===hi!=");
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Method method11 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.cookie("hi!=hi!=", "");
        java.lang.String str21 = response0.header("hi!=hi!==hi!===hi!=");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        java.lang.String str16 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        java.util.Map map20 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.util.Map map22 = response0.headers();
        java.util.Map map23 = response0.cookies();
        org.jsoup.Connection.Base base26 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=hi!==hi!");
        int int27 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        java.util.Map map16 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Method method20 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Base base8 = response0.header("hi!==hi!=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        java.lang.String str16 = response0.charset();
        java.lang.String str17 = response0.statusMessage();
        org.jsoup.Connection.Base base20 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding==hi!===hi!=");
        java.lang.String str21 = response0.charset();
        boolean boolean24 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding=Content-Encoding===");
        java.lang.Class<?> wildcardClass12 = base11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=", "Content-Encoding==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.charset();
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!==hi!");
        java.net.URL uRL19 = response0.url();
        java.lang.String str21 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding==");
        boolean boolean23 = response0.hasCookie("hi!=Content-Encoding=hi!=");
        org.jsoup.Connection.Base base25 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.headers();
        org.jsoup.Connection.Base base10 = response7.removeHeader("Content-Encoding");
        int int11 = response7.statusCode();
        java.util.Map map12 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        java.util.Map map14 = response0.headers();
        java.lang.String str16 = response0.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        org.jsoup.Connection.Base base22 = response17.removeHeader("hi!");
        org.jsoup.Connection.Base base24 = response17.removeHeader("hi!==");
        java.lang.String str25 = response17.charset();
        java.util.Map map26 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base29 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response30.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str35 = response33.cookie("hi!");
        java.util.Map map36 = response33.headers();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        java.lang.String str39 = response30.cookie("Content-Encoding");
        boolean boolean41 = response30.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str42 = response30.contentType();
        java.lang.String str43 = response30.charset();
        java.util.Map map44 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        java.util.Map map46 = response0.cookies();
        java.lang.String str47 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        boolean boolean12 = keyVal11.hasInputStream();
        boolean boolean13 = keyVal11.hasInputStream();
        java.io.InputStream inputStream14 = keyVal11.inputStream();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.inputStream(inputStream15);
        java.lang.String str17 = keyVal16.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!", "Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base20 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base22 = response0.removeCookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        int int5 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("hi!");
        java.lang.String str10 = response6.cookie("Content-Encoding");
        java.lang.String str11 = response6.statusMessage();
        java.lang.String str12 = response6.charset();
        boolean boolean14 = response6.hasCookie("Content-Encoding");
        java.util.Map map15 = response6.cookies();
        int int16 = response6.statusCode();
        java.lang.String str17 = response6.statusMessage();
        java.util.Map map18 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map22 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.headers();
        java.lang.String str26 = response23.header("Content-Encoding");
        int int27 = response23.statusCode();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str30 = response28.cookie("hi!");
        org.jsoup.Connection.Base base32 = response28.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method33 = response28.method();
        org.jsoup.Connection.Method method34 = response28.method();
        org.jsoup.Connection.Method method35 = response28.method();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map37 = response36.headers();
        java.lang.String str39 = response36.header("Content-Encoding");
        org.jsoup.Connection.Base base41 = response36.removeHeader("hi!");
        org.jsoup.Connection.Method method42 = response36.method();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map44 = response43.headers();
        response36.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        org.jsoup.Connection.Base base50 = response0.removeCookie("hi!=Content-Encoding");
        java.util.Map map51 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.net.URL uRL3 = response0.url();
        java.util.Map map4 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "hi!==hi!");
        java.lang.String str15 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.cookie("Content-Encoding==hi!===hi!=", "hi!=hi!=Content-Encoding=");
        java.lang.String str19 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base24 = response0.cookie("hi!===hi!=", "Content-Encoding=Content-Encoding=");
        java.lang.String str26 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean28 = response0.hasCookie("hi!===hi!==");
        org.jsoup.Connection.Base base31 = response0.cookie("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base33 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(base33);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        java.util.Map map13 = response0.headers();
        java.lang.String str14 = response0.charset();
        boolean boolean16 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        boolean boolean19 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding=", "hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        boolean boolean10 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.value("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str18 = response16.statusMessage();
        java.util.Map map19 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Base base23 = response0.header("hi!=Content-Encoding=", "hi!=");
        java.lang.String str25 = response0.header("hi!=Content-Encoding");
        java.lang.String str27 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str28 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!", "Content-Encoding=Content-Encoding==");
        boolean boolean12 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "hi!===hi!=");
        java.lang.String str13 = response0.contentType();
        java.util.Map map14 = response0.cookies();
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        java.lang.String str6 = response0.charset();
        boolean boolean9 = response0.hasHeaderWithValue("hi!===hi!==", "hi!=hi!=");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==hi!=");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Base base15 = response0.header("hi!===Content-Encoding==hi!==hi!", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        java.lang.String str16 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!=");
        boolean boolean11 = response0.hasHeader("hi!=");
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.contentType();
        java.net.URL uRL14 = response0.url();
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.String str7 = keyVal3.value();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        boolean boolean10 = keyVal3.hasInputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding");
        java.lang.String str17 = response0.header("hi!==hi!");
        org.jsoup.Connection.Base base19 = response0.removeCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base22 = response20.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str25 = response23.cookie("hi!");
        java.util.Map map26 = response23.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        boolean boolean30 = response20.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map31 = response20.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base36 = response33.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base38 = response33.removeCookie("Content-Encoding=Content-Encoding==");
        java.lang.String str39 = response33.contentType();
        java.util.Map map40 = response33.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.jsoup.Connection.Method method42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base43 = response0.method(method42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding==");
        java.lang.String str23 = response0.cookie("hi!==");
        java.lang.String str25 = response0.cookie("hi!=");
        boolean boolean27 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.lang.String str28 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document29 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeCookie("Content-Encoding");
        java.lang.String str9 = response5.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base12 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("hi!");
        java.util.Map map16 = response13.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str20 = response5.header("Content-Encoding=Content-Encoding");
        java.lang.String str21 = response5.charset();
        java.util.Map map22 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=", "hi!===hi!==Content-Encoding=Content-Encoding==");
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base16 = response0.removeCookie("Content-Encoding=hi!");
        java.lang.String str18 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        boolean boolean12 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        java.lang.String str9 = response5.cookie("Content-Encoding");
        java.lang.String str10 = response5.statusMessage();
        java.lang.String str11 = response5.charset();
        boolean boolean13 = response5.hasCookie("Content-Encoding");
        java.util.Map map14 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding", "hi!=");
        java.lang.String str20 = response0.charset();
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Method method22 = response0.method();
        org.jsoup.Connection.Base base24 = response0.removeCookie("Content-Encoding=hi!");
        boolean boolean26 = response0.hasHeader("Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!==");
        boolean boolean19 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL20 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        int int12 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        java.lang.String str17 = response13.statusMessage();
        boolean boolean19 = response13.hasCookie("hi!=");
        java.util.Map map20 = response13.headers();
        boolean boolean22 = response13.hasHeader("hi!==");
        java.util.Map map23 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!==");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!==hi!");
        java.util.Map map15 = response0.headers();
        boolean boolean17 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map map6 = response1.headers();
        org.jsoup.Connection.Method method7 = response1.method();
        int int8 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        boolean boolean13 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        org.jsoup.Connection.Base base17 = response14.removeHeader("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!===hi!=");
        java.lang.Class<?> wildcardClass16 = base15.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!");
        java.util.Map map11 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        int int14 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("hi!", "hi!");
        java.lang.String str19 = response15.charset();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str22 = response20.cookie("hi!");
        java.lang.String str24 = response20.cookie("Content-Encoding");
        java.lang.String str25 = response20.statusMessage();
        java.lang.String str26 = response20.charset();
        boolean boolean28 = response20.hasCookie("Content-Encoding");
        java.util.Map map29 = response20.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.Class<?> wildcardClass32 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==" + "'", str3, "Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        java.lang.String str16 = response0.statusMessage();
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean21 = response0.hasHeaderWithValue("Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding==", "hi!===hi!==Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!==hi!=Content-Encoding");
        boolean boolean16 = response0.hasCookie("hi!===hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        boolean boolean14 = response0.hasCookie("hi!==hi!=");
        int int15 = response0.statusCode();
        boolean boolean18 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding==");
        java.lang.String str23 = response0.cookie("hi!==");
        java.net.URL uRL24 = response0.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("hi!");
        org.jsoup.Connection.Base base29 = response25.removeCookie("Content-Encoding");
        int int30 = response25.statusCode();
        java.util.Map map31 = response25.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.util.Map map33 = response0.headers();
        java.lang.String str34 = response0.charset();
        int int35 = response0.statusCode();
        java.lang.String str36 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        java.lang.String str12 = response8.contentType();
        java.util.Map map13 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.lang.String str16 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=hi!", "hi!==");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.Connection.Base base15 = response10.removeHeader("hi!");
        org.jsoup.Connection.Method method16 = response10.method();
        java.lang.String str17 = response10.statusMessage();
        java.net.URL uRL18 = response10.url();
        java.util.Map map19 = response10.cookies();
        org.jsoup.Connection.Base base21 = response10.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base24 = response10.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean26 = response10.hasCookie("hi!");
        boolean boolean29 = response10.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str31 = response10.header("Content-Encoding=Content-Encoding==");
        java.lang.String str33 = response10.cookie("hi!==");
        java.lang.String str35 = response10.cookie("hi!=");
        boolean boolean37 = response10.hasCookie("hi!==hi!=Content-Encoding");
        java.util.Map map38 = response10.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.inputStream(inputStream12);
        java.io.InputStream inputStream14 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str17 = response0.header("Content-Encoding=");
        java.util.Map map18 = response0.cookies();
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str20 = response0.charset();
        java.lang.String str21 = response0.charset();
        java.lang.String str22 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("Content-Encoding=");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!");
        java.util.Map map11 = response0.cookies();
        boolean boolean14 = response0.hasHeaderWithValue("Content-Encoding=", "hi!===hi!==Content-Encoding=Content-Encoding==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=hi!=hi!=");
        boolean boolean5 = keyVal4.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.cookies();
        boolean boolean9 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding", "hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==hi!===hi!=");
        java.lang.String str6 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==hi!===hi!==hi!=" + "'", str6, "Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        int int7 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean14 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        java.lang.String str5 = response0.contentType();
        boolean boolean8 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=", "Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!===hi!=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!");
        java.lang.String str10 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.cookie("hi!==hi!");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!==hi!=Content-Encoding=", "");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        boolean boolean5 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        java.util.Map map4 = response0.cookies();
        java.net.URL uRL5 = response0.url();
        boolean boolean7 = response0.hasCookie("hi!===hi!");
        int int8 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding");
        boolean boolean10 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!");
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding==", "hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.cookie("", "hi!==hi!=Content-Encoding=Content-Encoding===hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding==hi!===hi!=");
        java.util.Map map11 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = keyVal2.inputStream();
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.key();
        java.io.InputStream inputStream12 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean12 = response0.hasHeader("Content-Encoding==hi!===hi!==hi!=");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!=hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding==hi!===hi!=");
        java.lang.String str6 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==hi!===hi!=" + "'", str6, "Content-Encoding==hi!===hi!=");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.value();
        java.lang.String str12 = keyVal9.key();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.inputStream(inputStream13);
        boolean boolean15 = keyVal14.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.value("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=" + "'", str12, "hi!=");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        int int16 = response0.statusCode();
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!=", "Content-Encoding==");
        java.lang.String str20 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = response0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        boolean boolean14 = response0.hasHeaderWithValue("hi!==Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        java.lang.String str13 = response9.statusMessage();
        org.jsoup.Connection.Base base16 = response9.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean18 = response9.hasCookie("Content-Encoding");
        boolean boolean20 = response9.hasHeader("hi!");
        java.util.Map map21 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.Connection.Base base25 = response0.header("hi!=hi!=Content-Encoding=", "Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base5 = response3.removeCookie("Content-Encoding");
        java.lang.String str7 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.util.Map map14 = response11.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str18 = response3.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response3.removeHeader("Content-Encoding=");
        java.util.Map map21 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        int int23 = response0.statusCode();
        org.jsoup.Connection.Method method24 = response0.method();
        org.jsoup.Connection.Method method25 = response0.method();
        java.util.Map map26 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!===Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding===hi!===Content-Encoding=" + "'", str3, "Content-Encoding===hi!===Content-Encoding=");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        boolean boolean14 = response0.hasHeader("Content-Encoding");
        boolean boolean17 = response0.hasHeaderWithValue("hi!==hi!=hi!=", "hi!==hi!=hi!=");
        java.lang.String str18 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!");
        java.lang.String str11 = response0.header("hi!==Content-Encoding");
        int int12 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal4.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str5, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.lang.String str13 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str10, "Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str13, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean11 = response0.hasHeaderWithValue("hi!=hi!==hi!", "hi!=hi!=Content-Encoding=");
        java.lang.String str13 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding=hi!", "Content-Encoding=Content-Encoding===hi!");
        boolean boolean13 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==hi!");
        org.jsoup.Connection.Base base15 = response0.cookie("Content-Encoding=Content-Encoding", "hi!==hi!");
        boolean boolean17 = response0.hasCookie("hi!=Content-Encoding=");
        org.jsoup.Connection.Base base20 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!");
        java.util.Map map21 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.lang.String str10 = response0.cookie("Content-Encoding");
        boolean boolean13 = response0.hasHeaderWithValue("hi!===hi!==", "Content-Encoding=Content-Encoding===hi!");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean19 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str21 = response0.header("Content-Encoding=Content-Encoding==");
        java.lang.String str23 = response0.cookie("hi!==");
        java.net.URL uRL24 = response0.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("hi!");
        org.jsoup.Connection.Base base29 = response25.removeCookie("Content-Encoding");
        int int30 = response25.statusCode();
        java.util.Map map31 = response25.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.util.Map map33 = response0.headers();
        boolean boolean35 = response0.hasCookie("Content-Encoding=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Base base10 = response0.header("hi!===hi!=Content-Encoding", "hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "Content-Encoding=");
        java.net.URL uRL9 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.contentType();
        java.util.Map map12 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding==hi!=Content-Encoding", "hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.value();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        java.lang.String str11 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        boolean boolean13 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        org.jsoup.Connection.Base base17 = response14.removeHeader("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.net.URL uRL20 = response0.url();
        int int21 = response0.statusCode();
        boolean boolean23 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        java.lang.String str27 = response24.header("Content-Encoding");
        org.jsoup.Connection.Base base29 = response24.removeHeader("Content-Encoding");
        java.util.Map map30 = response24.headers();
        java.lang.String str31 = response24.contentType();
        boolean boolean33 = response24.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method34 = response24.method();
        org.jsoup.Connection.Base base37 = response24.header("Content-Encoding=", "Content-Encoding=Content-Encoding==");
        boolean boolean40 = response24.hasHeaderWithValue("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base43 = response41.removeCookie("Content-Encoding");
        java.lang.String str45 = response41.header("");
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base48 = response46.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str51 = response49.cookie("hi!");
        java.util.Map map52 = response49.headers();
        response46.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        org.jsoup.Connection.Base base56 = response41.removeCookie("Content-Encoding");
        int int57 = response41.statusCode();
        int int58 = response41.statusCode();
        java.util.Map map59 = response41.headers();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        java.lang.String str63 = response0.cookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = response0.hasHeaderWithValue("", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(base43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(base48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!=" + "'", str63, "hi!=");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        boolean boolean16 = response0.hasHeaderWithValue("hi!", "hi!=");
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasHeader("Content-Encoding=");
        boolean boolean18 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.cookie("hi!===hi!==");
        org.jsoup.Connection.Base base24 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=hi!=");
        org.jsoup.Connection.Base base27 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.util.Map map28 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        boolean boolean13 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        org.jsoup.Connection.Base base17 = response14.removeHeader("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.net.URL uRL20 = response0.url();
        int int21 = response0.statusCode();
        boolean boolean23 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        java.lang.String str27 = response24.header("Content-Encoding");
        org.jsoup.Connection.Base base29 = response24.removeHeader("Content-Encoding");
        java.util.Map map30 = response24.headers();
        java.lang.String str31 = response24.contentType();
        boolean boolean33 = response24.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method34 = response24.method();
        org.jsoup.Connection.Base base37 = response24.header("Content-Encoding=", "Content-Encoding=Content-Encoding==");
        boolean boolean40 = response24.hasHeaderWithValue("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base43 = response41.removeCookie("Content-Encoding");
        java.lang.String str45 = response41.header("");
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base48 = response46.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str51 = response49.cookie("hi!");
        java.util.Map map52 = response49.headers();
        response46.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        org.jsoup.Connection.Base base56 = response41.removeCookie("Content-Encoding");
        int int57 = response41.statusCode();
        int int58 = response41.statusCode();
        java.util.Map map59 = response41.headers();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        java.lang.String str63 = response0.cookie("Content-Encoding");
        int int64 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document65 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(base43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(base48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!=" + "'", str63, "hi!=");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        boolean boolean13 = response0.hasCookie("hi!=");
        java.lang.String str15 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.header("hi!=hi!==hi!===hi!=", "hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass19 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=" + "'", str15, "hi!=");
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str17 = response0.header("Content-Encoding=");
        java.util.Map map18 = response0.cookies();
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str20 = response0.charset();
        java.lang.String str21 = response0.charset();
        org.jsoup.Connection.Base base23 = response0.removeCookie("Content-Encoding==hi!===hi!==hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        java.lang.String str8 = keyVal6.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        boolean boolean11 = keyVal10.hasInputStream();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.inputStream(inputStream12);
        java.io.InputStream inputStream14 = keyVal13.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.value();
        java.lang.String str8 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("Content-Encoding=Content-Encoding==");
        boolean boolean9 = keyVal8.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("Content-Encoding=hi!");
        java.lang.String str12 = keyVal11.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=hi!" + "'", str12, "Content-Encoding=hi!");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        boolean boolean8 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.cookie("Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding===hi!" + "'", str6, "Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        boolean boolean11 = response0.hasHeader("hi!");
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding===");
        boolean boolean16 = response0.hasCookie("Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.cookie("hi!===hi!=");
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=hi!", "Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.cookie("hi!=Content-Encoding");
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=hi!==hi!", "");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.net.URL uRL5 = response0.url();
        boolean boolean7 = response0.hasCookie("hi!=hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===hi!==");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=hi!==hi!", "Content-Encoding==hi!===hi!=");
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!");
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.cookie("Content-Encoding=");
        boolean boolean21 = response0.hasHeader("hi!=hi!==hi!");
        java.lang.String str22 = response0.charset();
        org.jsoup.Connection.Base base25 = response0.cookie("hi!===hi!", "");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.value("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("Content-Encoding=Content-Encoding==", "");
        org.jsoup.Connection.Base base18 = response0.header("Content-Encoding=hi!=hi!=", "hi!=hi!==hi!");
        org.jsoup.Connection.Base base21 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeCookie("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("hi!");
        java.util.Map map11 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.util.Map map14 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        java.lang.String str18 = response15.header("Content-Encoding");
        org.jsoup.Connection.Base base20 = response15.removeHeader("hi!");
        org.jsoup.Connection.Method method21 = response15.method();
        java.lang.String str22 = response15.statusMessage();
        java.net.URL uRL23 = response15.url();
        java.lang.String str25 = response15.header("");
        java.lang.String str26 = response15.statusMessage();
        java.lang.String str28 = response15.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base31 = response29.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str34 = response32.cookie("hi!");
        java.util.Map map35 = response32.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str38 = response29.cookie("Content-Encoding");
        org.jsoup.Connection.Base base41 = response29.header("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str42 = response29.statusMessage();
        boolean boolean45 = response29.hasHeaderWithValue("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base47 = response29.removeHeader("hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base50 = response48.removeCookie("Content-Encoding");
        java.util.Map map51 = response48.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        java.lang.String str56 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(base47);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        java.util.Map map15 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("Content-Encoding=Content-Encoding==");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!=hi!==hi!", "hi!==hi!=Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str16 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Method method12 = response0.method();
        boolean boolean15 = response0.hasHeaderWithValue("hi!==", "Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str19 = response0.statusMessage();
        boolean boolean21 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str18 = response0.cookie("hi!=Content-Encoding=");
        java.lang.String str20 = response0.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.util.Map map21 = response0.cookies();
        int int22 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.inputStream(inputStream12);
        java.io.InputStream inputStream14 = keyVal13.inputStream();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.inputStream(inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.value("hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=");
        boolean boolean14 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        java.util.Map map15 = response0.cookies();
        java.lang.String str17 = response0.header("hi!=hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.headers();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.lang.String str22 = response18.statusMessage();
        boolean boolean24 = response18.hasCookie("hi!=");
        java.util.Map map25 = response18.headers();
        boolean boolean27 = response18.hasHeader("hi!==");
        java.util.Map map28 = response18.headers();
        java.lang.String str30 = response18.header("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map32 = response31.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        int int34 = response18.statusCode();
        java.lang.String str35 = response18.contentType();
        java.util.Map map36 = response18.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!", "Content-Encoding=Content-Encoding==");
        java.lang.String str10 = response0.charset();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base14 = response0.cookie("hi!==hi!=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        int int15 = response0.statusCode();
        java.lang.String str17 = response0.header("Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.contentType();
        boolean boolean16 = response0.hasCookie("hi!===Content-Encoding=");
        java.util.Map map17 = response0.cookies();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!=");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal11.key("hi!=");
        java.lang.String str16 = keyVal15.key();
        java.lang.String str17 = keyVal15.value();
        java.lang.Class<?> wildcardClass18 = keyVal15.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=" + "'", str16, "hi!=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!==hi!");
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str18 = response0.charset();
        boolean boolean20 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

