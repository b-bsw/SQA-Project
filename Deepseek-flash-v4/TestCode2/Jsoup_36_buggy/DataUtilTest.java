package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class DataUtilTest {

    @Test
    public void testGetCharsetFromContentType_Null() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_NoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_Valid() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_UnsupportedReturnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=FAKE"));
    }

    @Test
    public void testGetCharsetFromContentType_UpperCase() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
    }

    @Test
    public void testReadToByteBuffer_EmptyStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(0, buf.capacity());
    }

    @Test
    public void testReadToByteBuffer_SmallStream() throws IOException {
        byte[] data = "hello".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(data.length, buf.capacity());
        assertEquals("hello", new String(buf.array()));
    }

    @Test
    public void testReadToByteBuffer_CappedExact() throws IOException {
        byte[] data = "12345".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buf.capacity());
        assertEquals("12345", new String(buf.array()));
    }

    @Test
    public void testReadToByteBuffer_CappedLess() throws IOException {
        byte[] data = "hello".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, 10);
        assertEquals(5, buf.capacity());
    }

    @Test
    public void testReadToByteBuffer_CappedMore() throws IOException {
        byte[] data = "hello world".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buf.capacity());
        assertEquals("hello", new String(buf.array()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_NegativeMaxSize() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testParseByteData_NullCharsetNoMeta() {
        String html = "<html><head><title>Test</title></head><body><p>Content</p></body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Content", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_NullCharsetWithMeta() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Test</title></head><body><p>Content</p></body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_NonNullCharset() {
        String html = "<html><head><title>Test</title></head><body></body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.parseByteData(data, "ISO-8859-1", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_WithBOM() {
        String bom = "\uFEFF";
        String html = bom + "<html><head><title>BOM</title></head><body></body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_EmptyCharset() {
        ByteBuffer data = ByteBuffer.wrap("test".getBytes());
        DataUtil.parseByteData(data, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testLoad_InputStreamBasic() throws IOException {
        String html = "<html><head><title>LoadTest</title></head><body><p>Hello</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("LoadTest", doc.title());
    }

    @Test
    public void testLoad_InputStreamWithXmlParser() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><item>value</item></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.tagName());
    }
}