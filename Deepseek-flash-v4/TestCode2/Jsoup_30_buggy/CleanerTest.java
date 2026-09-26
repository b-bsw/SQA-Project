package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    private Whitelist whitelist;
    private Cleaner cleaner;

    @Before
    public void setUp() {
        whitelist = new Whitelist();
        cleaner = new Cleaner(whitelist);
    }

    @After
    public void tearDown() {
        whitelist = null;
        cleaner = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsNullWhitelist() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cleanRejectsNullDocument() {
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidRejectsNullDocument() {
        cleaner.isValid(null);
    }

    @Test
    public void cleanCopiesSafeElementsTextAndAllowedAttributes() {
        whitelist.addTags("p", "b");
        whitelist.addAttributes("p", "id");
        whitelist.addAttributes("b", "class");

        Document clean = cleaner.clean(Jsoup.parse(
                "<html><body><p id='keep' class='drop' onclick='bad()'>Hello <b class='bold'>world</b></p></body></html>"));

        Element body = clean.body();
        assertEquals(1, body.children().size());
        Element p = body.children().get(0);
        assertEquals("p", p.tagName());
        assertEquals("keep", p.attr("id"));
        assertFalse(p.hasAttr("class"));
        assertFalse(p.hasAttr("onclick"));
        assertEquals("Hello world", p.text());
        assertEquals(1, p.children().size());
        assertEquals("b", p.children().get(0).tagName());
        assertEquals("bold", p.children().get(0).attr("class"));
        assertEquals("world", p.children().get(0).text());
        assertEquals("Hello ", ((TextNode) p.childNodes().get(0)).getWholeText());
    }

    @Test
    public void cleanRemovesUnsafeTagsButKeepsTheirTextChildren() {
        whitelist.addTags("span");

        Document clean = cleaner.clean(Jsoup.parse(
                "<html><body><div>keep <span>me</span></div><script>bad()</script></body></html>"));

        Element body = clean.body();
        String html = body.html();
        assertFalse(html.contains("<div"));
        assertFalse(html.contains("<script"));
        assertTrue(html.contains("keep"));
        assertTrue(html.contains("<span>me</span>"));
        assertTrue(html.contains("bad()"));
    }

    @Test
    public void cleanCopiesTextNodesBeforeCheckingWhitelist() {
        Document clean = cleaner.clean(Jsoup.parse("<html><body>Hello plain text</body></html>"));

        assertEquals(1, clean.body().childNodes().size());
        assertEquals("Hello plain text", ((TextNode) clean.body().childNodes().get(0)).getWholeText());
    }

    @Test
    public void cleanWithEmptyBodyKeepsDocumentShellAndEmptyBody() {
        Document clean = cleaner.clean(Jsoup.parse("<html><head><title>x</title></head><body></body></html>"));

        assertNotNull(clean.body());
        assertEquals(0, clean.body().children().size());
        assertEquals(0, clean.body().childNodes().size());
        assertTrue(clean.body().html().isEmpty());
    }

    @Test
    public void cleanPreservesBaseUri() {
        whitelist.addTags("p");
        Document clean = cleaner.clean(Jsoup.parse("<p>Hi</p>", "http://example.com/base"));
        assertEquals("http://example.com/base", clean.baseUri());
    }

    @Test
    public void cleanAddsEnforcedAttributes() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "title");
        whitelist.addEnforcedAttribute("a", "rel", "nofollow");

        Document clean = cleaner.clean(Jsoup.parse("<a title='link'>link</a>"));
        Element a = clean.body().children().get(0);
        assertEquals("link", a.attr("title"));
        assertEquals("nofollow", a.attr("rel"));
    }

    @Test
    public void isValidReturnsTrueForOnlySafeElementsAndAttributes() {
        whitelist.addTags("p");
        whitelist.addAttributes("p", "id");

        Document dirty = Jsoup.parse("<p id='a'>ok</p>");
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseWhenUnsafeTagPresent() {
        whitelist.addTags("p");

        Document dirty = Jsoup.parse("<p>ok</p><script>bad()</script>");
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseWhenUnsafeAttributePresent() {
        whitelist.addTags("p");
        whitelist.addAttributes("p", "id");

        Document dirty = Jsoup.parse("<p id='a' onclick='bad()'>ok</p>");
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsTrueForEmptyBody() {
        whitelist.addTags("p");

        Document dirty = Jsoup.parse("<html><body></body></html>");
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void cleanDoesNotModifyOriginalDocument() {
        Document dirty = Jsoup.parse("<script>bad()</script><p>ok</p>");
        cleaner.clean(dirty);

        assertEquals(2, dirty.body().children().size());
        assertFalse(dirty.body().html().isEmpty());
    }

    @Test
    public void cleanDocumentWithoutBodyYieldsEmptyCleanBody() {
        Document dirty = new Document("http://example.com");
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean.body());
        assertEquals(0, clean.body().children().size());
    }
}