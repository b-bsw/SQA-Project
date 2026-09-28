package org.jsoup.helper;

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
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str15 = response0.contentType();
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!=");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        java.lang.String str6 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=Content-Encoding=Content-Encoding=hi!=hi!=" + "'", str6, "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!===hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasHeader("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base25 = response0.method(method24);
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.value("");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str5, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!===" + "'", str3, "hi!===");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        java.lang.String str17 = response0.charset();
        int int18 = response0.statusCode();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.Connection.Base base21 = response0.removeCookie("hi!===hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.cookie("hi!=");
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeCookie("Content-Encoding");
        java.lang.String str5 = response1.header("");
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Base base9 = response1.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base12 = response1.cookie("Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding");
        java.lang.String str13 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str4, "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        boolean boolean5 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean11 = response1.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str12 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        boolean boolean27 = response0.hasHeaderWithValue("hi!==hi!", "hi!===hi!=");
        java.net.URL uRL28 = response0.url();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(uRL28);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("hi!", "hi!");
        java.lang.String str12 = response8.charset();
        java.lang.String str13 = response8.contentType();
        java.lang.String str14 = response8.charset();
        java.util.Map map15 = response8.cookies();
        org.jsoup.Connection.Base base17 = response8.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base20 = response8.header("hi!===hi!=", "hi!==hi!");
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
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        boolean boolean44 = response0.hasCookie("Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(base20);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!");
        boolean boolean13 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.header("hi!==");
        org.jsoup.Connection.Base base16 = response0.cookie("Content-Encoding", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        int int17 = response0.statusCode();
        java.lang.String str18 = response0.charset();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!===Content-Encoding=");
        java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
            byte[] byteArray25 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        org.jsoup.Connection.Method method18 = response0.method();
        org.jsoup.Connection.Base base21 = response0.header("Content-Encoding===hi!==hi!", "hi!===Content-Encoding=");
        org.jsoup.Connection.Base base23 = response0.removeHeader("hi!=Content-Encoding=hi!");
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        boolean boolean18 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        boolean boolean21 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==hi!=", "hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=Content-Encoding");
        java.lang.String str13 = keyVal12.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str13, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.jsoup.Connection.Base base47 = response0.cookie("hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document48 = response0.parse();
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
        org.junit.Assert.assertNotNull(base47);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.header("Content-Encoding");
        org.jsoup.Connection.Base base11 = response6.removeHeader("hi!");
        java.lang.String str13 = response6.header("hi!");
        java.lang.String str14 = response6.statusMessage();
        java.util.Map map15 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        org.jsoup.Connection.Base base18 = response0.removeCookie("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        org.jsoup.Connection.Base base27 = response0.header("hi!=hi!==hi!===hi!=", "hi!=Content-Encoding=hi!");
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
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!", "Content-Encoding=Content-Encoding==");
        java.lang.String str11 = response0.header("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str3, "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        boolean boolean10 = response0.hasHeader("hi!===hi!=");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!=hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response0.parse();
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
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.Class<?> wildcardClass4 = base3.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        boolean boolean17 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding=hi!", "Content-Encoding=Content-Encoding==hi!=");
        java.net.URL uRL17 = response0.url();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding===hi!==hi!");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=Content-Encoding===hi!==hi!" + "'", str3, "Content-Encoding=Content-Encoding===hi!==hi!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.lang.String str10 = keyVal7.value();
        java.io.InputStream inputStream11 = keyVal7.inputStream();
        java.lang.String str12 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!===hi!==", "Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!");
        java.util.Map map11 = response0.headers();
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
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.String str13 = keyVal2.value();
        java.lang.String str14 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding" + "'", str13, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        int int12 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        org.jsoup.Connection.Base base30 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=");
        java.lang.Class<?> wildcardClass31 = response0.getClass();
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
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.inputStream(inputStream10);
        java.lang.String str12 = keyVal11.key();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        java.io.InputStream inputStream15 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Method method21 = response0.method();
        int int22 = response0.statusCode();
        boolean boolean24 = response0.hasCookie("hi!==Content-Encoding");
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
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map13 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.Connection.Base base19 = response14.removeHeader("Content-Encoding");
        java.util.Map map20 = response14.headers();
        java.util.Map map21 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.Class<?> wildcardClass23 = map21.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!==hi!=hi!=");
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal7.key();
        java.lang.Class<?> wildcardClass11 = keyVal7.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!==Content-Encoding=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal6.toString();
        java.io.InputStream inputStream8 = keyVal6.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.String str14 = keyVal11.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL14 = response0.url();
        int int15 = response0.statusCode();
        java.lang.String str17 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("hi!");
        java.lang.String str22 = response18.cookie("Content-Encoding");
        java.lang.String str23 = response18.statusMessage();
        org.jsoup.Connection.Base base25 = response18.removeCookie("Content-Encoding");
        java.net.URL uRL26 = response18.url();
        org.jsoup.Connection.Base base29 = response18.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base31 = response18.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str32 = response18.contentType();
        java.util.Map map33 = response18.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean13 = response0.hasCookie("hi!===Content-Encoding=");
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("hi!=hi!=");
        boolean boolean17 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding==", "hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.key("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.headers();
        java.util.Map map7 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        org.jsoup.Connection.Base base22 = response19.removeHeader("Content-Encoding");
        java.lang.String str24 = response19.header("hi!=");
        int int25 = response19.statusCode();
        java.lang.String str26 = response19.statusMessage();
        java.net.URL uRL27 = response19.url();
        java.util.Map map28 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        int int30 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.removeHeader("hi!");
        java.lang.String str15 = response8.cookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map16 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal10.value("hi!=");
        java.lang.String str17 = keyVal16.toString();
        java.io.InputStream inputStream18 = keyVal16.inputStream();
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
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding==hi!=" + "'", str17, "Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNull(inputStream18);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding=Content-Encoding==");
        java.lang.String str11 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=", "Content-Encoding=Content-Encoding");
        java.util.Map map13 = response0.headers();
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.header("hi!=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str9 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.String str21 = response0.contentType();
        java.lang.String str23 = response0.cookie("hi!==Content-Encoding");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!===hi!=", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("hi!");
        org.jsoup.Connection.Base base18 = response14.removeCookie("Content-Encoding");
        int int19 = response14.statusCode();
        java.util.Map map20 = response14.cookies();
        org.jsoup.Connection.Base base22 = response14.removeHeader("Content-Encoding=");
        java.util.Map map23 = response14.cookies();
        java.util.Map map24 = response14.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        java.lang.String str29 = response25.contentType();
        int int30 = response25.statusCode();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str33 = response31.cookie("hi!");
        java.lang.String str35 = response31.cookie("Content-Encoding");
        java.lang.String str36 = response31.statusMessage();
        java.lang.String str37 = response31.charset();
        boolean boolean39 = response31.hasCookie("Content-Encoding");
        java.util.Map map40 = response31.cookies();
        int int41 = response31.statusCode();
        java.lang.String str42 = response31.statusMessage();
        java.util.Map map43 = response31.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        java.lang.String str48 = response0.cookie("Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!==", "hi!=hi!=hi!==hi!");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        java.net.URL uRL9 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        java.lang.String str4 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.header("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        boolean boolean18 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Encoding=");
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.lang.String str25 = response0.charset();
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map map13 = response0.cookies();
        java.lang.String str14 = response0.charset();
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("hi!==hi!");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.header("hi!===Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        boolean boolean11 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal3.key("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream16 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!=", "");
        int int19 = response0.statusCode();
        org.jsoup.Connection.Base base22 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!");
        boolean boolean10 = keyVal3.hasInputStream();
        java.lang.String str11 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=hi!" + "'", str11, "hi!=hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        java.util.Map map21 = response0.cookies();
        java.lang.String str22 = response0.contentType();
        int int23 = response0.statusCode();
        java.net.URL uRL24 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding==");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str16 = response0.header("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base19 = response0.cookie("hi!=hi!=hi!==hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.lang.String str7 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        java.lang.String str15 = keyVal11.value();
        boolean boolean16 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding" + "'", str15, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        boolean boolean12 = response0.hasHeaderWithValue("hi!==hi!", "hi!=");
        org.jsoup.Connection.Method method13 = response0.method();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        java.lang.String str13 = response0.charset();
        boolean boolean15 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!=");
        java.util.Map map16 = response0.cookies();
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        int int6 = response1.statusCode();
        java.util.Map map7 = response1.cookies();
        org.jsoup.Connection.Base base9 = response1.removeHeader("Content-Encoding=");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Base base13 = response1.cookie("Content-Encoding=", "hi!==hi!");
        java.util.Map map14 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=");
        java.lang.String str15 = response0.cookie("Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        java.net.URL uRL17 = response0.url();
        java.lang.String str18 = response0.statusMessage();
        java.lang.String str20 = response0.cookie("hi!==Content-Encoding");
        java.util.Map map21 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        boolean boolean26 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!=", "");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("hi!");
        org.jsoup.Connection.Base base26 = response22.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method27 = response22.method();
        org.jsoup.Connection.Method method28 = response22.method();
        java.util.Map map29 = response22.cookies();
        java.lang.String str30 = response22.charset();
        java.util.Map map31 = response22.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasHeader("hi!=hi!=");
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.lang.String str13 = response0.header("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=", "Content-Encoding=Content-Encoding===hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "");
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("Content-Encoding=hi!=hi!=");
        boolean boolean18 = response0.hasHeaderWithValue("hi!", "hi!=Content-Encoding=");
        java.net.URL uRL19 = response0.url();
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base21 = response0.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!=" + "'", str4, "hi!===hi!=");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasCookie("hi!=");
        org.jsoup.Connection.Base base10 = response1.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str11 = response1.charset();
        boolean boolean13 = response1.hasHeader("Content-Encoding=Content-Encoding=");
        int int14 = response1.statusCode();
        java.lang.String str16 = response1.cookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        boolean boolean53 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==hi!=", "hi!===hi!");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        java.lang.String str17 = response0.cookie("Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!==", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.header("hi!=hi!==Content-Encoding=", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.Connection.Base base18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method19 = response13.method();
        java.lang.String str20 = response13.statusMessage();
        org.jsoup.Connection.Method method21 = response13.method();
        org.jsoup.Connection.Base base23 = response13.removeCookie("hi!=");
        java.util.Map map24 = response13.cookies();
        java.util.Map map25 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        java.lang.String str10 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        java.util.Map map13 = response0.headers();
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
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str45 = response43.cookie("hi!");
        java.lang.String str47 = response43.cookie("Content-Encoding");
        boolean boolean49 = response43.hasCookie("hi!");
        java.util.Map map50 = response43.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.util.Map map52 = response0.cookies();
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!==hi!");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        boolean boolean11 = keyVal10.hasInputStream();
        boolean boolean12 = keyVal10.hasInputStream();
        java.lang.Class<?> wildcardClass13 = keyVal10.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map map13 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.jsoup.Connection.Base base20 = response0.header("hi!==hi!", "hi!=");
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal3.value("hi!===hi!==");
        java.lang.Class<?> wildcardClass15 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str18 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=hi!=", "", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        boolean boolean12 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        java.lang.String str10 = keyVal9.toString();
        java.lang.String str11 = keyVal9.value();
        java.lang.String str12 = keyVal9.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!==hi!" + "'", str10, "hi!==hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=" + "'", str12, "hi!=");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        boolean boolean16 = response0.hasHeaderWithValue("hi!=hi!==hi!===hi!=", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        java.util.Map map17 = response0.cookies();
        java.lang.String str19 = response0.cookie("hi!=");
        int int20 = response0.statusCode();
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = response0.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        int int11 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        boolean boolean8 = keyVal7.hasInputStream();
        java.io.InputStream inputStream9 = keyVal7.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base17 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        java.lang.String str17 = keyVal16.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!" + "'", str17, "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!===hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=");
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        java.io.InputStream inputStream12 = keyVal5.inputStream();
        java.lang.String str13 = keyVal5.key();
        java.lang.String str14 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=" + "'", str14, "hi!=");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        org.jsoup.Connection.Method method18 = response0.method();
        java.net.URL uRL19 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.charset();
        boolean boolean9 = response0.hasHeader("hi!==");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.Connection.Base base15 = response10.removeHeader("hi!");
        org.jsoup.Connection.Method method16 = response10.method();
        java.lang.String str17 = response10.statusMessage();
        java.net.URL uRL18 = response10.url();
        java.util.Map map19 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.lang.Class<?> wildcardClass6 = keyVal4.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        java.util.Map map5 = response0.cookies();
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding==");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.Class<?> wildcardClass20 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        org.jsoup.Connection.Base base21 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=", "hi!===hi!==", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!==" + "'", str4, "hi!===hi!==");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        boolean boolean11 = response0.hasHeader("Content-Encoding==");
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.lang.String str16 = keyVal15.value();
        java.io.InputStream inputStream17 = keyVal15.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!===hi!==hi!=", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        org.jsoup.Connection.Method method22 = response0.method();
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
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!===Content-Encoding=", "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        boolean boolean15 = keyVal11.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal11.key("hi!");
        java.lang.String str18 = keyVal17.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal17.value("hi!=hi!==");
        boolean boolean21 = keyVal17.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=" + "'", str18, "hi!=");
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.String str24 = response0.statusMessage();
        boolean boolean27 = response0.hasHeaderWithValue("hi!=", "hi!==hi!=hi!=");
        org.jsoup.Connection.Method method28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = response0.method(method28);
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
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        java.lang.String str19 = response0.cookie("hi!=hi!=");
        boolean boolean21 = response0.hasCookie("hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!==hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
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
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        boolean boolean64 = response0.hasHeader("hi!==Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
            byte[] byteArray19 = response0.bodyAsBytes();
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

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=");
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = inputStream6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.io.InputStream inputStream15 = keyVal14.inputStream();
        java.lang.String str16 = keyVal14.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=Content-Encoding=Content-Encoding==" + "'", str16, "hi!=Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.util.Map map15 = response0.cookies();
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!=", "hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.Connection.Base base18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method19 = response13.method();
        java.lang.String str20 = response13.statusMessage();
        java.net.URL uRL21 = response13.url();
        java.util.Map map22 = response13.cookies();
        org.jsoup.Connection.Base base24 = response13.removeHeader("Content-Encoding=");
        boolean boolean27 = response13.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        boolean boolean30 = response13.hasHeaderWithValue("Content-Encoding=Content-Encoding", "");
        java.util.Map map31 = response13.headers();
        java.util.Map map32 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.lang.Class<?> wildcardClass34 = response0.getClass();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!===hi!=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        java.util.Map map4 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        boolean boolean22 = response0.hasHeader("hi!=Content-Encoding");
        java.util.Map map23 = response0.cookies();
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base25 = response0.method(method24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===", "hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        boolean boolean18 = keyVal15.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===", "Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!===Content-Encoding=");
        java.lang.String str11 = keyVal10.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!===Content-Encoding=" + "'", str11, "hi!===Content-Encoding=");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        java.util.Map map14 = response0.cookies();
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.headers();
        java.lang.String str23 = response21.statusMessage();
        org.jsoup.Connection.Base base25 = response21.removeHeader("hi!");
        java.util.Map map26 = response21.headers();
        java.lang.String str27 = response21.contentType();
        java.lang.String str29 = response21.cookie("hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map31 = response30.headers();
        org.jsoup.Connection.Base base33 = response30.removeHeader("Content-Encoding");
        java.util.Map map34 = response30.headers();
        org.jsoup.Connection.Base base36 = response30.removeCookie("Content-Encoding");
        java.lang.String str37 = response30.statusMessage();
        java.lang.String str38 = response30.statusMessage();
        java.util.Map map39 = response30.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str43 = response41.cookie("hi!");
        org.jsoup.Connection.Base base45 = response41.removeCookie("Content-Encoding");
        int int46 = response41.statusCode();
        boolean boolean48 = response41.hasCookie("hi!=");
        org.jsoup.Connection.Base base50 = response41.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str51 = response41.charset();
        boolean boolean53 = response41.hasHeader("Content-Encoding=Content-Encoding=");
        java.util.Map map54 = response41.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
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
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.util.Map map10 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!==hi!");
        java.lang.Class<?> wildcardClass12 = base11.getClass();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map map6 = response1.headers();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Base base9 = response1.removeHeader("Content-Encoding=Content-Encoding===hi!");
        java.net.URL uRL10 = response1.url();
        int int11 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = uRL39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
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
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.lang.String str17 = keyVal16.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding" + "'", str17, "Content-Encoding");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding==");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.inputStream(inputStream10);
        java.lang.String str12 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12, "hi!=hi!=");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=hi!=", "hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!=hi!=");
        java.lang.String str12 = keyVal11.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=hi!=" + "'", str12, "hi!=hi!=");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        boolean boolean8 = keyVal7.hasInputStream();
        boolean boolean9 = keyVal7.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!==hi!");
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!==hi!" + "'", str10, "hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("hi!=Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!");
        java.lang.String str5 = keyVal4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding===hi!==hi!" + "'", str5, "Content-Encoding===hi!==hi!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        java.lang.String str17 = response0.header("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.cookie("", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=", "");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!===hi!=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        java.io.InputStream inputStream15 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        boolean boolean33 = response0.hasCookie("hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.value();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.value("Content-Encoding=Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        boolean boolean14 = keyVal12.hasInputStream();
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        boolean boolean8 = response0.hasHeaderWithValue("hi!", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.Class<?> wildcardClass21 = map19.getClass();
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
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        java.lang.Class<?> wildcardClass16 = keyVal10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=", "hi!=hi!==hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        java.lang.String str21 = response0.cookie("hi!==hi!=hi!=");
        java.lang.String str22 = response0.contentType();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        java.lang.String str21 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.header("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean11 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.lang.String str24 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.contentType();
        java.lang.String str13 = response0.header("Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding=Content-Encoding==hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.net.URL uRL14 = response0.url();
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===hi!=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.lang.String str17 = response0.header("hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        java.lang.String str25 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response0.body();
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
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.value("hi!=Content-Encoding");
        java.lang.String str19 = keyVal18.key();
        java.io.InputStream inputStream20 = keyVal18.inputStream();
        java.io.InputStream inputStream21 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal18.inputStream(inputStream21);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Content-Encoding=" + "'", str19, "Content-Encoding=");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(keyVal22);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!=", "");
        java.lang.String str19 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!");
        java.lang.String str5 = keyVal4.toString();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding===hi!==hi!" + "'", str5, "Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.inputStream(inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        boolean boolean7 = keyVal6.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.lang.String str18 = response0.charset();
        org.jsoup.Connection.Base base21 = response0.header("Content-Encoding==", "hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
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
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!==", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!===hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.util.Map map16 = response0.headers();
        boolean boolean18 = response0.hasHeader("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=", "hi!==hi!");
        boolean boolean10 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base27 = response0.cookie("", "Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!===hi!=", "hi!==hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!", "hi!===hi!=");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        java.lang.String str16 = keyVal14.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.Connection.Base base14 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.String str13 = response0.header("Content-Encoding=");
        java.lang.String str14 = response0.charset();
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal5.key();
        java.lang.String str7 = keyVal5.key();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.key();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        org.jsoup.Connection.Base base25 = response0.cookie("hi!=hi!=", "Content-Encoding=Content-Encoding=");
        boolean boolean27 = response0.hasHeader("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.lang.String str7 = response0.statusMessage();
        java.util.Map map8 = response0.cookies();
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
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==hi!=", "hi!===hi!");
        boolean boolean12 = response0.hasCookie("hi!===hi!");
        boolean boolean14 = response0.hasCookie("Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        java.lang.Class<?> wildcardClass21 = base20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!==");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=hi!", "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.method(method14);
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
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        java.util.Map map9 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!");
        java.util.Map map12 = response0.cookies();
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        java.lang.String str8 = keyVal6.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        java.lang.String str11 = keyVal6.key();
        java.lang.String str12 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding=", "Content-Encoding=Content-Encoding===");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=Content-Encoding==", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding===hi!=hi!==hi!" + "'", str4, "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        boolean boolean14 = keyVal13.hasInputStream();
        boolean boolean15 = keyVal13.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.key("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str18 = keyVal13.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=" + "'", str18, "Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        java.util.Map map12 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.value();
        java.lang.String str6 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=Content-Encoding=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str5, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("Content-Encoding=");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("hi!=");
        boolean boolean14 = response0.hasCookie("hi!");
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.headers();
        java.lang.String str21 = response18.header("Content-Encoding");
        int int22 = response18.statusCode();
        java.lang.String str24 = response18.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.Connection.Base base30 = response25.removeHeader("hi!");
        org.jsoup.Connection.Method method31 = response25.method();
        java.lang.String str32 = response25.statusMessage();
        org.jsoup.Connection.Method method33 = response25.method();
        org.jsoup.Connection.Base base35 = response25.removeCookie("hi!=");
        java.util.Map map36 = response25.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        boolean boolean39 = response18.hasHeader("hi!=");
        org.jsoup.Connection.Base base42 = response18.header("Content-Encoding=Content-Encoding=", "Content-Encoding");
        org.jsoup.Connection.Method method43 = response18.method();
        int int44 = response18.statusCode();
        java.util.Map map45 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        org.jsoup.Connection.Base base48 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(base42);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(base48);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        java.util.Map map22 = response0.headers();
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
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        java.lang.String str22 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response0.hasHeaderWithValue("", "hi!=Content-Encoding=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.lang.String str21 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = keyVal2.inputStream();
        boolean boolean10 = keyVal2.hasInputStream();
        java.lang.String str11 = keyVal2.toString();
        java.lang.String str12 = keyVal2.toString();
        java.lang.Class<?> wildcardClass13 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=Content-Encoding" + "'", str11, "hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        boolean boolean33 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean36 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "Content-Encoding=Content-Encoding===hi!", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==hi!=Content-Encoding=Content-Encoding===hi!" + "'", str4, "hi!==hi!=Content-Encoding=Content-Encoding===hi!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        org.jsoup.Connection.Base base18 = response0.cookie("hi!===Content-Encoding=", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        boolean boolean20 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!=", "hi!==hi!");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        java.util.Map map44 = response0.cookies();
        org.jsoup.Connection.Base base46 = response0.removeHeader("hi!=Content-Encoding");
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
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(base46);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        java.lang.String str27 = response0.cookie("Content-Encoding=hi!=hi!=");
        boolean boolean29 = response0.hasCookie("hi!=hi!==hi!");
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===Content-Encoding=", "hi!==hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.key();
        java.lang.String str5 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===Content-Encoding=" + "'", str4, "hi!===Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===Content-Encoding==hi!==hi!" + "'", str5, "hi!===Content-Encoding==hi!==hi!");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        int int10 = response0.statusCode();
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
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.key("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        boolean boolean16 = response0.hasHeaderWithValue("Content-Encoding==hi!===hi!==hi!=", "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!=", "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding" + "'", str4, "hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Method method21 = response0.method();
        int int22 = response0.statusCode();
        java.lang.String str24 = response0.header("Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding", "Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "hi!=Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "");
        java.util.Map map8 = response0.headers();
        java.lang.String str10 = response0.header("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal3.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal3.key("Content-Encoding=Content-Encoding===hi!");
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
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        org.jsoup.Connection.Method method41 = response0.method();
        java.net.URL uRL42 = response0.url();
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
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNull(uRL42);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        boolean boolean10 = response0.hasHeaderWithValue("hi!==Content-Encoding", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=" + "'", str6, "Content-Encoding=");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding==");
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
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        org.jsoup.Connection.Base base24 = response0.cookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        boolean boolean27 = response0.hasHeaderWithValue("hi!=", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response0.body();
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
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        boolean boolean11 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=", "hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        boolean boolean7 = response0.hasHeaderWithValue("hi!==", "hi!=");
        java.lang.String str8 = response0.charset();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        java.lang.String str22 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
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
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        boolean boolean4 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!==");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        boolean boolean15 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding", "hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!==hi!");
        java.lang.String str10 = keyVal9.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!==hi!=" + "'", str10, "hi!==hi!=");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!==hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!==hi!=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!" + "'", str4, "hi!=hi!");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        boolean boolean20 = keyVal15.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.inputStream(inputStream10);
        boolean boolean12 = keyVal11.hasInputStream();
        boolean boolean13 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        java.lang.String str14 = keyVal13.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=" + "'", str14, "hi!=");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        java.lang.String str11 = response0.cookie("Content-Encoding=hi!");
        boolean boolean13 = response0.hasCookie("Content-Encoding=");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        java.util.Map map49 = response0.headers();
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
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        java.util.Map map44 = response0.headers();
        int int45 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        org.jsoup.Connection.Base base18 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
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
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        org.jsoup.Connection.Base base24 = response0.header("hi!=Content-Encoding=hi!", "hi!===");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!");
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        boolean boolean13 = keyVal10.hasInputStream();
        java.io.InputStream inputStream14 = keyVal10.inputStream();
        java.lang.String str15 = keyVal10.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding" + "'", str15, "Content-Encoding");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.util.Map map16 = response0.cookies();
        java.lang.String str18 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str19 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        boolean boolean17 = response1.hasCookie("hi!=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        java.util.Map map13 = response0.cookies();
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.lang.String str18 = keyVal10.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str18, "Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("hi!=Content-Encoding=", "hi!");
        java.lang.String str16 = response0.cookie("hi!=hi!=");
        org.jsoup.Connection.Base base19 = response0.header("hi!=Content-Encoding", "hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        org.jsoup.Connection.Base base32 = response0.removeHeader("hi!===hi!==Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base32);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding==", "hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        java.util.Map map21 = response0.headers();
        java.lang.String str22 = response0.statusMessage();
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
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str14 = response0.contentType();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method19 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!=", "");
        boolean boolean11 = response0.hasHeader("hi!=hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response12.cookie("hi!", "hi!");
        java.lang.String str16 = response12.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("hi!");
        java.lang.String str21 = response17.cookie("Content-Encoding");
        java.lang.String str22 = response17.statusMessage();
        java.lang.String str23 = response17.charset();
        boolean boolean25 = response17.hasCookie("Content-Encoding");
        java.util.Map map26 = response17.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.util.Map map28 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response12.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base17 = response12.cookie("Content-Encoding", "hi!");
        java.lang.String str18 = response12.charset();
        org.jsoup.Connection.Base base20 = response12.removeHeader("hi!=");
        boolean boolean22 = response12.hasCookie("Content-Encoding=");
        boolean boolean24 = response12.hasCookie("Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base27 = response25.removeCookie("Content-Encoding");
        java.lang.String str29 = response25.header("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response30.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str35 = response33.cookie("hi!");
        java.util.Map map36 = response33.headers();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        java.lang.String str40 = response25.header("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base42 = response25.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method43 = response25.method();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base47 = response44.cookie("hi!", "hi!");
        java.lang.String str48 = response44.charset();
        java.util.Map map49 = response44.headers();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.jsoup.Connection.Method method53 = response0.method();
        org.jsoup.Connection.Base base56 = response0.cookie("hi!=Content-Encoding", "hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(base42);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(base47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(method53);
        org.junit.Assert.assertNotNull(base56);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding==hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        org.jsoup.Connection.Method method18 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        java.lang.String str18 = response0.cookie("Content-Encoding=");
        boolean boolean21 = response0.hasHeaderWithValue("hi!==", "Content-Encoding=Content-Encoding==");
        java.lang.String str22 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==hi!=Content-Encoding", "hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        org.jsoup.Connection.Method method14 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding=", "", inputStream2);
        java.lang.Class<?> wildcardClass4 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str3, "hi!=Content-Encoding=Content-Encoding");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding=hi!=hi!=", "hi!===hi!==hi!=");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        org.jsoup.Connection.Base base21 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding==", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.value("hi!==");
        boolean boolean15 = keyVal14.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        java.lang.String str22 = keyVal21.value();
        java.lang.String str23 = keyVal21.value();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.inputStream(inputStream11);
        java.lang.Class<?> wildcardClass13 = keyVal12.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!===hi!=");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        boolean boolean12 = keyVal11.hasInputStream();
        java.lang.String str13 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!===hi!==Content-Encoding" + "'", str13, "hi!===hi!==Content-Encoding");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.cookie("Content-Encoding=");
        int int8 = response0.statusCode();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===", "hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        org.jsoup.Connection.Base base22 = response0.header("hi!=Content-Encoding=Content-Encoding==", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.value("hi!=Content-Encoding");
        boolean boolean19 = keyVal18.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.header("Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        boolean boolean12 = response0.hasHeader("hi!=hi!==hi!===hi!=");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("");
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "Content-Encoding=Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!===hi!==Content-Encoding=Content-Encoding=" + "'", str3, "hi!===hi!==Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==");
        java.lang.String str13 = response0.cookie("hi!==hi!=hi!=");
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        java.lang.String str17 = response0.header("");
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        java.lang.String str23 = response20.header("Content-Encoding");
        org.jsoup.Connection.Base base25 = response20.removeHeader("hi!");
        org.jsoup.Connection.Method method26 = response20.method();
        java.lang.String str27 = response20.statusMessage();
        java.net.URL uRL28 = response20.url();
        java.util.Map map29 = response20.cookies();
        org.jsoup.Connection.Base base31 = response20.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base34 = response20.cookie("Content-Encoding=Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.headers();
        java.lang.String str38 = response35.header("Content-Encoding");
        int int39 = response35.statusCode();
        java.lang.String str41 = response35.cookie("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.headers();
        java.lang.String str45 = response42.header("Content-Encoding");
        org.jsoup.Connection.Base base47 = response42.removeHeader("hi!");
        org.jsoup.Connection.Method method48 = response42.method();
        java.lang.String str49 = response42.statusMessage();
        org.jsoup.Connection.Method method50 = response42.method();
        org.jsoup.Connection.Base base52 = response42.removeCookie("hi!=");
        java.util.Map map53 = response42.cookies();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        boolean boolean58 = response20.hasHeaderWithValue("hi!=Content-Encoding", "Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base61 = response59.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base64 = response59.cookie("Content-Encoding", "hi!");
        java.lang.String str65 = response59.charset();
        java.lang.String str66 = response59.statusMessage();
        boolean boolean69 = response59.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map70 = response59.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map70);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map70);
        org.jsoup.Connection.Method method73 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document74 = response0.parse();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(base47);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNotNull(base52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(base61);
        org.junit.Assert.assertNotNull(base64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(method73);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str9 = keyVal8.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding===hi!=Content-Encoding=" + "'", str9, "Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        java.net.URL uRL17 = response0.url();
        int int18 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("hi!=Content-Encoding=", "hi!");
        boolean boolean17 = response0.hasHeaderWithValue("hi!===hi!=", "Content-Encoding==");
        boolean boolean20 = response0.hasHeaderWithValue("Content-Encoding", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
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
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!==");
        java.lang.String str6 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!=" + "'", str3, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=hi!=" + "'", str6, "hi!=hi!=");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        org.jsoup.Connection.Base base20 = response0.cookie("hi!=Content-Encoding=", "Content-Encoding=hi!");
        org.jsoup.Connection.Base base22 = response0.removeCookie("hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!=hi!=", "hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        boolean boolean23 = response0.hasHeader("hi!=hi!=Content-Encoding=");
        org.jsoup.Connection.Base base25 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        int int11 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        java.util.Map map24 = response0.headers();
        java.lang.String str26 = response0.header("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str27 = response0.contentType();
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
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base14 = response11.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base16 = response11.removeHeader("Content-Encoding");
        java.util.Map map17 = response11.cookies();
        java.util.Map map18 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response0.hasHeaderWithValue("", "hi!==hi!=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!===hi!==", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.net.URL uRL15 = response0.url();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!", "hi!=hi!=");
        java.lang.String str19 = response0.statusMessage();
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
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        org.jsoup.Connection.Base base18 = response0.removeHeader("Content-Encoding=");
        java.lang.String str19 = response0.charset();
        java.util.Map map20 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!==hi!=Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str4, "hi!==hi!=Content-Encoding");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.header("hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("hi!");
        java.lang.String str18 = response14.cookie("Content-Encoding");
        java.lang.String str19 = response14.statusMessage();
        org.jsoup.Connection.Base base21 = response14.removeCookie("Content-Encoding");
        java.net.URL uRL22 = response14.url();
        org.jsoup.Connection.Base base25 = response14.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base27 = response14.removeHeader("Content-Encoding=Content-Encoding=");
        java.net.URL uRL28 = response14.url();
        java.lang.String str30 = response14.cookie("hi!");
        java.lang.String str31 = response14.charset();
        java.util.Map map32 = response14.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.cookie("Content-Encoding");
        boolean boolean7 = response1.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str9 = response1.header("hi!==hi!");
        org.jsoup.Connection.Base base11 = response1.removeHeader("hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("Content-Encoding==");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding", "Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        java.net.URL uRL27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base28 = response0.url(uRL27);
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasHeader("hi!=");
        int int9 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===", "Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        org.jsoup.Connection.Base base27 = response0.removeCookie("hi!==hi!=hi!=");
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=hi!=", "Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=");
        java.lang.String str11 = response0.contentType();
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding=hi!", "Content-Encoding=Content-Encoding==hi!=");
        java.net.URL uRL17 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=");
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.headers();
        java.lang.String str15 = response12.header("Content-Encoding");
        org.jsoup.Connection.Base base17 = response12.removeHeader("hi!");
        org.jsoup.Connection.Method method18 = response12.method();
        java.lang.String str19 = response12.statusMessage();
        java.net.URL uRL20 = response12.url();
        java.util.Map map21 = response12.cookies();
        org.jsoup.Connection.Base base23 = response12.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base25 = response12.removeHeader("Content-Encoding=Content-Encoding");
        boolean boolean27 = response12.hasCookie("hi!==hi!");
        java.lang.String str28 = response12.charset();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str31 = response29.cookie("hi!");
        java.util.Map map32 = response29.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.jsoup.Connection.Base base37 = response0.header("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!===Content-Encoding=");
        java.lang.String str38 = response0.statusMessage();
        java.lang.String str39 = response0.charset();
        org.jsoup.Connection.Method method40 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(method40);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        boolean boolean22 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        java.util.Map map23 = response0.cookies();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        boolean boolean21 = response0.hasCookie("hi!==hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.header("hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==hi!");
        java.lang.String str14 = response0.header("");
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!=hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.lang.String str17 = response0.charset();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        boolean boolean21 = response0.hasHeader("hi!===hi!==Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.header("hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
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
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.header("hi!", "hi!=");
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!==", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=hi!==" + "'", str6, "hi!=hi!==");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!=", "");
        boolean boolean11 = response0.hasHeader("hi!=hi!==hi!");
        java.util.Map map12 = response0.cookies();
        boolean boolean14 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.String str12 = response0.contentType();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!===hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        java.net.URL uRL17 = response0.url();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        boolean boolean14 = keyVal10.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.key("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str9 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding===hi!=Content-Encoding=" + "'", str9, "Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.headers();
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.cookie("hi!===Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.header("hi!=Content-Encoding=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        boolean boolean19 = response0.hasCookie("hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.net.URL uRL15 = response0.url();
        java.util.Map map16 = response0.headers();
        java.lang.Class<?> wildcardClass17 = map16.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.lang.Class<?> wildcardClass11 = keyVal10.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("hi!==");
        java.lang.String str13 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!===" + "'", str13, "hi!===");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.lang.String str17 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        boolean boolean19 = response0.hasHeader("hi!=Content-Encoding=hi!");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        org.jsoup.Connection.Base base30 = response0.removeCookie("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
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
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean5 = response1.hasHeader("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Method method9 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!===hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.cookie("Content-Encoding");
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Base base8 = response1.removeCookie("Content-Encoding");
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response1.header("hi!==");
        boolean boolean15 = response1.hasCookie("hi!==hi!");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        org.jsoup.Connection.Method method49 = response0.method();
        org.jsoup.Connection.Base base51 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Method method52 = response0.method();
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
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNotNull(base51);
        org.junit.Assert.assertNull(method52);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal3.hasInputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!==hi!");
        java.lang.String str12 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        boolean boolean19 = keyVal16.hasInputStream();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        org.jsoup.Connection.Base base30 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=");
        boolean boolean32 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base34 = response0.removeCookie("hi!=hi!");
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
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(base34);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        java.lang.String str8 = keyVal6.key();
        boolean boolean9 = keyVal6.hasInputStream();
        java.io.InputStream inputStream10 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.lang.String str24 = response0.header("hi!=hi!=Content-Encoding=");
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Base base11 = response1.removeCookie("hi!=");
        java.util.Map map12 = response1.cookies();
        java.util.Map map13 = response1.cookies();
        org.jsoup.Connection.Base base15 = response1.removeHeader("Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal5.toString();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.inputStream(inputStream11);
        java.lang.String str13 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str10, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str13, "hi!=Content-Encoding=Content-Encoding");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("Content-Encoding=Content-Encoding==");
        boolean boolean9 = keyVal8.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("Content-Encoding=Content-Encoding===hi!");
        java.io.InputStream inputStream12 = keyVal8.inputStream();
        java.lang.String str13 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!");
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response0.parse();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        java.lang.String str16 = response0.charset();
        java.lang.String str18 = response0.header("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        java.lang.String str18 = response0.cookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!==Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        java.lang.String str25 = response0.statusMessage();
        java.lang.String str26 = response0.charset();
        org.jsoup.Connection.Base base29 = response0.cookie("hi!=hi!", "hi!===hi!=");
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean16 = response0.hasHeaderWithValue("hi!=hi!==", "hi!==hi!=Content-Encoding");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===", "");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=Content-Encoding===hi!", "hi!===hi!=");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        boolean boolean16 = response0.hasHeader("hi!=Content-Encoding=");
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        java.lang.String str18 = response0.contentType();
        org.jsoup.Connection.Base base21 = response0.header("Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding===hi!");
        java.lang.String str22 = response0.contentType();
        java.util.Map map23 = response0.cookies();
        java.lang.String str24 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        org.jsoup.Connection.Base base19 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base22 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str23 = response0.contentType();
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!=", "Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding==");
        java.util.Map map7 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        java.util.Map map4 = response0.cookies();
        boolean boolean6 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        int int7 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.value("hi!");
        java.lang.String str12 = keyVal11.value();
        java.lang.String str13 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=hi!" + "'", str13, "Content-Encoding=hi!");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!==hi!=Content-Encoding=", "hi!===hi!==Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=");
        java.lang.String str3 = keyVal2.value();
        java.lang.Class<?> wildcardClass4 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!=" + "'", str3, "hi!=hi!=");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!=", "");
        java.lang.String str11 = response0.cookie("hi!=hi!=");
        org.jsoup.Connection.Method method12 = response0.method();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        java.util.Map map18 = response0.cookies();
        boolean boolean20 = response0.hasHeader("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeCookie("Content-Encoding");
        java.lang.String str5 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response6.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("hi!");
        java.util.Map map12 = response9.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Base base16 = response1.removeCookie("Content-Encoding");
        int int17 = response1.statusCode();
        boolean boolean19 = response1.hasCookie("hi!=");
        java.lang.String str20 = response1.statusMessage();
        boolean boolean23 = response1.hasHeaderWithValue("Content-Encoding=hi!=hi!=", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==hi!=Content-Encoding");
        int int13 = response0.statusCode();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasHeader("hi!=");
        int int9 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!===hi!=");
        java.lang.String str12 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!===hi!==hi!=" + "'", str12, "hi!===hi!==hi!=");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!");
        boolean boolean15 = response0.hasHeaderWithValue("hi!=", "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.net.URL uRL22 = response0.url();
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
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.lang.String str20 = response0.charset();
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        org.jsoup.Connection.Base base5 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasHeader("hi!===hi!==hi!=");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.value();
        java.lang.String str6 = keyVal4.key();
        java.lang.Class<?> wildcardClass7 = keyVal4.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.key("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
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
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding");
        boolean boolean8 = response0.hasHeader("hi!=");
        java.util.Map map9 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        org.jsoup.Connection.Base base30 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding=");
        org.jsoup.Connection.Base base33 = response0.header("hi!===", "hi!");
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
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(base33);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=Content-Encoding==");
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = keyVal6.value();
        java.lang.String str11 = keyVal6.value();
        boolean boolean12 = keyVal6.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str10, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=Content-Encoding==" + "'", str11, "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        java.lang.String str10 = response0.header("hi!==hi!");
        boolean boolean12 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        org.jsoup.Connection.Base base35 = response0.cookie("hi!===hi!=", "hi!==");
        org.jsoup.Connection.Base base38 = response0.header("hi!==", "Content-Encoding=Content-Encoding===hi!");
        java.lang.String str40 = response0.header("hi!=hi!");
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
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Base base13 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=");
        java.util.Map map14 = response0.cookies();
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Method method10 = response0.method();
        int int11 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.String str44 = response0.contentType();
        java.net.URL uRL45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base46 = response0.url(uRL45);
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.headers();
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!=hi!==hi!", "Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("hi!===Content-Encoding=", "hi!=hi!==hi!===hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.header("Content-Encoding");
        org.jsoup.Connection.Base base13 = response8.removeHeader("hi!");
        java.lang.String str15 = response8.header("hi!");
        java.lang.String str16 = response8.statusMessage();
        java.util.Map map17 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        java.util.Map map8 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base8 = response0.header("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding===hi!");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.inputStream(inputStream10);
        java.lang.String str12 = keyVal11.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=" + "'", str12, "hi!=");
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        boolean boolean27 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "hi!===hi!==");
        java.lang.String str29 = response0.cookie("hi!=hi!==hi!");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("hi!==");
        java.util.Map map8 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal6.inputStream(inputStream13);
        java.io.InputStream inputStream15 = keyVal14.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.lang.String str8 = keyVal2.key();
        java.lang.String str9 = keyVal2.toString();
        java.lang.String str10 = keyVal2.value();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal2.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=Content-Encoding" + "'", str9, "hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding" + "'", str10, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("hi!===Content-Encoding=", "hi!=hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
    }
}

