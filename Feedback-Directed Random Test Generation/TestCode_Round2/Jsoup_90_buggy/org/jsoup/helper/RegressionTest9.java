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
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection13 = httpConnection0.data("hi!", "");
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.referrer("");
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection14.proxy(proxy17);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection24 = httpConnection19.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection connection27 = httpConnection19.response((org.jsoup.Connection.Response) response25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection19.sslSocketFactory(sSLSocketFactory28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL31 = request30.url();
        org.jsoup.Connection.Method method32 = request30.method();
        org.jsoup.Connection connection33 = httpConnection19.method(method32);
        org.jsoup.Connection connection34 = httpConnection14.method(method32);
        org.jsoup.Connection.Response response35 = httpConnection14.response();
        org.jsoup.Connection connection36 = httpConnection0.response(response35);
        org.jsoup.Connection connection38 = httpConnection0.referrer("UTF-8");
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method40 = response39.method();
        org.jsoup.Connection.Method method41 = response39.method();
        boolean boolean43 = response39.hasHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base46 = response39.addHeader("Content-Type", "Content-Type=multipart/form-data");
        org.jsoup.Connection connection47 = httpConnection0.response((org.jsoup.Connection.Response) response39);
        java.lang.String str49 = response39.header("Content-Encoding");
        java.lang.String str50 = response39.charset();
        boolean boolean52 = response39.hasCookie("UTF-8=hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertTrue("'" + method32 + "' != '" + org.jsoup.Connection.Method.GET + "'", method32.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(base46);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = request0.data();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request0.data();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser12 = request11.parser();
        java.lang.String str14 = request11.header("Content-Encoding");
        java.util.Map map15 = request11.multiHeaders();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.referrer("");
        org.jsoup.Connection connection21 = httpConnection16.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method23 = response22.method();
        org.jsoup.Connection connection24 = httpConnection16.response((org.jsoup.Connection.Response) response22);
        org.jsoup.Connection connection26 = httpConnection16.postDataCharset("UTF-8");
        org.jsoup.Connection connection28 = httpConnection16.ignoreContentType(true);
        org.jsoup.Connection connection30 = httpConnection16.referrer("Content-Type=multipart/form-data");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection16.sslSocketFactory(sSLSocketFactory31);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser34 = request33.parser();
        java.lang.String str36 = request33.header("Content-Encoding");
        boolean boolean38 = request33.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request41 = request33.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy42 = request41.proxy();
        org.jsoup.Connection connection43 = httpConnection16.proxy(proxy42);
        org.jsoup.helper.HttpConnection.Request request44 = request11.proxy(proxy42);
        org.jsoup.helper.HttpConnection.Request request45 = request0.proxy(proxy42);
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyValCollection9);
        org.junit.Assert.assertNotNull(keyValCollection10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(request45);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal4.contentType("hi!");
        java.lang.String str8 = keyVal4.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal4.inputStream(inputStream11);
        java.lang.String str13 = keyVal4.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal4.key("Content-Type");
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal4.inputStream(inputStream16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal4.inputStream(inputStream18);
        boolean boolean20 = keyVal19.hasInputStream();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        request5.sslSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = request5.proxy();
        org.jsoup.Connection.Request request10 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser12 = request11.parser();
        java.lang.String str14 = request11.header("Content-Encoding");
        org.jsoup.parser.Parser parser15 = request11.parser();
        java.util.Map map16 = request11.headers();
        org.jsoup.Connection.Request request18 = request11.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection23 = httpConnection19.userAgent("hi!");
        org.jsoup.Connection.Response response24 = null;
        org.jsoup.Connection connection25 = httpConnection19.response(response24);
        org.jsoup.Connection.Response response26 = null;
        org.jsoup.Connection connection27 = httpConnection19.response(response26);
        org.jsoup.Connection connection29 = httpConnection19.ignoreContentType(false);
        org.jsoup.Connection.Request request30 = httpConnection19.request();
        org.jsoup.Connection connection32 = httpConnection19.timeout((int) (byte) 100);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy34 = null;
        org.jsoup.helper.HttpConnection.Request request35 = request33.proxy(proxy34);
        org.jsoup.Connection.Request request37 = request33.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory38 = null;
        request33.sslSocketFactory(sSLSocketFactory38);
        java.lang.String str40 = request33.requestBody();
        java.net.Proxy proxy41 = request33.proxy();
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy43 = null;
        org.jsoup.helper.HttpConnection.Request request44 = request42.proxy(proxy43);
        java.util.List list46 = request42.headers("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method47 = request42.method();
        org.jsoup.Connection.Base base49 = request42.removeHeader("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL51 = request50.url();
        java.util.Map map52 = request50.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request53 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser54 = request53.parser();
        java.lang.String str56 = request53.header("Content-Encoding");
        boolean boolean58 = request53.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request61 = request53.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy62 = request61.proxy();
        org.jsoup.helper.HttpConnection.Request request63 = request50.proxy(proxy62);
        org.jsoup.helper.HttpConnection.Request request64 = request42.proxy(proxy62);
        org.jsoup.helper.HttpConnection.Request request65 = request33.proxy(proxy62);
        org.jsoup.Connection connection66 = httpConnection19.proxy(proxy62);
        org.jsoup.helper.HttpConnection.Request request67 = request11.proxy(proxy62);
        org.jsoup.helper.HttpConnection.Request request68 = request5.proxy(proxy62);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(proxy41);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + method47 + "' != '" + org.jsoup.Connection.Method.GET + "'", method47.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(proxy62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertNotNull(request68);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=hi!=Content-Encoding=Content-Type=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=hi!=Content-Encoding=Content-Type=multipart/form-data");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = response0.charset("hi!");
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = request12.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request17 = request12.data((org.jsoup.Connection.KeyVal) keyVal16);
        java.net.URL uRL18 = request17.url();
        java.io.InputStream inputStream21 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream21);
        java.io.InputStream inputStream23 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal22.inputStream(inputStream23);
        java.io.InputStream inputStream25 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal22.inputStream(inputStream25);
        org.jsoup.helper.HttpConnection.Request request27 = request17.data((org.jsoup.Connection.KeyVal) keyVal22);
        org.jsoup.Connection.Request request29 = request17.ignoreContentType(false);
        org.jsoup.Connection.Method method30 = request17.method();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        request17.sslSocketFactory(sSLSocketFactory31);
        java.lang.String str34 = request17.cookie("Content-Type=multipart/form-data");
        java.io.InputStream inputStream37 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "multipart/form-data", inputStream37);
        java.lang.String str39 = keyVal38.contentType();
        java.lang.String str40 = keyVal38.key();
        java.lang.String str41 = keyVal38.key();
        org.jsoup.helper.HttpConnection.Request request42 = request17.data((org.jsoup.Connection.KeyVal) keyVal38);
        org.jsoup.helper.HttpConnection.Request request45 = request17.proxy("Content-Type=multipart/form-data", (int) ' ');
        org.jsoup.Connection.Method method46 = request17.method();
        org.jsoup.Connection.Base base47 = response0.method(method46);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertTrue("'" + method30 + "' != '" + org.jsoup.Connection.Method.GET + "'", method30.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Content-Type" + "'", str40, "Content-Type");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Content-Type" + "'", str41, "Content-Type");
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertTrue("'" + method46 + "' != '" + org.jsoup.Connection.Method.GET + "'", method46.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base47);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.Connection connection13 = httpConnection0.proxy("hi!", 0);
        org.jsoup.Connection connection15 = httpConnection0.maxBodySize((int) '4');
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection19 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection21 = httpConnection0.timeout(10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.util.List list12 = request8.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base14 = request8.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Map map15 = request8.cookies();
        org.jsoup.helper.HttpConnection.Request request18 = request8.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", (int) (short) 1);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL23 = request22.url();
        org.jsoup.Connection.Method method24 = request22.method();
        org.jsoup.Connection connection25 = httpConnection19.request((org.jsoup.Connection.Request) request22);
        org.jsoup.Connection connection27 = httpConnection19.timeout(10);
        org.jsoup.Connection connection29 = httpConnection19.maxBodySize(1048576);
        org.jsoup.Connection connection31 = httpConnection19.referrer("hi!=");
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection34 = httpConnection32.referrer("");
        org.jsoup.Connection connection37 = httpConnection32.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method39 = response38.method();
        org.jsoup.Connection connection40 = httpConnection32.response((org.jsoup.Connection.Response) response38);
        org.jsoup.Connection.Response response41 = httpConnection32.response();
        org.jsoup.Connection.Response response42 = httpConnection32.response();
        org.jsoup.helper.HttpConnection.Request request43 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser44 = request43.parser();
        java.lang.String str46 = request43.header("Content-Encoding");
        java.lang.String str47 = request43.requestBody();
        org.jsoup.Connection.Request request49 = request43.maxBodySize((int) (byte) 10);
        boolean boolean51 = request43.hasCookie("hi!");
        org.jsoup.Connection.Method method52 = request43.method();
        boolean boolean53 = request43.followRedirects();
        org.jsoup.helper.HttpConnection.Request request54 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser55 = request54.parser();
        org.jsoup.helper.HttpConnection.Request request56 = request43.parser(parser55);
        org.jsoup.Connection connection57 = httpConnection32.parser(parser55);
        org.jsoup.Connection connection58 = httpConnection19.parser(parser55);
        org.jsoup.helper.HttpConnection.Request request59 = request18.parser(parser55);
        boolean boolean61 = request59.hasHeader("Content-Encoding");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + method24 + "' != '" + org.jsoup.Connection.Method.GET + "'", method24.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + method52 + "' != '" + org.jsoup.Connection.Method.GET + "'", method52.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser12 = request5.parser();
        org.jsoup.Connection.Base base14 = request5.removeHeader("UTF-8");
        java.net.URL uRL15 = request5.url();
        org.jsoup.Connection.Method method16 = request5.method();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL15 = request14.url();
        org.jsoup.Connection.Method method16 = request14.method();
        org.jsoup.Connection.Base base17 = response11.method(method16);
        org.jsoup.Connection connection18 = httpConnection0.method(method16);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection24 = httpConnection19.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection connection27 = httpConnection19.response((org.jsoup.Connection.Response) response25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection19.sslSocketFactory(sSLSocketFactory28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL31 = request30.url();
        org.jsoup.Connection.Method method32 = request30.method();
        org.jsoup.Connection connection33 = httpConnection19.method(method32);
        org.jsoup.Connection connection34 = httpConnection0.method(method32);
        org.jsoup.helper.HttpConnection.Request request35 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory36 = request35.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request40 = request35.data((org.jsoup.Connection.KeyVal) keyVal39);
        boolean boolean41 = request35.ignoreContentType();
        org.jsoup.Connection connection42 = httpConnection0.request((org.jsoup.Connection.Request) request35);
        org.jsoup.Connection.Request request44 = request35.maxBodySize((int) (short) 100);
        org.jsoup.Connection.Method method45 = request35.method();
        boolean boolean46 = request35.ignoreContentType();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertTrue("'" + method32 + "' != '" + org.jsoup.Connection.Method.GET + "'", method32.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNull(sSLSocketFactory36);
        org.junit.Assert.assertNotNull(keyVal39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertTrue("'" + method45 + "' != '" + org.jsoup.Connection.Method.GET + "'", method45.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.net.Proxy proxy11 = request8.proxy();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser13 = request12.parser();
        org.jsoup.helper.HttpConnection.Request request14 = request8.parser(parser13);
        boolean boolean15 = request8.followRedirects();
        org.jsoup.Connection.Request request17 = request8.followRedirects(false);
        org.jsoup.Connection.Base base19 = request8.removeCookie("application/x-www-form-urlencoded");
        java.lang.String str20 = request8.requestBody();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request0.data(keyVal10);
        java.util.List list13 = request11.headers("Content-Encoding=hi!");
        java.util.Map map14 = request11.cookies();
        java.util.Map map15 = request11.cookies();
        org.jsoup.helper.HttpConnection.Request request17 = request11.timeout(30000);
        org.jsoup.parser.Parser parser18 = request17.parser();
        boolean boolean19 = request17.followRedirects();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        boolean boolean8 = request0.ignoreContentType();
        org.jsoup.parser.Parser parser9 = request0.parser();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = request0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.lang.String str8 = request0.cookie("Content-Type=multipart/form-data");
        java.util.List list10 = request0.headers("hi!");
        java.net.URL uRL11 = request0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Request request14 = request0.proxy("UTF-8=Content-Type", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str12 = keyVal11.contentType();
        org.jsoup.Connection.KeyVal keyVal14 = keyVal11.contentType("multipart/form-data");
        java.lang.String str15 = keyVal11.toString();
        boolean boolean16 = keyVal11.hasInputStream();
        org.jsoup.helper.HttpConnection.Request request17 = request0.data((org.jsoup.Connection.KeyVal) keyVal11);
        java.util.Map map18 = request0.headers();
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=" + "'", str15, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = request7.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request12 = request7.data((org.jsoup.Connection.KeyVal) keyVal11);
        org.jsoup.Connection.Request request14 = request12.followRedirects(true);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request12.data();
        org.jsoup.Connection connection16 = httpConnection0.data(keyValCollection15);
        org.jsoup.Connection.Response response17 = httpConnection0.response();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(keyValCollection15);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection13 = httpConnection0.data("hi!", "");
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.referrer("");
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection14.proxy(proxy17);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection24 = httpConnection19.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection connection27 = httpConnection19.response((org.jsoup.Connection.Response) response25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection19.sslSocketFactory(sSLSocketFactory28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL31 = request30.url();
        org.jsoup.Connection.Method method32 = request30.method();
        org.jsoup.Connection connection33 = httpConnection19.method(method32);
        org.jsoup.Connection connection34 = httpConnection14.method(method32);
        org.jsoup.Connection.Response response35 = httpConnection14.response();
        org.jsoup.Connection connection36 = httpConnection0.response(response35);
        org.jsoup.Connection connection38 = httpConnection0.userAgent("hi!=hi!");
        org.jsoup.helper.HttpConnection httpConnection39 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection41 = httpConnection39.referrer("");
        org.jsoup.Connection connection44 = httpConnection39.header("hi!", "");
        org.jsoup.Connection connection46 = httpConnection39.ignoreContentType(true);
        java.io.InputStream inputStream49 = null;
        org.jsoup.Connection connection50 = httpConnection39.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream49);
        org.jsoup.Connection connection52 = httpConnection39.timeout(0);
        org.jsoup.Connection connection54 = httpConnection39.ignoreHttpErrors(true);
        org.jsoup.Connection.Response response55 = httpConnection39.response();
        org.jsoup.Connection connection56 = httpConnection0.response(response55);
        org.jsoup.helper.HttpConnection httpConnection57 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection59 = httpConnection57.referrer("");
        org.jsoup.Connection connection62 = httpConnection57.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response63 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method64 = response63.method();
        org.jsoup.Connection connection65 = httpConnection57.response((org.jsoup.Connection.Response) response63);
        java.lang.String str66 = response63.contentType();
        java.util.Map map67 = response63.multiHeaders();
        org.jsoup.Connection connection68 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map67);
        org.jsoup.Connection connection70 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertTrue("'" + method32 + "' != '" + org.jsoup.Connection.Method.GET + "'", method32.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNull(method64);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection70);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base7 = request0.header("Content-Type", "");
        org.jsoup.Connection.Request request9 = request0.requestBody("hi!=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser3 = request2.parser();
        java.lang.String str5 = request2.header("Content-Encoding");
        org.jsoup.parser.Parser parser6 = request2.parser();
        org.jsoup.helper.HttpConnection.Request request7 = request0.parser(parser6);
        org.jsoup.Connection.Request request9 = request0.ignoreContentType(true);
        boolean boolean11 = request0.hasCookie("Content-Type=hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request0.timeout((int) (byte) 100);
        java.net.Proxy proxy14 = request0.proxy();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Base base10 = response6.removeCookie("Content-Type");
        int int11 = response6.statusCode();
        java.net.URL uRL12 = response6.url();
        java.lang.String str13 = response6.statusMessage();
        java.lang.String str15 = response6.header("application/x-www-form-urlencoded");
        java.lang.String str16 = response6.statusMessage();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection9 = httpConnection0.followRedirects(true);
        org.jsoup.Connection.Request request10 = httpConnection0.request();
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Encoding=hi!=Content-Encoding=hi!=", inputStream13);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        boolean boolean2 = request0.followRedirects();
        java.lang.String str4 = request0.cookie("Content-Type=multipart/form-data");
        java.util.List list6 = request0.headers("application/x-www-form-urlencoded");
        java.util.Map map7 = request0.multiHeaders();
        org.jsoup.Connection.Base base9 = request0.removeCookie("Content-Encoding=hi!=Content-Type=hi!");
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy11 = null;
        org.jsoup.helper.HttpConnection.Request request12 = request10.proxy(proxy11);
        java.net.Proxy proxy13 = request10.proxy();
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.referrer("");
        org.jsoup.Connection connection19 = httpConnection14.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method21 = response20.method();
        org.jsoup.Connection connection22 = httpConnection14.response((org.jsoup.Connection.Response) response20);
        java.lang.String str23 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = response20.charset("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser27 = request26.parser();
        java.lang.String str29 = request26.header("Content-Encoding");
        java.lang.String str30 = request26.requestBody();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base33 = response31.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL35 = request34.url();
        org.jsoup.Connection.Method method36 = request34.method();
        org.jsoup.Connection.Base base37 = response31.method(method36);
        org.jsoup.Connection.Base base38 = request26.method(method36);
        org.jsoup.Connection.Base base39 = response25.method(method36);
        org.jsoup.Connection.Base base40 = request10.method(method36);
        org.jsoup.Connection.Base base41 = request0.method(method36);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertTrue("'" + method36 + "' != '" + org.jsoup.Connection.Method.GET + "'", method36.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNotNull(base40);
        org.junit.Assert.assertNotNull(base41);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        org.jsoup.Connection.Method method10 = request0.method();
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean3 = request0.ignoreHttpErrors();
        org.jsoup.Connection.Base base5 = request0.removeCookie("Content-Encoding=hi!");
        org.jsoup.parser.Parser parser6 = request0.parser();
        org.jsoup.Connection.Base base9 = request0.cookie("application/x-www-form-urlencoded", "Content-Type=hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request0.data();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = request0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(keyValCollection10);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.KeyVal keyVal15 = keyVal12.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request5.data((org.jsoup.Connection.KeyVal) keyVal12);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream19);
        java.io.InputStream inputStream21 = keyVal20.inputStream();
        org.jsoup.helper.HttpConnection.Request request22 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        java.lang.String str24 = request22.header("hi!=");
        int int25 = request22.timeout();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30000 + "'", int25 == 30000);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        request0.sslSocketFactory(sSLSocketFactory5);
        java.lang.String str7 = request0.requestBody();
        java.net.Proxy proxy8 = request0.proxy();
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy10 = null;
        org.jsoup.helper.HttpConnection.Request request11 = request9.proxy(proxy10);
        java.util.List list13 = request9.headers("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method14 = request9.method();
        org.jsoup.Connection.Base base16 = request9.removeHeader("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL18 = request17.url();
        java.util.Map map19 = request17.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser21 = request20.parser();
        java.lang.String str23 = request20.header("Content-Encoding");
        boolean boolean25 = request20.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request28 = request20.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy29 = request28.proxy();
        org.jsoup.helper.HttpConnection.Request request30 = request17.proxy(proxy29);
        org.jsoup.helper.HttpConnection.Request request31 = request9.proxy(proxy29);
        org.jsoup.helper.HttpConnection.Request request32 = request0.proxy(proxy29);
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser34 = request33.parser();
        org.jsoup.helper.HttpConnection.Request request35 = request0.parser(parser34);
        java.util.List list37 = request0.headers("hi!=");
        int int38 = request0.maxBodySize();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1048576 + "'", int38 == 1048576);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.statusMessage();
        java.lang.String str10 = response6.charset();
        java.lang.String str11 = response6.statusMessage();
        java.lang.String str12 = response6.statusMessage();
        org.jsoup.Connection.Base base15 = response6.addHeader("hi!==", "hi!=");
        java.lang.String str16 = response6.contentType();
        java.lang.String str17 = response6.contentType();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.lang.String str11 = response6.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream12 = response6.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.referrer("");
        org.jsoup.Connection connection12 = httpConnection7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        org.jsoup.Connection connection15 = httpConnection7.response((org.jsoup.Connection.Response) response13);
        java.lang.String str16 = response13.contentType();
        java.lang.String str17 = response13.contentType();
        java.lang.String str18 = response13.contentType();
        java.lang.String str19 = response13.contentType();
        java.util.Map map20 = response13.headers();
        org.jsoup.Connection connection21 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.url("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.cookie("UTF-8", "");
        java.lang.String str13 = response6.statusMessage();
        org.jsoup.Connection.Base base16 = response6.header("Content-Encoding", "UTF-8");
        java.util.Map map17 = response6.headers();
        boolean boolean20 = response6.hasHeaderWithValue("Content-Encoding", "multipart/form-data");
        boolean boolean22 = response6.hasCookie("Content-Encoding=hi!");
        int int23 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser8 = request7.parser();
        org.jsoup.helper.HttpConnection.Request request9 = request6.parser(parser8);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        boolean boolean8 = request5.hasHeader("hi!");
        org.jsoup.Connection.Request request10 = request5.ignoreContentType(false);
        java.lang.String str12 = request5.header("");
        boolean boolean13 = request5.ignoreContentType();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.util.List list12 = request8.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base14 = request8.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Map map15 = request8.cookies();
        org.jsoup.helper.HttpConnection.Request request18 = request8.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", (int) (short) 1);
        org.jsoup.Connection.Request request20 = request8.ignoreHttpErrors(false);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request20);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base9 = response0.addHeader("Content-Type", "multipart/form-data");
        java.lang.String str11 = response0.header("UTF-8");
        org.jsoup.Connection.Base base13 = response0.removeCookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.referrer("");
        org.jsoup.Connection connection19 = httpConnection14.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method21 = response20.method();
        org.jsoup.Connection connection22 = httpConnection14.response((org.jsoup.Connection.Response) response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base25 = response23.removeCookie("hi!");
        java.util.Map map26 = response23.cookies();
        org.jsoup.Connection connection27 = httpConnection14.data((java.util.Map<java.lang.String, java.lang.String>) map26);
        org.jsoup.Connection connection29 = httpConnection14.requestBody("");
        org.jsoup.Connection connection31 = httpConnection14.ignoreContentType(true);
        java.io.InputStream inputStream34 = null;
        org.jsoup.Connection connection35 = httpConnection14.data("Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream34);
        org.jsoup.Connection.Response response36 = httpConnection14.response();
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection39 = httpConnection37.referrer("");
        org.jsoup.Connection connection42 = httpConnection37.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method44 = response43.method();
        org.jsoup.Connection connection45 = httpConnection37.response((org.jsoup.Connection.Response) response43);
        java.lang.String str46 = response43.contentType();
        org.jsoup.Connection.Base base49 = response43.cookie("UTF-8", "");
        java.lang.String str50 = response43.statusMessage();
        int int51 = response43.statusCode();
        org.jsoup.Connection connection52 = httpConnection14.response((org.jsoup.Connection.Response) response43);
        java.util.Map map53 = response43.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        boolean boolean56 = response0.hasCookie("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.referrer("Content-Encoding");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection0.timeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!", "multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream20 = null;
        org.jsoup.Connection connection21 = httpConnection0.data("Content-Encoding=hi!=Content-Type=hi!", "Content-Type=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.net.URL uRL7 = request0.url();
        java.net.Proxy proxy8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.proxy(proxy8);
        java.net.Proxy proxy10 = null;
        org.jsoup.helper.HttpConnection.Request request11 = request0.proxy(proxy10);
        boolean boolean12 = request0.ignoreContentType();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("Content-Type=multipart/form-data");
        java.lang.String str19 = keyVal18.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal18.key("hi!");
        org.jsoup.helper.HttpConnection.Request request22 = request0.data((org.jsoup.Connection.KeyVal) keyVal21);
        java.lang.String str24 = request22.cookie("Content-Encoding");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Content-Type=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str19, "Content-Type=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser8 = request7.parser();
        java.lang.String str10 = request7.header("Content-Encoding");
        org.jsoup.parser.Parser parser11 = request7.parser();
        org.jsoup.Connection connection12 = httpConnection0.parser(parser11);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection connection16 = httpConnection0.response((org.jsoup.Connection.Response) response15);
        boolean boolean18 = response15.hasCookie("hi!==");
        org.jsoup.Connection.Base base20 = response15.removeHeader("hi!=");
        java.lang.String str22 = response15.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response15.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean3 = request0.ignoreHttpErrors();
        org.jsoup.Connection.Base base5 = request0.removeCookie("Content-Encoding=hi!");
        boolean boolean6 = request0.ignoreContentType();
        org.jsoup.Connection.Base base9 = request0.cookie("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.Request request11 = request0.timeout((int) '4');
        java.util.Map map12 = request0.multiHeaders();
        java.net.Proxy proxy13 = request0.proxy();
        org.jsoup.parser.Parser parser14 = request0.parser();
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.Connection.KeyVal keyVal19 = keyVal17.contentType("application/x-www-form-urlencoded");
        java.lang.String str20 = keyVal17.key();
        java.io.InputStream inputStream21 = keyVal17.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal17.key("multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request24 = request0.data((org.jsoup.Connection.KeyVal) keyVal23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection.Method method27 = response25.method();
        java.net.URL uRL28 = response25.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request24, response25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(uRL28);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.charset();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!==", "UTF-8=hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream9 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("");
        java.lang.String str5 = keyVal4.toString();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.lang.String str8 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.referrer("");
        org.jsoup.Connection connection10 = httpConnection5.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        org.jsoup.Connection connection13 = httpConnection5.response((org.jsoup.Connection.Response) response11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection5.sslSocketFactory(sSLSocketFactory14);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL17 = request16.url();
        org.jsoup.Connection.Method method18 = request16.method();
        org.jsoup.Connection connection19 = httpConnection5.method(method18);
        org.jsoup.Connection connection20 = httpConnection0.method(method18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        org.jsoup.Connection connection22 = httpConnection0.sslSocketFactory(sSLSocketFactory21);
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + method18 + "' != '" + org.jsoup.Connection.Method.GET + "'", method18.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        org.jsoup.Connection.Response response10 = httpConnection0.response();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.referrer("");
        org.jsoup.Connection connection15 = httpConnection11.userAgent("hi!");
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection11.response(response16);
        org.jsoup.Connection connection19 = httpConnection11.maxBodySize((int) (short) 1);
        java.net.Proxy proxy20 = null;
        org.jsoup.Connection connection21 = httpConnection11.proxy(proxy20);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL23 = request22.url();
        org.jsoup.Connection.Method method24 = request22.method();
        java.lang.String str25 = request22.postDataCharset();
        int int26 = request22.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request28 = request22.timeout((int) 'a');
        java.util.Map map29 = request22.multiHeaders();
        org.jsoup.Connection.Base base32 = request22.header("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base35 = request22.cookie("Content-Type", "UTF-8");
        org.jsoup.Connection.Method method36 = request22.method();
        org.jsoup.Connection connection37 = httpConnection11.method(method36);
        org.jsoup.Connection connection38 = httpConnection0.method(method36);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + method24 + "' != '" + org.jsoup.Connection.Method.GET + "'", method24.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-8" + "'", str25, "UTF-8");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1048576 + "'", int26 == 1048576);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertTrue("'" + method36 + "' != '" + org.jsoup.Connection.Method.GET + "'", method36.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection38);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        org.jsoup.Connection.Base base4 = request0.removeHeader("Content-Type=multipart/form-data");
        boolean boolean5 = request0.followRedirects();
        org.jsoup.Connection.Base base7 = request0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = request0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        java.lang.String str14 = response6.cookie("Content-Type=hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        java.lang.String str7 = request0.postDataCharset();
        org.jsoup.Connection.Request request9 = request0.followRedirects(false);
        java.lang.String str10 = request0.postDataCharset();
        java.util.Map map11 = request0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.maxBodySize(100);
        org.jsoup.Connection connection5 = httpConnection0.data("multipart/form-data", "");
        java.io.InputStream inputStream8 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("hi!==", "Content-Encoding", inputStream8, "UTF-8");
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.referrer("");
        org.jsoup.Connection connection16 = httpConnection11.header("hi!", "");
        org.jsoup.Connection connection19 = httpConnection11.cookie("multipart/form-data", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection23 = httpConnection11.data("multipart/form-data", "multipart/form-data", inputStream22);
        org.jsoup.Connection connection26 = httpConnection11.header("Content-Type=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        org.jsoup.Connection connection28 = httpConnection11.timeout(0);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method30 = response29.method();
        java.util.Map map31 = response29.headers();
        java.lang.String str32 = response29.statusMessage();
        org.jsoup.Connection.Base base35 = response29.addHeader("UTF-8", "UTF-8");
        java.lang.String str37 = response29.cookie("multipart/form-data");
        java.util.Map map38 = response29.cookies();
        org.jsoup.Connection connection39 = httpConnection11.headers((java.util.Map<java.lang.String, java.lang.String>) map38);
        org.jsoup.Connection connection40 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map38);
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection43 = httpConnection41.referrer("");
        java.net.Proxy proxy44 = null;
        org.jsoup.Connection connection45 = httpConnection41.proxy(proxy44);
        org.jsoup.Connection.Request request46 = httpConnection41.request();
        org.jsoup.Connection connection49 = httpConnection41.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection51 = httpConnection41.userAgent("");
        org.jsoup.Connection connection53 = httpConnection41.followRedirects(true);
        org.jsoup.Connection connection55 = httpConnection41.followRedirects(false);
        org.jsoup.Connection.Request request56 = httpConnection41.request();
        org.jsoup.Connection connection58 = httpConnection41.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory60 = request59.sslSocketFactory();
        java.util.List list62 = request59.headers("Content-Encoding");
        java.util.Map map63 = request59.headers();
        org.jsoup.Connection.Base base66 = request59.cookie("UTF-8", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        java.io.InputStream inputStream69 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal70 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream69);
        java.io.InputStream inputStream71 = keyVal70.inputStream();
        java.io.InputStream inputStream72 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal73 = keyVal70.inputStream(inputStream72);
        java.io.InputStream inputStream74 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal75 = keyVal73.inputStream(inputStream74);
        org.jsoup.helper.HttpConnection.KeyVal keyVal77 = keyVal75.key("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal79 = keyVal77.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.Request request80 = request59.data((org.jsoup.Connection.KeyVal) keyVal77);
        java.util.Map map81 = request80.multiHeaders();
        java.net.URL uRL82 = request80.url();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection83 = request80.data();
        org.jsoup.Connection connection84 = httpConnection41.data(keyValCollection83);
        org.jsoup.Connection connection85 = httpConnection0.data(keyValCollection83);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNull(sSLSocketFactory60);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(base66);
        org.junit.Assert.assertNotNull(keyVal70);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(keyVal73);
        org.junit.Assert.assertNotNull(keyVal75);
        org.junit.Assert.assertNotNull(keyVal77);
        org.junit.Assert.assertNotNull(keyVal79);
        org.junit.Assert.assertNotNull(request80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(uRL82);
        org.junit.Assert.assertNotNull(keyValCollection83);
        org.junit.Assert.assertNotNull(connection84);
        org.junit.Assert.assertNotNull(connection85);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        boolean boolean10 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser12 = request11.parser();
        org.jsoup.helper.HttpConnection.Request request13 = request0.parser(parser12);
        org.jsoup.Connection.Base base15 = request0.removeCookie("application/x-www-form-urlencoded");
        org.jsoup.Connection.Method method16 = request0.method();
        org.jsoup.Connection.Request request18 = request0.maxBodySize(30000);
        org.jsoup.Connection.Request request20 = request0.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request20);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection8 = httpConnection0.cookie("multipart/form-data", "hi!");
        org.jsoup.Connection connection10 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        org.jsoup.helper.HttpConnection.Request request13 = request5.timeout(30000);
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser15 = request14.parser();
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = request16.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request21 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        java.lang.String str22 = keyVal20.value();
        org.jsoup.helper.HttpConnection.Request request23 = request14.data((org.jsoup.Connection.KeyVal) keyVal20);
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal20.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = keyVal20.value("hi!");
        org.jsoup.helper.HttpConnection.Request request28 = request5.data((org.jsoup.Connection.KeyVal) keyVal27);
        java.lang.String str30 = request5.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.jsoup.helper.HttpConnection.Request request33 = request5.proxy("hi!=", 0);
        org.jsoup.parser.Parser parser34 = request5.parser();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(parser34);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        org.jsoup.Connection.Request request11 = request0.ignoreContentType(false);
        java.lang.String str12 = request0.requestBody();
        org.jsoup.parser.Parser parser13 = request0.parser();
        int int14 = request0.timeout();
        boolean boolean17 = request0.hasHeaderWithValue("UTF-8=Content-Type", "hi!=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30000 + "'", int14 == 30000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(true);
        boolean boolean5 = request0.ignoreHttpErrors();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.referrer("");
        org.jsoup.Connection connection15 = httpConnection10.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.Connection connection18 = httpConnection10.response((org.jsoup.Connection.Response) response16);
        java.lang.String str19 = response16.contentType();
        java.lang.String str20 = response16.contentType();
        org.jsoup.helper.HttpConnection.Response response22 = response16.charset("UTF-8");
        java.util.List list24 = response16.headers("hi!");
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser26 = request25.parser();
        java.lang.String str28 = request25.header("Content-Encoding");
        java.lang.String str29 = request25.requestBody();
        org.jsoup.Connection.Request request31 = request25.maxBodySize((int) (byte) 10);
        boolean boolean33 = request25.hasCookie("hi!");
        org.jsoup.Connection.Method method34 = request25.method();
        org.jsoup.Connection.Base base35 = response16.method(method34);
        org.jsoup.Connection connection36 = httpConnection0.method(method34);
        org.jsoup.Connection connection38 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection40 = httpConnection0.requestBody("");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method42 = response41.method();
        java.util.Map map43 = response41.headers();
        java.lang.String str44 = response41.statusMessage();
        java.lang.String str45 = response41.contentType();
        org.jsoup.Connection.Base base47 = response41.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection48 = httpConnection0.response((org.jsoup.Connection.Response) response41);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory49 = null;
        org.jsoup.Connection connection50 = httpConnection0.sslSocketFactory(sSLSocketFactory49);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + method34 + "' != '" + org.jsoup.Connection.Method.GET + "'", method34.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(base47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        java.util.Map map9 = request5.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request11 = request5.timeout((int) (short) 0);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = request11.sslSocketFactory();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection13 = request11.data();
        java.lang.String str14 = request11.requestBody();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(keyValCollection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.helper.HttpConnection httpConnection1 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection1.referrer("");
        org.jsoup.Connection connection6 = httpConnection1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.Connection connection9 = httpConnection1.response((org.jsoup.Connection.Response) response7);
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Base base13 = response7.cookie("UTF-8", "");
        int int14 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = request9.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request14 = request9.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int15 = request14.timeout();
        java.net.Proxy proxy16 = null;
        org.jsoup.helper.HttpConnection.Request request17 = request14.proxy(proxy16);
        boolean boolean20 = request14.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser21 = request14.parser();
        org.jsoup.Connection connection22 = httpConnection0.parser(parser21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.referrer("");
        org.jsoup.Connection connection27 = httpConnection23.userAgent("hi!");
        org.jsoup.Connection.Response response28 = null;
        org.jsoup.Connection connection29 = httpConnection23.response(response28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser31 = request30.parser();
        java.lang.String str33 = request30.header("Content-Encoding");
        org.jsoup.parser.Parser parser34 = request30.parser();
        org.jsoup.Connection connection35 = httpConnection23.parser(parser34);
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.referrer("");
        org.jsoup.Connection connection41 = httpConnection36.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method43 = response42.method();
        org.jsoup.Connection connection44 = httpConnection36.response((org.jsoup.Connection.Response) response42);
        java.lang.String str45 = response42.contentType();
        java.util.Map map46 = response42.multiHeaders();
        org.jsoup.Connection connection47 = httpConnection23.cookies((java.util.Map<java.lang.String, java.lang.String>) map46);
        org.jsoup.Connection connection48 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map46);
        java.io.InputStream inputStream51 = null;
        org.jsoup.Connection connection52 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream51);
        org.jsoup.Connection connection54 = httpConnection0.timeout((int) (short) 100);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        request0.sslSocketFactory(sSLSocketFactory4);
        boolean boolean6 = request0.followRedirects();
        org.jsoup.Connection.Request request8 = request0.requestBody("");
        boolean boolean10 = request0.hasHeader("Content-Type=hi!");
        java.net.URL uRL11 = request0.url();
        boolean boolean14 = request0.hasHeaderWithValue("Content-Encoding=hi!=Content-Encoding", "hi!==");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        org.jsoup.Connection.Base base9 = request0.header("hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.parser.Parser parser10 = request0.parser();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = request11.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request11.data((org.jsoup.Connection.KeyVal) keyVal15);
        boolean boolean17 = keyVal15.hasInputStream();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal15);
        java.util.Map map19 = request0.headers();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = request0.sslSocketFactory();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(sSLSocketFactory20);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base9 = response0.addHeader("Content-Type", "multipart/form-data");
        java.lang.String str11 = response0.header("UTF-8");
        java.lang.String str13 = response0.cookie("hi!");
        org.jsoup.Connection.Base base16 = response0.addHeader("hi!==", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response18 = response0.charset("Content-Type=hi!=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection.Request request7 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser8 = request7.parser();
        java.lang.String str10 = request7.header("Content-Encoding");
        org.jsoup.parser.Parser parser11 = request7.parser();
        org.jsoup.Connection connection12 = httpConnection0.parser(parser11);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection16 = httpConnection0.userAgent("UTF-8");
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.referrer("");
        org.jsoup.Connection connection21 = httpConnection17.userAgent("hi!");
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection17.response(response22);
        org.jsoup.Connection.Response response24 = null;
        org.jsoup.Connection connection25 = httpConnection17.response(response24);
        org.jsoup.Connection connection27 = httpConnection17.ignoreContentType(false);
        org.jsoup.Connection connection30 = httpConnection17.data("hi!", "");
        org.jsoup.Connection connection32 = httpConnection17.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection34 = httpConnection17.ignoreContentType(false);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection37 = httpConnection35.referrer("");
        org.jsoup.Connection connection40 = httpConnection35.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method42 = response41.method();
        org.jsoup.Connection connection43 = httpConnection35.response((org.jsoup.Connection.Response) response41);
        org.jsoup.Connection connection45 = httpConnection35.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory46 = null;
        org.jsoup.Connection connection47 = httpConnection35.sslSocketFactory(sSLSocketFactory46);
        java.lang.String[] strArray54 = new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" };
        org.jsoup.Connection connection55 = httpConnection35.data(strArray54);
        org.jsoup.Connection connection56 = httpConnection17.data(strArray54);
        org.jsoup.Connection connection57 = httpConnection0.data(strArray54);
        org.jsoup.Connection connection59 = httpConnection0.timeout((int) (short) 1);
        org.jsoup.Connection connection61 = httpConnection0.ignoreContentType(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" });
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(connection61);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", inputStream2);
        org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeCookie("hi!");
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection connection13 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map12);
        org.jsoup.Connection connection15 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = request16.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request21 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        int int22 = request21.timeout();
        java.net.Proxy proxy23 = null;
        org.jsoup.helper.HttpConnection.Request request24 = request21.proxy(proxy23);
        org.jsoup.helper.HttpConnection.Request request27 = request21.proxy("hi!", 30000);
        java.net.Proxy proxy28 = null;
        org.jsoup.helper.HttpConnection.Request request29 = request21.proxy(proxy28);
        org.jsoup.Connection connection30 = httpConnection0.request((org.jsoup.Connection.Request) request21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection0.sslSocketFactory(sSLSocketFactory31);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory33 = null;
        org.jsoup.Connection connection34 = httpConnection0.sslSocketFactory(sSLSocketFactory33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30000 + "'", int22 == 30000);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        boolean boolean10 = response0.hasCookie("UTF-8");
        java.util.List list12 = response0.headers("Content-Type");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response13.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser17 = request16.parser();
        java.lang.String str19 = request16.header("Content-Encoding");
        java.lang.String str20 = request16.requestBody();
        org.jsoup.Connection.Request request22 = request16.maxBodySize((int) (byte) 10);
        boolean boolean24 = request16.hasCookie("hi!");
        org.jsoup.Connection.Method method25 = request16.method();
        org.jsoup.Connection.Base base26 = response13.method(method25);
        org.jsoup.Connection.Method method27 = response13.method();
        org.jsoup.Connection.Base base28 = response0.method(method27);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + method25 + "' != '" + org.jsoup.Connection.Method.GET + "'", method25.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertTrue("'" + method27 + "' != '" + org.jsoup.Connection.Method.GET + "'", method27.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base28);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.net.URL uRL7 = request0.url();
        java.util.Map map8 = request0.headers();
        int int9 = request0.maxBodySize();
        boolean boolean10 = request0.ignoreContentType();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1048576 + "'", int9 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.lang.String str7 = request0.postDataCharset();
        boolean boolean9 = request0.hasHeader("application/x-www-form-urlencoded");
        java.util.Map map10 = request0.multiHeaders();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        boolean boolean8 = request5.hasHeader("hi!");
        org.jsoup.Connection.Request request10 = request5.ignoreContentType(false);
        org.jsoup.parser.Parser parser11 = request5.parser();
        org.jsoup.helper.HttpConnection.Request request14 = request5.proxy("Content-Encoding=hi!=Content-Encoding", (int) (byte) 100);
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser16 = request15.parser();
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = request17.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request22 = request17.data((org.jsoup.Connection.KeyVal) keyVal21);
        java.lang.String str23 = keyVal21.value();
        org.jsoup.helper.HttpConnection.Request request24 = request15.data((org.jsoup.Connection.KeyVal) keyVal21);
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal21.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str27 = keyVal21.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = keyVal21.value("hi!");
        java.io.InputStream inputStream30 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal21.inputStream(inputStream30);
        org.jsoup.helper.HttpConnection.Request request32 = request5.data((org.jsoup.Connection.KeyVal) keyVal21);
        java.lang.Class<?> wildcardClass33 = request5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str27, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection14 = httpConnection0.referrer("Content-Type=multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection0.requestBody("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = request17.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request22 = request17.data((org.jsoup.Connection.KeyVal) keyVal21);
        boolean boolean23 = request17.ignoreContentType();
        java.util.Map map24 = request17.cookies();
        org.jsoup.Connection connection25 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        java.util.Map map15 = response6.cookies();
        java.lang.String str16 = response6.contentType();
        java.lang.String str17 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        int int19 = response18.statusCode();
        boolean boolean21 = response18.hasHeader("multipart/form-data");
        java.util.Map map22 = response18.cookies();
        boolean boolean24 = response18.hasHeader("Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base26 = response18.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        java.lang.String str28 = response18.header("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser30 = request29.parser();
        java.lang.String str32 = request29.header("Content-Encoding");
        java.lang.String str33 = request29.requestBody();
        org.jsoup.Connection.Request request35 = request29.maxBodySize((int) (byte) 10);
        boolean boolean37 = request29.hasCookie("hi!");
        org.jsoup.Connection.Method method38 = request29.method();
        boolean boolean39 = request29.followRedirects();
        org.jsoup.helper.HttpConnection.Request request40 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser41 = request40.parser();
        org.jsoup.helper.HttpConnection.Request request42 = request29.parser(parser41);
        int int43 = request29.timeout();
        org.jsoup.Connection.Method method44 = request29.method();
        org.jsoup.Connection.Base base45 = response18.method(method44);
        org.jsoup.Connection.Base base46 = response6.method(method44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + method38 + "' != '" + org.jsoup.Connection.Method.GET + "'", method38.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 30000 + "'", int43 == 30000);
        org.junit.Assert.assertTrue("'" + method44 + "' != '" + org.jsoup.Connection.Method.GET + "'", method44.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(base46);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request0.data(keyVal10);
        boolean boolean12 = request11.ignoreHttpErrors();
        boolean boolean14 = request11.hasHeader("Content-Encoding=hi!=Content-Encoding");
        java.lang.String str16 = request11.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        request11.sslSocketFactory(sSLSocketFactory17);
        java.lang.String str20 = request11.header("hi!==");
        int int21 = request11.timeout();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30000 + "'", int21 == 30000);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        request5.sslSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = request5.proxy();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = request5.data();
        org.jsoup.helper.HttpConnection.Request request10 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = request10.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request15 = request10.data((org.jsoup.Connection.KeyVal) keyVal14);
        org.jsoup.Connection.Request request17 = request15.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = request18.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request23 = request18.data((org.jsoup.Connection.KeyVal) keyVal22);
        org.jsoup.Connection.KeyVal keyVal25 = keyVal22.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request26 = request15.data((org.jsoup.Connection.KeyVal) keyVal22);
        java.util.List list28 = request26.headers("Content-Encoding=hi!");
        org.jsoup.parser.Parser parser29 = request26.parser();
        org.jsoup.helper.HttpConnection.Request request30 = request5.parser(parser29);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(keyValCollection9);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(request30);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.referrer("");
        org.jsoup.Connection connection12 = httpConnection7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        org.jsoup.Connection connection15 = httpConnection7.response((org.jsoup.Connection.Response) response13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        org.jsoup.Connection connection17 = httpConnection7.sslSocketFactory(sSLSocketFactory16);
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection7.method(method20);
        org.jsoup.Connection.Base base22 = request6.method(method20);
        java.util.Map map23 = request6.headers();
        java.util.Map map24 = request6.cookies();
        java.lang.String str25 = request6.requestBody();
        org.jsoup.Connection.Base base27 = request6.removeHeader("Content-Encoding=hi!=Content-Encoding=Content-Type=multipart/form-data");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.charset();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = response0.charset("Content-Type=hi!");
        int int7 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream8 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeCookie("hi!");
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection connection13 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map12);
        org.jsoup.Connection connection15 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = request16.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request21 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        org.jsoup.Connection.Request request23 = request21.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request24 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = request24.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request29 = request24.data((org.jsoup.Connection.KeyVal) keyVal28);
        org.jsoup.Connection.KeyVal keyVal31 = keyVal28.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request32 = request21.data((org.jsoup.Connection.KeyVal) keyVal28);
        java.util.List list34 = request32.headers("Content-Encoding=hi!");
        boolean boolean36 = request32.hasCookie("hi!");
        java.net.Proxy proxy37 = request32.proxy();
        java.lang.String str39 = request32.cookie("Content-Encoding");
        org.jsoup.Connection connection40 = httpConnection0.request((org.jsoup.Connection.Request) request32);
        org.jsoup.helper.HttpConnection.Request request41 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser42 = request41.parser();
        java.lang.String str44 = request41.header("Content-Encoding");
        java.lang.String str45 = request41.requestBody();
        org.jsoup.Connection.Request request47 = request41.maxBodySize((int) (byte) 10);
        boolean boolean49 = request41.hasCookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection50 = request41.data();
        org.jsoup.Connection connection51 = httpConnection0.data(keyValCollection50);
        org.jsoup.Connection connection53 = httpConnection0.referrer("");
        org.jsoup.Connection connection55 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection56 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection58 = httpConnection56.maxBodySize(100);
        org.jsoup.Connection.KeyVal keyVal60 = httpConnection56.data("UTF-8");
        org.jsoup.helper.HttpConnection httpConnection61 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection63 = httpConnection61.referrer("");
        org.jsoup.Connection connection66 = httpConnection61.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response67 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map68 = response67.cookies();
        org.jsoup.Connection connection69 = httpConnection61.data((java.util.Map<java.lang.String, java.lang.String>) map68);
        org.jsoup.Connection connection71 = httpConnection61.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Request request72 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory73 = request72.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal76 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request77 = request72.data((org.jsoup.Connection.KeyVal) keyVal76);
        java.net.URL uRL78 = request77.url();
        java.io.InputStream inputStream81 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal82 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream81);
        java.io.InputStream inputStream83 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal84 = keyVal82.inputStream(inputStream83);
        java.io.InputStream inputStream85 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal86 = keyVal82.inputStream(inputStream85);
        org.jsoup.helper.HttpConnection.Request request87 = request77.data((org.jsoup.Connection.KeyVal) keyVal82);
        org.jsoup.Connection.Request request89 = request77.ignoreContentType(false);
        org.jsoup.Connection.Method method90 = request77.method();
        org.jsoup.Connection connection91 = httpConnection61.method(method90);
        org.jsoup.Connection connection92 = httpConnection56.method(method90);
        org.jsoup.Connection connection93 = httpConnection0.method(method90);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNull(sSLSocketFactory25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(proxy37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(keyValCollection50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNull(keyVal60);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNull(sSLSocketFactory73);
        org.junit.Assert.assertNotNull(keyVal76);
        org.junit.Assert.assertNotNull(request77);
        org.junit.Assert.assertNull(uRL78);
        org.junit.Assert.assertNotNull(keyVal82);
        org.junit.Assert.assertNotNull(keyVal84);
        org.junit.Assert.assertNotNull(keyVal86);
        org.junit.Assert.assertNotNull(request87);
        org.junit.Assert.assertNotNull(request89);
        org.junit.Assert.assertTrue("'" + method90 + "' != '" + org.jsoup.Connection.Method.GET + "'", method90.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection91);
        org.junit.Assert.assertNotNull(connection92);
        org.junit.Assert.assertNotNull(connection93);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean9 = request8.followRedirects();
        org.jsoup.Connection.Method method10 = request8.method();
        boolean boolean12 = request8.hasHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        boolean boolean14 = request8.hasHeader("Content-Type=hi!=hi!");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.header("application/x-www-form-urlencoded", "Content-Type");
        org.jsoup.Connection connection10 = httpConnection0.referrer("");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = request9.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request14 = request9.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int15 = request14.timeout();
        java.net.Proxy proxy16 = null;
        org.jsoup.helper.HttpConnection.Request request17 = request14.proxy(proxy16);
        boolean boolean20 = request14.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser21 = request14.parser();
        org.jsoup.Connection connection22 = httpConnection0.parser(parser21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.referrer("");
        org.jsoup.Connection connection27 = httpConnection23.userAgent("hi!");
        org.jsoup.Connection.Response response28 = null;
        org.jsoup.Connection connection29 = httpConnection23.response(response28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser31 = request30.parser();
        java.lang.String str33 = request30.header("Content-Encoding");
        org.jsoup.parser.Parser parser34 = request30.parser();
        org.jsoup.Connection connection35 = httpConnection23.parser(parser34);
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.referrer("");
        org.jsoup.Connection connection41 = httpConnection36.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method43 = response42.method();
        org.jsoup.Connection connection44 = httpConnection36.response((org.jsoup.Connection.Response) response42);
        java.lang.String str45 = response42.contentType();
        java.util.Map map46 = response42.multiHeaders();
        org.jsoup.Connection connection47 = httpConnection23.cookies((java.util.Map<java.lang.String, java.lang.String>) map46);
        org.jsoup.Connection connection48 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map46);
        org.jsoup.Connection connection51 = httpConnection0.cookie("hi!=", "Content-Encoding=hi!");
        org.jsoup.Connection connection53 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.KeyVal keyVal55 = httpConnection0.data("Content-Type=multipart/form-data");
        org.jsoup.Connection connection58 = httpConnection0.cookie("hi!=hi!=Content-Encoding=hi!", "Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNull(keyVal55);
        org.junit.Assert.assertNotNull(connection58);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        java.util.List list9 = request0.headers("hi!");
        boolean boolean11 = request0.hasHeader("Content-Encoding");
        java.util.Map map12 = request0.headers();
        java.net.URL uRL13 = request0.url();
        java.util.Map map14 = request0.cookies();
        java.lang.String str15 = request0.postDataCharset();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection8 = httpConnection0.data("hi!=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection0.userAgent("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base15 = response13.removeCookie("hi!");
        java.util.Map map16 = response13.cookies();
        org.jsoup.Connection connection17 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map16);
        java.io.InputStream inputStream20 = null;
        org.jsoup.Connection connection22 = httpConnection0.data("UTF-8=Content-Type", "Content-Encoding=hi!=Content-Encoding=Content-Type=multipart/form-data", inputStream20, "hi!=hi!");
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.maxBodySize(100);
        org.jsoup.Connection connection27 = httpConnection23.maxBodySize(1048576);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection23.sslSocketFactory(sSLSocketFactory28);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base32 = response30.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request33 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL34 = request33.url();
        org.jsoup.Connection.Method method35 = request33.method();
        org.jsoup.Connection.Base base36 = response30.method(method35);
        org.jsoup.Connection connection37 = httpConnection23.method(method35);
        org.jsoup.Connection connection38 = httpConnection0.method(method35);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertTrue("'" + method35 + "' != '" + org.jsoup.Connection.Method.GET + "'", method35.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection38);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        org.jsoup.Connection.Base base9 = response0.header("hi!=hi!=hi!", "Content-Encoding=hi!=Content-Type");
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        org.jsoup.Connection connection14 = httpConnection0.maxBodySize((int) '4');
        org.jsoup.Connection connection17 = httpConnection0.cookie("hi!=Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.Connection connection19 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection21 = httpConnection0.ignoreContentType(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("Content-Encoding=hi!=Content-Type");
        java.io.InputStream inputStream8 = keyVal5.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        java.util.List list4 = request0.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.jsoup.parser.Parser parser5 = request0.parser();
        java.lang.String str6 = request0.postDataCharset();
        java.util.Map map7 = request0.multiHeaders();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        int int12 = request5.timeout();
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.referrer("");
        org.jsoup.Connection connection18 = httpConnection13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.Connection connection21 = httpConnection13.response((org.jsoup.Connection.Response) response19);
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Base base25 = response19.cookie("UTF-8", "");
        java.lang.String str26 = response19.statusMessage();
        int int27 = response19.statusCode();
        org.jsoup.helper.HttpConnection.Response response29 = response19.charset("hi!===hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5, response29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30000 + "'", int12 == 30000);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        boolean boolean8 = request0.ignoreContentType();
        org.jsoup.parser.Parser parser9 = request0.parser();
        org.jsoup.Connection.Base base12 = request0.addHeader("Content-Encoding=hi!", "hi!=");
        org.jsoup.Connection.Base base15 = request0.header("UTF-8=Content-Type", "multipart/form-data=hi!");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL12 = request11.url();
        java.util.Map map13 = request11.multiHeaders();
        org.jsoup.Connection connection14 = httpConnection0.request((org.jsoup.Connection.Request) request11);
        org.jsoup.Connection connection16 = httpConnection0.maxBodySize((int) (short) 1);
        org.jsoup.Connection connection18 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.Connection connection21 = httpConnection0.cookie("Content-Encoding=hi!", "UTF-8=hi!");
        java.io.InputStream inputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.data("", "UTF-8=hi!", inputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(false);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection5 = request0.data();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request6.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request10 = request6.timeout((int) '4');
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request11.proxy(proxy12);
        java.util.List list15 = request11.headers("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method16 = request11.method();
        org.jsoup.Connection.Base base18 = request11.removeHeader("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL20 = request19.url();
        java.util.Map map21 = request19.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser23 = request22.parser();
        java.lang.String str25 = request22.header("Content-Encoding");
        boolean boolean27 = request22.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request30 = request22.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy31 = request30.proxy();
        org.jsoup.helper.HttpConnection.Request request32 = request19.proxy(proxy31);
        org.jsoup.helper.HttpConnection.Request request33 = request11.proxy(proxy31);
        org.jsoup.helper.HttpConnection.Request request34 = request6.proxy(proxy31);
        org.jsoup.helper.HttpConnection.Request request35 = request0.proxy(proxy31);
        org.jsoup.Connection.Request request37 = request35.followRedirects(true);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(keyValCollection5);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request37);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.KeyVal keyVal15 = keyVal12.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request5.data((org.jsoup.Connection.KeyVal) keyVal12);
        java.util.List list18 = request16.headers("Content-Encoding=hi!");
        boolean boolean20 = request16.hasCookie("hi!");
        java.net.Proxy proxy21 = request16.proxy();
        boolean boolean23 = request16.hasHeader("Content-Encoding=hi!");
        boolean boolean25 = request16.hasHeader("Content-Type");
        boolean boolean26 = request16.ignoreHttpErrors();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        java.util.List list14 = response6.headers("hi!");
        org.jsoup.Connection.Method method15 = response6.method();
        org.jsoup.Connection.Base base18 = response6.header("Content-Type", "");
        java.util.Map map19 = response6.headers();
        boolean boolean21 = response6.hasHeader("hi!=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.lang.String str3 = request2.requestBody();
        org.jsoup.Connection.Base base5 = request2.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base8 = request2.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data");
        java.lang.String str10 = request2.header("application/x-www-form-urlencoded");
        boolean boolean12 = request2.hasHeader("hi!=hi!");
        int int13 = request2.timeout();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30000 + "'", int13 == 30000);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        org.jsoup.Connection.Request request8 = request0.ignoreHttpErrors(true);
        int int9 = request0.maxBodySize();
        boolean boolean12 = request0.hasHeaderWithValue("Content-Encoding=hi!=Content-Encoding=hi!=", "UTF-8=hi!=multipart/form-data");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection0.data("hi!=Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.referrer("");
        org.jsoup.Connection connection21 = httpConnection17.userAgent("hi!");
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection17.response(response22);
        org.jsoup.Connection.Response response24 = null;
        org.jsoup.Connection connection25 = httpConnection17.response(response24);
        org.jsoup.Connection connection27 = httpConnection17.ignoreContentType(false);
        org.jsoup.Connection connection30 = httpConnection17.data("hi!", "");
        org.jsoup.Connection connection32 = httpConnection17.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection34 = httpConnection17.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request35 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory36 = request35.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request40 = request35.data((org.jsoup.Connection.KeyVal) keyVal39);
        org.jsoup.Connection.Request request42 = request40.followRedirects(true);
        java.util.List list44 = request40.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection45 = request40.data();
        org.jsoup.Connection connection46 = httpConnection17.data(keyValCollection45);
        org.jsoup.Connection connection47 = httpConnection0.data(keyValCollection45);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNull(sSLSocketFactory36);
        org.junit.Assert.assertNotNull(keyVal39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(keyValCollection45);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection47);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.net.URL uRL5 = response0.url();
        org.jsoup.helper.HttpConnection.Response response7 = response0.charset("");
        int int8 = response7.statusCode();
        java.lang.String str9 = response7.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        java.util.List list9 = request5.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base12 = request5.addHeader("Content-Encoding", "Content-Type=hi!");
        java.util.List list14 = request5.headers("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request17 = request5.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", 1);
        java.util.Map map18 = request17.cookies();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        java.net.URL uRL15 = response6.url();
        boolean boolean17 = response6.hasHeader("Content-Type=hi!");
        java.lang.String str19 = response6.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean21 = response6.hasHeader("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeCookie("hi!");
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection connection13 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map12);
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.referrer("");
        org.jsoup.Connection connection19 = httpConnection14.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.cookies();
        org.jsoup.Connection connection22 = httpConnection14.data((java.util.Map<java.lang.String, java.lang.String>) map21);
        org.jsoup.Connection connection23 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map21);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base26 = response24.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request27 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL28 = request27.url();
        org.jsoup.Connection.Method method29 = request27.method();
        org.jsoup.Connection.Base base30 = response24.method(method29);
        java.lang.String str32 = response24.cookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response33.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL37 = request36.url();
        org.jsoup.Connection.Method method38 = request36.method();
        org.jsoup.Connection.Base base39 = response33.method(method38);
        java.lang.String str41 = response33.cookie("Content-Encoding");
        org.jsoup.Connection.Method method42 = response33.method();
        org.jsoup.Connection.Base base45 = response33.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map47 = response46.cookies();
        response33.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.jsoup.Connection connection50 = httpConnection0.response((org.jsoup.Connection.Response) response24);
        java.net.URL uRL51 = response24.url();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertTrue("'" + method29 + "' != '" + org.jsoup.Connection.Method.GET + "'", method29.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertTrue("'" + method38 + "' != '" + org.jsoup.Connection.Method.GET + "'", method38.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + method42 + "' != '" + org.jsoup.Connection.Method.GET + "'", method42.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNull(uRL51);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        int int7 = request6.timeout();
        org.jsoup.helper.HttpConnection.Request request9 = request6.timeout((int) 'a');
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request6.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.Base base15 = request13.removeCookie("multipart/form-data=hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = request13.hasHeaderWithValue("", "multipart/form-data=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.referrer("");
        org.jsoup.Connection connection15 = httpConnection10.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.Connection connection18 = httpConnection10.response((org.jsoup.Connection.Response) response16);
        java.lang.String str19 = response16.contentType();
        java.lang.String str20 = response16.contentType();
        org.jsoup.helper.HttpConnection.Response response22 = response16.charset("UTF-8");
        java.util.List list24 = response16.headers("hi!");
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser26 = request25.parser();
        java.lang.String str28 = request25.header("Content-Encoding");
        java.lang.String str29 = request25.requestBody();
        org.jsoup.Connection.Request request31 = request25.maxBodySize((int) (byte) 10);
        boolean boolean33 = request25.hasCookie("hi!");
        org.jsoup.Connection.Method method34 = request25.method();
        org.jsoup.Connection.Base base35 = response16.method(method34);
        org.jsoup.Connection connection36 = httpConnection0.method(method34);
        org.jsoup.Connection connection38 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection39 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection41 = httpConnection39.referrer("");
        org.jsoup.Connection connection43 = httpConnection39.userAgent("hi!");
        org.jsoup.Connection.Response response44 = null;
        org.jsoup.Connection connection45 = httpConnection39.response(response44);
        org.jsoup.Connection.Response response46 = null;
        org.jsoup.Connection connection47 = httpConnection39.response(response46);
        org.jsoup.Connection connection49 = httpConnection39.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal52 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request53 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory54 = request53.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal57 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request58 = request53.data((org.jsoup.Connection.KeyVal) keyVal57);
        java.lang.String str59 = keyVal57.value();
        org.jsoup.helper.HttpConnection.Request request60 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory61 = request60.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal64 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request65 = request60.data((org.jsoup.Connection.KeyVal) keyVal64);
        java.lang.String str66 = keyVal64.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal69 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray70 = new org.jsoup.Connection.KeyVal[] { keyVal52, keyVal57, keyVal64, keyVal69 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList71 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71, keyValArray70);
        org.jsoup.Connection connection73 = httpConnection39.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.Connection connection74 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.Connection connection77 = httpConnection0.proxy("", (int) '4');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + method34 + "' != '" + org.jsoup.Connection.Method.GET + "'", method34.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(keyVal52);
        org.junit.Assert.assertNull(sSLSocketFactory54);
        org.junit.Assert.assertNotNull(keyVal57);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory61);
        org.junit.Assert.assertNotNull(keyVal64);
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(keyVal69);
        org.junit.Assert.assertNotNull(keyValArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection77);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("UTF-8=hi!=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: UTF-8=hi!=multipart/form-data");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        request0.sslSocketFactory(sSLSocketFactory4);
        boolean boolean6 = request0.followRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        request0.sslSocketFactory(sSLSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request10 = request0.postDataCharset("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        boolean boolean12 = request5.ignoreHttpErrors();
        java.net.Proxy proxy13 = null;
        org.jsoup.helper.HttpConnection.Request request14 = request5.proxy(proxy13);
        org.jsoup.Connection.Request request16 = request5.followRedirects(true);
        org.jsoup.Connection.Base base19 = request5.addHeader("Content-Encoding=hi!=Content-Type=hi!", "Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = request9.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request14 = request9.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int15 = request14.timeout();
        java.net.Proxy proxy16 = null;
        org.jsoup.helper.HttpConnection.Request request17 = request14.proxy(proxy16);
        boolean boolean20 = request14.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser21 = request14.parser();
        org.jsoup.Connection connection22 = httpConnection0.parser(parser21);
        java.net.Proxy proxy23 = null;
        org.jsoup.Connection connection24 = httpConnection0.proxy(proxy23);
        org.jsoup.Connection connection27 = httpConnection0.header("hi!=", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request28 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = request28.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request33 = request28.data((org.jsoup.Connection.KeyVal) keyVal32);
        int int34 = request33.timeout();
        java.net.Proxy proxy35 = null;
        org.jsoup.helper.HttpConnection.Request request36 = request33.proxy(proxy35);
        boolean boolean39 = request33.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection42 = httpConnection40.referrer("");
        org.jsoup.Connection connection45 = httpConnection40.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request46 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL47 = request46.url();
        org.jsoup.Connection.Method method48 = request46.method();
        org.jsoup.Connection connection49 = httpConnection40.method(method48);
        org.jsoup.Connection.Base base50 = request33.method(method48);
        org.jsoup.Connection.Base base53 = request33.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data");
        org.jsoup.Connection.Request request55 = request33.ignoreHttpErrors(true);
        java.lang.String str56 = request33.postDataCharset();
        java.util.Map map57 = request33.cookies();
        org.jsoup.Connection connection58 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map57);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNull(sSLSocketFactory29);
        org.junit.Assert.assertNotNull(keyVal32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 30000 + "'", int34 == 30000);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNull(uRL47);
        org.junit.Assert.assertTrue("'" + method48 + "' != '" + org.jsoup.Connection.Method.GET + "'", method48.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertNotNull(base53);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTF-8" + "'", str56, "UTF-8");
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(connection58);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser4 = request3.parser();
        java.lang.String str6 = request3.header("Content-Encoding");
        boolean boolean8 = request3.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request11 = request3.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy12 = request11.proxy();
        org.jsoup.helper.HttpConnection.Request request13 = request0.proxy(proxy12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        request13.sslSocketFactory(sSLSocketFactory14);
        boolean boolean16 = request13.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL18 = request17.url();
        boolean boolean19 = request17.followRedirects();
        org.jsoup.helper.HttpConnection.Request request21 = request17.timeout((int) (byte) 10);
        boolean boolean22 = request21.ignoreHttpErrors();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.referrer("");
        org.jsoup.Connection connection28 = httpConnection23.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method30 = response29.method();
        org.jsoup.Connection connection31 = httpConnection23.response((org.jsoup.Connection.Response) response29);
        org.jsoup.Connection connection33 = httpConnection23.postDataCharset("UTF-8");
        org.jsoup.Connection connection36 = httpConnection23.proxy("hi!", 0);
        org.jsoup.Connection connection39 = httpConnection23.header("multipart/form-data", "Content-Type");
        org.jsoup.helper.HttpConnection.Request request40 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL41 = request40.url();
        org.jsoup.Connection.Method method42 = request40.method();
        org.jsoup.Connection.Request request44 = request40.ignoreContentType(false);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection45 = request40.data();
        org.jsoup.helper.HttpConnection.Request request46 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy47 = null;
        org.jsoup.helper.HttpConnection.Request request48 = request46.proxy(proxy47);
        org.jsoup.helper.HttpConnection.Request request50 = request46.timeout((int) '4');
        org.jsoup.helper.HttpConnection.Request request51 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy52 = null;
        org.jsoup.helper.HttpConnection.Request request53 = request51.proxy(proxy52);
        java.util.List list55 = request51.headers("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method56 = request51.method();
        org.jsoup.Connection.Base base58 = request51.removeHeader("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL60 = request59.url();
        java.util.Map map61 = request59.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request62 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser63 = request62.parser();
        java.lang.String str65 = request62.header("Content-Encoding");
        boolean boolean67 = request62.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request70 = request62.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy71 = request70.proxy();
        org.jsoup.helper.HttpConnection.Request request72 = request59.proxy(proxy71);
        org.jsoup.helper.HttpConnection.Request request73 = request51.proxy(proxy71);
        org.jsoup.helper.HttpConnection.Request request74 = request46.proxy(proxy71);
        org.jsoup.helper.HttpConnection.Request request75 = request40.proxy(proxy71);
        org.jsoup.Connection connection76 = httpConnection23.proxy(proxy71);
        org.jsoup.helper.HttpConnection.Request request77 = request21.proxy(proxy71);
        java.net.Proxy proxy78 = request21.proxy();
        org.jsoup.helper.HttpConnection.Request request79 = request13.proxy(proxy78);
        org.jsoup.Connection.Request request81 = request13.ignoreHttpErrors(true);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertTrue("'" + method42 + "' != '" + org.jsoup.Connection.Method.GET + "'", method42.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(keyValCollection45);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + method56 + "' != '" + org.jsoup.Connection.Method.GET + "'", method56.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base58);
        org.junit.Assert.assertNull(uRL60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(request70);
        org.junit.Assert.assertNotNull(proxy71);
        org.junit.Assert.assertNotNull(request72);
        org.junit.Assert.assertNotNull(request73);
        org.junit.Assert.assertNotNull(request74);
        org.junit.Assert.assertNotNull(request75);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(request77);
        org.junit.Assert.assertNotNull(proxy78);
        org.junit.Assert.assertNotNull(request79);
        org.junit.Assert.assertNotNull(request81);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection.Response response12 = httpConnection0.response();
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(keyVal14);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        request0.sslSocketFactory(sSLSocketFactory5);
        java.lang.String str7 = request0.requestBody();
        java.net.Proxy proxy8 = request0.proxy();
        org.jsoup.Connection.Base base10 = request0.removeCookie("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request11.proxy(proxy12);
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser15 = request14.parser();
        java.lang.String str17 = request14.header("Content-Encoding");
        boolean boolean19 = request14.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request22 = request14.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy23 = request22.proxy();
        org.jsoup.helper.HttpConnection.Request request24 = request11.proxy(proxy23);
        org.jsoup.helper.HttpConnection.Request request25 = request0.proxy(proxy23);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection26 = request0.data();
        org.jsoup.Connection.Request request28 = request0.followRedirects(false);
        org.jsoup.Connection.Base base30 = request0.removeCookie("UTF-8");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(keyValCollection26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(base30);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.KeyVal keyVal15 = keyVal12.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request5.data((org.jsoup.Connection.KeyVal) keyVal12);
        java.util.List list18 = request16.headers("Content-Encoding=hi!");
        boolean boolean20 = request16.hasCookie("hi!");
        java.lang.String str21 = request16.requestBody();
        boolean boolean22 = request16.ignoreContentType();
        java.util.Map map23 = request16.multiHeaders();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection24 = request16.data();
        org.jsoup.Connection.Request request26 = request16.requestBody("Content-Type=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Map map27 = request16.cookies();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(keyValCollection24);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.referrer("");
        org.jsoup.Connection connection15 = httpConnection11.userAgent("hi!");
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection11.response(response16);
        org.jsoup.Connection.Response response18 = null;
        org.jsoup.Connection connection19 = httpConnection11.response(response18);
        org.jsoup.Connection connection21 = httpConnection11.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request25 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = request25.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request30 = request25.data((org.jsoup.Connection.KeyVal) keyVal29);
        java.lang.String str31 = keyVal29.value();
        org.jsoup.helper.HttpConnection.Request request32 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory33 = request32.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request37 = request32.data((org.jsoup.Connection.KeyVal) keyVal36);
        java.lang.String str38 = keyVal36.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray42 = new org.jsoup.Connection.KeyVal[] { keyVal24, keyVal29, keyVal36, keyVal41 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList43 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList43, keyValArray42);
        org.jsoup.Connection connection45 = httpConnection11.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList43);
        org.jsoup.Connection connection46 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList43);
        org.jsoup.helper.HttpConnection httpConnection47 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection49 = httpConnection47.referrer("");
        org.jsoup.Connection connection52 = httpConnection47.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method54 = response53.method();
        org.jsoup.Connection connection55 = httpConnection47.response((org.jsoup.Connection.Response) response53);
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base58 = response56.removeCookie("hi!");
        java.util.Map map59 = response56.cookies();
        org.jsoup.Connection connection60 = httpConnection47.data((java.util.Map<java.lang.String, java.lang.String>) map59);
        org.jsoup.helper.HttpConnection httpConnection61 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection63 = httpConnection61.referrer("");
        org.jsoup.Connection connection66 = httpConnection61.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response67 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map68 = response67.cookies();
        org.jsoup.Connection connection69 = httpConnection61.data((java.util.Map<java.lang.String, java.lang.String>) map68);
        org.jsoup.Connection connection70 = httpConnection47.cookies((java.util.Map<java.lang.String, java.lang.String>) map68);
        org.jsoup.Connection connection71 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map68);
        org.jsoup.Connection connection74 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "");
        org.jsoup.helper.HttpConnection.Request request75 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy76 = null;
        org.jsoup.helper.HttpConnection.Request request77 = request75.proxy(proxy76);
        org.jsoup.Connection.Request request79 = request75.ignoreHttpErrors(true);
        boolean boolean80 = request75.ignoreContentType();
        org.jsoup.helper.HttpConnection.Request request81 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL82 = request81.url();
        java.util.Map map83 = request81.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request84 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser85 = request84.parser();
        java.lang.String str87 = request84.header("Content-Encoding");
        boolean boolean89 = request84.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request92 = request84.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy93 = request92.proxy();
        org.jsoup.helper.HttpConnection.Request request94 = request81.proxy(proxy93);
        org.jsoup.helper.HttpConnection.Request request95 = request75.proxy(proxy93);
        org.jsoup.Connection connection96 = httpConnection0.proxy(proxy93);
        org.jsoup.Connection connection98 = httpConnection0.maxBodySize(0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNull(sSLSocketFactory26);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory33);
        org.junit.Assert.assertNotNull(keyVal36);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(keyVal41);
        org.junit.Assert.assertNotNull(keyValArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNull(method54);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(base58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(request77);
        org.junit.Assert.assertNotNull(request79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(uRL82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(request92);
        org.junit.Assert.assertNotNull(proxy93);
        org.junit.Assert.assertNotNull(request94);
        org.junit.Assert.assertNotNull(request95);
        org.junit.Assert.assertNotNull(connection96);
        org.junit.Assert.assertNotNull(connection98);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.lang.String str11 = response6.contentType();
        java.lang.String str12 = response6.charset();
        java.util.List list14 = response6.headers("application/x-www-form-urlencoded");
        java.lang.String str16 = response6.header("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base19 = response17.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL21 = request20.url();
        org.jsoup.Connection.Method method22 = request20.method();
        org.jsoup.Connection.Base base23 = response17.method(method22);
        java.lang.String str25 = response17.cookie("Content-Encoding");
        org.jsoup.Connection.Method method26 = response17.method();
        org.jsoup.Connection.Base base27 = response6.method(method26);
        org.jsoup.Connection.Method method28 = response6.method();
        org.jsoup.helper.HttpConnection.Response response30 = response6.charset("multipart/form-data");
        java.lang.String str31 = response6.contentType();
        boolean boolean33 = response6.hasHeader("Content-Type=multipart/form-data");
        boolean boolean35 = response6.hasHeader("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response6.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + method22 + "' != '" + org.jsoup.Connection.Method.GET + "'", method22.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + method26 + "' != '" + org.jsoup.Connection.Method.GET + "'", method26.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertTrue("'" + method28 + "' != '" + org.jsoup.Connection.Method.GET + "'", method28.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        org.jsoup.Connection.Base base5 = request0.removeCookie("Content-Type");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(base5);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("Content-Encoding=hi!=Content-Encoding");
        int int13 = response12.statusCode();
        org.jsoup.Connection.Base base15 = response12.removeCookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=Content-Type=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.KeyVal keyVal15 = keyVal12.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request5.data((org.jsoup.Connection.KeyVal) keyVal12);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream19);
        java.io.InputStream inputStream21 = keyVal20.inputStream();
        org.jsoup.helper.HttpConnection.Request request22 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        boolean boolean25 = request16.hasHeaderWithValue("multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = request16.sslSocketFactory();
        java.util.Map map27 = request16.headers();
        org.jsoup.Connection.Request request29 = request16.maxBodySize(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute(request29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(sSLSocketFactory26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(request29);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = request9.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request14 = request9.data((org.jsoup.Connection.KeyVal) keyVal13);
        int int15 = request14.timeout();
        java.net.Proxy proxy16 = null;
        org.jsoup.helper.HttpConnection.Request request17 = request14.proxy(proxy16);
        boolean boolean20 = request14.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser21 = request14.parser();
        org.jsoup.Connection connection22 = httpConnection0.parser(parser21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.referrer("");
        org.jsoup.Connection connection27 = httpConnection23.userAgent("hi!");
        org.jsoup.Connection.Response response28 = null;
        org.jsoup.Connection connection29 = httpConnection23.response(response28);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser31 = request30.parser();
        java.lang.String str33 = request30.header("Content-Encoding");
        org.jsoup.parser.Parser parser34 = request30.parser();
        org.jsoup.Connection connection35 = httpConnection23.parser(parser34);
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.referrer("");
        org.jsoup.Connection connection41 = httpConnection36.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method43 = response42.method();
        org.jsoup.Connection connection44 = httpConnection36.response((org.jsoup.Connection.Response) response42);
        java.lang.String str45 = response42.contentType();
        java.util.Map map46 = response42.multiHeaders();
        org.jsoup.Connection connection47 = httpConnection23.cookies((java.util.Map<java.lang.String, java.lang.String>) map46);
        org.jsoup.Connection connection48 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map46);
        org.jsoup.Connection.Response response49 = httpConnection0.response();
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy51 = null;
        org.jsoup.helper.HttpConnection.Request request52 = request50.proxy(proxy51);
        org.jsoup.Connection.Request request54 = request50.ignoreHttpErrors(true);
        boolean boolean55 = request50.ignoreContentType();
        java.lang.String str57 = request50.header("application/x-www-form-urlencoded");
        org.jsoup.Connection.Base base60 = request50.addHeader("hi!", "hi!=");
        java.net.URL uRL61 = request50.url();
        org.jsoup.Connection connection62 = httpConnection0.request((org.jsoup.Connection.Request) request50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document63 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(response49);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(base60);
        org.junit.Assert.assertNull(uRL61);
        org.junit.Assert.assertNotNull(connection62);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        org.jsoup.Connection.KeyVal keyVal15 = keyVal12.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request5.data((org.jsoup.Connection.KeyVal) keyVal12);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream19);
        java.io.InputStream inputStream21 = keyVal20.inputStream();
        org.jsoup.helper.HttpConnection.Request request22 = request16.data((org.jsoup.Connection.KeyVal) keyVal20);
        java.net.Proxy proxy23 = request22.proxy();
        boolean boolean24 = request22.followRedirects();
        org.jsoup.Connection.Base base27 = request22.header("multipart/form-data=hi!", "Content-Encoding=hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request28 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser29 = request28.parser();
        java.lang.String str31 = request28.header("Content-Encoding");
        org.jsoup.parser.Parser parser32 = request28.parser();
        java.util.Map map33 = request28.headers();
        org.jsoup.Connection.Request request35 = request28.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.referrer("");
        org.jsoup.Connection connection40 = httpConnection36.userAgent("hi!");
        org.jsoup.Connection.Response response41 = null;
        org.jsoup.Connection connection42 = httpConnection36.response(response41);
        org.jsoup.Connection.Response response43 = null;
        org.jsoup.Connection connection44 = httpConnection36.response(response43);
        org.jsoup.Connection connection46 = httpConnection36.ignoreContentType(false);
        org.jsoup.Connection.Request request47 = httpConnection36.request();
        org.jsoup.Connection connection49 = httpConnection36.timeout((int) (byte) 100);
        org.jsoup.helper.HttpConnection.Request request50 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy51 = null;
        org.jsoup.helper.HttpConnection.Request request52 = request50.proxy(proxy51);
        org.jsoup.Connection.Request request54 = request50.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory55 = null;
        request50.sslSocketFactory(sSLSocketFactory55);
        java.lang.String str57 = request50.requestBody();
        java.net.Proxy proxy58 = request50.proxy();
        org.jsoup.helper.HttpConnection.Request request59 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy60 = null;
        org.jsoup.helper.HttpConnection.Request request61 = request59.proxy(proxy60);
        java.util.List list63 = request59.headers("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Method method64 = request59.method();
        org.jsoup.Connection.Base base66 = request59.removeHeader("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request67 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL68 = request67.url();
        java.util.Map map69 = request67.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request70 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser71 = request70.parser();
        java.lang.String str73 = request70.header("Content-Encoding");
        boolean boolean75 = request70.hasHeader("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request78 = request70.proxy("UTF-8", (int) (short) 100);
        java.net.Proxy proxy79 = request78.proxy();
        org.jsoup.helper.HttpConnection.Request request80 = request67.proxy(proxy79);
        org.jsoup.helper.HttpConnection.Request request81 = request59.proxy(proxy79);
        org.jsoup.helper.HttpConnection.Request request82 = request50.proxy(proxy79);
        org.jsoup.Connection connection83 = httpConnection36.proxy(proxy79);
        org.jsoup.helper.HttpConnection.Request request84 = request28.proxy(proxy79);
        org.jsoup.helper.HttpConnection.Request request85 = request22.proxy(proxy79);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNull(proxy23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(proxy58);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + method64 + "' != '" + org.jsoup.Connection.Method.GET + "'", method64.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base66);
        org.junit.Assert.assertNull(uRL68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(request78);
        org.junit.Assert.assertNotNull(proxy79);
        org.junit.Assert.assertNotNull(request80);
        org.junit.Assert.assertNotNull(request81);
        org.junit.Assert.assertNotNull(request82);
        org.junit.Assert.assertNotNull(connection83);
        org.junit.Assert.assertNotNull(request84);
        org.junit.Assert.assertNotNull(request85);
    }
}

