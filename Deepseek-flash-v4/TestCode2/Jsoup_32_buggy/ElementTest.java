package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    private static final String BASE_URI = "http://example.com";

    private Element element(String tag) {
        return new Element(Tag.valueOf(tag), BASE_URI);
    }

    @Test
    public void constructorRejectsNullTag() {
        try {
            new Element(null, BASE_URI);
            fail("Expected IllegalArgumentException for null tag");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void tagNameAndUpdate() {
        Element div = element("div");
        assertEquals("div", div.tagName());
        assertEquals("div", div.nodeName());

        div.tagName("span");
        assertEquals("span", div.tagName());
        assertEquals("span", div.nodeName());
    }

    @Test
    public void tagNameRejectsEmpty() {
        try {
            element("div").tagName("");
            fail("Expected IllegalArgumentException for empty tag name");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void attributesAndId() {
        Element el = element("div");
        assertSame(el, el.attr("id", "main"));
        assertEquals("main", el.id());
    }

    @Test
    public void parentChildAndChildren() {
        Element div = element("div");
        Element span = element("span");

        div.appendChild(new TextNode("hello", BASE_URI));
        assertSame(div, div.appendChild(span));

        assertEquals(1, div.children().size());
        assertSame(span, div.child(0));
        assertSame(div, span.parent());
        assertEquals("hello", div.text());
    }

    @Test
    public void dataElement() {
        Element script = element("script");
        script.appendChild(new DataNode("var x = 1;", BASE_URI));
        assertEquals("var x = 1;", script.data());
    }

    @Test
    public void prependAndAppendElements() {
        Element div = element("div");

        div.appendText("A");
        div.prependText("B");
        assertEquals("BA", div.text());

        Element em = div.appendElement("em");
        em.text("C");

        Element strong = div.prependElement("strong");
        strong.text("D");

        assertEquals("strong", div.child(0).tagName());
        assertEquals("em", div.child(1).tagName());
    }

    @Test
    public void appendAndPrependHtml() {
        Element div = element("div");
        assertSame(div, div.append("<b>one</b>"));
        assertSame(div, div.prepend("<i>two</i>"));

        assertEquals(2, div.children().size());
        assertEquals("i", div.child(0).tagName());
        assertEquals("b", div.child(1).tagName());
    }

    @Test
    public void insertChildrenAtVariousPositions() {
        Element div = element("div");
        Element a = element("a");
        Element b = element("b");

        div.appendChild(a);
        div.appendChild(b);

        Element i = element("i");
        div.prependChild(i);
        assertSame(i, div.child(0));

        Element c = element("span");
        div.insertChildren(1, Collections.<Node>singletonList((Node) c));
        assertSame(c, div.child(1));

        Element d = element("strong");
        div.insertChildren(-1, Collections.<Node>singletonList((Node) d));
        assertSame(d, div.child(div.children().size() - 1));
    }

    @Test
    public void insertChildrenRejectsOutOfBounds() {
        Element div = element("div");
        div.appendChild(element("a"));

        try {
            div.insertChildren(100, Collections.<Node>singletonList((Node) element("b")));
            fail("Expected IllegalArgumentException for out-of-bounds index");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void appendNullRejected() {
        try {
            element("div").append(null);
            fail("Expected IllegalArgumentException for null HTML");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void emptyClearsChildren() {
        Element div = element("div");
        div.appendChild(element("span"));
        assertSame(div, div.empty());
        assertEquals(0, div.children().size());
    }

    @Test
    public void beforeAndAfterInsertSiblings() {
        Element parent = element("div");
        Element kid = element("span");
        parent.appendChild(kid);

        kid.before(element("b"));
        kid.after(element("i"));

        assertEquals(3, parent.children().size());
        assertEquals("b", parent.child(0).tagName());
        assertSame(kid, parent.child(1));
        assertEquals("i", parent.child(2).tagName());
    }

    @Test
    public void wrapWrapsElement() {
        Element parent = element("div");
        Element kid = element("span");
        parent.appendChild(kid);

        kid.wrap("<b></b>");

        assertEquals("b", parent.child(0).tagName());
        assertSame(kid, kid.parent());
    }

    @Test
    public void textIsNormalized() {
        Element div = element("div");
        div.text("  Hello   world ");
        assertEquals("Hello world", div.text());
    }

    @Test
    public void hasTextHandlesBlankText() {
        Element div = element("div");
        assertFalse(div.hasText());

        div.appendChild(new TextNode("   ", BASE_URI));
        assertFalse(div.hasText());

        div.text("x");
        assertTrue(div.hasText());
    }

    @Test
    public void classNamesAndToggle() {
        Element el = element("div");
        el.attr("class", "foo bar");

        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));

        el.addClass("baz");
        assertTrue(el.hasClass("baz"));

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));

        el.toggleClass("bar");
        assertFalse(el.hasClass("bar"));
    }

    @Test
    public void classNamesSetDirectly() {
        Element el = element("div");
        Set<String> set = new LinkedHashSet<String>();
        set.add("one");
        set.add("two");

        el.classNames(set);

        assertTrue(el.hasClass("one"));
        assertTrue(el.hasClass("two"));
    }

    @Test
    public void selectorsAndSearchMethods() {
        Element div = element("div");
        div.attr("id", "root");
        div.attr("class", "outer");
        div.attr("data-x", "1");

        Element span = div.appendElement("span");
        span.attr("id", "s1");
        span.attr("class", "inner");
        span.text("child");

        assertTrue(div.getElementsByTag("span").contains(span));
        assertSame(span, div.getElementById("s1"));
        assertSame(div, div.getElementById("root"));
        assertTrue(div.getElementsByClass("inner").contains(span));
        assertTrue(div.getElementsByAttribute("data-x").contains(div));
        assertTrue(div.getElementsByAttributeStarting("data-").contains(div));
        assertTrue(div.getElementsByAttributeValue("data-x", "1").contains(div));
        assertTrue(div.getElementsByAttributeValueNot("data-x", "2").contains(div));
        assertTrue(div.select("span").contains(span));
    }

    @Test
    public void indexSearchMethods() {
        Element parent = element("div");
        Element c0 = parent.appendElement("span");
        Element c1 = parent.appendElement("span");

        assertTrue(parent.getElementsByIndexLessThan(1).contains(c0));
        assertFalse(parent.getElementsByIndexLessThan(1).contains(c1));

        assertTrue(parent.getElementsByIndexEquals(1).contains(c1));

        assertTrue(parent.getElementsByIndexGreaterThan(0).contains(c1));
        assertFalse(parent.getElementsByIndexGreaterThan(0).contains(c0));
    }

    @Test
    public void textSearchMethods() {
        Element div = element("div");
        div.appendText("Hello World");

        Element span = div.appendElement("span");
        span.text("child");

        assertTrue(div.getElementsContainingText("Hello").contains(div));
        assertTrue(div.getElementsContainingOwnText("child").contains(span));
        assertTrue(div.getElementsMatchingText("child").contains(span));
    }

    @Test
    public void invalidRegexThrowsHelpfulException() {
        try {
            element("div").getElementsByAttributeValueMatching("href", "[");
            fail("Expected IllegalArgumentException for bad regex");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Pattern syntax error"));
        }
    }

    @Test
    public void allElementsIncludesDescendants() {
        Element div = element("div");
        Element span = div.appendElement("span");

        Elements all = div.getAllElements();
        assertTrue(all.contains(div));
        assertTrue(all.contains(span));
    }

    @Test
    public void parentsAreAccumulated() {
        Element root = element("div");
        Element mid = element("div");
        Element leaf = element("span");

        root.appendChild(mid);
        mid.appendChild(leaf);

        Elements parents = leaf.parents();
        assertSame(mid, parents.get(0));
        assertSame(root, parents.get(1));
    }

    @Test
    public void siblingElements() {
        Element ul = element("ul");
        Element li0 = ul.appendElement("li");
        Element li1 = ul.appendElement("li");
        Element li2 = ul.appendElement("li");

        Elements siblings = li1.siblingElements();
        assertEquals(2, siblings.size());
        assertSame(li0, siblings.get(0));
        assertSame(li2, siblings.get(1));
    }

    @Test
    public void valAccessors() {
        Element input = element("input");
        input.attr("value", "x");
        assertEquals("x", input.val());

        input.val("y");
        assertEquals("y", input.val());
    }

    @Test
    public void toStringCreatesHtml() {
        Element span = element("span");
        String html = span.toString();

        assertTrue(html.startsWith("<span"));
        assertTrue(html.endsWith("</span>"));
    }

    @Test
    public void equalsAndHashCodeContract() {
        Element a = element("span");
        Element b = element("span");

        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertEquals(a.hashCode(), a.hashCode());
    }

    @Test
    public void cloneDeepCopiesChildren() {
        Element div = element("div");
        div.appendElement("span").text("x");

        Element clone = div.clone();
        assertNotSame(div, clone);
        assertNotSame(div.child(0), clone.child(0));
    }
}