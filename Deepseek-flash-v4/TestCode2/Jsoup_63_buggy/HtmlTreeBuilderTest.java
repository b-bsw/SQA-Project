package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;
    private ParseErrorList errors;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        errors = new ParseErrorList(16, 16);
        builder.initialiseParse(new StringReader(""), "http://example.com/", errors, ParseSettings.htmlDefault);
    }

    private Element el(String tagName) {
        return new Element(Tag.valueOf(tagName, ParseSettings.htmlDefault), "http://example.com/");
    }

    @Test
    public void testInitialState() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
        assertSame(HtmlTreeBuilderState.Initial, builder.state());
        assertEquals("http://example.com/", builder.getBaseUri());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
        assertNotNull(builder.getStack());
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void testStateAndOriginalState() {
        assertNull(builder.originalState());
        builder.transition(HtmlTreeBuilderState.InBody);
        assertSame(HtmlTreeBuilderState.InBody, builder.state());
        builder.markInsertionMode();
        builder.transition(HtmlTreeBuilderState.InTable);
        assertSame(HtmlTreeBuilderState.InTable, builder.state());
        assertSame(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOkAccessor() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testMaybeSetBaseUri() {
        Element base = el("base");
        base.attr("href", "/foo");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/foo", builder.getBaseUri());
        assertEquals("http://example.com/foo", builder.getDocument().baseUri());

        base.attr("href", "/bar");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/foo", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriIgnoredWhenHrefEmpty() {
        Element base = el("base");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testInsertStartTagPushesAndParents() {
        Element html = builder.insertStartTag("html");
        assertEquals(1, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
        assertSame(builder.getDocument(), html.parent());

        Element div = builder.insertStartTag("div");
        assertSame(html, div.parent());
        assertEquals(2, builder.getStack().size());
        assertSame(div, builder.getStack().get(1));
    }

    @Test
    public void testInsertFormOnStack() {
        Element html = builder.insertStartTag("html");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement form = builder.insertForm(startTag, true);
        assertSame(form, builder.getFormElement());
        assertEquals("form", form.tagName());
        assertSame(html, form.parent());
        assertTrue(builder.onStack(form));
    }

    @Test
    public void testInsertFormNotOnStack() {
        builder.insertStartTag("html");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement form = builder.insertForm(startTag, false);
        assertSame(form, builder.getFormElement());
        assertEquals(1, builder.getStack().size());
        assertFalse(builder.onStack(form));
    }

    @Test
    public void testStackQueries() {
        Element html = el("html");
        Element div = el("div");
        builder.push(html);
        builder.push(div);
        assertTrue(builder.onStack(html));
        assertTrue(builder.onStack(div));
        assertFalse(builder.onStack(el("span")));
        assertSame(div, builder.getFromStack("div"));
        assertNull(builder.getFromStack("span"));

        assertTrue(builder.removeFromStack(div));
        assertFalse(builder.removeFromStack(div));
        assertNull(builder.getFromStack("div"));
        assertSame(html, builder.pop());
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void testPopStackToCloseAndBefore() {
        Element html = builder.insertStartTag("html");
        builder.insertStartTag("div");
        builder.insertStartTag("li");
        builder.popStackToClose("li");
        assertEquals(2, builder.getStack().size());
        assertNull(builder.getFromStack("li"));

        builder.insertStartTag("p");
        builder.popStackToBefore("div");
        assertSame(html, builder.getFromStack("html"));
        assertSame(builder.getFromStack("div"), builder.getFromStack("div"));
        assertNull(builder.getFromStack("p"));
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testPopStackToCloseVarargs() {
        builder.insertStartTag("html");
        builder.insertStartTag("li");
        builder.insertStartTag("option");
        builder.popStackToClose("ul", "li");
        assertEquals(1, builder.getStack().size());
        assertNotNull(builder.getFromStack("html"));
    }

    @Test
    public void testClearStackToTableContext() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.clearStackToTableContext();
        assertEquals(2, builder.getStack().size());
        assertNotNull(builder.getFromStack("table"));
        assertNull(builder.getFromStack("tr"));
    }

    @Test
    public void testAboveAndReplaceOnStack() {
        Element html = builder.insertStartTag("html");
        Element div = builder.insertStartTag("div");
        assertSame(html, builder.aboveOnStack(div));

        Element span = el("span");
        builder.insertOnStackAfter(html, span);
        assertEquals(3, builder.getStack().size());
        assertSame(span, builder.getStack().get(1));

        Element p = el("p");
        builder.replaceOnStack(div, p);
        assertNull(builder.getFromStack("div"));
        assertSame(p, builder.getFromStack("p"));
    }

    @Test
    public void testResetInsertionMode() {
        builder.insertStartTag("html");
        builder.resetInsertionMode();
        assertSame(HtmlTreeBuilderState.BeforeHead, builder.state());

        builder.insertStartTag("table");
        builder.resetInsertionMode();
        assertSame(HtmlTreeBuilderState.InTable, builder.state());

        builder.insertStartTag("select");
        builder.resetInsertionMode();
        assertSame(HtmlTreeBuilderState.InSelect, builder.state());
    }

    @Test
    public void testInScopeAndListButtonTableScopes() {
        builder.insertStartTag("html");
        builder.insertStartTag("div");
        assertTrue(builder.inScope("div"));
        assertTrue(builder.inListItemScope("div"));
        assertTrue(builder.inButtonScope("div"));

        builder.insertStartTag("table");
        assertFalse(builder.inScope("div"));
        assertFalse(builder.inTableScope("div"));
        assertTrue(builder.inTableScope("table"));

        builder.insertStartTag("ol");
        assertFalse(builder.inListItemScope("div"));
        builder.insertStartTag("button");
        assertFalse(builder.inButtonScope("div"));
    }

    @Test
    public void testInSelectScope() {
        builder.insertStartTag("html");
        builder.insertStartTag("option");
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("select"));
    }

    @Test
    public void testPendingTableCharacters() {
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        List<String> chars = new ArrayList<String>();
        chars.add("a");
        builder.setPendingTableCharacters(chars);
        assertSame(chars, builder.getPendingTableCharacters());
        builder.newPendingTableCharacters();
        assertNotSame(chars, builder.getPendingTableCharacters());
        assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testFormattingElementsBasic() {
        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Element b1 = el("b");
        Element b2 = el("b");
        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        assertSame(b2, builder.lastFormattingElement());
        assertSame(b2, builder.removeLastFormattingElement());
        assertSame(b1, builder.lastFormattingElement());
        assertSame(b1, builder.getActiveFormattingElement("b"));
        assertTrue(builder.isInActiveFormattingElements(b1));
        assertFalse(builder.isInActiveFormattingElements(b2));

        builder.removeFromActiveFormattingElements(b1);
        assertFalse(builder.isInActiveFormattingElements(b1));
        assertNull(builder.getActiveFormattingElement("b"));
    }

    @Test
    public void testPushActiveFormattingElementsLimitsToThree() {
        for (int i = 0; i < 4; i++) {
            builder.pushActiveFormattingElements(el("b"));
        }
        int count = 0;
        while (builder.removeLastFormattingElement() != null) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testActiveFormattingElementReplacement() {
        Element b = el("b");
        Element p = el("p");
        builder.pushActiveFormattingElements(b);
        builder.pushActiveFormattingElements(p);
        assertSame(p, builder.getActiveFormattingElement("p"));

        Element newP = el("p");
        builder.replaceActiveFormattingElement(p, newP);
        assertSame(newP, builder.getActiveFormattingElement("p"));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(el("i"));
        builder.clearFormattingElementsToLastMarker();
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElementsInsertsMissingElement() {
        Element b = el("b");
        builder.pushActiveFormattingElements(b);
        builder.reconstructFormattingElements();
        Element onStack = builder.getFromStack("b");
        assertNotNull(onStack);
        assertTrue(builder.onStack(onStack));
        assertSame(onStack, builder.getActiveFormattingElement("b"));
    }

    @Test
    public void testGenerateImpliedEndTags() {
        Element html = builder.insertStartTag("html");
        builder.insertStartTag("p");
        builder.insertStartTag("li");
        builder.generateImpliedEndTags();
        assertSame(html, builder.getFromStack("html"));
        assertNull(builder.getFromStack("p"));
        assertNull(builder.getFromStack("li"));

        builder.insertStartTag("p");
        builder.insertStartTag("li");
        builder.generateImpliedEndTags("p");
        assertSame(html, builder.getFromStack("html"));
        assertNotNull(builder.getFromStack("p"));
        assertNull(builder.getFromStack("li"));
    }

    @Test
    public void testIsSpecial() {
        assertTrue(builder.isSpecial(el("div")));
        assertTrue(builder.isSpecial(el("br")));
        assertFalse(builder.isSpecial(el("span")));
    }

    @Test
    public void testFosterInsertWhenTableHasParent() {
        Element html = el("html");
        Element table = el("table");
        html.appendChild(table);
        builder.push(html);
        builder.push(table);
        builder.setFosterInserts(true);

        Element div = builder.insertStartTag("div");
        assertTrue(builder.isFosterInserts());
        assertSame(html, div.parent());
        assertSame(div, html.childNodes().get(0));
        assertSame(table, html.childNodes().get(1));
    }

    @Test
    public void testFosterInsertWhenTableHasNoParent() {
        Element html = el("html");
        Element table = el("table");
        builder.push(html);
        builder.push(table);
        builder.setFosterInserts(true);

        Element div = builder.insertStartTag("div");
        assertSame(html, div.parent());
        assertEquals(1, html.childNodes().size());
    }

    @Test
    public void testParseFragmentNullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>Hello</p>", null, "http://example.com/",
                new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertTrue(tb.isFragmentParsing());
    }

    @Test
    public void testParseFragmentWithContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("div");
        List<Node> nodes = tb.parseFragment("<b>Bold</b>", context, "http://example.com/",
                new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertTrue(tb.isFragmentParsing());
    }
}