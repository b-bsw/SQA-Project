package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CleanerTest {

    private static class TestWhitelist extends Whitelist {
        @Override
        public boolean isSafeTag(String tag) {
            return "b".equals(tag) || "i".equals(tag) || "a".equals(tag) || "p".equals(tag);
        }

        @Override
        public boolean isSafeAttribute(String tagName, Element el, Attribute attr) {
            if ("a".equals(tagName) && "href".equals(attr.getKey())) {
                return true;
            }
            return false;
        }

        @Override
        public Attributes getEnforcedAttributes(String tagName) {
            if ("a".equals(tagName)) {
                Attributes enforced = new Attributes();
                enforced.put("rel", "nofollow");
                return enforced;
            }
            return new Attributes();
        }
    }

    private Whitelist whitelist;
    private String baseUri;

    @Before
    public void setUp() {
        whitelist = new TestWhitelist();
        baseUri = "http://example.com";
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullWhitelist() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cleanNullDocument() {
        Cleaner cleaner = new Cleaner(whitelist);
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidNullDocument() {
        Cleaner cleaner = new Cleaner(whitelist);
        cleaner.isValid(null);
    }

    @Test
    public void cleanEmptyDocumentReturnsEmptyBody() {
        Document dirty = Document.createShell(baseUri);
        // remove body children? Already empty.
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);
        Assert.assertNotNull(clean);
        Assert.assertEquals(0, clean.body().childNodes().size());
    }

    @Test
    public void cleanAllSafeTagsKeepsContent() {
        Document dirty = Document.createShell(baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        b.appendChild(new TextNode("bold", baseUri));
        dirty.body().appendChild(b);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals(1, clean.body().childNodes().size());
        Element cleanedB = (Element) clean.body().childNode(0);
        Assert.assertEquals("b", cleanedB.tagName());
        Assert.assertEquals("bold", cleanedB.text());
    }

    @Test
    public void cleanUnsafeTagDiscardsTagButKeepsText() {
        Document dirty = Document.createShell(baseUri);
        Element script = new Element(Tag.valueOf("script"), baseUri);
        script.appendChild(new TextNode("alert('xss')", baseUri));
        dirty.body().appendChild(script);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        // script tag unsafe, but text should be copied
        Assert.assertEquals(1, clean.body().childNodes().size());
        Node child = clean.body().childNode(0);
        Assert.assertTrue(child instanceof TextNode);
        Assert.assertEquals("alert('xss')", ((TextNode) child).getWholeText());
    }

    @Test
    public void cleanUnsafeTagWithSafeChildrenRecurses() {
        Document dirty = Document.createShell(baseUri);
        Element div = new Element(Tag.valueOf("div"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        b.appendChild(new TextNode("safe bold", baseUri));
        div.appendChild(b);
        dirty.body().appendChild(div);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        // div unsafe, discarded; b safe, should be placed directly in body
        Assert.assertEquals(1, clean.body().childNodes().size());
        Element cleanedB = (Element) clean.body().childNode(0);
        Assert.assertEquals("b", cleanedB.tagName());
        Assert.assertEquals("safe bold", cleanedB.text());
    }

    @Test
    public void cleanAllowedAttributePreserved() {
        Document dirty = Document.createShell(baseUri);
        Element a = new Element(Tag.valueOf("a"), baseUri);
        a.attr("href", "http://safe.com");
        a.appendChild(new TextNode("link", baseUri));
        dirty.body().appendChild(a);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Element cleanedA = (Element) clean.body().childNode(0);
        Assert.assertEquals("a", cleanedA.tagName());
        Assert.assertEquals("http://safe.com", cleanedA.attr("href"));
    }

    @Test
    public void cleanDisallowedAttributeDiscarded() {
        Document dirty = Document.createShell(baseUri);
        Element a = new Element(Tag.valueOf("a"), baseUri);
        a.attr("href", "http://safe.com");
        a.attr("onclick", "evil()");
        a.appendChild(new TextNode("link", baseUri));
        dirty.body().appendChild(a);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Element cleanedA = (Element) clean.body().childNode(0);
        Assert.assertEquals("href", cleanedA.attributes().get(0).getKey());
        Assert.assertEquals("http://safe.com", cleanedA.attr("href"));
        Assert.assertNull(cleanedA.attr("onclick")); // missing means empty string
    }

    @Test
    public void cleanEnforcedAttributesAdded() {
        Document dirty = Document.createShell(baseUri);
        Element a = new Element(Tag.valueOf("a"), baseUri);
        a.attr("href", "http://safe.com");
        dirty.body().appendChild(a);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Element cleanedA = (Element) clean.body().childNode(0);
        Assert.assertEquals("nofollow", cleanedA.attr("rel"));
    }

    @Test
    public void isValidTrueWhenAllSafe() {
        Document dirty = Document.createShell(baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        b.appendChild(new TextNode("text", baseUri));
        dirty.body().appendChild(b);

        Cleaner cleaner = new Cleaner(whitelist);
        Assert.assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidFalseWhenUnsafeTag() {
        Document dirty = Document.createShell(baseUri);
        Element script = new Element(Tag.valueOf("script"), baseUri);
        script.appendChild(new TextNode("xss", baseUri));
        dirty.body().appendChild(script);

        Cleaner cleaner = new Cleaner(whitelist);
        Assert.assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidFalseWhenUnsafeAttribute() {
        Document dirty = Document.createShell(baseUri);
        Element a = new Element(Tag.valueOf("a"), baseUri);
        a.attr("onclick", "evil()");
        a.appendChild(new TextNode("link", baseUri));
        dirty.body().appendChild(a);

        Cleaner cleaner = new Cleaner(whitelist);
        Assert.assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void cleanNestedSafeTags() {
        Document dirty = Document.createShell(baseUri);
        Element p = new Element(Tag.valueOf("p"), baseUri);
        Element i = new Element(Tag.valueOf("i"), baseUri);
        i.appendChild(new TextNode("italic", baseUri));
        p.appendChild(i);
        dirty.body().appendChild(p);

        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals(1, clean.body().childNodes().size());
        Element cleanedP = (Element) clean.body().childNode(0);
        Assert.assertEquals("p", cleanedP.tagName());
        Assert.assertEquals(1, cleanedP.childNodes().size());
        Element cleanedI = (Element) cleanedP.childNode(0);
        Assert.assertEquals("i", cleanedI.tagName());
        Assert.assertEquals("italic", cleanedI.text());
    }
}