package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!===hi!==", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.statusMessage();
        java.lang.String str18 = response0.header("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        org.jsoup.Connection.Method method18 = response0.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base22 = response19.cookie("hi!", "hi!");
        java.lang.String str23 = response19.charset();
        java.util.Map map24 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Method method26 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean10 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.header("hi!===hi!==hi!=", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!");
        java.lang.String str8 = response0.header("Content-Encoding==");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map13 = response0.cookies();
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding===hi!==hi!", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.lang.String str18 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base20 = response0.removeHeader("Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.key();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.inputStream(inputStream8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        java.lang.String str12 = keyVal9.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.inputStream(inputStream13);
        java.lang.String str15 = keyVal14.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=" + "'", str12, "hi!=");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!==hi!=");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("hi!=");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.statusMessage();
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        java.lang.String str8 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("hi!=hi!=");
        org.jsoup.Connection.Base base17 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding=");
        java.lang.String str8 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=" + "'", str8, "Content-Encoding=");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        org.jsoup.Connection.Base base19 = response0.removeCookie("Content-Encoding==hi!===hi!==hi!=");
        boolean boolean21 = response0.hasCookie("Content-Encoding=Content-Encoding==hi!=");
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        java.lang.String str13 = response9.contentType();
        java.util.Map map14 = response9.cookies();
        java.lang.String str16 = response9.header("Content-Encoding");
        java.util.Map map17 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        boolean boolean20 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str21 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.lang.String str13 = response0.charset();
        java.lang.String str15 = response0.header("hi!=hi!=");
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
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("Content-Encoding=hi!");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.inputStream(inputStream14);
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
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass17 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
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
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("hi!==");
        java.lang.String str6 = response0.cookie("Content-Encoding=hi!");
        int int7 = response0.statusCode();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding==hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean10 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.header("hi!==", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.headers();
        org.jsoup.Connection.Base base15 = response12.removeHeader("Content-Encoding");
        java.lang.String str17 = response12.header("hi!=");
        int int18 = response12.statusCode();
        java.lang.String str19 = response12.statusMessage();
        java.net.URL uRL20 = response12.url();
        java.util.Map map21 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding");
        int int20 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.key();
        java.lang.String str8 = keyVal3.toString();
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        java.lang.String str11 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("");
        java.io.InputStream inputStream14 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=" + "'", str11, "hi!=");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        int int12 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!===hi!=");
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.cookie("hi!");
        java.net.URL uRL17 = response0.url();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.headers();
        org.jsoup.Connection.Base base21 = response18.removeHeader("Content-Encoding");
        java.util.Map map22 = response18.headers();
        org.jsoup.Connection.Base base24 = response18.removeCookie("Content-Encoding");
        java.lang.String str25 = response18.statusMessage();
        java.lang.String str26 = response18.statusMessage();
        java.util.Map map27 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.Class<?> wildcardClass29 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("Content-Encoding");
        java.lang.String str15 = response11.cookie("Content-Encoding=Content-Encoding");
        java.util.Map map16 = response11.cookies();
        int int17 = response11.statusCode();
        java.util.Map map18 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.cookie("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean10 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding==");
        java.lang.String str17 = response0.header("");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
        java.lang.String str12 = response0.contentType();
        int int13 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.header("hi!=hi!==hi!===hi!=", "Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        java.util.Map map16 = response0.cookies();
        java.util.Map map17 = response0.cookies();
        java.lang.String str19 = response0.cookie("hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=Content-Encoding");
        java.lang.String str17 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Base base20 = response0.header("hi!==hi!=Content-Encoding", "hi!=hi!");
        org.jsoup.Connection.Base base23 = response0.header("hi!==Content-Encoding", "Content-Encoding=Content-Encoding===hi!");
        java.lang.String str24 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        boolean boolean8 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!", "hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        boolean boolean17 = keyVal10.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal10.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal10.value("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
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
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        java.lang.String str8 = keyVal6.value();
        java.lang.String str9 = keyVal6.value();
        java.io.InputStream inputStream10 = keyVal6.inputStream();
        java.lang.String str11 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.key("hi!=Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal6.key("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        org.jsoup.Connection.Base base11 = response1.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        java.lang.String str16 = response0.charset();
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=Content-Encoding=");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=Content-Encoding");
        java.lang.String str12 = keyVal11.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!==" + "'", str12, "hi!==");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding=hi!==hi!");
        boolean boolean9 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding===hi!==hi!");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        boolean boolean16 = response0.hasHeaderWithValue("hi!=", "hi!===hi!=");
        boolean boolean18 = response0.hasHeader("Content-Encoding=hi!");
        int int19 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str8 = response0.cookie("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.inputStream(inputStream11);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        boolean boolean12 = response0.hasHeader("hi!=hi!==hi!===hi!=");
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.header("hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str14 = response0.cookie("Content-Encoding=Content-Encoding===hi!==hi!");
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        java.lang.String str22 = response0.contentType();
        java.util.Map map23 = response0.cookies();
        org.jsoup.Connection.Method method24 = response0.method();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!===Content-Encoding=");
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str18 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!===Content-Encoding=", "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=", "Content-Encoding=Content-Encoding==");
        boolean boolean15 = response0.hasHeader("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        java.lang.String str13 = keyVal8.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal8.value("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=" + "'", str13, "hi!=");
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        int int15 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        java.lang.String str9 = response1.charset();
        java.lang.String str11 = response1.cookie("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.key("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
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
        java.lang.String str13 = keyVal11.toString();
        boolean boolean14 = keyVal11.hasInputStream();
        java.lang.String str15 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding" + "'", str12, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13, "Content-Encoding=");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=" + "'", str15, "Content-Encoding=");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
        java.lang.String str17 = keyVal10.toString();
        java.lang.String str18 = keyVal10.value();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str17, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!===Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base24 = response0.removeCookie("hi!=Content-Encoding");
        java.lang.String str25 = response0.contentType();
        org.jsoup.Connection.Base base27 = response0.removeHeader("hi!=Content-Encoding=");
        java.lang.String str28 = response0.charset();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!==hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.key("Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method23 = response0.method();
        org.jsoup.Connection.Base base25 = response0.removeCookie("hi!=hi!=");
        java.net.URL uRL26 = response0.url();
        java.lang.String str28 = response0.cookie("Content-Encoding==");
        java.util.Map map29 = response0.headers();
        java.lang.String str31 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!=" + "'", str3, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        java.io.InputStream inputStream17 = keyVal5.inputStream();
        boolean boolean18 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal5.key("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal20.value("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding==", "hi!===hi!=");
        org.jsoup.Connection.Base base19 = response0.header("hi!", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        boolean boolean21 = response0.hasCookie("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===Content-Encoding=", "Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "Content-Encoding==hi!===hi!=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        java.lang.String str14 = keyVal13.value();
        java.lang.String str15 = keyVal13.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=" + "'", str14, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=hi!==Content-Encoding=" + "'", str15, "hi!=hi!==Content-Encoding=");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        boolean boolean21 = response0.hasCookie("hi!==");
        java.util.Map map22 = response0.headers();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!", "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        org.jsoup.Connection.Base base23 = response0.cookie("hi!==hi!", "hi!=Content-Encoding");
        java.util.Map map24 = response0.cookies();
        java.lang.String str26 = response0.cookie("hi!=hi!=hi!==hi!");
        java.lang.String str27 = response0.contentType();
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
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        org.jsoup.Connection.Method method18 = response0.method();
        java.lang.String str20 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===Content-Encoding=");
        org.jsoup.Connection.Method method10 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Content-Encoding=hi!=hi!=");
        int int7 = response0.statusCode();
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str14 = response10.statusMessage();
        org.jsoup.Connection.Base base17 = response10.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean19 = response10.hasCookie("Content-Encoding");
        boolean boolean21 = response10.hasHeader("hi!");
        java.util.Map map22 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.String str24 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!", "Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding" + "'", str4, "Content-Encoding");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.cookie("Content-Encoding=hi!=hi!=");
        java.lang.String str16 = response0.cookie("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("hi!=hi!==hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("hi!", "hi!");
        java.lang.String str19 = response15.charset();
        java.lang.String str21 = response15.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL22 = response15.url();
        org.jsoup.Connection.Base base25 = response15.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str27 = response15.header("hi!=");
        java.lang.String str28 = response15.statusMessage();
        org.jsoup.Connection.Base base30 = response15.removeHeader("Content-Encoding");
        java.lang.String str32 = response15.header("hi!==hi!");
        org.jsoup.Connection.Base base34 = response15.removeCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base37 = response35.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str40 = response38.cookie("hi!");
        java.util.Map map41 = response38.headers();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        boolean boolean45 = response35.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map46 = response35.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        java.util.Map map49 = response0.cookies();
        boolean boolean51 = response0.hasCookie("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        java.lang.String str19 = response0.charset();
        boolean boolean21 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding==");
        java.lang.String str12 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!===hi!==hi!==hi!=hi!=", "Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.inputStream(inputStream15);
        java.lang.String str17 = keyVal12.value();
        java.lang.String str18 = keyVal12.toString();
        java.io.InputStream inputStream19 = keyVal12.inputStream();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=" + "'", str18, "hi!=");
        org.junit.Assert.assertNull(inputStream19);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!", "Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=");
        org.jsoup.Connection.Base base17 = response0.removeHeader("Content-Encoding=hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        java.util.Map map5 = response0.cookies();
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.header("hi!===hi!=", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!==hi!==hi!=hi!=", "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        java.lang.String str28 = response0.header("Content-Encoding=Content-Encoding===hi!");
        java.util.Map map29 = response0.cookies();
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "hi!==hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        java.lang.String str17 = keyVal10.toString();
        java.lang.String str18 = keyVal10.key();
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal10.inputStream(inputStream19);
        java.lang.String str21 = keyVal10.value();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str17, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str18, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.util.Map map4 = response1.headers();
        int int5 = response1.statusCode();
        java.util.Map map6 = response1.cookies();
        boolean boolean9 = response1.hasHeaderWithValue("hi!=Content-Encoding", "hi!==hi!");
        org.jsoup.Connection.Base base12 = response1.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=");
        java.lang.String str9 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.key("hi!==");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!==" + "'", str9, "hi!==");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal7.inputStream();
        java.lang.Class<?> wildcardClass11 = keyVal7.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        java.lang.String str19 = response0.charset();
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.url(uRL20);
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
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!===Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        java.lang.String str14 = response0.cookie("Content-Encoding=hi!");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        org.jsoup.Connection.Base base28 = response0.cookie("hi!=hi!=", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base30 = response0.removeHeader("Content-Encoding=hi!=");
        org.jsoup.Connection.Base base32 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(base32);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Base base5 = response1.removeHeader("hi!");
        java.util.Map map6 = response1.headers();
        java.util.Map map7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        java.lang.String str17 = keyVal10.toString();
        java.io.InputStream inputStream18 = keyVal10.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal10.value("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str21 = keyVal10.value();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str17, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding" + "'", str21, "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding=");
        java.lang.String str17 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str17, "Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("hi!=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!==hi!==hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!==hi!==hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response13.removeCookie("Content-Encoding");
        java.lang.String str17 = response13.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("hi!");
        java.util.Map map24 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str28 = response13.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base30 = response13.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method31 = response13.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response32.cookie("hi!", "hi!");
        java.lang.String str36 = response32.charset();
        java.util.Map map37 = response32.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.jsoup.Connection.Base base42 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!==");
        java.net.URL uRL43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base44 = response0.url(uRL43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(base42);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding");
        java.lang.String str9 = keyVal6.value();
        java.lang.String str10 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=Content-Encoding" + "'", str9, "hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!===hi!=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal4.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding==hi!===hi!=" + "'", str5, "Content-Encoding==hi!===hi!=");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
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
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        int int9 = response0.statusCode();
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.util.Map map8 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding==", "hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        boolean boolean9 = keyVal8.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.key("Content-Encoding=Content-Encoding");
        java.lang.String str12 = keyVal11.key();
        java.lang.String str13 = keyVal11.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str12, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str13, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str12 = response0.header("hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response13.removeCookie("Content-Encoding");
        java.lang.String str17 = response13.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("hi!");
        java.util.Map map24 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str28 = response13.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base30 = response13.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method31 = response13.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response32.cookie("hi!", "hi!");
        java.lang.String str36 = response32.charset();
        java.util.Map map37 = response32.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        boolean boolean42 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=Content-Encoding");
        java.io.InputStream inputStream13 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.cookies();
        int int13 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.lang.String str18 = response14.contentType();
        org.jsoup.Connection.Base base21 = response14.header("Content-Encoding", "");
        java.util.Map map22 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Base base26 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.net.URL uRL27 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = uRL27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(uRL27);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=", "hi!==hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.charset();
        int int12 = response0.statusCode();
        java.net.URL uRL13 = response0.url();
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=hi!=", "hi!=hi!=hi!==Content-Encoding");
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("Content-Encoding=hi!==hi!");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=Content-Encoding");
        java.lang.String str8 = keyVal5.value();
        java.lang.String str9 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=Content-Encoding" + "'", str8, "hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding==hi!=Content-Encoding" + "'", str9, "Content-Encoding==hi!=Content-Encoding");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        java.util.Map map5 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str15 = response0.header("hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!===hi!=");
        java.lang.String str8 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        java.net.URL uRL16 = response0.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.lang.String str21 = response17.contentType();
        int int22 = response17.statusCode();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str25 = response23.cookie("hi!");
        java.lang.String str27 = response23.cookie("Content-Encoding");
        java.lang.String str28 = response23.statusMessage();
        java.lang.String str29 = response23.charset();
        boolean boolean31 = response23.hasCookie("Content-Encoding");
        java.util.Map map32 = response23.cookies();
        int int33 = response23.statusCode();
        java.lang.String str34 = response23.statusMessage();
        java.util.Map map35 = response23.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.Connection.Base base38 = response17.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map39 = response17.headers();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map41 = response40.headers();
        java.lang.String str43 = response40.header("Content-Encoding");
        int int44 = response40.statusCode();
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str47 = response45.cookie("hi!");
        org.jsoup.Connection.Base base49 = response45.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method50 = response45.method();
        org.jsoup.Connection.Method method51 = response45.method();
        org.jsoup.Connection.Method method52 = response45.method();
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map54 = response53.headers();
        java.lang.String str56 = response53.header("Content-Encoding");
        org.jsoup.Connection.Base base58 = response53.removeHeader("hi!");
        org.jsoup.Connection.Method method59 = response53.method();
        org.jsoup.helper.HttpConnection.Response response60 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map61 = response60.headers();
        response53.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        response45.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        response40.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNull(method52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(base58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str6, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=Content-Encoding=hi!=");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.cookie("Content-Encoding", "hi!");
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Base base9 = response1.removeHeader("hi!=");
        boolean boolean11 = response1.hasCookie("Content-Encoding=");
        boolean boolean13 = response1.hasCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response14.removeCookie("Content-Encoding");
        java.lang.String str18 = response14.header("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response19.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("hi!");
        java.util.Map map25 = response22.headers();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.lang.String str29 = response14.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base31 = response14.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method32 = response14.method();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base36 = response33.cookie("hi!", "hi!");
        java.lang.String str37 = response33.charset();
        java.util.Map map38 = response33.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.jsoup.Connection.Base base43 = response1.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!==");
        java.net.URL uRL44 = response1.url();
        org.jsoup.Connection.Base base47 = response1.cookie("hi!==hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response48 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(base43);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNotNull(base47);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        boolean boolean16 = response0.hasHeader("hi!=Content-Encoding");
        java.lang.String str17 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Base base12 = response9.removeHeader("Content-Encoding");
        java.util.Map map13 = response9.headers();
        org.jsoup.Connection.Base base15 = response9.removeCookie("Content-Encoding");
        java.lang.String str16 = response9.statusMessage();
        java.lang.String str17 = response9.statusMessage();
        java.util.Map map18 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        boolean boolean16 = response0.hasHeader("hi!=hi!=");
        java.util.Map map17 = response0.headers();
        java.lang.String str19 = response0.header("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        int int13 = response0.statusCode();
        boolean boolean15 = response0.hasHeader("hi!===hi!=");
        org.jsoup.Connection.Base base17 = response0.removeCookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean10 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!===hi!");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding=");
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.net.URL uRL3 = response0.url();
        java.lang.String str5 = response0.header("hi!===hi!==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!===Content-Encoding=", "hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
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
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Base base20 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!");
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Method method13 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        boolean boolean16 = keyVal15.hasInputStream();
        boolean boolean17 = keyVal15.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal15.key("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass22 = keyVal21.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        org.jsoup.Connection.Method method36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base37 = response0.method(method36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=hi!==hi!");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=hi!==hi!" + "'", str4, "Content-Encoding=hi!==hi!");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        java.util.Map map14 = response0.cookies();
        java.lang.String str15 = response0.contentType();
        boolean boolean18 = response0.hasHeaderWithValue("Content-Encoding=hi!==hi!", "hi!=hi!==hi!");
        java.lang.String str19 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=hi!==hi!===hi!=", "Content-Encoding==");
        boolean boolean18 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        java.io.InputStream inputStream9 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!===Content-Encoding=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.header("hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        java.lang.String str6 = response0.contentType();
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding===hi!==hi!", "Content-Encoding===hi!==hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!=");
        boolean boolean11 = response0.hasHeader("hi!=");
        boolean boolean14 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str16 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.cookie("Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        java.util.Map map10 = response1.cookies();
        org.jsoup.Connection.Base base12 = response1.removeHeader("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!=", "");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==hi!");
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.headers();
        org.jsoup.Connection.Base base15 = response12.removeHeader("Content-Encoding");
        java.util.Map map16 = response12.headers();
        boolean boolean18 = response12.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        org.jsoup.Connection.Base base22 = response19.removeHeader("Content-Encoding");
        int int23 = response19.statusCode();
        java.util.Map map24 = response19.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.util.Map map26 = response12.headers();
        java.lang.String str28 = response12.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.headers();
        java.lang.String str32 = response29.header("Content-Encoding");
        org.jsoup.Connection.Base base34 = response29.removeHeader("hi!");
        org.jsoup.Connection.Base base36 = response29.removeHeader("hi!==");
        java.lang.String str37 = response29.charset();
        java.util.Map map38 = response29.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        java.util.Map map6 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding=", "hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!==Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding==", "Content-Encoding=hi!=hi!=");
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!==");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.cookie("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        java.lang.String str21 = response0.statusMessage();
        org.jsoup.Connection.Base base24 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Base base27 = response0.cookie("hi!=hi!=", "hi!=");
        java.lang.String str28 = response0.contentType();
        int int29 = response0.statusCode();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        boolean boolean16 = keyVal15.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!=hi!=");
        boolean boolean11 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Base base5 = response1.removeHeader("hi!");
        java.util.Map map6 = response1.headers();
        java.util.Map map7 = response1.headers();
        int int8 = response1.statusCode();
        java.lang.String str10 = response1.cookie("hi!===Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
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
        org.jsoup.Connection.Base base28 = response0.cookie("Content-Encoding=Content-Encoding=", "");
        java.lang.String str29 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str32 = response30.cookie("hi!");
        org.jsoup.Connection.Base base34 = response30.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method35 = response30.method();
        org.jsoup.Connection.Method method36 = response30.method();
        java.util.Map map37 = response30.cookies();
        java.lang.String str39 = response30.header("hi!=Content-Encoding");
        java.util.Map map40 = response30.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
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
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==hi!");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.contentType();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        boolean boolean13 = response0.hasCookie("Content-Encoding");
        java.util.Map map14 = response0.cookies();
        boolean boolean16 = response0.hasHeader("Content-Encoding==");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding==", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.cookie("hi!");
        java.lang.String str20 = response0.charset();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=hi!==");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean14 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "");
        java.util.Map map15 = response0.cookies();
        java.lang.String str17 = response0.header("hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.cookies();
        int int13 = response0.statusCode();
        java.lang.String str14 = response0.statusMessage();
        boolean boolean16 = response0.hasHeader("hi!=hi!==Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        boolean boolean16 = response0.hasHeader("hi!=hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str15 = response0.cookie("hi!=hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean7 = response0.hasHeaderWithValue("hi!==", "hi!=");
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        java.util.Map map10 = response1.cookies();
        org.jsoup.Connection.Base base12 = response1.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response1.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean16 = response1.hasCookie("hi!==hi!");
        int int17 = response1.statusCode();
        java.util.Map map18 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        org.jsoup.Connection.Method method19 = response0.method();
        java.lang.String str21 = response0.cookie("hi!===hi!=");
        java.lang.String str22 = response0.statusMessage();
        java.lang.String str23 = response0.charset();
        java.lang.String str25 = response0.cookie("Content-Encoding===hi!==hi!");
        java.net.URL uRL26 = response0.url();
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.toString();
        boolean boolean5 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==hi!=" + "'", str4, "hi!==hi!=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!=hi!==hi!", "hi!==hi!=Content-Encoding");
        java.util.Map map4 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        boolean boolean16 = keyVal15.hasInputStream();
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal15.inputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal15.inputStream(inputStream19);
        java.lang.String str21 = keyVal15.value();
        java.lang.String str22 = keyVal15.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Content-Encoding=hi!" + "'", str22, "Content-Encoding=hi!");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str6 = response0.header("hi!==hi!");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.util.Map map6 = response0.headers();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map12 = response11.headers();
        java.lang.String str14 = response11.header("Content-Encoding");
        org.jsoup.Connection.Base base16 = response11.removeHeader("hi!");
        java.lang.String str18 = response11.header("hi!");
        java.lang.String str19 = response11.statusMessage();
        org.jsoup.Connection.Base base22 = response11.header("Content-Encoding", "");
        java.lang.String str24 = response11.cookie("hi!");
        java.lang.String str26 = response11.header("Content-Encoding=hi!=hi!=");
        java.util.Map map27 = response11.cookies();
        org.jsoup.Connection.Base base30 = response11.cookie("Content-Encoding", "hi!===Content-Encoding=");
        org.jsoup.Connection.Method method31 = response11.method();
        java.util.Map map32 = response11.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal5.hasInputStream();
        boolean boolean7 = keyVal5.hasInputStream();
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding==");
        java.lang.Class<?> wildcardClass12 = keyVal11.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        java.lang.String str13 = response9.contentType();
        java.util.Map map14 = response9.cookies();
        java.lang.String str16 = response9.header("Content-Encoding");
        java.util.Map map17 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        boolean boolean20 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean23 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding===hi!==hi!");
        boolean boolean26 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!=Content-Encoding=hi!=Content-Encoding" + "'", str3, "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding=hi!=hi!=", "hi!");
        int int17 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=hi!=hi!=", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.key("hi!==hi!");
        java.lang.String str17 = keyVal14.key();
        java.lang.String str18 = keyVal14.toString();
        java.lang.String str19 = keyVal14.toString();
        java.io.InputStream inputStream20 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal14.inputStream(inputStream20);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!==hi!" + "'", str17, "hi!==hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str18, "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str19, "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        java.net.URL uRL20 = response0.url();
        java.util.Map map21 = response0.headers();
        int int22 = response0.statusCode();
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal6.toString();
        java.lang.String str11 = keyVal6.key();
        java.lang.String str12 = keyVal6.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str10, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str11, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!=");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!===hi!==hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        java.lang.String str15 = keyVal11.toString();
        java.lang.String str16 = keyVal11.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=" + "'", str15, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Content-Encoding" + "'", str16, "Content-Encoding");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        java.net.URL uRL24 = response0.url();
        org.jsoup.Connection.Base base27 = response0.header("Content-Encoding=hi!=hi!=", "hi!=");
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
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.lang.String str14 = response0.contentType();
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=Content-Encoding=hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!=Content-Encoding=hi!=" + "'", str3, "hi!==hi!=Content-Encoding=hi!=");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
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
        java.lang.String str23 = response0.charset();
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
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding==hi!=Content-Encoding", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        java.lang.String str17 = keyVal13.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        java.util.Map map19 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.cookie("hi!===hi!=");
        boolean boolean13 = response0.hasHeader("hi!===Content-Encoding=");
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.Connection.Base base17 = response0.cookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=", "Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        org.jsoup.Connection.Base base16 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("hi!");
        java.lang.String str22 = response18.cookie("Content-Encoding");
        java.lang.String str23 = response18.statusMessage();
        org.jsoup.Connection.Base base25 = response18.removeCookie("Content-Encoding");
        java.net.URL uRL26 = response18.url();
        org.jsoup.Connection.Base base29 = response18.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base31 = response18.removeHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL32 = response18.url();
        java.lang.String str34 = response18.cookie("hi!");
        org.jsoup.Connection.Base base36 = response18.removeHeader("hi!=hi!=");
        java.util.Map map37 = response18.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.util.Map map39 = response0.headers();
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        java.lang.String str16 = response0.charset();
        boolean boolean18 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("hi!");
        java.lang.String str10 = response6.cookie("Content-Encoding");
        java.lang.String str11 = response6.statusMessage();
        java.lang.String str12 = response6.charset();
        boolean boolean14 = response6.hasCookie("Content-Encoding");
        java.util.Map map15 = response6.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        org.jsoup.Connection.Base base4 = response1.removeHeader("Content-Encoding");
        java.util.Map map5 = response1.headers();
        boolean boolean7 = response1.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Base base11 = response8.removeHeader("Content-Encoding");
        int int12 = response8.statusCode();
        java.util.Map map13 = response8.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.util.Map map15 = response1.headers();
        java.lang.String str17 = response1.cookie("Content-Encoding=Content-Encoding===hi!");
        boolean boolean19 = response1.hasCookie("hi!=Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        java.lang.String str8 = keyVal7.key();
        java.lang.String str9 = keyVal7.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str9, "Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=", "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.headers();
        java.lang.String str21 = response18.header("Content-Encoding");
        org.jsoup.Connection.Base base23 = response18.removeHeader("hi!");
        org.jsoup.Connection.Method method24 = response18.method();
        java.lang.String str25 = response18.statusMessage();
        java.net.URL uRL26 = response18.url();
        java.util.Map map27 = response18.cookies();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.headers();
        java.lang.String str31 = response28.header("Content-Encoding");
        java.lang.String str32 = response28.statusMessage();
        org.jsoup.Connection.Base base35 = response28.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean37 = response28.hasCookie("Content-Encoding");
        boolean boolean39 = response28.hasHeader("hi!");
        java.util.Map map40 = response28.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.util.Map map42 = response18.headers();
        java.lang.String str44 = response18.header("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str47 = response45.cookie("hi!");
        org.jsoup.Connection.Base base49 = response45.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method50 = response45.method();
        org.jsoup.Connection.Method method51 = response45.method();
        org.jsoup.Connection.Base base54 = response45.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding");
        java.util.Map map55 = response45.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
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
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNotNull(base54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        java.lang.String str8 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str8, "Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        boolean boolean8 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasHeader("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.Class<?> wildcardClass6 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.statusMessage();
        int int6 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        org.jsoup.Connection.Base base25 = response0.removeCookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response0.parse();
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
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base9 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("hi!");
        java.util.Map map13 = response10.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.lang.String str16 = response0.contentType();
        int int17 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str9 = response0.header("hi!==hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        java.lang.String str13 = response0.charset();
        java.net.URL uRL14 = response0.url();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!===Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===Content-Encoding=" + "'", str4, "hi!===Content-Encoding=");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        boolean boolean27 = response0.hasHeaderWithValue("hi!===hi!=", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Method method28 = response0.method();
        java.lang.String str30 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Base base20 = response0.header("hi!===", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base24 = response0.removeCookie("hi!=Content-Encoding");
        java.lang.String str25 = response0.contentType();
        org.jsoup.Connection.Base base27 = response0.removeHeader("hi!=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = response0.parse();
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!===hi!=");
        java.lang.String str15 = response0.cookie("hi!=Content-Encoding=");
        java.lang.String str16 = response0.statusMessage();
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        java.lang.String str21 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.headers();
        java.lang.String str25 = response22.header("Content-Encoding");
        org.jsoup.Connection.Base base27 = response22.removeHeader("hi!");
        java.util.Map map28 = response22.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str30 = response0.statusMessage();
        java.lang.String str31 = response0.charset();
        java.lang.String str33 = response0.header("Content-Encoding=Content-Encoding===hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        org.jsoup.Connection.Base base4 = response1.removeHeader("Content-Encoding");
        java.util.Map map5 = response1.headers();
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.statusCode();
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str11 = response0.cookie("hi!");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("Content-Encoding=hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("Content-Encoding==hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal17.value("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream22 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal17.inputStream(inputStream22);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        boolean boolean7 = response0.hasHeaderWithValue("hi!===hi!=", "hi!");
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!=hi!=Content-Encoding=");
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        int int11 = response0.statusCode();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        java.lang.String str21 = response17.cookie("Content-Encoding");
        boolean boolean23 = response17.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base26 = response17.cookie("Content-Encoding=", "hi!");
        java.lang.String str28 = response17.cookie("hi!");
        org.jsoup.Connection.Method method29 = response17.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str32 = response30.cookie("hi!");
        java.lang.String str34 = response30.cookie("Content-Encoding");
        boolean boolean36 = response30.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base38 = response30.removeCookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map39 = response30.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        boolean boolean17 = response0.hasHeader("hi!===Content-Encoding==hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!");
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasHeader("Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!===Content-Encoding=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.header("hi!=hi!=Content-Encoding=");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str6 = response0.header("hi!==hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding==", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding===" + "'", str5, "Content-Encoding=Content-Encoding===");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!=hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        boolean boolean15 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!", "hi!=hi!==Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=Content-Encoding=Content-Encoding==", "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str8 = response0.cookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Base base12 = response1.header("Content-Encoding", "");
        org.jsoup.Connection.Base base15 = response1.cookie("hi!=Content-Encoding", "");
        java.util.Map map16 = response1.headers();
        org.jsoup.Connection.Base base19 = response1.cookie("hi!==hi!=hi!=", "hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.util.Map map4 = response1.headers();
        org.jsoup.Connection.Base base7 = response1.header("Content-Encoding", "");
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Base base12 = response1.removeCookie("hi!=Content-Encoding=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
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
        java.lang.String str28 = response0.header("Content-Encoding=Content-Encoding===hi!");
        int int29 = response0.statusCode();
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!===hi!==", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!==" + "'", str4, "hi!===hi!==");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.lang.String str7 = keyVal4.key();
        boolean boolean8 = keyVal4.hasInputStream();
        java.io.InputStream inputStream9 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        java.lang.String str10 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        org.jsoup.Connection.Base base18 = response0.header("hi!==", "hi!===hi!=");
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
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        org.jsoup.Connection.Method method20 = response0.method();
        java.net.URL uRL21 = response0.url();
        org.jsoup.Connection.Base base23 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.net.URL uRL24 = response0.url();
        boolean boolean26 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str17 = keyVal14.key();
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal14.inputStream(inputStream18);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=hi!=" + "'", str17, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        java.net.URL uRL27 = response0.url();
        boolean boolean30 = response0.hasHeaderWithValue("hi!", "hi!=");
        java.lang.String str31 = response0.statusMessage();
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
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str14 = response10.statusMessage();
        org.jsoup.Connection.Base base17 = response10.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean19 = response10.hasCookie("Content-Encoding");
        boolean boolean21 = response10.hasHeader("hi!");
        java.util.Map map22 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.String str24 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response0.parse();
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("hi!=Content-Encoding=", "Content-Encoding==");
        boolean boolean15 = response0.hasCookie("hi!===hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!==");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=Content-Encoding");
        java.util.Map map14 = response0.cookies();
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
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        boolean boolean35 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Method method36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base37 = response0.method(method36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        java.net.URL uRL20 = response0.url();
        java.lang.String str22 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str23 = response0.charset();
        org.jsoup.Connection.Method method24 = response0.method();
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!", "hi!==hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("Content-Encoding===hi!==hi!");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=Content-Encoding===hi!=hi!==hi!" + "'", str3, "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        int int6 = response0.statusCode();
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=hi!=", "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal7.key("hi!===Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        java.util.Map map18 = response0.cookies();
        boolean boolean20 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.lang.String str21 = response0.charset();
        org.jsoup.Connection.Base base23 = response0.removeCookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str24 = response0.contentType();
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
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("hi!==");
        java.lang.String str6 = response0.cookie("Content-Encoding=hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
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
        org.jsoup.Connection.Method method24 = response0.method();
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
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!=hi!=", "hi!=");
        org.jsoup.Connection.Base base14 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!=");
        boolean boolean11 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map12 = response11.headers();
        boolean boolean15 = response11.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str17 = response11.header("hi!==hi!");
        org.jsoup.Connection.Base base20 = response11.cookie("hi!===hi!=", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base24 = response21.cookie("hi!", "hi!");
        java.lang.String str25 = response21.charset();
        java.lang.String str27 = response21.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL28 = response21.url();
        org.jsoup.Connection.Base base31 = response21.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str33 = response21.header("hi!=");
        java.lang.String str34 = response21.statusMessage();
        org.jsoup.Connection.Base base36 = response21.removeHeader("Content-Encoding");
        java.lang.String str38 = response21.header("hi!==hi!");
        org.jsoup.Connection.Base base40 = response21.removeCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base43 = response41.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str46 = response44.cookie("hi!");
        java.util.Map map47 = response44.headers();
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        boolean boolean51 = response41.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map52 = response41.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        java.net.URL uRL56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base57 = response0.url(uRL56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertNotNull(base43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        int int6 = response1.statusCode();
        java.lang.String str7 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
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
        java.lang.String str16 = response0.cookie("Content-Encoding==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "hi!=hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        java.lang.String str14 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=" + "'", str14, "Content-Encoding=");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method23 = response0.method();
        org.jsoup.Connection.Base base25 = response0.removeCookie("hi!=hi!=");
        org.jsoup.Connection.Base base27 = response0.removeCookie("Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str30 = response28.cookie("hi!");
        java.lang.String str32 = response28.cookie("Content-Encoding");
        java.lang.String str33 = response28.statusMessage();
        org.jsoup.Connection.Base base35 = response28.removeCookie("Content-Encoding");
        java.net.URL uRL36 = response28.url();
        org.jsoup.Connection.Base base39 = response28.cookie("Content-Encoding", "hi!=");
        boolean boolean41 = response28.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.headers();
        org.jsoup.Connection.Base base45 = response42.removeHeader("Content-Encoding");
        java.util.Map map46 = response42.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str51 = response49.cookie("hi!");
        java.lang.String str53 = response49.cookie("Content-Encoding");
        java.lang.String str54 = response49.statusMessage();
        java.lang.String str55 = response49.charset();
        boolean boolean57 = response49.hasCookie("Content-Encoding");
        java.util.Map map58 = response49.cookies();
        int int59 = response49.statusCode();
        java.lang.String str60 = response49.statusMessage();
        java.util.Map map61 = response49.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        java.util.Map map63 = response0.headers();
        org.jsoup.Connection.Method method64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base65 = response0.method(method64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        java.lang.String str23 = response20.header("Content-Encoding");
        org.jsoup.Connection.Base base25 = response20.removeHeader("hi!");
        java.lang.String str26 = response20.statusMessage();
        int int27 = response20.statusCode();
        java.util.Map map28 = response20.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Method method30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base31 = response0.method(method30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = method37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("hi!=hi!=");
        org.jsoup.Connection.Base base17 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean19 = response0.hasCookie("Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.cookie("hi!=");
        org.jsoup.Connection.Base base16 = response0.removeCookie("Content-Encoding=hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        org.jsoup.Connection.Base base22 = response17.removeHeader("Content-Encoding");
        java.util.Map map23 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Method method25 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("Content-Encoding=");
        boolean boolean9 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response5.cookie("hi!");
        org.jsoup.Connection.Base base9 = response5.removeCookie("Content-Encoding");
        int int10 = response5.statusCode();
        java.lang.String str11 = response5.contentType();
        java.lang.String str12 = response5.charset();
        java.lang.String str14 = response5.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base17 = response5.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!==");
        org.jsoup.Connection.Base base19 = response5.removeCookie("hi!==hi!");
        java.util.Map map20 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        java.lang.Class<?> wildcardClass13 = base12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        int int4 = response0.statusCode();
        boolean boolean6 = response0.hasCookie("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.String str7 = keyVal3.value();
        java.io.InputStream inputStream8 = keyVal3.inputStream();
        java.lang.String str9 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.contentType();
        java.lang.String str10 = response0.header("Content-Encoding=Content-Encoding===");
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
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
        java.lang.String str14 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response13.removeCookie("Content-Encoding");
        java.lang.String str17 = response13.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("hi!");
        java.util.Map map24 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str28 = response13.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base30 = response13.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method31 = response13.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response32.cookie("hi!", "hi!");
        java.lang.String str36 = response32.charset();
        java.util.Map map37 = response32.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        boolean boolean41 = response0.hasCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.headers();
        org.jsoup.Connection.Base base45 = response42.removeHeader("Content-Encoding");
        java.util.Map map46 = response42.headers();
        boolean boolean48 = response42.hasCookie("Content-Encoding");
        java.util.Map map49 = response42.headers();
        java.util.Map map50 = response42.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        org.jsoup.Connection.Method method52 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(method52);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal7.key("hi!===Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("hi!===");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        java.util.Map map20 = response17.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.lang.String str23 = response14.cookie("Content-Encoding");
        org.jsoup.Connection.Base base26 = response14.header("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str27 = response14.statusMessage();
        boolean boolean30 = response14.hasHeaderWithValue("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base32 = response14.removeHeader("hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response33.removeCookie("Content-Encoding");
        java.util.Map map36 = response33.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.Connection.Method method39 = response0.method();
        java.lang.String str40 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=");
        boolean boolean14 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        java.lang.String str11 = keyVal7.toString();
        java.lang.String str12 = keyVal7.key();
        java.lang.String str13 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=" + "'", str11, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding" + "'", str12, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response11.cookie("hi!", "hi!");
        java.lang.String str15 = response11.charset();
        java.util.Map map16 = response11.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str18 = response1.statusMessage();
        int int19 = response1.statusCode();
        java.util.Map map20 = response1.cookies();
        java.util.Map map21 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
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
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str18 = response0.charset();
        java.lang.String str19 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
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
        org.jsoup.Connection.Base base16 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!==hi!=");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str21 = response19.cookie("hi!");
        java.lang.String str23 = response19.cookie("Content-Encoding");
        boolean boolean25 = response19.hasCookie("hi!");
        org.jsoup.Connection.Base base28 = response19.header("hi!=hi!=", "Content-Encoding=");
        java.util.Map map29 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
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
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
        boolean boolean15 = keyVal14.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal14.value("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal17.value("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        org.jsoup.Connection.Method method5 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.cookie("", "hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeCookie("Content-Encoding");
        java.lang.String str15 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base17 = response0.removeCookie("hi!==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        java.util.Map map14 = response0.cookies();
        boolean boolean16 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        boolean boolean27 = response0.hasHeaderWithValue("hi!===hi!=", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base30 = response0.header("Content-Encoding==hi!===hi!=", "hi!===Content-Encoding=");
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base32 = response0.url(uRL31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(base30);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=hi!=", "hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.key();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        org.jsoup.Connection.Base base19 = response0.cookie("hi!=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        boolean boolean16 = response0.hasCookie("hi!===hi!==");
        java.lang.String str17 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        org.jsoup.Connection.Base base18 = response15.removeHeader("Content-Encoding");
        java.util.Map map19 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.headers();
        java.lang.String str24 = response21.header("Content-Encoding");
        org.jsoup.Connection.Base base26 = response21.removeHeader("hi!");
        java.lang.String str28 = response21.header("hi!");
        java.lang.String str29 = response21.statusMessage();
        java.util.Map map30 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.Connection.Method method32 = response0.method();
        org.jsoup.Connection.Method method33 = response0.method();
        java.lang.String str35 = response0.header("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.contentType();
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
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
        org.jsoup.Connection.Base base19 = response0.removeCookie("hi!=hi!=");
        java.util.Map map20 = response0.cookies();
        java.net.URL uRL21 = response0.url();
        boolean boolean24 = response0.hasHeaderWithValue("Content-Encoding=hi!", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method25 = response0.method();
        org.jsoup.Connection.Method method26 = response0.method();
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal8.toString();
        java.lang.String str12 = keyVal8.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=" + "'", str11, "hi!=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.header("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.header("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=");
        boolean boolean8 = keyVal7.hasInputStream();
        java.lang.String str9 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasCookie("hi!==");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeCookie("Content-Encoding");
        java.lang.String str13 = response9.header("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        java.util.Map map20 = response17.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.lang.String str24 = response9.header("Content-Encoding=Content-Encoding");
        java.lang.String str26 = response9.header("Content-Encoding=");
        java.util.Map map27 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base30 = response0.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        java.util.Map map5 = response0.cookies();
        int int6 = response0.statusCode();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.charset();
        java.net.URL uRL12 = response8.url();
        java.lang.String str14 = response8.cookie("hi!");
        int int15 = response8.statusCode();
        boolean boolean17 = response8.hasHeader("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base19 = response8.removeCookie("Content-Encoding=Content-Encoding===");
        java.util.Map map20 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "Content-Encoding==hi!=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.inputStream(inputStream8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean8 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasHeader("hi!==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        java.util.Map map14 = response0.cookies();
        java.lang.String str15 = response0.contentType();
        boolean boolean18 = response0.hasHeaderWithValue("Content-Encoding=hi!==hi!", "hi!=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding==");
        java.lang.String str10 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding==" + "'", str10, "Content-Encoding==");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("hi!");
        java.lang.String str17 = response13.cookie("Content-Encoding");
        boolean boolean19 = response13.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base21 = response13.removeCookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map22 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        int int24 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "hi!=hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!===hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==");
        boolean boolean15 = response0.hasHeaderWithValue("hi!==Content-Encoding", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        java.io.InputStream inputStream11 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        int int16 = response0.statusCode();
        java.lang.String str17 = response0.charset();
        int int18 = response0.statusCode();
        org.jsoup.Connection.Base base21 = response0.cookie("hi!=hi!==hi!", "hi!===hi!==hi!==hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.contentType();
        boolean boolean10 = response0.hasHeader("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        java.util.Map map16 = response0.headers();
        java.util.Map map17 = response0.headers();
        java.lang.Class<?> wildcardClass18 = map17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=Content-Encoding=", "hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str15 = response0.contentType();
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasHeader("Content-Encoding");
        java.lang.String str14 = response0.cookie("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Base base12 = response9.removeHeader("Content-Encoding");
        java.util.Map map13 = response9.headers();
        org.jsoup.Connection.Base base15 = response9.removeCookie("Content-Encoding");
        java.lang.String str16 = response9.statusMessage();
        java.lang.String str17 = response9.statusMessage();
        java.util.Map map18 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map map13 = response0.cookies();
        java.lang.String str14 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        java.lang.String str18 = response15.header("Content-Encoding");
        org.jsoup.Connection.Base base20 = response15.removeHeader("hi!");
        org.jsoup.Connection.Method method21 = response15.method();
        java.lang.String str22 = response15.statusMessage();
        java.net.URL uRL23 = response15.url();
        java.util.Map map24 = response15.cookies();
        org.jsoup.Connection.Base base26 = response15.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base28 = response15.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean30 = response15.hasCookie("hi!==hi!");
        java.lang.String str31 = response15.statusMessage();
        org.jsoup.Connection.Base base33 = response15.removeCookie("hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL34 = response15.url();
        java.lang.String str36 = response15.header("hi!==hi!=Content-Encoding");
        java.util.Map map37 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.header("hi!=", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
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
        java.util.Map map27 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.headers();
        java.lang.String str31 = response28.header("Content-Encoding");
        org.jsoup.Connection.Base base33 = response28.removeHeader("hi!");
        org.jsoup.Connection.Method method34 = response28.method();
        java.lang.String str35 = response28.statusMessage();
        java.net.URL uRL36 = response28.url();
        java.util.Map map37 = response28.cookies();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map39 = response38.headers();
        java.lang.String str41 = response38.header("Content-Encoding");
        java.lang.String str42 = response38.statusMessage();
        org.jsoup.Connection.Base base45 = response38.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean47 = response38.hasCookie("Content-Encoding");
        boolean boolean49 = response38.hasHeader("hi!");
        java.util.Map map50 = response38.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.util.Map map52 = response28.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
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
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.value();
        java.lang.Class<?> wildcardClass10 = keyVal8.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
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
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str16 = response0.statusMessage();
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean8 = response0.hasHeader("hi!=");
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=", "Content-Encoding=Content-Encoding");
        java.util.Map map13 = response0.headers();
        java.lang.String str15 = response0.cookie("hi!");
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
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
        boolean boolean29 = response0.hasHeaderWithValue("Content-Encoding", "Content-Encoding");
        java.lang.String str30 = response0.charset();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!===Content-Encoding=");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        java.util.Map map15 = response0.headers();
        java.lang.String str16 = response0.contentType();
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===hi!=");
        java.lang.String str10 = response0.charset();
        java.lang.String str12 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.inputStream(inputStream10);
        boolean boolean12 = keyVal11.hasInputStream();
        java.io.InputStream inputStream13 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        java.net.URL uRL18 = response0.url();
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!");
        java.net.URL uRL21 = response0.url();
        java.lang.String str23 = response0.header("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        java.lang.String str27 = response24.header("Content-Encoding");
        org.jsoup.Connection.Base base29 = response24.removeHeader("hi!");
        org.jsoup.Connection.Method method30 = response24.method();
        java.lang.String str31 = response24.statusMessage();
        java.net.URL uRL32 = response24.url();
        java.lang.String str34 = response24.header("");
        org.jsoup.Connection.Base base37 = response24.header("hi!==hi!", "hi!=Content-Encoding");
        java.lang.String str39 = response24.header("");
        boolean boolean41 = response24.hasCookie("Content-Encoding");
        java.util.Map map42 = response24.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        int int5 = response0.statusCode();
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding==hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.net.URL uRL17 = response0.url();
        java.net.URL uRL18 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        java.lang.String str16 = keyVal15.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal15.key("hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Content-Encoding=hi!" + "'", str16, "Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        boolean boolean10 = keyVal9.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
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
        java.lang.String str19 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
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
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=hi!", "Content-Encoding=Content-Encoding=");
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
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
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==");
        org.jsoup.Connection.Method method20 = response0.method();
        java.net.URL uRL21 = response0.url();
        int int22 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base10 = response0.header("hi!=hi!==", "hi!=hi!");
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=Content-Encoding=Content-Encoding=" + "'", str3, "hi!=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.Class<?> wildcardClass5 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.header("hi!");
        org.jsoup.Connection.Base base10 = response1.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Method method11 = response1.method();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal3.inputStream();
        boolean boolean10 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
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
        java.net.URL uRL18 = response0.url();
        java.util.Map map19 = response0.headers();
        boolean boolean21 = response0.hasCookie("hi!===hi!==Content-Encoding=Content-Encoding");
        java.util.Map map22 = response0.headers();
        org.jsoup.Connection.Base base24 = response0.removeCookie("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.header("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.Connection.Base base15 = response10.removeHeader("hi!");
        java.lang.String str16 = response10.statusMessage();
        int int17 = response10.statusCode();
        java.util.Map map18 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.contentType();
        org.jsoup.Connection.Base base22 = response0.removeCookie("Content-Encoding==");
        org.jsoup.Connection.Method method23 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("Content-Encoding=hi!");
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("hi!=hi!==Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6, "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!===hi!=");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean14 = response0.hasHeaderWithValue("hi!===", "Content-Encoding=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("hi!");
        org.jsoup.Connection.Base base18 = response14.removeCookie("Content-Encoding");
        int int19 = response14.statusCode();
        boolean boolean21 = response14.hasCookie("hi!=");
        org.jsoup.Connection.Base base23 = response14.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str24 = response14.charset();
        boolean boolean26 = response14.hasHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map27 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.jsoup.Connection.Method method29 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=Content-Encoding=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.lang.String str13 = keyVal10.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=hi!=Content-Encoding=" + "'", str13, "hi!=hi!=Content-Encoding=");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding=", "hi!=hi!==hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        boolean boolean11 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!===hi!=");
        java.lang.String str14 = keyVal13.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!===hi!=" + "'", str14, "hi!===hi!=");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "hi!===hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        int int18 = response0.statusCode();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.Connection.Base base22 = response0.header("Content-Encoding=Content-Encoding=hi!===Content-Encoding=", "hi!=hi!=Content-Encoding=");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base24 = response0.method(method23);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.charset();
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        boolean boolean38 = response0.hasHeaderWithValue("hi!=Content-Encoding", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base41 = response0.header("hi!===hi!==", "hi!=Content-Encoding");
        java.lang.String str42 = response0.statusMessage();
        int int43 = response0.statusCode();
        java.lang.String str45 = response0.cookie("hi!=hi!===Content-Encoding=");
        java.lang.String str46 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=Content-Encoding");
        java.lang.String str13 = keyVal12.value();
        java.lang.Class<?> wildcardClass14 = keyVal12.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        java.lang.String str18 = response0.charset();
        java.lang.String str19 = response0.charset();
        java.lang.String str21 = response0.cookie("Content-Encoding=hi!==hi!");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!=hi!==hi!");
        java.lang.String str15 = keyVal14.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=hi!=");
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.header("Content-Encoding=");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.value();
        boolean boolean9 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!==hi!=hi!=", "hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!=" + "'", str3, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        java.lang.String str25 = response0.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base27 = response0.removeCookie("hi!==Content-Encoding");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasHeader("hi!=hi!==Content-Encoding=");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base9 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("hi!");
        java.util.Map map13 = response10.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!==");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!==");
        java.lang.String str10 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!==" + "'", str10, "hi!==");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean4 = response0.hasHeader("Content-Encoding=hi!");
        java.lang.String str6 = response0.cookie("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
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
        java.util.Map map23 = response0.headers();
        java.net.URL uRL24 = response0.url();
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
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
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
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==");
        org.jsoup.Connection.Method method20 = response0.method();
        java.net.URL uRL21 = response0.url();
        boolean boolean24 = response0.hasHeaderWithValue("Content-Encoding=hi!", "hi!===hi!==Content-Encoding");
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.net.URL uRL5 = response0.url();
        boolean boolean7 = response0.hasCookie("hi!=hi!=");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!=Content-Encoding=hi!=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=");
        boolean boolean17 = response0.hasCookie("hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("hi!");
        java.util.Map map24 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str27 = response18.cookie("Content-Encoding");
        org.jsoup.Connection.Base base30 = response18.header("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str31 = response18.statusMessage();
        boolean boolean34 = response18.hasHeaderWithValue("hi!==hi!", "hi!=hi!=");
        java.lang.String str36 = response18.cookie("Content-Encoding=");
        java.lang.String str38 = response18.header("hi!==hi!");
        java.util.Map map39 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=", "hi!==hi!");
        java.util.Map map9 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal3.key("Content-Encoding=");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal3.inputStream(inputStream15);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("Content-Encoding=");
        java.lang.String str14 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!===hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!==");
        int int16 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        boolean boolean23 = keyVal21.hasInputStream();
        boolean boolean24 = keyVal21.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
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
        org.jsoup.Connection.Base base23 = response0.cookie("hi!==hi!", "hi!=Content-Encoding");
        int int24 = response0.statusCode();
        boolean boolean26 = response0.hasCookie("hi!===hi!=");
        java.util.Map map27 = response0.cookies();
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
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=Content-Encoding=hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str6, "hi!=Content-Encoding=hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!===hi!=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        java.lang.String str5 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        org.jsoup.Connection.Base base23 = response0.cookie("hi!==hi!", "hi!=Content-Encoding");
        int int24 = response0.statusCode();
        boolean boolean26 = response0.hasCookie("hi!===hi!=");
        java.lang.String str28 = response0.header("Content-Encoding==hi!===hi!=");
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
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!===Content-Encoding=");
        java.lang.String str17 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str15 = response0.header("hi!=hi!");
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
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream12 = keyVal5.inputStream();
        java.io.InputStream inputStream13 = keyVal5.inputStream();
        java.lang.String str14 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding=hi!=" + "'", str14, "Content-Encoding=Content-Encoding=hi!=");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeCookie("Content-Encoding");
        java.lang.String str15 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Method method16 = response0.method();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL11 = response0.url();
        java.net.URL uRL12 = response0.url();
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=hi!=Content-Encoding=");
        boolean boolean8 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===", "Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        boolean boolean8 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!=hi!=hi!==hi!");
        boolean boolean11 = keyVal10.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base24 = response0.removeCookie("hi!=Content-Encoding");
        java.lang.String str25 = response0.contentType();
        java.net.URL uRL26 = response0.url();
        org.jsoup.Connection.Base base29 = response0.cookie("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===Content-Encoding=", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===Content-Encoding=" + "'", str4, "hi!===Content-Encoding=");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
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
        org.jsoup.Connection.Base base24 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str25 = response0.statusMessage();
        org.jsoup.Connection.Base base28 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base28);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!==hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str3, "hi!==hi!=Content-Encoding");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.Connection.Base base18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method19 = response13.method();
        java.lang.String str20 = response13.statusMessage();
        java.net.URL uRL21 = response13.url();
        java.lang.String str23 = response13.header("");
        org.jsoup.Connection.Base base26 = response13.header("hi!==hi!", "hi!=Content-Encoding");
        java.lang.String str28 = response13.header("");
        boolean boolean30 = response13.hasCookie("Content-Encoding");
        java.util.Map map31 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map33 = response32.headers();
        java.lang.String str35 = response32.header("Content-Encoding");
        org.jsoup.Connection.Base base37 = response32.removeHeader("hi!");
        org.jsoup.Connection.Method method38 = response32.method();
        java.lang.String str39 = response32.statusMessage();
        java.net.URL uRL40 = response32.url();
        java.util.Map map41 = response32.cookies();
        org.jsoup.Connection.Base base43 = response32.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base45 = response32.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map46 = response32.headers();
        java.lang.String str47 = response32.charset();
        boolean boolean49 = response32.hasHeader("hi!=Content-Encoding=");
        java.util.Map map50 = response32.cookies();
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map52 = response51.headers();
        org.jsoup.Connection.Base base54 = response51.removeHeader("Content-Encoding");
        java.util.Map map55 = response51.headers();
        java.util.Map map56 = response51.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        java.util.Map map60 = response0.headers();
        boolean boolean63 = response0.hasHeaderWithValue("Content-Encoding==hi!===hi!==hi!=", "Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(base43);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(base54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        boolean boolean19 = response0.hasHeaderWithValue("hi!=", "hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
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
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding=");
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        java.lang.String str8 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding==" + "'", str8, "Content-Encoding==");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        org.jsoup.Connection.Base base19 = response0.removeCookie("Content-Encoding==hi!===hi!==hi!=");
        java.net.URL uRL20 = response0.url();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = response0.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
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
        java.lang.String str22 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base24 = response0.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base27 = response0.header("Content-Encoding=hi!=hi!=", "Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = response0.parse();
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal2.key();
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding==", "");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.charset();
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("hi!", "hi!");
        java.lang.String str19 = response15.charset();
        java.lang.String str21 = response15.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL22 = response15.url();
        org.jsoup.Connection.Base base25 = response15.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str27 = response15.header("hi!=");
        java.lang.String str28 = response15.statusMessage();
        org.jsoup.Connection.Base base30 = response15.removeHeader("Content-Encoding");
        java.lang.String str32 = response15.header("hi!==hi!");
        org.jsoup.Connection.Base base34 = response15.removeCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base37 = response35.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str40 = response38.cookie("hi!");
        java.util.Map map41 = response38.headers();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        boolean boolean45 = response35.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map46 = response35.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        int int49 = response0.statusCode();
        java.lang.String str50 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        java.lang.String str17 = keyVal10.value();
        boolean boolean18 = keyVal10.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal10.key("Content-Encoding=hi!==hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        boolean boolean21 = response0.hasHeaderWithValue("Content-Encoding==", "hi!=Content-Encoding");
        java.net.URL uRL22 = response0.url();
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base24 = response0.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding=", "hi!=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=hi!==Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("hi!=Content-Encoding");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.key("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("Content-Encoding");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.lang.String str7 = keyVal3.key();
        java.lang.String str8 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = keyVal3.value();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.inputStream(inputStream12);
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal3.inputStream(inputStream14);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str7, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str11, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        java.lang.String str8 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("Content-Encoding");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.inputStream(inputStream14);
        boolean boolean16 = keyVal15.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
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
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!=");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.header("Content-Encoding=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
        java.util.Map map40 = response0.cookies();
        java.net.URL uRL41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base42 = response0.url(uRL41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=hi!=");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.headers();
        java.lang.String str16 = response0.header("hi!=hi!=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal5.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.key("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal8.inputStream(inputStream14);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
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
        org.jsoup.Connection.Base base20 = response0.cookie("hi!=hi!=", "hi!=");
        java.lang.String str21 = response0.statusMessage();
        java.util.Map map22 = response0.cookies();
        java.lang.String str23 = response0.charset();
        java.lang.String str24 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        java.lang.String str41 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!===hi!=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }
}

