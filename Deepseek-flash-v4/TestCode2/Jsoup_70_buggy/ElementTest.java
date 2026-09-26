package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {
    private Element div;
    private Element parentDiv;
    private Element span;
    private TextNode textNode;

    @Before
    public void setUp() {
        parentDiv = new Element(Tag.valueOf("div"), "");
        div = new Element(Tag.valueOf("div"), "");
        span = new Element(Tag.valueOf("span"), "");
        textNode = new TextNode("hello world");
    }

    // === Constructor tests ===
    @Test(expected = IllegalArgumentException.class)
    public void constructorNullTag() {
        new Element((Tag) null, "", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullBaseUri() {
        new Element(Tag.valueOf("p"), null, new Attributes());
    }

    @Test
    public void constructorTagString() {
        Element e = new Element("p");
        assertEquals("p", e.tagName());
        assertNotNull(e.attributes());
        assertEquals("", e.baseUri());
    }

    // === appendChild tests ===
    @Test(expected = IllegalArgumentException.class)
    public void appendChildNull() {
        div.appendChild(null);
    }

    @Test
    public void appendChildAddsNode() {
        div.appendChild(span);
        assertEquals(1, div.childNodeSize());
        assertSame(span, div.childNode(0));
    }

    @Test
    public void appendChildSetsSiblingIndex() {
        div.appendChild(span);
        div.appendChild(new Element(Tag.valueOf("p"), ""));
        assertEquals(1, span.siblingIndex());
    }

    // === children tests ===
    @Test
    public void childrenOnlyElements() {
        div.appendChild(span);
        div.appendChild(new TextNode("text"));
        Elements kids = div.children();
        assertEquals(1, kids.size());
        assertSame(span, kids.get(0));
    }

    @Test
    public void childrenEmptyWhenNoElements() {
        div.appendChild(new TextNode("text"));
        assertTrue(div.children().isEmpty());
    }

    @Test
    public void childIndexOutOfBounds() {
        div.appendChild(span);
        try {
            div.child(2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    // === childElementsList caching tests ===
    @Test
    public void childElementsListCachedAndCleared() {
        div.appendChild(span);
        List<Element> list1 = div.childElementsList();
        div.appendChild(new Element(Tag.valueOf("p"), ""));
        List<Element> list2 = div.childElementsList();
        assertEquals(2, list2.size());
        // after modification, the cache should be cleared so list1 is obsolete
        // but we can verify that list2 is different reference
        assertNotSame(list1, list2);
    }

    // === text() tests ===
    @Test
    public void textWithChildTextNodes() {
        div.appendChild(textNode);
        assertEquals("hello world", div.text());
    }

    @Test
    public void textWithBlockElementAddsSpace() {
        Element block = new Element(Tag.valueOf("p"), "");
        block.appendChild(new TextNode("first"));
        div.appendChild(block);
        div.appendChild(new TextNode("second"));
        assertEquals("first second", div.text());
    }

    @Test
    public void textWithBrAddsSpace() {
        div.appendChild(new TextNode("line1"));
        Element br = new Element(Tag.valueOf("br"), "");
        div.appendChild(br);
        div.appendChild(new TextNode("line2"));
        assertEquals("line1 line2", div.text());
    }

    @Test
    public void ownTextIgnoresChildElements() {
        div.appendChild(textNode);
        Element inner = new Element(Tag.valueOf("span"), "");
        inner.appendChild(new TextNode("inner"));
        div.appendChild(inner);
        assertEquals("hello world", div.ownText());
    }

    // === hasText tests ===
    @Test
    public void hasTextWithNonBlankTextNode() {
        div.appendChild(textNode);
        assertTrue(div.hasText());
    }

    @Test
    public void hasTextWithBlankTextNode() {
        div.appendChild(new TextNode("   "));
        assertFalse(div.hasText());
    }

    @Test
    public void hasTextEmptyElementFalse() {
        assertFalse(div.hasText());
    }

    // === class handling tests ===
    @Test
    public void classNamesEmptyWhenNoClass() {
        assertTrue(div.classNames().isEmpty());
    }

    @Test
    public void classNamesParsesMultipleClasses() {
        div.attr("class", "a b c");
        Set<String> classes = div.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("a"));
        assertTrue(classes.contains("b"));
        assertTrue(classes.contains("c"));
    }

    @Test
    public void hasClassExactMatch() {
        div.attr("class", "foo");
        assertTrue(div.hasClass("foo"));
        assertFalse(div.hasClass("fo"));
    }

    @Test
    public void hasClassSubstringNotMatch() {
        div.attr("class", "foo bar");
        assertTrue(div.hasClass("foo"));
        assertTrue(div.hasClass("bar"));
        assertFalse(div.hasClass("oo"));
    }

    @Test
    public void hasClassEmptyClassFalse() {
        assertFalse(div.hasClass("anything"));
    }

    @Test
    public void addClassAndCheck() {
        div.addClass("newclass");
        assertTrue(div.hasClass("newclass"));
    }

    @Test
    public void removeClass() {
        div.attr("class", "a b");
        div.removeClass("a");
        assertFalse(div.hasClass("a"));
        assertTrue(div.hasClass("b"));
    }

    @Test
    public void toggleClassAdd() {
        div.toggleClass("x");
        assertTrue(div.hasClass("x"));
    }

    @Test
    public void toggleClassRemove() {
        div.attr("class", "x");
        div.toggleClass("x");
        assertFalse(div.hasClass("x"));
    }

    // === empty tests ===
    @Test
    public void emptyRemovesChildren() {
        div.appendChild(span);
        div.empty();
        assertEquals(0, div.childNodeSize());
        assertTrue(div.children().isEmpty());
    }

    // === cssSelector tests ===
    @Test
    public void cssSelectorWithId() {
        div.attr("id", "myid");
        assertEquals("#myid", div.cssSelector());
    }

    @Test
    public void cssSelectorWithClass() {
        div.attr("class", "myclass");
        parentDiv.appendChild(div);
        assertTrue(div.cssSelector().contains(".myclass"));
    }

    // === getElementById tests ===
    @Test
    public void getElementByIdFound() {
        Element found = new Element(Tag.valueOf("div"), "");
        found.attr("id", "unique");
        parentDiv.appendChild(found);
        assertSame(found, parentDiv.getElementById("unique"));
    }

    @Test
    public void getElementByIdNotFound() {
        assertNull(parentDiv.getElementById("nonexistent"));
    }

    // === getElementsByTag tests ===
    @Test
    public void getElementsByTagReturnsMatching() {
        div.appendChild(span);
        div.appendChild(new Element(Tag.valueOf("p"), ""));
        Elements spans = div.getElementsByTag("span");
        assertEquals(1, spans.size());
        assertSame(span, spans.get(0));
    }

    // === val tests ===
    @Test
    public void valForTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void valForInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "test");
        assertEquals("test", input.val());
    }

    // === siblingElements tests ===
    @Test
    public void siblingElementsExcludesSelf() {
        parentDiv.appendChild(div);
        parentDiv.appendChild(span);
        Elements siblings = div.siblingElements();
        assertEquals(1, siblings.size());
        assertSame(span, siblings.get(0));
    }

    // === nextElementSibling / previousElementSibling tests ===
    @Test
    public void nextElementSiblingExists() {
        parentDiv.appendChild(div);
        parentDiv.appendChild(span);
        assertSame(span, div.nextElementSibling());
    }

    @Test
    public void nextElementSiblingNone() {
        parentDiv.appendChild(div);
        assertNull(div.nextElementSibling());
    }

    @Test
    public void previousElementSiblingExists() {
        parentDiv.appendChild(div);
        parentDiv.appendChild(span);
        assertSame(div, span.previousElementSibling());
    }

    // === data tests ===
    @Test
    public void dataTextNodesOnly() {
        div.appendChild(new TextNode("text"));
        assertEquals("", div.data()); // TextNode is not DataNode
    }

    @Test
    public void dataWithDataNode() {
        DataNode data = new DataNode("some data");
        div.appendChild(data);
        assertEquals("some data", div.data());
    }

    // === outerHtml tests (basic) ===
    @Test
    public void outerHtmlSimpleElement() {
        div.attr("id", "test");
        String html = div.outerHtml();
        assertTrue(html.startsWith("<div"));
        assertTrue(html.contains("id=\"test\""));
        assertTrue(html.endsWith("</div>"));
    }

    // === html(String) tests ===
    @Test
    public void htmlStringSetsInnerHtml() {
        div.html("<p>hello</p>");
        Elements p = div.getElementsByTag("p");
        assertEquals(1, p.size());
        assertEquals("hello", p.get(0).text());
    }

    // === tagName(String) tests ===
    @Test(expected = IllegalArgumentException.class)
    public void tagNameEmptyThrows() {
        div.tagName("");
    }

    @Test
    public void tagNameChanges() {
        div.tagName("span");
        assertEquals("span", div.tagName());
    }

    // === shallowClone tests ===
    @Test
    public void shallowCloneCopiesAttributes() {
        div.attr("class", "clone");
        Element clone = div.shallowClone();
        assertEquals("clone", clone.className());
        assertNull(clone.parent()); // shallow clone has no parent
    }

    // === doClone tests ===
    @Test
    public void doCloneDeepCopiesChildren() {
        div.appendChild(span);
        Element clone = div.doClone(div.parent());
        assertEquals(1, clone.childNodeSize());
        assertNotSame(span, clone.childNode(0)); // different instances
    }

    // === nodelistChanged clears shadowChildrenRef ===
    @Test
    public void nodelistChangedClearsCache() {
        div.appendChild(span);
        List<Element> cached = div.childElementsList();
        div.appendChild(new Element(Tag.valueOf("p"), ""));
        // after change, cache should be cleared
        List<Element> after = div.childElementsList();
        assertEquals(2, after.size());
    }

    // === ensureChildNodes tests ===
    @Test
    public void ensureChildNodesReturnsNewListWhenEmpty() {
        List<Node> list = div.ensureChildNodes();
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    // === insertChildren tests ===
    @Test
    public void insertChildrenAtFront() {
        div.appendChild(new TextNode("second"));
        Element first = new Element(Tag.valueOf("p"), "");
        div.insertChildren(0, first);
        assertSame(first, div.childNode(0));
        assertEquals(2, div.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenNullCollection() {
        div.insertChildren(0, (Collection<? extends Node>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenNullVarargs() {
        div.insertChildren(0, (Node[]) null);
    }

    @Test
    public void insertChildrenNegativeIndexNormalizes() {
        div.appendChild(new TextNode("a"));
        div.appendChild(new TextNode("b"));
        Element insert = new Element(Tag.valueOf("p"), "");
        div.insertChildren(-1, insert); // should insert at index 1 (size+1-1)
        assertSame(insert, div.childNode(1));
    }

    // === append / prepend HTML tests ===
    @Test
    public void appendHtmlParses() {
        div.append("<p>test</p>");
        assertEquals(1, div.children().size());
        assertEquals("test", div.text());
    }

    @Test
    public void prependHtml() {
        div.appendChild(new TextNode("after"));
        div.prepend("<p>before</p>");
        assertEquals(2, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof Element);
        assertEquals("before", ((Element) div.childNode(0)).text());
    }

    // === parent tests ===
    @Test
    public void parentReturnsNullWhenOrphan() {
        assertNull(div.parent());
    }

    @Test
    public void parentAfterAppend() {
        parentDiv.appendChild(div);
        assertSame(parentDiv, div.parent());
    }

    // === isBlock tests ===
    @Test
    public void isBlockForDiv() {
        assertTrue(div.isBlock()); // div is block by default
    }

    @Test
    public void isBlockForSpan() {
        assertFalse(span.isBlock());
    }

    // === dataset tests ===
    @Test
    public void datasetReturnsNonEmpty() {
        div.attr("data-name", "value");
        assertEquals("value", div.dataset().get("name"));
    }

    // === getElementsByAttribute tests ===
    @Test
    public void getElementsByAttribute() {
        div.attr("href", "link");
        Elements els = div.getElementsByAttribute("href");
        assertEquals(1, els.size());
    }

    // === getElementsContainingText tests ===
    @Test
    public void getElementsContainingText() {
        div.appendChild(new TextNode("some text"));
        Elements els = div.getElementsContainingText("text");
        assertTrue(els.size() >= 1);
    }

    // === getElementsByAttributeValueMatching with regex test ===
    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatchingBadRegex() {
        div.getElementsByAttributeValueMatching("class", "[invalid");
    }

    // === parents test ===
    @Test
    public void parentsIncludesAncestors() {
        Element root = new Element(Tag.valueOf("html"), "");
        root.appendChild(parentDiv);
        parentDiv.appendChild(div);
        Elements parents = div.parents();
        assertTrue(parents.contains(parentDiv));
        assertTrue(parents.contains(root));
    }

    // === text(String) replaces content ===
    @Test
    public void textMethodReplacesContent() {
        div.appendChild(new TextNode("old"));
        div.text("new");
        assertEquals("new", div.text());
        assertEquals(1, div.childNodeSize());
    }

    // === before/after tests inbound ===
    @Test
    public void beforeInsertsBefore() {
        parentDiv.appendChild(div);
        Element before = new Element(Tag.valueOf("b"), "");
        div.before(before);
        assertSame(before, parentDiv.childNode(0));
        assertSame(div, parentDiv.childNode(1));
    }

    @Test
    public void afterInsertsAfter() {
        parentDiv.appendChild(div);
        Element after = new Element(Tag.valueOf("i"), "");
        div.after(after);
        assertSame(div, parentDiv.childNode(0));
        assertSame(after, parentDiv.childNode(1));
    }

    // === wrap test ===
    @Test
    public void wrapSurroundsElement() {
        parentDiv.appendChild(div);
        div.wrap("<div class='wrapper'></div>");
        Element wrapper = parentDiv.child(0);
        assertTrue(wrapper.hasClass("wrapper"));
        assertSame(div, wrapper.child(0));
    }
}