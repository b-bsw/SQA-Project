package org.jsoup.select;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

public class QueryParserTest {
    private Document doc;

    @Before
    public void setUp() {
        doc = Jsoup.parse("<html><body><div id='d1' class='foo'><p id='p1' class='foo'>Hello</p><p id='p2' class='bar'>World</p><span id='s1' class='foo'>Hi</span><a href='http://example.com'>link</a></div></body></html>");
    }

    @Test
    public void testParseTag() {
        Evaluator e = QueryParser.parse("p");
        assertTrue(e instanceof Evaluator.Tag);
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("d1")));
    }

    @Test
    public void testParseId() {
        Evaluator e = QueryParser.parse("#p1");
        assertTrue(e instanceof Evaluator.Id);
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
    }

    @Test
    public void testParseClass() {
        Evaluator e = QueryParser.parse(".foo");
        assertTrue(e instanceof Evaluator.Class);
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
    }

    @Test
    public void testParseTagWithClass() {
        Evaluator e = QueryParser.parse("p.foo");
        assertTrue(e instanceof CombiningEvaluator.And);
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
        assertFalse(e.matches(doc, doc.getElementById("s1")));
    }

    @Test
    public void testParseAttribute() {
        Evaluator e = QueryParser.parse("a[href]");
        assertTrue(e instanceof CombiningEvaluator.And);
        assertTrue(e.matches(doc, doc.getElementsByTag("a").first()));
        assertFalse(e.matches(doc, doc.getElementById("p1")));
    }

    @Test
    public void testParseChildCombinator() {
        Evaluator e = QueryParser.parse("div > p");
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("d1")));
        assertFalse(e.matches(doc, doc.getElementById("s1")));
    }

    @Test
    public void testParseDescendantCombinator() {
        Evaluator e = QueryParser.parse("body p");
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.body()));
    }

    @Test
    public void testParseGroup() {
        Evaluator e = QueryParser.parse("p, span");
        assertTrue(e instanceof CombiningEvaluator.Or);
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertTrue(e.matches(doc, doc.getElementById("s1")));
        assertFalse(e.matches(doc, doc.getElementById("d1")));
    }

    @Test
    public void testParsePseudoNthChild() {
        Evaluator e = QueryParser.parse("p:nth-child(1)");
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
    }

    @Test
    public void testParseIndexSelectors() {
        Evaluator eq0 = QueryParser.parse(":eq(0)");
        assertTrue(eq0.matches(doc, doc.getElementById("p1")));
        Evaluator gt0 = QueryParser.parse(":gt(0)");
        assertTrue(gt0.matches(doc, doc.getElementById("p2")));
        assertFalse(gt0.matches(doc, doc.getElementById("p1")));
        Evaluator lt2 = QueryParser.parse(":lt(2)");
        assertTrue(lt2.matches(doc, doc.getElementById("p1")));
    }

    @Test
    public void testParseContains() {
        Evaluator e = QueryParser.parse("p:contains(Hello)");
        assertTrue(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyQueryThrows() {
        QueryParser.parse("");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testNullQueryThrows() {
        QueryParser.parse(null);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidPseudoThrows() {
        QueryParser.parse("p:unknown");
    }

    @Test
    public void testComplexSelectorParsesAndMatches() {
        Evaluator e = QueryParser.parse("div.foo > p.bar + span");
        assertTrue(e.matches(doc, doc.getElementById("s1")));
        assertFalse(e.matches(doc, doc.getElementById("p1")));
        assertFalse(e.matches(doc, doc.getElementById("p2")));
    }
}