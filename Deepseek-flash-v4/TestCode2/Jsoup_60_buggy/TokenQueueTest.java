package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenQueueTest {

    // Constructor
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNull() {
        new TokenQueue(null);
    }

    // isEmpty
    @Test
    public void testIsEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
        tq = new TokenQueue("a");
        assertFalse(tq.isEmpty());
    }

    // peek
    @Test
    public void testPeek() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.peek());
        tq = new TokenQueue("");
        assertEquals(0, tq.peek());
    }

    // addFirst(Character)
    @Test
    public void testAddFirstCharacter() {
        TokenQueue tq = new TokenQueue("bc");
        tq.addFirst('a');
        assertEquals("abc", tq.toString());
        assertEquals('a', tq.peek());
    }

    // addFirst(String)
    @Test
    public void testAddFirstString() {
        TokenQueue tq = new TokenQueue("world");
        tq.addFirst("hello ");
        assertEquals("hello world", tq.toString());
        assertTrue(tq.matches("hello "));
    }

    // matches (case insensitive)
    @Test
    public void testMatches() {
        TokenQueue tq = new TokenQueue("Hello World");
        assertTrue(tq.matches("hello"));
        assertTrue(tq.matches("Hello"));
        assertFalse(tq.matches("world"));
    }

    // matchesCS (case sensitive)
    @Test
    public void testMatchesCS() {
        TokenQueue tq = new TokenQueue("Hello");
        assertTrue(tq.matchesCS("Hello"));
        assertFalse(tq.matchesCS("hello"));
    }

    // matchesAny(String...)
    @Test
    public void testMatchesAnyString() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesAny("ab", "xy"));
        assertFalse(tq.matchesAny("bc", "xyz"));
    }

    // matchesAny(char...)
    @Test
    public void testMatchesAnyChar() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesAny('a', 'b'));
        assertFalse(tq.matchesAny('d', 'e'));
        tq = new TokenQueue("");
        assertFalse(tq.matchesAny('a'));
    }

    // matchesStartTag
    @Test
    public void testMatchesStartTag() {
        TokenQueue tq = new TokenQueue("<div");
        assertTrue(tq.matchesStartTag());
        tq = new TokenQueue("</div");
        assertFalse(tq.matchesStartTag());
        tq = new TokenQueue("<");
        assertFalse(tq.matchesStartTag());
        tq = new TokenQueue("<1");
        assertFalse(tq.matchesStartTag());
    }

    // matchChomp
    @Test
    public void testMatchChomp() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchChomp("ab"));
        assertEquals("c", tq.toString());
        assertFalse(tq.matchChomp("ab"));
    }

    // matchesWhitespace
    @Test
    public void testMatchesWhitespace() {
        TokenQueue tq = new TokenQueue(" a");
        assertTrue(tq.matchesWhitespace());
        tq.advance();
        assertFalse(tq.matchesWhitespace());
        tq = new TokenQueue("");
        assertFalse(tq.matchesWhitespace());
    }

    // matchesWord
    @Test
    public void testMatchesWord() {
        TokenQueue tq = new TokenQueue("a ");
        assertTrue(tq.matchesWord());
        tq.advance();
        assertFalse(tq.matchesWord());
        tq = new TokenQueue("");
        assertFalse(tq.matchesWord());
    }

    // advance
    @Test
    public void testAdvance() {
        TokenQueue tq = new TokenQueue("ab");
        tq.advance();
        assertEquals('b', tq.peek());
        tq.advance();
        assertTrue(tq.isEmpty());
        tq.advance();
        assertTrue(tq.isEmpty());
    }

    // consume() char
    @Test
    public void testConsumeChar() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.consume());
        assertEquals('b', tq.consume());
        assertEquals('c', tq.consume());
        assertTrue(tq.isEmpty());
    }

    // consume(String) success
    @Test
    public void testConsumeString() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("hello");
        assertEquals(" world", tq.toString());
    }

    // consume(String) exception - not match
    @Test(expected = IllegalStateException.class)
    public void testConsumeStringNotMatch() {
        TokenQueue tq = new TokenQueue("hello");
        tq.consume("world");
    }

    // consume(String) exception - too long
    @Test(expected = IllegalStateException.class)
    public void testConsumeStringTooLong() {
        TokenQueue tq = new TokenQueue("hi");
        tq.consume("hello");
    }

    // consumeTo
    @Test
    public void testConsumeTo() {
        TokenQueue tq = new TokenQueue("abcd");
        assertEquals("ab", tq.consumeTo("cd"));
        assertEquals("cd", tq.toString());
        tq = new TokenQueue("hello");
        assertEquals("hello", tq.consumeTo("xyz"));
        assertTrue(tq.isEmpty());
    }

    // consumeToIgnoreCase
    @Test
    public void testConsumeToIgnoreCase() {
        TokenQueue tq = new TokenQueue("aBcDe");
        assertEquals("aBc", tq.consumeToIgnoreCase("dE"));
        assertEquals("dE", tq.toString());
        tq = new TokenQueue("123abc");
        assertEquals("123", tq.consumeToIgnoreCase("abc"));
        assertEquals("abc", tq.toString());
        tq = new TokenQueue("hello");
        assertEquals("hello", tq.consumeToIgnoreCase("xyz"));
        assertTrue(tq.isEmpty());
    }

    // consumeToAny
    @Test
    public void testConsumeToAny() {
        TokenQueue tq = new TokenQueue("abcdef");
        assertEquals("ab", tq.consumeToAny("cd", "ef"));
        assertEquals("cdef", tq.toString());
        tq = new TokenQueue("hello");
        assertEquals("hello", tq.consumeToAny("xyz"));
        assertTrue(tq.isEmpty());
    }

    // chompTo
    @Test
    public void testChompTo() {
        TokenQueue tq = new TokenQueue("abcd");
        assertEquals("ab", tq.chompTo("cd"));
        assertTrue(tq.isEmpty());
        tq = new TokenQueue("hello");
        assertEquals("hello", tq.chompTo("xyz"));
        assertTrue(tq.isEmpty());
    }

    // chompToIgnoreCase
    @Test
    public void testChompToIgnoreCase() {
        TokenQueue tq = new TokenQueue("aBcDe");
        assertEquals("aBc", tq.chompToIgnoreCase("dE"));
        assertTrue(tq.isEmpty());
        tq = new TokenQueue("hello");
        assertEquals("hello", tq.chompToIgnoreCase("xyz"));
        assertTrue(tq.isEmpty());
    }

    // chompBalanced basic
    @Test
    public void testChompBalancedSimple() {
        TokenQueue tq = new TokenQueue("(a)");
        assertEquals("a", tq.chompBalanced('(', ')'));
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testChompBalancedNested() {
        TokenQueue tq = new TokenQueue("(a(b)c)");
        assertEquals("a(b)c", tq.chompBalanced('(', ')'));
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testChompBalancedDoubleNested() {
        TokenQueue tq = new TokenQueue("((a))");
        assertEquals("(a)", tq.chompBalanced('(', ')'));
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testChompBalancedNoOpener() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("", tq.chompBalanced('(', ')'));
        assertTrue(tq.isEmpty());
    }

    // unescape
    @Test
    public void testUnescape() {
        assertEquals("", TokenQueue.unescape(""));
        assertEquals("hello", TokenQueue.unescape("hello"));
        assertEquals("c", TokenQueue.unescape("\\c"));
        assertEquals("\\c", TokenQueue.unescape("\\\\c"));
        assertEquals("\\", TokenQueue.unescape("\\\\"));
        assertEquals("hello", TokenQueue.unescape("he\\llo"));
        assertEquals("", TokenQueue.unescape("\\"));
    }

    // consumeWhitespace
    @Test
    public void testConsumeWhitespace() {
        TokenQueue tq = new TokenQueue("   abc");
        assertTrue(tq.consumeWhitespace());
        assertEquals("abc", tq.toString());
        tq = new TokenQueue("abc");
        assertFalse(tq.consumeWhitespace());
        tq = new TokenQueue("");
        assertFalse(tq.consumeWhitespace());
    }

    // consumeWord
    @Test
    public void testConsumeWord() {
        TokenQueue tq = new TokenQueue("hello123 world");
        assertEquals("hello123", tq.consumeWord());
        assertEquals(" world", tq.toString());
        tq = new TokenQueue("  ");
        assertEquals("", tq.consumeWord());
    }

    // consumeTagName
    @Test
    public void testConsumeTagName() {
        TokenQueue tq = new TokenQueue("my-tag:extra");
        assertEquals("my-tag:extra", tq.consumeTagName());
        assertTrue(tq.isEmpty());
        tq = new TokenQueue("hello world");
        assertEquals("hello", tq.consumeTagName());
    }

    // consumeElementSelector
    @Test
    public void testConsumeElementSelector() {
        TokenQueue tq = new TokenQueue("div|span");
        assertEquals("div|span", tq.consumeElementSelector());
        tq = new TokenQueue("*|span");
        assertEquals("*|span", tq.consumeElementSelector());
        tq = new TokenQueue("my-class");
        assertEquals("my-class", tq.consumeElementSelector());
    }

    // consumeCssIdentifier
    @Test
    public void testConsumeCssIdentifier() {
        TokenQueue tq = new TokenQueue("my-id-123");
        assertEquals("my-id-123", tq.consumeCssIdentifier());
        tq = new TokenQueue("_private");
        assertEquals("_private", tq.consumeCssIdentifier());
    }

    // consumeAttributeKey
    @Test
    public void testConsumeAttributeKey() {
        TokenQueue tq = new TokenQueue("data-value:true");
        assertEquals("data-value:true", tq.consumeAttributeKey());
        assertTrue(tq.isEmpty());
    }

    // remainder
    @Test
    public void testRemainder() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consumeWord();
        assertEquals(" world", tq.remainder());
        assertTrue(tq.isEmpty());
    }

    // toString
    @Test
    public void testToString() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("abc", tq.toString());
        tq.advance();
        assertEquals("bc", tq.toString());
    }
}