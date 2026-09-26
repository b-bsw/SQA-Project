package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/", new ParseErrorList(16, 16), ParseSettings.htmlDefault);
    }

    private Element element(String name) {
        return new Element(Tag.valueOf(name, ParseSettings.htmlDefault), "http://example.com/");
    }

    private ParseErrorList errors() {
        return new ParseErrorList(16, 16);
    }

    @Test
    public void testInitialStateAndSetters() {
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertTrue(builder.getPendingTableCharacters().isEmpty());

        builder.framesetOk(false);
        assertFalse(builder.framesetOk());

        builder.markInsertionMode();
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
        assertEquals(HtmlTreeBuilderState.Initial, builder.originalState());

        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());

        Element head = element("head");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());
    }

    @Test
    public void testDefaultSettings() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void testParseFragmentWithContext() {
        List<Node> nodes = builder.parseFragment("<p>one</p>", element("body"), "http://example.com/", errors(), ParseSettings.htmlDefault);
        assertEquals(1, nodes.size());
        assertEquals("p", nodes.get(0).nodeName());
        assertEquals("one", ((Element) nodes.get(0)).text());
    }

    @Test
    public void testParseFragmentWithoutContext() {
        List<Node> nodes = builder.parseFragment("<p>x</p>", null, "http://example.com/", errors(), ParseSettings.htmlDefault);
        assertEquals(1, nodes.size());
        assertEquals("html", nodes.get(0).nodeName());
    }

    @Test
    public void testParseFragmentEmptyInput() {
        List<Node> nodes = builder.parseFragment("", element("body"), "http://example.com/", errors(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test(expected = NullPointerException.class)
    public void testParseFragmentNullInputThrows() {
        builder.parseFragment(null, element("body"), "http://example.com/", errors(), ParseSettings.htmlDefault);
    }

    @Test
    public void testMaybeSetBaseUri() {
        assertEquals("http://example.com/", builder.getBaseUri());

        Element base = element("base");
        base.attr("href", "http://example.com/base/");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/base/", builder.getBaseUri());
        assertEquals("http://example.com/base/", builder.getDocument().baseUri());

        Element otherBase = element("base");
        otherBase.attr("href", "http://example.com/other/");
        builder.maybeSetBaseUri(otherBase);
        assertEquals("http://example.com/base/", builder.getBaseUri());
    }

    @Test
    public void testInsertAndStackQueries() {
        Element el = builder.insertStartTag("div");
        assertSame(el, builder.getDocument().childNode(0));
        assertTrue(builder.onStack(el));
        assertSame(el, builder.currentElement());
        assertSame(el, builder.getFromStack("div"));

        assertTrue(builder.removeFromStack(el));
        assertNull(builder.getFromStack("div"));
        assertFalse(builder.removeFromStack(el));
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testInsertTokenStartTag() {
        Token.StartTag tag = new Token.StartTag().name("div");
        Element el = builder.insert(tag);
        assertEquals("div", el.nodeName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertTokenStartTagSelfClosing() {
        Token.StartTag brTag = new Token.StartTag().name("br").selfClosing(true);
        Element br = builder.insert(brTag);
        assertEquals("br", br.nodeName());
        assertTrue(builder.onStack(br));
    }

    @Test
    public void testInsertForm() {
        Token.StartTag formTag = new Token.StartTag().name("form");
        FormElement form = builder.insertForm(formTag, true);
        assertSame(form, builder.getFormElement());
        assertTrue(builder.onStack(form));

        builder.getStack().clear();
        FormElement detached = builder.insertForm(new Token.StartTag().name("form"), false);
        assertSame(detached, builder.getFormElement());
        assertFalse(builder.onStack(detached));
    }

    @Test
    public void testPopStackToClose() {
        builder.push(element("li"));
        builder.push(element("p"));
        builder.push(element("div"));
        builder.popStackToClose("p");
        assertEquals(1, builder.getStack().size());
        assertEquals("li", builder.getStack().get(0).nodeName());

        builder.push(element("a"));
        builder.popStackToClose("missing");
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void testPopStackToCloseVarargsAndBefore() {
        builder.push(element("li"));
        builder.push(element("p"));
        builder.popStackToClose("div", "p");
        assertEquals(1, builder.getStack().size());
        assertEquals("li", builder.getStack().get(0).nodeName());

        builder.getStack().clear();
        builder.push(element("li"));
        builder.push(element("div"));
        builder.push(element("p"));
        builder.popStackToBefore("div");
        assertEquals(2, builder.getStack().size());
        assertEquals("div", builder.getStack().get(1).nodeName());
    }

    @Test
    public void testClearStackToTableContext() {
        builder.getStack().clear();
        Element html = element("html");
        Element table = element("table");
        Element tr = element("tr");
        builder.push(html);
        builder.push(table);
        builder.push(tr);

        builder.clearStackToTableContext();
        assertEquals(2, builder.getStack().size());
        assertSame(table, builder.getStack().get(1));
    }

    @Test
    public void testStackManipulation() {
        Element a = element("a");
        Element b = element("b");
        Element c = element("c");
        builder.push(a);
        builder.push(c);

        builder.insertOnStackAfter(a, b);
        assertSame(b, builder.aboveOnStack(c));

        Element d = element("d");
        builder.replaceOnStack(c, d);
        assertEquals("d", builder.getStack().get(2).nodeName());
        assertSame(a, builder.aboveOnStack(b));

        assertSame(d, builder.pop());
    }

    @Test
    public void testResetInsertionMode() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("select"));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());

        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("td"));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, builder.state());

        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("tr"));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, builder.state());
    }

    @Test
    public void testTableScope() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("table"));
        builder.push(element("div"));

        assertTrue(builder.inTableScope("div"));
        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("html"));
    }

    @Test
    public void testSelectScope() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("option"));

        assertTrue(builder.inSelectScope("option"));
        builder.pop();
        assertFalse(builder.inSelectScope("option"));
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("li"));
        builder.push(element("p"));

        builder.generateImpliedEndTags("");
        assertEquals(1, builder.getStack().size());
        assertEquals("html", builder.getStack().get(0).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsExcluding() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("li"));
        builder.push(element("p"));

        builder.generateImpliedEndTags("li");
        assertEquals(2, builder.getStack().size());
        assertEquals("li", builder.getStack().get(1).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsNoop() {
        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("div"));

        builder.generateImpliedEndTags();
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testSpecialElements() {
        assertTrue(builder.isSpecial(element("div")));
        assertFalse(builder.isSpecial(element("span")));
    }

    @Test
    public void testFormattingElementsBasics() {
        Element b = element("b");
        builder.pushActiveFormattingElements(b);
        assertSame(b, builder.lastFormattingElement());
        assertSame(b, builder.getActiveFormattingElement("b"));
        assertSame(b, builder.removeLastFormattingElement());
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testFormattingElementsLimit() {
        Element a = element("b");
        Element b = element("b");
        Element c = element("b");
        Element a2 = element("b");

        builder.pushActiveFormattingElements(a);
        builder.pushActiveFormattingElements(b);
        builder.pushActiveFormattingElements(c);
        builder.pushActiveFormattingElements(a2);

        assertFalse(builder.isInActiveFormattingElements(a));
        assertTrue(builder.isInActiveFormattingElements(a2));
    }

    @Test
    public void testFormattingElementsMarkerAndClear() {
        Element b = element("b");
        builder.pushActiveFormattingElements(b);
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(element("i"));

        builder.clearFormattingElementsToLastMarker();
        assertSame(b, builder.lastFormattingElement());

        builder.clearFormattingElementsToLastMarker();
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElements() {
        Element b = element("b");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();

        Element top = builder.currentElement();
        assertEquals("b", top.nodeName());
        assertTrue(builder.onStack(top));
        assertFalse(builder.isInActiveFormattingElements(b));
        assertTrue(builder.isInActiveFormattingElements(top));
    }

    @Test
    public void testRemoveReplaceActiveFormattingElements() {
        Element a = element("b");
        Element i = element("i");
        builder.pushActiveFormattingElements(a);
        builder.pushActiveFormattingElements(i);

        builder.removeFromActiveFormattingElements(i);
        assertFalse(builder.isInActiveFormattingElements(i));

        Element c = element("b");
        builder.replaceActiveFormattingElement(a, c);
        assertSame(c, builder.getActiveFormattingElement("b"));
        assertFalse(builder.isInActiveFormattingElements(a));
    }

    @Test
    public void testPendingTableCharacters() {
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        builder.newPendingTableCharacters();
        builder.setPendingTableCharacters(Arrays.asList("a", "b"));
        assertEquals(Arrays.asList("a", "b"), builder.getPendingTableCharacters());
    }

    @Test
    public void testFosterInsertParent() {
        Element html = element("html");
        Element table = element("table");
        builder.getStack().clear();
        builder.push(html);
        builder.push(table);

        Element p = element("p");
        builder.insertInFosterParent(p);
        assertSame(html, p.parent());

        Element html2 = element("html");
        Element table2 = element("table");
        html2.appendChild(table2);
        builder.getStack().clear();
        builder.push(html2);
        builder.push(table2);

        Element p2 = element("p");
        builder.insertInFosterParent(p2);
        assertSame(html2, p2.parent());

        builder.getStack().clear();
        Element html3 = element("html");
        builder.push(html3);
        Element p3 = element("p");
        builder.insertInFosterParent(p3);
        assertSame(html3, p3.parent());
    }
}