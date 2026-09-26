package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.select.Elements;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import static org.junit.Assert.*;

public class ElementTest {

    private static Element createDiv() {
        return new Element("div");
    }

    @Test
    public void testTagAndNodeName() {
        Element e = createDiv();
        assertEquals("div", e.nodeName());
        assertEquals("div", e.tagName());
        assertNotNull(e.tag());
        assertSame(e, e.tagName("span"));
        assertEquals("span", e.tagName());
    }

    @Test
    public void testIsBlock() {
        assertTrue(createDiv().isBlock());
        assertFalse(new Element("span").isBlock());
    }

    @Test
    public void testAttributesAndDataset() {
        Element e = createDiv();
        assertSame(e, e.attr("id", "myId"));
        assertEquals("myId", e.id());
        assertEquals("myId", e.attr("id"));

        e.attr("data-test", "value");
        e.attr("title", "t");
        Map<String, String> ds = e.dataset();
        assertEquals(1, ds.size());
        assertEquals("value", ds.get("test"));
    }

    @Test
    public void testAppendChildAndChildren() {
        Element root = createDiv();
        Element child = new Element("p");
        assertSame(root, root.appendChild(child));
        assertSame(child, root.child(0));
        assertEquals(1, root.children().size());
        assertSame(root, child.parent());
    }

    @Test
    public void testChildrenIgnoresTextNodes() {
        Element root = createDiv();
        root.appendText("text");
        assertEquals(0, root.children().size());
        assertEquals(1, root.textNodes().size());
        assertEquals("text", root.textNodes().get(0).getWholeText());
    }

    @Test
    public void testParents() {
        Element root = createDiv();
        Element mid = new Element("section");
        Element leaf = new Element("p");
        root.appendChild(mid);
        mid.appendChild(leaf);

        assertEquals(0, createDiv().parents().size());
        assertEquals(2, leaf.parents().size());
        assertEquals("section", leaf.parents().get(0).tagName());
        assertEquals("div", leaf.parents().get(1).tagName());
    }

    @Test
    public void testSiblingMethods() {
        Element root = createDiv();
        Element a = new Element("p");
        Element b = new Element("p");
        root.appendChild(a);
        root.appendChild(b);

        assertSame(b, a.nextElementSibling());
        assertNull(b.nextElementSibling());
        assertNull(a.previousElementSibling());
        assertSame(a, b.previousElementSibling());

        assertEquals(0, a.elementSiblingIndex());
        assertEquals(1, b.elementSiblingIndex());
        assertEquals(1, a.siblingElements().size());
        assertSame(b, a.siblingElements().get(0));
        assertSame(a, b.firstElementSibling());
        assertSame(b, a.lastElementSibling());
    }

    @Test
    public void testOnlyChildSiblingMethods() {
        Element root = createDiv();
        Element only = new Element("span");
        root.appendChild(only);

        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
        assertNull(only.nextElementSibling());
        assertNull(only.previousElementSibling());
        assertEquals(0, only.elementSiblingIndex());
    }

    @Test
    public void testNoParentSiblingBehavior() {
        Element e = createDiv();
        assertEquals(0, e.siblingElements().size());
        assertEquals(0, e.elementSiblingIndex());
        assertNull(e.nextElementSibling());
        assertNull(e.previousElementSibling());
    }

    @Test
    public void testInsertChildrenAtBeginning() {
        Element e = createDiv();
        Element a = new Element("a");
        Element b = new Element("b");
        Element c = new Element("c");
        e.appendChild(a);
        e.appendChild(b);

        assertSame(e, e.insertChildren(0, Arrays.<Node>asList(c)));
        assertEquals("c", e.child(0).tagName());
        assertEquals("a", e.child(1).tagName());
        assertEquals("b", e.child(2).tagName());
    }

    @Test
    public void testInsertChildrenNegativeIndex() {
        Element e = createDiv();
        e.appendChild(new Element("a"));
        e.appendChild(new Element("b"));
        Element c = new Element("c");

        e.insertChildren(-1, Arrays.<Node>asList(c));
        assertEquals("c", e.child(2).tagName());
        assertEquals("b", e.child(1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        createDiv().insertChildren(3, Arrays.<Node>asList(new Element("span")));
    }

    @Test
    public void testAppendPrependElementAndText() {
        Element e = createDiv();
        Element span = e.appendElement("span");
        e.prependElement("b");

        assertEquals("b", e.child(0).tagName());
        assertSame(span, e.child(1));

        Element t = createDiv();
        t.appendText("world");
        t.prependText("Hello ");
        assertEquals("Hello world", t.text());
        assertEquals(2, t.textNodes().size());
    }

    @Test
    public void testTextSetterAndEmpty() {
        Element e = createDiv();
        e.appendText("old");
        e.appendElement("span");
        e.text("new");

        assertEquals("new", e.text());
        assertEquals(0, e.children().size());
        assertEquals(1, e.textNodes().size());

        e.appendChild(new Element("i"));
        assertSame(e, e.empty());
        assertEquals(0, e.children().size());
        assertEquals("", e.text());
    }

    @Test
    public void testOwnText() {
        Element e = createDiv();
        e.appendText("  own  ");
        Element child = new Element("span");
        child.appendText("child");
        e.appendChild(child);
        assertEquals("own", e.ownText());
    }

    @Test
    public void testTextBlockSeparator() {
        Element e = createDiv();
        e.appendText("Hello");
        Element p = new Element("p");
        p.appendText("World");
        e.appendChild(p);
        assertEquals("Hello World", e.text());
    }

    @Test
    public void testOwnTextBr() {
        Element e = createDiv();
        e.appendText("left");
        e.appendChild(new Element("br"));
        e.appendText("right");
        assertEquals("left right", e.ownText());
    }

    @Test
    public void testHasText() {
        Element blank = createDiv();
        blank.appendText("  ");
        assertFalse(blank.hasText());
        blank.appendText("x");
        assertTrue(blank.hasText());

        Element e = createDiv();
        Element child = new Element("span");
        e.appendChild(child);
        assertFalse(e.hasText());
        child.appendText("x");
        assertTrue(e.hasText());
    }

    @Test
    public void testVal() {
        Element input = new Element("input");
        input.attr("value", "v");
        assertEquals("v", input.val());
        assertSame(input, input.val("w"));
        assertEquals("w", input.val());

        Element textarea = new Element("textarea");
        assertSame(textarea, textarea.val("hello"));
        assertEquals("hello", textarea.val());
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testClassNamesAndHasClass() {
        Element e = createDiv();
        e.attr("class", " a  b a ");
        Set<String> names = e.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));

        assertTrue(e.hasClass("a"));
        assertTrue(e.hasClass("b"));
        assertFalse(e.hasClass("c"));

        e.attr("class", "ab");
        assertFalse(e.hasClass("abc"));

        e.attr("class", "foobar");
        assertFalse(e.hasClass("foo"));

        e.attr("class", "Foo");
        assertTrue(e.hasClass("foo"));
    }

    @Test
    public void testModifyClass() {
        Element e = createDiv();
        assertSame(e, e.addClass("x"));
        assertTrue(e.hasClass("x"));
        e.addClass("x");
        assertEquals(1, e.classNames().size());

        e.removeClass("x");
        assertFalse(e.hasClass("x"));

        e.toggleClass("y");
        assertTrue(e.hasClass("y"));
        e.toggleClass("y");
        assertFalse(e.hasClass("y"));
    }

    @Test
    public void testData() {
        Element e = createDiv();
        e.appendChild(new DataNode("data", ""));
        e.appendChild(new Comment("comment", ""));

        assertEquals("datacomment", e.data());
        assertEquals(1, e.dataNodes().size());
        assertEquals("data", e.dataNodes().get(0).getWholeData());
    }

    @Test
    public void testGetByTagIdClass() {
        Element root = createDiv();
        Element p = new Element("p");
        p.attr("id", "x");
        p.addClass("foo");
        root.appendChild(p);

        assertSame(p, root.getElementsByTag("p").get(0));
        assertSame(p, root.getElementById("x"));
        assertNull(root.getElementById("none"));
        assertSame(p, root.getElementsByClass("foo").get(0));
    }

    @Test
    public void testGetByAttributeVariants() {
        Element root = createDiv();
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        a.attr("target", "_blank");
        root.appendChild(a);

        Element b = new Element("a");
        b.attr("href", "https://test.org");
        root.appendChild(b);

        assertEquals(1, root.getElementsByAttribute("target").size());
        assertEquals(2, root.getElementsByAttributeStarting("hre").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://example.com").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "http").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", ".org").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "test").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", Pattern.compile("test")).size());
    }

    @Test
    public void testIndexFilters() {
        Element root = createDiv();
        root.appendChild(new Element("p"));
        root.appendChild(new Element("p"));
        root.appendChild(new Element("p"));

        assertEquals(2, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());
    }

    @Test
    public void testTextSearchContains() {
        Element root = createDiv();
        Element p1 = new Element("p");
        p1.appendText("Hello world");
        root.appendChild(p1);

        Element p2 = new Element("p");
        p2.appendText("Goodbye");
        root.appendChild(p2);

        assertTrue(root.getElementsContainingText("ello").contains(p1));
        assertTrue(root.getElementsContainingOwnText("Good").contains(p2));
        assertTrue(root.getElementsMatchingText(Pattern.compile("Hello world")).contains(p1));
    }

    @Test
    public void testSelectAndIs() {
        Element root = createDiv();
        Element p = new Element("p");
        p.attr("id", "foo");
        root.appendChild(p);

        assertEquals(1, root.select("#foo").size());
        assertTrue(root.is("div"));
        assertFalse(root.is("span"));
    }

    @Test
    public void testCssSelector() {
        Element root = createDiv();
        Element p1 = new Element("p");
        Element p2 = new Element("p");
        root.appendChild(p1);
        root.appendChild(p2);

        assertEquals("div > p:nth-child(1)", p1.cssSelector());
        assertEquals("div > p:nth-child(2)", p2.cssSelector());

        Element id = new Element("span");
        id.attr("id", "x");
        assertEquals("#x", id.cssSelector());
    }

    @Test
    public void testAppendHtmlAndHtmlSetter() {
        Element e = createDiv();
        e.append("<b>bold</b>");
        e.prepend("<i>italic</i>");

        assertEquals(2, e.children().size());
        assertEquals("i", e.child(0).tagName());
        assertEquals("b", e.child(1).tagName());

        e.html("<u>under</u>");
        assertEquals(1, e.getElementsByTag("u").size());
        assertTrue(e.html().contains("<u>"));
    }

    @Test
    public void testToString() {
        Element e = createDiv();
        e.attr("id", "x");
        assertEquals("<div id=\"x\"></div>", e.toString());
    }

    @Test
    public void testBeforeAndAfter() {
        Element parent = createDiv();
        Element p = new Element("p");
        parent.appendChild(p);

        p.before(new Element("em"));
        assertEquals("em", parent.child(0).tagName());

        p.after("<strong>x</strong>");
        assertEquals("strong", parent.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullChildThrows() {
        createDiv().appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyTagNameThrows() {
        createDiv().tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyTagSearchThrows() {
        createDiv().getElementsByTag("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullTextThrows() {
        createDiv().text(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexThrows() {
        createDiv().getElementsByAttributeValueMatching("href", "(");
    }
}