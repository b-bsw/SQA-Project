package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParseSimpleHtml() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseBodyFragment() {
        String bodyHtml = "<p>Fragment</p>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals("Fragment", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtml() {
        Parser.parse(null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUri() {
        Parser.parse("<html></html>", null);
    }

    @Test
    public void testParseEmptyHtml() {
        Document doc = Parser.parse("", "http://example.com");
        assertNotNull(doc);
        assertEquals("", doc.head().text());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParseComment() {
        String html = "<html><body><!-- comment --><p>Text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Text", doc.body().text());
        assertEquals(2, doc.body().childNodeSize());
    }

    @Test
    public void testParseCdata() {
        String html = "<html><body><![CDATA[ raw text ]]></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals(" raw text ", doc.body().text());
    }

    @Test
    public void testParseSelfClosingTag() {
        String html = "<html><body><br/><p>Text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        assertEquals("Text", doc.body().text());
        Element br = doc.body().child(0);
        assertEquals("br", br.tagName());
        assertTrue(br.tag().isEmpty());
    }

    @Test
    public void testParseDataTag() {
        String html = "<html><body><textarea>some text</textarea></body></html>";
        Document doc = Parser.parse(html, "http://example.com");
        assertNotNull(doc);
        Element textarea = doc.body().child(0);
        assertEquals("textarea", textarea.tagName());
        assertEquals("some text", textarea.text());
    }

    @Test
    public void testParseBaseTag() {
        String html = "<html><head><base href='http://newbase.com/'></head><body><img src='image.png'/></body></html>";
        Document doc = Parser.parse(html, "http://original.com/");
        assertNotNull(doc);
        Element img = doc.body().child(0);
        String absUrl = img.absUrl("src");
        assertEquals("http://newbase.com/image.png", absUrl);
    }

    @Test
    public void testParseNestedTags() {
        String html = "<div><p><span>Text</span></p></div>";
        Document doc = Parser.parse(html, "http://example.com");
        Element div = doc.body().child(0);
        assertEquals("div", div.tagName());
        Element p = div.child(0);
        assertEquals("p", p.tagName());
        Element span = p.child(0);
        assertEquals("span", span.tagName());
        assertEquals("Text", span.text());
    }

    @Test
    public void testParseWithExtraClosingTag() {
        String html = "<div><p>Text</p></div></extra>";
        Document doc = Parser.parse(html, "http://example.com");
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testParseImplicitParent() {
        String html = "<td>Data</td>";
        Document doc = Parser.parse(html, "http://example.com");
        Element td = doc.body().child(0);
        assertEquals("td", td.tagName());
        Element tr = td.parent();
        assertEquals("tr", tr.tagName());
        Element table = tr.parent();
        assertEquals("table", table.tagName());
    }

    @Test
    public void testParsePopStackToSuitableContainer() {
        String html = "<body><p>Text<div>More</div></p></body>";
        Document doc = Parser.parse(html, "http://example.com");
        Element p = doc.body().child(0);
        assertEquals("p", p.tagName());
        Element div = doc.body().child(1);
        assertEquals("div", div.tagName());
    }

    @Test
    public void testParseAttributes() {
        String html = "<p id='main' class=\"content\" title=hello>Text</p>";
        Document doc = Parser.parse(html, "http://example.com");
        Element p = doc.body().child(0);
        assertEquals("main", p.id());
        assertTrue(p.hasClass("content"));
        assertEquals("hello", p.attr("title"));
    }
}