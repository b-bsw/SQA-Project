package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.cookie("hi!===hi!=");
        java.lang.String str9 = response0.header("hi!=");
        java.net.URL uRL10 = response0.url();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.jsoup.Connection.Base base32 = response0.header("hi!=Content-Encoding=", "hi!===hi!=");
        org.jsoup.Connection.Base base34 = response0.removeCookie("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
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
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(base34);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        java.lang.String str11 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!==");
        java.net.URL uRL13 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        org.jsoup.Connection.Base base24 = response0.cookie("hi!", "Content-Encoding=Content-Encoding");
        java.util.Map map25 = response0.headers();
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
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        java.lang.String str21 = response0.header("hi!=hi!==Content-Encoding=");
        boolean boolean23 = response0.hasCookie("hi!===hi!==hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.net.URL uRL18 = response0.url();
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
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        org.jsoup.Connection.Base base21 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Base base24 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=");
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base26 = response0.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base12 = response10.removeCookie("Content-Encoding");
        java.lang.String str14 = response10.header("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base17 = response15.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("hi!");
        java.util.Map map21 = response18.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.util.Map map24 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.Connection.Base base30 = response25.removeHeader("hi!");
        org.jsoup.Connection.Method method31 = response25.method();
        java.lang.String str32 = response25.statusMessage();
        org.jsoup.Connection.Method method33 = response25.method();
        org.jsoup.Connection.Base base35 = response25.removeCookie("hi!=");
        java.lang.String str37 = response25.header("Content-Encoding=");
        java.util.Map map38 = response25.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.jsoup.Connection.Base base42 = response0.removeHeader("Content-Encoding==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(base42);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        java.lang.String str17 = response0.cookie("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str14 = response0.contentType();
        java.net.URL uRL15 = response0.url();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.header("hi!==hi!=Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("Content-Encoding");
        java.util.Map map8 = response0.headers();
        boolean boolean10 = response0.hasHeader("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.inputStream(inputStream14);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("");
        boolean boolean18 = keyVal17.hasInputStream();
        java.lang.String str19 = keyVal17.toString();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=hi!==" + "'", str19, "hi!=hi!==");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.header("hi!===hi!==", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("Content-Encoding=Content-Encoding===");
        boolean boolean18 = keyVal15.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        org.jsoup.Connection.Base base25 = response0.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map26 = response0.cookies();
        boolean boolean28 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!");
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
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        java.lang.String str17 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str18 = response0.charset();
        java.lang.String str20 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str21 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response12.removeHeader("hi!");
        java.util.Map map15 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.header("Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("hi!==");
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!===hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!==hi!===hi!=" + "'", str3, "hi!=hi!==hi!===hi!=");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!", "Content-Encoding=Content-Encoding==");
        boolean boolean12 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "hi!===hi!=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=");
        boolean boolean17 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        boolean boolean10 = keyVal7.hasInputStream();
        java.io.InputStream inputStream11 = keyVal7.inputStream();
        boolean boolean12 = keyVal7.hasInputStream();
        java.lang.String str13 = keyVal7.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal7.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!=Content-Encoding=hi!=");
        java.lang.Class<?> wildcardClass20 = keyVal15.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!===hi!=");
        java.lang.String str15 = response0.cookie("hi!=hi!=");
        int int16 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        java.util.Map map23 = response0.headers();
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
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!==hi!", "hi!=hi!==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.Connection.Base base8 = response1.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str9 = response1.contentType();
        int int10 = response1.statusCode();
        boolean boolean13 = response1.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document31 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base30);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding");
        java.lang.String str5 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.header("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        boolean boolean8 = keyVal3.hasInputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==hi!==hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.jsoup.Connection.Base base21 = response1.removeCookie("hi!");
        org.jsoup.Connection.Base base24 = response1.cookie("hi!==hi!", "hi!=Content-Encoding");
        java.util.Map map25 = response1.cookies();
        java.lang.String str27 = response1.cookie("hi!===");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str12 = response0.header("hi!=Content-Encoding");
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("Content-Encoding=Content-Encoding==", "Content-Encoding=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        boolean boolean8 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==hi!");
        java.lang.String str10 = response0.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        boolean boolean22 = response0.hasHeader("hi!=hi!==");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal5.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==");
        boolean boolean12 = response0.hasHeaderWithValue("Content-Encoding", "hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!===Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
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
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==Content-Encoding=");
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!==");
        java.lang.String str11 = keyVal10.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        java.lang.String str19 = keyVal15.key();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!==hi!" + "'", str19, "hi!==hi!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        java.lang.String str18 = response0.contentType();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=", "hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        java.lang.String str15 = response0.cookie("hi!=");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base26 = response24.removeCookie("Content-Encoding");
        java.lang.String str28 = response24.header("");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base31 = response29.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str34 = response32.cookie("hi!");
        java.util.Map map35 = response32.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str39 = response24.header("Content-Encoding=Content-Encoding");
        java.lang.String str40 = response24.charset();
        java.util.Map map41 = response24.cookies();
        int int42 = response24.statusCode();
        java.util.Map map43 = response24.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
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
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!==hi!=Content-Encoding=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal10.key();
        boolean boolean12 = keyVal10.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.key("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        java.lang.String str13 = keyVal12.key();
        boolean boolean14 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        boolean boolean16 = response0.hasCookie("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        boolean boolean45 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        java.lang.String str15 = response0.charset();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        int int24 = response0.statusCode();
        org.jsoup.Connection.Base base27 = response0.header("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = response0.url(uRL28);
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        org.jsoup.Connection.Base base24 = response0.header("hi!==", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        boolean boolean26 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
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
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        boolean boolean31 = response0.hasHeaderWithValue("hi!===hi!=", "hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.header("hi!==hi!=hi!=");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.net.URL uRL7 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        java.lang.String str16 = response0.contentType();
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "hi!===hi!==hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
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
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.header("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.header("Content-Encoding=Content-Encoding==", "hi!==");
        java.net.URL uRL22 = response0.url();
        java.lang.String str24 = response0.cookie("hi!==hi!");
        java.util.Map map25 = response0.cookies();
        int int26 = response0.statusCode();
        java.lang.String str28 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        org.jsoup.Connection.Base base22 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean24 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str25 = response0.charset();
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
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str10, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        java.net.URL uRL10 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasCookie("hi!=");
        boolean boolean11 = response0.hasHeader("Content-Encoding");
        boolean boolean13 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!==", "Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        boolean boolean17 = response0.hasCookie("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding=hi!", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base19 = response0.header("hi!===", "hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding===hi!==hi!");
        java.lang.String str11 = response0.cookie("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!==");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.charset();
        boolean boolean9 = response0.hasCookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        java.net.URL uRL18 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = uRL18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.lang.String str17 = response0.cookie("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        org.jsoup.Connection.Method method32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base33 = response0.method(method32);
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        java.lang.String str29 = response0.charset();
        boolean boolean32 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!", "hi!=Content-Encoding=");
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        java.lang.String str25 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map28 = response27.headers();
        org.jsoup.Connection.Base base30 = response27.removeHeader("Content-Encoding");
        java.util.Map map31 = response27.headers();
        org.jsoup.Connection.Method method32 = response27.method();
        org.jsoup.Connection.Base base34 = response27.removeHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.headers();
        java.lang.String str38 = response35.header("Content-Encoding");
        org.jsoup.Connection.Base base40 = response35.removeHeader("hi!");
        org.jsoup.Connection.Method method41 = response35.method();
        java.util.Map map42 = response35.cookies();
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        boolean boolean47 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=hi!=", "hi!===hi!==Content-Encoding");
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        org.jsoup.Connection.Base base19 = response1.cookie("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        boolean boolean21 = response1.hasCookie("hi!=Content-Encoding");
        java.util.Map map22 = response1.headers();
        boolean boolean25 = response1.hasHeaderWithValue("hi!=hi!=", "hi!");
        java.net.URL uRL26 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        int int23 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.lang.String str16 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        java.lang.String str22 = response0.header("hi!===hi!");
        java.lang.String str23 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        java.lang.String str8 = keyVal3.toString();
        boolean boolean9 = keyVal3.hasInputStream();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding=Content-Encoding===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.key("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.lang.String str18 = response14.contentType();
        int int19 = response14.statusCode();
        java.util.Map map20 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        boolean boolean7 = keyVal5.hasInputStream();
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!===hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str8, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.value("hi!===hi!=");
        java.lang.String str22 = keyVal19.key();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Content-Encoding" + "'", str22, "Content-Encoding");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.util.Map map18 = response0.cookies();
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=");
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        java.lang.String str7 = keyVal3.key();
        boolean boolean8 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
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
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.header("hi!===Content-Encoding=");
        java.lang.String str17 = response0.charset();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.method(method18);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        java.lang.String str19 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        org.jsoup.Connection.Method method11 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal16.value("hi!");
        java.lang.String str22 = keyVal16.toString();
        java.io.InputStream inputStream23 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal16.inputStream(inputStream23);
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
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=hi!" + "'", str22, "hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal24);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        java.lang.String str5 = response1.statusMessage();
        boolean boolean7 = response1.hasCookie("hi!=");
        java.util.Map map8 = response1.headers();
        boolean boolean10 = response1.hasHeader("hi!==");
        java.util.Map map11 = response1.headers();
        java.lang.String str13 = response1.header("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        int int17 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        int int24 = response0.statusCode();
        org.jsoup.Connection.Base base27 = response0.header("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base30 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!==hi!=");
        java.lang.String str31 = response0.charset();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Base base5 = response1.removeHeader("hi!");
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Base base9 = response1.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!===Content-Encoding=");
        java.lang.String str11 = response1.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str13 = response1.cookie("hi!=Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.cookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        java.lang.String str5 = response0.header("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!===hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!==", "");
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasCookie("hi!=hi!=");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        java.lang.String str18 = response0.contentType();
        org.jsoup.Connection.Base base20 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!=hi!=", "hi!=");
        boolean boolean13 = response0.hasCookie("hi!==");
        boolean boolean15 = response0.hasHeader("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.cookie("hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str14, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!=");
        boolean boolean3 = keyVal2.hasInputStream();
        boolean boolean4 = keyVal2.hasInputStream();
        java.lang.String str5 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=hi!=" + "'", str5, "hi!=hi!=");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        boolean boolean5 = keyVal3.hasInputStream();
        java.lang.String str6 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding" + "'", str4, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding" + "'", str6, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        boolean boolean13 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        boolean boolean15 = response0.hasHeaderWithValue("hi!===hi!==hi!=", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        java.lang.String str6 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.cookie("hi!===hi!=");
        java.lang.String str9 = response0.header("hi!=");
        org.jsoup.Connection.Method method10 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("Content-Encoding");
        java.lang.String str14 = keyVal9.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.charset();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal10.inputStream(inputStream18);
        java.lang.String str20 = keyVal10.key();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str20, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean10 = response0.hasHeader("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!===hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base17 = response15.removeHeader("hi!");
        org.jsoup.Connection.Method method18 = response15.method();
        java.lang.String str20 = response15.header("Content-Encoding");
        java.util.Map map21 = response15.headers();
        org.jsoup.Connection.Base base24 = response15.header("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.Connection.Base base30 = response25.removeHeader("hi!");
        java.lang.String str31 = response25.statusMessage();
        int int32 = response25.statusCode();
        java.util.Map map33 = response25.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str35 = response15.contentType();
        java.util.Map map36 = response15.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        boolean boolean15 = response0.hasCookie("hi!==");
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.header("hi!===");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        boolean boolean23 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response0.body();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=");
        java.lang.String str14 = keyVal13.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=" + "'", str14, "hi!=");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        boolean boolean26 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=hi!==hi!");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        java.lang.String str17 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("hi!");
        java.util.Map map21 = response18.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.util.Map map23 = response1.headers();
        java.util.Map map24 = response1.cookies();
        org.jsoup.Connection.Base base27 = response1.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!===hi!==");
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response12.removeCookie("Content-Encoding");
        java.lang.String str16 = response12.header("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base19 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str22 = response20.cookie("hi!");
        java.util.Map map23 = response20.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Base base27 = response12.removeCookie("Content-Encoding");
        boolean boolean29 = response12.hasHeader("hi!==");
        java.lang.String str31 = response12.header("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.util.Map map32 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        java.lang.String str19 = response0.header("Content-Encoding==");
        java.lang.String str21 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response12.removeHeader("hi!");
        java.util.Map map15 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding=", "Content-Encoding=Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "Content-Encoding=Content-Encoding==");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("");
        java.lang.String str7 = keyVal6.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=Content-Encoding=" + "'", str4, "hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
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
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        java.lang.String str12 = keyVal11.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.key("hi!=hi!=");
        java.lang.String str15 = keyVal11.value();
        java.lang.String str16 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal11.key("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding" + "'", str15, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Content-Encoding" + "'", str16, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        org.jsoup.Connection.Method method19 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=");
        boolean boolean9 = keyVal3.hasInputStream();
        java.lang.String str10 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.Connection.Base base8 = response1.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str9 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Method method15 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.charset();
        java.util.Map map8 = response1.cookies();
        org.jsoup.Connection.Base base10 = response1.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base13 = response1.header("hi!===hi!=", "hi!==hi!");
        org.jsoup.Connection.Base base15 = response1.removeHeader("hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.lang.String str15 = response11.cookie("Content-Encoding");
        java.lang.String str16 = response11.statusMessage();
        org.jsoup.Connection.Base base18 = response11.removeCookie("Content-Encoding");
        java.net.URL uRL19 = response11.url();
        org.jsoup.Connection.Base base22 = response11.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base24 = response11.removeHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map25 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.lang.String str28 = response0.cookie("Content-Encoding==");
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base30 = response0.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "");
        java.util.Map map18 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
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
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.util.Map map22 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response0.body();
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
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.util.Map map22 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        java.lang.String str14 = response0.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=hi!=");
        java.net.URL uRL19 = response0.url();
        java.util.Map map20 = response0.headers();
        org.jsoup.Connection.Base base23 = response0.header("Content-Encoding=hi!", "Content-Encoding=Content-Encoding==");
        java.lang.String str24 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Base base11 = response1.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        org.jsoup.Connection.Base base13 = response1.removeCookie("hi!");
        int int14 = response1.statusCode();
        org.jsoup.Connection.Base base16 = response1.removeHeader("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str9 = response0.header("hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding", "hi!==");
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=hi!", "hi!===hi!=");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.headers();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.lang.String str22 = response18.contentType();
        java.util.Map map23 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map map25 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str7 = response0.cookie("Content-Encoding===hi!==hi!");
        java.lang.String str9 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.header("hi!", "hi!");
        boolean boolean14 = response0.hasHeader("hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        java.util.Map map37 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        java.util.Map map22 = response0.headers();
        java.net.URL uRL23 = response0.url();
        org.jsoup.Connection.Base base26 = response0.header("Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response0.parse();
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
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        int int17 = response0.statusCode();
        org.jsoup.Connection.Method method18 = response0.method();
        org.jsoup.Connection.Base base21 = response0.cookie("Content-Encoding=Content-Encoding===", "");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("Content-Encoding=");
        java.lang.String str13 = response0.header("hi!==");
        boolean boolean15 = response0.hasHeader("Content-Encoding=");
        boolean boolean17 = response0.hasHeader("Content-Encoding==hi!===hi!=");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.url(uRL18);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.header("hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str20 = response0.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.cookie("Content-Encoding=");
        int int8 = response0.statusCode();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base13 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding=");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!=", "");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==hi!");
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        org.jsoup.Connection.Base base15 = response11.removeCookie("Content-Encoding");
        int int16 = response11.statusCode();
        boolean boolean18 = response11.hasCookie("hi!=");
        org.jsoup.Connection.Base base20 = response11.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean22 = response11.hasHeader("hi!");
        java.lang.String str23 = response11.statusMessage();
        java.util.Map map24 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str26 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.statusMessage();
        int int6 = response0.statusCode();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        boolean boolean18 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding==", "hi!===hi!=");
        boolean boolean18 = response0.hasHeader("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.header("hi!===Content-Encoding=");
        java.lang.String str8 = response0.header("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.cookie("Content-Encoding");
        java.lang.String str6 = response1.statusMessage();
        java.lang.String str7 = response1.charset();
        java.util.Map map8 = response1.cookies();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean12 = response1.hasHeaderWithValue("hi!=hi!==hi!", "hi!=hi!=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        boolean boolean18 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str7 = response0.cookie("Content-Encoding===hi!==hi!");
        java.lang.String str9 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        java.util.Map map22 = response0.cookies();
        java.net.URL uRL23 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response0.parse();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.cookie("Content-Encoding=");
        int int8 = response0.statusCode();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasHeader("hi!==hi!");
        boolean boolean11 = response0.hasCookie("hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!");
        boolean boolean14 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "hi!");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Method method16 = response0.method();
        boolean boolean18 = response0.hasHeader("hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding=hi!==hi!", "hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.header("", "hi!==hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        boolean boolean22 = response0.hasHeaderWithValue("hi!=hi!==hi!===hi!=", "hi!=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        boolean boolean15 = response0.hasHeader("hi!=hi!=");
        boolean boolean17 = response0.hasCookie("hi!=hi!=Content-Encoding=");
        java.util.Map map18 = response0.cookies();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass13 = base12.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "Content-Encoding=Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        boolean boolean6 = response0.hasCookie("hi!==");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasHeader("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("hi!=Content-Encoding");
        java.lang.String str8 = keyVal5.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        java.lang.String str11 = keyVal10.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=Content-Encoding" + "'", str8, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=" + "'", str11, "Content-Encoding=");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6, "Content-Encoding=");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        boolean boolean6 = response0.hasHeaderWithValue("hi!=hi!==", "hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = keyVal7.inputStream();
        java.lang.String str10 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding" + "'", str10, "Content-Encoding");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=hi!=hi!==Content-Encoding", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding==", "");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        boolean boolean7 = response0.hasHeaderWithValue("hi!===hi!=", "hi!");
        boolean boolean9 = response0.hasCookie("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.lang.String str13 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("Content-Encoding=hi!");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.lang.String str11 = keyVal10.value();
        java.lang.String str12 = keyVal10.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6, "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=hi!=" + "'", str12, "Content-Encoding=hi!=");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        boolean boolean10 = response0.hasCookie("hi!");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=hi!", "hi!=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==hi!=", "hi!===hi!");
        boolean boolean12 = response0.hasCookie("hi!===hi!");
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!=", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.lang.String str5 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=" + "'", str4, "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=" + "'", str5, "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal3.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.contentType();
        boolean boolean14 = response0.hasHeaderWithValue("hi!==hi!", "hi!=Content-Encoding=");
        java.lang.String str15 = response0.charset();
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        boolean boolean22 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!===hi!==hi!==hi!=hi!=");
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        boolean boolean18 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!==");
        boolean boolean17 = response0.hasHeaderWithValue("hi!=", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean4 = response0.hasHeader("Content-Encoding=hi!");
        java.net.URL uRL5 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        java.net.URL uRL19 = response0.url();
        java.lang.String str21 = response0.header("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Method method22 = response0.method();
        org.jsoup.Connection.Base base25 = response0.cookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
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
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        org.jsoup.Connection.Base base25 = response0.removeCookie("Content-Encoding==");
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
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("Content-Encoding=hi!=hi!=");
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Base base19 = response0.cookie("Content-Encoding", "hi!===Content-Encoding=");
        org.jsoup.Connection.Method method20 = response0.method();
        org.jsoup.Connection.Base base22 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.Connection.Base base19 = response14.removeHeader("hi!");
        org.jsoup.Connection.Method method20 = response14.method();
        java.lang.String str21 = response14.statusMessage();
        java.net.URL uRL22 = response14.url();
        java.lang.String str24 = response14.header("");
        java.lang.String str25 = response14.statusMessage();
        boolean boolean28 = response14.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!=hi!=");
        java.util.Map map29 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.Connection.Base base32 = response0.removeCookie("Content-Encoding=Content-Encoding===hi!");
        int int33 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        java.lang.String str23 = response0.statusMessage();
        org.jsoup.Connection.Base base25 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base28 = response0.cookie("hi!==hi!=hi!=", "hi!===hi!==Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(base28);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("hi!");
        org.jsoup.Connection.Base base13 = response9.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.Connection.Method method16 = response9.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        org.jsoup.Connection.Base base22 = response17.removeHeader("hi!");
        org.jsoup.Connection.Method method23 = response17.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.Connection.Base base30 = response0.removeHeader("hi!=Content-Encoding");
        java.lang.String str31 = response0.statusMessage();
        org.jsoup.Connection.Base base33 = response0.removeCookie("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Method method34 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(method34);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.util.Map map23 = response0.headers();
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base25 = response0.url(uRL24);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        boolean boolean8 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("Content-Encoding=Content-Encoding==");
        java.lang.String str14 = response0.statusMessage();
        int int15 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.header("hi!", "Content-Encoding=Content-Encoding=");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Encoding");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.header("");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding==", "Content-Encoding===hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=Content-Encoding");
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=");
        java.lang.String str20 = response0.header("Content-Encoding=");
        boolean boolean22 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str24 = response0.cookie("Content-Encoding==hi!===hi!==hi!=");
        boolean boolean27 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str18 = response0.cookie("hi!=");
        java.lang.String str19 = response0.charset();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        boolean boolean10 = keyVal7.hasInputStream();
        java.io.InputStream inputStream11 = keyVal7.inputStream();
        boolean boolean12 = keyVal7.hasInputStream();
        java.lang.String str13 = keyVal7.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal7.key("hi!=");
        java.io.InputStream inputStream16 = keyVal15.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.value("Content-Encoding");
        java.lang.String str14 = keyVal13.toString();
        java.io.InputStream inputStream15 = keyVal13.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str14, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.cookie("hi!=hi!=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.header("hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=Content-Encoding=");
        java.lang.String str7 = keyVal6.key();
        boolean boolean8 = keyVal6.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        org.jsoup.Connection.Method method23 = response15.method();
        org.jsoup.Connection.Base base25 = response15.removeCookie("hi!=");
        java.lang.String str27 = response15.header("Content-Encoding=");
        java.util.Map map28 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str30 = response0.statusMessage();
        org.jsoup.Connection.Base base32 = response0.removeCookie("hi!==hi!=hi!=");
        boolean boolean34 = response0.hasHeader("hi!=Content-Encoding=hi!");
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
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        java.lang.String str13 = response0.contentType();
        org.jsoup.Connection.Method method14 = response0.method();
        java.util.Map map15 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str9 = response0.header("hi!==hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!=Content-Encoding=hi!=", "hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!==Content-Encoding", "Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        boolean boolean21 = response0.hasHeader("hi!==hi!=Content-Encoding");
        java.lang.String str22 = response0.charset();
        java.util.Map map23 = response0.headers();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str13 = response0.header("Content-Encoding=Content-Encoding===");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        java.util.Map map23 = response0.headers();
        java.lang.String str24 = response0.statusMessage();
        java.lang.String str26 = response0.header("hi!==hi!=");
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
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=");
        java.lang.String str12 = keyVal6.value();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.inputStream(inputStream13);
        java.lang.String str15 = keyVal6.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=hi!=" + "'", str15, "hi!=hi!=");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        java.util.Map map24 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!===hi!=" + "'", str3, "hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        boolean boolean21 = keyVal20.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding===hi!==hi!");
        java.net.URL uRL10 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=hi!=Content-Encoding=" + "'", str3, "Content-Encoding=hi!=Content-Encoding=");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("Content-Encoding=Content-Encoding==");
        boolean boolean9 = keyVal8.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("Content-Encoding=Content-Encoding===hi!");
        java.io.InputStream inputStream12 = keyVal8.inputStream();
        java.lang.String str13 = keyVal8.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding===hi!" + "'", str13, "Content-Encoding=Content-Encoding===hi!");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        org.jsoup.Connection.Base base29 = response0.removeCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        int int30 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("Content-Encoding=hi!=hi!=");
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Base base19 = response0.cookie("Content-Encoding", "hi!===Content-Encoding=");
        java.lang.String str20 = response0.statusMessage();
        boolean boolean22 = response0.hasHeader("hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream12 = keyVal5.inputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("Content-Encoding=Content-Encoding=hi!=");
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=");
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        boolean boolean7 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        java.net.URL uRL21 = response0.url();
        java.lang.String str23 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!===hi!=");
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("Content-Encoding=");
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!=Content-Encoding=");
        boolean boolean17 = response0.hasHeaderWithValue("hi!", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!=", "hi!=hi!==");
        java.net.URL uRL16 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        int int14 = response0.statusCode();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response10.cookie("hi!", "hi!");
        java.lang.String str14 = response10.charset();
        java.lang.String str16 = response10.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL17 = response10.url();
        org.jsoup.Connection.Base base20 = response10.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str22 = response10.header("hi!=");
        java.lang.String str23 = response10.statusMessage();
        org.jsoup.Connection.Base base25 = response10.removeHeader("Content-Encoding");
        java.lang.String str27 = response10.header("hi!==hi!");
        org.jsoup.Connection.Base base29 = response10.removeCookie("Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response30.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str35 = response33.cookie("hi!");
        java.util.Map map36 = response33.headers();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        boolean boolean40 = response30.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map41 = response30.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.util.Map map44 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Base base11 = response1.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str13 = response1.header("hi!=");
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.charset();
        java.lang.String str17 = response1.header("hi!=Content-Encoding");
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.cookie("Content-Encoding=Content-Encoding===hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.header("hi!==hi!=hi!=");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding==hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.header("hi!===Content-Encoding=");
        java.lang.String str17 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!===hi!=", "Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("hi!==");
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean15 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        int int16 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.lang.String str8 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.cookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=Content-Encoding=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.Class<?> wildcardClass6 = keyVal5.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.key();
        boolean boolean6 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.net.URL uRL39 = response0.url();
        java.net.URL uRL40 = response0.url();
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
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(uRL40);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        java.lang.String str10 = response0.header("hi!==hi!");
        java.lang.String str12 = response0.header("hi!==hi!=Content-Encoding");
        boolean boolean14 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=");
        java.lang.String str20 = response0.header("Content-Encoding=");
        boolean boolean23 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding==hi!===hi!=");
        java.lang.String str24 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        java.net.URL uRL43 = response0.url();
        org.jsoup.Connection.Base base46 = response0.cookie("hi!==hi!", "");
        org.jsoup.Connection.Base base48 = response0.removeCookie("hi!===hi!==Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNotNull(base46);
        org.junit.Assert.assertNotNull(base48);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!=hi!=");
        boolean boolean7 = response0.hasHeader("hi!=Content-Encoding=");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!==hi!==hi!=hi!=", "Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!" + "'", str3, "hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str13 = response0.statusMessage();
        boolean boolean16 = response0.hasHeaderWithValue("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response19.removeCookie("Content-Encoding");
        java.util.Map map22 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base26 = response24.removeCookie("Content-Encoding");
        java.lang.String str28 = response24.header("");
        java.lang.String str29 = response24.statusMessage();
        org.jsoup.Connection.Base base32 = response24.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base35 = response24.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL36 = response24.url();
        org.jsoup.Connection.Method method37 = response24.method();
        boolean boolean40 = response24.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base44 = response41.cookie("hi!", "hi!");
        java.lang.String str45 = response41.charset();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str48 = response46.cookie("hi!");
        java.lang.String str50 = response46.cookie("Content-Encoding");
        java.lang.String str51 = response46.statusMessage();
        java.lang.String str52 = response46.charset();
        boolean boolean54 = response46.hasCookie("Content-Encoding");
        java.util.Map map55 = response46.cookies();
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        java.net.URL uRL57 = response41.url();
        java.net.URL uRL58 = response41.url();
        org.jsoup.Connection.Base base61 = response41.cookie("Content-Encoding=Content-Encoding=", "");
        java.lang.String str62 = response41.statusMessage();
        org.jsoup.helper.HttpConnection.Response response63 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map64 = response63.headers();
        java.lang.String str66 = response63.header("Content-Encoding");
        org.jsoup.Connection.Base base68 = response63.removeHeader("hi!");
        java.util.Map map69 = response63.cookies();
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        java.util.Map map72 = response24.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map72);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(base44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(uRL57);
        org.junit.Assert.assertNull(uRL58);
        org.junit.Assert.assertNotNull(base61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(base68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
        java.io.InputStream inputStream14 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.value("Content-Encoding=hi!==hi!");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.inputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.inputStream(inputStream19);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        java.net.URL uRL43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base44 = response0.url(uRL43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==", "Content-Encoding==");
        org.jsoup.Connection.Method method14 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding===", "Content-Encoding=Content-Encoding==");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = keyVal2.inputStream();
        java.lang.String str10 = keyVal2.key();
        java.lang.String str11 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.value("hi!===hi!==");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal2.inputStream(inputStream14);
        java.lang.String str16 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("hi!");
        org.jsoup.Connection.Base base13 = response9.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.Connection.Method method16 = response9.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        org.jsoup.Connection.Base base22 = response17.removeHeader("hi!");
        org.jsoup.Connection.Method method23 = response17.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.Connection.Method method29 = response0.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map31 = response30.headers();
        java.lang.String str33 = response30.header("Content-Encoding");
        org.jsoup.Connection.Base base35 = response30.removeHeader("hi!");
        org.jsoup.Connection.Method method36 = response30.method();
        java.lang.String str37 = response30.statusMessage();
        org.jsoup.Connection.Method method38 = response30.method();
        org.jsoup.Connection.Base base40 = response30.removeCookie("hi!=");
        java.util.Map map41 = response30.cookies();
        java.util.Map map42 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        java.lang.String str44 = response0.statusMessage();
        java.net.URL uRL45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base46 = response0.url(uRL45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.util.Map map12 = response0.cookies();
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean10 = response0.hasHeaderWithValue("hi!==Content-Encoding", "hi!=hi!==");
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===Content-Encoding==hi!==hi!", "hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method12 = response0.method();
        java.net.URL uRL13 = response0.url();
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        java.util.Map map13 = response0.cookies();
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!==hi!");
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==");
        java.lang.String str13 = response0.cookie("hi!==hi!=hi!=");
        boolean boolean16 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.Connection.Base base30 = response25.removeHeader("hi!");
        java.lang.String str32 = response25.header("hi!");
        java.lang.String str33 = response25.statusMessage();
        java.util.Map map34 = response25.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
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
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str12 = keyVal11.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding===hi!=hi!==hi!" + "'", str12, "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        boolean boolean10 = keyVal8.hasInputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        java.lang.String str13 = keyVal8.toString();
        java.lang.String str14 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=" + "'", str13, "hi!=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        boolean boolean23 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str24 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!==hi!=Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str4, "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=Content-Encoding=" + "'", str5, "hi!=Content-Encoding=");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!===Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base6 = response0.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.header("hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response10.cookie("hi!", "hi!");
        java.lang.String str14 = response10.charset();
        java.util.Map map15 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        java.lang.String str24 = response0.charset();
        boolean boolean26 = response0.hasHeader("Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!==", "");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean12 = response0.hasHeader("Content-Encoding==hi!===hi!==hi!=");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
        java.lang.Class<?> wildcardClass21 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        java.lang.String str8 = keyVal6.value();
        java.lang.String str9 = keyVal6.value();
        java.io.InputStream inputStream10 = keyVal6.inputStream();
        java.lang.String str11 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal6.key("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.value();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.value("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal3.key("hi!==hi!=hi!=");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset();
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.contentType();
        boolean boolean8 = response1.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base11 = response1.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!" + "'", str3, "hi!==hi!");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.inputStream(inputStream14);
        java.lang.String str16 = keyVal12.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!", "hi!=hi!==hi!");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response8.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.cookie("Content-Encoding", "hi!");
        java.lang.String str14 = response8.charset();
        java.lang.String str15 = response8.statusMessage();
        boolean boolean18 = response8.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map19 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Base base22 = response0.removeHeader("Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        java.lang.String str16 = response0.statusMessage();
        int int17 = response0.statusCode();
        boolean boolean19 = response0.hasCookie("hi!=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=hi!=", "hi!==hi!=Content-Encoding");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!==hi!" + "'", str4, "hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!", "Content-Encoding==hi!===hi!==hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "hi!");
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        org.jsoup.Connection.Base base15 = response1.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean17 = response1.hasCookie("hi!");
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!=hi!=");
        java.lang.String str22 = response1.header("Content-Encoding=Content-Encoding==");
        java.lang.String str24 = response1.cookie("hi!==");
        java.net.URL uRL25 = response1.url();
        org.jsoup.Connection.Base base27 = response1.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal6.toString();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        int int17 = response0.statusCode();
        java.util.Map map18 = response0.headers();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.Connection.Base base22 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding");
        java.util.Map map23 = response0.headers();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.inputStream(inputStream11);
        java.lang.String str13 = keyVal12.key();
        java.lang.String str14 = keyVal12.value();
        java.io.InputStream inputStream15 = keyVal12.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str6 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.net.URL uRL6 = response0.url();
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
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal21.value("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.value();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.value("Content-Encoding=Content-Encoding");
        boolean boolean13 = keyVal3.hasInputStream();
        boolean boolean14 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.lang.String str12 = response0.header("Content-Encoding=");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        java.lang.String str12 = response0.header("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.headers();
        java.util.Map map5 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str12 = keyVal11.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding=Content-Encoding===hi!=hi!==hi!" + "'", str12, "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        java.io.InputStream inputStream14 = keyVal11.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        java.util.Map map40 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=hi!=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding=hi!=Content-Encoding=hi!=hi!=", "hi!=hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        boolean boolean38 = response0.hasCookie("hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal4.inputStream();
        java.lang.String str10 = keyVal4.toString();
        java.lang.String str11 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=" + "'", str10, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=" + "'", str11, "Content-Encoding=");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        org.jsoup.Connection.Method method20 = response0.method();
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
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=");
        java.util.Map map15 = response0.cookies();
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.header("hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("hi!");
        org.jsoup.Connection.Base base13 = response9.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.Connection.Method method16 = response9.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str20 = response17.header("Content-Encoding");
        org.jsoup.Connection.Base base22 = response17.removeHeader("hi!");
        org.jsoup.Connection.Method method23 = response17.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.Connection.Base base30 = response0.removeHeader("hi!=Content-Encoding");
        int int31 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding===hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==Content-Encoding" + "'", str5, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        boolean boolean62 = response0.hasHeaderWithValue("hi!==hi!=", "hi!===hi!==Content-Encoding=Content-Encoding==");
        java.net.URL uRL63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base64 = response0.url(uRL63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal5.value();
        java.lang.Class<?> wildcardClass9 = keyVal5.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.key("hi!===hi!==Content-Encoding=Content-Encoding=");
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
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.contentType();
        java.lang.String str21 = response0.header("hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding==", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str4, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("Content-Encoding");
        java.util.Map map7 = response1.headers();
        java.lang.String str8 = response1.contentType();
        boolean boolean10 = response1.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Base base14 = response1.header("hi!==hi!", "hi!=");
        org.jsoup.Connection.Base base16 = response1.removeCookie("Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!===hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.header("hi!===hi!=", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL17 = response0.url();
        java.lang.String str19 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.jsoup.Connection.Base base21 = response0.removeHeader("hi!=Content-Encoding=");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.cookie("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        java.lang.String str13 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=" + "'", str13, "hi!=");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.headers();
        java.lang.String str10 = response7.header("Content-Encoding");
        org.jsoup.Connection.Base base12 = response7.removeHeader("Content-Encoding");
        java.lang.String str14 = response7.header("hi!");
        java.lang.String str15 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str19 = response16.header("Content-Encoding");
        java.lang.String str20 = response16.statusMessage();
        org.jsoup.Connection.Base base23 = response16.cookie("hi!=", "Content-Encoding=Content-Encoding");
        boolean boolean25 = response16.hasCookie("Content-Encoding");
        boolean boolean27 = response16.hasHeader("hi!");
        java.util.Map map28 = response16.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str32 = response0.cookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!===hi!==Content-Encoding=Content-Encoding==", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==" + "'", str4, "Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==");
        java.lang.String str13 = response0.cookie("hi!==hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding=");
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding==");
        java.lang.String str12 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean14 = response0.hasCookie("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.headers();
        java.net.URL uRL10 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!==", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document39 = response0.parse();
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
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!");
        boolean boolean14 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "hi!");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.Class<?> wildcardClass17 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.cookie("Content-Encoding=hi!=hi!=");
        java.util.Map map12 = response0.headers();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!===Content-Encoding=", "hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===", "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
        java.util.Map map16 = response0.headers();
        java.lang.String str18 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.header("hi!", "Content-Encoding=Content-Encoding=");
        boolean boolean5 = response0.hasHeader("Content-Encoding==");
        boolean boolean8 = response0.hasHeaderWithValue("hi!==hi!", "Content-Encoding==");
        boolean boolean11 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding", "");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.headers();
        java.lang.String str10 = response7.header("Content-Encoding");
        java.lang.String str11 = response7.contentType();
        org.jsoup.Connection.Base base14 = response7.header("Content-Encoding", "");
        java.util.Map map15 = response7.headers();
        java.net.URL uRL16 = response7.url();
        java.lang.String str17 = response7.charset();
        java.util.Map map18 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!=" + "'", str4, "hi!=hi!=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=");
        java.lang.String str14 = keyVal13.toString();
        boolean boolean15 = keyVal13.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding=hi!=" + "'", str14, "Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.url(uRL19);
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
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        org.jsoup.Connection.Base base17 = response0.cookie("hi!==hi!=Content-Encoding", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
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
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.lang.String str7 = response0.statusMessage();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.util.Map map16 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        java.net.URL uRL60 = response0.url();
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
        org.junit.Assert.assertNull(uRL60);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base41 = response39.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base44 = response39.cookie("Content-Encoding", "hi!");
        java.lang.String str45 = response39.charset();
        java.lang.String str46 = response39.statusMessage();
        boolean boolean49 = response39.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map50 = response39.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.lang.String str53 = response0.cookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base56 = response0.header("Content-Encoding==hi!=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        java.util.Map map57 = response0.cookies();
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
        org.junit.Assert.assertNotNull(base44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("Content-Encoding=Content-Encoding==", "Content-Encoding=hi!==hi!");
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
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.contentType();
        java.lang.Class<?> wildcardClass20 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        int int12 = response0.statusCode();
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.Connection.Base base19 = response14.removeHeader("hi!");
        org.jsoup.Connection.Method method20 = response14.method();
        java.lang.String str21 = response14.statusMessage();
        java.net.URL uRL22 = response14.url();
        java.util.Map map23 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding==hi!===hi!=");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.lang.String str7 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding==hi!===hi!=" + "'", str7, "Content-Encoding==hi!===hi!=");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        boolean boolean13 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        boolean boolean23 = response0.hasHeaderWithValue("hi!=hi!==hi!===hi!=", "hi!===hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
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
        int int16 = response0.statusCode();
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        java.io.InputStream inputStream8 = keyVal4.inputStream();
        java.lang.String str9 = keyVal4.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str9, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response12.removeCookie("Content-Encoding");
        java.lang.String str16 = response12.header("");
        java.lang.String str17 = response12.statusMessage();
        org.jsoup.Connection.Base base20 = response12.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base23 = response12.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL24 = response12.url();
        org.jsoup.Connection.Method method25 = response12.method();
        boolean boolean28 = response12.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response29.cookie("hi!", "hi!");
        java.lang.String str33 = response29.charset();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str36 = response34.cookie("hi!");
        java.lang.String str38 = response34.cookie("Content-Encoding");
        java.lang.String str39 = response34.statusMessage();
        java.lang.String str40 = response34.charset();
        boolean boolean42 = response34.hasCookie("Content-Encoding");
        java.util.Map map43 = response34.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        java.net.URL uRL45 = response29.url();
        java.net.URL uRL46 = response29.url();
        org.jsoup.Connection.Base base49 = response29.cookie("Content-Encoding=Content-Encoding=", "");
        java.lang.String str50 = response29.statusMessage();
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map52 = response51.headers();
        java.lang.String str54 = response51.header("Content-Encoding");
        org.jsoup.Connection.Base base56 = response51.removeHeader("hi!");
        java.util.Map map57 = response51.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        boolean boolean63 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!==");
        java.util.Map map64 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(uRL45);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.value();
        java.lang.String str6 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding" + "'", str4, "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=hi!" + "'", str5, "hi!=hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=hi!" + "'", str6, "hi!=hi!");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        org.jsoup.Connection.Base base17 = response0.header("hi!", "hi!==hi!=hi!=");
        java.lang.String str18 = response0.contentType();
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
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
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==");
        java.lang.String str13 = response0.cookie("hi!==hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=");
        boolean boolean17 = response0.hasCookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.cookie("Content-Encoding=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding===");
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!==Content-Encoding");
        boolean boolean24 = response0.hasCookie("hi!==hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        boolean boolean19 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method20 = response0.method();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        java.util.Map map13 = response0.cookies();
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding==hi!===hi!==hi!=", "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response0.contentType();
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding==hi!===hi!=");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        boolean boolean14 = response1.hasCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("hi!");
        java.lang.String str19 = response15.cookie("Content-Encoding");
        java.lang.String str20 = response15.statusMessage();
        org.jsoup.Connection.Base base22 = response15.removeCookie("Content-Encoding");
        java.net.URL uRL23 = response15.url();
        org.jsoup.Connection.Base base26 = response15.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base28 = response15.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str29 = response15.contentType();
        java.util.Map map30 = response15.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        java.lang.String str17 = response0.statusMessage();
        java.util.Map map18 = response0.headers();
        java.util.Map map19 = response0.headers();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
        java.lang.String str22 = response0.header("hi!==hi!");
        org.jsoup.Connection.Method method23 = response0.method();
        java.lang.String str24 = response0.contentType();
        java.lang.String str25 = response0.contentType();
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
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str11 = response0.cookie("hi!");
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!=" + "'", str4, "hi!=hi!=");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        java.util.Map map19 = response0.headers();
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
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("hi!==hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean15 = response0.hasCookie("hi!==hi!");
        java.lang.String str17 = response0.header("hi!===hi!==");
        org.jsoup.Connection.Base base20 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding==hi!===hi!=");
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
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "hi!===Content-Encoding==hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.lang.String str9 = keyVal2.key();
        java.lang.String str10 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        java.lang.String str42 = response0.cookie("Content-Encoding");
        java.lang.String str44 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        org.jsoup.Connection.Base base15 = response1.cookie("Content-Encoding=Content-Encoding", "");
        boolean boolean17 = response1.hasCookie("hi!");
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base22 = response1.removeHeader("hi!=hi!=");
        int int23 = response1.statusCode();
        org.jsoup.Connection.Base base25 = response1.removeHeader("Content-Encoding=hi!==hi!");
        java.util.Map map26 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding==", "hi!===hi!=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!=" + "'", str4, "hi!===hi!=");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        boolean boolean28 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        int int29 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        java.util.Map map25 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str9 = response0.header("hi!==hi!");
        java.util.Map map10 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.util.Map map14 = response11.headers();
        int int15 = response11.statusCode();
        java.util.Map map16 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str19 = response0.header("hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        java.util.Map map28 = response0.headers();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        boolean boolean15 = keyVal10.hasInputStream();
        boolean boolean16 = keyVal10.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding=", "");
        org.jsoup.Connection.Base base19 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding", "hi!==Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        int int22 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
        int int17 = response0.statusCode();
        java.util.Map map18 = response0.headers();
        boolean boolean20 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        boolean boolean22 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.net.URL uRL23 = response0.url();
        boolean boolean25 = response0.hasCookie("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        org.jsoup.Connection.Method method21 = response0.method();
        boolean boolean23 = response0.hasCookie("hi!==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!==", "");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!=Content-Encoding");
        boolean boolean12 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.lang.String str14 = response0.header("hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("hi!==");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base12 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=hi!==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Base base9 = response6.removeHeader("Content-Encoding");
        int int10 = response6.statusCode();
        java.util.Map map11 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.charset();
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
        java.lang.String str19 = keyVal18.key();
        java.lang.Class<?> wildcardClass20 = keyVal18.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!===hi!=" + "'", str19, "hi!===hi!=");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!");
        java.net.URL uRL9 = response0.url();
        java.lang.String str11 = response0.cookie("hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!===hi!==", "Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        boolean boolean5 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("Content-Encoding===hi!==hi!");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.value("hi!==");
        boolean boolean10 = keyVal6.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding==hi!===hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        java.lang.String str8 = response0.charset();
        java.net.URL uRL9 = response0.url();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        java.lang.String str11 = keyVal7.toString();
        java.lang.String str12 = keyVal7.key();
        java.lang.String str13 = keyVal7.key();
        java.lang.String str14 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=" + "'", str11, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Encoding" + "'", str12, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding" + "'", str13, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        boolean boolean16 = response0.hasHeader("hi!===hi!==");
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
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
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
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        java.lang.String str50 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str52 = response0.header("Content-Encoding=hi!==hi!");
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
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        boolean boolean11 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Base base15 = response0.cookie("hi!", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        java.net.URL uRL18 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasHeader("hi!===Content-Encoding==hi!==hi!");
        boolean boolean14 = response0.hasHeader("Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
    }
}

