package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

public class XmlDeclarationTest {

    private XmlDeclaration decl;
    private Attributes attrs;

    @Before
    public void setUp() {
        // Base instance without attributes manipulation
        decl = new XmlDeclaration("xml", "http://example.com", true);
        attrs = new Attributes();
    }

    @After
    public void tearDown() {
        decl = null;
        attrs = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        new XmlDeclaration(null, "http://example.com", false);
    }

    @Test
    public void testNodeName() {
        assertEquals("#declaration", decl.nodeName());
    }

    @Test
    public void testName() {
        assertEquals("xml", decl.name());
    }

    @Test
    public void testGetWholeDeclarationNonXmlName() {
        XmlDeclaration d = new XmlDeclaration("custom", "http://example.com", false);
        assertEquals("custom", d.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlNameNoAttributes() {
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlNameWithAttributesVersionEncoding() throws Exception {
        attrs.put("version", "1.0");
        attrs.put("encoding", "UTF-8");
        setAttributes(decl, attrs);
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlNameWithAttributesOtherKeys() throws Exception {
        attrs.put("other1", "value1");
        attrs.put("other2", "value2");
        setAttributes(decl, attrs);
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationXmlNameWithOnlyVersion() throws Exception {
        attrs.put("version", "1.0");
        setAttributes(decl, attrs);
        // size == 1 => condition fails => returns name
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testOuterHtmlHeadProcessingTrue() throws Exception {
        attrs.put("version", "1.0");
        attrs.put("encoding", "UTF-8");
        setAttributes(decl, attrs);
        StringBuilder accum = new StringBuilder();
        decl.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadProcessingFalse() throws Exception {
        XmlDeclaration d = new XmlDeclaration("custom", "http://example.com", false);
        StringBuilder accum = new StringBuilder();
        d.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!custom>", accum.toString());
    }

    @Test
    public void testToString() throws Exception {
        attrs.put("version", "1.0");
        attrs.put("encoding", "UTF-8");
        setAttributes(decl, attrs);
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", decl.toString());
    }

    // Helper to set protected 'attributes' field using reflection
    private void setAttributes(XmlDeclaration d, Attributes a) throws NoSuchFieldException, IllegalAccessException {
        Field field = Node.class.getDeclaredField("attributes");
        field.setAccessible(true);
        field.set(d, a);
    }
}