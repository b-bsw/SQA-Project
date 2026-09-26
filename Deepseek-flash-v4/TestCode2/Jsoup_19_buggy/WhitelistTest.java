package org.jsoup.safety;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WhitelistTest {
    private Whitelist wl;

    @Before
    public void setUp() {
        wl = new Whitelist();
    }

    @Test
    public void testStaticFactories() {
        Whitelist none = Whitelist.none();
        assertFalse(none.isSafeTag("p"));
        assertEquals(0, none.getEnforcedAttributes("a").size());

        Whitelist simple = Whitelist.simpleText();
        assertTrue(simple.isSafeTag("b"));
        assertFalse(simple.isSafeTag("a"));

        Whitelist basic = Whitelist.basic();
        assertTrue(basic.isSafeTag("a"));
        assertTrue(basic.isSafeTag("blockquote"));
        assertEquals("nofollow", basic.getEnforcedAttributes("a").get("rel"));
        Document doc = Jsoup.parse("<a href=\"http://example.com\">link</a>");
        Element el = doc.body().child(0);
        assertTrue(basic.isSafeAttribute("a", el, el.attribute("href")));

        Whitelist withImg = Whitelist.basicWithImages();
        assertTrue(withImg.isSafeTag("img"));

        Whitelist relaxed = Whitelist.relaxed();
        assertTrue(relaxed.isSafeTag("div"));
        assertTrue(relaxed.isSafeTag("table"));
        assertEquals(0, relaxed.getEnforcedAttributes("a").size());
    }

    @Test
    public void testAddTags() {
        wl.addTags("p", "div");
        assertTrue(wl.isSafeTag("p"));
        assertTrue(wl.isSafeTag("div"));
        assertFalse(wl.isSafeTag("span"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTagsNull() {
        wl.addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTagsEmpty() {
        wl.addTags("");
    }

    @Test
    public void testAddAttributes() {
        wl.addTags("a");
        wl.addAttributes("a", "href", "title");
        Document doc = Jsoup.parse("<a href=\"http://ex.com\" title=\"hello\">link</a>");
        Element el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("href")));
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("title")));
        assertFalse(wl.isSafeAttribute("a", el, new Attribute("class", "foo")));
    }

    @Test
    public void testAddAttributesToAllTag() {
        wl.addTags("p");
        wl.addAttributes(":all", "class");
        Document doc = Jsoup.parse("<p class=\"foo\">text</p>");
        Element el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("p", el, el.attribute("class")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributesNullKeys() {
        wl.addAttributes("a", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributesEmptyTag() {
        wl.addAttributes("", "href");
    }

    @Test
    public void testAddEnforcedAttribute() {
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", attrs.get("rel"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddEnforcedAttributeOverwrite() {
        wl.addEnforcedAttribute("a", "rel", "noopener");
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        assertEquals("nofollow", wl.getEnforcedAttributes("a").get("rel"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeEmptyKey() {
        wl.addEnforcedAttribute("a", "", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttributeEmptyValue() {
        wl.addEnforcedAttribute("a", "rel", "");
    }

    @Test
    public void testAddProtocols() {
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");
        Document doc = Jsoup.parse("<a href=\"http://valid.com\">link</a>");
        Element el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("href")));
        doc = Jsoup.parse("<a href=\"javascript:alert(1)\">link</a>");
        el = doc.body().child(0);
        assertFalse(wl.isSafeAttribute("a", el, el.attribute("href")));
        doc = Jsoup.parse("<a title=\"hello\">link</a>");
        el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("title")));
    }

    @Test
    public void testAddProtocolsDuplicate() {
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http");
        wl.addProtocols("a", "href", "https");
        Document doc = Jsoup.parse("<a href=\"https://secure.com\">link</a>");
        Element el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("href")));
    }

    @Test
    public void testPreserveRelativeLinks() {
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http");
        Document doc = Jsoup.parse("<a href=\"/path\">link</a>", "http://example.com");
        Element el = doc.body().child(0);
        Attribute attr = el.attribute("href");
        assertTrue(wl.isSafeAttribute("a", el, attr));
        assertEquals("http://example.com/path", attr.getValue());

        wl.preserveRelativeLinks(true);
        doc = Jsoup.parse("<a href=\"/path\">link</a>", "http://example.com");
        el = doc.body().child(0);
        attr = el.attribute("href");
        assertTrue(wl.isSafeAttribute("a", el, attr));
        assertEquals("/path", attr.getValue());
    }

    @Test
    public void testIsSafeTag() {
        wl.addTags("P", "div");
        assertTrue(wl.isSafeTag("P"));
        assertTrue(wl.isSafeTag("div"));
        assertFalse(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("span"));
    }

    @Test
    public void testIsSafeAttributeFallbackToAll() {
        wl.addTags("p");
        wl.addAttributes(":all", "class");
        Document doc = Jsoup.parse("<p class=\"foo\">text</p>");
        Element el = doc.body().child(0);
        assertTrue(wl.isSafeAttribute("p", el, el.attribute("class")));
        assertFalse(wl.isSafeAttribute("unknown", el, el.attribute("class")));
    }

    @Test
    public void testIsSafeAttributeNotAllowed() {
        wl.addTags("a");
        wl.addAttributes("a", "href");
        Document doc = Jsoup.parse("<a class=\"foo\" href=\"http://ex.com\">link</a>");
        Element el = doc.body().child(0);
        assertFalse(wl.isSafeAttribute("a", el, el.attribute("class")));
        assertTrue(wl.isSafeAttribute("a", el, el.attribute("href")));
    }

    @Test
    public void testGetEnforcedAttributes() {
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        wl.addEnforcedAttribute("img", "alt", "image");
        Attributes aAttrs = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", aAttrs.get("rel"));
        assertEquals(1, aAttrs.size());
        Attributes imgAttrs = wl.getEnforcedAttributes("img");
        assertEquals("image", imgAttrs.get("alt"));
        Attributes divAttrs = wl.getEnforcedAttributes("div");
        assertEquals(0, divAttrs.size());
    }
}