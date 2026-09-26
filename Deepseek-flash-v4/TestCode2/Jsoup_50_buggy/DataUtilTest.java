package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DataUtilTest {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    @Test
    public void loadFileWithCharsetReturnsDocument() throws IOException {
        File temp = File.createTempFile("jsoup-test", ".html");
        temp.deleteOnExit();
        String html = "<html><head><title>File</title></head><body><p>Hello</p></body></html>";
        try (FileOutputStream out = new FileOutputStream(temp)) {
            out.write(html.getBytes(UTF_8));
        }
        Document doc = DataUtil.load(temp, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("File", doc.title());
        assertEquals("Hello", doc.select("p").text());
    }

    @Test(expected = IOException.class)
    public void loadMissingFileThrowsIOException() throws IOException {
        DataUtil.load(new File("no-such-file-" + System.nanoTime()), "UTF-8", "http://example.com/");
    }

    @Test
    public void loadStreamWithoutCharsetDetectsMeta() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>caf\u00e9</p></body></html>";
        byte[] bytes = html.getBytes(ISO_8859_1);
        Document doc = DataUtil.load(new ByteArrayInputStream(bytes), null, "http://example.com/");
        assertEquals("café", doc.select("p").text());
    }

    @Test
    public void loadStreamWithXmlParserParsesXml() throws IOException {
        String xml = "<root><item>value</item></root>";
        Document doc = DataUtil.load(new ByteArrayInputStream(xml.getBytes(UTF_8)), "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("value", doc.select("item").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void loadStreamWithEmptyCharsetThrows() throws IOException {
        DataUtil.load(new ByteArrayInputStream("<html></html>".getBytes(UTF_8)), "", "http://example.com/");
    }

    @Test
    public void parseByteDataWithoutMetaDefaultsToUtf8() {
        byte[] bytes = "<html><body><p>Hello</p></body></html>".getBytes(UTF_8);
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(bytes), null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.select("p").text());
    }

    @Test
    public void parseByteDataWithHttpEquivMetaUsesDeclaredCharset() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>caf\u00e9</p></body></html>";
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(html.getBytes(ISO_8859_1)), null, "http://example.com/", Parser.htmlParser());
        assertEquals("café", doc.select("p").text());
    }

    @Test
    public void parseByteDataWithMetaCharsetUsesDeclaredCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>caf\u00e9</p></body></html>";
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(html.getBytes(ISO_8859_1)), null, "http://example.com/", Parser.htmlParser());
        assertEquals("café", doc.select("p").text());
    }

    @Test
    public void parseByteDataWithIllegalMetaCharsetIgnoresIt() {
        String html = "<html><head><meta charset=\"bad charset\"></head><body><p>OK</p></body></html>";
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(html.getBytes(UTF_8)), null, "http://example.com/", Parser.htmlParser());
        assertEquals("OK", doc.select("p").text());
    }

    @Test
    public void parseByteDataStripsUtf8Bom() {
        byte[] body = "<html><body><p>BOM</p></body></html>".getBytes(UTF_8);
        ByteBuffer buffer = ByteBuffer.allocate(3 + body.length);
        buffer.put(new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF});
        buffer.put(body);
        buffer.flip();
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("BOM", doc.select("p").text());
    }

    @Test
    public void getCharsetFromNullReturnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentTypeWithoutCharsetReturnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharsetFromContentTypeFindsQuotedCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset = \"UTF-8\""));
    }

    @Test
    public void getCharsetFromContentTypeEmptyReturnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    @Test
    public void getCharsetFromContentTypeUnsupportedReturnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=NoSuchCharset"));
    }

    @Test
    public void readToByteBufferEmptyStream() throws IOException {
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, buffer.remaining());
        assertArrayEquals(new byte[0], buffer.array());
    }

    @Test
    public void readToByteBufferReadsAllUnlimited() throws IOException {
        byte[] data = "hello".getBytes(UTF_8);
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        assertArrayEquals(data, buffer.array());
    }

    @Test
    public void readToByteBufferWithMaxSizeWhenStreamSmaller() throws IOException {
        byte[] data = "hello".getBytes(UTF_8);
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 100);
        assertArrayEquals(data, buffer.array());
    }

    @Test
    public void readToByteBufferWithMaxSizeEqualReadsAll() throws IOException {
        byte[] data = "12345".getBytes(UTF_8);
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), data.length);
        assertArrayEquals(data, buffer.array());
    }

    @Test
    public void readToByteBufferWithMaxSizeCapsLargeStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("0123456789ABCDEFGHIJ".getBytes(UTF_8));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 10);
        assertArrayEquals("0123456789".getBytes(UTF_8), buffer.array());
    }

    @Test
    public void readToByteBufferHandlesMultipleChunks() throws IOException {
        byte[] big = new byte[300000];
        for (int i = 0; i < big.length; i++) {
            big[i] = (byte) (i % 127);
        }
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(big));
        assertArrayEquals(big, buffer.array());
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBufferNegativeMaxSizeThrows() throws IOException {
        DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), -1);
    }

    @Test
    public void crossStreamsCopiesBytes() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("stream data".getBytes(UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals("stream data", out.toString("UTF-8"));
    }

    @Test
    public void readFileToByteBufferReadsFileContent() throws IOException {
        File temp = File.createTempFile("jsoup-buffer", ".bin");
        temp.deleteOnExit();
        byte[] data = "file bytes".getBytes(UTF_8);
        try (FileOutputStream out = new FileOutputStream(temp)) {
            out.write(data);
        }
        assertArrayEquals(data, DataUtil.readFileToByteBuffer(temp).array());
    }

    @Test
    public void emptyByteBufferIsEmpty() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertEquals(0, buffer.capacity());
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void mimeBoundaryHasExpectedLengthAndChars() {
        String boundary = DataUtil.mimeBoundary();
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        assertEquals(32, boundary.length());
        for (int i = 0; i < boundary.length(); i++) {
            assertTrue(allowed.indexOf(boundary.charAt(i)) >= 0);
        }
    }
}