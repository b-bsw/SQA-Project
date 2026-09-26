package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.UncheckedIOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DataUtilTest {

    private static final String SIMPLE_HTML = "<html><head><meta charset='UTF-8'></head><body>Hello</body></html>";
    private static final String SIMPLE_XML = "<?xml version='1.0' encoding='ISO-8859-1'?><root>data</root>";

    @Before
    public void setUp() {
        // No common setup needed for these static tests.
    }

    @After
    public void tearDown() {
        // No teardown required.
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentTypeInvalid() {
        // Invalid charset name should return null
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=INVALID-CHARSET"));
    }

    @Test
    public void testGetCharsetFromContentTypeEmpty() {
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void testMimeBoundaryLength() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void testMimeBoundaryChars() {
        String boundary = DataUtil.mimeBoundary();
        for (char c : boundary.toCharArray()) {
            assertTrue("Unexpected character in boundary: " + c,
                       "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) >= 0);
        }
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.capacity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferNegativeMaxSize() throws IOException {
        DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), -1);
    }

    @Test
    public void testReadToByteBufferMaxSizeZero() throws IOException {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 0);
        assertNotNull(buf);
        assertEquals(data.length, buf.capacity());
        assertEquals("Hello, World!", new String(buf.array(), StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBufferMaxSizePositive() throws IOException {
        byte[] data = "Hello".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 3);
        assertNotNull(buf);
        assertEquals(3, buf.capacity());
        assertEquals("Hel", new String(buf.array(), StandardCharsets.UTF_8));
    }

    @Test
    public void testCrossStreams() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream in = new ByteArrayInputStream("test data".getBytes(StandardCharsets.UTF_8));
        DataUtil.crossStreams(in, out);
        assertEquals("test data", out.toString("UTF-8"));
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File temp = File.createTempFile("testReadFileToByteBuffer", ".tmp");
        temp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(temp)) {
            fos.write("file content".getBytes(StandardCharsets.UTF_8));
        }
        ByteBuffer buf = DataUtil.readFileToByteBuffer(temp);
        assertNotNull(buf);
        assertEquals("file content", new String(buf.array(), StandardCharsets.UTF_8));
    }

    @Test
    public void testParseInputStreamNull() throws IOException {
        Document doc = DataUtil.parseInputStream(null, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals(0, doc.children().size());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testParseInputStreamWithCharsetInHtml() throws IOException {
        InputStream in = new ByteArrayInputStream(SIMPLE_HTML.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseInputStreamWithBomUtf8() throws IOException {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><body>BOM</body></html>".getBytes(StandardCharsets.UTF_8);
        ByteBuffer bb = ByteBuffer.allocate(bom.length + content.length);
        bb.put(bom);
        bb.put(content);
        InputStream in = new ByteArrayInputStream(bb.array());
        Document doc = DataUtil.parseInputStream(in, null, "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM", doc.body().text());
    }

    @Test
    public void testParseInputStreamWithCharsetSpecified() throws IOException {
        // Specify charset explicitly, should override meta
        String html = "<html><head><meta charset='UTF-8'></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStreamWithXmlDeclaration() throws IOException {
        InputStream in = new ByteArrayInputStream(SIMPLE_XML.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseInputStream(in, null, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("data", doc.text().trim());
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamThrows() throws IOException {
        // Use a broken InputStream that throws on read
        InputStream broken = new InputStream() {
            private boolean closed;
            @Override
            public int read() throws IOException {
                if (closed) throw new IOException("already closed");
                throw new IOException("read error");
            }
            @Override
            public void close() {
                closed = true;
            }
        };
        DataUtil.load(broken, null, "http://example.com");
    }

    @Test
    public void testLoadFileWithDefaultCharset() throws IOException {
        File temp = File.createTempFile("testLoadFile", ".html");
        temp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(temp)) {
            fos.write(SIMPLE_HTML.getBytes(StandardCharsets.UTF_8));
        }
        Document doc = DataUtil.load(temp, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }
}