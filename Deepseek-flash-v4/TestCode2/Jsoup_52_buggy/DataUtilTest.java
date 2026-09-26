package org.jsoup.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import static org.junit.Assert.*;

public class DataUtilTest {
    private File tempFile;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testGetCharsetFromContentType_Null() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_Valid() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_Invalid() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=Unsupported-Charset"));
    }

    @Test
    public void testGetCharsetFromContentType_NoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/plain"));
    }

    @Test
    public void testGetCharsetFromContentType_Quoted() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_NegativeMaxSize() throws IOException {
        DataUtil.readToByteBuffer(new ByteArrayInputStream("test".getBytes("UTF-8")), -1);
    }

    @Test
    public void testReadToByteBuffer_Uncapped() throws IOException {
        String content = "Hello, World!";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes("UTF-8"));
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(content, new String(buf.array(), "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_Capped_Exact() throws IOException {
        String content = "Exact size";
        byte[] bytes = content.getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, bytes.length);
        assertEquals(content, new String(buf.array(), "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_Capped_Exceed() throws IOException {
        String content = "Longer content";
        byte[] bytes = content.getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        int maxSize = 5;
        ByteBuffer buf = DataUtil.readToByteBuffer(in, maxSize);
        assertEquals(maxSize, buf.remaining());
        assertEquals(content.substring(0, maxSize), new String(buf.array(), 0, maxSize, "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_Empty() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(0, buf.remaining());
    }

    @Test
    public void testCrossStreams() throws IOException {
        String content = "Stream content";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes("UTF-8"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(content, out.toString("UTF-8"));
    }

    @Test
    public void testCrossStreams_Empty() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.size());
    }

    @Test
    public void testMimeBoundary_LengthAndCharacters() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(32, boundary.length());
        for (char c : boundary.toCharArray()) {
            assertTrue("Unexpected char: " + c,
                    "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_Different() {
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        assertFalse(b1.equals(b2));
        assertNotNull(b1);
        assertNotNull(b2);
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertEquals(0, buf.capacity());
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        tempFile = File.createTempFile("datautil", ".tmp");
        String content = "File content";
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(content.getBytes("UTF-8"));
        }
        ByteBuffer buf = DataUtil.readFileToByteBuffer(tempFile);
        assertEquals(content, new String(buf.array(), "UTF-8"));
    }

    @Test(expected = IOException.class)
    public void testReadFileToByteBuffer_NonExistent() throws IOException {
        File nonExistent = new File("nonexistent.tmp");
        DataUtil.readFileToByteBuffer(nonExistent);
    }

    private static final String HTML_SIMPLE = "<html><head><title>Test</title></head><body>Hello</body></html>";

    @Test
    public void testParseByteData_WithCharset() {
        ByteBuffer byteData = ByteBuffer.wrap(HTML_SIMPLE.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteData_NullCharset_NoMeta_BOM_UTF8() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = HTML_SIMPLE.getBytes(Charset.forName("UTF-8"));
        ByteBuffer byteData = ByteBuffer.allocate(bom.length + content.length);
        byteData.put(bom);
        byteData.put(content);
        byteData.flip();
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_NullCharset_MetaCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Test</title></head><body>Hello</body></html>";
        byte[] bytes = html.getBytes(Charset.forName("UTF-8"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteData_NullCharset_MetaHttpEquiv() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>Test</title></head><body>Hello</body></html>";
        byte[] bytes = html.getBytes(Charset.forName("UTF-8"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteData_NullCharset_XmlDeclaration() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>Hello</root>";
        byte[] bytes = xml.getBytes(Charset.forName("UTF-8"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("Hello", doc.text());
    }

    @Test
    public void testParseByteData_NullCharset_NoMeta_Default() {
        byte[] bytes = HTML_SIMPLE.getBytes(Charset.forName("UTF-8"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteData_NullCharset_BOM_UTF16_BE() {
        String content = "Hello";
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] contentBytes = content.getBytes(Charset.forName("UTF-16BE"));
        ByteBuffer byteData = ByteBuffer.allocate(bom.length + contentBytes.length);
        byteData.put(bom);
        byteData.put(contentBytes);
        byteData.flip();
        Document doc = DataUtil.parseByteData(byteData, null, "http://base", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_EmptyCharset() {
        ByteBuffer byteData = ByteBuffer.wrap("test".getBytes(Charset.forName("UTF-8")));
        DataUtil.parseByteData(byteData, "", "http://base", Parser.htmlParser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_InvalidCharset() {
        ByteBuffer byteData = ByteBuffer.wrap("test".getBytes(Charset.forName("UTF-8")));
        DataUtil.parseByteData(byteData, "invalid-charset", "http://base", Parser.htmlParser());
    }
}