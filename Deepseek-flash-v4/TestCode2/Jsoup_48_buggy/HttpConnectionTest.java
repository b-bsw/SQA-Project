package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

import static org.junit.Assert.*;

public class HttpConnectionTest {
    private HttpConnection con;
    private HttpConnection.Request req;
    private HttpConnection.Response res;

    @Before
    public void setUp() throws Exception {
        con = (HttpConnection) HttpConnection.connect("http://example.com");
        req = (HttpConnection.Request) con.request();
        res = (HttpConnection.Response) con.response();
    }

    // ---------- connect ----------
    @Test
    public void testConnectString() throws Exception {
        HttpConnection con2 = (HttpConnection) HttpConnection.connect("http://test.com/path");
        assertEquals("http://test.com/path", con2.request().url().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectStringEmpty() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectStringMalformed() {
        HttpConnection.connect("not a url");
    }

    @Test
    public void testConnectURL() throws Exception {
        URL url = new URL("http://test.com");
        HttpConnection con2 = (HttpConnection) HttpConnection.connect(url);
        assertEquals(url, con2.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectURLNull() {
        HttpConnection.connect((URL) null);
    }

    // ---------- url encode ----------
    @Test
    public void testUrlEncodesSpaces() throws Exception {
        HttpConnection con2 = (HttpConnection) HttpConnection.connect("http://example.com/a b");
        assertEquals("http://example.com/a%20b", con2.request().url().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlStringNull() {
        con.url((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlStringEmpty() {
        con.url("");
    }

    // ---------- data (key, value) ----------
    @Test
    public void testDataKeyValue() {
        con.data("key1", "value1");
        assertEquals(1, req.data().size());
        Connection.KeyVal kv = req.data().iterator().next();
        assertEquals("key1", kv.key());
        assertEquals("value1", kv.value());
    }

    // ---------- data (key, filename, inputStream) ----------
    @Test
    public void testDataWithInputStream() {
        InputStream is = new ByteArrayInputStream("test".getBytes());
        con.data("file", "test.txt", is);
        assertEquals(1, req.data().size());
        Connection.KeyVal kv = req.data().iterator().next();
        assertTrue(kv.hasInputStream());
        assertSame(is, kv.inputStream());
        assertEquals("test.txt", kv.value());
    }

    // ---------- data (Map) ----------
    @Test
    public void testDataMap() {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        con.data(map);
        assertEquals(2, req.data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMapNull() {
        con.data((Map<String, String>) null);
    }

    // ---------- data (varargs) ----------
    @Test
    public void testDataVarargs() {
        con.data("k1", "v1", "k2", "v2");
        assertEquals(2, req.data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNull() {
        con.data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsOdd() {
        con.data("k1", "v1", "k2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsEmptyKey() {
        con.data("", "v1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNullValue() {
        con.data("k1", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNullKey() {
        con.data((String) null, "v1");
    }

    // ---------- data (Collection) ----------
    @Test
    public void testDataCollection() {
        List<Connection.KeyVal> list = new ArrayList<>();
        list.add(HttpConnection.KeyVal.create("k", "v"));
        con.data(list);
        assertEquals(1, req.data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCollectionNull() {
        con.data((Collection<Connection.KeyVal>) null);
    }

    // ---------- header ----------
    @Test
    public void testHeader() {
        con.header("Accept", "text/html");
        assertEquals("text/html", req.header("Accept"));
        assertEquals("text/html", req.header("accept"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseHeaderNullName() {
        req.header(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseHeaderEmptyName() {
        req.header("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseHeaderNullValue() {
        req.header("name", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetHeaderNullName() {
        req.header(null);
    }

    // ---------- hasHeader ----------
    @Test
    public void testHasHeader() {
        req.header("Accept", "text");
        assertTrue(req.hasHeader("Accept"));
        assertTrue(req.hasHeader("accept"));
        assertFalse(req.hasHeader("NonExistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasHeaderEmptyName() {
        req.hasHeader("");
    }

    // ---------- hasHeaderWithValue ----------
    @Test
    public void testHasHeaderWithValue() {
        req.header("Accept", "text/html");
        assertTrue(req.hasHeaderWithValue("Accept", "text/html"));
        assertTrue(req.hasHeaderWithValue("accept", "TEXT/HTML"));
        assertFalse(req.hasHeaderWithValue("Accept", "text"));
    }

    // ---------- removeHeader ----------
    @Test
    public void testRemoveHeader() {
        req.header("X", "y");
        assertTrue(req.hasHeader("X"));
        req.removeHeader("X");
        assertFalse(req.hasHeader("X"));
        req.removeHeader("NotThere");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveHeaderEmptyName() {
        req.removeHeader("");
    }

    // ---------- cookie ----------
    @Test
    public void testCookie() {
        con.cookie("session", "abc");
        assertEquals("abc", req.cookie("session"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieEmptyName() {
        req.cookie("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieNullValue() {
        req.cookie("name", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieEmptyNameGet() {
        req.cookie("");
    }

    // ---------- hasCookie ----------
    @Test
    public void testHasCookie() {
        req.cookie("x", "y");
        assertTrue(req.hasCookie("x"));
        assertFalse(req.hasCookie("z"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasCookieEmptyName() {
        req.hasCookie("");
    }

    // ---------- removeCookie ----------
    @Test
    public void testRemoveCookie() {
        req.cookie("x", "y");
        assertTrue(req.hasCookie("x"));
        req.removeCookie("x");
        assertFalse(req.hasCookie("x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveCookieEmptyName() {
        req.removeCookie("");
    }

    // ---------- cookies ----------
    @Test(expected = IllegalArgumentException.class)
    public void testCookiesNull() {
        con.cookies(null);
    }

    // ---------- timeout ----------
    @Test
    public void testTimeout() {
        con.timeout(5000);
        assertEquals(5000, req.timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeoutNegative() {
        con.timeout(-1);
    }

    // ---------- maxBodySize ----------
    @Test
    public void testMaxBodySize() {
        con.maxBodySize(2048);
        assertEquals(2048, req.maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySizeNegative() {
        con.maxBodySize(-1);
    }

    // ---------- followRedirects ----------
    @Test
    public void testFollowRedirects() {
        con.followRedirects(false);
        assertFalse(req.followRedirects());
    }

    // ---------- ignoreHttpErrors ----------
    @Test
    public void testIgnoreHttpErrors() {
        con.ignoreHttpErrors(true);
        assertTrue(req.ignoreHttpErrors());
    }

    // ---------- ignoreContentType ----------
    @Test
    public void testIgnoreContentType() {
        con.ignoreContentType(true);
        assertTrue(req.ignoreContentType());
    }

    // ---------- validateTLSCertificates ----------
    @Test
    public void testValidateTLSCertificates() {
        con.validateTLSCertificates(false);
        assertFalse(req.validateTLSCertificates());
    }

    // ---------- userAgent ----------
    @Test
    public void testUserAgent() {
        con.userAgent("Mozilla");
        assertEquals("Mozilla", req.header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgentNull() {
        con.userAgent(null);
    }

    // ---------- referrer ----------
    @Test
    public void testReferrer() {
        con.referrer("http://ref.com");
        assertEquals("http://ref.com", req.header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrerNull() {
        con.referrer(null);
    }

    // ---------- method ----------
    @Test
    public void testMethod() {
        con.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, req.method());
    }

    // ---------- request / response ----------
    @Test
    public void testRequestResponse() {
        HttpConnection.Request newReq = new HttpConnection.Request();
        con.request(newReq);
        assertSame(newReq, con.request());
        HttpConnection.Response newRes = new HttpConnection.Response();
        con.response(newRes);
        assertSame(newRes, con.response());
    }

    // ---------- postDataCharset ----------
    @Test
    public void testPostDataCharset() {
        con.postDataCharset("UTF-8");
        assertEquals("UTF-8", req.postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharsetNull() {
        con.postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharsetInvalid() {
        con.postDataCharset("invalid-charset");
    }

    // ---------- KeyVal ----------
    @Test
    public void testKeyVal() {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
        assertEquals("key=value", kv.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValEmptyKey() {
        HttpConnection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValNullValue() {
        HttpConnection.KeyVal.create("key", null);
    }

    // ---------- Response parse/body/bodyAsBytes without execution ----------
    @Test(expected = IllegalArgumentException.class)
    public void testParseWithoutExecute() throws IOException {
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyWithoutExecute() {
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyAsBytesWithoutExecute() {
        res.bodyAsBytes();
    }

    // ---------- processResponseHeaders ----------
    @Test
    public void testProcessResponseHeaders() {
        HttpConnection.Response testRes = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Arrays.asList("session=abc; Path=/", "token=xyz; HttpOnly"));
        headers.put("Content-Type", Arrays.asList("text/html"));
        headers.put("X-Custom", Arrays.asList("value1"));
        headers.put(null, Arrays.asList("should be ignored"));
        testRes.processResponseHeaders(headers);
        assertEquals("abc", testRes.cookie("session"));
        assertEquals("xyz", testRes.cookie("token"));
        assertEquals("text/html", testRes.header("Content-Type"));
        assertEquals("value1", testRes.header("X-Custom"));
    }

    @Test
    public void testProcessResponseHeadersEmptyCookieName() {
        HttpConnection.Response testRes = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Arrays.asList("=value; Path=/"));
        testRes.processResponseHeaders(headers);
        assertTrue(testRes.cookies().isEmpty());
    }

    @Test
    public void testProcessResponseHeadersNullCookieValue() {
        HttpConnection.Response testRes = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Arrays.asList((String) null));
        testRes.processResponseHeaders(headers);
        assertTrue(testRes.cookies().isEmpty());
    }
}