package org.jsoup.nodes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Collector;
import org.jsoup.select.Evaluator;
import java.util.*;
import static org.junit.Assert.*;

public class ElementTest {
    private Element div;
    private Element p;
    private Element root;
    private String baseUri = "http://example.com";

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("#root"), baseUri);
        div = new Element(Tag.valueOf("div"), baseUri);
        p = new Element(Tag.valueOf("p"), baseUri);
        root.appendChild(div);
        div.appendChild(p);
    }

    @After
    public void tearDown() {
        root = null; div = null; p = null;
    }

    @Test
    public void testConstructorAndTagName() {
        Element e = new Element(Tag.valueOf("span"), baseUri);
        assertEquals("span", e.nodeName());
        assertEquals("span", e.tagName());
        assertTrue(e.tag().isBlock() == false); // span is inline
        assertTrue(e.isBlock() == false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTag() {
        new Element(null, baseUri);
    }

    @Test
    public void testTagNameChange() {
        div.tagName("span");
        assertEquals("span", div.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmpty() {
        div.tagName("");
    }

    @Test
    public void testId() {
        div.attr("id", "main");
        assertEquals("main", div.id());
        Element noId = new Element(Tag.valueOf("div"), baseUri);
        assertEquals("", noId.id());
    }

    @Test
    public void testAttrAndDataset() {
        div.attr("data-name", "foo");
        assertEquals("foo", div.attr("data-name"));
        Map<String, String> ds = div.dataset();
        assertNotNull(ds);
        assertEquals("foo", ds.get("name"));
    }

    @Test
    public void testChildren() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        TextNode tn = new TextNode("some text", baseUri);
        div.appendChild(a);
        div.appendChild(tn);
        div.appendChild(b);
        Elements kids = div.children();
        assertEquals(2, kids.size());
        assertSame(a, kids.get(0));
        assertSame(b, kids.get(1));
    }

    @Test
    public void testChild() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        div.appendChild(a);
        assertSame(a, div.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        div.child(0);
    }

    @Test
    public void testTextNodes() {
        TextNode tn1 = new TextNode("hello", baseUri);
        TextNode tn2 = new TextNode("world", baseUri);
        div.appendChild(tn1);
        div.appendChild(tn2);
        List<TextNode> list = div.textNodes();
        assertEquals(2, list.size());
        assertSame(tn1, list.get(0));
        assertSame(tn2, list.get(1));
    }

    @Test
    public void testDataNodes() {
        DataNode dn = new DataNode("some data", baseUri);
        div.appendChild(dn);
        List<DataNode> list = div.dataNodes();
        assertEquals(1, list.size());
        assertSame(dn, list.get(0));
    }

    @Test
    public void testParents() {
        Elements parents = p.parents();
        assertEquals(2, parents.size()); // div then root
        assertSame(div, parents.get(0));
        assertSame(root, parents.get(1));
    }

    @Test
    public void testAppendChild() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        div.appendChild(span);
        assertSame(span, div.child(1)); // after p
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        div.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        div.prependChild(span);
        assertSame(span, div.child(0));
    }

    @Test
    public void testInsertChildren() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        List<Node> toInsert = Arrays.asList(a, b);
        div.insertChildren(0, toInsert);
        assertEquals(3, div.children().size()); // a, b, p
        assertSame(a, div.child(0));
        assertSame(b, div.child(1));
        assertSame(p, div.child(2));
    }

    @Test
    public void testInsertChildrenNegativeIndex() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        List<Node> toInsert = Arrays.asList(a);
        div.insertChildren(-1, toInsert); // converts to size+1+(-1)=1
        assertEquals(2, div.children().size());
        assertSame(p, div.child(0));
        assertSame(a, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNull() {
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        List<Node> toInsert = Arrays.asList(new Element(Tag.valueOf("span"), baseUri));
        div.insertChildren(5, toInsert);
    }

    @Test
    public void testText() {
        Element e = new Element(Tag.valueOf("p"), baseUri);
        e.text("Hello World");
        assertEquals("Hello World", e.text());
        assertTrue(e.hasText());
    }

    @Test
    public void testOwnText() {
        TextNode tn = new TextNode(" hello ", baseUri);
        div.appendChild(tn);
        assertEquals("hello", div.ownText());
    }

    @Test
    public void testTextPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), baseUri);
        TextNode tn = new TextNode("  hello\n  world  ", baseUri);
        pre.appendChild(tn);
        assertEquals("  hello\n  world  ", pre.text()); // should be preserved
    }

    @Test
    public void testHasText() {
        assertFalse(div.hasText()); // empty
        div.appendChild(new TextNode("x", baseUri));
        assertTrue(div.hasText());
    }

    @Test
    public void testHtml() {
        Element e = new Element(Tag.valueOf("p"), baseUri);
        e.text("hello");
        assertEquals("<p>hello</p>", e.html());
    }

    @Test
    public void testHtmlSetter() {
        div.html("<span>foo</span>");
        assertEquals(1, div.children().size());
        assertEquals("span", div.child(0).tagName());
    }

    @Test
    public void testGetElementsByTag() {
        Elements spans = div.getElementsByTag("span");
        assertEquals(0, spans.size()); // none yet
        div.appendChild(new Element(Tag.valueOf("span"), baseUri));
        spans = div.getElementsByTag("span");
        assertEquals(1, spans.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        div.getElementsByTag("");
    }

    @Test
    public void testGetElementById() {
        Element target = new Element(Tag.valueOf("a"), baseUri);
        target.attr("id", "myid");
        div.appendChild(target);
        Element found = div.getElementById("myid");
        assertSame(target, found);
        assertNull(div.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmpty() {
        div.getElementById("");
    }

    @Test
    public void testGetElementsByClass() {
        Element target = new Element(Tag.valueOf("div"), baseUri);
        target.addClass("foo");
        div.appendChild(target);
        Elements els = div.getElementsByClass("foo");
        assertEquals(1, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmpty() {
        div.getElementsByClass("");
    }

    @Test
    public void testHasClass() {
        div.addClass("active");
        assertTrue(div.hasClass("active"));
        assertFalse(div.hasClass("inactive"));
    }

    @Test
    public void testAddRemoveToggleClass() {
        div.addClass("a");
        assertTrue(div.hasClass("a"));
        div.removeClass("a");
        assertFalse(div.hasClass("a"));
        div.toggleClass("b");
        assertTrue(div.hasClass("b"));
        div.toggleClass("b");
        assertFalse(div.hasClass("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNull() {
        div.addClass(null);
    }

    @Test
    public void testVal() {
        Element input = new Element(Tag.valueOf("input"), baseUri);
        input.attr("value", "test");
        assertEquals("test", input.val());
        input.val("new");
        assertEquals("new", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), baseUri);
        textarea.text("content");
        assertEquals("content", textarea.val());
        textarea.val("updated");
        assertEquals("updated", textarea.text());
    }

    @Test
    public void testSiblingElements() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        div.appendChild(a);
        div.appendChild(b);
        Elements siblings = a.siblingElements();
        assertEquals(2, siblings.size()); // includes p and b? Actually p also child
        // div has children: p, a, b. a's siblings are p and b.
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(p));
        assertTrue(siblings.contains(b));
    }

    @Test
    public void testNextPreviousElementSibling() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        div.appendChild(a);
        div.appendChild(b);
        assertSame(a, p.nextElementSibling());
        assertSame(p, a.previousElementSibling());
        assertNull(b.nextElementSibling());
    }

    @Test
    public void testFirstLastElementSibling() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        div.appendChild(a);
        div.appendChild(b);
        assertSame(p, a.firstElementSibling());
        assertSame(b, a.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        Element b = new Element(Tag.valueOf("b"), baseUri);
        div.appendChild(a);
        div.appendChild(b);
        assertEquals(0, (int) p.elementSiblingIndex());
        assertEquals(1, (int) a.elementSiblingIndex());
        assertEquals(2, (int) b.elementSiblingIndex());
    }

    @Test
    public void testEmpty() {
        div.appendChild(new Element(Tag.valueOf("span"), baseUri));
        div.empty();
        assertEquals(0, div.children().size());
    }

    @Test
    public void testClone() {
        Element original = new Element(Tag.valueOf("div"), baseUri);
        original.attr("id", "orig");
        original.addClass("myclass");
        Element clone = original.clone();
        assertNotNull(clone);
        assertEquals(original.id(), clone.id());
        assertTrue(clone.hasClass("myclass"));
        // ensure classNames set is not shared (cloned object resets classNames to null)
        clone.removeClass("myclass");
        assertTrue(original.hasClass("myclass")); // original unaffected
    }

    @Test
    public void testEquals() {
        Element a = new Element(Tag.valueOf("div"), baseUri);
        Element b = new Element(Tag.valueOf("div"), baseUri);
        assertFalse(a.equals(b)); // not same reference
        assertTrue(a.equals(a));
    }

    @Test
    public void testHashCode() {
        Element a = new Element(Tag.valueOf("div"), baseUri);
        Element b = new Element(Tag.valueOf("div"), baseUri);
        assertNotEquals(a.hashCode(), b.hashCode()); // different identity
    }

    @Test
    public void testData() {
        DataNode dn = new DataNode("data content", baseUri);
        div.appendChild(dn);
        assertEquals("data content", div.data());
    }

    @Test
    public void testAppendPrependHtml() {
        div.append("<span>foo</span>");
        assertEquals(2, div.children().size()); // p + span
        assertEquals("span", div.child(1).tagName());

        div.prepend("<b>bar</b>");
        assertEquals(3, div.children().size());
        assertEquals("b", div.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        div.append(null);
    }

    @Test
    public void testWrap() {
        div.wrap("<div class='wrapper'></div>");
        // now div's parent should be the wrapper
        Element wrapper = div.parent();
        assertNotNull(wrapper);
        assertEquals("wrapper", wrapper.className().trim());
    }

    @Test
    public void testSelect() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        a.attr("href", "http://example.com");
        div.appendChild(a);
        Elements selected = div.select("a[href]");
        assertEquals(1, selected.size());
        assertSame(a, selected.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectInvalidQuery() {
        div.select("invalid:query");
    }

    @Test
    public void testTagNameLowerCase() {
        Element e = new Element(Tag.valueOf("DIV"), baseUri);
        assertEquals("div", e.tagName());
    }

    @Test
    public void testIsBlock() {
        assertTrue(div.isBlock()); // div is block
        assertFalse(new Element(Tag.valueOf("span"), baseUri).isBlock());
    }
}