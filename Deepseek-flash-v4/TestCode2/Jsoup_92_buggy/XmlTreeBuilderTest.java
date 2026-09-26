package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private final String baseUri = "http://example.com";

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings() {
        assertSame(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void testSimpleXml() {
        Document doc = builder.parse("<root><child attr=\"val\">text</child></root>", baseUri);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("val", child.attr("attr"));
        assertEquals("text", child.text());
    }

    @Test
    public void testSelfClosingTag() {
        Document doc = builder.parse("<br/><hr/>", baseUri);
        assertEquals(2, doc.children().size());
        assertTrue(doc.child(0).tag().isSelfClosing());
        assertTrue(doc.child(1).tag().isSelfClosing());
    }

    @Test
    public void testEndTagNotFound() {
        Document doc = builder.parse("<a><b></c></a>", baseUri);
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals(1, a.children().size());
        assertEquals("b", a.child(0).tagName());
    }

    @Test
    public void testNestedTags() {
        Document doc = builder.parse("<a><b><c></b></a>", baseUri);
        Element a = doc.child(0);
        assertEquals(1, a.children().size());
        assertEquals("b", a.child(0).tagName());
        assertEquals(1, a.child(0).children().size());
        assertEquals("c", a.child(0).child(0).tagName());
    }

    @Test
    public void testPlainComment() {
        Document doc = builder.parse("<!--hello-->", baseUri);
        Node child = doc.childNode(0);
        assertTrue(child instanceof Comment);
        assertEquals("hello", ((Comment) child).getData());
    }

    @Test
    public void testCommentAsXmlDeclaration() {
        Document doc = builder.parse("<?xml version='1.0'?>", baseUri);
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) first;
        assertEquals("1.0", decl.attr("version"));
    }

    @Test
    public void testCData() {
        Document doc = builder.parse("<root><![CDATA[hello world]]></root>", baseUri);
        Element root = doc.child(0);
        Node child = root.childNode(0);
        assertTrue(child instanceof CDataNode);
        assertEquals("hello world", ((CDataNode) child).getWholeText());
    }

    @Test
    public void testDoctype() {
        String dtd = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Document doc = builder.parse(dtd + "<html></html>", baseUri);
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
        DocumentType dt = (DocumentType) first;
        assertEquals("html", dt.name());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicId());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemId());
    }

    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        builder.parse((String) null, baseUri);
    }

    @Test
    public void testEmptyInput() {
        Document doc = builder.parse("", baseUri);
        assertTrue(doc.children().isEmpty());
    }

    @Test
    public void testParseFragment() {
        List<Node> nodes = builder.parseFragment("<foo>text</foo>", baseUri, new Parser(builder));
        assertEquals(1, nodes.size());
        Element foo = (Element) nodes.get(0);
        assertEquals("foo", foo.tagName());
        assertEquals("text", foo.text());
    }
}