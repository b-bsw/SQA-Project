package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import java.util.List;
import java.util.Set;

public class ElementTest {
    private Element parent;
    private Element child1;
    private Element child2;
    private TextNode textNode;
    private DataNode dataNode;
    private static final String BASE_URI = "http://example.com";

    @Before
    public void setUp() {
        Tag divTag = Tag.valueOf("div");
        Tag spanTag = Tag.valueOf("span");
        parent = new Element(divTag, BASE_URI, new Attributes());
        child1 = new Element(spanTag, BASE_URI);
        child2 = new Element(divTag, BASE_URI);
        textNode = new TextNode("hello", BASE_URI);
        dataNode = new DataNode("data content", BASE_URI);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(textNode);
        parent.appendChild(dataNode);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullTag() {
        new Element(null, BASE_URI);
    }

    @Test
    public void testConstructorNormal() {
        Tag tag = Tag.valueOf("p");
        Element el = new Element(tag, BASE_URI);
        assertEquals("p", el.tagName());
        assertEquals(BASE_URI, el.baseUri());
        assertNotNull(el.attributes());
    }

    @Test
    public void testTagNameGet() {
        assertEquals("div", parent.tagName());
    }

    @Test
    public void testTagNameSet() {
        Element el = parent.tagName("span");
        assertSame(parent, el);
        assertEquals("span", parent.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetEmpty() {
        parent.tagName("");
    }

    @Test
    public void testIsBlock() {
        assertTrue(parent.isBlock());
        assertFalse(child1.isBlock());
    }

    @Test
    public void testIdDefault() {
        assertEquals("", parent.id());
    }

    @Test
    public void testIdSet() {
        parent.attr("id", "myid");
        assertEquals("myid", parent.id());
    }

    @Test
    public void testParentNoParent() {
        Element orphan = new Element(Tag.valueOf("p"), BASE_URI);
        assertNull(orphan.parent());
    }

    @Test
    public void testParentWithParent() {
        assertEquals(parent, child1.parent());
    }

    @Test
    public void testParents() {
        Element grandparent = new Element(Tag.valueOf("div"), BASE_URI);
        grandparent.appendChild(parent);
        Elements parents = child1.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(parent));
        assertTrue(parents.contains(grandparent));
    }

    @Test
    public void testParentsNoParent() {
        Element orphan = new Element(Tag.valueOf("p"), BASE_URI);
        assertEquals(0, orphan.parents().size());
    }

    @Test
    public void testChildValid() {
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        parent.child(10);
    }

    @Test
    public void testChildren() {
        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testTextNodes() {
        List<TextNode> nodes = parent.textNodes();
        assertEquals(1, nodes.size());
        assertEquals("hello", nodes.get(0).getWholeText());
    }

    @Test
    public void testDataNodes() {
        List<DataNode> nodes = parent.dataNodes();
        assertEquals(1, nodes.size());
        assertEquals("data content", nodes.get(0).getWholeData());
    }

    @Test
    public void testAppendChild() {
        Element newChild = new Element(Tag.valueOf("b"), BASE_URI);
        Element result = parent.appendChild(newChild);
        assertSame(parent, result);
        assertTrue(parent.childNodes.contains(newChild));
    }

    @Test(expected = NullPointerException.class)
    public void testAppendChildNull() {
        parent.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element newChild = new Element(Tag.valueOf("b"), BASE_URI);
        parent.prependChild(newChild);
        assertEquals(newChild, parent.child(0));
    }

    @Test(expected = NullPointerException.class)
    public void testPrependChildNull() {
        parent.prependChild(null);
    }

    @Test
    public void testAppendElement() {
        Element child = parent.appendElement("b");
        assertNotNull(child);
        assertEquals("b", child.tagName());
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element child = parent.prependElement("b");
        assertEquals(child, parent.child(0));
    }

    @Test
    public void testAppendText() {
        parent.appendText(" world");
        assertTrue(parent.text().endsWith("world"));
    }

    @Test
    public void testAppendHtml() {
        parent.append("<span>inner</span>");
        assertEquals(3, parent.children().size());
    }

    @Test(expected = NullPointerException.class)
    public void testAppendNull() {
        parent.append(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPrependNull() {
        parent.prepend(null);
    }

    @Test
    public void testEmpty() {
        parent.empty();
        assertEquals(0, parent.childNodes.size());
    }

    @Test
    public void testSiblingElements() {
        Elements siblings = child1.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(child1));
        assertTrue(siblings.contains(child2));
    }

    @Test
    public void testNextElementSibling() {
        assertEquals(child2, child1.nextElementSibling());
        assertNull(child2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        assertNull(child1.previousElementSibling());
        assertEquals(child1, child2.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        assertEquals(child1, child1.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingSingleChild() {
        Element p = new Element(Tag.valueOf("div"), BASE_URI);
        Element only = new Element(Tag.valueOf("span"), BASE_URI);
        p.appendChild(only);
        assertNull(only.firstElementSibling());
    }

    @Test
    public void testLastElementSibling() {
        assertEquals(child2, child1.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingSingleChild() {
        Element p = new Element(Tag.valueOf("div"), BASE_URI);
        Element only = new Element(Tag.valueOf("span"), BASE_URI);
        p.appendChild(only);
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
    }

    @Test
    public void testElementSiblingIndexNoParent() {
        Element orphan = new Element(Tag.valueOf("p"), BASE_URI);
        assertEquals(0, orphan.elementSiblingIndex().intValue());
    }

    @Test
    public void testGetElementByIdFound() {
        child1.attr("id", "myid");
        Element found = parent.getElementById("myid");
        assertEquals(child1, found);
    }

    @Test
    public void testGetElementByIdNotFound() {
        assertNull(parent.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyId() {
        parent.getElementById("");
    }

    @Test
    public void testGetElementsByTag() {
        Elements spans = parent.getElementsByTag("span");
        assertEquals(1, spans.size());
        assertEquals(child1, spans.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        parent.getElementsByTag("");
    }

    @Test
    public void testGetElementsByClass() {
        child1.addClass("foo");
        Elements foos = parent.getElementsByClass("foo");
        assertEquals(1, foos.size());
        assertEquals(child1, foos.get(0));
    }

    @Test
    public void testGetElementsByAttribute() {
        child1.attr("data-x", "y");
        Elements els = parent.getElementsByAttribute("data-x");
        assertEquals(1, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidRegex() {
        parent.getElementsByAttributeValueMatching("key", "[invalid");
    }

    @Test
    public void testText() {
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        p.appendChild(new TextNode("Hello ", BASE_URI));
        Element strong = new Element(Tag.valueOf("strong"), BASE_URI);
        strong.appendChild(new TextNode("World", BASE_URI));
        p.appendChild(strong);
        assertEquals("Hello World", p.text());
    }

    @Test
    public void testTextBlockSpacing() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        div.appendChild(new TextNode("First", BASE_URI));
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        p.appendChild(new TextNode("Second", BASE_URI));
        div.appendChild(p);
        assertEquals("First Second", div.text());
    }

    @Test
    public void testTextPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), BASE_URI);
        pre.appendChild(new TextNode("   multiple   spaces   ", BASE_URI));
        assertEquals("   multiple   spaces   ", pre.text());
    }

    @Test
    public void testOwnText() {
        assertEquals("hello", parent.ownText());
    }

    @Test
    public void testHasTextTrue() {
        assertTrue(parent.hasText());
    }

    @Test
    public void testHasTextFalse() {
        Element empty = new Element(Tag.valueOf("div"), BASE_URI);
        assertFalse(empty.hasText());
    }

    @Test
    public void testClassName() {
        String cls = "a b";
        parent.attr("class", cls);
        assertEquals(cls, parent.className());
    }

    @Test
    public void testClassNames() {
        parent.attr("class", "a b");
        Set<String> names = parent.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test(expected = NullPointerException.class)
    public void testClassNamesNull() {
        parent.classNames(null);
    }

    @Test
    public void testAddClass() {
        parent.addClass("test");
        assertTrue(parent.hasClass("test"));
    }

    @Test(expected = NullPointerException.class)
    public void testAddClassNull() {
        parent.addClass(null);
    }

    @Test
    public void testRemoveClass() {
        parent.addClass("test");
        parent.removeClass("test");
        assertFalse(parent.hasClass("test"));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveClassNull() {
        parent.removeClass(null);
    }

    @Test
    public void testToggleClass() {
        parent.toggleClass("test");
        assertTrue(parent.hasClass("test"));
        parent.toggleClass("test");
        assertFalse(parent.hasClass("test"));
    }

    @Test(expected = NullPointerException.class)
    public void testToggleClassNull() {
        parent.toggleClass(null);
    }

    @Test
    public void testHasClassCaseInsensitive() {
        parent.addClass("Test");
        assertTrue(parent.hasClass("test"));
    }

    @Test
    public void testValInput() {
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("value", "myval");
        assertEquals("myval", input.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), BASE_URI);
        textarea.text("mytext");
        assertEquals("mytext", textarea.val());
    }

    @Test(expected = NullPointerException.class)
    public void testTextNull() {
        parent.text(null);
    }

    @Test(expected = NullPointerException.class)
    public void testValNullTextarea() {
        Element ta = new Element(Tag.valueOf("textarea"), BASE_URI);
        ta.val(null);
    }

    @Test
    public void testData() {
        Element el = new Element(Tag.valueOf("script"), BASE_URI);
        el.appendChild(new DataNode("alert('hi');", BASE_URI));
        assertEquals("alert('hi');", el.data());
    }

    @Test
    public void testHtml() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        div.appendChild(new TextNode("text", BASE_URI));
        assertEquals("text", div.html());
    }

    @Test
    public void testOuterHtml() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        div.attr("id", "x");
        div.appendChild(new TextNode("text", BASE_URI));
        assertEquals("<div id=\"x\">text</div>", div.outerHtml());
    }

    @Test
    public void testClone() {
        Element original = new Element(Tag.valueOf("div"), BASE_URI);
        original.addClass("foo");
        Element clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original.tagName(), clone.tagName());
        assertTrue(clone.hasClass("foo"));
        assertNotNull(clone.classNames());
    }

    @Test
    public void testEquals() {
        Element a = new Element(Tag.valueOf("div"), BASE_URI);
        Element b = new Element(Tag.valueOf("div"), BASE_URI);
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
    }
}