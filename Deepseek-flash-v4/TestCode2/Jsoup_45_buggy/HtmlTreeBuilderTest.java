package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder b;

    @Before
    public void setUp() {
        b = new HtmlTreeBuilder();
    }

    private Element el(String name) {
        return new Element(Tag.valueOf(name), "http://example.com");
    }

    private void setStack(Element... elements) {
        ArrayList<Element> stack = new ArrayList<Element>();
        for (Element element : elements) {
            stack.add(element);
        }
        b.stack = stack;
    }

    private String stackNames() {
        StringBuilder sb = new StringBuilder("[");
        List<Element> stack = b.getStack();
        for (int i = 0; i < stack.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(stack.get(i).nodeName());
        }
        return sb.append("]").toString();
    }

    @Test
    public void testParse() {
        Document parsed = b.parse("<html><body><p>Hello</p></body></html>", "http://example.com/", new ParseErrorList(16, 10));
        assertNotNull(parsed);
        assertSame(parsed, b.getDocument());
        assertEquals("http://example.com/", b.getBaseUri());
    }

    @Test
    public void testStateAndFrameset() {
        assertFalse(b.isFragmentParsing());
        b.transition(HtmlTreeBuilderState.Initial);
        assertEquals(HtmlTreeBuilderState.Initial, b.state());
        b.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.Initial, b.originalState());
        b.transition(HtmlTreeBuilderState.InBody);
        b.framesetOk(false);
        assertFalse(b.framesetOk());
        b.framesetOk(true);
        assertTrue(b.framesetOk());
    }

    @Test
    public void testDocumentAndBaseUriAccessors() {
        Document doc = new Document("http://example.com/");
        b.doc = doc;
        b.baseUri = "http://example.com/";
        assertSame(doc, b.getDocument());
        assertEquals("http://example.com/", b.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri() {
        b.baseUri = "http://example.com/";
        Element base = el("base");
        base.attr("href", "http://example.com/root");
        b.maybeSetBaseUri(base);
        assertEquals("http://example.com/root", b.getBaseUri());

        Element ignored = el("base");
        ignored.attr("href", "http://other.com/root");
        b.maybeSetBaseUri(ignored);
        assertEquals("http://example.com/root", b.getBaseUri());
    }

    @Test
    public void testInsertStartTag() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("span");
        Element span = b.insert(startTag);
        assertSame(parent, span.parentNode());
        assertTrue(b.onStack(span));
        assertEquals(2, b.getStack().size());
    }

    @Test
    public void testInsertEmpty() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        Element br = b.insertEmpty(startTag);
        assertSame(parent, br.parentNode());
        assertFalse(b.onStack(br));
    }

    @Test
    public void testInsertStartTagByName() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Element p = b.insertStartTag("p");
        assertSame(parent, p.parentNode());
        assertTrue(b.onStack(p));
    }

    @Test
    public void testInsertForm() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement form = b.insertForm(startTag, true);
        assertSame(form, b.getFormElement());
        assertSame(parent, form.parentNode());
        assertTrue(b.onStack(form));
    }

    @Test
    public void testInsertComment() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Token.Comment comment = new Token.Comment();
        comment.data("hello");
        b.insert(comment);
        Node child = parent.childNodes().get(0);
        assertTrue(child instanceof Comment);
        assertEquals("hello", ((Comment) child).getData());
    }

    @Test
    public void testInsertCharacterTextNode() {
        Element parent = el("div");
        setStack(parent);
        b.baseUri = "http://example.com/";
        Token.Character character = new Token.Character("hello");
        b.insert(character);
        Node child = parent.childNodes().get(0);
        assertTrue(child instanceof TextNode);
        assertEquals("hello", ((TextNode) child).getWholeText());
    }

    @Test
    public void testInsertCharacterDataNodeInScript() {
        Element script = el("script");
        setStack(script);
        b.baseUri = "http://example.com/";
        Token.Character character = new Token.Character("var x=1;");
        b.insert(character);
        Node child = script.childNodes().get(0);
        assertTrue(child instanceof DataNode);
        assertEquals("var x=1;", ((DataNode) child).getWholeData());
    }

    @Test
    public void testStackOperations() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        setStack(html, body);
        assertSame(body, b.pop());
        setStack(html);
        b.push(div);
        assertEquals("[html, div]", stackNames());
        assertTrue(b.onStack(div));
        assertFalse(b.onStack(el("div")));
        assertSame(html, b.getFromStack("html"));
        assertNull(b.getFromStack("body"));
        assertTrue(b.removeFromStack(html));
        assertFalse(b.removeFromStack(html));
    }

    @Test
    public void testPopStackToClose() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        Element p = el("p");
        setStack(html, body, div, p);
        b.popStackToClose("p");
        assertEquals("[html, body, div]", stackNames());

        setStack(html, body, div);
        b.popStackToClose("body");
        assertEquals("[html]", stackNames());
    }

    @Test
    public void testPopStackToCloseVarargs() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        Element p = el("p");
        setStack(html, body, div, p);
        b.popStackToClose("span", "div");
        assertEquals("[html, body]", stackNames());
    }

    @Test
    public void testPopStackToBefore() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        Element p = el("p");
        setStack(html, body, div, p);
        b.popStackToBefore("div");
        assertEquals("[html, body, div]", stackNames());
    }

    @Test
    public void testClearStackToTableContext() {
        setStack(el("html"), el("table"), el("tbody"), el("tr"));
        b.clearStackToTableContext();
        assertEquals("[html, table]", stackNames());

        setStack(el("html"), el("body"), el("div"));
        b.clearStackToTableContext();
        assertEquals("[html]", stackNames());
    }

    @Test
    public void testAboveOnStack() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        setStack(html, body, div);
        assertSame(html, b.aboveOnStack(body));
        assertSame(body, b.aboveOnStack(div));
    }

    @Test
    public void testInsertOnStackAfterAndReplace() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        Element p = el("p");
        setStack(html, body);
        b.insertOnStackAfter(html, div);
        assertEquals("[html, div, body]", stackNames());
        b.replaceOnStack(div, p);
        assertEquals("[html, p, body]", stackNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfterNotFoundThrows() {
        setStack(el("html"), el("body"));
        b.insertOnStackAfter(el("div"), el("p"));
    }

    @Test
    public void testScope() {
        Element html = el("html");
        Element body = el("body");
        Element div = el("div");
        setStack(html, body, div);
        assertTrue(b.inScope("div"));
        assertFalse(b.inScope("p"));

        setStack(html, el("table"), div);
        assertFalse(b.inScope("div"));

        setStack(html, body, el("ul"), el("li"));
        assertTrue(b.inListItemScope("li"));
        setStack(html, body, el("ul"), div);
        assertFalse(b.inListItemScope("li"));

        setStack(html, el("table"), el("td"));
        assertTrue(b.inTableScope("td"));
        setStack(html, el("table"), el("tr"));
        assertFalse(b.inTableScope("td"));
    }

    @Test
    public void testInSelectScope() {
        setStack(el("html"), el("option"));
        assertTrue(b.inSelectScope("option"));
        setStack(el("html"), el("div"));
        assertFalse(b.inSelectScope("option"));
    }

    @Test
    public void testSetters() {
        Element head = el("head");
        b.setHeadElement(head);
        assertSame(head, b.getHeadElement());

        b.setFosterInserts(true);
        assertTrue(b.isFosterInserts());
        b.setFosterInserts(false);
        assertFalse(b.isFosterInserts());

        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        b.setFormElement(form);
        assertSame(form, b.getFormElement());

        b.newPendingTableCharacters();
        assertTrue(b.getPendingTableCharacters().isEmpty());
        List<String> pending = new ArrayList<String>();
        pending.add("cell");
        b.setPendingTableCharacters(pending);
        assertEquals(pending, b.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        setStack(el("html"), el("body"), el("li"), el("p"));
        b.generateImpliedEndTags();
        assertEquals("[html, body]", stackNames());

        setStack(el("html"), el("body"), el("li"), el("p"));
        b.generateImpliedEndTags("li");
        assertEquals("[html, body, li]", stackNames());
    }

    @Test
    public void testIsSpecial() {
        assertTrue(b.isSpecial(el("script")));
        assertFalse(b.isSpecial(el("div")));
    }

    @Test
    public void testFormattingElementsBasics() {
        assertNull(b.lastFormattingElement());
        assertNull(b.removeLastFormattingElement());

        Element bEl = el("b");
        b.pushActiveFormattingElements(bEl);
        assertSame(bEl, b.lastFormattingElement());
        assertSame(bEl, b.removeLastFormattingElement());
        assertNull(b.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElementsDeduplicates() {
        Element b1 = el("b");
        Element b2 = el("b");
        Element b3 = el("b");
        Element b4 = el("b");
        b.pushActiveFormattingElements(b1);
        b.pushActiveFormattingElements(b2);
        b.pushActiveFormattingElements(b3);
        b.pushActiveFormattingElements(b4);
        assertSame(b4, b.removeLastFormattingElement());
        assertSame(b3, b.removeLastFormattingElement());
        assertSame(b2, b.removeLastFormattingElement());
        assertNull(b.removeLastFormattingElement());
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        Element bEl = el("b");
        Element iEl = el("i");
        b.pushActiveFormattingElements(bEl);
        b.insertMarkerToFormattingElements();
        b.pushActiveFormattingElements(iEl);

        b.clearFormattingElementsToLastMarker();
        assertSame(bEl, b.lastFormattingElement());
        assertTrue(b.isInActiveFormattingElements(bEl));
        assertFalse(b.isInActiveFormattingElements(iEl));
    }

    @Test
    public void testRemoveAndGetActiveFormattingElement() {
        Element bEl = el("b");
        Element iEl = el("i");
        Element uEl = el("u");
        b.pushActiveFormattingElements(bEl);
        b.pushActiveFormattingElements(iEl);

        assertSame(iEl, b.getActiveFormattingElement("i"));
        b.removeFromActiveFormattingElements(bEl);
        assertFalse(b.isInActiveFormattingElements(bEl));
        assertTrue(b.isInActiveFormattingElements(iEl));

        b.replaceActiveFormattingElement(iEl, uEl);
        assertSame(uEl, b.getActiveFormattingElement("u"));
        assertNull(b.getActiveFormattingElement("i"));
    }

    @Test
    public void testFormattingMarkerStopsSearch() {
        Element bEl = el("b");
        b.pushActiveFormattingElements(bEl);
        b.insertMarkerToFormattingElements();
        assertNull(b.getActiveFormattingElement("b"));
    }

    @Test
    public void testInsertInFosterParent() {
        Element html = el("html");
        Element body = el("body");
        setStack(html, body);
        TextNode tn = new TextNode("x", "http://example.com");
        b.insertInFosterParent(tn);
        assertSame(html, tn.parentNode());

        Element wrapper = el("div");
        Element table = el("table");
        wrapper.appendChild(table);
        setStack(html, body, table);
        TextNode tn2 = new TextNode("y", "http://example.com");
        b.insertInFosterParent(tn2);
        assertSame(wrapper, tn2.parentNode());
        assertEquals(2, wrapper.childNodes().size());
    }

    @Test
    public void testToString() {
        setStack(el("html"));
        b.transition(HtmlTreeBuilderState.InBody);
        assertTrue(b.toString().contains("TreeBuilder"));
    }
}