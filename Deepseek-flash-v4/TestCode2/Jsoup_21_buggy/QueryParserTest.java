package org.jsoup.select;

import static org.junit.Assert.*;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class QueryParserTest {

    private static void assertParsedType(String query, String expected) {
        Evaluator eval = QueryParser.parse(query);
        assertNotNull(query, eval);
        assertEquals(query, expected, eval.getClass().getSimpleName());
    }

    @Test
    public void parsesBasicSelectors() {
        assertParsedType("p", "Tag");
        assertParsedType(" p", "Tag");
        assertParsedType("#foo", "Id");
        assertParsedType(".foo", "Class");
        assertParsedType("*", "AllElements");
        assertParsedType("svg|a", "Tag");
    }

    @Test
    public void parsesAttributes() {
        assertParsedType("[href]", "Attribute");
        assertParsedType("[^data-]", "AttributeStarting");
        assertParsedType("[href=http://example.com]", "AttributeWithValue");
        assertParsedType("[href!=x]", "AttributeWithValueNot");
        assertParsedType("[href^=http]", "AttributeWithValueStarting");
        assertParsedType("[href$=.pdf]", "AttributeWithValueEnding");
        assertParsedType("[href*=example]", "AttributeWithValueContaining");
        assertParsedType("[href~=regex]", "AttributeWithValueMatching");
    }

    @Test
    public void parsesPseudoSelectors() {
        assertParsedType(":lt(0)", "IndexLessThan");
        assertParsedType(":gt(0)", "IndexGreaterThan");
        assertParsedType(":eq(0)", "IndexEquals");
        assertParsedType(":has(span)", "Has");
        assertParsedType(":contains(hello)", "ContainsText");
        assertParsedType(":containsOwn(hello)", "ContainsOwnText");
        assertParsedType(":matches(\\d+)", "Matches");
        assertParsedType(":matchesOwn(\\d+)", "MatchesOwn");
        assertParsedType(":not(.foo)", "Not");
    }

    @Test
    public void parsesCombinatorsAndGrouping() {
        assertParsedType("div p", "And");
        assertParsedType("div>p", "And");
        assertParsedType("div + p", "And");
        assertParsedType("div ~ p", "And");
        assertParsedType("> p", "And");
        assertParsedType("div p span", "And");
        assertParsedType("div, p", "Or");
        assertParsedType("div p, span", "Or");
        assertParsedType("div.foo", "And");
        assertParsedType("div.foo > p", "And");
        assertParsedType("div > :not(span)", "And");
        assertParsedType("div > [href]", "And");
    }

    @Test
    public void parsedSelectorSelectsExpectedElements() {
        Document doc = Jsoup.parse("<div id='a' class='foo'><p class='x'>hello</p><p>two</p></div><span></span>");
        assertEquals("div", Selector.select("div", doc).first().tagName());
        assertEquals(1, Selector.select("DIV", doc).size());
        assertEquals(2, Selector.select("div p", doc).size());
        assertEquals(2, Selector.select("div > p", doc).size());
        assertEquals(2, Selector.select("div.foo > p", doc).size());
        assertEquals(1, Selector.select("#a", doc).size());
        assertEquals(1, Selector.select(".x", doc).size());
        assertEquals(1, Selector.select("div.foo", doc).size());
        assertEquals(3, Selector.select("div, p", doc).size());

        Document siblingDoc = Jsoup.parse("<div></div><p>one</p><p>two</p>");
        assertEquals(1, Selector.select("div + p", siblingDoc).size());
        assertEquals(2, Selector.select("div ~ p", siblingDoc).size());
    }

    @Test
    public void invalidQueriesThrowParseException() {
        try {
            QueryParser.parse("");
            fail("empty query should fail");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("unexpected token"));
        }

        try {
            QueryParser.parse("&");
            fail("unknown token should fail");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("unexpected token"));
        }

        try {
            QueryParser.parse(",div");
            fail("leading comma should fail");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("Unknown combinator"));
        }
    }

    @Test
    public void nullQueryRejected() {
        try {
            QueryParser.parse(null);
            fail("null query should fail");
        } catch (RuntimeException e) {
            assertTrue("unexpected exception " + e.getClass().getName(),
                e instanceof IllegalArgumentException || e instanceof NullPointerException);
        }
    }

    @Test
    public void invalidPseudoIndexRejected() {
        try {
            QueryParser.parse(":lt(abc)");
            fail("non numeric index should fail");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Index must be numeric"));
        }
    }
}