package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private String baseUri = "http://example.com";

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        // initialiseParse is protected but accessible because test in same package
        builder.initialiseParse(new StringReader(""), baseUri, new ParseErrorList(16, 16), ParseSettings.htmlDefault);
    }

    // --- initialiseParse ---
    @Test
    public void testInitialiseParseState() {
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertNotNull(builder.getDocument());
    }

    // --- parseFragment ---
    @Test
    public void testParseFragmentNullContextReturnsDocChildren() {
        List<Node> result = builder.parseFragment("abc", null, baseUri, new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertNotNull(result);
        assertTrue(result.isEmpty() || result.get(0) instanceof Element);
    }

    @Test
    public void testParseFragmentWithContextTitle() {
        Element context = new Element(Tag.valueOf("title"), baseUri);
        List<Node> result = builder.parseFragment("text", context, baseUri, new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertNotNull(result);
    }

    @Test
    public void testParseFragmentWithFormParent() {
        Element form = new FormElement(Tag.valueOf("form"), baseUri);
        Element context = new Element(Tag.valueOf("input"), baseUri);
        form.appendChild(context);
        builder.parseFragment("", context, baseUri, new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertNotNull(builder.getFormElement());
    }

    // --- process ---
    @Test
    public void testProcessDelegatesToState() {
        // state is Initial; process a StartTag token (should be handled, no exception)
        Token.StartTag tag = new Token.StartTag();
        tag.name("html");
        boolean result = builder.process(tag);
        // In Initial state, html tag leads to transition; just verify no exception
        assertTrue(result);
    }

    // --- maybeSetBaseUri ---
    @Test
    public void testMaybeSetBaseUriSetsWhenAbsUrlPresent() {
        Element base = new Element(Tag.valueOf("base"), baseUri);
        base.attr("href", "/newbase");
        // absUrl requires baseUri; we set baseUri on doc via initialiseParse
        builder.maybeSetBaseUri(base);
        // document's baseUri should be updated
        assertTrue(builder.getDocument().baseUri().contains("newbase"));
    }

    @Test
    public void testMaybeSetBaseUriSkipsIfAlreadySet() {
        Element base = new Element(Tag.valueOf("base"), baseUri);
        base.attr("href", "/first");
        builder.maybeSetBaseUri(base);
        Element base2 = new Element(Tag.valueOf("base"), baseUri);
        base2.attr("href", "/second");
        builder.maybeSetBaseUri(base2);
        assertTrue(builder.getDocument().baseUri().contains("first"));
        assertFalse(builder.getDocument().baseUri().contains("second"));
    }

    // --- isFragmentParsing ---
    @Test
    public void testIsFragmentParsingTrueAfterParseFragment() {
        builder.parseFragment("", null, baseUri, new ParseErrorList(16, 16), ParseSettings.htmlDefault);
        assertTrue(builder.isFragmentParsing());
    }

    // --- insert and stack operations ---
    @Test
    public void testInsertStartTagAndOnStack() {
        Element el = builder.insertStartTag("div");
        assertNotNull(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testPop() {
        Element el = builder.insertStartTag("p");
        Element popped = builder.pop();
        assertEquals(el, popped);
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testGetFromStack() {
        builder.insertStartTag("span");
        Element found = builder.getFromStack("span");
        assertNotNull(found);
        assertNull(builder.getFromStack("nonexistent"));
    }

    @Test
    public void testRemoveFromStack() {
        Element el = builder.insertStartTag("a");
        assertTrue(builder.removeFromStack(el));
        assertFalse(builder.onStack(el));
        assertFalse(builder.removeFromStack(el));
    }

    @Test
    public void testPopStackToCloseSingle() {
        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        builder.popStackToClose("li");
        assertNull(builder.getFromStack("li"));
        assertNotNull(builder.getFromStack("ul"));
    }

    @Test
    public void testPopStackToCloseMultiple() {
        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        builder.insertStartTag("p");
        builder.popStackToClose("li", "p");
        // should have popped p and li, but not ul
        assertNull(builder.getFromStack("p"));
        assertNull(builder.getFromStack("li"));
        assertNotNull(builder.getFromStack("ul"));
    }

    // --- clearStackToContext ---
    @Test
    public void testClearStackToTableContext() {
        // push some elements, then table, then more
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.clearStackToTableContext();
        // after clearing to 'table', tr and td should be gone
        assertNull(builder.getFromStack("tr"));
        assertNull(builder.getFromStack("td"));
        assertNotNull(builder.getFromStack("table"));
        assertNotNull(builder.getFromStack("body"));
    }

    // --- resetInsertionMode ---
    @Test
    public void testResetInsertionModeSelect() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("select");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());
    }

    @Test
    public void testResetInsertionModeTableCell() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, builder.state());
    }

    // --- inScope ---
    @Test
    public void testInScopeTrue() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        assertTrue(builder.inScope("div"));
        assertFalse(builder.inScope("span"));
    }

    @Test
    public void testInScopeStopsAtTable() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("div");
        assertFalse(builder.inScope("div")); // div inside table, not in scope because table is a scope element
    }

    @Test
    public void testInListItemScope() {
        builder.insertStartTag("html");
        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        assertTrue(builder.inListItemScope("li"));
        // li inside ul is in list item scope
    }

    @Test
    public void testInButtonScope() {
        builder.insertStartTag("html");
        builder.insertStartTag("button");
        builder.insertStartTag("span");
        assertTrue(builder.inButtonScope("span"));
        // button behaves like scope for extras
    }

    @Test
    public void testInTableScope() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("html"));
    }

    // --- generateImpliedEndTags ---
    @Test
    public void testGenerateImpliedEndTagsRemovesUntilMatch() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("li");
        builder.generateImpliedEndTags("p");
        // li is an implied end tag, so it should be popped, but p remains since excludeTag matches
        assertNull(builder.getFromStack("li"));
        assertNotNull(builder.getFromStack("p"));
    }

    @Test
    public void testGenerateImpliedEndTagsWithoutExclude() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("li");
        builder.generateImpliedEndTags();
        // both li and p are implied end tags? p is in list? Yes, p is in TagSearchEndTags.
        // So both should be popped until a non-implied element is current.
        assertNull(builder.getFromStack("li"));
        assertNull(builder.getFromStack("p"));
        assertNotNull(builder.getFromStack("body"));
    }

    // --- active formatting elements ---
    @Test
    public void testPushActiveFormattingElementsLimit() {
        Element a = new Element(Tag.valueOf("b"), baseUri);
        a.attr("class", "test");
        builder.pushActiveFormattingElements(a);
        builder.pushActiveFormattingElements(a.clone());
        builder.pushActiveFormattingElements(a.clone());
        // fourth identical should remove the oldest (pos 0)
        builder.pushActiveFormattingElements(a.clone());
        assertEquals(3, builder.formattingElements.size()); // three left? Actually limit is 3, so after 4th, oldest removed.
    }

    @Test
    public void testReconstructFormattingElementsWhenLastOnStack() {
        Element el = builder.insertStartTag("b");
        builder.pushActiveFormattingElements(el);
        builder.reconstructFormattingElements();
        // last is on stack, so nothing should be reconstructed
        assertEquals(1, builder.formattingElements.size());
    }

    @Test
    public void testReconstructFormattingElementsWhenLastNull() {
        builder.pushActiveFormattingElements(null);
        builder.reconstructFormattingElements();
        // last is null, so nothing done? Actually reconstruct checks last; if null, returns.
        assertTrue(builder.formattingElements.get(builder.formattingElements.size()-1) == null);
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        builder.pushActiveFormattingElements(new Element(Tag.valueOf("b"), baseUri));
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(new Element(Tag.valueOf("i"), baseUri));
        builder.clearFormattingElementsToLastMarker();
        assertEquals(1, builder.formattingElements.size());
        assertNull(builder.formattingElements.get(0));
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        Element el = new Element(Tag.valueOf("b"), baseUri);
        builder.pushActiveFormattingElements(el);
        builder.removeFromActiveFormattingElements(el);
        assertFalse(builder.isInActiveFormattingElements(el));
    }

    @Test
    public void testGetActiveFormattingElement() {
        Element a = new Element(Tag.valueOf("a"), baseUri);
        builder.pushActiveFormattingElements(a);
        assertNotNull(builder.getActiveFormattingElement("a"));
        assertNull(builder.getActiveFormattingElement("b"));
    }

    // --- insertInFosterParent ---
    @Test
    public void testInsertInFosterParentWithTable() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.setFosterInserts(true);
        TextNode text = new TextNode("foster");
        builder.insertInFosterParent(text);
        // should be inserted before the table
        Element table = builder.getFromStack("table");
        assertNotNull(table);
        Node prev = table.previousSibling();
        assertNotNull(prev);
        assertTrue(prev instanceof TextNode);
    }

    // --- isFosterInserts ---
    @Test
    public void testFosterInsertsGetterSetter() {
        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
    }

    // --- formElement ---
    @Test
    public void testFormElementSetterGetter() {
        FormElement form = new FormElement(Tag.valueOf("form"), baseUri);
        builder.setFormElement(form);
        assertSame(form, builder.getFormElement());
    }

    // --- pendingTableCharacters ---
    @Test
    public void testPendingTableCharacters() {
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        List<String> chars = new ArrayList<>();
        chars.add("a");
        builder.setPendingTableCharacters(chars);
        assertEquals(1, builder.getPendingTableCharacters().size());
        builder.newPendingTableCharacters();
        assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    // --- headElement ---
    @Test
    public void testHeadElement() {
        Element head = new Element(Tag.valueOf("head"), baseUri);
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());
    }

    // --- toString ---
    @Test
    public void testToString() {
        String str = builder.toString();
        assertNotNull(str);
        assertTrue(str.contains("TreeBuilder"));
    }
}