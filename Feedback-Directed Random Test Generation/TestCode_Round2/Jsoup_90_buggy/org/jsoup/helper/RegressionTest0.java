package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.headers(strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection3 = httpConnection0.data("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.data(strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection7 = httpConnection0.proxy("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.maxBodySize(100);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.headers(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response2 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response1 = org.jsoup.helper.HttpConnection.Response.execute(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.maxBodySize(100);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.cookies(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Encoding" + "'", str0, "Content-Encoding");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "multipart/form-data" + "'", str0, "multipart/form-data");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.data("", "", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = request0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal10 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(false);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        boolean boolean5 = request0.hasCookie("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base7 = request0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = response0.headers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base2 = response0.url(uRL1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base5 = request0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        boolean boolean7 = request0.followRedirects();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = request0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base4 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.DEFAULT_UA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str0, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base3 = response0.url(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(request3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection connection11 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map10);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.data("", "hi!", inputStream14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Type" + "'", str0, "Content-Type");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection connection11 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map10);
        java.lang.String[] strArray13 = new java.lang.String[] { "UTF-8" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "UTF-8" });
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding=hi!" + "'", str5, "Content-Encoding=hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.referrer("");
        org.jsoup.Connection connection10 = httpConnection5.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        org.jsoup.Connection connection13 = httpConnection5.response((org.jsoup.Connection.Response) response11);
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Base base17 = response11.cookie("UTF-8", "");
        org.jsoup.Connection.Base base20 = response11.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Request request13 = request8.proxy("UTF-8", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = request5.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        boolean boolean3 = request0.followRedirects();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base5 = request0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.net.URL uRL0 = null;
        java.net.URL uRL1 = org.jsoup.helper.HttpConnection.encodeUrl(uRL0);
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL9 = request8.url();
        org.jsoup.Connection.Method method10 = request8.method();
        org.jsoup.Connection.Base base11 = response5.method(method10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request4, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = request16.hasHeaderWithValue("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.FORM_URL_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.cookie("UTF-8", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response3 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.postDataCharset("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream4 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        request0.sslSocketFactory(sSLSocketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request7 = request0.postDataCharset("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(request3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = request16.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(proxy21);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection0.data("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection6 = httpConnection4.referrer("");
        org.jsoup.Connection connection9 = httpConnection4.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        org.jsoup.Connection connection12 = httpConnection4.data((java.util.Map<java.lang.String, java.lang.String>) map11);
        org.jsoup.Connection connection13 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        java.lang.String[] strArray16 = new java.lang.String[] { "UTF-8", "Content-Encoding=hi!", "Content-Encoding=hi!", "Content-Encoding", "UTF-8" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.data(strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "UTF-8", "Content-Encoding=hi!", "Content-Encoding=hi!", "Content-Encoding", "UTF-8" });
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser3 = request2.parser();
        java.lang.String str5 = request2.header("Content-Encoding");
        org.jsoup.parser.Parser parser6 = request2.parser();
        org.jsoup.helper.HttpConnection.Request request7 = request0.parser(parser6);
        org.jsoup.Connection.Request request9 = request0.ignoreContentType(true);
        java.lang.Class<?> wildcardClass10 = request0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = request14.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request19 = request14.data((org.jsoup.Connection.KeyVal) keyVal18);
        java.lang.String str20 = keyVal18.value();
        org.jsoup.helper.HttpConnection.Request request21 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = request21.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request26 = request21.data((org.jsoup.Connection.KeyVal) keyVal25);
        java.lang.String str27 = keyVal25.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal30 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray31 = new org.jsoup.Connection.KeyVal[] { keyVal13, keyVal18, keyVal25, keyVal30 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList32 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList32, keyValArray31);
        org.jsoup.Connection connection34 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection36 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(keyVal30);
        org.junit.Assert.assertNotNull(keyValArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.jsoup.Connection connection23 = httpConnection0.response((org.jsoup.Connection.Response) response22);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream24 = response22.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        org.jsoup.Connection connection23 = httpConnection0.response((org.jsoup.Connection.Response) response22);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response22.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.cookie("", "Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response6.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base3 = response0.url(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response4.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection13 = httpConnection0.data("hi!", "");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL15 = request14.url();
        org.jsoup.Connection.Method method16 = request14.method();
        java.lang.String str17 = request14.postDataCharset();
        int int18 = request14.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request20 = request14.timeout((int) 'a');
        java.util.Map map21 = request14.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-8" + "'", str17, "UTF-8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1048576 + "'", int18 == 1048576);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "UTF-8", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response4.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.net.Proxy proxy3 = request2.proxy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = request2.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.Connection connection34 = httpConnection0.method(method31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection36 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL9 = request8.url();
        org.jsoup.Connection.Method method10 = request8.method();
        org.jsoup.Connection.Base base11 = response5.method(method10);
        org.jsoup.Connection.Base base12 = request0.method(method10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = request0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.lang.String str7 = request0.requestBody();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request9 = request0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection10 = httpConnection0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection.Request request3 = null;
        org.jsoup.Connection connection4 = httpConnection0.request(request3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.referrer("");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection16 = httpConnection8.data(strArray15);
        org.jsoup.Connection connection17 = httpConnection0.data(strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.url("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.util.Map map10 = response6.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base6 = response0.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = request16.hasHeaderWithValue("", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL16 = request15.url();
        org.jsoup.Connection.Method method17 = request15.method();
        java.lang.String str18 = request15.postDataCharset();
        int int19 = request15.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request21 = request15.timeout((int) 'a');
        java.util.Map map22 = request15.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + method17 + "' != '" + org.jsoup.Connection.Method.GET + "'", method17.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1048576 + "'", int19 == 1048576);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.maxBodySize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.timeout((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.cookies();
        boolean boolean7 = response3.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str8 = response3.charset();
        org.jsoup.helper.HttpConnection.Request request9 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL10 = request9.url();
        org.jsoup.Connection.Method method11 = request9.method();
        org.jsoup.Connection.Base base12 = response3.method(method11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        java.lang.String str9 = request0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean11 = request0.hasCookie("Content-Encoding");
        boolean boolean12 = request0.ignoreHttpErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = request0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean3 = request0.ignoreHttpErrors();
        boolean boolean4 = request0.ignoreHttpErrors();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        org.jsoup.Connection connection23 = httpConnection0.response((org.jsoup.Connection.Response) response22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response22.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        java.net.URL uRL9 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.net.Proxy proxy11 = request8.proxy();
        java.util.Map map12 = request8.headers();
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.referrer("");
        org.jsoup.Connection connection18 = httpConnection13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.Connection connection21 = httpConnection13.response((org.jsoup.Connection.Response) response19);
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Base base25 = response19.cookie("UTF-8", "");
        java.lang.String str26 = response19.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request8, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        java.lang.String str3 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream4 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response6.hasHeaderWithValue("Content-Encoding=hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.net.Proxy proxy3 = request2.proxy();
        java.net.Proxy proxy4 = request2.proxy();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.timeout((int) (short) 1);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("Content-Type", "hi!", inputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response6.bodyAsBytes();
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
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response6.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection38 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.timeout((int) (short) 1);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("Content-Type", "hi!", inputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = response6.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection connection11 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map10);
        java.lang.Class<?> wildcardClass12 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
            java.lang.String str12 = response6.body();
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection7 = httpConnection0.timeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.maxBodySize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        boolean boolean10 = request0.followRedirects();
        boolean boolean12 = request0.hasCookie("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = request0.headers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document72 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.lang.String str3 = request2.requestBody();
        org.jsoup.Connection.Base base5 = request2.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass49 = map46.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.url("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection19 = httpConnection15.userAgent("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection15.response(response22);
        org.jsoup.Connection connection25 = httpConnection15.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = request29.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request34 = request29.data((org.jsoup.Connection.KeyVal) keyVal33);
        java.lang.String str35 = keyVal33.value();
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        java.lang.String str42 = keyVal40.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray46 = new org.jsoup.Connection.KeyVal[] { keyVal28, keyVal33, keyVal40, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList47 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47, keyValArray46);
        org.jsoup.Connection connection49 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection50 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection52 = httpConnection0.url("Content-Type=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(keyVal45);
        org.junit.Assert.assertNotNull(keyValArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.util.Map map10 = response6.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = request11.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request16 = request11.data((org.jsoup.Connection.KeyVal) keyVal15);
        int int17 = request16.timeout();
        java.net.Proxy proxy18 = null;
        org.jsoup.helper.HttpConnection.Request request19 = request16.proxy(proxy18);
        boolean boolean21 = request19.hasCookie("hi!");
        java.net.Proxy proxy22 = request19.proxy();
        java.util.Map map23 = request19.headers();
        // The following exception was thrown during execution in test generation
        try {
            response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30000 + "'", int17 == 30000);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection12 = httpConnection0.cookie("multipart/form-data", "Content-Type");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL16 = request15.url();
        java.util.Map map17 = request15.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        java.lang.String str5 = response4.charset();
        java.lang.String str7 = response4.cookie("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.util.Map map11 = response6.headers();
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
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document49 = httpConnection0.get();
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        int int9 = request8.timeout();
        java.net.Proxy proxy10 = null;
        org.jsoup.helper.HttpConnection.Request request11 = request8.proxy(proxy10);
        boolean boolean12 = request11.followRedirects();
        org.jsoup.Connection.Method method13 = request11.method();
        org.jsoup.Connection.Base base14 = response0.method(method13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream15 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30000 + "'", int9 == 30000);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + method13 + "' != '" + org.jsoup.Connection.Method.GET + "'", method13.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request5.proxy(proxy12);
        org.jsoup.helper.HttpConnection.Response response14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request13, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection24 = httpConnection19.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection connection27 = httpConnection19.response((org.jsoup.Connection.Response) response25);
        java.lang.String str28 = response25.contentType();
        org.jsoup.Connection.Base base31 = response25.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response33 = response25.charset("Content-Type");
        org.jsoup.Connection.Base base35 = response25.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response36 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request16, response25);
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(base35);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        org.jsoup.Connection.Response response15 = httpConnection0.response();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNull(response15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.referrer("");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection16 = httpConnection8.data(strArray15);
        org.jsoup.Connection connection17 = httpConnection0.data(strArray15);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.cookie("UTF-8", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response6.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = request14.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request19 = request14.data((org.jsoup.Connection.KeyVal) keyVal18);
        int int20 = request19.timeout();
        java.net.Proxy proxy21 = null;
        org.jsoup.helper.HttpConnection.Request request22 = request19.proxy(proxy21);
        boolean boolean24 = request22.hasCookie("hi!");
        java.net.Proxy proxy25 = request22.proxy();
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser27 = request26.parser();
        org.jsoup.helper.HttpConnection.Request request28 = request22.parser(parser27);
        org.jsoup.Connection connection29 = httpConnection0.parser(parser27);
        org.jsoup.Connection connection31 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30000 + "'", int20 == 30000);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(proxy25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.Connection.Request request4 = request0.ignoreContentType(false);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base6 = request0.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.net.Proxy proxy11 = request8.proxy();
        org.jsoup.Connection.Base base14 = request8.addHeader("hi!", "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.Connection.Request request3 = request0.ignoreHttpErrors(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        request0.sslSocketFactory(sSLSocketFactory4);
        java.net.Proxy proxy6 = request0.proxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        java.lang.String str5 = response4.charset();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base7 = response4.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        java.lang.String str5 = response4.charset();
        java.lang.String str7 = response4.cookie("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.net.Proxy proxy11 = request8.proxy();
        boolean boolean12 = request8.followRedirects();
        java.lang.String str14 = request8.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        int int7 = request6.maxBodySize();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1048576 + "'", int7 == 1048576);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection.Base base9 = response0.method(method8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.jsoup.Connection connection15 = httpConnection0.requestBody("");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request27 = request22.data((org.jsoup.Connection.KeyVal) keyVal26);
        org.jsoup.Connection.Request request29 = request27.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request30 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = request30.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request35 = request30.data((org.jsoup.Connection.KeyVal) keyVal34);
        org.jsoup.Connection.KeyVal keyVal37 = keyVal34.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request38 = request27.data((org.jsoup.Connection.KeyVal) keyVal34);
        java.util.List list40 = request38.headers("Content-Encoding=hi!");
        boolean boolean42 = request38.hasCookie("hi!");
        java.net.Proxy proxy43 = request38.proxy();
        java.lang.String str45 = request38.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser46 = request38.parser();
        org.jsoup.helper.HttpConnection.Request request47 = request16.parser(parser46);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response48 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request47);
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNull(sSLSocketFactory31);
        org.junit.Assert.assertNotNull(keyVal34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(keyVal37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(proxy43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(request47);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        java.lang.String[] strArray19 = new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" };
        org.jsoup.Connection connection20 = httpConnection0.data(strArray19);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" });
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.Request request15 = request5.data((org.jsoup.Connection.KeyVal) keyVal10);
        org.jsoup.Connection.Request request17 = request5.ignoreContentType(false);
        org.jsoup.Connection.Method method18 = request5.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request20 = request5.maxBodySize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + method18 + "' != '" + org.jsoup.Connection.Method.GET + "'", method18.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection19 = httpConnection15.userAgent("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection15.response(response22);
        org.jsoup.Connection connection25 = httpConnection15.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = request29.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request34 = request29.data((org.jsoup.Connection.KeyVal) keyVal33);
        java.lang.String str35 = keyVal33.value();
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        java.lang.String str42 = keyVal40.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray46 = new org.jsoup.Connection.KeyVal[] { keyVal28, keyVal33, keyVal40, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList47 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47, keyValArray46);
        org.jsoup.Connection connection49 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection50 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection53 = httpConnection0.proxy("hi!", 10);
        java.net.URL uRL54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection55 = httpConnection0.url(uRL54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(keyVal45);
        org.junit.Assert.assertNotNull(keyValArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.Connection connection34 = httpConnection0.method(method31);
        org.jsoup.helper.HttpConnection.Request request35 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory36 = request35.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal39 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request40 = request35.data((org.jsoup.Connection.KeyVal) keyVal39);
        java.util.Map map41 = request35.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection42 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNull(sSLSocketFactory36);
        org.junit.Assert.assertNotNull(keyVal39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.postDataCharset("Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding=hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("UTF-8", "", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal4.contentType("hi!");
        java.lang.String str8 = keyVal4.value();
        boolean boolean9 = keyVal4.hasInputStream();
        java.lang.String str10 = keyVal4.value();
        java.lang.String str11 = keyVal4.key();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.timeout((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        org.jsoup.Connection connection24 = httpConnection0.ignoreContentType(true);
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.url(uRL25);
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
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream15 = response6.bodyStream();
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        java.util.List list16 = response6.headers("UTF-8");
        java.lang.String str18 = response6.cookie("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        org.jsoup.Connection.Base base4 = request0.removeHeader("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        boolean boolean24 = request5.hasCookie("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = request5.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.util.List list16 = response6.headers("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.bufferUp();
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.jsoup.Connection connection73 = httpConnection0.referrer("Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document74 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection73);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.timeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        java.util.Map map23 = request5.multiHeaders();
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base25 = request5.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request0.data(keyVal10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = request11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        java.lang.String str5 = response4.charset();
        java.lang.String str7 = response4.cookie("application/x-www-form-urlencoded");
        java.lang.Class<?> wildcardClass8 = response4.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base9 = response0.addHeader("Content-Type", "multipart/form-data");
        java.lang.String str11 = response0.header("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection connection9 = httpConnection0.method(method8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document53 = httpConnection0.get();
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
        org.junit.Assert.assertNotNull(connection52);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response0.hasHeaderWithValue("", "Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.Request request15 = request5.data((org.jsoup.Connection.KeyVal) keyVal10);
        org.jsoup.Connection.Request request17 = request5.ignoreContentType(false);
        org.jsoup.Connection.Method method18 = request5.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.Connection.Method method21 = response19.method();
        boolean boolean23 = response19.hasHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base26 = response19.addHeader("Content-Type", "Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + method18 + "' != '" + org.jsoup.Connection.Method.GET + "'", method18.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.toString();
        java.lang.String str8 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=hi!" + "'", str7, "Content-Encoding=hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response6.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection.KeyVal keyVal4 = httpConnection0.data("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.postDataCharset("hi!=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(keyVal4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        int int9 = request8.timeout();
        java.net.Proxy proxy10 = null;
        org.jsoup.helper.HttpConnection.Request request11 = request8.proxy(proxy10);
        boolean boolean12 = request11.followRedirects();
        org.jsoup.Connection.Method method13 = request11.method();
        org.jsoup.Connection.Base base14 = response0.method(method13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30000 + "'", int9 == 30000);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + method13 + "' != '" + org.jsoup.Connection.Method.GET + "'", method13.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.bufferUp();
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.cookie("application/x-www-form-urlencoded");
        java.util.List list8 = response0.headers("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        org.jsoup.Connection connection16 = httpConnection0.referrer("Content-Type");
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection0.proxy(proxy17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response2 = response0.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base6 = response0.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection19 = httpConnection15.userAgent("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection15.response(response22);
        org.jsoup.Connection connection25 = httpConnection15.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = request29.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request34 = request29.data((org.jsoup.Connection.KeyVal) keyVal33);
        java.lang.String str35 = keyVal33.value();
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        java.lang.String str42 = keyVal40.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray46 = new org.jsoup.Connection.KeyVal[] { keyVal28, keyVal33, keyVal40, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList47 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47, keyValArray46);
        org.jsoup.Connection connection49 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection50 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection53 = httpConnection51.referrer("");
        org.jsoup.Connection connection56 = httpConnection51.header("hi!", "");
        org.jsoup.Connection connection58 = httpConnection51.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection59 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection61 = httpConnection59.referrer("");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection67 = httpConnection59.data(strArray66);
        org.jsoup.Connection connection68 = httpConnection51.data(strArray66);
        org.jsoup.Connection connection69 = httpConnection0.data(strArray66);
        org.jsoup.Connection connection71 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.Connection connection74 = httpConnection0.data("UTF-8", "Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(keyVal45);
        org.junit.Assert.assertNotNull(keyValArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection74);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.net.Proxy proxy3 = request2.proxy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = request2.hasHeaderWithValue("Content-Encoding", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection36 = httpConnection0.maxBodySize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection7 = httpConnection0.proxy("Content-Encoding", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response6.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.Connection.Method method19 = response17.method();
        java.util.Map map20 = response17.headers();
        org.jsoup.Connection connection21 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        org.jsoup.Connection connection23 = httpConnection0.sslSocketFactory(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection19 = httpConnection15.userAgent("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection15.response(response22);
        org.jsoup.Connection connection25 = httpConnection15.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = request29.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request34 = request29.data((org.jsoup.Connection.KeyVal) keyVal33);
        java.lang.String str35 = keyVal33.value();
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        java.lang.String str42 = keyVal40.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray46 = new org.jsoup.Connection.KeyVal[] { keyVal28, keyVal33, keyVal40, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList47 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47, keyValArray46);
        org.jsoup.Connection connection49 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection50 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection53 = httpConnection0.proxy("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection55 = httpConnection0.url("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(keyVal45);
        org.junit.Assert.assertNotNull(keyValArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Type", inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection8 = httpConnection0.cookie("multipart/form-data", "hi!");
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection9.data("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.referrer("");
        org.jsoup.Connection connection18 = httpConnection13.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.cookies();
        org.jsoup.Connection connection21 = httpConnection13.data((java.util.Map<java.lang.String, java.lang.String>) map20);
        org.jsoup.Connection connection22 = httpConnection9.cookies((java.util.Map<java.lang.String, java.lang.String>) map20);
        org.jsoup.Connection connection23 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.lang.String str7 = request0.requestBody();
        org.jsoup.Connection.Base base9 = request0.removeCookie("application/x-www-form-urlencoded");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        org.jsoup.Connection connection37 = httpConnection0.proxy("Content-Encoding", (int) (byte) 10);
        org.jsoup.helper.HttpConnection httpConnection38 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection40 = httpConnection38.referrer("");
        org.jsoup.Connection connection43 = httpConnection38.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method45 = response44.method();
        org.jsoup.Connection connection46 = httpConnection38.response((org.jsoup.Connection.Response) response44);
        java.lang.String str47 = response44.contentType();
        java.lang.String str48 = response44.contentType();
        org.jsoup.helper.HttpConnection.Response response50 = response44.charset("UTF-8");
        java.util.List list52 = response44.headers("hi!");
        org.jsoup.Connection.Method method53 = response44.method();
        org.jsoup.Connection.Base base56 = response44.header("Content-Type", "");
        java.util.Map map57 = response44.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection58 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNull(method53);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        java.lang.String str16 = response14.header("Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL15 = request14.url();
        org.jsoup.Connection.Method method16 = request14.method();
        org.jsoup.Connection.Base base17 = response11.method(method16);
        org.jsoup.Connection connection18 = httpConnection0.method(method16);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.referrer("");
        org.jsoup.Connection connection24 = httpConnection19.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.cookies();
        org.jsoup.Connection connection27 = httpConnection19.data((java.util.Map<java.lang.String, java.lang.String>) map26);
        org.jsoup.Connection connection28 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map26);
        org.jsoup.Connection connection30 = httpConnection0.ignoreContentType(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.net.Proxy proxy3 = request2.proxy();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base5 = request2.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.net.Proxy proxy13 = request11.proxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        org.jsoup.helper.HttpConnection.Request request24 = request5.timeout((int) '#');
        org.jsoup.Connection.Base base26 = request5.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.proxy("UTF-8", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        java.lang.String str16 = response6.charset();
        java.lang.String str17 = response6.statusMessage();
        java.lang.Class<?> wildcardClass18 = response6.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.String str23 = request16.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser24 = request16.parser();
        org.jsoup.Connection.Request request26 = request16.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request16);
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(request26);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request5.proxy(proxy12);
        boolean boolean15 = request5.hasCookie("application/x-www-form-urlencoded");
        int int16 = request5.timeout();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base19 = response17.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL21 = request20.url();
        org.jsoup.Connection.Method method22 = request20.method();
        org.jsoup.Connection.Base base23 = response17.method(method22);
        org.jsoup.Connection.Base base26 = response17.cookie("Content-Encoding=hi!", "Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + method22 + "' != '" + org.jsoup.Connection.Method.GET + "'", method22.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(base26);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.postDataCharset("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.timeout(0);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.data(keyValCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data collection must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.postDataCharset("UTF-8");
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection14 = httpConnection0.referrer("Content-Type=multipart/form-data");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.Connection connection34 = httpConnection0.method(method31);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.cookies();
        org.jsoup.Connection connection37 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map36);
        org.jsoup.helper.HttpConnection.Request request38 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL39 = request38.url();
        org.jsoup.Connection.Method method40 = request38.method();
        java.lang.String str41 = request38.postDataCharset();
        int int42 = request38.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request44 = request38.timeout((int) 'a');
        java.util.Map map45 = request38.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection46 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertTrue("'" + method40 + "' != '" + org.jsoup.Connection.Method.GET + "'", method40.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-8" + "'", str41, "UTF-8");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1048576 + "'", int42 == 1048576);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection connection9 = httpConnection0.method(method8);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.data("", "multipart/form-data", inputStream12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        java.lang.Class<?> wildcardClass9 = keyVal8.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = request0.ignoreContentType();
        java.net.URL uRL7 = request0.url();
        java.net.Proxy proxy8 = null;
        org.jsoup.helper.HttpConnection.Request request9 = request0.proxy(proxy8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.cookie("application/x-www-form-urlencoded");
        java.util.List list8 = response0.headers("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = request0.data();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.referrer("");
        org.jsoup.Connection connection15 = httpConnection10.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.Connection connection18 = httpConnection10.response((org.jsoup.Connection.Response) response16);
        org.jsoup.Connection.Base base20 = response16.removeCookie("Content-Type");
        java.lang.String str22 = response16.header("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyValCollection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        boolean boolean14 = response6.hasHeader("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response6.body();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        org.jsoup.helper.HttpConnection.Request request9 = request0.proxy("multipart/form-data", (int) (short) 1);
        org.jsoup.parser.Parser parser10 = request0.parser();
        java.lang.String str12 = request0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request0.data();
        boolean boolean12 = request0.hasCookie("Content-Type");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(keyValCollection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response6.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(base3);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.jsoup.Connection connection32 = httpConnection0.requestBody("hi!=");
        org.jsoup.Connection connection35 = httpConnection0.cookie("application/x-www-form-urlencoded", "application/x-www-form-urlencoded");
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
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base7 = request0.header("Content-Type", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request9 = request0.postDataCharset("hi!=Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=Content-Encoding=hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        java.lang.String str12 = response11.charset();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!" + "'", str12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.proxy("", 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:1048576");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        boolean boolean3 = response0.hasHeader("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream4 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.referrer("");
        org.jsoup.Connection connection16 = httpConnection11.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.Connection connection19 = httpConnection11.response((org.jsoup.Connection.Response) response17);
        java.lang.String str20 = response17.contentType();
        java.lang.String str21 = response17.contentType();
        org.jsoup.helper.HttpConnection.Response response23 = response17.charset("UTF-8");
        org.jsoup.Connection connection24 = httpConnection0.response((org.jsoup.Connection.Response) response23);
        boolean boolean27 = response23.hasHeaderWithValue("application/x-www-form-urlencoded", "Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection connection6 = httpConnection0.request((org.jsoup.Connection.Request) request3);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Encoding=hi!", "hi!", inputStream9, "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection16 = httpConnection12.userAgent("hi!");
        org.jsoup.Connection.Response response17 = null;
        org.jsoup.Connection connection18 = httpConnection12.response(response17);
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser20 = request19.parser();
        java.lang.String str22 = request19.header("Content-Encoding");
        org.jsoup.parser.Parser parser23 = request19.parser();
        org.jsoup.Connection connection24 = httpConnection12.parser(parser23);
        org.jsoup.Connection connection25 = httpConnection0.parser(parser23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection.KeyVal keyVal4 = httpConnection0.data("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = keyVal4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(keyVal4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.url("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: application/x-www-form-urlencoded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.timeout(0);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(true);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection20 = httpConnection0.data("UTF-8", "", inputStream18, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.header("hi!", "hi!");
        java.lang.String str14 = response0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.jsoup.helper.HttpConnection httpConnection52 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection54 = httpConnection52.referrer("");
        org.jsoup.Connection connection57 = httpConnection52.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response58 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method59 = response58.method();
        org.jsoup.Connection connection60 = httpConnection52.response((org.jsoup.Connection.Response) response58);
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base63 = response61.removeCookie("hi!");
        java.util.Map map64 = response61.cookies();
        org.jsoup.Connection connection65 = httpConnection52.data((java.util.Map<java.lang.String, java.lang.String>) map64);
        org.jsoup.Connection connection67 = httpConnection52.requestBody("");
        org.jsoup.Connection connection69 = httpConnection52.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Response response70 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base72 = response70.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request73 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL74 = request73.url();
        org.jsoup.Connection.Method method75 = request73.method();
        org.jsoup.Connection.Base base76 = response70.method(method75);
        java.lang.String str78 = response70.cookie("Content-Encoding");
        org.jsoup.Connection.Method method79 = response70.method();
        org.jsoup.Connection.Base base82 = response70.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response83 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map84 = response83.cookies();
        response70.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map84);
        org.jsoup.Connection connection86 = httpConnection52.data((java.util.Map<java.lang.String, java.lang.String>) map84);
        org.jsoup.Connection connection87 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map84);
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
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(base63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(base72);
        org.junit.Assert.assertNull(uRL74);
        org.junit.Assert.assertTrue("'" + method75 + "' != '" + org.jsoup.Connection.Method.GET + "'", method75.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + method79 + "' != '" + org.jsoup.Connection.Method.GET + "'", method79.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(connection86);
        org.junit.Assert.assertNotNull(connection87);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.lang.String str5 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=hi!" + "'", str5, "hi!=hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base5 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = response0.headers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        org.jsoup.Connection connection8 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request5.followRedirects(true);
        java.util.List list9 = request5.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection10 = request5.data();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = request5.headers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(keyValCollection10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection0.proxy(proxy14);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection.KeyVal keyVal4 = httpConnection0.data("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base7 = response5.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL9 = request8.url();
        org.jsoup.Connection.Method method10 = request8.method();
        org.jsoup.Connection.Base base11 = response5.method(method10);
        java.lang.String str13 = response5.cookie("Content-Encoding");
        org.jsoup.Connection.Method method14 = response5.method();
        org.jsoup.Connection.Base base17 = response5.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection connection21 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map19);
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection0.proxy(proxy22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(keyVal4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.timeout(0);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(true);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection20 = httpConnection0.data("UTF-8", "", inputStream18, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal22 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.jsoup.Connection connection16 = httpConnection0.referrer("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.postDataCharset("hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = request14.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request19 = request14.data((org.jsoup.Connection.KeyVal) keyVal18);
        org.jsoup.Connection.Method method20 = request14.method();
        org.jsoup.Connection connection21 = httpConnection0.method(method20);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request27 = request22.data((org.jsoup.Connection.KeyVal) keyVal26);
        int int28 = request27.timeout();
        java.net.Proxy proxy29 = null;
        org.jsoup.helper.HttpConnection.Request request30 = request27.proxy(proxy29);
        java.util.Map map31 = request27.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection32 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 30000 + "'", int28 == 30000);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        java.lang.String str16 = response6.charset();
        java.lang.Class<?> wildcardClass17 = response6.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        org.jsoup.Connection.Base base9 = response0.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "hi!=Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        org.jsoup.Connection.Request request13 = request11.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Request request15 = request11.timeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        boolean boolean24 = request5.hasCookie("application/x-www-form-urlencoded");
        org.jsoup.Connection.Base base27 = request5.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = request5.url(uRL28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        boolean boolean10 = request0.ignoreHttpErrors();
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        java.util.Map map4 = request0.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base7 = request0.header("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        java.lang.String str6 = request0.header("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = keyVal4.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("application/x-www-form-urlencoded");
        java.lang.String str11 = keyVal4.key();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "application/x-www-form-urlencoded" + "'", str11, "application/x-www-form-urlencoded");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        boolean boolean17 = response6.hasCookie("Content-Type=multipart/form-data");
        java.lang.String str19 = response6.cookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response6.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.referrer("");
        org.jsoup.Connection connection11 = httpConnection7.userAgent("hi!");
        org.jsoup.Connection.Response response12 = null;
        org.jsoup.Connection connection13 = httpConnection7.response(response12);
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection7.response(response14);
        org.jsoup.Connection connection17 = httpConnection7.ignoreContentType(false);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.referrer("");
        org.jsoup.Connection connection22 = httpConnection18.userAgent("hi!");
        org.jsoup.Connection.Response response23 = null;
        org.jsoup.Connection connection24 = httpConnection18.response(response23);
        org.jsoup.Connection.Response response25 = null;
        org.jsoup.Connection connection26 = httpConnection18.response(response25);
        org.jsoup.Connection connection28 = httpConnection18.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request32 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory33 = request32.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request37 = request32.data((org.jsoup.Connection.KeyVal) keyVal36);
        java.lang.String str38 = keyVal36.value();
        org.jsoup.helper.HttpConnection.Request request39 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory40 = request39.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal43 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request44 = request39.data((org.jsoup.Connection.KeyVal) keyVal43);
        java.lang.String str45 = keyVal43.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal48 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray49 = new org.jsoup.Connection.KeyVal[] { keyVal31, keyVal36, keyVal43, keyVal48 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList50 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList50, keyValArray49);
        org.jsoup.Connection connection52 = httpConnection18.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList50);
        org.jsoup.Connection connection53 = httpConnection7.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList50);
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection56 = httpConnection54.referrer("");
        org.jsoup.Connection connection59 = httpConnection54.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response60 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method61 = response60.method();
        org.jsoup.Connection connection62 = httpConnection54.response((org.jsoup.Connection.Response) response60);
        org.jsoup.helper.HttpConnection.Response response63 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base65 = response63.removeCookie("hi!");
        java.util.Map map66 = response63.cookies();
        org.jsoup.Connection connection67 = httpConnection54.data((java.util.Map<java.lang.String, java.lang.String>) map66);
        org.jsoup.helper.HttpConnection httpConnection68 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection70 = httpConnection68.referrer("");
        org.jsoup.Connection connection73 = httpConnection68.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response74 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map75 = response74.cookies();
        org.jsoup.Connection connection76 = httpConnection68.data((java.util.Map<java.lang.String, java.lang.String>) map75);
        org.jsoup.Connection connection77 = httpConnection54.cookies((java.util.Map<java.lang.String, java.lang.String>) map75);
        org.jsoup.Connection connection78 = httpConnection7.cookies((java.util.Map<java.lang.String, java.lang.String>) map75);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map75);
        java.lang.String str80 = response0.statusMessage();
        org.jsoup.Connection.Base base83 = response0.addHeader("Content-Type", "hi!=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNull(sSLSocketFactory33);
        org.junit.Assert.assertNotNull(keyVal36);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory40);
        org.junit.Assert.assertNotNull(keyVal43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(keyVal48);
        org.junit.Assert.assertNotNull(keyValArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(base65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(connection77);
        org.junit.Assert.assertNotNull(connection78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(base83);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass24 = httpConnection0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        org.jsoup.helper.HttpConnection.Request request9 = request0.proxy("multipart/form-data", (int) (short) 1);
        org.jsoup.parser.Parser parser10 = request0.parser();
        java.lang.String str11 = request0.requestBody();
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = request3.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = request3.data((org.jsoup.Connection.KeyVal) keyVal7);
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request11 = request0.data(keyVal10);
        org.jsoup.Connection.Request request13 = request0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.lang.String str12 = response6.header("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response6.bufferUp();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        boolean boolean12 = request5.ignoreHttpErrors();
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.value("");
        org.jsoup.helper.HttpConnection.Request request18 = request5.data((org.jsoup.Connection.KeyVal) keyVal15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        request18.sslSocketFactory(sSLSocketFactory19);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base22 = request18.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.referrer("");
        org.jsoup.Connection connection36 = httpConnection31.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method38 = response37.method();
        org.jsoup.Connection connection39 = httpConnection31.response((org.jsoup.Connection.Response) response37);
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base42 = response40.removeCookie("hi!");
        java.util.Map map43 = response40.cookies();
        org.jsoup.Connection connection44 = httpConnection31.data((java.util.Map<java.lang.String, java.lang.String>) map43);
        org.jsoup.Connection connection46 = httpConnection31.requestBody("");
        org.jsoup.Connection connection48 = httpConnection31.ignoreContentType(true);
        java.io.InputStream inputStream51 = null;
        org.jsoup.Connection connection52 = httpConnection31.data("Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream51);
        org.jsoup.Connection.Response response53 = httpConnection31.response();
        org.jsoup.Connection connection54 = httpConnection0.response(response53);
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
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(base42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser16 = request15.parser();
        java.lang.String str18 = request15.header("Content-Encoding");
        java.lang.String str19 = request15.requestBody();
        org.jsoup.Connection.Request request21 = request15.maxBodySize((int) (byte) 10);
        boolean boolean23 = request15.hasCookie("hi!");
        org.jsoup.Connection.Method method24 = request15.method();
        org.jsoup.Connection.Base base25 = response6.method(method24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response6.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + method24 + "' != '" + org.jsoup.Connection.Method.GET + "'", method24.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection8 = httpConnection0.data(strArray7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.headers(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream13 = response6.bodyStream();
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request6 = request0.postDataCharset("Content-Type=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Type=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30000 + "'", int4 == 30000);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        org.jsoup.helper.HttpConnection.Request request8 = request0.timeout((int) (short) 10);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        org.jsoup.Connection.Base base9 = response0.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "hi!=Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        java.net.URL uRL13 = response12.url();
        java.util.Map map14 = response12.multiHeaders();
        java.lang.Class<?> wildcardClass15 = response12.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.jsoup.Connection.Request request23 = request16.ignoreContentType(false);
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
        org.junit.Assert.assertNotNull(request23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.referrer("");
        org.jsoup.Connection connection18 = httpConnection13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.Connection connection21 = httpConnection13.response((org.jsoup.Connection.Response) response19);
        org.jsoup.Connection connection23 = httpConnection13.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection13.sslSocketFactory(sSLSocketFactory24);
        java.lang.String[] strArray32 = new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" };
        org.jsoup.Connection connection33 = httpConnection13.data(strArray32);
        org.jsoup.Connection connection34 = httpConnection0.data(strArray32);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method36 = response35.method();
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection40 = httpConnection37.data("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection43 = httpConnection41.referrer("");
        org.jsoup.Connection connection46 = httpConnection41.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map48 = response47.cookies();
        org.jsoup.Connection connection49 = httpConnection41.data((java.util.Map<java.lang.String, java.lang.String>) map48);
        org.jsoup.Connection connection50 = httpConnection37.cookies((java.util.Map<java.lang.String, java.lang.String>) map48);
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        org.jsoup.Connection connection52 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection55 = httpConnection0.cookie("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" });
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL15 = request14.url();
        org.jsoup.Connection.Method method16 = request14.method();
        org.jsoup.Connection.Base base17 = response11.method(method16);
        org.jsoup.Connection connection18 = httpConnection0.method(method16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.jsoup.Connection connection43 = httpConnection0.header("hi!=", "hi!=Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection45 = httpConnection0.url("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: application/x-www-form-urlencoded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        org.jsoup.parser.Parser parser4 = request0.parser();
        int int5 = request0.maxBodySize();
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1048576 + "'", int5 == 1048576);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        request5.sslSocketFactory(sSLSocketFactory6);
        org.jsoup.Connection.Base base9 = request5.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = request5.headers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection13 = httpConnection0.data("hi!", "");
        org.jsoup.Connection connection15 = httpConnection0.referrer("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection12 = httpConnection0.cookie("multipart/form-data", "Content-Type");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("Content-Encoding=hi!");
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "application/x-www-form-urlencoded", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.jsoup.Connection.Request request15 = httpConnection0.request();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(request15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        java.util.Map map9 = request5.multiHeaders();
        java.lang.String str10 = request5.postDataCharset();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        org.jsoup.Connection.Request request13 = request11.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = request11.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base7 = request0.header("Content-Type", "");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        request0.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection.Request request11 = request0.requestBody("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==" + "'", str4, "hi!==");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.cookies();
        java.lang.String str37 = response35.statusMessage();
        java.util.Map map38 = response35.headers();
        org.jsoup.Connection connection39 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection41 = httpConnection0.timeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        org.jsoup.Connection.Base base7 = response4.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream8 = response4.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(base7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection.Base base6 = response0.method(method5);
        java.lang.String str8 = response0.cookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response9.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL13 = request12.url();
        org.jsoup.Connection.Method method14 = request12.method();
        org.jsoup.Connection.Base base15 = response9.method(method14);
        java.lang.String str17 = response9.cookie("Content-Encoding");
        org.jsoup.Connection.Method method18 = response9.method();
        org.jsoup.Connection.Base base21 = response9.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + method18 + "' != '" + org.jsoup.Connection.Method.GET + "'", method18.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data", inputStream12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Base base6 = response0.addHeader("UTF-8", "UTF-8");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        int int14 = request13.timeout();
        java.net.Proxy proxy15 = null;
        org.jsoup.helper.HttpConnection.Request request16 = request13.proxy(proxy15);
        boolean boolean19 = request13.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection22 = httpConnection20.referrer("");
        org.jsoup.Connection connection25 = httpConnection20.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL27 = request26.url();
        org.jsoup.Connection.Method method28 = request26.method();
        org.jsoup.Connection connection29 = httpConnection20.method(method28);
        org.jsoup.Connection.Base base30 = request13.method(method28);
        java.util.Map map31 = request13.multiHeaders();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream33 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30000 + "'", int14 == 30000);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertTrue("'" + method28 + "' != '" + org.jsoup.Connection.Method.GET + "'", method28.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response12.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = request12.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request17 = request12.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.Connection.Request request19 = request17.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = request20.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request25 = request20.data((org.jsoup.Connection.KeyVal) keyVal24);
        org.jsoup.Connection.KeyVal keyVal27 = keyVal24.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request28 = request17.data((org.jsoup.Connection.KeyVal) keyVal24);
        java.util.List list30 = request28.headers("Content-Encoding=hi!");
        boolean boolean32 = request28.hasCookie("hi!");
        java.net.Proxy proxy33 = request28.proxy();
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = request34.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request39 = request34.data((org.jsoup.Connection.KeyVal) keyVal38);
        org.jsoup.Connection.Request request41 = request39.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = request42.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request47 = request42.data((org.jsoup.Connection.KeyVal) keyVal46);
        org.jsoup.Connection.KeyVal keyVal49 = keyVal46.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request50 = request39.data((org.jsoup.Connection.KeyVal) keyVal46);
        java.util.List list52 = request50.headers("Content-Encoding=hi!");
        boolean boolean54 = request50.hasCookie("hi!");
        java.net.Proxy proxy55 = request50.proxy();
        java.lang.String str57 = request50.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser58 = request50.parser();
        org.jsoup.helper.HttpConnection.Request request59 = request28.parser(parser58);
        java.util.Map map60 = request28.cookies();
        org.jsoup.Connection connection61 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map60);
        java.net.Proxy proxy62 = null;
        org.jsoup.Connection connection63 = httpConnection0.proxy(proxy62);
        org.jsoup.helper.HttpConnection httpConnection64 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection66 = httpConnection64.referrer("");
        org.jsoup.Connection connection69 = httpConnection64.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response70 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method71 = response70.method();
        org.jsoup.Connection connection72 = httpConnection64.response((org.jsoup.Connection.Response) response70);
        java.lang.String str73 = response70.contentType();
        java.lang.String str74 = response70.contentType();
        java.lang.String str75 = response70.contentType();
        java.lang.String str76 = response70.charset();
        java.util.List list78 = response70.headers("application/x-www-form-urlencoded");
        java.lang.String str80 = response70.header("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response81 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base83 = response81.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request84 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL85 = request84.url();
        org.jsoup.Connection.Method method86 = request84.method();
        org.jsoup.Connection.Base base87 = response81.method(method86);
        java.lang.String str89 = response81.cookie("Content-Encoding");
        org.jsoup.Connection.Method method90 = response81.method();
        org.jsoup.Connection.Base base91 = response70.method(method90);
        org.jsoup.Connection connection92 = httpConnection0.method(method90);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response93 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNull(sSLSocketFactory21);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(proxy33);
        org.junit.Assert.assertNull(sSLSocketFactory35);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNull(sSLSocketFactory43);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(proxy55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNull(method71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(base83);
        org.junit.Assert.assertNull(uRL85);
        org.junit.Assert.assertTrue("'" + method86 + "' != '" + org.jsoup.Connection.Method.GET + "'", method86.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base87);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + method90 + "' != '" + org.jsoup.Connection.Method.GET + "'", method90.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base91);
        org.junit.Assert.assertNotNull(connection92);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        java.util.Map map9 = request5.multiHeaders();
        org.jsoup.helper.HttpConnection.Request request11 = request5.timeout((int) (short) 0);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = request5.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection0.data("multipart/form-data", "multipart/form-data");
        org.jsoup.Connection connection5 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.proxy("hi!=hi!", (int) '#');
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.util.List list16 = response6.headers("UTF-8");
        java.util.Map map17 = response6.multiHeaders();
        java.lang.Class<?> wildcardClass18 = response6.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser7 = request6.parser();
        java.lang.String str9 = request6.header("Content-Encoding");
        java.lang.String str10 = request6.requestBody();
        org.jsoup.Connection.Request request12 = request6.maxBodySize((int) (byte) 10);
        boolean boolean14 = request6.hasCookie("hi!");
        org.jsoup.Connection.Method method15 = request6.method();
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection16 = request6.data();
        org.jsoup.Connection connection17 = httpConnection0.data(keyValCollection16);
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = httpConnection0.proxy(proxy18);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + method15 + "' != '" + org.jsoup.Connection.Method.GET + "'", method15.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(keyValCollection16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        boolean boolean2 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser4 = request3.parser();
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = request5.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request10 = request5.data((org.jsoup.Connection.KeyVal) keyVal9);
        java.lang.String str11 = keyVal9.value();
        org.jsoup.helper.HttpConnection.Request request12 = request3.data((org.jsoup.Connection.KeyVal) keyVal9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal9.value("hi!");
        java.lang.String str17 = keyVal16.toString();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Request request21 = request18.proxy("UTF-8", 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:1048576");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!" + "'", str17, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(request18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.data("Content-Type=multipart/form-data", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.maxBodySize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        boolean boolean6 = request0.hasCookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection.Base base9 = response0.method(method8);
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.cookie("", "hi!=Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        java.net.URL uRL13 = response12.url();
        java.util.Map map14 = response12.multiHeaders();
        java.lang.String str15 = response12.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response12.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base7 = request0.header("Content-Type", "");
        org.jsoup.Connection.Request request9 = request0.maxBodySize((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str5 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream6 = response0.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.jsoup.Connection connection15 = httpConnection0.requestBody("");
        org.jsoup.Connection connection17 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream13 = response6.bodyStream();
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
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL12 = request11.url();
        java.util.Map map13 = request11.multiHeaders();
        org.jsoup.Connection connection14 = httpConnection0.request((org.jsoup.Connection.Request) request11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        org.jsoup.Connection.Method method17 = response15.method();
        java.util.Map map18 = response15.headers();
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = request19.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request24 = request19.data((org.jsoup.Connection.KeyVal) keyVal23);
        int int25 = request24.timeout();
        java.net.Proxy proxy26 = null;
        org.jsoup.helper.HttpConnection.Request request27 = request24.proxy(proxy26);
        boolean boolean30 = request24.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.referrer("");
        org.jsoup.Connection connection36 = httpConnection31.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request37 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL38 = request37.url();
        org.jsoup.Connection.Method method39 = request37.method();
        org.jsoup.Connection connection40 = httpConnection31.method(method39);
        org.jsoup.Connection.Base base41 = request24.method(method39);
        org.jsoup.Connection.Base base42 = response15.method(method39);
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection45 = httpConnection43.referrer("");
        org.jsoup.Connection connection48 = httpConnection43.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method50 = response49.method();
        org.jsoup.Connection connection51 = httpConnection43.response((org.jsoup.Connection.Response) response49);
        org.jsoup.Connection connection53 = httpConnection43.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base56 = response54.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request57 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL58 = request57.url();
        org.jsoup.Connection.Method method59 = request57.method();
        org.jsoup.Connection.Base base60 = response54.method(method59);
        org.jsoup.Connection connection61 = httpConnection43.method(method59);
        org.jsoup.Connection.Base base62 = response15.method(method59);
        org.jsoup.Connection connection63 = httpConnection0.response((org.jsoup.Connection.Response) response15);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(sSLSocketFactory20);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30000 + "'", int25 == 30000);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertTrue("'" + method39 + "' != '" + org.jsoup.Connection.Method.GET + "'", method39.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(base41);
        org.junit.Assert.assertNotNull(base42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(base56);
        org.junit.Assert.assertNull(uRL58);
        org.junit.Assert.assertTrue("'" + method59 + "' != '" + org.jsoup.Connection.Method.GET + "'", method59.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(base62);
        org.junit.Assert.assertNotNull(connection63);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.contentType();
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection19 = httpConnection15.userAgent("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection15.response(response22);
        org.jsoup.Connection connection25 = httpConnection15.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = request29.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request34 = request29.data((org.jsoup.Connection.KeyVal) keyVal33);
        java.lang.String str35 = keyVal33.value();
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        java.lang.String str42 = keyVal40.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal45 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray46 = new org.jsoup.Connection.KeyVal[] { keyVal28, keyVal33, keyVal40, keyVal45 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList47 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47, keyValArray46);
        org.jsoup.Connection connection49 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.Connection connection50 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList47);
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection53 = httpConnection51.referrer("");
        org.jsoup.Connection connection56 = httpConnection51.header("hi!", "");
        org.jsoup.Connection connection58 = httpConnection51.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection59 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection61 = httpConnection59.referrer("");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection67 = httpConnection59.data(strArray66);
        org.jsoup.Connection connection68 = httpConnection51.data(strArray66);
        org.jsoup.Connection connection69 = httpConnection0.data(strArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection71 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(keyVal45);
        org.junit.Assert.assertNotNull(keyValArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection69);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("UTF-8", "Content-Type", inputStream5, "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        boolean boolean14 = request8.ignoreContentType();
        java.util.Map map15 = request8.cookies();
        org.jsoup.Connection connection16 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.postDataCharset("hi!=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection55 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
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
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.jsoup.Connection.Request request23 = request16.ignoreHttpErrors(true);
        java.util.List list25 = request16.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
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
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.data(keyValCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data collection must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection9 = request0.data();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = request0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyValCollection9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection connection11 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map10);
        org.jsoup.Connection connection13 = httpConnection0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.userAgent("Content-Type=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection connection11 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map10);
        org.jsoup.Connection connection13 = httpConnection0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.userAgent("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.url("hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        int int7 = request6.maxBodySize();
        org.jsoup.Connection.Request request9 = request6.requestBody("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1048576 + "'", int7 == 1048576);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = response0.charset("hi!");
        java.util.Map map12 = response0.multiHeaders();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        org.jsoup.parser.Parser parser4 = request0.parser();
        java.util.Map map5 = request0.headers();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base7 = request0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection connection6 = httpConnection0.request((org.jsoup.Connection.Request) request3);
        org.jsoup.Connection connection8 = httpConnection0.timeout(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        boolean boolean12 = request5.ignoreHttpErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = request5.hasHeaderWithValue("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.bufferUp();
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
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser12 = request5.parser();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base15 = request5.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        request16.sslSocketFactory(sSLSocketFactory21);
        java.util.Map map23 = request16.multiHeaders();
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
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map map2 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("Content-Type");
        java.lang.String str5 = response4.charset();
        java.lang.String str7 = response4.cookie("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL12 = request11.url();
        java.util.Map map13 = request11.multiHeaders();
        org.jsoup.Connection connection14 = httpConnection0.request((org.jsoup.Connection.Request) request11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.referrer("");
        org.jsoup.Connection connection21 = httpConnection17.userAgent("hi!");
        org.jsoup.Connection connection23 = httpConnection17.referrer("hi!");
        org.jsoup.Connection connection25 = httpConnection17.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.referrer("");
        org.jsoup.Connection connection31 = httpConnection26.header("hi!", "");
        org.jsoup.Connection connection33 = httpConnection26.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.referrer("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection42 = httpConnection34.data(strArray41);
        org.jsoup.Connection connection43 = httpConnection26.data(strArray41);
        org.jsoup.Connection connection44 = httpConnection17.data(strArray41);
        org.jsoup.Connection connection45 = httpConnection0.data(strArray41);
        org.jsoup.Connection.Response response46 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection48 = httpConnection0.url("Content-Type=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(response46);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        boolean boolean8 = request5.hasHeader("hi!");
        org.jsoup.Connection.Request request10 = request5.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = request5.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = response6.charset("UTF-8");
        java.net.URL uRL13 = response12.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response12.body();
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
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        boolean boolean8 = request5.hasHeader("hi!");
        org.jsoup.Connection.Request request10 = request5.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        boolean boolean18 = response6.hasHeader("Content-Type");
        org.jsoup.Connection.Base base21 = response6.header("hi!=hi!", "application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response6.bufferUp();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        org.jsoup.Connection connection19 = httpConnection0.cookie("application/x-www-form-urlencoded", "");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.util.Map map10 = response6.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response6.addHeader("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.charset();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.Connection.Method method5 = response0.method();
        java.util.Map map6 = response0.cookies();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request10 = request0.proxy("multipart/form-data", (int) '#');
        org.jsoup.helper.HttpConnection.Request request12 = request0.timeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = request12.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request17 = request12.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.Connection.Request request19 = request17.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = request20.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request25 = request20.data((org.jsoup.Connection.KeyVal) keyVal24);
        org.jsoup.Connection.KeyVal keyVal27 = keyVal24.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request28 = request17.data((org.jsoup.Connection.KeyVal) keyVal24);
        java.util.List list30 = request28.headers("Content-Encoding=hi!");
        boolean boolean32 = request28.hasCookie("hi!");
        java.net.Proxy proxy33 = request28.proxy();
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = request34.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request39 = request34.data((org.jsoup.Connection.KeyVal) keyVal38);
        org.jsoup.Connection.Request request41 = request39.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = request42.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request47 = request42.data((org.jsoup.Connection.KeyVal) keyVal46);
        org.jsoup.Connection.KeyVal keyVal49 = keyVal46.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request50 = request39.data((org.jsoup.Connection.KeyVal) keyVal46);
        java.util.List list52 = request50.headers("Content-Encoding=hi!");
        boolean boolean54 = request50.hasCookie("hi!");
        java.net.Proxy proxy55 = request50.proxy();
        java.lang.String str57 = request50.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser58 = request50.parser();
        org.jsoup.helper.HttpConnection.Request request59 = request28.parser(parser58);
        java.util.Map map60 = request28.cookies();
        org.jsoup.Connection connection61 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map60);
        java.net.Proxy proxy62 = null;
        org.jsoup.Connection connection63 = httpConnection0.proxy(proxy62);
        org.jsoup.Connection connection66 = httpConnection0.cookie("Content-Type", "");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory67 = null;
        org.jsoup.Connection connection68 = httpConnection0.sslSocketFactory(sSLSocketFactory67);
        java.lang.Class<?> wildcardClass69 = connection68.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNull(sSLSocketFactory21);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(proxy33);
        org.junit.Assert.assertNull(sSLSocketFactory35);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNull(sSLSocketFactory43);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(proxy55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection connection10 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("UTF-8", "", inputStream13);
        java.lang.Class<?> wildcardClass15 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        org.jsoup.Connection.Base base25 = request5.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data");
        org.jsoup.Connection.Request request27 = request5.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = request5.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(request27);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.Connection connection34 = httpConnection0.method(method31);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.cookies();
        org.jsoup.Connection connection37 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map36);
        java.io.InputStream inputStream40 = null;
        org.jsoup.Connection connection41 = httpConnection0.data("Content-Encoding=hi!", "application/x-www-form-urlencoded", inputStream40);
        org.jsoup.Connection.Request request42 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection44 = httpConnection0.url("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(request42);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.jsoup.Connection connection32 = httpConnection0.ignoreContentType(false);
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL12 = request11.url();
        org.jsoup.Connection.Method method13 = request11.method();
        org.jsoup.Connection connection14 = httpConnection0.method(method13);
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        java.util.Map map24 = response21.headers();
        org.jsoup.Connection connection25 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map24);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + method13 + "' != '" + org.jsoup.Connection.Method.GET + "'", method13.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        org.jsoup.helper.HttpConnection.Response response17 = response6.charset("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response6.addHeader("", "hi!=Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request24 = request5.postDataCharset("hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("UTF-8", "Content-Type", inputStream5, "hi!");
        org.jsoup.helper.HttpConnection.Request request8 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = request8.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request13 = request8.data((org.jsoup.Connection.KeyVal) keyVal12);
        boolean boolean14 = request8.ignoreContentType();
        java.util.Map map15 = request8.cookies();
        org.jsoup.Connection connection16 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        java.lang.String str10 = response6.contentType();
        java.lang.String str12 = response6.header("Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data", inputStream12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.postDataCharset("hi!==");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!==");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.referrer("");
        org.jsoup.Connection connection9 = httpConnection5.userAgent("hi!");
        org.jsoup.Connection.Response response10 = null;
        org.jsoup.Connection connection11 = httpConnection5.response(response10);
        org.jsoup.Connection.Response response12 = null;
        org.jsoup.Connection connection13 = httpConnection5.response(response12);
        org.jsoup.Connection connection15 = httpConnection5.ignoreContentType(false);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = request19.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request24 = request19.data((org.jsoup.Connection.KeyVal) keyVal23);
        java.lang.String str25 = keyVal23.value();
        org.jsoup.helper.HttpConnection.Request request26 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = request26.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal30 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request31 = request26.data((org.jsoup.Connection.KeyVal) keyVal30);
        java.lang.String str32 = keyVal30.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal[] keyValArray36 = new org.jsoup.Connection.KeyVal[] { keyVal18, keyVal23, keyVal30, keyVal35 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList37 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37, keyValArray36);
        org.jsoup.Connection connection39 = httpConnection5.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37);
        org.jsoup.Connection connection40 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList37);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory41 = null;
        org.jsoup.Connection connection42 = httpConnection0.sslSocketFactory(sSLSocketFactory41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection44 = httpConnection0.url("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNull(sSLSocketFactory20);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(sSLSocketFactory27);
        org.junit.Assert.assertNotNull(keyVal30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(keyVal35);
        org.junit.Assert.assertNotNull(keyValArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        java.util.List list3 = request0.headers("Content-Encoding");
        java.util.Map map4 = request0.headers();
        org.jsoup.Connection.Base base7 = request0.header("multipart/form-data", "application/x-www-form-urlencoded");
        java.lang.String str9 = request0.cookie("hi!=hi!");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        java.lang.String str7 = request0.postDataCharset();
        org.jsoup.Connection.Request request9 = request0.requestBody("Content-Type");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = request12.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request17 = request12.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.Connection.Request request19 = request17.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = request20.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request25 = request20.data((org.jsoup.Connection.KeyVal) keyVal24);
        org.jsoup.Connection.KeyVal keyVal27 = keyVal24.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request28 = request17.data((org.jsoup.Connection.KeyVal) keyVal24);
        java.util.List list30 = request28.headers("Content-Encoding=hi!");
        boolean boolean32 = request28.hasCookie("hi!");
        java.net.Proxy proxy33 = request28.proxy();
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = request34.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request39 = request34.data((org.jsoup.Connection.KeyVal) keyVal38);
        org.jsoup.Connection.Request request41 = request39.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = request42.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request47 = request42.data((org.jsoup.Connection.KeyVal) keyVal46);
        org.jsoup.Connection.KeyVal keyVal49 = keyVal46.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request50 = request39.data((org.jsoup.Connection.KeyVal) keyVal46);
        java.util.List list52 = request50.headers("Content-Encoding=hi!");
        boolean boolean54 = request50.hasCookie("hi!");
        java.net.Proxy proxy55 = request50.proxy();
        java.lang.String str57 = request50.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser58 = request50.parser();
        org.jsoup.helper.HttpConnection.Request request59 = request28.parser(parser58);
        java.util.Map map60 = request28.cookies();
        org.jsoup.Connection connection61 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map60);
        java.net.Proxy proxy62 = null;
        org.jsoup.Connection connection63 = httpConnection0.proxy(proxy62);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection65 = httpConnection0.postDataCharset("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNull(sSLSocketFactory21);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(proxy33);
        org.junit.Assert.assertNull(sSLSocketFactory35);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNull(sSLSocketFactory43);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(proxy55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection12 = httpConnection0.cookie("multipart/form-data", "Content-Type");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("Content-Encoding=hi!");
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "multipart/form-data");
        java.lang.Class<?> wildcardClass3 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.jsoup.Connection connection55 = httpConnection0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection57 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection55);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        int int7 = request6.maxBodySize();
        org.jsoup.Connection.Request request9 = request6.requestBody("Content-Encoding=hi!");
        java.util.Map map10 = request6.headers();
        boolean boolean13 = request6.hasHeaderWithValue("multipart/form-data", "hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Base base16 = request6.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1048576 + "'", int7 == 1048576);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request5.proxy(proxy12);
        org.jsoup.Connection.Base base15 = request13.removeCookie("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.cookies();
        boolean boolean20 = response16.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base22 = response16.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base25 = response16.addHeader("Content-Type", "multipart/form-data");
        java.lang.String str26 = response16.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request13, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        org.jsoup.Connection connection21 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.referrer("");
        org.jsoup.Connection connection27 = httpConnection22.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method29 = response28.method();
        org.jsoup.Connection connection30 = httpConnection22.response((org.jsoup.Connection.Response) response28);
        java.lang.String str31 = response28.contentType();
        org.jsoup.Connection.Base base34 = response28.cookie("UTF-8", "");
        java.lang.String str35 = response28.statusMessage();
        org.jsoup.Connection.Base base38 = response28.header("Content-Encoding", "UTF-8");
        java.util.Map map39 = response28.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection40 = httpConnection0.data((java.util.Map<java.lang.String, java.lang.String>) map39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.timeout(0);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: application/x-www-form-urlencoded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        boolean boolean6 = keyVal4.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.key("application/x-www-form-urlencoded");
        java.lang.String str11 = keyVal4.value();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Content-Encoding=hi!" + "'", str11, "Content-Encoding=hi!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        org.junit.Assert.assertNotNull(connection3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response4.contentType();
        int int6 = response4.statusCode();
        boolean boolean8 = response4.hasHeader("hi!");
        org.jsoup.Connection.Base base10 = response4.removeCookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.net.Proxy proxy3 = request2.proxy();
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection6 = httpConnection4.referrer("");
        org.jsoup.Connection connection9 = httpConnection4.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        org.jsoup.Connection connection12 = httpConnection4.response((org.jsoup.Connection.Response) response10);
        java.lang.String str13 = response10.contentType();
        java.lang.String str14 = response10.contentType();
        java.util.Map map15 = response10.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request2, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.referrer("");
        org.jsoup.Connection connection39 = httpConnection34.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method41 = response40.method();
        org.jsoup.Connection connection42 = httpConnection34.response((org.jsoup.Connection.Response) response40);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = null;
        org.jsoup.Connection connection44 = httpConnection34.sslSocketFactory(sSLSocketFactory43);
        org.jsoup.helper.HttpConnection.Request request45 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL46 = request45.url();
        org.jsoup.Connection.Method method47 = request45.method();
        org.jsoup.Connection connection48 = httpConnection34.method(method47);
        org.jsoup.Connection connection49 = httpConnection15.method(method47);
        org.jsoup.Connection.Base base50 = response14.method(method47);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray51 = response14.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertTrue("'" + method47 + "' != '" + org.jsoup.Connection.Method.GET + "'", method47.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(base50);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.referrer("");
        org.jsoup.Connection connection14 = httpConnection9.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        org.jsoup.Connection connection17 = httpConnection9.response((org.jsoup.Connection.Response) response15);
        java.lang.String str18 = response15.contentType();
        java.lang.String str19 = response15.contentType();
        org.jsoup.helper.HttpConnection.Response response21 = response15.charset("UTF-8");
        java.util.List list23 = response15.headers("hi!");
        org.jsoup.helper.HttpConnection.Request request24 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser25 = request24.parser();
        java.lang.String str27 = request24.header("Content-Encoding");
        java.lang.String str28 = request24.requestBody();
        org.jsoup.Connection.Request request30 = request24.maxBodySize((int) (byte) 10);
        boolean boolean32 = request24.hasCookie("hi!");
        org.jsoup.Connection.Method method33 = request24.method();
        org.jsoup.Connection.Base base34 = response15.method(method33);
        org.jsoup.Connection connection35 = httpConnection0.method(method33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + method33 + "' != '" + org.jsoup.Connection.Method.GET + "'", method33.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser12 = request5.parser();
        org.jsoup.Connection.Request request14 = request5.requestBody("Content-Type=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        boolean boolean25 = response21.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base28 = response21.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base30 = response21.removeCookie("Content-Type");
        boolean boolean32 = response21.hasCookie("Content-Type=multipart/form-data");
        java.lang.String str34 = response21.cookie("Content-Encoding");
        org.jsoup.Connection.Base base37 = response21.addHeader("hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response38 = org.jsoup.helper.HttpConnection.Response.execute(request14, response21);
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
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base37);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!", "Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.timeout(0);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection.Response response16 = httpConnection0.response();
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection0.proxy(proxy17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.io.InputStream inputStream29 = keyVal27.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal27.value("Content-Type=multipart/form-data");
        org.jsoup.Connection.KeyVal keyVal33 = keyVal31.contentType("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str34 = keyVal31.key();
        java.lang.String str35 = keyVal31.key();
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
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str34, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str35, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.url("Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "multipart/form-data", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        org.jsoup.parser.Parser parser19 = request16.parser();
        java.util.Map map20 = request16.headers();
        boolean boolean21 = request16.ignoreContentType();
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
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        org.jsoup.Connection.Base base7 = response4.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data");
        java.util.List list9 = response4.headers("Content-Encoding=hi!");
        java.lang.String str11 = response4.header("Content-Type");
        org.jsoup.Connection.Base base14 = response4.addHeader("hi!", "application/x-www-form-urlencoded");
        boolean boolean16 = response4.hasHeader("multipart/form-data");
        java.lang.String str18 = response4.cookie("hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection connection9 = httpConnection0.method(method8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.referrer("");
        org.jsoup.Connection connection14 = httpConnection10.userAgent("hi!");
        org.jsoup.Connection.Response response15 = null;
        org.jsoup.Connection connection16 = httpConnection10.response(response15);
        org.jsoup.helper.HttpConnection.Request request17 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser18 = request17.parser();
        java.lang.String str20 = request17.header("Content-Encoding");
        org.jsoup.parser.Parser parser21 = request17.parser();
        org.jsoup.Connection connection22 = httpConnection10.parser(parser21);
        org.jsoup.Connection.KeyVal keyVal24 = httpConnection10.data("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection connection26 = httpConnection10.response((org.jsoup.Connection.Response) response25);
        org.jsoup.Connection connection29 = httpConnection10.cookie("application/x-www-form-urlencoded", "");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map31 = response30.cookies();
        boolean boolean34 = response30.hasHeaderWithValue("Content-Type", "UTF-8");
        org.jsoup.Connection.Base base36 = response30.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base39 = response30.addHeader("Content-Type", "multipart/form-data");
        java.lang.String str41 = response30.header("UTF-8");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method43 = response42.method();
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection47 = httpConnection44.data("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection48 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection50 = httpConnection48.referrer("");
        org.jsoup.Connection connection53 = httpConnection48.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map55 = response54.cookies();
        org.jsoup.Connection connection56 = httpConnection48.data((java.util.Map<java.lang.String, java.lang.String>) map55);
        org.jsoup.Connection connection57 = httpConnection44.cookies((java.util.Map<java.lang.String, java.lang.String>) map55);
        response42.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        org.jsoup.Connection connection60 = httpConnection10.cookies((java.util.Map<java.lang.String, java.lang.String>) map55);
        org.jsoup.Connection connection61 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map55);
        java.io.InputStream inputStream64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection66 = httpConnection0.data("", "", inputStream64, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNull(keyVal24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection61);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        java.net.Proxy proxy12 = null;
        org.jsoup.helper.HttpConnection.Request request13 = request5.proxy(proxy12);
        boolean boolean14 = request5.ignoreContentType();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = request5.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.lang.String str7 = keyVal3.key();
        java.io.InputStream inputStream8 = keyVal3.inputStream();
        boolean boolean9 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        java.lang.String str9 = request0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean11 = request0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base14 = request0.header("Content-Type", "hi!");
        org.jsoup.Connection.Base base17 = request0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Encoding=hi!");
        boolean boolean20 = request0.hasHeaderWithValue("multipart/form-data", "hi!=");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!=Content-Encoding=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean4 = request0.hasHeader("multipart/form-data");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        org.jsoup.helper.HttpConnection.Request request9 = request0.proxy("multipart/form-data", (int) (short) 1);
        org.jsoup.parser.Parser parser10 = request0.parser();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.referrer("");
        org.jsoup.Connection connection16 = httpConnection11.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.Connection connection19 = httpConnection11.response((org.jsoup.Connection.Response) response17);
        java.lang.String str20 = response17.statusMessage();
        java.lang.String str21 = response17.charset();
        java.lang.String str22 = response17.statusMessage();
        java.lang.String str23 = response17.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        boolean boolean10 = request0.followRedirects();
        java.net.Proxy proxy11 = null;
        org.jsoup.helper.HttpConnection.Request request12 = request0.proxy(proxy11);
        int int13 = request0.maxBodySize();
        org.jsoup.Connection.Request request15 = request0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(request15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.cookie("application/x-www-form-urlencoded");
        java.util.List list8 = response0.headers("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection.Base base9 = response0.method(method8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
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
        org.junit.Assert.assertNull(sSLSocketFactory23);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) (short) 1);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.referrer("");
        org.jsoup.Connection connection13 = httpConnection9.userAgent("hi!");
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection9.response(response14);
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection9.response(response16);
        org.jsoup.Connection connection19 = httpConnection9.ignoreContentType(false);
        org.jsoup.Connection connection22 = httpConnection9.data("hi!", "");
        org.jsoup.Connection connection24 = httpConnection9.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection26 = httpConnection9.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection29 = httpConnection27.referrer("");
        org.jsoup.Connection connection31 = httpConnection27.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal33 = httpConnection27.data("multipart/form-data");
        org.jsoup.Connection connection35 = httpConnection27.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        int int42 = request41.timeout();
        java.net.Proxy proxy43 = null;
        org.jsoup.helper.HttpConnection.Request request44 = request41.proxy(proxy43);
        boolean boolean47 = request41.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser48 = request41.parser();
        org.jsoup.Connection connection49 = httpConnection27.parser(parser48);
        org.jsoup.helper.HttpConnection httpConnection50 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection52 = httpConnection50.referrer("");
        org.jsoup.Connection connection54 = httpConnection50.userAgent("hi!");
        org.jsoup.Connection.Response response55 = null;
        org.jsoup.Connection connection56 = httpConnection50.response(response55);
        org.jsoup.helper.HttpConnection.Request request57 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser58 = request57.parser();
        java.lang.String str60 = request57.header("Content-Encoding");
        org.jsoup.parser.Parser parser61 = request57.parser();
        org.jsoup.Connection connection62 = httpConnection50.parser(parser61);
        org.jsoup.helper.HttpConnection httpConnection63 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection65 = httpConnection63.referrer("");
        org.jsoup.Connection connection68 = httpConnection63.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response69 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method70 = response69.method();
        org.jsoup.Connection connection71 = httpConnection63.response((org.jsoup.Connection.Response) response69);
        java.lang.String str72 = response69.contentType();
        java.util.Map map73 = response69.multiHeaders();
        org.jsoup.Connection connection74 = httpConnection50.cookies((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection75 = httpConnection27.data((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection76 = httpConnection9.cookies((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection77 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map73);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response78 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNull(keyVal33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 30000 + "'", int42 == 30000);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(connection77);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.jsoup.Connection.Request request15 = request13.maxBodySize(97);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = request13.header("", "multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) (short) 1);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.referrer("");
        org.jsoup.Connection connection13 = httpConnection9.userAgent("hi!");
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection9.response(response14);
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection9.response(response16);
        org.jsoup.Connection connection19 = httpConnection9.ignoreContentType(false);
        org.jsoup.Connection connection22 = httpConnection9.data("hi!", "");
        org.jsoup.Connection connection24 = httpConnection9.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection26 = httpConnection9.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection29 = httpConnection27.referrer("");
        org.jsoup.Connection connection31 = httpConnection27.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal33 = httpConnection27.data("multipart/form-data");
        org.jsoup.Connection connection35 = httpConnection27.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection.Request request36 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = request36.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request41 = request36.data((org.jsoup.Connection.KeyVal) keyVal40);
        int int42 = request41.timeout();
        java.net.Proxy proxy43 = null;
        org.jsoup.helper.HttpConnection.Request request44 = request41.proxy(proxy43);
        boolean boolean47 = request41.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.parser.Parser parser48 = request41.parser();
        org.jsoup.Connection connection49 = httpConnection27.parser(parser48);
        org.jsoup.helper.HttpConnection httpConnection50 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection52 = httpConnection50.referrer("");
        org.jsoup.Connection connection54 = httpConnection50.userAgent("hi!");
        org.jsoup.Connection.Response response55 = null;
        org.jsoup.Connection connection56 = httpConnection50.response(response55);
        org.jsoup.helper.HttpConnection.Request request57 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser58 = request57.parser();
        java.lang.String str60 = request57.header("Content-Encoding");
        org.jsoup.parser.Parser parser61 = request57.parser();
        org.jsoup.Connection connection62 = httpConnection50.parser(parser61);
        org.jsoup.helper.HttpConnection httpConnection63 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection65 = httpConnection63.referrer("");
        org.jsoup.Connection connection68 = httpConnection63.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response69 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method70 = response69.method();
        org.jsoup.Connection connection71 = httpConnection63.response((org.jsoup.Connection.Response) response69);
        java.lang.String str72 = response69.contentType();
        java.util.Map map73 = response69.multiHeaders();
        org.jsoup.Connection connection74 = httpConnection50.cookies((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection75 = httpConnection27.data((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection76 = httpConnection9.cookies((java.util.Map<java.lang.String, java.lang.String>) map73);
        org.jsoup.Connection connection77 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map73);
        java.lang.Class<?> wildcardClass78 = map73.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNull(keyVal33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(sSLSocketFactory37);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 30000 + "'", int42 == 30000);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(connection77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        org.jsoup.helper.HttpConnection.Response response17 = response6.charset("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.referrer("");
        org.jsoup.Connection connection23 = httpConnection18.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.Connection connection26 = httpConnection18.response((org.jsoup.Connection.Response) response24);
        java.lang.String str27 = response24.contentType();
        org.jsoup.Connection.Base base30 = response24.cookie("UTF-8", "");
        java.lang.String str31 = response24.statusMessage();
        org.jsoup.Connection.Base base34 = response24.header("Content-Encoding", "UTF-8");
        java.util.Map map35 = response24.headers();
        boolean boolean38 = response24.hasHeaderWithValue("Content-Encoding", "multipart/form-data");
        java.util.Map map39 = response24.headers();
        // The following exception was thrown during execution in test generation
        try {
            response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        int int3 = request0.timeout();
        java.util.Map map4 = request0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        boolean boolean3 = request0.ignoreHttpErrors();
        org.jsoup.Connection.Base base5 = request0.removeCookie("Content-Encoding=hi!");
        java.util.List list7 = request0.headers("UTF-8");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal4.contentType("hi!");
        java.lang.String str8 = keyVal4.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.inputStream(inputStream9);
        java.lang.String str11 = keyVal10.value();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        org.jsoup.Connection connection32 = httpConnection0.requestBody("hi!=");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base35 = response33.removeCookie("hi!");
        org.jsoup.Connection connection36 = httpConnection0.response((org.jsoup.Connection.Response) response33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = response33.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(base35);
        org.junit.Assert.assertNotNull(connection36);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.statusMessage();
        java.net.URL uRL10 = response6.url();
        int int11 = response6.statusCode();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response6.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        org.jsoup.Connection.Base base3 = response0.removeHeader("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method5 = response4.method();
        org.jsoup.Connection.Method method6 = response4.method();
        java.util.Map map7 = response4.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        boolean boolean11 = response0.hasHeaderWithValue("Content-Encoding", "UTF-8");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Method method5 = response0.method();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str6 = response4.cookie("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        org.jsoup.Connection.Request request4 = request0.ignoreHttpErrors(true);
        boolean boolean5 = request0.ignoreContentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        boolean boolean10 = response6.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean12 = response6.hasCookie("multipart/form-data");
        java.lang.String str14 = response6.header("");
        java.net.URL uRL15 = response6.url();
        org.jsoup.helper.HttpConnection.Response response17 = response6.charset("hi!");
        java.util.List list19 = response6.headers("Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.Connection connection77 = httpConnection0.header("Content-Encoding", "Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document78 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(connection77);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.lang.String str3 = request2.requestBody();
        org.jsoup.Connection.Base base5 = request2.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Map map6 = request2.headers();
        boolean boolean8 = request2.hasHeader("hi!=hi!");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.Connection connection12 = httpConnection0.userAgent("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        boolean boolean2 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request4 = request0.timeout((int) (byte) 10);
        java.net.Proxy proxy5 = request4.proxy();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection0.data("multipart/form-data", "multipart/form-data");
        org.jsoup.Connection connection5 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection0.sslSocketFactory(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response15.bodyAsBytes();
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
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean10 = request8.hasCookie("hi!");
        java.net.Proxy proxy11 = request8.proxy();
        java.lang.String str12 = request8.postDataCharset();
        org.jsoup.Connection.Base base15 = request8.cookie("Content-Encoding=hi!", "");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        java.util.Map map2 = request0.multiHeaders();
        org.jsoup.Connection.Base base4 = request0.removeHeader("Content-Encoding=hi!");
        java.net.Proxy proxy5 = null;
        org.jsoup.helper.HttpConnection.Request request6 = request0.proxy(proxy5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = request6.cookie("", "hi!=Content-Encoding=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        java.lang.String str9 = keyVal6.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.statusMessage();
        java.net.URL uRL10 = response6.url();
        int int11 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url("Content-Type=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Base base27 = response21.cookie("UTF-8", "");
        java.lang.String str28 = response21.statusMessage();
        org.jsoup.Connection connection29 = httpConnection0.response((org.jsoup.Connection.Response) response21);
        int int30 = response21.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = response21.body();
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        boolean boolean8 = request0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = request0.method();
        boolean boolean10 = request0.followRedirects();
        boolean boolean13 = request0.hasHeaderWithValue("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jsoup.Connection.Response response24 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.Proxy proxy1 = null;
        org.jsoup.helper.HttpConnection.Request request2 = request0.proxy(proxy1);
        java.lang.String str3 = request2.requestBody();
        org.jsoup.Connection.Base base5 = request2.removeHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Base base8 = request2.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Content-Type=multipart/form-data");
        java.lang.String str10 = request2.header("application/x-www-form-urlencoded");
        boolean boolean12 = request2.hasHeader("hi!=hi!");
        org.jsoup.Connection.Base base15 = request2.header("Content-Type", "hi!==");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = request2.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.jsoup.Connection connection15 = httpConnection0.requestBody("");
        org.jsoup.Connection connection17 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream20 = null;
        org.jsoup.Connection connection21 = httpConnection0.data("Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream20);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request27 = request22.data((org.jsoup.Connection.KeyVal) keyVal26);
        org.jsoup.Connection.Request request29 = request27.followRedirects(true);
        java.util.List list31 = request27.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection32 = request27.data();
        org.jsoup.Connection connection33 = httpConnection0.data(keyValCollection32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection35 = httpConnection0.maxBodySize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(keyValCollection32);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.jsoup.Connection connection15 = httpConnection0.requestBody("");
        org.jsoup.Connection connection17 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream20 = null;
        org.jsoup.Connection connection21 = httpConnection0.data("Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", inputStream20);
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request27 = request22.data((org.jsoup.Connection.KeyVal) keyVal26);
        org.jsoup.Connection.Request request29 = request27.followRedirects(true);
        java.util.List list31 = request27.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection32 = request27.data();
        org.jsoup.Connection connection33 = httpConnection0.data(keyValCollection32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(keyValCollection32);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Base base27 = response21.cookie("UTF-8", "");
        java.lang.String str28 = response21.statusMessage();
        org.jsoup.Connection connection29 = httpConnection0.response((org.jsoup.Connection.Response) response21);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response21.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection22 = request16.data();
        org.jsoup.helper.HttpConnection.Request request24 = request16.timeout((int) (byte) 10);
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base26 = request24.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertNotNull(keyValCollection22);
        org.junit.Assert.assertNotNull(request24);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.contentType();
        java.lang.String str5 = keyVal3.toString();
        org.jsoup.Connection.KeyVal keyVal7 = keyVal3.contentType("Content-Encoding");
        boolean boolean8 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type=multipart/form-data" + "'", str5, "Content-Type=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection8 = httpConnection0.cookie("multipart/form-data", "hi!");
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.data("multipart/form-data", "multipart/form-data", inputStream11);
        org.jsoup.Connection connection15 = httpConnection0.header("Content-Type=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Request request6 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL7 = request6.url();
        org.jsoup.Connection.Method method8 = request6.method();
        org.jsoup.Connection.Base base9 = response0.method(method8);
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "Content-Type=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + method8 + "' != '" + org.jsoup.Connection.Method.GET + "'", method8.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        java.lang.String str3 = request0.header("Content-Encoding");
        java.lang.String str4 = request0.requestBody();
        org.jsoup.Connection.Request request6 = request0.maxBodySize((int) (byte) 10);
        org.jsoup.Connection.Base base9 = request0.header("UTF-8", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(base9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base2 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = response0.charset("multipart/form-data");
        java.lang.String str5 = response4.contentType();
        int int6 = response4.statusCode();
        boolean boolean8 = response4.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        boolean boolean8 = request5.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = request5.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        boolean boolean10 = response0.hasCookie("UTF-8");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.cookie("", "Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection.KeyVal keyVal10 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("hi!=");
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = request15.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request20 = request15.data((org.jsoup.Connection.KeyVal) keyVal19);
        boolean boolean21 = request15.ignoreContentType();
        java.net.URL uRL22 = request15.url();
        java.net.Proxy proxy23 = null;
        org.jsoup.helper.HttpConnection.Request request24 = request15.proxy(proxy23);
        java.util.Map map25 = request15.cookies();
        org.jsoup.Connection connection26 = httpConnection0.headers((java.util.Map<java.lang.String, java.lang.String>) map25);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(keyVal10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection13 = httpConnection0.data("hi!", "");
        org.jsoup.Connection connection15 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection17 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = request18.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request23 = request18.data((org.jsoup.Connection.KeyVal) keyVal22);
        org.jsoup.Connection.Request request25 = request23.followRedirects(true);
        java.util.List list27 = request23.headers("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection28 = request23.data();
        org.jsoup.Connection connection29 = httpConnection0.data(keyValCollection28);
        org.jsoup.Connection.Response response30 = httpConnection0.response();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(keyValCollection28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(response30);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        boolean boolean6 = response0.hasCookie("multipart/form-data");
        java.lang.String str8 = response0.header("");
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = response0.charset("hi!");
        java.util.Map map12 = response0.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection3 = httpConnection0.data("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection6 = httpConnection4.referrer("");
        org.jsoup.Connection connection9 = httpConnection4.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        org.jsoup.Connection connection12 = httpConnection4.data((java.util.Map<java.lang.String, java.lang.String>) map11);
        org.jsoup.Connection connection13 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map11);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.util.Map map18 = response16.headers();
        java.lang.String str19 = response16.statusMessage();
        org.jsoup.Connection.Base base22 = response16.addHeader("UTF-8", "UTF-8");
        java.lang.String str23 = response16.charset();
        org.jsoup.helper.HttpConnection.Request request24 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = request24.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request29 = request24.data((org.jsoup.Connection.KeyVal) keyVal28);
        int int30 = request29.timeout();
        java.net.Proxy proxy31 = null;
        org.jsoup.helper.HttpConnection.Request request32 = request29.proxy(proxy31);
        boolean boolean35 = request29.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.referrer("");
        org.jsoup.Connection connection41 = httpConnection36.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL43 = request42.url();
        org.jsoup.Connection.Method method44 = request42.method();
        org.jsoup.Connection connection45 = httpConnection36.method(method44);
        org.jsoup.Connection.Base base46 = request29.method(method44);
        java.util.Map map47 = request29.multiHeaders();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection49 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(sSLSocketFactory25);
        org.junit.Assert.assertNotNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30000 + "'", int30 == 30000);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertTrue("'" + method44 + "' != '" + org.jsoup.Connection.Method.GET + "'", method44.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(base46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser1 = request0.parser();
        org.jsoup.helper.HttpConnection.Request request2 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = request2.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request7 = request2.data((org.jsoup.Connection.KeyVal) keyVal6);
        java.lang.String str8 = keyVal6.value();
        org.jsoup.helper.HttpConnection.Request request9 = request0.data((org.jsoup.Connection.KeyVal) keyVal6);
        org.jsoup.Connection.Base base12 = request9.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "");
        org.jsoup.Connection.Base base15 = request9.header("hi!=Content-Encoding=hi!", "Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        org.jsoup.helper.HttpConnection.Request request11 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL12 = request11.url();
        java.util.Map map13 = request11.multiHeaders();
        org.jsoup.Connection connection14 = httpConnection0.request((org.jsoup.Connection.Request) request11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.referrer("");
        org.jsoup.Connection connection21 = httpConnection17.userAgent("hi!");
        org.jsoup.Connection connection23 = httpConnection17.referrer("hi!");
        org.jsoup.Connection connection25 = httpConnection17.referrer("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.referrer("");
        org.jsoup.Connection connection31 = httpConnection26.header("hi!", "");
        org.jsoup.Connection connection33 = httpConnection26.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.referrer("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" };
        org.jsoup.Connection connection42 = httpConnection34.data(strArray41);
        org.jsoup.Connection connection43 = httpConnection26.data(strArray41);
        org.jsoup.Connection connection44 = httpConnection17.data(strArray41);
        org.jsoup.Connection connection45 = httpConnection0.data(strArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response46 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection45);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.header("Content-Type=multipart/form-data");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection0.timeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.Connection connection7 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.io.InputStream inputStream5 = keyVal3.inputStream();
        boolean boolean6 = keyVal3.hasInputStream();
        java.lang.Class<?> wildcardClass7 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=hi!" + "'", str4, "Content-Encoding=hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal4.contentType("hi!");
        java.lang.String str8 = keyVal4.value();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal4.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal4.value("Content-Encoding=hi!");
        org.jsoup.Connection.KeyVal keyVal14 = keyVal4.contentType("Content-Encoding");
        java.lang.Class<?> wildcardClass15 = keyVal14.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: multipart/form-data");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        java.lang.String str9 = request0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean11 = request0.hasCookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request13 = request0.postDataCharset("Content-Encoding=hi!=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding=hi!=Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request10 = request0.proxy("multipart/form-data", (int) '#');
        java.util.Map map11 = request0.cookies();
        org.jsoup.Connection.Request request13 = request0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = request0.sslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        boolean boolean23 = request5.followRedirects();
        java.util.Map map24 = request5.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.cookies();
        java.lang.String str27 = response25.statusMessage();
        java.util.Map map28 = response25.cookies();
        int int29 = response25.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute((org.jsoup.Connection.Request) request5, response25);
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        org.jsoup.Connection.Method method2 = request0.method();
        java.lang.String str3 = request0.postDataCharset();
        int int4 = request0.maxBodySize();
        org.jsoup.helper.HttpConnection.Request request6 = request0.timeout((int) 'a');
        java.util.Map map7 = request0.multiHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request9 = request0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.GET + "'", method2.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1048576 + "'", int4 == 1048576);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.followRedirects(true);
        org.jsoup.Connection.Response response9 = httpConnection0.response();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.referrer("");
        org.jsoup.Connection connection15 = httpConnection10.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.Connection connection18 = httpConnection10.response((org.jsoup.Connection.Response) response16);
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Base base22 = response16.cookie("UTF-8", "");
        org.jsoup.Connection.Base base25 = response16.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "UTF-8");
        org.jsoup.Connection.Method method26 = response16.method();
        org.jsoup.Connection connection27 = httpConnection0.response((org.jsoup.Connection.Response) response16);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream28 = response16.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL1 = request0.url();
        boolean boolean2 = request0.followRedirects();
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser4 = request3.parser();
        org.jsoup.helper.HttpConnection.Request request5 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = request5.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request10 = request5.data((org.jsoup.Connection.KeyVal) keyVal9);
        java.lang.String str11 = keyVal9.value();
        org.jsoup.helper.HttpConnection.Request request12 = request3.data((org.jsoup.Connection.KeyVal) keyVal9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal9.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal9.value("hi!");
        java.lang.String str17 = keyVal16.toString();
        org.jsoup.helper.HttpConnection.Request request18 = request0.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.Connection.Request request20 = request0.ignoreContentType(false);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!" + "'", str17, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        boolean boolean12 = request5.ignoreHttpErrors();
        java.lang.Class<?> wildcardClass13 = request5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection8 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response11.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request14 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL15 = request14.url();
        org.jsoup.Connection.Method method16 = request14.method();
        org.jsoup.Connection.Base base17 = response11.method(method16);
        org.jsoup.Connection connection18 = httpConnection0.method(method16);
        org.jsoup.helper.HttpConnection.Request request19 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL20 = request19.url();
        org.jsoup.Connection.Method method21 = request19.method();
        org.jsoup.helper.HttpConnection.Request request22 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = request22.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request27 = request22.data((org.jsoup.Connection.KeyVal) keyVal26);
        org.jsoup.Connection.KeyVal keyVal29 = keyVal26.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request30 = request19.data(keyVal29);
        org.jsoup.Connection.Request request32 = request19.ignoreHttpErrors(false);
        org.jsoup.Connection connection33 = httpConnection0.request(request32);
        org.jsoup.Connection connection35 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection.Request request36 = null;
        org.jsoup.Connection connection37 = httpConnection0.request(request36);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + method16 + "' != '" + org.jsoup.Connection.Method.GET + "'", method16.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + method21 + "' != '" + org.jsoup.Connection.Method.GET + "'", method21.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        java.util.Map map12 = response11.cookies();
        org.jsoup.Connection.Base base14 = response11.removeCookie("hi!=");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response11.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.jsoup.Connection connection55 = httpConnection0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=multipart/form-data", "hi!=hi!");
        org.jsoup.Connection connection57 = httpConnection0.timeout(10);
        org.jsoup.Connection connection59 = httpConnection0.ignoreContentType(true);
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
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection59);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.util.List list16 = response6.headers("UTF-8");
        java.util.Map map17 = response6.multiHeaders();
        java.util.Map map18 = response6.multiHeaders();
        org.jsoup.Connection.Base base20 = response6.removeCookie("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream21 = response6.bodyStream();
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.referrer("Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection15 = request8.data();
        java.util.List list17 = request8.headers("Content-Encoding");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(keyValCollection15);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.statusMessage();
        java.lang.String str10 = response6.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.jsoup.Connection connection16 = httpConnection0.referrer("UTF-8");
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.referrer("");
        org.jsoup.Connection connection22 = httpConnection17.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method24 = response23.method();
        org.jsoup.Connection connection25 = httpConnection17.response((org.jsoup.Connection.Response) response23);
        java.lang.String str26 = response23.contentType();
        java.lang.String str27 = response23.contentType();
        java.lang.String str28 = response23.contentType();
        java.lang.String str29 = response23.charset();
        java.util.List list31 = response23.headers("application/x-www-form-urlencoded");
        org.jsoup.Connection connection32 = httpConnection0.response((org.jsoup.Connection.Response) response23);
        org.jsoup.helper.HttpConnection httpConnection33 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection35 = httpConnection33.referrer("");
        org.jsoup.Connection connection38 = httpConnection33.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method40 = response39.method();
        org.jsoup.Connection connection41 = httpConnection33.response((org.jsoup.Connection.Response) response39);
        org.jsoup.Connection connection43 = httpConnection33.postDataCharset("UTF-8");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory44 = null;
        org.jsoup.Connection connection45 = httpConnection33.sslSocketFactory(sSLSocketFactory44);
        java.lang.String[] strArray52 = new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" };
        org.jsoup.Connection connection53 = httpConnection33.data(strArray52);
        org.jsoup.Connection connection54 = httpConnection0.data(strArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document55 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "Content-Type=multipart/form-data", "Content-Encoding=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!", "Content-Encoding", "Content-Type" });
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection.Request request3 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL4 = request3.url();
        org.jsoup.Connection.Method method5 = request3.method();
        org.jsoup.Connection connection6 = httpConnection0.request((org.jsoup.Connection.Request) request3);
        org.jsoup.Connection connection8 = httpConnection0.timeout(10);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.referrer("");
        org.jsoup.Connection connection13 = httpConnection9.userAgent("hi!");
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection9.response(response14);
        org.jsoup.helper.HttpConnection.Request request16 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser17 = request16.parser();
        java.lang.String str19 = request16.header("Content-Encoding");
        org.jsoup.parser.Parser parser20 = request16.parser();
        org.jsoup.Connection connection21 = httpConnection9.parser(parser20);
        org.jsoup.Connection connection23 = httpConnection9.requestBody("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection26 = httpConnection24.referrer("");
        org.jsoup.Connection connection29 = httpConnection24.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method31 = response30.method();
        org.jsoup.Connection connection32 = httpConnection24.response((org.jsoup.Connection.Response) response30);
        java.lang.String str33 = response30.contentType();
        org.jsoup.Connection.Base base36 = response30.cookie("UTF-8", "");
        java.lang.String str37 = response30.statusMessage();
        org.jsoup.Connection connection38 = httpConnection9.response((org.jsoup.Connection.Response) response30);
        boolean boolean41 = response30.hasHeaderWithValue("UTF-8", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection42 = httpConnection0.response((org.jsoup.Connection.Response) response30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response43 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        boolean boolean4 = response0.hasHeaderWithValue("Content-Type", "UTF-8");
        java.util.Map map5 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection42 = httpConnection0.timeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Base base12 = response6.header("Content-Encoding=hi!", "Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.Response response14 = response6.charset("Content-Type");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.referrer("");
        org.jsoup.Connection connection20 = httpConnection15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method22 = response21.method();
        org.jsoup.Connection connection23 = httpConnection15.response((org.jsoup.Connection.Response) response21);
        org.jsoup.Connection connection25 = httpConnection15.postDataCharset("UTF-8");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base28 = response26.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Request request29 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL30 = request29.url();
        org.jsoup.Connection.Method method31 = request29.method();
        org.jsoup.Connection.Base base32 = response26.method(method31);
        org.jsoup.Connection connection33 = httpConnection15.method(method31);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.referrer("");
        org.jsoup.Connection connection39 = httpConnection34.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method41 = response40.method();
        org.jsoup.Connection connection42 = httpConnection34.response((org.jsoup.Connection.Response) response40);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = null;
        org.jsoup.Connection connection44 = httpConnection34.sslSocketFactory(sSLSocketFactory43);
        org.jsoup.helper.HttpConnection.Request request45 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL46 = request45.url();
        org.jsoup.Connection.Method method47 = request45.method();
        org.jsoup.Connection connection48 = httpConnection34.method(method47);
        org.jsoup.Connection connection49 = httpConnection15.method(method47);
        org.jsoup.Connection.Base base50 = response14.method(method47);
        org.jsoup.Connection.Method method51 = response14.method();
        java.net.URL uRL52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base53 = response14.url(uRL52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertTrue("'" + method47 + "' != '" + org.jsoup.Connection.Method.GET + "'", method47.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertTrue("'" + method51 + "' != '" + org.jsoup.Connection.Method.GET + "'", method51.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.jsoup.helper.HttpConnection.Request request37 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory38 = request37.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request42 = request37.data((org.jsoup.Connection.KeyVal) keyVal41);
        int int43 = request42.timeout();
        java.net.Proxy proxy44 = null;
        org.jsoup.helper.HttpConnection.Request request45 = request42.proxy(proxy44);
        org.jsoup.helper.HttpConnection.Request request48 = request42.proxy("hi!", 30000);
        org.jsoup.Connection.Request request50 = request48.followRedirects(true);
        org.jsoup.Connection connection51 = httpConnection0.request((org.jsoup.Connection.Request) request48);
        org.jsoup.helper.HttpConnection.Request request53 = request48.timeout(30000);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request55 = request48.postDataCharset("hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(sSLSocketFactory38);
        org.junit.Assert.assertNotNull(keyVal41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 30000 + "'", int43 == 30000);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(request53);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("UTF-8");
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        org.jsoup.helper.HttpConnection.Request request11 = request5.proxy("hi!", 30000);
        org.jsoup.helper.HttpConnection.Request request13 = request5.timeout(30000);
        boolean boolean15 = request5.hasCookie("Content-Encoding");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection16 = request5.data();
        org.jsoup.Connection.Base base19 = request5.cookie("hi!", "Content-Type=hi!");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyValCollection16);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        org.jsoup.Connection.Request request7 = request0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.Request request10 = request0.proxy("multipart/form-data", (int) '#');
        org.jsoup.helper.HttpConnection.Request request12 = request0.timeout((int) (byte) 10);
        org.jsoup.parser.Parser parser13 = request0.parser();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.key();
        boolean boolean5 = keyVal3.hasInputStream();
        java.lang.String str6 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str4, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str6, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        java.net.URL uRL6 = request5.url();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        org.jsoup.helper.HttpConnection.Request request15 = request5.data((org.jsoup.Connection.KeyVal) keyVal10);
        org.jsoup.Connection.Request request17 = request5.ignoreContentType(false);
        org.jsoup.Connection.Method method18 = request5.method();
        boolean boolean20 = request5.hasHeader("Content-Encoding=hi!");
        org.jsoup.Connection.Base base23 = request5.addHeader("multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertTrue("'" + method18 + "' != '" + org.jsoup.Connection.Method.GET + "'", method18.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection4 = httpConnection0.userAgent("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.helper.HttpConnection.Request request12 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = request12.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request17 = request12.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.Connection.Request request19 = request17.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request20 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = request20.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request25 = request20.data((org.jsoup.Connection.KeyVal) keyVal24);
        org.jsoup.Connection.KeyVal keyVal27 = keyVal24.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request28 = request17.data((org.jsoup.Connection.KeyVal) keyVal24);
        java.util.List list30 = request28.headers("Content-Encoding=hi!");
        boolean boolean32 = request28.hasCookie("hi!");
        java.net.Proxy proxy33 = request28.proxy();
        org.jsoup.helper.HttpConnection.Request request34 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = request34.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request39 = request34.data((org.jsoup.Connection.KeyVal) keyVal38);
        org.jsoup.Connection.Request request41 = request39.followRedirects(true);
        org.jsoup.helper.HttpConnection.Request request42 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = request42.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request47 = request42.data((org.jsoup.Connection.KeyVal) keyVal46);
        org.jsoup.Connection.KeyVal keyVal49 = keyVal46.contentType("hi!");
        org.jsoup.helper.HttpConnection.Request request50 = request39.data((org.jsoup.Connection.KeyVal) keyVal46);
        java.util.List list52 = request50.headers("Content-Encoding=hi!");
        boolean boolean54 = request50.hasCookie("hi!");
        java.net.Proxy proxy55 = request50.proxy();
        java.lang.String str57 = request50.cookie("Content-Encoding");
        org.jsoup.parser.Parser parser58 = request50.parser();
        org.jsoup.helper.HttpConnection.Request request59 = request28.parser(parser58);
        java.util.Map map60 = request28.cookies();
        org.jsoup.Connection connection61 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map60);
        org.jsoup.Connection connection63 = httpConnection0.ignoreHttpErrors(true);
        java.io.InputStream inputStream66 = null;
        org.jsoup.Connection connection67 = httpConnection0.data("Content-Encoding=hi!=Content-Encoding", "", inputStream66);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document68 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNull(sSLSocketFactory21);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(proxy33);
        org.junit.Assert.assertNull(sSLSocketFactory35);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNull(sSLSocketFactory43);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(proxy55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection67);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = response6.charset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response11.addHeader("", "hi!=hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("hi!", "hi!", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.header("Content-Encoding", "UTF-8");
        org.jsoup.Connection connection13 = httpConnection0.cookie("Content-Type", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.jsoup.helper.HttpConnection.Request request15 = new org.jsoup.helper.HttpConnection.Request();
        org.jsoup.parser.Parser parser16 = request15.parser();
        java.lang.String str18 = request15.header("Content-Encoding");
        java.lang.String str19 = request15.requestBody();
        org.jsoup.Connection.Request request21 = request15.maxBodySize((int) (byte) 10);
        boolean boolean23 = request15.hasCookie("hi!");
        org.jsoup.Connection.Method method24 = request15.method();
        org.jsoup.Connection.Base base25 = response6.method(method24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + method24 + "' != '" + org.jsoup.Connection.Method.GET + "'", method24.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        java.lang.String str16 = response6.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("");
        org.jsoup.Connection connection5 = httpConnection0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection connection8 = httpConnection0.response((org.jsoup.Connection.Response) response6);
        boolean boolean10 = response6.hasHeader("multipart/form-data");
        org.jsoup.Connection.Base base13 = response6.cookie("application/x-www-form-urlencoded", "Content-Encoding");
        org.jsoup.Connection.Base base15 = response6.removeCookie("Content-Type");
        boolean boolean17 = response6.hasCookie("Content-Type=multipart/form-data");
        java.lang.String str19 = response6.cookie("Content-Encoding");
        java.util.Map map20 = response6.multiHeaders();
        java.lang.String str21 = response6.charset();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "multipart/form-data", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.referrer("");
        org.jsoup.Connection connection18 = httpConnection13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.Connection connection21 = httpConnection13.response((org.jsoup.Connection.Response) response19);
        java.lang.String str22 = response19.contentType();
        java.util.Map map23 = response19.multiHeaders();
        org.jsoup.Connection connection24 = httpConnection0.cookies((java.util.Map<java.lang.String, java.lang.String>) map23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.helper.HttpConnection.Request request0 = new org.jsoup.helper.HttpConnection.Request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = request0.sslSocketFactory();
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Request request5 = request0.data((org.jsoup.Connection.KeyVal) keyVal4);
        int int6 = request5.timeout();
        java.net.Proxy proxy7 = null;
        org.jsoup.helper.HttpConnection.Request request8 = request5.proxy(proxy7);
        boolean boolean11 = request5.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.referrer("");
        org.jsoup.Connection connection17 = httpConnection12.data("hi!", "multipart/form-data");
        org.jsoup.helper.HttpConnection.Request request18 = new org.jsoup.helper.HttpConnection.Request();
        java.net.URL uRL19 = request18.url();
        org.jsoup.Connection.Method method20 = request18.method();
        org.jsoup.Connection connection21 = httpConnection12.method(method20);
        org.jsoup.Connection.Base base22 = request5.method(method20);
        boolean boolean24 = request5.hasCookie("application/x-www-form-urlencoded");
        org.jsoup.Connection.Base base27 = request5.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36=hi!");
        java.util.Map map28 = request5.headers();
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base30 = request5.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
    }
}

