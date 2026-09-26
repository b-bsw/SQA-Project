package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeBuilderTest {

    private static class TestTreeBuilder extends TreeBuilder {
        boolean processResult = true;
        Token lastProcessed;

        @Override
        protected boolean process(Token token) {
            lastProcessed = token;
            return processResult;
        }
    }

    @Test
    public void testParseNormal() {
        TestTreeBuilder tb = new TestTreeBuilder();
        Document doc = tb.parse("<html></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
        assertNotNull(tb.stack);
        assertNotNull(tb.reader);
        assertNotNull(tb.tokeniser);
    }

    @Test
    public void testParseEmpty() {
        TestTreeBuilder tb = new TestTreeBuilder();
        Document doc = tb.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullInput() {
        new TestTreeBuilder().parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUri() {
        new TestTreeBuilder().parse("<html></html>", null);
    }

    @Test
    public void testProcessStartTagName() {
        TestTreeBuilder tb = new TestTreeBuilder();
        assertTrue(tb.processStartTag("div"));
        assertNotNull(tb.lastProcessed);
        assertEquals(Token.TokenType.StartTag, tb.lastProcessed.type);
        assertEquals("div", tb.lastProcessed.asStartTag().name());
    }

    @Test
    public void testProcessStartTagNameAndAttributes() {
        TestTreeBuilder tb = new TestTreeBuilder();
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        assertTrue(tb.processStartTag("div", attrs));
        assertEquals("div", tb.lastProcessed.asStartTag().name());
        assertEquals("main", tb.lastProcessed.asStartTag().attributes().get("id"));
    }

    @Test
    public void testProcessEndTag() {
        TestTreeBuilder tb = new TestTreeBuilder();
        assertTrue(tb.processEndTag("p"));
        assertEquals(Token.TokenType.EndTag, tb.lastProcessed.type);
        assertEquals("p", tb.lastProcessed.asEndTag().name());
    }

    @Test
    public void testProcessReturnsFalse() {
        TestTreeBuilder tb = new TestTreeBuilder();
        tb.processResult = false;
        assertFalse(tb.processStartTag("div"));
    }

    @Test
    public void testCurrentElementEmptyStack() {
        TestTreeBuilder tb = new TestTreeBuilder();
        tb.stack = new ArrayList<Element>();
        assertNull(tb.currentElement());
    }

    @Test
    public void testCurrentElementNonEmptyStack() {
        TestTreeBuilder tb = new TestTreeBuilder();
        tb.stack = new ArrayList<Element>();
        Element div = new Element("div");
        tb.stack.add(div);
        Element span = new Element("span");
        tb.stack.add(span);
        assertSame(span, tb.currentElement());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParseNullInput() {
        TestTreeBuilder tb = new TestTreeBuilder();
        tb.initialiseParse(null, "http://example.com/", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParseNullBaseUri() {
        TestTreeBuilder tb = new TestTreeBuilder();
        tb.initialiseParse("<html></html>", null, ParseErrorList.noTracking());
    }
}