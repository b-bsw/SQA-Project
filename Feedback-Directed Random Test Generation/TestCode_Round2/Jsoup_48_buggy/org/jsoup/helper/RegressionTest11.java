package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        boolean boolean10 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        boolean boolean8 = response0.hasHeader("Content-Encoding==");
        int int9 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
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
        java.lang.String str34 = response0.header("Content-Encoding=hi!=hi!=");
        java.lang.String str35 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("hi!==hi!");
        java.lang.String str12 = keyVal9.value();
        java.lang.Class<?> wildcardClass13 = keyVal9.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!==hi!" + "'", str12, "hi!==hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=Content-Encoding", "Content-Encoding=Content-Encoding==");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "Content-Encoding=");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.key();
        boolean boolean5 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Encoding=" + "'", str3, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!===hi!=" + "'", str4, "hi!===hi!=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
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
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!===hi!==");
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
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.charset();
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=", "Content-Encoding==hi!=Content-Encoding");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal7.key();
        java.lang.String str11 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding" + "'", str11, "Content-Encoding");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!", "hi!=Content-Encoding");
        java.lang.String str15 = response0.header("");
        boolean boolean17 = response0.hasCookie("Content-Encoding");
        java.util.Map map18 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        java.lang.String str22 = response19.header("Content-Encoding");
        org.jsoup.Connection.Base base24 = response19.removeHeader("hi!");
        org.jsoup.Connection.Method method25 = response19.method();
        java.lang.String str26 = response19.statusMessage();
        java.net.URL uRL27 = response19.url();
        java.util.Map map28 = response19.cookies();
        org.jsoup.Connection.Base base30 = response19.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Base base32 = response19.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map33 = response19.headers();
        java.lang.String str34 = response19.charset();
        boolean boolean36 = response19.hasHeader("hi!=Content-Encoding=");
        java.util.Map map37 = response19.cookies();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map39 = response38.headers();
        org.jsoup.Connection.Base base41 = response38.removeHeader("Content-Encoding");
        java.util.Map map42 = response38.headers();
        java.util.Map map43 = response38.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        boolean boolean47 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str49 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        java.util.Map map25 = response0.cookies();
        java.lang.String str26 = response0.charset();
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
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasHeader("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.Class<?> wildcardClass7 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.header("hi!", "Content-Encoding=Content-Encoding=");
        java.lang.String str4 = response0.statusMessage();
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Method method6 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=");
        int int6 = response0.statusCode();
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
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
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding=hi!");
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
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===", "hi!===hi!==Content-Encoding=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding==", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.lang.String str7 = keyVal3.key();
        java.lang.String str8 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.value("hi!=Content-Encoding=Content-Encoding");
        java.lang.Class<?> wildcardClass11 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str7, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
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
        java.util.Map map15 = response1.headers();
        org.jsoup.Connection.Base base17 = response1.removeCookie("hi!=");
        int int18 = response1.statusCode();
        org.jsoup.Connection.Base base21 = response1.cookie("hi!=", "hi!==hi!");
        org.jsoup.Connection.Base base24 = response1.header("Content-Encoding=hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str25 = response1.charset();
        boolean boolean27 = response1.hasCookie("hi!===hi!==");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=", "hi!===hi!==hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
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
        org.jsoup.Connection.Method method33 = response0.method();
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
        org.junit.Assert.assertNull(method33);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!===hi!=");
        java.lang.String str12 = keyVal9.key();
        java.lang.String str13 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!===hi!=" + "'", str12, "hi!===hi!=");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=" + "'", str13, "hi!=");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=", "Content-Encoding==hi!=Content-Encoding");
        java.lang.String str14 = response0.cookie("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        java.lang.String str18 = response1.header("Content-Encoding");
        java.lang.String str20 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
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
        int int17 = response0.statusCode();
        boolean boolean19 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        boolean boolean11 = keyVal10.hasInputStream();
        java.lang.String str12 = keyVal10.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Base base10 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "Content-Encoding=hi!");
        int int11 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        boolean boolean22 = response0.hasHeaderWithValue("hi!=Content-Encoding=", "Content-Encoding===hi!==hi!");
        org.jsoup.Connection.Base base24 = response0.removeHeader("hi!===Content-Encoding=");
        boolean boolean27 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        java.lang.String str29 = response0.statusMessage();
        org.jsoup.Connection.Base base32 = response0.header("Content-Encoding=hi!", "Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base35 = response0.header("hi!===hi!==hi!==hi!=hi!=", "Content-Encoding=Content-Encoding===");
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(base35);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
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
        org.jsoup.Connection.Base base26 = response0.header("Content-Encoding=Content-Encoding=hi!==hi!", "hi!=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
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
        boolean boolean20 = response0.hasCookie("hi!=hi!===Content-Encoding=");
        java.lang.String str22 = response0.cookie("Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        java.lang.String str5 = response0.charset();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("Content-Encoding");
        java.util.Map map7 = response1.headers();
        java.lang.String str8 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str12 = response0.header("hi!=hi!=Content-Encoding=");
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
            byte[] byteArray15 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
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
        java.util.Map map27 = response0.cookies();
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = response0.url(uRL28);
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
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=Content-Encoding=", "hi!==hi!=Content-Encoding");
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!", "hi!==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.contentType();
        boolean boolean10 = response0.hasHeader("hi!==hi!=hi!=");
        boolean boolean12 = response0.hasHeader("hi!===hi!=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        boolean boolean7 = keyVal6.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        java.lang.String str10 = keyVal6.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.value("");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding==hi!===hi!=", "hi!=hi!=");
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!=hi!");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.io.InputStream inputStream14 = keyVal11.inputStream();
        java.io.InputStream inputStream15 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.url(uRL19);
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding==", "hi!==hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding");
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding=hi!=");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
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
        org.jsoup.Connection.Base base20 = response0.header("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        boolean boolean22 = response0.hasCookie("Content-Encoding=hi!=Content-Encoding=");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=hi!=hi!==Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=Content-Encoding=hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        boolean boolean8 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasCookie("hi!==hi!=hi!=");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
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
        org.jsoup.Connection.Method method15 = response0.method();
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
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        java.lang.String str13 = response0.contentType();
        java.lang.String str15 = response0.cookie("Content-Encoding=Content-Encoding==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.header("hi!=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=hi!=");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.cookie("Content-Encoding==hi!===hi!=");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.String str7 = keyVal3.value();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.inputStream(inputStream8);
        java.lang.String str10 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=");
        java.util.Map map14 = response0.cookies();
        java.util.Map map15 = response0.headers();
        org.jsoup.Connection.Base base18 = response0.header("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        java.util.Map map27 = response0.cookies();
        java.lang.String str29 = response0.cookie("hi!==");
        org.jsoup.Connection.Base base32 = response0.header("Content-Encoding=hi!==hi!", "Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base32);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        boolean boolean10 = keyVal9.hasInputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.inputStream(inputStream11);
        java.lang.String str13 = keyVal12.value();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal12.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=", "Content-Encoding==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Content-Encoding=hi!=hi!=");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding===hi!==hi!", "Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
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
        boolean boolean42 = response0.hasCookie("Content-Encoding=hi!==hi!");
        boolean boolean45 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding=Content-Encoding=", "hi!=hi!=Content-Encoding=");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        org.jsoup.Connection.Base base17 = response0.removeCookie("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
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
        java.lang.String str24 = response0.header("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response0.body();
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
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Method method7 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str19 = response16.header("Content-Encoding");
        org.jsoup.Connection.Base base21 = response16.removeHeader("hi!");
        org.jsoup.Connection.Method method22 = response16.method();
        java.lang.String str23 = response16.statusMessage();
        java.net.URL uRL24 = response16.url();
        java.lang.String str26 = response16.header("");
        boolean boolean29 = response16.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base31 = response16.removeCookie("hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map33 = response32.headers();
        java.lang.String str34 = response32.statusMessage();
        java.util.Map map35 = response32.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str39 = response0.cookie("hi!=hi!==");
        boolean boolean41 = response0.hasHeader("Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
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
        java.net.URL uRL17 = response0.url();
        boolean boolean20 = response0.hasHeaderWithValue("Content-Encoding=", "Content-Encoding==hi!===hi!=");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str14 = response10.contentType();
        int int15 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str18 = response16.cookie("hi!");
        java.lang.String str20 = response16.cookie("Content-Encoding");
        java.lang.String str21 = response16.statusMessage();
        java.lang.String str22 = response16.charset();
        boolean boolean24 = response16.hasCookie("Content-Encoding");
        java.util.Map map25 = response16.cookies();
        int int26 = response16.statusCode();
        java.lang.String str27 = response16.statusMessage();
        java.util.Map map28 = response16.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Base base31 = response10.removeHeader("Content-Encoding=Content-Encoding");
        java.util.Map map32 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==", "Content-Encoding==");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.net.URL uRL7 = response0.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("hi!", "hi!");
        java.lang.String str12 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("hi!");
        java.lang.String str17 = response13.cookie("Content-Encoding");
        java.lang.String str18 = response13.statusMessage();
        java.lang.String str19 = response13.charset();
        boolean boolean21 = response13.hasCookie("Content-Encoding");
        java.util.Map map22 = response13.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.util.Map map24 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        boolean boolean28 = response0.hasHeaderWithValue("hi!==", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base31 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding", "hi!=hi!==");
        org.jsoup.Connection.Base base33 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        boolean boolean36 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===", "hi!===Content-Encoding==hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
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
        java.lang.String str17 = response0.contentType();
        java.util.Map map18 = response0.cookies();
        org.jsoup.Connection.Base base21 = response0.cookie("hi!=Content-Encoding=hi!", "hi!===");
        java.lang.String str22 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.header("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        java.lang.String str17 = response0.statusMessage();
        int int18 = response0.statusCode();
        java.util.Map map19 = response0.cookies();
        java.util.Map map20 = response0.headers();
        java.util.Map map21 = response0.cookies();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!===hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.cookie("hi!==hi!");
        java.util.Map map8 = response0.headers();
        boolean boolean10 = response0.hasCookie("Content-Encoding==hi!===hi!==hi!=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===Content-Encoding=");
        boolean boolean11 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("");
        java.lang.String str11 = keyVal8.toString();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal8.inputStream(inputStream12);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=" + "'", str11, "hi!=");
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.cookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
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
        java.util.Map map20 = response0.headers();
        java.util.Map map21 = response0.headers();
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("Content-Encoding==");
        boolean boolean15 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==hi!=", "hi!=hi!=Content-Encoding=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base26 = response24.removeHeader("hi!");
        java.lang.String str27 = response24.charset();
        java.util.Map map28 = response24.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str30 = response0.statusMessage();
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
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
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
        java.net.URL uRL42 = response0.url();
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
        org.junit.Assert.assertNull(uRL42);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.cookies();
        boolean boolean8 = response0.hasHeader("hi!==Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!");
        java.util.Map map13 = response0.cookies();
        java.lang.String str15 = response0.header("");
        boolean boolean18 = response0.hasHeaderWithValue("Content-Encoding==", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        java.lang.String str4 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        java.net.URL uRL20 = response0.url();
        java.lang.String str21 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
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
        java.lang.String str17 = response0.contentType();
        java.util.Map map18 = response0.cookies();
        java.lang.String str19 = response0.charset();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=hi!=", "");
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str5 = response0.header("hi!=");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("hi!===hi!=");
        java.lang.String str10 = response0.statusMessage();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
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
        boolean boolean45 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str47 = response0.cookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        int int22 = response0.statusCode();
        boolean boolean25 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "hi!===");
        org.jsoup.Connection.Base base28 = response0.header("Content-Encoding=Content-Encoding===hi!", "hi!=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(base28);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.cookie("Content-Encoding");
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Base base8 = response1.removeCookie("Content-Encoding");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Base base12 = response1.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base14 = response1.removeHeader("hi!===Content-Encoding=");
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "hi!===");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        java.lang.String str23 = response0.contentType();
        java.lang.String str24 = response0.contentType();
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
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Base base10 = response0.cookie("hi!==", "Content-Encoding=Content-Encoding=Content-Encoding==");
        java.lang.String str12 = response0.header("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!===Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!===Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding" + "'", str4, "Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.io.InputStream inputStream10 = keyVal7.inputStream();
        java.lang.String str11 = keyVal7.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        java.lang.String str14 = keyVal7.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!==" + "'", str11, "hi!==");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!==Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!" + "'", str14, "hi!==Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!=hi!=");
        java.lang.String str9 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
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
        java.io.InputStream inputStream17 = keyVal14.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=Content-Encoding" + "'", str12, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("hi!==");
        java.net.URL uRL8 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        boolean boolean9 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding=");
        boolean boolean13 = response0.hasCookie("hi!===hi!==hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("hi!=Content-Encoding=", "hi!");
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        java.util.Map map10 = response0.cookies();
        boolean boolean13 = response0.hasHeaderWithValue("hi!=hi!=Content-Encoding=", "Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=hi!=", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==hi!=hi!=" + "'", str5, "hi!==hi!=hi!=");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        java.lang.String str21 = response0.header("Content-Encoding=hi!=hi!=");
        java.util.Map map22 = response0.cookies();
        java.net.URL uRL23 = response0.url();
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
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!");
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!===hi!==");
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!=", "Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=hi!=");
        java.io.InputStream inputStream9 = keyVal6.inputStream();
        java.lang.String str10 = keyVal6.key();
        java.lang.String str11 = keyVal6.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding" + "'", str10, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=hi!=hi!=" + "'", str11, "Content-Encoding=hi!=hi!=");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding=", "hi!=Content-Encoding");
        java.util.Map map13 = response0.headers();
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
        java.lang.String str23 = response0.header("hi!===hi!==hi!=");
        java.lang.String str24 = response0.charset();
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        boolean boolean18 = keyVal17.hasInputStream();
        java.lang.String str19 = keyVal17.key();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        boolean boolean11 = response0.hasHeaderWithValue("hi!==", "hi!==");
        boolean boolean13 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        java.lang.String str18 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding==");
        java.lang.String str19 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!==");
        int int12 = response0.statusCode();
        java.lang.String str14 = response0.cookie("hi!===hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        org.jsoup.Connection.Base base20 = response0.cookie("hi!=", "hi!==hi!");
        org.jsoup.Connection.Base base23 = response0.header("Content-Encoding=hi!", "hi!===hi!==Content-Encoding=Content-Encoding");
        java.lang.String str24 = response0.charset();
        boolean boolean26 = response0.hasCookie("hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = response0.hasHeaderWithValue("", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!===Content-Encoding=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.inputStream(inputStream11);
        java.lang.String str13 = keyVal6.toString();
        boolean boolean14 = keyVal6.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=hi!===Content-Encoding=" + "'", str13, "hi!=hi!===Content-Encoding=");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
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
        java.lang.String str24 = response0.contentType();
        boolean boolean26 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.lang.String str28 = response0.cookie("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Base base31 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base31);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        org.jsoup.Connection.Method method18 = response0.method();
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
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasHeader("hi!=hi!=");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response0.hasHeaderWithValue("", "Content-Encoding=hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.cookie("", "hi!==hi!=Content-Encoding=hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        java.lang.String str31 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        java.lang.String str12 = keyVal3.key();
        java.io.InputStream inputStream13 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal3.value("hi!=Content-Encoding=hi!=");
        java.lang.String str16 = keyVal15.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=" + "'", str11, "hi!=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=Content-Encoding=hi!=" + "'", str16, "hi!=Content-Encoding=hi!=");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        java.lang.String str19 = response16.header("Content-Encoding");
        org.jsoup.Connection.Base base21 = response16.removeHeader("hi!");
        org.jsoup.Connection.Method method22 = response16.method();
        java.lang.String str23 = response16.statusMessage();
        java.net.URL uRL24 = response16.url();
        java.lang.String str26 = response16.header("");
        boolean boolean29 = response16.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base31 = response16.removeCookie("hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map33 = response32.headers();
        java.lang.String str34 = response32.statusMessage();
        java.util.Map map35 = response32.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str39 = response0.cookie("hi!=hi!==");
        org.jsoup.Connection.Method method40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base41 = response0.method(method40);
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
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
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
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = response0.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.header("hi!==hi!");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!=hi!=");
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.header("hi!===hi!=");
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!=Content-Encoding", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!==hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding");
        java.lang.String str6 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("hi!===Content-Encoding==hi!==hi!");
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str6, "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
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
        java.net.URL uRL17 = response0.url();
        java.lang.String str19 = response0.cookie("hi!==hi!=Content-Encoding");
        boolean boolean22 = response0.hasHeaderWithValue("Content-Encoding==", "hi!=hi!");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.cookie("hi!===hi!=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset();
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.contentType();
        boolean boolean8 = response1.hasCookie("Content-Encoding=");
        org.jsoup.Connection.Base base11 = response1.header("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base13 = response1.removeCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        boolean boolean16 = response1.hasHeaderWithValue("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=");
        java.util.Map map17 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!=hi!=");
        java.lang.String str8 = keyVal5.key();
        java.lang.String str9 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=hi!=" + "'", str8, "hi!=hi!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=hi!==" + "'", str9, "hi!=hi!==");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        java.lang.String str24 = response0.header("hi!==");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response25.cookie("hi!", "hi!");
        java.lang.String str29 = response25.charset();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str32 = response30.cookie("hi!");
        java.lang.String str34 = response30.cookie("Content-Encoding");
        java.lang.String str35 = response30.statusMessage();
        java.lang.String str36 = response30.charset();
        boolean boolean38 = response30.hasCookie("Content-Encoding");
        java.util.Map map39 = response30.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.net.URL uRL41 = response25.url();
        java.net.URL uRL42 = response25.url();
        org.jsoup.Connection.Base base45 = response25.cookie("Content-Encoding=Content-Encoding=", "");
        java.lang.String str46 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map48 = response47.headers();
        java.lang.String str50 = response47.header("Content-Encoding");
        org.jsoup.Connection.Base base52 = response47.removeHeader("hi!");
        java.util.Map map53 = response47.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        java.util.Map map56 = response0.headers();
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(base52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        org.jsoup.Connection.Base base13 = response0.header("hi!=Content-Encoding=hi!=", "hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        java.lang.String str33 = response0.cookie("hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Base base36 = response0.header("hi!===hi!=Content-Encoding", "hi!===hi!==hi!==hi!=hi!=");
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(base36);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        java.lang.String str12 = keyVal9.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!==");
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("Content-Encoding=");
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal6.toString();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal6.key("hi!=hi!=");
        java.lang.Class<?> wildcardClass12 = keyVal11.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding");
        boolean boolean11 = keyVal10.hasInputStream();
        boolean boolean12 = keyVal10.hasInputStream();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        boolean boolean15 = keyVal14.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!==hi!=Content-Encoding", "hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str17 = response0.cookie("Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
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
        java.lang.Class<?> wildcardClass18 = base17.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
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
        java.lang.Class<?> wildcardClass14 = keyVal11.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding=Content-Encoding=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!===Content-Encoding=");
        java.lang.String str6 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!===Content-Encoding=" + "'", str6, "hi!===Content-Encoding=");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=", "Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
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
        java.util.Map map15 = response0.headers();
        java.lang.String str17 = response0.cookie("Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
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
        java.lang.String str14 = response0.header("hi!==Content-Encoding");
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
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("Content-Encoding=hi!");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.lang.String str11 = keyVal8.value();
        boolean boolean12 = keyVal8.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6, "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasHeader("hi!=hi!");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
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
        java.io.InputStream inputStream14 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==" + "'", str8, "hi!==");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("Content-Encoding=");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.removeHeader("Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean11 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str13 = response0.cookie("hi!===hi!=");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response0.hasHeaderWithValue("", "");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
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
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=hi!=hi!=", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        java.lang.String str45 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "hi!=Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding=Content-Encoding=", "hi!==");
        boolean boolean10 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "Content-Encoding==hi!===hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("hi!=hi!", "Content-Encoding=Content-Encoding=hi!=");
        org.jsoup.Connection.Base base16 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding=", "hi!==hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
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
        java.util.Map map15 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.header("hi!=hi!=");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str10 = keyVal9.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=hi!=hi!==hi!=Content-Encoding==" + "'", str10, "Content-Encoding=hi!=hi!==hi!=Content-Encoding==");
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Method method6 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        boolean boolean7 = response0.hasHeaderWithValue("hi!===hi!=", "hi!");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!=hi!==hi!", "hi!=hi!=Content-Encoding=");
        boolean boolean14 = response0.hasHeaderWithValue("Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!==Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=");
        java.lang.String str9 = keyVal5.key();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("");
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal5.inputStream(inputStream14);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding=Content-Encoding=", "hi!===hi!=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!=hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.header("Content-Encoding");
        int int14 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("hi!");
        org.jsoup.Connection.Base base19 = response15.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.Connection.Method method21 = response15.method();
        org.jsoup.Connection.Method method22 = response15.method();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.headers();
        java.lang.String str26 = response23.header("Content-Encoding");
        org.jsoup.Connection.Base base28 = response23.removeHeader("hi!");
        org.jsoup.Connection.Method method29 = response23.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map31 = response30.headers();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.util.Map map36 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        java.lang.String str19 = response17.statusMessage();
        java.lang.String str20 = response17.charset();
        java.lang.String str22 = response17.cookie("hi!==hi!");
        org.jsoup.Connection.Base base25 = response17.cookie("hi!=", "hi!==hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map27 = response26.headers();
        org.jsoup.Connection.Base base29 = response26.removeHeader("Content-Encoding");
        java.util.Map map30 = response26.headers();
        java.util.Map map31 = response26.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
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
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        java.lang.String str10 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding" + "'", str10, "Content-Encoding");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=");
        boolean boolean10 = response0.hasCookie("Content-Encoding=");
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean14 = response0.hasHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.header("hi!==Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!", "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("Content-Encoding");
        java.lang.String str15 = response11.header("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response16.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str21 = response19.cookie("hi!");
        java.util.Map map22 = response19.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Base base26 = response11.removeCookie("Content-Encoding");
        int int27 = response11.statusCode();
        int int28 = response11.statusCode();
        java.util.Map map29 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        int int31 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!=");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("Content-Encoding=hi!=hi!=");
        java.lang.String str13 = response0.contentType();
        java.lang.String str15 = response0.cookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        java.lang.String str17 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
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
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal2.toString();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
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
        java.lang.Class<?> wildcardClass19 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!==Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=", "hi!==", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        boolean boolean7 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.cookie("hi!===hi!==Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
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
        java.lang.String str23 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
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
        int int17 = response0.statusCode();
        java.util.Map map18 = response0.cookies();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
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
        int int21 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
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
        java.util.Map map24 = response0.cookies();
        java.util.Map map25 = response0.headers();
        boolean boolean27 = response0.hasCookie("hi!==hi!=Content-Encoding=Content-Encoding===hi!");
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
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.header("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
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
        java.lang.String str24 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        boolean boolean9 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!=");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base10 = response0.header("Content-Encoding=Content-Encoding=", "hi!=hi!=");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=");
        java.util.Map map14 = response0.cookies();
        java.util.Map map15 = response0.headers();
        boolean boolean18 = response0.hasHeaderWithValue("hi!===hi!==hi!=", "hi!=hi!==hi!===hi!=");
        java.lang.String str19 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        java.lang.String str10 = response0.charset();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
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
        boolean boolean17 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===hi!==" + "'", str5, "hi!===hi!==");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
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
        org.jsoup.Connection.Base base14 = response0.cookie("hi!===hi!==hi!==hi!=hi!=", "");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
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
        boolean boolean18 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!=hi!=Content-Encoding=");
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
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.cookie("hi!=hi!=Content-Encoding=");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding=hi!=hi!=", "hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.cookie("hi!===hi!=");
        boolean boolean6 = response0.hasHeader("hi!===hi!==");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!");
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.value("Content-Encoding=Content-Encoding===hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        java.lang.String str11 = keyVal7.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding" + "'", str8, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean10 = response0.hasHeaderWithValue("Content-Encoding", "");
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding", "hi!");
        boolean boolean15 = response0.hasCookie("Content-Encoding==hi!===hi!==hi!=");
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str6 = response0.header("hi!==hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        java.lang.String str22 = response19.header("Content-Encoding");
        org.jsoup.Connection.Base base24 = response19.removeHeader("hi!");
        java.lang.String str26 = response19.header("hi!");
        java.lang.String str27 = response19.statusMessage();
        java.util.Map map28 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Method method30 = response0.method();
        java.util.Map map31 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.value("Content-Encoding=Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.key("hi!=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal7.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
        java.lang.String str14 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==" + "'", str14, "hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
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
        java.lang.Class<?> wildcardClass25 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
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
        org.jsoup.Connection.Base base29 = response0.cookie("hi!===hi!==", "Content-Encoding");
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
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "Content-Encoding=hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding=Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
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
        java.util.Map map21 = response0.headers();
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
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!=", "", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        java.lang.String str73 = response0.contentType();
        org.jsoup.Connection.Base base76 = response0.cookie("hi!=Content-Encoding=Content-Encoding=", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean78 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str80 = response0.header("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
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
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(base76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("Content-Encoding=Content-Encoding");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal3.key();
        java.io.InputStream inputStream10 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal3.key("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.key("Content-Encoding=Content-Encoding=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.key("hi!=Content-Encoding=Content-Encoding=");
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.inputStream(inputStream17);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str6, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str9, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.value();
        java.lang.String str6 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=Content-Encoding=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding===hi!==hi!");
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str5, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        java.lang.String str10 = response0.header("hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!==hi!");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = keyVal5.inputStream();
        java.lang.String str8 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.key("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.cookie("Content-Encoding=Content-Encoding");
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
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
        boolean boolean44 = response0.hasCookie("hi!==");
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
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=", "Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("hi!");
        java.lang.String str15 = response11.cookie("Content-Encoding");
        java.lang.String str17 = response11.header("hi!=");
        java.lang.String str19 = response11.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str21 = response11.cookie("hi!=");
        java.util.Map map22 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "hi!=hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
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
        org.jsoup.Connection.Base base32 = response0.header("Content-Encoding===hi!==hi!", "Content-Encoding=Content-Encoding===hi!==hi!");
        java.net.URL uRL33 = response0.url();
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
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
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
        java.lang.String str28 = response0.header("hi!===hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base30 = response0.removeCookie("hi!==hi!=hi!=");
        org.jsoup.Connection.Method method31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base32 = response0.method(method31);
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base30);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
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
        boolean boolean23 = response0.hasHeaderWithValue("hi!===Content-Encoding=", "hi!==hi!=Content-Encoding");
        boolean boolean25 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding==hi!===hi!==hi!=", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("hi!", "hi!");
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Base base11 = response1.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str13 = response1.header("hi!=");
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Base base16 = response1.removeHeader("Content-Encoding");
        java.lang.String str18 = response1.header("hi!==hi!");
        org.jsoup.Connection.Base base20 = response1.removeCookie("Content-Encoding=");
        java.net.URL uRL21 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!===hi!=", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!==hi!===hi!=" + "'", str3, "hi!=hi!==hi!===hi!=");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
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
        java.lang.String str14 = response0.contentType();
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        org.jsoup.Connection.Method method30 = response0.method();
        org.jsoup.Connection.Method method31 = response0.method();
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
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(method31);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
        boolean boolean15 = keyVal11.hasInputStream();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal11.inputStream(inputStream16);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("hi!=hi!===Content-Encoding=");
        java.lang.String str20 = keyVal19.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding===hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
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
        boolean boolean45 = response0.hasCookie("Content-Encoding==hi!=Content-Encoding");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=Content-Encoding=", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.value();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        java.lang.String str8 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str4, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str5, "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!==Content-Encoding=Content-Encoding=" + "'", str8, "hi!==Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.removeHeader("Content-Encoding=");
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
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
        java.lang.String str31 = response0.cookie("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Base base34 = response0.header("Content-Encoding=Content-Encoding===hi!", "hi!==");
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base34);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.lang.String str6 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding" + "'", str6, "Content-Encoding");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=hi!=");
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
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
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
        java.util.Map map15 = response1.headers();
        org.jsoup.Connection.Base base18 = response1.header("hi!=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method19 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
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
        org.jsoup.Connection.Base base26 = response0.header("Content-Encoding==hi!===hi!==hi!=", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal5.value("Content-Encoding=Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!===");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.key("hi!===hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.cookie("Content-Encoding=");
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=");
        java.lang.String str6 = keyVal5.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6, "Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base11 = response0.header("hi!===hi!=", "Content-Encoding=");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        java.lang.String str15 = response0.header("hi!===hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.header("hi!=hi!===Content-Encoding=", "hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        java.lang.String str5 = response0.charset();
        java.lang.String str7 = response0.cookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!==Content-Encoding", "Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("Content-Encoding=");
        java.lang.String str8 = keyVal7.key();
        java.lang.String str9 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str5, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding=", "hi!");
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Base base14 = response0.cookie("Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!=Content-Encoding");
        java.lang.String str15 = response0.charset();
        org.jsoup.Connection.Base base17 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
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
        java.lang.String str25 = response0.cookie("hi!=Content-Encoding=hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
        java.lang.String str11 = response0.cookie("hi!==hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.header("hi!=hi!===Content-Encoding=", "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!");
        boolean boolean5 = keyVal4.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        java.lang.String str12 = keyVal3.key();
        java.io.InputStream inputStream13 = keyVal3.inputStream();
        java.lang.String str14 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=" + "'", str11, "hi!=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!==Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.header("hi!==hi!=", "hi!===hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("hi!=hi!");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding=");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream11 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
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
        boolean boolean47 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
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
        boolean boolean23 = response0.hasHeaderWithValue("hi!===hi!==Content-Encoding", "hi!==Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasCookie("Content-Encoding=Content-Encoding=");
        java.lang.String str9 = response0.header("hi!==hi!");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding==", "hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding=hi!", "Content-Encoding=Content-Encoding==hi!=");
        boolean boolean19 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=hi!=");
        boolean boolean21 = response0.hasHeader("hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("Content-Encoding");
        java.lang.String str10 = keyVal7.value();
        java.io.InputStream inputStream11 = keyVal7.inputStream();
        java.io.InputStream inputStream12 = keyVal7.inputStream();
        java.lang.String str13 = keyVal7.toString();
        java.io.InputStream inputStream14 = keyVal7.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding=" + "'", str13, "Content-Encoding=");
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "hi!==hi!");
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!=hi!=");
        java.lang.String str14 = keyVal13.toString();
        java.lang.String str15 = keyVal13.toString();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.inputStream(inputStream16);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal13.value("hi!");
        java.lang.String str20 = keyVal13.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=hi!=hi!=" + "'", str14, "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=hi!=hi!=" + "'", str15, "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Content-Encoding" + "'", str20, "Content-Encoding");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!=hi!==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal9.key("Content-Encoding=hi!");
        java.lang.String str14 = keyVal9.key();
        java.io.InputStream inputStream15 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=hi!" + "'", str14, "Content-Encoding=hi!");
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        org.jsoup.Connection.Base base4 = response1.removeHeader("Content-Encoding");
        java.lang.String str6 = response1.header("hi!=");
        int int7 = response1.statusCode();
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        java.util.Map map10 = response1.cookies();
        java.net.URL uRL11 = response1.url();
        boolean boolean13 = response1.hasHeader("Content-Encoding=Content-Encoding=");
        org.jsoup.Connection.Base base16 = response1.header("Content-Encoding==hi!===hi!=", "hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
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
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=hi!=hi!=", "hi!=hi!=");
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
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Base base6 = response0.header("Content-Encoding", "");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.headers();
        boolean boolean10 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=", "hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal9.key("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream13 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
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
        java.util.Map map15 = response0.cookies();
        java.net.URL uRL16 = response0.url();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        java.lang.String str22 = response19.header("Content-Encoding");
        org.jsoup.Connection.Base base24 = response19.removeHeader("hi!");
        java.lang.String str26 = response19.header("hi!");
        java.lang.String str27 = response19.statusMessage();
        java.util.Map map28 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.Class<?> wildcardClass30 = response0.getClass();
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!===Content-Encoding=", "hi!=hi!==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
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
        int int19 = response0.statusCode();
        boolean boolean22 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response0.parse();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=Content-Encoding", "Content-Encoding=");
        java.lang.String str12 = response0.header("hi!=");
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
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
        java.lang.String str26 = response0.cookie("hi!===");
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!==");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=Content-Encoding==", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
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
        java.net.URL uRL13 = response0.url();
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
        java.lang.String str32 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response33.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base38 = response33.cookie("Content-Encoding", "hi!");
        java.lang.String str39 = response33.charset();
        java.lang.String str40 = response33.statusMessage();
        boolean boolean43 = response33.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map44 = response33.headers();
        org.jsoup.Connection.Base base46 = response33.removeCookie("hi!==hi!=Content-Encoding");
        java.util.Map map47 = response33.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(base46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
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
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
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
        java.util.Map map25 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding==", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "hi!===hi!==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        boolean boolean7 = keyVal6.hasInputStream();
        java.lang.String str8 = keyVal6.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=" + "'", str8, "Content-Encoding=");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.cookies();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.header("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
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
        java.util.Map map40 = response0.headers();
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
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==");
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.cookie("hi!=hi!");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!===hi!=", "hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
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
        java.lang.String str24 = response0.contentType();
        java.util.Map map25 = response0.headers();
        org.jsoup.Connection.Method method26 = response0.method();
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
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
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
        java.lang.String str31 = response0.cookie("Content-Encoding=hi!==hi!");
        org.jsoup.Connection.Base base34 = response0.cookie("Content-Encoding===hi!==hi!", "hi!==hi!=Content-Encoding=Content-Encoding===hi!");
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base34);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
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
        org.jsoup.Connection.Method method39 = response0.method();
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
        org.junit.Assert.assertNull(method39);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        java.lang.String str10 = response1.cookie("Content-Encoding");
        boolean boolean12 = response1.hasCookie("Content-Encoding=Content-Encoding");
        java.util.Map map13 = response1.headers();
        boolean boolean15 = response1.hasHeader("Content-Encoding");
        boolean boolean18 = response1.hasHeaderWithValue("hi!==hi!=hi!=", "hi!==hi!=hi!=");
        java.net.URL uRL19 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
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
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
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
        java.lang.String str41 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base12 = response0.header("hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!", "hi!==hi!=Content-Encoding=Content-Encoding===hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
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
        org.jsoup.Connection.Base base23 = response0.removeHeader("hi!===hi!==Content-Encoding");
        org.jsoup.Connection.Base base26 = response0.cookie("Content-Encoding=hi!=hi!==hi!=Content-Encoding==", "hi!=");
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
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=", "Content-Encoding=Content-Encoding=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "Content-Encoding=Content-Encoding===hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
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
        java.lang.String str21 = response0.contentType();
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
        boolean boolean18 = response0.hasHeader("Content-Encoding=Content-Encoding=Content-Encoding==");
        java.util.Map map19 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response0.parse();
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
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
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.cookie("hi!=hi!==hi!===hi!=");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean8 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding=");
        boolean boolean14 = response0.hasCookie("Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.header("hi!=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!==hi!=Content-Encoding", "hi!");
        java.util.Map map15 = response0.cookies();
        boolean boolean18 = response0.hasHeaderWithValue("Content-Encoding=hi!==hi!", "Content-Encoding=hi!=Content-Encoding=");
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
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
        org.jsoup.Connection.Base base22 = response0.cookie("hi!==hi!=", "hi!===Content-Encoding==hi!==hi!");
        org.jsoup.Connection.Base base25 = response0.header("Content-Encoding=Content-Encoding=hi!==hi!", "");
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
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
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
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
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
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
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
        java.lang.String str18 = response0.statusMessage();
        java.lang.Class<?> wildcardClass19 = response0.getClass();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        java.lang.String str7 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!==");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!=hi!==hi!");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding=hi!==hi!", "hi!=Content-Encoding");
        int int15 = response0.statusCode();
        java.lang.String str17 = response0.cookie("Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "Content-Encoding==", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!===hi!==hi!=");
        java.lang.String str6 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding==" + "'", str6, "Content-Encoding==");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
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
        org.jsoup.Connection.Base base18 = response0.removeCookie("Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!=", "hi!=hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!==hi!", "Content-Encoding=Content-Encoding=");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.header("Content-Encoding=Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding=", "Content-Encoding=");
        java.lang.String str7 = response0.header("Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
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
        java.util.Map map24 = response0.cookies();
        org.jsoup.Connection.Method method25 = response0.method();
        java.lang.String str26 = response0.charset();
        int int27 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
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
        java.lang.String str30 = response0.statusMessage();
        java.lang.String str31 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = response0.body();
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
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
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
        java.lang.String str15 = response0.header("Content-Encoding=Content-Encoding=hi!===Content-Encoding=");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str5 = response3.cookie("hi!");
        java.util.Map map6 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeCookie("Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.cookie("Content-Encoding=Content-Encoding=hi!==hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        boolean boolean9 = keyVal8.hasInputStream();
        java.lang.String str10 = keyVal8.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("Content-Encoding=");
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        int int5 = response0.statusCode();
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding");
        boolean boolean11 = keyVal10.hasInputStream();
        java.io.InputStream inputStream12 = keyVal10.inputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = inputStream12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("");
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Encoding");
        java.lang.String str9 = keyVal3.toString();
        java.lang.String str10 = keyVal3.value();
        java.io.InputStream inputStream11 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal3.value("hi!=hi!=");
        java.lang.String str14 = keyVal13.toString();
        java.lang.String str15 = keyVal13.toString();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.inputStream(inputStream16);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.value("hi!=hi!");
        java.lang.String str22 = keyVal19.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=" + "'", str9, "Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=hi!=hi!=" + "'", str14, "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=hi!=hi!=" + "'", str15, "Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Content-Encoding=hi!=hi!" + "'", str22, "Content-Encoding=hi!=hi!");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.charset();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!==", "");
        java.util.Map map8 = response0.cookies();
        boolean boolean11 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=hi!=hi!=", "hi!==Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!===hi!==hi!==hi!=hi!=");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("Content-Encoding");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        java.lang.String str10 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Encoding=Content-Encoding=" + "'", str10, "Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
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
        boolean boolean32 = response0.hasHeader("Content-Encoding=Content-Encoding==");
        org.jsoup.Connection.Base base35 = response0.cookie("hi!==hi!=Content-Encoding", "hi!=");
        java.net.URL uRL36 = response0.url();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(uRL36);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=", "hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!==hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("Content-Encoding=");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!===Content-Encoding=");
        java.lang.String str11 = response0.cookie("hi!=Content-Encoding=Content-Encoding=hi!=hi!=");
        java.lang.String str13 = response0.cookie("hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.lang.String str5 = response0.header("hi!=");
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = response0.url();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding=Content-Encoding==");
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
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("Content-Encoding==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal7.value("Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        java.lang.String str12 = keyVal11.value();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.inputStream(inputStream13);
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
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
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
        org.jsoup.Connection.Base base24 = response0.removeHeader("Content-Encoding=");
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
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Base base7 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("Content-Encoding=Content-Encoding=");
        java.lang.String str12 = response0.header("hi!==");
        boolean boolean14 = response0.hasCookie("hi!==hi!");
        boolean boolean16 = response0.hasHeader("Content-Encoding=Content-Encoding==");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
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
        int int21 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response0.body();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.header("hi!=");
        java.lang.String str8 = response0.cookie("hi!=hi!==hi!===hi!=");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!===Content-Encoding=Content-Encoding===hi!=hi!==hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!===hi!==Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!");
        java.lang.String str11 = response0.header("hi!==Content-Encoding");
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.cookie("Content-Encoding", "hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base14 = response0.removeHeader("Content-Encoding=");
        org.jsoup.Connection.Method method15 = response0.method();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!", "hi!=hi!=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean6 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding==", "hi!");
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        boolean boolean4 = response0.hasHeaderWithValue("hi!", "hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        java.lang.Class<?> wildcardClass5 = map4.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Method method6 = response0.method();
        boolean boolean8 = response0.hasCookie("Content-Encoding=Content-Encoding=Content-Encoding===hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding==", "Content-Encoding==hi!=Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        java.util.Map map4 = response0.headers();
        boolean boolean6 = response0.hasCookie("Content-Encoding");
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
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
        java.lang.String str17 = response0.charset();
        java.util.Map map18 = response0.cookies();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
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
        org.jsoup.Connection.Base base14 = response0.removeHeader("Content-Encoding=");
        java.lang.String str15 = response0.charset();
        java.net.URL uRL16 = response0.url();
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
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Base base9 = response0.header("Content-Encoding", "Content-Encoding=Content-Encoding=");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasCookie("Content-Encoding=Content-Encoding===Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Method method5 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
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
        java.lang.String str19 = response0.header("Content-Encoding=hi!");
        boolean boolean21 = response0.hasHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Method method22 = response0.method();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        org.jsoup.Connection.Base base4 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.charset();
        boolean boolean13 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding===hi!=hi!==hi!=Content-Encoding=", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        boolean boolean3 = keyVal2.hasInputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.io.InputStream inputStream8 = keyVal2.inputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal2.inputStream(inputStream9);
        java.lang.String str11 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding" + "'", str11, "Content-Encoding");
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("hi!", "hi!");
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "Content-Encoding=");
        boolean boolean10 = response0.hasCookie("hi!");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
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
        org.jsoup.Connection.Base base20 = response0.cookie("Content-Encoding=Content-Encoding=hi!=", "hi!===hi!==Content-Encoding=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("Content-Encoding");
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        java.lang.String str12 = keyVal10.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
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
        int int21 = response0.statusCode();
        boolean boolean23 = response0.hasCookie("hi!");
        java.lang.String str25 = response0.header("hi!==");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("hi!");
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=", "Content-Encoding=");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.cookie("Content-Encoding");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
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
        java.lang.String str25 = response0.header("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
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
        org.junit.Assert.assertNull(str25);
    }
}

