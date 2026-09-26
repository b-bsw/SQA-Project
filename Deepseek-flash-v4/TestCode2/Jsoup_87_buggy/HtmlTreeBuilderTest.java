package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/", Parser.htmlParser());
    }

    private Element element(String name) {
        return new Element(Tag.valueOf(name), "http://example.com/");
    }

    private void push(String name) {
        builder.push(element(name));
    }

    private String stackNames() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < builder.getStack().size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(builder.getStack().get(i).nodeName());
        }
        return sb.append("]").toString();
    }

    private void assertResetState(HtmlTreeBuilderState expected, String... tags) {
        builder.getStack().clear();
        for (String tag : tags) {
            builder.push(element(tag));
        }
        builder.resetInsertionMode();
        assertEquals(expected, builder.state());
    }

    @Test
    public void initialStateAndDefaults() {
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFosterInserts());
        assertFalse(builder.isFragmentParsing());
        assertTrue(builder.getStack().isEmpty());
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
        assertEquals("http://example.com/", builder.getBaseUri());
        assertNotNull(builder.getDocument());
    }

    @Test
    public void transitionMarksOriginalStateAndFramesetOk() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void maybeSetBaseUriSetsOnceAndOnlyWithHref() {
        Element base = element("base");
        base.attr("href", "/path");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/path", builder.getBaseUri());
        assertEquals("http://example.com/path", builder.getDocument().baseUri());

        Element empty = element("base");
        builder.maybeSetBaseUri(empty);
        assertEquals("http://example.com/path", builder.getBaseUri());

        Element second = element("base");
        second.attr("href", "/other");
        builder.maybeSetBaseUri(second);
        assertEquals("http://example.com/path", builder.getBaseUri());
    }

    @Test
    public void insertStartTagAddsToStackAndDocument() {
        Element el = builder.insertStartTag("div");
        assertEquals("div", el.tagName());
        assertSame(el, builder.getStack().get(0));
        assertSame(el, builder.getDocument().childNode(0));
    }

    @Test
    public void insertElementAddsToStackAndDocument() {
        Element el = element("p");
        builder.insert(el);
        assertSame(el, builder.getStack().get(0));
        assertSame(el, builder.getDocument().childNode(0));
    }

    @Test
    public void insertStartTagToken() {
        Token.StartTag start = new Token.StartTag();
        start.name("div");
        Element el = builder.insert(start);
        assertEquals("div", el.nodeName());
        assertSame(el, builder.getStack().get(0));
        assertSame(el, builder.getDocument().childNode(0));
    }

    @Test
    public void insertSelfClosingVoidTag() {
        Token.StartTag br = new Token.StartTag();
        br.name("br");
        br.selfClosing(true);
        Element el = builder.insert(br);
        assertEquals("br", el.nodeName());
        assertTrue(builder.getStack().contains(el));
        assertSame(el, builder.getDocument().childNode(0));
    }

    @Test
    public void insertEmptyVoidAndUnknownTags() {
        Token.StartTag br = new Token.StartTag();
        br.name("br");
        br.selfClosing(true);
        Element brEl = builder.insertEmpty(br);
        assertEquals("br", brEl.nodeName());
        assertTrue(builder.getStack().isEmpty());
        assertFalse(brEl.tag().isSelfClosing());

        Token.StartTag custom = new Token.StartTag();
        custom.name("custom");
        custom.selfClosing(true);
        Element customEl = builder.insertEmpty(custom);
        assertTrue(customEl.tag().isSelfClosing());
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void insertFormTracksFormElementAndStack() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("form");
        FormElement fe = builder.insertForm(tag, true);
        assertSame(fe, builder.getFormElement());
        assertSame(fe, builder.getStack().get(0));
        assertSame(fe, builder.getDocument().childNode(0));

        Token.StartTag tag2 = new Token.StartTag();
        tag2.name("form");
        FormElement fe2 = builder.insertForm(tag2, false);
        assertSame(fe2, builder.getFormElement());
        assertFalse(builder.getStack().contains(fe2));
    }

    @Test
    public void insertCommentAppendsCommentNode() {
        Token.Comment comment = new Token.Comment();
        comment.data("hello");
        builder.insert(comment);
        assertEquals(1, builder.getDocument().childNodes().size());
        assertTrue(builder.getDocument().childNode(0) instanceof Comment);
        assertEquals("hello", ((Comment) builder.getDocument().childNode(0)).getData());
    }

    @Test
    public void insertCharacterCreatesTextNode() {
        builder.insertStartTag("div");
        Token.Character text = new Token.Character();
        text.data("hello");
        builder.insert(text);
        Element div = builder.getStack().get(0);
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) div.childNode(0)).getWholeText());
    }

    @Test
    public void insertCharacterInStyleCreatesDataNode() {
        builder.insertStartTag("style");
        Token.Character data = new Token.Character();
        data.data("body{}");
        builder.insert(data);
        Element style = builder.getStack().get(0);
        assertTrue(style.childNode(0) instanceof DataNode);
        assertEquals("body{}", ((DataNode) style.childNode(0)).getWholeData());
    }

    @Test
    public void popPushAndStackQueries() {
        Element a = element("a");
        builder.push(a);
        assertSame(a, builder.pop());
        assertTrue(builder.getStack().isEmpty());

        Element html = element("html");
        Element body = element("body");
        builder.push(html);
        builder.push(body);
        assertSame(html, builder.getFromStack("html"));
        assertNull(builder.getFromStack("div"));
        assertTrue(builder.onStack(body));
        assertFalse(builder.onStack(element("div")));
        assertTrue(builder.removeFromStack(body));
        assertFalse(builder.removeFromStack(body));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void popFromEmptyStackThrows() {
        builder.pop();
    }

    @Test
    public void popStackToCloseSingle() {
        push("html"); push("body"); push("div");
        builder.popStackToClose("body");
        assertEquals("[html]", stackNames());
    }

    @Test
    public void popStackToCloseMultiple() {
        push("html"); push("body"); push("li"); push("div");
        builder.popStackToClose("li", "p", "span");
        assertEquals("[html, body]", stackNames());
    }

    @Test
    public void popStackToBefore() {
        push("html"); push("body"); push("div");
        builder.popStackToBefore("body");
        assertEquals("[html, body]", stackNames());
    }

    @Test
    public void clearStackToTableContexts() {
        builder.getStack().clear();
        push("html"); push("table"); push("td");
        builder.clearStackToTableContext();
        assertEquals("[html, table]", stackNames());

        builder.getStack().clear();
        push("html"); push("tbody"); push("tr");
        builder.clearStackToTableBodyContext();
        assertEquals("[html, tbody]", stackNames());

        builder.getStack().clear();
        push("html"); push("tr"); push("td");
        builder.clearStackToTableRowContext();
        assertEquals("[html, tr]", stackNames());
    }

    @Test
    public void aboveInsertAfterAndReplaceOnStack() {
        Element html = element("html");
        Element body = element("body");
        builder.push(html);
        builder.push(body);
        assertSame(html, builder.aboveOnStack(body));

        Element div = element("div");
        builder.insertOnStackAfter(html, div);
        assertEquals("[html, div, body]", stackNames());

        Element newBody = element("body");
        builder.replaceOnStack(body, newBody);
        assertEquals("[html, div, body]", stackNames());
        assertSame(newBody, builder.getStack().get(2));
    }

    @Test
    public void resetInsertionModeBranches() {
        assertResetState(HtmlTreeBuilderState.InBody, "html", "body");
        assertResetState(HtmlTreeBuilderState.InBody, "html", "head");
        assertResetState(HtmlTreeBuilderState.InTable, "html", "table");
        assertResetState(HtmlTreeBuilderState.InRow, "html", "table", "tr");
        assertResetState(HtmlTreeBuilderState.InTableBody, "html", "table", "tbody");
        assertResetState(HtmlTreeBuilderState.InSelect, "html", "select");
        assertResetState(HtmlTreeBuilderState.InCell, "html", "body", "td");
    }

    @Test
    public void scopeChecks() {
        builder.getStack().clear();
        push("html"); push("body"); push("div");
        assertTrue(builder.inScope("div"));
        assertTrue(builder.inScope("body"));
        assertFalse(builder.inScope("span"));
        assertFalse(builder.inListItemScope("span"));
        assertFalse(builder.inButtonScope("span"));
        assertFalse(builder.inTableScope("span"));
    }

    @Test
    public void specialScopeChecks() {
        builder.getStack().clear();
        push("html"); push("body"); push("ol"); push("li");
        assertTrue(builder.inListItemScope("li"));

        builder.getStack().clear();
        push("html"); push("body"); push("button"); push("span");
        assertTrue(builder.inButtonScope("span"));

        builder.getStack().clear();
        push("html"); push("table"); push("td");
        assertTrue(builder.inTableScope("td"));
    }

    @Test
    public void selectScopeChecks() {
        builder.getStack().clear();
        push("html"); push("select"); push("option");
        assertTrue(builder.inSelectScope("option"));

        builder.getStack().clear();
        push("html"); push("select"); push("div");
        assertFalse(builder.inSelectScope("option"));
    }

    @Test
    public void headFormFosterAndPendingTableCharacters() {
        Element head = element("head");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());

        assertNull(builder.getFormElement());
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement form = builder.insertForm(formTag, false);
        assertSame(form, builder.getFormElement());

        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());

        builder.getPendingTableCharacters().add("x");
        assertEquals(1, builder.getPendingTableCharacters().size());
        builder.newPendingTableCharacters();
        assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void activeFormattingElementsManagement() {
        assertNull(builder.lastFormattingElement());
        Element b1 = element("b");
        Element b2 = element("b");
        Element b3 = element("b");
        Element b4 = element("b");
        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        builder.pushActiveFormattingElements(b4);
        assertSame(b4, builder.removeLastFormattingElement());
        assertSame(b3, builder.removeLastFormattingElement());
        assertSame(b2, builder.removeLastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Element em = element("em");
        builder.pushActiveFormattingElements(em);
        assertTrue(builder.isInActiveFormattingElements(em));
        assertSame(em, builder.getActiveFormattingElement("em"));
        assertNull(builder.getActiveFormattingElement("b"));
        Element em2 = element("em");
        builder.replaceActiveFormattingElement(em, em2);
        assertSame(em2, builder.getActiveFormattingElement("em"));
        builder.removeFromActiveFormattingElements(em2);
        assertFalse(builder.isInActiveFormattingElements(em2));
    }

    @Test
    public void reconstructFormattingElements() {
        Element b = element("b");
        b.attr("class", "x");
        builder.pushActiveFormattingElements(b);
        builder.reconstructFormattingElements();
        Element active = builder.lastFormattingElement();
        assertNotNull(active);
        assertTrue(builder.onStack(active));
        assertEquals("b", active.nodeName());
        assertEquals("x", active.attr("class"));
    }

    @Test
    public void clearFormattingElementsToLastMarker() {
        builder.pushActiveFormattingElements(element("b"));
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(element("i"));
        builder.clearFormattingElementsToLastMarker();
        Element last = builder.lastFormattingElement();
        assertNotNull(last);
        assertEquals("b", last.nodeName());
    }

    @Test
    public void generateImpliedEndTagsHonoursExclusion() {
        builder.getStack().clear();
        push("li"); push("p"); push("div"); push("p");
        builder.generateImpliedEndTags();
        assertEquals("[li, p, div]", stackNames());

        builder.getStack().clear();
        push("li"); push("p"); push("div"); push("p");
        builder.generateImpliedEndTags("p");
        assertEquals("[li, p, div, p]", stackNames());
    }

    @Test
    public void isSpecial() {
        assertTrue(builder.isSpecial(element("div")));
        assertTrue(builder.isSpecial(element("p")));
        assertFalse(builder.isSpecial(element("span")));
    }

    @Test
    public void insertInFosterParentNoTable() {
        Element html = element("html");
        builder.push(html);
        Element child = element("span");
        builder.insertInFosterParent(child);
        assertSame(child, html.childNode(0));
    }

    @Test
    public void insertInFosterParentTableWithParent() {
        Element html = element("html");
        Element table = element("table");
        html.appendChild(table);
        builder.push(html);
        builder.push(table);
        Element child = element("span");
        builder.insertInFosterParent(child);
        assertEquals(2, html.childNodes().size());
        assertSame(child, html.childNode(0));
        assertSame(table, html.childNode(1));
    }

    @Test
    public void insertInFosterParentTableWithoutParent() {
        Element html = element("html");
        Element table = element("table");
        builder.push(html);
        builder.push(table);
        Element child = element("span");
        builder.insertInFosterParent(child);
        assertEquals(1, html.childNodes().size());
        assertSame(child, html.childNode(0));
    }

    @Test
    public void parseFragmentWithContext() {
        Element context = element("body");
        List<Node> nodes = builder.parseFragment("<p>one</p>", context, "http://example.com/", Parser.htmlParser());
        assertTrue(builder.isFragmentParsing());
        assertEquals(1, nodes.size());
        assertEquals("p", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragmentWithoutContext() {
        List<Node> nodes = builder.parseFragment("<div>x</div>", null, "http://example.com/", Parser.htmlParser());
        assertTrue(builder.isFragmentParsing());
        assertEquals(1, nodes.size());
        assertEquals("div", nodes.get(0).nodeName());
    }

    @Test
    public void toStringContainsState() {
        builder.push(element("div"));
        assertTrue(builder.toString().contains("state="));
    }
}