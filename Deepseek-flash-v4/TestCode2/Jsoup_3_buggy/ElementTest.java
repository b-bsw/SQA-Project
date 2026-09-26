package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.util.Set;
import static org.junit.Assert.*;

public class ElementTest {

    // Helper: create an element with given tag name and baseUri
    private Element createElement(String tagName) {
        return new Element(Tag.valueOf(tagName), "");
    }

    // Helper: create a simple parent-child structure: div > p
    private Element createDivWithP() {
        Element div = createElement("div");
        Element p = createElement("p");
        div.appendChild(p);
        return div;
    }

    // Constructor and basic properties
    @Test
    public void testConstructorAndBasicProperties() {
        Element e = createElement("div");
        assertEquals("div", e.tagName());
        assertFalse(e.isBlock()); // div is block
        assertEquals("", e.id());
    }

    // id() returns empty string if no id attribute
    @Test
    public void testIdEmpty() {
        Element e = createElement("div");
        assertEquals("", e.id());
    }

    // id() returns correct value
    @Test
    public void testIdSet() {
        Element e = createElement("div");
        e.attr("id", "myId");
        assertEquals("myId", e.id());
    }

    // parent() returns null for root element
    @Test
    public void testParentNullForRoot() {
        Element e = createElement("html");
        assertNull(e.parent());
    }

    // parent() returns parent element
    @Test
    public void testParent() {
        Element div = createDivWithP();
        Element p = div.child(0);
        assertSame(div, p.parent());
    }

    // parents() returns ancestors excluding #root
    @Test
    public void testParents() {
        Element html = createElement("html");
        Element body = createElement("body");
        Element div = createElement("div");
        html.appendChild(body);
        body.appendChild(div);
        Elements parents = div.parents();
        assertEquals(2, parents.size()); // body, html
        assertTrue(parents.contains(body));
        assertTrue(parents.contains(html));
    }

    // child(int) throws IndexOutOfBoundsException if index out of range
    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element e = createElement("div");
        e.child(0);
    }

    // children() returns only Element children
    @Test
    public void testChildrenFiltersTextNodes() {
        Element div = createElement("div");
        div.appendChild(new TextNode("text", ""));
        Element p = createElement("p");
        div.appendChild(p);
        Elements children = div.children();
        assertEquals(1, children.size());
        assertSame(p, children.get(0));
    }

    // select() delegates to Selector (simple smoke test)
    @Test
    public void testSelect() {
        Element div = createDivWithP();
        Elements selected = div.select("p");
        assertEquals(1, selected.size());
    }

    // appendChild adds child and sets parent
    @Test
    public void testAppendChild() {
        Element div = createElement("div");
        Element p = createElement("p");
        div.appendChild(p);
        assertSame(div, p.parent());
        assertEquals(1, div.children().size());
    }

    // prependChild inserts at beginning
    @Test
    public void testPrependChild() {
        Element div = createElement("div");
        Element p1 = createElement("p");
        Element p2 = createElement("p");
        div.appendChild(p1);
        div.prependChild(p2);
        assertSame(p2, div.child(0));
        assertSame(p1, div.child(1));
    }

    // appendElement creates and appends new element
    @Test
    public void testAppendElement() {
        Element div = createElement("div");
        Element p = div.appendElement("p");
        assertEquals("p", p.tagName());
        assertSame(div, p.parent());
    }

    // prependElement creates and prepends
    @Test
    public void testPrependElement() {
        Element div = createElement("div");
        Element p1 = createElement("p");
        div.appendChild(p1);
        Element p2 = div.prependElement("span");
        assertEquals("span", p2.tagName());
        assertSame(p2, div.child(0));
    }

    // appendText adds TextNode
    @Test
    public void testAppendText() {
        Element div = createElement("div");
        div.appendText("hello");
        assertEquals("hello", div.text());
    }

    // prependText adds TextNode at beginning
    @Test
    public void testPrependText() {
        Element div = createElement("div");
        div.appendText("world");
        div.prependText("hello ");
        assertEquals("hello world", div.text());
    }

    // append parses HTML and appends nodes
    @Test
    public void testAppendHtml() {
        Element div = createElement("div");
        div.append("<p>text</p>");
        assertEquals(1, div.children().size());
        assertEquals("p", div.child(0).tagName());
        assertEquals("text", div.text());
    }

    // prepend parses HTML and prepends
    @Test
    public void testPrependHtml() {
        Element div = createElement("div");
        div.append("<span>first</span>");
        div.prepend("<p>second</p>");
        assertEquals("p", div.child(0).tagName());
        assertEquals("span", div.child(1).tagName());
    }

    // empty() clears children
    @Test
    public void testEmpty() {
        Element div = createDivWithP();
        div.empty();
        assertEquals(0, div.children().size());
        assertEquals("", div.text());
    }

    // wrap() wraps element in given HTML structure
    @Test
    public void testWrap() {
        Element div = createElement("div");
        div.wrap("<p></p>");
        assertEquals("p", div.parent().tagName());
    }

    // wrap with multiple wrap children
    @Test
    public void testWrapMultipleWrapChildren() {
        Element div = createElement("div");
        div.wrap("<p><span></span></p>");
        assertEquals("p", div.parent().tagName());
        assertEquals("span", div.parent().child(0).tagName());
    }

    // wrap returns null if wrap body has no children
    @Test
    public void testWrapNull() {
        Element div = createElement("div");
        Element result = div.wrap("");
        assertNull(result);
    }

    // siblingElements returns all siblings including self
    @Test
    public void testSiblingElements() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        Elements siblings = a.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(a));
        assertTrue(siblings.contains(b));
    }

    // nextElementSibling returns next sibling
    @Test
    public void testNextElementSibling() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertSame(b, a.nextElementSibling());
    }

    // nextElementSibling returns null if last
    @Test
    public void testNextElementSiblingNull() {
        Element parent = createElement("div");
        Element a = createElement("a");
        parent.appendChild(a);
        assertNull(a.nextElementSibling());
    }

    // previousElementSibling returns previous
    @Test
    public void testPreviousElementSibling() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertSame(a, b.previousElementSibling());
    }

    // previousElementSibling null for first
    @Test
    public void testPreviousElementSiblingNull() {
        Element parent = createElement("div");
        Element a = createElement("a");
        parent.appendChild(a);
        assertNull(a.previousElementSibling());
    }

    // firstElementSibling returns first
    @Test
    public void testFirstElementSibling() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertSame(a, a.firstElementSibling());
    }

    // firstElementSibling returns null if only one child
    @Test
    public void testFirstElementSiblingSingle() {
        Element parent = createElement("div");
        Element a = createElement("a");
        parent.appendChild(a);
        assertNull(a.firstElementSibling());
    }

    // elementSiblingIndex returns 0 if no parent
    @Test
    public void testElementSiblingIndexNoParent() {
        Element e = createElement("div");
        assertEquals(0, (int)e.elementSiblingIndex());
    }

    // elementSiblingIndex returns correct index
    @Test
    public void testElementSiblingIndex() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertEquals(1, (int)b.elementSiblingIndex());
    }

    // lastElementSibling returns last
    @Test
    public void testLastElementSibling() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertSame(b, a.lastElementSibling());
    }

    // lastElementSibling returns null if single
    @Test
    public void testLastElementSiblingSingle() {
        Element parent = createElement("div");
        Element a = createElement("a");
        parent.appendChild(a);
        assertNull(a.lastElementSibling());
    }

    // getElementsByTag finds descendants with given tag
    @Test
    public void testGetElementsByTag() {
        Element div = createDivWithP();
        Elements ps = div.getElementsByTag("p");
        assertEquals(1, ps.size());
    }

    // getElementById returns null if not found
    @Test
    public void testGetElementByIdNotFound() {
        Element div = createElement("div");
        assertNull(div.getElementById("nonexistent"));
    }

    // getElementById finds element with id
    @Test
    public void testGetElementById() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("id", "myid");
        div.appendChild(p);
        assertSame(p, div.getElementById("myid"));
    }

    // getElementsByClass finds descendants with class
    @Test
    public void testGetElementsByClass() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.addClass("highlight");
        div.appendChild(p);
        Elements found = div.getElementsByClass("highlight");
        assertEquals(1, found.size());
    }

    // getElementsByAttribute
    @Test
    public void testGetElementsByAttribute() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("data-x", "val");
        div.appendChild(p);
        Elements found = div.getElementsByAttribute("data-x");
        assertEquals(1, found.size());
    }

    // getElementsByAttributeValue
    @Test
    public void testGetElementsByAttributeValue() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("data-x", "val");
        div.appendChild(p);
        Elements found = div.getElementsByAttributeValue("data-x", "val");
        assertEquals(1, found.size());
    }

    // getElementsByAttributeValueNot
    @Test
    public void testGetElementsByAttributeValueNot() {
        Element div = createElement("div");
        Element p1 = createElement("p");
        p1.attr("data-x", "val1");
        Element p2 = createElement("p");
        p2.attr("data-x", "val2");
        div.appendChild(p1);
        div.appendChild(p2);
        Elements found = div.getElementsByAttributeValueNot("data-x", "val1");
        assertEquals(1, found.size());
        assertSame(p2, found.get(0));
    }

    // getElementsByAttributeValueStarting
    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("data-x", "abc123");
        div.appendChild(p);
        Elements found = div.getElementsByAttributeValueStarting("data-x", "abc");
        assertEquals(1, found.size());
    }

    // getElementsByAttributeValueEnding
    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("data-x", "abc123");
        div.appendChild(p);
        Elements found = div.getElementsByAttributeValueEnding("data-x", "123");
        assertEquals(1, found.size());
    }

    // getElementsByAttributeValueContaining
    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element div = createElement("div");
        Element p = createElement("p");
        p.attr("data-x", "hello world");
        div.appendChild(p);
        Elements found = div.getElementsByAttributeValueContaining("data-x", "world");
        assertEquals(1, found.size());
    }

    // getElementsByIndexLessThan
    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        // child index < 1 => only a
        Elements found = parent.getElementsByIndexLessThan(1);
        assertEquals(1, found.size());
        assertSame(a, found.get(0));
    }

    // getElementsByIndexGreaterThan
    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        Elements found = parent.getElementsByIndexGreaterThan(0);
        assertEquals(1, found.size());
        assertSame(b, found.get(0));
    }

    // getElementsByIndexEquals
    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = createElement("div");
        Element a = createElement("a");
        Element b = createElement("b");
        parent.appendChild(a);
        parent.appendChild(b);
        Elements found = parent.getElementsByIndexEquals(1);
        assertEquals(1, found.size());
        assertSame(b, found.get(0));
    }

    // getAllElements
    @Test
    public void testGetAllElements() {
        Element div = createDivWithP();
        Elements all = div.getAllElements();
        assertEquals(2, all.size());
    }

    // text() returns trimmed text of all child text nodes
    @Test
    public void testText() {
        Element div = createElement("div");
        div.appendChild(new TextNode("  Hello ", ""));
        div.appendChild(new TextNode("World  ", ""));
        assertEquals("Hello World", div.text());
    }

    // text() with block element adds spaces
    @Test
    public void testTextWithBlockChildren() {
        Element div = createElement("div");
        Element p1 = createElement("p");
        p1.appendChild(new TextNode("First", ""));
        Element p2 = createElement("p");
        p2.appendChild(new TextNode("Second", ""));
        div.appendChild(p1);
        div.appendChild(p2);
        assertEquals("First Second", div.text());
    }

    // text(String) clears and sets text
    @Test
    public void testSetText() {
        Element div = createElement("div");
        div.text("new text");
        assertEquals("new text", div.text());
        assertEquals(0, div.children().size());
        assertTrue(div.hasText());
    }

    // hasText returns false for empty element
    @Test
    public void testHasTextFalse() {
        Element div = createElement("div");
        assertFalse(div.hasText());
    }

    // hasText with TextNode
    @Test
    public void testHasTextTrue() {
        Element div = createElement("div");
        div.appendChild(new TextNode("x", ""));
        assertTrue(div.hasText());
    }

    // data() concatenates DataNode data
    @Test
    public void testData() {
        Element div = createElement("div");
        DataNode data = new DataNode("Hello", "");
        div.appendChild(data);
        assertEquals("Hello", div.data());
    }

    // className returns attribute "class" or empty
    @Test
    public void testClassName() {
        Element e = createElement("div");
        assertEquals("", e.className());
        e.attr("class", "foo");
        assertEquals("foo", e.className());
    }

    // classNames returns set of class names
    @Test
    public void testClassNames() {
        Element e = createElement("div");
        e.attr("class", "foo bar");
        Set<String> classes = e.classNames();
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
        assertEquals(2, classes.size());
    }

    // classNames(Set) replaces classes
    @Test
    public void testClassNamesSet() {
        Element e = createElement("div");
        Set<String> newClasses = new java.util.LinkedHashSet<>(Arrays.asList("a", "b"));
        e.classNames(newClasses);
        assertEquals("a b", e.className());
    }

    // hasClass
    @Test
    public void testHasClass() {
        Element e = createElement("div");
        e.addClass("highlight");
        assertTrue(e.hasClass("highlight"));
        assertFalse(e.hasClass("other"));
    }

    // addClass adds class (duplicate ignored due to Set)
    @Test
    public void testAddClass() {
        Element e = createElement("div");
        e.addClass("foo");
        e.addClass("foo");
        assertEquals("foo", e.className());
    }

    // removeClass
    @Test
    public void testRemoveClass() {
        Element e = createElement("div");
        e.addClass("foo");
        e.removeClass("foo");
        assertFalse(e.hasClass("foo"));
    }

    // toggleClass adds if absent, removes if present
    @Test
    public void testToggleClassAdd() {
        Element e = createElement("div");
        e.toggleClass("foo");
        assertTrue(e.hasClass("foo"));
    }

    @Test
    public void testToggleClassRemove() {
        Element e = createElement("div");
        e.addClass("foo");
        e.toggleClass("foo");
        assertFalse(e.hasClass("foo"));
    }

    // val returns text for textarea, value attribute for others
    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("some text");
        assertEquals("some text", textarea.val());
    }

    @Test
    public void testValInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "test");
        assertEquals("test", input.val());
    }

    // val(String) sets text for textarea, value attribute for others
    @Test
    public void testValSetTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("new text");
        assertEquals("new text", textarea.text());
    }

    @Test
    public void testValSetInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("new value");
        assertEquals("new value", input.attr("value"));
    }

    // html() returns inner HTML
    @Test
    public void testHtmlInner() {
        Element div = createElement("div");
        div.appendChild(new TextNode("text", ""));
        assertEquals("text", div.html());
    }

    // html(String) replaces inner HTML
    @Test
    public void testHtmlSet() {
        Element div = createElement("div");
        div.html("<p>hello</p>");
        assertEquals("<p>hello</p>", div.html().toLowerCase());
    }

    // outerHtml produces full tag
    @Test
    public void testOuterHtml() {
        Element div = createElement("div");
        div.attr("id", "x");
        assertEquals("<div id=\"x\"></div>", div.outerHtml());
    }

    // toString equals outerHtml
    @Test
    public void testToString() {
        Element div = createElement("div");
        assertEquals(div.outerHtml(), div.toString());
    }

    // equals/hashCode based on tag and attributes
    @Test
    public void testEquals() {
        Element e1 = createElement("div");
        Element e2 = createElement("div");
        e1.attr("class", "foo");
        e2.attr("class", "foo");
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testEqualsDifferentTag() {
        Element e1 = createElement("div");
        Element e2 = createElement("span");
        assertNotEquals(e1, e2);
    }

    // null validation in append/prepend/appends
    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        Element div = createElement("div");
        div.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChildNull() {
        Element div = createElement("div");
        div.prependChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        Element div = createElement("div");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependNullHtml() {
        Element div = createElement("div");
        div.prepend(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyString() {
        Element div = createElement("div");
        div.wrap("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        Element div = createElement("div");
        div.getElementsByTag("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmpty() {
        Element div = createElement("div");
        div.getElementById("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmpty() {
        Element div = createElement("div");
        div.getElementsByClass("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeEmpty() {
        Element div = createElement("div");
        div.getElementsByAttribute("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNull() {
        Element e = createElement("div");
        e.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClassNull() {
        Element e = createElement("div");
        e.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClassNull() {
        Element e = createElement("div");
        e.toggleClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextNull() {
        Element e = createElement("div");
        e.text(null);
    }

    // preserveWhitespace via tag or parent
    @Test
    public void testPreserveWhitespaceFromTag() {
        Tag preTag = Tag.valueOf("pre");
        Element pre = new Element(preTag, "");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespaceFromParent() {
        Tag preTag = Tag.valueOf("pre");
        Element pre = new Element(preTag, "");
        Element code = createElement("code");
        pre.appendChild(code);
        assertTrue(code.preserveWhitespace());
    }

    // Select with query that returns no results
    @Test
    public void testSelectEmpty() {
        Element div = createElement("div");
        Elements result = div.select("span");
        assertTrue(result.isEmpty());
    }

    // text() with empty element returns empty string
    @Test
    public void testTextEmpty() {
        Element div = createElement("div");
        assertEquals("", div.text());
    }

    // hasText returns false for element with only whitespace textnode
    @Test
    public void testHasTextBlankTextNode() {
        Element div = createElement("div");
        div.appendChild(new TextNode("   ", ""));
        assertFalse(div.hasText());
    }

    // data() with no children returns empty string
    @Test
    public void testDataEmpty() {
        Element div = createElement("div");
        assertEquals("", div.data());
    }

    // classNames() with no class attribute returns empty set
    @Test
    public void testClassNamesNoClass() {
        Element div = createElement("div");
        assertTrue(div.classNames().isEmpty());
    }

    // equals with same object
    @Test
    public void testEqualsSameObject() {
        Element e = createElement("div");
        assertTrue(e.equals(e));
    }

    // equals with non-Element returns false
    @Test
    public void testEqualsNonElement() {
        Element e = createElement("div");
        assertFalse(e.equals("string"));
    }

    // elementSiblingIndex with parent but no siblings returns 0
    @Test
    public void testElementSiblingIndexSingleChild() {
        Element parent = createElement("div");
        Element child = createElement("p");
        parent.appendChild(child);
        assertEquals(0, (int)child.elementSiblingIndex());
    }
}