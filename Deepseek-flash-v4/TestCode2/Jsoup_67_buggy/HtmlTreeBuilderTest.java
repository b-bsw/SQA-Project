package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
    }

    private Element element(String tagName) {
        return new Element(Tag.valueOf(tagName, ParseSettings.htmlDefault), "http://example.com/");
    }

    @Test
    public void defaultSettingsReturnsHtmlDefault() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void initialiseParseResetsStateAndFlags() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.framesetOk(false);

        builder.initialiseParse(new StringReader(""), "http://other.example/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertSame(HtmlTreeBuilderState.Initial, builder.state());
        assertTrue(builder.framesetOk());
        assertEquals("http://other.example/", builder.getBaseUri());
    }

    @Test
    public void parseFragmentWithBodyContextReturnsChildNodes() {
        Element context = element("body");
        List<Node> nodes = builder.parseFragment("<p>one</p>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertEquals(1, nodes.size());
        assertEquals("p", nodes.get(0).nodeName());
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragmentWithNullContextAndEmptyInputReturnsEmptyList() {
        List<Node> nodes = builder.parseFragment("", null, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertNotNull(nodes);
        assertTrue(nodes.isEmpty());
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void maybeSetBaseUriUsesFirstNonEmptyHref() {
        Element base = element("a");
        base.attr("href", "http://other.example/path");

        builder.maybeSetBaseUri(base);

        assertEquals("http://other.example/path", builder.getBaseUri());
        assertEquals("http://other.example/path", builder.getDocument().baseUri());

        Element second = element("a");
        second.attr("href", "http://third.example/");
        builder.maybeSetBaseUri(second);

        assertEquals("http://other.example/path", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUriIgnoresEmptyHref() {
        builder.maybeSetBaseUri(element("a"));
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void pushAndPopElementUpdatesStack() {
        Element div = element("div");

        builder.push(div);

        assertTrue(builder.onStack(div));
        assertSame(div, builder.pop());
        assertFalse(builder.onStack(div));
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void getFromStackReturnsLastMatchingElement() {
        Element first = element("div");
        Element second = element("div");

        builder.push(first);
        builder.push(second);

        assertSame(second, builder.getFromStack("div"));
        assertNull(builder.getFromStack("span"));
    }

    @Test
    public void removeFromStackRemovesMatchingIdentity() {
        Element div = element("div");

        builder.push(div);

        assertTrue(builder.removeFromStack(div));
        assertFalse(builder.onStack(div));
        assertFalse(builder.removeFromStack(div));
    }

    @Test
    public void popStackToCloseSingleNameStopsAtMatch() {
        Element html = element("html");
        Element p = element("p");

        builder.push(html);
        builder.push(p);
        builder.popStackToClose("p");

        assertTrue(builder.onStack(html));
        assertFalse(builder.onStack(p));
    }

    @Test
    public void popStackToCloseVarargsStopsAtFirstMatch() {
        Element html = element("html");
        Element li = element("li");
        Element p = element("p");

        builder.push(html);
        builder.push(li);
        builder.push(p);
        builder.popStackToClose("li", "p");

        assertTrue(builder.onStack(li));
        assertFalse(builder.onStack(p));
    }

    @Test
    public void popStackToBeforeRemovesElementsUntilTarget() {
        Element html = element("html");
        Element p = element("p");

        builder.push(html);
        builder.push(p);
        builder.popStackToBefore("html");

        assertTrue(builder.onStack(html));
        assertFalse(builder.onStack(p));
    }

    @Test
    public void clearStackToTableContextKeepsTableAndHtml() {
        Element html = element("html");
        Element div = element("div");
        Element table = element("table");

        builder.push(html);
        builder.push(div);
        builder.push(table);
        builder.clearStackToTableContext();

        assertTrue(builder.onStack(table));
        assertTrue(builder.onStack(html));
        assertFalse(builder.onStack(div));
    }

    @Test
    public void aboveOnStackReturnsElementBelow() {
        Element html = element("html");
        Element body = element("body");

        builder.push(html);
        builder.push(body);

        assertSame(html, builder.aboveOnStack(body));
    }

    @Test
    public void insertOnStackAfterInsertsAfterElement() {
        Element html = element("html");
        Element body = element("body");

        builder.push(html);
        builder.insertOnStackAfter(html, body);

        assertSame(body, builder.getStack().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfterMissingElementThrows() {
        builder.insertOnStackAfter(element("html"), element("body"));
    }

    @Test
    public void replaceOnStackReplacesElement() {
        Element html = element("html");
        Element div = element("div");

        builder.push(html);
        builder.replaceOnStack(html, div);

        assertSame(div, builder.getStack().get(0));
        assertFalse(builder.onStack(html));
    }

    @Test
    public void inScopeUsesHtmlAsScopeBoundary() {
        Element html = element("html");
        Element div = element("div");

        builder.push(html);
        builder.push(div);

        assertTrue(builder.inScope("div"));
        assertFalse(builder.inScope("span"));
    }

    @Test
    public void listItemAndButtonScopeUseExtraBoundaries() {
        Element html = element("html");
        Element ul = element("ul");
        Element li = element("li");

        builder.push(html);
        builder.push(ul);
        builder.push(li);
        assertTrue(builder.inListItemScope("li"));

        builder.getStack().clear();
        builder.push(element("html"));
        Element button = element("button");
        builder.push(button);

        assertTrue(builder.inButtonScope("button"));
        assertFalse(builder.inScope("span", new String[]{"button"}));
    }

    @Test
    public void tableAndSelectScopeUseTheirOwnScopeLists() {
        Element html = element("html");
        Element table = element("table");

        builder.push(html);
        builder.push(table);
        assertTrue(builder.inTableScope("table"));

        builder.getStack().clear();
        builder.push(element("html"));
        Element select = element("select");
        Element option = element("option");
        builder.push(select);
        builder.push(option);
        assertTrue(builder.inSelectScope("option"));

        builder.getStack().clear();
        builder.push(element("html"));
        builder.push(element("select"));
        assertFalse(builder.inSelectScope("option"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inScopeOnEmptyStackFails() {
        builder.getStack().clear();
        builder.inScope("html");
    }

    @Test
    public void insertStartTagInsertsAndPushesNewElement() {
        Element inserted = builder.insertStartTag("div");

        assertEquals("div", inserted.nodeName());
        assertTrue(builder.onStack(inserted));
        assertSame(inserted, builder.getStack().get(0));
    }

    @Test
    public void insertElementAppendsToDocumentWhenStackEmpty() {
        Element div = element("div");

        builder.insert(div);

        assertTrue(builder.onStack(div));
        assertEquals(1, builder.getDocument().childNodes().size());
    }

    @Test
    public void insertInFosterParentUsesTableParentWhenTableHasParent() {
        Element parent = element("div");
        Element table = element("table");
        Element node = element("span");
        parent.appendChild(table);

        builder.push(parent);
        builder.push(table);

        builder.insertInFosterParent(node);

        assertEquals(2, parent.childNodes().size());
        assertSame(node, parent.childNodes().get(0));
        assertSame(table, parent.childNodes().get(1));
    }

    @Test
    public void insertInFosterParentFallsBackToFirstStackElementWithoutTable() {
        Element parent = element("div");
        Element node = element("span");

        builder.push(parent);
        builder.insertInFosterParent(node);

        assertEquals(1, parent.childNodes().size());
        assertSame(node, parent.childNodes().get(0));
    }

    @Test
    public void generateImpliedEndTagsWithoutExcludePopsImpliedEndTags() {
        Element html = element("html");
        Element p = element("p");
        Element li = element("li");

        builder.push(html);
        builder.push(p);
        builder.push(li);

        builder.generateImpliedEndTags();

        assertEquals(1, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
    }

    @Test
    public void generateImpliedEndTagsWithExcludePopsUntilExcluded() {
        Element html = element("html");
        Element p = element("p");
        Element li = element("li");

        builder.push(html);
        builder.push(p);
        builder.push(li);

        builder.generateImpliedEndTags("p");

        assertEquals(2, builder.getStack().size());
        assertTrue(builder.onStack(p));
        assertFalse(builder.onStack(li));
    }

    @Test
    public void isSpecialDistinguishesSpecialNodes() {
        assertTrue(builder.isSpecial(element("div")));
        assertFalse(builder.isSpecial(element("span")));
    }

    @Test
    public void activeFormattingElementsTracksAndLimitsDuplicates() {
        Element b1 = element("b");
        b1.attr("class", "x");
        Element b2 = element("b");
        b2.attr("class", "x");
        Element b3 = element("b");
        b3.attr("class", "x");
        Element b4 = element("b");
        b4.attr("class", "x");

        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        builder.pushActiveFormattingElements(b4);

        assertSame(b4, builder.removeLastFormattingElement());
        assertSame(b3, builder.removeLastFormattingElement());
        assertSame(b2, builder.removeLastFormattingElement());
        assertNull(builder.removeLastFormattingElement());
    }

    @Test
    public void clearFormattingElementsStopsAtLastMarker() {
        Element before = element("b");
        before.attr("class", "x");
        Element after = element("i");
        after.attr("class", "y");

        builder.pushActiveFormattingElements(before);
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(after);

        builder.clearFormattingElementsToLastMarker();

        assertSame(before, builder.lastFormattingElement());
    }

    @Test
    public void removeAndGetActiveFormattingElementWorks() {
        Element b = element("b");
        b.attr("class", "x");

        builder.pushActiveFormattingElements(b);

        assertSame(b, builder.getActiveFormattingElement("b"));
        assertTrue(builder.isInActiveFormattingElements(b));

        builder.removeFromActiveFormattingElements(b);

        assertFalse(builder.isInActiveFormattingElements(b));
    }

    @Test
    public void getActiveFormattingElementStopsAtMarker() {
        Element before = element("b");
        Element after = element("i");

        builder.pushActiveFormattingElements(before);
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(after);

        assertNull(builder.getActiveFormattingElement("b"));
    }

    @Test
    public void replaceActiveFormattingElementReplacesInQueue() {
        Element oldEl = element("b");
        oldEl.attr("class", "x");
        Element newEl = element("b");
        newEl.attr("class", "x");

        builder.pushActiveFormattingElements(oldEl);
        builder.replaceActiveFormattingElement(oldEl, newEl);

        assertSame(newEl, builder.getActiveFormattingElement("b"));
        assertFalse(builder.isInActiveFormattingElements(oldEl));
    }

    @Test
    public void reconstructFormattingElementsInsertsMissingFormattingElement() {
        Element original = element("a");

        builder.pushActiveFormattingElements(original);
        builder.reconstructFormattingElements();

        assertEquals(1, builder.getStack().size());
        assertEquals("a", builder.getStack().get(0).nodeName());
        assertNotSame(original, builder.lastFormattingElement());
    }

    @Test
    public void reconstructFormattingElementsSkipsWhenAlreadyOnStack() {
        Element el = element("a");

        builder.push(el);
        builder.pushActiveFormattingElements(el);
        int size = builder.getStack().size();

        builder.reconstructFormattingElements();

        assertEquals(size, builder.getStack().size());
        assertSame(el, builder.lastFormattingElement());
    }

    @Test
    public void stateAndFlagSettersWork() {
        assertFalse(builder.isFragmentParsing());
        assertNull(builder.originalState());

        builder.transition(HtmlTreeBuilderState.InBody);
        builder.markInsertionMode();

        assertSame(HtmlTreeBuilderState.InBody, builder.state());
        assertSame(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.framesetOk(false);
        assertFalse(builder.framesetOk());

        Element head = element("head");
        assertNull(builder.getHeadElement());
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());

        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
    }

    @Test
    public void pendingTableCharactersCanBeReplaced() {
        builder.newPendingTableCharacters();

        assertNotNull(builder.getPendingTableCharacters());
        assertEquals(0, builder.getPendingTableCharacters().size());

        List<String> chars = new ArrayList<>();
        chars.add("a");
        builder.setPendingTableCharacters(chars);

        assertSame(chars, builder.getPendingTableCharacters());
    }
}