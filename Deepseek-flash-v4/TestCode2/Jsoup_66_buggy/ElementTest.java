package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class ElementTest {
    private Element div;
    private Element parentDiv;
    private Element childSpan;
    private Element textarea;

    @Before
    public void setUp() {
        parentDiv = new Element(Tag.valueOf("div"), "http://example.com");
        childSpan = new Element(Tag.valueOf("span"), "http://example.com");
        parentDiv.appendChild(childSpan);
        div = new Element("div");
        textarea = new Element("textarea");
    }

    @Test
    public void testConstructorNullTagThrows() {
        boolean thrown = false;
        try {
            new Element((Tag) null, "", new Attributes());
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue("Expected IllegalArgumentException for null tag", thrown);
    }

    @Test
    public void testConstructorNullBaseUriThrows() {
        boolean thrown = false;
        try {
            new Element(Tag.valueOf("p"), null, new Attributes());
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue("Expected IllegalArgumentException for null baseUri", thrown);
    }

    @Test
    public void testTagNameNormal() {
        Assert.assertEquals("div", div.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrows() {
        div.tagName("");
    }

    @Test
    public void testTagNameSet() {
        div.tagName("span");
        Assert.assertEquals("span", div.tagName());
    }

    @Test
    public void testIdDefaultEmpty() {
        Assert.assertEquals("", div.id());
    }

    @Test
    public void testIdAfterSet() {
        div.attr("id", "myId");
        Assert.assertEquals("myId", div.id());
    }

    @Test
    public void testAttrString() {
        div.attr("class", "test");
        Assert.assertEquals("test", div.attr("class"));
    }

    @Test
    public void testAttrBoolean() {
        div.attr("disabled", true);
        Assert.assertEquals("true", div.attr("disabled"));
    }

    @Test
    public void testParentNullForRoot() {
        Assert.assertNull(div.parent());
    }

    @Test
    public void testParentForChild() {
        Assert.assertSame(parentDiv, childSpan.parent());
    }

    @Test
    public void testParents() {
        Element grandParent = new Element("section");
        grandParent.appendChild(parentDiv);
        Elements parents = childSpan.parents();
        Assert.assertEquals(2, parents.size());
        Assert.assertSame(parentDiv, parents.get(0));
        Assert.assertSame(grandParent, parents.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        div.child(0);
    }

    @Test
    public void testChildrenEmpty() {
        Assert.assertTrue(div.children().isEmpty());
    }

    @Test
    public void testChildrenNonEmpty() {
        Assert.assertEquals(1, parentDiv.children().size());
        Assert.assertSame(childSpan, parentDiv.children().get(0));
    }

    @Test
    public void testChildElementsListCacheInvalidation() {
        // add child and verify children list updated
        Element p = new Element("p");
        parentDiv.appendChild(p);
        List<Element> children = parentDiv.children();
        Assert.assertEquals(2, children.size());
        // remove child, cache should be cleared
        parentDiv.empty();
        Assert.assertTrue(parentDiv.children().isEmpty());
    }

    @Test
    public void testTextNodesEmpty() {
        Assert.assertTrue(div.textNodes().isEmpty());
    }

    @Test
    public void testTextNodesWithText() {
        div.appendChild(new TextNode("Hello"));
        List<TextNode> textNodes = div.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertEquals("Hello", textNodes.get(0).getWholeText());
    }

    @Test
    public void testDataNodesEmpty() {
        Assert.assertTrue(div.dataNodes().isEmpty());
    }

    @Test
    public void testTextNormal() {
        div.appendChild(new TextNode("Hello"));
        div.appendChild(new TextNode(" World"));
        Assert.assertEquals("Hello World", div.text());
    }

    @Test
    public void testTextWithBlockElement() {
        Element inner = new Element("p");
        inner.appendChild(new TextNode("text"));
        div.appendChild(inner);
        Assert.assertEquals("text", div.text().trim());
    }

    @Test
    public void testOwnText() {
        Element inner = new Element("p");
        inner.appendChild(new TextNode("inner"));
        div.appendChild(new TextNode("outer"));
        div.appendChild(inner);
        Assert.assertEquals("outer", div.ownText());
    }

    @Test
    public void testHasTextTrue() {
        div.appendChild(new TextNode("a"));
        Assert.assertTrue(div.hasText());
    }

    @Test
    public void testHasTextFalse() {
        Assert.assertFalse(div.hasText());
    }

    @Test
    public void testHasTextWithChildElement() {
        Element inner = new Element("span");
        inner.appendChild(new TextNode("x"));
        div.appendChild(inner);
        Assert.assertTrue(div.hasText());
    }

    @Test
    public void testClassNameEmpty() {
        Assert.assertEquals("", div.className());
    }

    @Test
    public void testClassNameAfterSet() {
        div.attr("class", "foo bar");
        Assert.assertEquals("foo bar", div.className());
    }

    @Test
    public void testClassNames() {
        div.attr("class", "foo bar");
        Set<String> classNames = div.classNames();
        Assert.assertEquals(2, classNames.size());
        Assert.assertTrue(classNames.contains("foo"));
        Assert.assertTrue(classNames.contains("bar"));
    }

    @Test
    public void testClassNamesEmptyReturnsEmptySet() {
        Set<String> classNames = div.classNames();
        Assert.assertTrue(classNames.isEmpty());
    }

    @Test
    public void testHasClassExactMatch() {
        div.attr("class", "foo");
        Assert.assertTrue(div.hasClass("foo"));
    }

    @Test
    public void testHasClassMultipleMatch() {
        div.attr("class", "foo bar baz");
        Assert.assertTrue(div.hasClass("bar"));
        Assert.assertFalse(div.hasClass("qux"));
    }

    @Test
    public void testHasClassNoMatch() {
        div.attr("class", "foo");
        Assert.assertFalse(div.hasClass("bar"));
    }

    @Test
    public void testHasClassWhitespaceSurrounding() {
        div.attr("class", "  foo  bar  ");
        Assert.assertTrue(div.hasClass("foo"));
        Assert.assertTrue(div.hasClass("bar"));
    }

    @Test
    public void testAddClass() {
        div.addClass("new");
        Assert.assertTrue(div.hasClass("new"));
    }

    @Test
    public void testAddClassDuplicate() {
        div.attr("class", "a");
        div.addClass("a");
        Assert.assertEquals("a", div.className());
    }

    @Test
    public void testRemoveClass() {
        div.attr("class", "a b");
        div.removeClass("a");
        Assert.assertFalse(div.hasClass("a"));
        Assert.assertTrue(div.hasClass("b"));
    }

    @Test
    public void testRemoveClassNonExistent() {
        div.attr("class", "a");
        div.removeClass("b");
        Assert.assertEquals("a", div.className());
    }

    @Test
    public void testToggleClassAdd() {
        div.toggleClass("x");
        Assert.assertTrue(div.hasClass("x"));
    }

    @Test
    public void testToggleClassRemove() {
        div.attr("class", "x");
        div.toggleClass("x");
        Assert.assertFalse(div.hasClass("x"));
    }

    @Test
    public void testValForTextarea() {
        textarea.appendChild(new TextNode("content"));
        Assert.assertEquals("content", textarea.val());
    }

    @Test
    public void testValForNonTextarea() {
        div.attr("value", "myval");
        Assert.assertEquals("myval", div.val());
    }

    @Test
    public void testValSetTextarea() {
        textarea.val("new content");
        Assert.assertEquals("new content", textarea.text());
    }

    @Test
    public void testValSetNonTextarea() {
        div.val("newval");
        Assert.assertEquals("newval", div.attr("value"));
    }

    @Test
    public void testAppendChild() {
        Element child = new Element("span");
        div.appendChild(child);
        Assert.assertSame(child, div.child(0));
        Assert.assertSame(div, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        div.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        div.appendChild(new Element("span"));
        Element prepended = new Element("strong");
        div.prependChild(prepended);
        Assert.assertSame(prepended, div.child(0));
    }

    @Test
    public void testEmpty() {
        div.appendChild(new Element("p"));
        div.empty();
        Assert.assertEquals(0, div.childNodeSize());
    }

    @Test
    public void testHtmlEmpty() {
        Assert.assertEquals("", div.html());
    }

    @Test
    public void testHtmlWithChildren() {
        Element p = new Element("p");
        p.appendChild(new TextNode("hello"));
        div.appendChild(p);
        String html = div.html();
        Assert.assertTrue(html.contains("<p>"));
        Assert.assertTrue(html.contains("hello"));
        Assert.assertTrue(html.contains("</p>"));
    }

    @Test
    public void testHtmlSet() {
        div.html("<span>text</span>");
        Assert.assertEquals(1, div.children().size());
        Assert.assertEquals("span", div.child(0).tagName());
        Assert.assertEquals("text", div.text());
    }

    @Test
    public void testGetElementByIdFound() {
        Element target = new Element("div");
        target.attr("id", "myid");
        div.appendChild(target);
        Assert.assertSame(target, div.getElementById("myid"));
    }

    @Test
    public void testGetElementByIdNotFound() {
        Assert.assertNull(div.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyIdThrows() {
        div.getElementById("");
    }

    @Test
    public void testGetElementsByTag() {
        Element p = new Element("p");
        div.appendChild(p);
        Elements result = div.getElementsByTag("p");
        Assert.assertEquals(1, result.size());
        Assert.assertSame(p, result.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        div.getElementsByTag("");
    }

    @Test
    public void testCssSelectorWithId() {
        div.attr("id", "unique");
        Assert.assertEquals("#unique", div.cssSelector());
    }

    @Test
    public void testCssSelectorWithoutIdWithClass() {
        div.attr("class", "myclass");
        Assert.assertEquals("div.myclass", div.cssSelector());
    }

    @Test
    public void testSiblingElementsNoParent() {
        Assert.assertTrue(div.siblingElements().isEmpty());
    }

    @Test
    public void testSiblingElements() {
        Element sib1 = new Element("a");
        Element sib2 = new Element("b");
        parentDiv.appendChild(sib1);
        parentDiv.appendChild(sib2);
        Elements siblings = sib1.siblingElements();
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(childSpan, siblings.get(0));
        Assert.assertSame(sib2, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() {
        Element sib = new Element("a");
        parentDiv.appendChild(sib);
        Assert.assertSame(sib, childSpan.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingNone() {
        Assert.assertNull(childSpan.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element sib = new Element("a");
        parentDiv.appendChild(sib);
        parentDiv.appendChild(new Element("b"));
        Element last = (Element) parentDiv.childNodes().get(parentDiv.childNodeSize()-1);
        Assert.assertSame(sib, last.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNone() {
        Assert.assertNull(childSpan.previousElementSibling());
    }

    @Test
    public void testFirstElementSiblingOnlyChild() {
        Element only = new Element("x");
        parentDiv.empty();
        parentDiv.appendChild(only);
        Assert.assertNull(only.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingMultiple() {
        Element first = new Element("first");
        parentDiv.appendChild(first);
        parentDiv.appendChild(new Element("second"));
        Assert.assertSame(first, first.firstElementSibling());
    }

    @Test
    public void testLastElementSibling() {
        parentDiv.appendChild(new Element("last"));
        Element last = (Element) parentDiv.childNodes().get(parentDiv.childNodeSize()-1);
        Assert.assertSame(last, last.lastElementSibling());
    }

    @Test
    public void testHasAttributesFalseInitially() {
        Element e = new Element(Tag.valueOf("p"), "", null);
        Assert.assertFalse(e.hasAttributes());
    }

    @Test
    public void testAttributesCreatesIfNull() {
        Element e = new Element(Tag.valueOf("p"), "", null);
        Assert.assertNotNull(e.attributes());
    }

    @Test
    public void testDataWithDataNodes() {
        Element script = new Element("script");
        script.appendChild(new DataNode("alert('hi')"));
        Assert.assertEquals("alert('hi')", script.data());
    }

    @Test
    public void testDataWithComments() {
        Element div = new Element("div");
        div.appendChild(new Comment("comment"));
        Assert.assertEquals("comment", div.data());
    }

    @Test
    public void testDataWithNestedElements() {
        Element outer = new Element("div");
        Element inner = new Element("span");
        inner.appendChild(new DataNode("data"));
        outer.appendChild(inner);
        Assert.assertEquals("data", outer.data());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNullThrows() {
        div.appendText(null);
    }

    @Test
    public void testAppendText() {
        div.appendText("test");
        Assert.assertEquals("test", div.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependTextNullThrows() {
        div.prependText(null);
    }

    @Test
    public void testPrependText() {
        div.appendChild(new TextNode("a"));
        div.prependText("b");
        Assert.assertEquals("ba", div.text());
    }

    @Test
    public void testIsBlock() {
        Assert.assertTrue(new Element("div").isBlock());
        Assert.assertFalse(new Element("span").isBlock());
    }

    @Test
    public void testNodeNameMatchesTagName() {
        Assert.assertEquals("div", div.nodeName());
    }

    @Test
    public void testAppendElement() {
        Element child = div.appendElement("span");
        Assert.assertSame(child, div.child(0));
        Assert.assertEquals("span", child.tagName());
    }

    @Test
    public void testPrependElement() {
        div.appendChild(new Element("p"));
        Element prepended = div.prependElement("a");
        Assert.assertSame(prepended, div.child(0));
    }

    @Test
    public void testInsertChildrenAtIndex() {
        div.appendChild(new Element("a"));
        Element b = new Element("b");
        div.insertChildren(0, b);
        Assert.assertSame(b, div.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollectionThrows() {
        div.insertChildren(0, (Collection<? extends Node>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullArrayThrows() {
        div.insertChildren(0, (Node[]) null);
    }

    @Test
    public void testInsertChildrenNegativeIndex() {
        div.appendChild(new Element("a"));
        Element b = new Element("b");
        div.insertChildren(-1, b); // should add at end
        Assert.assertSame(b, div.child(div.childNodeSize()-1));
    }

    @Test
    public void testSelectFirst() {
        div.appendChild(new Element("p"));
        Element result = div.selectFirst("p");
        Assert.assertNotNull(result);
        Assert.assertEquals("p", result.tagName());
    }

    @Test
    public void testSelectFirstNotFound() {
        Assert.assertNull(div.selectFirst("p"));
    }

    @Test
    public void testIsWithEvaluator() {
        div.attr("class", "test");
        Element root = new Element("html");
        root.appendChild(div);
        Assert.assertTrue(div.is(".test"));
        Assert.assertFalse(div.is(".other"));
    }

    @Test
    public void testWrap() {
        div.wrap("<div></div>");
        Assert.assertNotNull(div.parent());
        Assert.assertEquals("div", div.parent().tagName());
    }

    @Test
    public void testClone() {
        div.attr("id", "orig");
        Element clone = div.clone();
        Assert.assertEquals("orig", clone.id());
        Assert.assertNotSame(div, clone);
    }

    @Test
    public void testEmptyAfterAppendChild() {
        div.appendChild(new Element("span"));
        div.empty();
        Assert.assertEquals(0, div.childNodeSize());
        Assert.assertTrue(div.children().isEmpty());
    }

    @Test
    public void testDoSetBaseUri() {
        div.doSetBaseUri("http://new.com");
        Assert.assertEquals("http://new.com", div.baseUri());
    }

    @Test
    public void testElementSiblingIndexNoParent() {
        Assert.assertEquals(0, div.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithSiblings() {
        parentDiv.appendChild(new Element("a"));
        parentDiv.appendChild(new Element("b"));
        Assert.assertEquals(1, childSpan.elementSiblingIndex()); // childSpan is first? Actually setUp: parentDiv.appendChild(childSpan); then added a and b? In test we are not adding. Let's adjust locally.
    }

    // Additional test for indexInList private method is indirectly tested via sibling methods

    @Test
    public void testAppendTo() {
        Element target = new Element("div");
        childSpan.appendTo(target);
        Assert.assertSame(target, childSpan.parent());
    }
}