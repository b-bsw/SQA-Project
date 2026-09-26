package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private Parser parser;
    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), BASE_URI, parser);
    }

    @Test
    public void defaultSettingsUsesHtmlDefault() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void initialiseParseResetsStateAndFlags() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.framesetOk(false);
        builder.markInsertionMode();

        builder.initialiseParse(new StringReader("x"), "http://other/", parser);

        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertEquals("http://other/", builder.getBaseUri());
        assertNotNull(builder.getDocument());
    }

    @Test
    public void parseFragmentWithNullContextParsesNodes() {
        List<Node> nodes = builder.parseFragment("<p>Hello</p>", null, BASE_URI, parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void parseFragmentWithContextReturnsChildNodes() {
        Element context = new Element(Tag.valueOf("div"), BASE_URI);
        List<Node> nodes = builder.parseFragment("<p>Hi</p>", context, BASE_URI, parser);
        assertEquals(1, nodes.size());
        Element p = (Element) nodes.get(0);
        assertEquals("p", p.tagName());
        assertEquals("Hi", p.text());
    }

    @Test
    public void parseFragmentSetsBaseUriAndFragmentFlag() {
        builder.parseFragment("", null, "http://fragment.example/", parser);
        assertEquals("http://fragment.example/", builder.getBaseUri());
        assertTrue(builder.isFragmentParsing());
    }

    @Test(expected = NullPointerException.class)
    public void parseFragmentNullInputThrows() {
        builder.parseFragment(null, null, BASE_URI, parser);
    }

    @Test
    public void insertElementAddsToStackAndDocument() {
        Element el = new Element(Tag.valueOf("div"), BASE_URI);
        builder.insert(el);
        assertTrue(builder.onStack(el));
        assertEquals(1, builder.getDocument().childNodes().size());
        assertSame(el, builder.getDocument().childNode(0));
    }

    @Test
    public void insertStartTagAddsNewElementToStack() {
        Element el = builder.insertStartTag("span");
        assertEquals("span", el.tagName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void getAndSetHeadElement() {
        Element head = new Element(Tag.valueOf("head"), BASE_URI);
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());
    }

    @Test
    public void getAndSetFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        builder.setFormElement(form);
        assertSame(form, builder.getFormElement());
    }

    @Test
    public void transitionAndInsertionModeState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
        builder.transition(HtmlTreeBuilderState.BeforeHead);
        assertEquals(HtmlTreeBuilderState.BeforeHead, builder.state());
    }

    @Test
    public void framesetOkFlag() {
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
    }

    @Test
    public void fosterInsertsFlag() {
        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
    }

    @Test
    public void maybeSetBaseUriOnlyOnce() {
        Element base = new Element(Tag.valueOf("base"), BASE_URI);
        base.attr("href", "http://example.com/doc");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/doc", builder.getBaseUri());
        assertEquals("http://example.com/doc", builder.getDocument().baseUri());

        Element other = new Element(Tag.valueOf("base"), BASE_URI);
        other.attr("href", "http://other.example.com/doc");
        builder.maybeSetBaseUri(other);
        assertEquals("http://example.com/doc", builder.getBaseUri());
    }

    @Test
    public void stackPushPopAndSearch() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        builder.push(div);
        builder.push(span);
        assertSame(span, builder.pop());
        assertTrue(builder.onStack(div));
        assertFalse(builder.onStack(span));
        assertSame(div, builder.getFromStack("div"));
        assertNull(builder.getFromStack("span"));
    }

    @Test
    public void removeFromStackRemovesOnlyIdenticalElement() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        Element otherDiv = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(div);
        assertTrue(builder.removeFromStack(div));
        assertFalse(builder.removeFromStack(div));
        assertFalse(builder.removeFromStack(otherDiv));
    }

    @Test
    public void stackMutationHelpers() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        builder.push(html);
        builder.push(div);
        assertSame(html, builder.aboveOnStack(div));
        builder.insertOnStackAfter(div, span);
        assertSame(span, builder.getStack().get(2));
        Element newDiv = new Element(Tag.valueOf("div"), BASE_URI);
        builder.replaceOnStack(div, newDiv);
        assertFalse(builder.onStack(div));
        assertTrue(builder.onStack(newDiv));
    }

    @Test
    public void popStackToCloseSingleNameRemovesThroughMatch() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        builder.push(html);
        builder.push(span);
        builder.push(p);
        builder.popStackToClose("span");
        assertEquals(1, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
    }

    @Test
    public void popStackToCloseMultipleNamesStopsOnFirstMatch() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        builder.push(html);
        builder.push(span);
        builder.push(p);
        builder.popStackToClose("p", "span");
        assertEquals(2, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
        assertSame(span, builder.getStack().get(1));
    }

    @Test
    public void popStackToBeforeStopsBeforeName() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        builder.push(html);
        builder.push(span);
        builder.push(p);
        builder.popStackToBefore("span");
        assertEquals(2, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
        assertSame(span, builder.getStack().get(1));
    }

    @Test
    public void clearStackToTableContextStopsAtTable() {
        Element table = new Element(Tag.valueOf("table"), BASE_URI);
        Element tr = new Element(Tag.valueOf("tr"), BASE_URI);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(table);
        builder.push(tr);
        builder.push(div);
        builder.clearStackToTableContext();
        assertEquals(1, builder.getStack().size());
        assertSame(table, builder.getStack().get(0));
    }

    @Test
    public void resetInsertionModeOnEmptyStackLeavesState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void resetInsertionModeForBodyEntersInBody() {
        builder.push(new Element(Tag.valueOf("html"), BASE_URI));
        builder.push(new Element(Tag.valueOf("body"), BASE_URI));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void resetInsertionModeForSelectEntersInSelect() {
        builder.push(new Element(Tag.valueOf("html"), BASE_URI));
        builder.push(new Element(Tag.valueOf("select"), BASE_URI));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());
    }

    @Test
    public void scopeChecksRespectStackAndSearchTypes() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(html);
        builder.push(div);
        assertTrue(builder.inScope("div"));
        assertFalse(builder.inScope("p"));
        assertTrue(builder.inListItemScope("div"));
        assertTrue(builder.inButtonScope("div"));
        assertTrue(builder.inTableScope("div"));
        assertFalse(builder.inTableScope("p"));
    }

    @Test
    public void scopeChecksEmptyStackReturnFalse() {
        assertFalse(builder.inScope("div"));
        assertFalse(builder.inTableScope("div"));
    }

    @Test
    public void selectScopeCheck() {
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element option = new Element(Tag.valueOf("option"), BASE_URI);
        Element target = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(html);
        builder.push(option);
        builder.push(target);
        assertTrue(builder.inSelectScope("div"));
        builder.push(new Element(Tag.valueOf("p"), BASE_URI));
        assertFalse(builder.inSelectScope("div"));
    }

    @Test
    public void formattingElementsAddRemoveAndMarker() {
        Element b1 = new Element(Tag.valueOf("b"), BASE_URI);
        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());
        builder.pushActiveFormattingElements(b1);
        assertSame(b1, builder.lastFormattingElement());
        assertTrue(builder.isInActiveFormattingElements(b1));
        assertSame(b1, builder.getActiveFormattingElement("b"));
        builder.removeFromActiveFormattingElements(b1);
        assertFalse(builder.isInActiveFormattingElements(b1));
        builder.insertMarkerToFormattingElements();
        assertNull(builder.lastFormattingElement());
        builder.clearFormattingElementsToLastMarker();
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void removeLastFormattingElementReturnsTopAndClears() {
        Element b = new Element(Tag.valueOf("b"), BASE_URI);
        builder.pushActiveFormattingElements(b);
        assertSame(b, builder.removeLastFormattingElement());
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void pushActiveFormattingElementsRemovesThirdDuplicate() {
        Element b1 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b2 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b3 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b4 = new Element(Tag.valueOf("b"), BASE_URI);
        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        builder.pushActiveFormattingElements(b4);
        assertFalse(builder.isInActiveFormattingElements(b1));
        assertTrue(builder.isInActiveFormattingElements(b2));
        assertTrue(builder.isInActiveFormattingElements(b3));
        assertTrue(builder.isInActiveFormattingElements(b4));
    }

    @Test
    public void reconstructFormattingElementsInsertsReplacement() {
        Element b = new Element(Tag.valueOf("b"), BASE_URI);
        builder.pushActiveFormattingElements(b);
        builder.reconstructFormattingElements();
        Element replacement = builder.getActiveFormattingElement("b");
        assertNotNull(replacement);
        assertTrue(builder.onStack(replacement));
    }

    @Test
    public void generateImpliedEndTagsPopsOnlyEndTags() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        Element li1 = new Element(Tag.valueOf("li"), BASE_URI);
        Element li2 = new Element(Tag.valueOf("li"), BASE_URI);
        builder.push(div);
        builder.push(li1);
        builder.push(li2);
        builder.generateImpliedEndTags("p");
        assertEquals(1, builder.getStack().size());
        assertSame(div, builder.getStack().get(0));
    }

    @Test
    public void isSpecialRecognizesSpecialTag() {
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("script"), BASE_URI)));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("span"), BASE_URI)));
    }

    @Test
    public void pendingTableCharactersLifecycle() {
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        builder.getPendingTableCharacters().add("abc");
        assertEquals(1, builder.getPendingTableCharacters().size());
        builder.newPendingTableCharacters();
        assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void fosterInsertWithoutTableAppendsToFirstStackElement() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(div);
        TextNode text = new TextNode("x");
        builder.insertInFosterParent(text);
        assertSame(text, div.childNode(0));
    }

    @Test
    public void fosterInsertIntoParentWhenTableOnStack() {
        Element body = new Element(Tag.valueOf("body"), BASE_URI);
        Element table = new Element(Tag.valueOf("table"), BASE_URI);
        body.appendChild(table);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(div);
        builder.push(table);
        TextNode text = new TextNode("x");
        builder.insertInFosterParent(text);
        assertSame(text, body.childNode(0));
        assertSame(table, body.childNode(1));
    }

    @Test
    public void insertOnStackAfterMissingThrows() {
        Element after = new Element(Tag.valueOf("div"), BASE_URI);
        Element in = new Element(Tag.valueOf("span"), BASE_URI);
        try {
            builder.insertOnStackAfter(after, in);
            fail("Expected exception");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    @Test
    public void toStringContainsState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertTrue(builder.toString().contains("state=" + builder.state()));
    }
}