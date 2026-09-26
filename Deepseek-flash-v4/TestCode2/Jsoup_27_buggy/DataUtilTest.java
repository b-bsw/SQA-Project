ตามคำสั่งpackage org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class DataUtilTest {

    // ----- getCharsetFromContentType -----
    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeMatch() {
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset=EUC-JP"));
    }

    // ----- readToByteBuffer -----
    @Test
    public void testReadToByteBufferEmpty() throws IOException {
        ByteBuffer bb = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, bb.capacity());
        assertEquals(0, bb.remaining());
    }

    @Test
    public void testReadToByteBufferNormal() throws IOException {
        byte[] data = "hello".getBytes("UTF-8");
        ByteBuffer bb = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        assertEquals(5, bb.remaining());
        byte[] out = new byte[5];
        bb.get(out);
        assertArrayEquals(data, out);
    }

    @Test(expected = IOException.class)
    public void testReadToByteBufferThrowsIOException() throws IOException {
        DataUtil.readToByteBuffer(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("boom");
            }
        });
    }

    // ----- parseByteData -----
    @Test
    public void testParseByteDataNullCharsetNoMeta() {
        String html = "<html><head></head><body>Hello</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteDataNullCharsetWithMetaDifferentCharset() {
        String meta = "<html><head><meta charset=\"ISO-8859-1\"></head><body>";
        String content = "é";
        String end = "</body></html>";
        String html = meta + content + end;
        byte[] bytes = html.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("é", doc.body().text());
    }

    @Test
    public void testParseByteDataWithCharset() {
        String html = "<html><body>Hello</body></html>";
        byte[] bytes = html.getBytes(Charset.forName("UTF-8"));
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataWithEmptyCharset() {
        ByteBuffer bb = ByteBuffer.wrap("dummy".getBytes());
        DataUtil.parseByteData(bb, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteDataBomStripped() {
        String htmlWithBom = "\uFEFF<html><body>Hello</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(htmlWithBom.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    // ----- load (InputStream) -----
    @Test
    public void testLoadInputStreamDefaultParser() throws IOException {
        String html = "<html><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testLoadInputStreamCustomParser() throws IOException {
        String xml = "<root><item>val</item></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("val", doc.select("item").text());
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamIOException() throws IOException {
        DataUtil.load(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("test exception");
            }
        }, "UTF-8", "http://example.com");
    }

    // ----- load (File) -----
    @Test
    public void testLoadFile() throws IOException {
        File temp = File.createTempFile("test", ".html");
        try {
            try (FileOutputStream fos = new FileOutputStream(temp)) {
                fos.write("<html><body>File Test</body></html>".getBytes("UTF-8"));
            }
            Document doc = DataUtil.load(temp, "UTF-8", "http://example.com");
            assertNotNull(doc);
            assertEquals("File Test", doc.body().text());
        } finally {
            temp.delete();
        }
    }
}