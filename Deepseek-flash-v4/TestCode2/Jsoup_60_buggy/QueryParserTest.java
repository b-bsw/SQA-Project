package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    @Test
    public void testParseSimpleTag() {
        Evaluator eval = QueryParser.parse("div");
        assertNotNull(eval);
    }

    @Test
    public void testParseId() {
        Evaluator eval = QueryParser.parse("#myId");
        assertNotNull(eval);
    }

    @Test
    public void testParseClass() {
        Evaluator eval = QueryParser.parse(".myClass");
        assertNotNull(eval);
    }

    @Test
    public void testParseAttribute() {
        Evaluator eval = QueryParser.parse("[href]");
        assertNotNull(eval);
    }

    @Test
    public void testParseAttributeWithValue() {
        Evaluator eval = QueryParser.parse("[href=http://example.com]");
        assertNotNull(eval);
    }

    @Test
    public void testParseChildCombinator() {
        Evaluator eval = QueryParser.parse("div > p");
        assertNotNull(eval);
    }

    @Test
    public void testParseDescendantCombinator() {
        Evaluator eval = QueryParser.parse("div p");
        assertNotNull(eval);
    }

    @Test
    public void testParseAdjacentSibling() {
        Evaluator eval = QueryParser.parse("h1 + p");
        assertNotNull(eval);
    }

    @Test
    public void testParseGeneralSibling() {
        Evaluator eval = QueryParser.parse("h1 ~ p");
        assertNotNull(eval);
    }

    @Test
    public void testParseCommaOr() {
        Evaluator eval = QueryParser.parse("div, p");
        assertNotNull(eval);
    }

    @Test
    public void testParsePseudoClassFirstChild() {
        Evaluator eval = QueryParser.parse(":first-child");
        assertNotNull(eval);
    }

    @Test
    public void testParseNthChild() {
        Evaluator eval = QueryParser.parse(":nth-child(2n+1)");
        assertNotNull(eval);
    }

    @Test
    public void testParseContains() {
        Evaluator eval = QueryParser.parse(":contains(hello)");
        assertNotNull(eval);
    }

    @Test
    public void testParseHas() {
        Evaluator eval = QueryParser.parse(":has(div)");
        assertNotNull(eval);
    }

    @Test
    public void testParseNot() {
        Evaluator eval = QueryParser.parse(":not(.class)");
        assertNotNull(eval);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseEmptyQuery() {
        QueryParser.parse("");
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullQuery() {
        QueryParser.parse(null);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseInvalidAttributeBracket() {
        QueryParser.parse("[href");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseInvalidPseudo() {
        QueryParser.parse(":unknown");
    }

    @Test
    public void testParseMultipleClasses() {
        Evaluator eval = QueryParser.parse("div.class1.class2");
        assertNotNull(eval);
    }

    @Test
    public void testParseAllElements() {
        Evaluator eval = QueryParser.parse("*");
        assertNotNull(eval);
    }
}