package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullInput() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructorNormalisesCarriageReturns() {
        CharacterReader r = new CharacterReader("a\r\nb\rc");
        assertEquals(5, r.toString().length());
        assertTrue(r.toString().contains("\n"));
        assertEquals("a\nb\nc", r.toString());
    }

    @Test
    public void testPosInitial() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    @Test
    public void testPosAfterConsume() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        assertEquals(1, r.pos());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(new CharacterReader("").isEmpty());
        assertFalse(new CharacterReader("a").isEmpty());
    }

    @Test
    public void testCurrent() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
        assertEquals(0, r.pos());
        r.consume();
        assertEquals('b', r.current());
    }

    @Test
    public void testCurrentEmpty() {
        assertEquals(CharacterReader.EOF, new CharacterReader("").current());
    }

    @Test
    public void testConsume() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.consume());
        assertEquals(1, r.pos());
        assertEquals('b', r.consume());
        assertEquals(2, r.pos());
    }

    @Test
    public void testConsumeEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.consume());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testUnconsume() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.unconsume();
        assertEquals(0, r.pos());
        assertEquals('a', r.current());
    }

    @Test
    public void testUnconsumeUnderflow() {
        CharacterReader r = new CharacterReader("a");
        r.unconsume();
        try {
            r.current();
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAdvance() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
        assertEquals('b', r.current());
    }

    @Test
    public void testMarkRewind() {
        CharacterReader r = new CharacterReader("abc");
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals(0, r.pos());
        assertEquals('a', r.current());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("a", r.consumeAsString());
        assertEquals(1, r.pos());
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abc", r.consumeTo('d'));
        assertEquals(3, r.pos());
        assertEquals('d', r.current());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeTo('x'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToCharAtStart() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("", r.consumeTo('a'));
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeToString() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abc", r.consumeTo("de"));
        assertEquals(3, r.pos());
        assertEquals('d', r.current());
    }

    @Test
    public void testConsumeToStringNotFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeTo("gh"));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToStringAtStart() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("", r.consumeTo("ab"));
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeToAnyFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("a", r.consumeToAny('b', 'c'));
        assertEquals(1, r.pos());
        assertEquals('b', r.current());
    }

    @Test
    public void testConsumeToAnyNotFound() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.consumeToAny('x', 'y'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToAnyAtStart() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("", r.consumeToAny('a'));
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeToAnyEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals("", r.consumeToAny('a'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeLetterSequenceVariants() {
        CharacterReader r;

        r = new CharacterReader("");
        assertEquals("", r.consumeLetterSequence());

        r = new CharacterReader("a");
        assertEquals("a", r.consumeLetterSequence());
        assertTrue(r.isEmpty());

        r = new CharacterReader("abc123");
        assertEquals("abc", r.consumeLetterSequence());
        assertEquals(3, r.pos());

        r = new CharacterReader("1abc");
        assertEquals("", r.consumeLetterSequence());
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeHexSequenceVariants() {
        CharacterReader r;

        r = new CharacterReader("");
        assertEquals("", r.consumeHexSequence());

        r = new CharacterReader("1");
        assertEquals("1", r.consumeHexSequence());
        assertTrue(r.isEmpty());

        r = new CharacterReader("aF3xyz");
        assertEquals("aF3", r.consumeHexSequence());
        assertEquals(3, r.pos());

        r = new CharacterReader("xyz");
        assertEquals("", r.consumeHexSequence());
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeDigitSequenceVariants() {
        CharacterReader r;

        r = new CharacterReader("");
        assertEquals("", r.consumeDigitSequence());

        r = new CharacterReader("0");
        assertEquals("0", r.consumeDigitSequence());
        assertTrue(r.isEmpty());

        r = new CharacterReader("123abc");
        assertEquals("123", r.consumeDigitSequence());
        assertEquals(3, r.pos());

        r = new CharacterReader("abc");
        assertEquals("", r.consumeDigitSequence());
        assertEquals(0, r.pos());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader r;

        r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
        assertFalse(r.matches('b'));

        r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    @Test
    public void testMatchesString() {
        CharacterReader r;

        r = new CharacterReader("abcd");
        assertTrue(r.matches("ab"));
        assertFalse(r.matches("bc"));
        assertFalse(r.matches("abcde"));

        r = new CharacterReader("");
        assertFalse(r.matches("a"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader r;

        r = new CharacterReader("AbC");
        assertTrue(r.matchesIgnoreCase("abc"));
        assertFalse(r.matchesIgnoreCase("abcd"));

        r = new CharacterReader("");
        assertFalse(r.matchesIgnoreCase("a"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader r;

        r = new CharacterReader("abc");
        assertTrue(r.matchesAny('a', 'b'));
        assertFalse(r.matchesAny('x', 'y'));

        r = new CharacterReader("");
        assertFalse(r.matchesAny('a'));
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader r;

        r = new CharacterReader("a");
        assertTrue(r.matchesLetter());

        r = new CharacterReader("1");
        assertFalse(r.matchesLetter());

        r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader r;

        r = new CharacterReader("5");
        assertTrue(r.matchesDigit());

        r = new CharacterReader("a");
        assertFalse(r.matchesDigit());

        r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader r;

        r = new CharacterReader("abcdef");
        assertTrue(r.matchConsume("abc"));
        assertEquals(3, r.pos());

        r = new CharacterReader("abcdef");
        assertFalse(r.matchConsume("abd"));
        assertEquals(0, r.pos());

        r = new CharacterReader("");
        assertFalse(r.matchConsume("a"));
        assertEquals(0, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader r;

        r = new CharacterReader("AbcDef");
        assertTrue(r.matchConsumeIgnoreCase("abc"));
        assertEquals(3, r.pos());

        r = new CharacterReader("abcdef");
        assertFalse(r.matchConsumeIgnoreCase("Abcd"));
        assertEquals(0, r.pos());

        r = new CharacterReader("");
        assertFalse(r.matchConsumeIgnoreCase("a"));
        assertEquals(0, r.pos());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader r;

        r = new CharacterReader("Hello World");
        assertTrue(r.containsIgnoreCase("hello"));
        assertTrue(r.containsIgnoreCase("WORLD"));
        assertFalse(r.containsIgnoreCase("xyz"));

        r = new CharacterReader("Hello World");
        r.consume(); // pos=1
        r.consume(); // pos=2
        assertTrue(r.containsIgnoreCase("llo"));
        assertFalse(r.containsIgnoreCase("Hel"));
    }

    @Test
    public void testToString() {
        CharacterReader r = new CharacterReader("Hello World");
        r.consume(); // pos=1
        r.consume(); // pos=2
        assertEquals("llo World", r.toString());
    }
}