package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.util.Set;
import java.util.Map;

public class ElementTest {
    private Element root;
    private Element child;
    private static final String BASE_URI = "http://base";

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("div"), BASE_URI);
        child = new Element(Tag.valueOf("p"), BASE_URI);
        root.appendChild(child);
    }

    @Test
    public void testConstructorWithAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("class", "test");
        Element el = new Element(Tag.valueOf("div"), BASE_URI, attrs);
        assertEquals("test", el.className());
    }

    @Test
    public void testIdWithAttr() {
        root.attr("id", "myId");
        assertEquals("myId", root.id());
    }

    @Test
    public void testIdWithoutAttr() {
        assertEquals("", root.id());
    }

    @Test
    public void testTagNameSetter() {
        Element result = root.tagName("span");
        assertSame(root, result);
        assertEquals("span", root.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetterEmpty() {
        root.tagName("");
    }

    @Test
    public void testParent() {
        assertSame(root, child.parent());
        assertNull(root.parent());
    }

    @Test
    public void testParents() {
        Elements parents = child.parents();
        assertTrue(parents.contains(root));
        assertFalse(root.parents().contains(child));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        root.child(0);
    }

    @Test
    public void testChildNormal() {
        assertEquals(child, root.child(0));
    }

    @Test
    public void testChildrenOnlyElements() {
        root.appendChild(new TextNode("text", BASE_URI));
        Elements children = root.children();
        assertEquals(1, children.size());
        assertTrue(children.contains(child));
    }

    @Test
    public void testTextNodes() {
        root.appendChild(new TextNode("t1", BASE_URI));
        root.appendChild(new TextNode("t2", BASE_URI));
        assertEquals(2, root.textNodes().size());
    }

    @Test
    public void testDataNodes() {
        DataNode dn = new DataNode("data", BASE_URI);
        root.appendChild(dn);
        assertEquals(1, root.dataNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        root.appendChild(null);
    }

    @Test
    public void testAppendElementReturnValue() {
        Element newChild = root.appendElement("span");
        assertNotNull(newChild);
        assertEquals("span", newChild.tagName());
        assertEquals(2, root.children().size());
    }

    @Test
    public void testPrependElement() {
        Element newChild = root.prependElement("span");
        assertSame(newChild, root.child(0));
    }

    @Test
    public void testAppendText() {
        root.appendText("Hello");
        assertEquals("Hello", root.text().trim());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        root.append((String) null);
    }

    @Test
    public void testAppendHtml() {
        root.append("<span>inner</span>");
        assertEquals(2, root.children().size());
    }

    @Test
    public void testPrependHtml() {
        root.prepend("<b>bold</b>");
        assertEquals(2, root.children().size());
        assertEquals("b", root.child(0).tagName());
    }

    @Test
    public void testEmpty() {
        Element result = root.empty();
        assertEquals(0, root.children().size());
        assertSame(root, result);
    }

    @Test
    public void testCssSelectorWithId() {
        root.attr("id", "main");
        assertEquals("#main", root.cssSelector());
    }

    @Test
    public void testCssSelectorWithClass() {
        root.attr("class", "foo bar");
        String sel = root.cssSelector();
        assertTrue(sel.contains("div"));
        assertTrue(sel.contains("foo"));
        assertTrue(sel.contains("bar"));
    }

    @Test
    public void testSiblingElements() {
        Element sibling = new Element(Tag.valueOf("p"), BASE_URI);
        root.appendChild(sibling);
        Elements siblings = child.siblingElements();
        assertEquals(1, siblings.size());
        assertTrue(siblings.contains(sibling));
    }

    @Test
    public void testNextElementSibling() {
        Element sibling = new Element(Tag.valueOf("p"), BASE_URI);
        root.appendChild(sibling);
        assertSame(sibling, child.nextElementSibling());
        assertNull(sibling.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element sibling = new Element(Tag.valueOf("p"), BASE_URI);
        root.appendChild(sibling);
        assertSame(child, sibling.previousElementSibling());
        assertNull(child.previousElementSibling());
    }

    @Test
    public void testFirstAndLastElementSibling() {
        Element middle = new Element(Tag.valueOf("p"), BASE_URI);
        Element last = new Element(Tag.valueOf("p"), BASE_URI);
        root.appendChild(middle);
        root.appendChild(last);
        assertSame(child, child.firstElementSibling());
        assertSame(last, child.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndexNoParent() {
        Element orphan = new Element(Tag.valueOf("div"), BASE_URI);
        assertEquals(0, (int) orphan.elementSiblingIndex());
    }

    @Test
    public void testGetElementById() {
        Element target = new Element(Tag.valueOf("p"), BASE_URI);
        target.attr("id", "target");
        root.appendChild(target);
        Element found = root.getElementById("target");
        assertSame(target, found);
    }

    @Test
    public void testGetElementByIdNotFound() {
        assertNull(root.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyId() {
        root.getElementById("");
    }

    @Test
    public void testGetElementsByTag() {
        root.appendChild(new Element(Tag.valueOf("p"), BASE_URI));
        Elements els = root.getElementsByTag("p");
        assertEquals(1, els.size());
    }

    @Test
    public void testGetElementsByClass() {
        Element el = new Element(Tag.valueOf("p"), BASE_URI);
        el.attr("class", "highlight");
        root.appendChild(el);
        Elements els = root.getElementsByClass("highlight");
        assertEquals(1, els.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingInvalidRegex() {
        try {
            root.getElementsByAttributeValueMatching("data-value", "[invalid");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Pattern syntax error"));
        }
    }

    @Test
    public void testTextSimple() {
        root.empty();
        root.appendChild(new TextNode(" Hello World ", BASE_URI));
        assertEquals("Hello World", root.text());
    }

    @Test
    public void testTextWithBr() {
        root.empty();
        root.appendChild(new Element(Tag.valueOf("br"), BASE_URI));
        root.appendChild(new TextNode("line2", BASE_URI));
        String text = root.text();
        assertEquals("line2", text);
    }

    @Test
    public void testOwnText() {
        root.empty();
        root.appendChild(new TextNode("direct", BASE_URI));
        root.appendChild(new Element(Tag.valueOf("p"), BASE_URI));
        String own = root.ownText().trim();
        assertEquals("direct", own);
    }

    @Test
    public void testHasTextTrue() {
        root.appendChild(new TextNode("x", BASE_URI));
        assertTrue(root.hasText());
    }

    @Test
    public void testHasTextFalse() {
        assertFalse(root.hasText());
    }

    @Test
    public void testData() {
        root.empty();
        root.appendChild(new DataNode("raw", BASE_URI));
        assertEquals("raw", root.data());
    }

    @Test
    public void testClassNames() {
        root.attr("class", "a b c");
        Set<String> classes = root.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("a"));
        assertTrue(classes.contains("b"));
        assertTrue(classes.contains("c"));
    }

    @Test
    public void testHasClass() {
        root.attr("class", "foo bar");
        assertTrue(root.hasClass("foo"));
        assertFalse(root.hasClass("nonexistent"));
    }

    @Test
    public void testAddClass() {
        root.addClass("newclass");
        assertTrue(root.hasClass("newclass"));
    }

    @Test
    public void testRemoveClass() {
        root.attr("class", "temp");
        root.removeClass("temp");
        assertFalse(root.hasClass("temp"));
    }

    @Test
    public void testToggleClassAddRemove() {
        root.toggleClass("x");
        assertTrue(root.hasClass("x"));
        root.toggleClass("x");
        assertFalse(root.hasClass("x"));
    }

    @Test
    public void testValOnNonTextarea() {
        root.attr("value", "myval");
        assertEquals("myval", root.val());
    }

    @Test
    public void testValOnTextarea() {
        Element ta = new Element(Tag.valueOf("textarea"), BASE_URI);
        ta.appendText("content");
        assertEquals("content", ta.val());
    }

    @Test
    public void testValSetterOnTextarea() {
        Element ta = new Element(Tag.valueOf("textarea"), BASE_URI);
        ta.val("newcontent");
        assertEquals("newcontent", ta.text());
    }

    @Test
    public void testHtmlSimple() {
        root.empty();
        root.appendChild(new TextNode("Hi", BASE_URI));
        String html = root.html();
        assertTrue(html.contains("Hi"));
    }

    @Test
    public void testHtmlWithPrettyPrint() {
        Element inner = new Element(Tag.valueOf("p"), BASE_URI);
        inner.appendChild(new TextNode("text", BASE_URI));
        root.empty();
        root.appendChild(inner);
        assertEquals("<p>text</p>", root.html());
    }

    @Test
    public void testInsertChildrenNormal() {
        Node inserted = new Element(Tag.valueOf("span"), BASE_URI);
        root.insertChildren(1, java.util.Arrays.asList(inserted));
        assertEquals(2, root.children().size());
        assertSame(inserted, root.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollection() {
        root.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNegativeIndexOutOfBounds() {
        Node inserted = new Element(Tag.valueOf("span"), BASE_URI);
        root.insertChildren(-5, java.util.Arrays.asList(inserted));
    }

    @Test
    public void testInsertChildrenNegativeIndexNormal() {
        Node inserted = new Element(Tag.valueOf("span"), BASE_URI);
        root.insertChildren(-1, java.util.Arrays.asList(inserted));
        assertEquals(2, root.children().size());
        assertSame(inserted, root.child(1));
    }

    @Test
    public void testDataset() {
        root.attr("data-test", "value");
        Map<String, String> data = root.dataset();
        assertNotNull(data);
        assertFalse(data.isEmpty());
    }

    @Test
    public void testClone() {
        Element clone = root.clone();
        assertNotSame(root, clone);
        assertEquals(root.tagName(), clone.tagName());
    }

}