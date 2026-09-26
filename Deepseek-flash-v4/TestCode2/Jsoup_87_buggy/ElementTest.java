package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {
    private Document doc;
    private Element div;
    private Element span;
    private Element p;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        div = new Element("div");
        doc.appendChild(div);
        span = new Element("span");
        div.appendChild(span);
        p = new Element("p");
        div.appendChild(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTag() {
        new Element((Tag) null, "base", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUri() {
        new Element(Tag.valueOf("div"), null, new Attributes());
    }

    @Test
    public void testTagName() {
        assertEquals("div", div.tagName());
        div.tagName("span");
        assertEquals("span", div.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmpty() {
        div.tagName("");
    }

    @Test
    public void testId() {
        assertNull(div.id());
        div.attr("id", "main");
        assertEquals("main", div.id());
    }

    @Test
    public void testParent() {
        assertNull(doc.parent());
        assertSame(doc, span.parent());
    }

    @Test
    public void testParents() {
        Elements parents = span.parents();
        assertEquals(2, parents.size());
        assertSame(div, parents.get(0));
        assertSame(doc, parents.get(1));
    }

    @Test
    public void testChildren() {
        Elements children = div.children();
        assertEquals(2, children.size());
        assertSame(span, children.get(0));
        assertSame(p, children.get(1));
        div.appendChild(new Element("b"));
        children = div.children();
        assertEquals(3, children.size());
    }

    @Test
    public void testAppendChild() {
        Element b = new Element("b");
        div.appendChild(b);
        assertEquals(3, div.childNodes.size());
        assertEquals(2, b.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNegativeIndex() {
        div.insertChildren(-5, new Element("x"));
    }

    @Test
    public void testText() {
        span.appendChild(new TextNode("Hello "));
        p.appendChild(new TextNode("World"));
        assertEquals("Hello World", div.text().trim());
    }

    @Test
    public void testWholeText() {
        span.appendChild(new TextNode("Hello "));
        p.appendChild(new TextNode("World"));
        assertEquals("Hello World", div.wholeText());
    }

    @Test
    public void testTextSetter() {
        div.text("Hello");
        assertEquals("Hello", div.text());
        div.text("World");
        assertEquals("World", div.text());
    }

    @Test
    public void testHasClass() {
        div.attr("class", "foo bar");
        assertTrue(div.hasClass("foo"));
        assertTrue(div.hasClass("bar"));
        assertFalse(div.hasClass("baz"));
        assertTrue(div.hasClass("FOO"));
        Element only = new Element("x");
        only.attr("class", "only");
        assertTrue(only.hasClass("only"));
        assertFalse(only.hasClass("only "));
    }

    @Test
    public void testClassNamesEmpty() {
        div.attr("class", "a b");
        Set<String> names = div.classNames();
        assertEquals(2, names.size());
        div.classNames(Collections.emptySet());
        assertFalse(div.hasAttr("class"));
    }

    @Test
    public void testCssSelectorWithId() {
        div.attr("id", "mydiv");
        assertEquals("#mydiv", div.cssSelector());
    }

    @Test
    public void testGetElementByIdNotFound() {
        assertNull(div.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingBadRegex() {
        div.getElementsByAttributeValueMatching("key", "[invalid");
    }

    @Test
    public void testVal() {
        Element input = new Element("input");
        input.attr("value", "test");
        assertEquals("test", input.val());
        Element textarea = new Element("textarea");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void testSiblingElements() {
        Elements siblings = span.siblingElements();
        assertEquals(1, siblings.size());
        assertSame(p, siblings.get(0));
    }

    @Test
    public void testNextPreviousSibling() {
        assertSame(p, span.nextElementSibling());
        assertSame(span, p.previousElementSibling());
        assertNull(p.nextElementSibling());
        assertNull(span.previousElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        assertEquals(0, span.elementSiblingIndex());
        assertEquals(1, p.elementSiblingIndex());
    }

    @Test
    public void testFirstLastElementSiblingNoSiblings() {
        Element only = new Element("only");
        doc.appendChild(only);
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testFirstLastElementSiblingWithSiblings() {
        Element parent = new Element("parent");
        doc.appendChild(parent);
        Element child1 = new Element("c1");
        parent.appendChild(child1);
        Element child2 = new Element("c2");
        parent.appendChild(child2);
        assertSame(child1, child1.firstElementSibling());
        assertSame(child1, child2.firstElementSibling());
        assertSame(child2, child1.lastElementSibling());
        assertSame(child2, child2.lastElementSibling());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullString() {
        div.append((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependNullString() {
        div.prepend((String) null);
    }

    @Test
    public void testClone() {
        div.attr("id", "original");
        Element cloned = div.clone();
        assertEquals("original", cloned.id());
        assertEquals(div.tagName(), cloned.tagName());
        assertEquals(div.children().size(), cloned.children().size());
    }

    @Test
    public void testShallowClone() {
        div.attr("id", "original");
        Element shallow = div.shallowClone();
        assertEquals("original", shallow.id());
        assertTrue(shallow.childNodes.isEmpty());
    }
}