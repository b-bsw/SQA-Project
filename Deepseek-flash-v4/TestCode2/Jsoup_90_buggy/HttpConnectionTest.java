package org.jsoup.helper;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.*;
import javax.net.ssl.SSLSocketFactory;

public class HttpConnectionTest {
    private HttpConnection conn;

    @Before
    public void setUp() {
        conn = new HttpConnection();
    }

    @Test
    public void connectStringValid() {
        Connection c = HttpConnection.connect("http://example.com");
        assertNotNull(c);
    }

    @Test(expected = IllegalArgumentException.class)
    public void connectStringEmpty() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void connectStringNull() {
        HttpConnection.connect(null);
    }

    @Test(expected = NullPointerException.class)
    public void connectURLNull() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void urlString() throws Exception {
        conn.url("http://example.com");
        assertEquals("http://example.com", conn.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void urlStringNull() {
        conn.url((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void urlStringMalformed() {
        conn.url("not a url");
    }

    @Test(expected = NullPointerException.class)
    public void urlURLNull() {
        conn.url((URL) null);
    }

    @Test
    public void proxyStringPort() {
        conn.proxy("localhost", 8080);
        Proxy p = ((HttpConnection.Request) conn.request()).proxy();
        assertNotNull(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void userAgentNull() {
        conn.userAgent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeoutNegative() {
        conn.timeout(-1);
    }

    @Test
    public void timeoutZero() {
        conn.timeout(0);
        assertEquals(0, conn.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxBodySizeNegative() {
        conn.maxBodySize(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dataMapNull() {
        conn.data((Map<String, String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dataVarargsOddCount() {
        conn.data("key1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void dataVarargsNullKey() {
        conn.data(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void dataVarargsNullValue() {
        conn.data("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void headerEmptyName() {
        conn.header("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void headersMapNull() {
        conn.headers(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookieEmptyName() {
        conn.cookie("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookieNullValue() {
        conn.cookie("name", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookiesMapNull() {
        conn.cookies(null);
    }

    @Test
    public void requestSetGet() {
        Connection.Request req = conn.request();
        assertNotNull(req);
        Connection.Request newReq = new HttpConnection.Request();
        conn.request(newReq);
        assertSame(newReq, conn.request());
    }

    @Test
    public void responseSetGet() {
        Connection.Response res = conn.response();
        assertNotNull(res);
        Connection.Response newRes = new HttpConnection.Response();
        conn.response(newRes);
        assertSame(newRes, conn.response());
    }

    @Test
    public void keyValCreate() {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyValKeyEmpty() {
        HttpConnection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyValValueNull() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test
    public void keyValInputStream() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("file", "name.txt", in);
        assertTrue(kv.hasInputStream());
        assertSame(in, kv.inputStream());
    }

    @Test
    public void keyValContentType() {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        kv.contentType("text/plain");
        assertEquals("text/plain", kv.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyValContentTypeEmpty() {
        HttpConnection.KeyVal.create("key", "value").contentType("");
    }

    @Test
    public void requestDefaults() {
        HttpConnection.Request req = (HttpConnection.Request) conn.request();
        assertEquals(30000, req.timeout());
        assertEquals(1024 * 1024, req.maxBodySize());
        assertTrue(req.followRedirects());
        assertFalse(req.ignoreHttpErrors());
        assertFalse(req.ignoreContentType());
    }

    @Test
    public void headerAddAndGet() {
        conn.header("Accept", "text/html");
        assertEquals("text/html", conn.request().header("Accept"));
        assertTrue(conn.request().hasHeader("Accept"));
        assertTrue(conn.request().hasHeaderWithValue("Accept", "text/html"));
    }

    @Test
    public void headersMapAdd() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("X-Custom", "value1");
        map.put("X-Other", "value2");
        conn.headers(map);
        assertEquals("value1", conn.request().header("X-Custom"));
        assertEquals("value2", conn.request().header("X-Other"));
    }

    @Test
    public void cookieAddAndGet() {
        conn.cookie("session", "abc123");
        assertEquals("abc123", conn.request().cookie("session"));
        assertTrue(conn.request().hasCookie("session"));
    }

    @Test
    public void dataCollection() {
        List<Connection.KeyVal> list = new ArrayList<>();
        list.add(HttpConnection.KeyVal.create("a", "1"));
        list.add(HttpConnection.KeyVal.create("b", "2"));
        conn.data(list);
        assertEquals(2, conn.request().data().size());
    }

    @Test
    public void dataSingleKey() {
        conn.data("key1", "value1");
        conn.data("key2", "value2");
        Connection.KeyVal kv = conn.data("key1");
        assertNotNull(kv);
        assertEquals("value1", kv.value());
        assertNull(conn.data("nonexistent"));
    }

    @Test
    public void parserSet() {
        assertNotNull(conn.request().parser());
    }

    @Test
    public void postDataCharsetValid() {
        conn.postDataCharset("UTF-8");
        assertEquals("UTF-8", conn.request().postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void postDataCharsetNull() {
        conn.postDataCharset(null);
    }

    @Test(expected = java.nio.charset.IllegalCharsetNameException.class)
    public void postDataCharsetInvalid() {
        conn.postDataCharset("invalid-charset");
    }

    @Test
    public void urlWithSpacesEncoded() throws Exception {
        conn.url("http://example.com/path with spaces");
        String expected = "http://example.com/path%20with%20spaces";
        assertEquals(expected, conn.request().url().toExternalForm());
    }

    @Test
    public void dataInputStream() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        conn.data("file", "name.txt", in);
        Connection.KeyVal kv = conn.data("file");
        assertNotNull(kv);
        assertTrue(kv.hasInputStream());
    }

    @Test
    public void dataInputStreamWithContentType() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        conn.data("file", "name.txt", in, "image/png");
        Connection.KeyVal kv = conn.data("file");
        assertNotNull(kv);
        assertTrue(kv.hasInputStream());
        assertEquals("image/png", kv.contentType());
    }

    @Test
    public void referrerSet() {
        conn.referrer("http://referrer.com");
        assertEquals("http://referrer.com", conn.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void referrerNull() {
        conn.referrer(null);
    }

    @Test
    public void ignoreHttpErrors() {
        assertFalse(conn.request().ignoreHttpErrors());
        conn.ignoreHttpErrors(true);
        assertTrue(conn.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentType() {
        assertFalse(conn.request().ignoreContentType());
        conn.ignoreContentType(true);
        assertTrue(conn.request().ignoreContentType());
    }

    @Test
    public void methodSet() {
        conn.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void followRedirects() {
        assertTrue(conn.request().followRedirects());
        conn.followRedirects(false);
        assertFalse(conn.request().followRedirects());
    }

    @Test
    public void sslSocketFactorySet() {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        conn.sslSocketFactory(factory);
        assertSame(factory, ((HttpConnection.Request) conn.request()).sslSocketFactory());
    }

    @Test
    public void sslSocketFactoryNull() {
        conn.sslSocketFactory(null);
        assertNull(((HttpConnection.Request) conn.request()).sslSocketFactory());
    }
}