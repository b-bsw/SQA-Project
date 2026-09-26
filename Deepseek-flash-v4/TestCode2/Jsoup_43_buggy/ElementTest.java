package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.util.*;

public class ElementTest {
    private Element root;
    private Element div;
    private Element p;

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("div"), "http://example.com");
        div = new Element(Tag.valueOf("div"), "http://example.com");
        p = new Element(Tag.valueOf("p"), "http://example.com");
        root.appendChild(div);
        div.appendChild(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullTagThrows() {
        new Element(null, "http://example.com");
    }

    @Test
    public void tagNameGetterSetter() {
        assertEquals("div", div.tagName());
        div.tagName("span");
        assertEquals("span", div.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagNameEmptyThrows() {
        div.tagName("");
    }

    @Test
    public void id() {
        div.attr("id", "myId");
        assertEquals("myId", div.id());
    }

    @Test
    public void attrChainable() {
        Element e = div.attr("data-x", "val");
        assertSame(div, e);
        assertEquals("val", div.attr("data-x"));
    }

    @Test
    public void child() {
        assertEquals(p, div.child(0));
        assertEquals(0, div.children().size()); // children only counts elements
    }

    @Test
    public void children() {
        Elements kids = div.children();
        assertEquals(1, kids.size());
        assertTrue(kids.contains(p));
    }

    @Test
    public void textNodes() {
        TextNode tn = new TextNode("hello", "");
        div.appendChild(tn);
        List<TextNode> nodes = div.textNodes();
        assertEquals(1, nodes.size());
        assertEquals("hello", nodes.get(0).text());
    }

    @Test
    public void dataNodes() {
        DataNode dn = new DataNode("data", "");
        div.appendChild(dn);
        List<DataNode> nodes = div.dataNodes();
        assertEquals(1, nodes.size());
        assertEquals("data", nodes.get(0).getWholeData());
    }

    @Test
    public void appendChild() {
        Element child = new Element(Tag.valueOf("span"), "");
        Element result = div.appendChild(child);
        assertSame(div, result);
        assertTrue(div.children().contains(child));
        assertEquals(child.parent(), div);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChildNullThrows() {
        div.appendChild(null);
    }

    @Test
    public void prependChild() {
        Element existing = new Element(Tag.valueOf("a"), "");
        div.appendChild(existing);
        Element newChild = new Element(Tag.valueOf("b"), "");
        div.prependChild(newChild);
        assertEquals(newChild, div.child(0));
        assertEquals(existing, div.child(1));
    }

    @Test
    public void insertChildren() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        List<Element> toInsert = Arrays.asList(a, b);
        div.insertChildren(0, toInsert);
        assertEquals(3, div.children().size());
        assertEquals(a, div.child(0));
        assertEquals(b, div.child(1));
        assertEquals(p, div.child(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenNullCollectionThrows() {
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenOutOfBoundsThrows() {
        div.insertChildren(5, Collections.singletonList(new Element(Tag.valueOf("x"), "")));
    }

    @Test
    public void append() {
        div.append("<span>hello</span>");
        Elements spans = div.getElementsByTag("span");
        assertEquals(1, spans.size());
        assertEquals("hello", spans.get(0).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendNullThrows() {
        div.append(null);
    }

    @Test
    public void prepend() {
        div.appendChild(p);
        div.prepend("<a>link</a>");
        assertEquals("a", div.child(0).tagName());
        assertEquals("p", div.child(1).tagName());
    }

    @Test
    public void text() {
        TextNode tn = new TextNode("Hello ", "");
        div.appendChild(tn);
        TextNode tn2 = new TextNode("World", "");
        p.appendChild(tn2);
        assertEquals("Hello World", div.text().trim());
    }

    @Test
    public void ownText() {
        TextNode tn = new TextNode("Hello ", "");
        div.appendChild(tn);
        TextNode tn2 = new TextNode("World", "");
        p.appendChild(tn2);
        assertEquals("Hello", div.ownText().trim());
    }

    @Test
    public void hasText() {
        assertFalse(div.hasText());
        TextNode tn = new TextNode("a", "");
        div.appendChild(tn);
        assertTrue(div.hasText());
    }

    @Test
    public void className() {
        div.attr("class", "foo bar");
        assertEquals("foo bar", div.className());
    }

    @Test
    public void classNames() {
        div.attr("class", " foo  bar ");
        Set<String> names = div.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void classNamesSet() {
        Set<String> newClasses = new LinkedHashSet<>(Arrays.asList("x", "y"));
        div.classNames(newClasses);
        assertEquals("x y", div.attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNamesNullThrows() {
        div.classNames(null);
    }

    @Test
    public void hasClass() {
        div.attr("class", "foo bar");
        assertTrue(div.hasClass("foo"));
        assertTrue(div.hasClass("BAR"));
        assertFalse(div.hasClass("baz"));
    }

    @Test
    public void addClass() {
        div.addClass("newClass");
        assertTrue(div.hasClass("newClass"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClassNullThrows() {
        div.addClass(null);
    }

    @Test
    public void removeClass() {
        div.attr("class", "a b");
        div.removeClass("a");
        assertFalse(div.hasClass("a"));
        assertTrue(div.hasClass("b"));
    }

    @Test
    public void toggleClass() {
        div.toggleClass("x");
        assertTrue(div.hasClass("x"));
        div.toggleClass("x");
        assertFalse(div.hasClass("x"));
    }

    @Test
    public void val() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "test");
        assertEquals("test", input.val());
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void valSetter() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("new");
        assertEquals("new", input.attr("value"));
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("text");
        assertEquals("text", textarea.text());
    }

    @Test
    public void cssSelector() {
        div.attr("id", "myDiv");
        assertEquals("#myDiv", div.cssSelector());
        Element parentDiv = new Element(Tag.valueOf("div"), "");
        Element childSpan = new Element(Tag.valueOf("span"), "");
        parentDiv.appendChild(childSpan);
        childSpan.attr("class", "cls");
        assertTrue(childSpan.cssSelector().contains("span.cls"));
    }

    @Test
    public void siblingElements() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        div.appendChild(a);
        div.appendChild(b);
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals(b, siblings.get(0));
    }

    @Test
    public void nextPreviousElementSibling() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        Element c = new Element(Tag.valueOf("c"), "");
        div.appendChild(a);
        div.appendChild(b);
        div.appendChild(c);
        assertNull(a.previousElementSibling());
        assertEquals(b, a.nextElementSibling());
        assertEquals(a, b.previousElementSibling());
        assertEquals(c, b.nextElementSibling());
        assertNull(c.nextElementSibling());
    }

    @Test
    public void firstLastElementSibling() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        div.appendChild(a);
        div.appendChild(b);
        assertEquals(a, a.firstElementSibling());
        assertEquals(b, b.lastElementSibling());
        // single child
        Element single = new Element(Tag.valueOf("x"), "");
        div.appendChild(single);
        assertEquals(single, single.firstElementSibling());
        assertEquals(single, single.lastElementSibling());
    }

    @Test
    public void elementSiblingIndex() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        div.appendChild(a);
        div.appendChild(b);
        assertEquals(0, a.elementSiblingIndex().intValue());
        assertEquals(1, b.elementSiblingIndex().intValue());
    }

    @Test
    public void parent() {
        assertEquals(div, p.parent());
        assertNull(root.parent());
    }

    @Test
    public void parents() {
        Elements parents = p.parents();
        assertEquals(2, parents.size());
        assertEquals(div, parents.get(0));
        assertEquals(root, parents.get(1));
    }

    @Test
    public void getElementsByTag() {
        Element span = new Element(Tag.valueOf("span"), "");
        div.appendChild(span);
        Elements results = root.getElementsByTag("span");
        assertEquals(1, results.size());
        assertEquals(span, results.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTagEmptyThrows() {
        root.getElementsByTag("");
    }

    @Test
    public void getElementById() {
        div.attr("id", "target");
        Element found = root.getElementById("target");
        assertEquals(div, found);
        assertNull(root.getElementById("nonexistent"));
    }

    @Test
    public void getElementsByClass() {
        div.attr("class", "myclass");
        Elements results = root.getElementsByClass("myclass");
        assertEquals(1, results.size());
        assertEquals(div, results.get(0));
    }

    @Test
    public void getElementsByAttribute() {
        div.attr("data-x", "v");
        Elements results = root.getElementsByAttribute("data-x");
        assertEquals(1, results.size());
        assertEquals(div, results.get(0));
    }

    @Test
    public void empty() {
        assertTrue(div.children().size() > 0);
        div.empty();
        assertEquals(0, div.children().size());
    }

    @Test
    public void html() {
        String html = div.html();
        assertTrue(html.contains("<p></p>"));
    }

    @Test
    public void htmlSetter() {
        div.html("<span>new</span>");
        assertEquals("new", div.text().trim());
    }

    @Test
    public void data() {
        DataNode dn = new DataNode("data123", "");
        div.appendChild(dn);
        assertEquals("data123", div.data());
    }

    @Test
    public void equalsHashCode() {
        Element e1 = new Element(Tag.valueOf("div"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");
        assertFalse(e1.equals(e2));
        assertFalse(e1.hashCode() == e2.hashCode());
        // same instance
        assertTrue(e1.equals(e1));
        // different tag
        Element e3 = new Element(Tag.valueOf("span"), "");
        assertFalse(e1.equals(e3));
    }

    @Test
    public void clone() {
        div.attr("class", "clone");
        Element cloned = div.clone();
        assertNotSame(div, cloned);
        assertEquals(div.tagName(), cloned.tagName());
        assertEquals(div.className(), cloned.className());
    }

    @Test
    public void preserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        assertTrue(Element.preserveWhitespace(pre));
        Element normal = new Element(Tag.valueOf("p"), "");
        assertFalse(Element.preserveWhitespace(normal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatchingInvalidRegex() {
        root.getElementsByAttributeValueMatching("key", "[invalid");
    }

    @Test
    public void getElementsMatchingText() {
        TextNode tn = new TextNode("hello world", "");
        div.appendChild(tn);
        Elements matches = root.getElementsMatchingText("hello.*");
        assertEquals(1, matches.size());
        assertEquals(div, matches.get(0));
    }

    @Test
    public void getAllElements() {
        Elements all = root.getAllElements();
        assertEquals(3, all.size()); // root, div, p
        assertTrue(all.contains(root));
        assertTrue(all.contains(div));
        assertTrue(all.contains(p));
    }
}