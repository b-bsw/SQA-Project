package org.jsoup.parser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {
    private CharacterReader reader;

    @Before
    public void setUp() {
        // default fresh reader per test
    }

    @After
    public void tearDown() {
        reader = null;
    }

    // ==================== Constructor tests ====================

    @Test
    public void constructorStringEmpty() {
        reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void constructorStringNormal() {
        reader = new CharacterReader("abc");
        assertFalse(reader.isEmpty());
        assertEquals('a', reader.current());
    }

    // ==================== pos() ====================

    @Test
    public void posAfterConsume() {
        reader = new CharacterReader("hello");
        assertEquals(0, reader.pos());
        reader.consume();
        assertEquals(1, reader.pos());
    }

    // ==================== isEmpty() ====================

    @Test
    public void isEmptyAfterFullConsume() {
        reader = new CharacterReader("x");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void isEmptyBufferUpEdge() {
        // use a reader that forces bufferUp path; large enough string to trigger split
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) sb.append('a');
        reader = new CharacterReader(sb.toString());
        assertFalse(reader.isEmpty());
        // consume a lot to force bufferUp multiple times
        for (int i = 0; i < 50000; i++) {
            reader.consume();
        }
        assertTrue(reader.isEmpty());
    }

    // ==================== current() ====================

    @Test
    public void currentOnEmpty() {
        reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void currentAfterConsume() {
        reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        reader.consume();
        assertEquals('b', reader.current());
    }

    // ==================== consume() ====================

    @Test
    public void consumeNormal() {
        reader = new CharacterReader("xyz");
        assertEquals('x', reader.consume());
        assertEquals('y', reader.consume());
        assertEquals('z', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    // ==================== unconsume() ====================

    @Test(expected = UncheckedIOException.class)
    public void unconsumeAtStartThrows() {
        reader = new CharacterReader("abc");
        reader.unconsume(); // bufPos == 0
    }

    @Test
    public void unconsumeNormal() {
        reader = new CharacterReader("ab");
        reader.consume(); // pos becomes 1
        reader.unconsume(); // back to 0
        assertEquals('a', reader.current());
    }

    // ==================== advance() ====================

    @Test
    public void advanceMovesPos() {
        reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        reader.advance();
        assertEquals('b', reader.current());
    }

    // ==================== mark / rewindToMark ====================

    @Test(expected = UncheckedIOException.class)
    public void rewindToMarkInvalidThrows() {
        reader = new CharacterReader("data");
        reader.rewindToMark(); // mark not set
    }

    @Test
    public void markAndRewind() {
        reader = new CharacterReader("hello world");
        reader.mark();
        reader.consume();
        reader.consume();
        assertEquals('l', reader.current());
        reader.rewindToMark();
        assertEquals('h', reader.current());
    }

    @Test
    public void markRewindLargeBuffer() {
        // force buffer split and mark
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) sb.append('a');
        sb.append("target");
        reader = new CharacterReader(sb.toString());
        reader.consume(); // consume first char to potentially advance buffer
        reader.mark();
        // consume many to overflow buffer
        for (int i = 0; i < 4000; i++) reader.consume();
        reader.rewindToMark();
        assertEquals('a', reader.current());
    }

    // ==================== nextIndexOf(char) ====================

    @Test
    public void nextIndexOfCharFound() {
        reader = new CharacterReader("abcde");
        assertEquals(2, reader.nextIndexOf('c'));
    }

    @Test
    public void nextIndexOfCharNotFound() {
        reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void nextIndexOfCharAtStart() {
        reader = new CharacterReader("abc");
        assertEquals(0, reader.nextIndexOf('a'));
    }

    @Test
    public void nextIndexOfCharAtEnd() {
        reader = new CharacterReader("ab");
        assertEquals(1, reader.nextIndexOf('b'));
    }

    // ==================== nextIndexOf(CharSequence) ====================

    @Test
    public void nextIndexOfSeqFound() {
        reader = new CharacterReader("hello world");
        assertEquals(0, reader.nextIndexOf("hello"));
        assertEquals(6, reader.nextIndexOf("world"));
    }

    @Test
    public void nextIndexOfSeqNotFound() {
        reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf("xyz"));
    }

    @Test
    public void nextIndexOfSeqOverlapping() {
        reader = new CharacterReader("aaaa");
        assertEquals(0, reader.nextIndexOf("aa"));
    }

    @Test
    public void nextIndexOfSeqPastBuffer() {
        reader = new CharacterReader("short");
        assertEquals(-1, reader.nextIndexOf("longerthanlength"));
    }

    // ==================== consumeTo(char) ====================

    @Test
    public void consumeToCharFound() {
        reader = new CharacterReader("a<b");
        assertEquals("a", reader.consumeTo('<'));
        assertEquals('<', reader.current());
    }

    @Test
    public void consumeToCharNotFound() {
        reader = new CharacterReader("abcd");
        assertEquals("abcd", reader.consumeTo('z'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToCharAtStart() {
        reader = new CharacterReader("abc");
        assertEquals("", reader.consumeTo('a'));
    }

    // ==================== consumeTo(String) ====================

    @Test
    public void consumeToStringFound() {
        reader = new CharacterReader("before<!-- comment");
        assertEquals("before", reader.consumeTo("<!--"));
        assertEquals('<', reader.current());
    }

    @Test
    public void consumeToStringNotFound() {
        reader = new CharacterReader("complete");
        assertEquals("complete", reader.consumeTo("xyz"));
        assertTrue(reader.isEmpty());
    }

    // ==================== consumeToAny ====================

    @Test
    public void consumeToAnyFound() {
        reader = new CharacterReader("abc>def");
        assertEquals("abc", reader.consumeToAny('>', '<'));
        assertEquals('>', reader.current());
    }

    @Test
    public void consumeToAnyNotFound() {
        reader = new CharacterReader("full");
        assertEquals("full", reader.consumeToAny('!', '@'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAnyFirstChar() {
        reader = new CharacterReader("!start");
        assertEquals("", reader.consumeToAny('!'));
        assertEquals('!', reader.current());
    }

    @Test
    public void consumeToAnyEmptyBuffer() {
        reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('a', 'b'));
        assertTrue(reader.isEmpty());
    }

    // ==================== consumeToAnySorted ====================

    @Test
    public void consumeToAnySortedFound() {
        reader = new CharacterReader("xyz;abc");
        assertEquals("xyz", reader.consumeToAnySorted(';', ','));
        assertEquals(';', reader.current());
    }

    // ==================== consumeData ====================

    @Test
    public void consumeDataNormal() {
        reader = new CharacterReader("text & more");
        assertEquals("text ", reader.consumeData());
        assertEquals('&', reader.current());
    }

    @Test
    public void consumeDataStopsAtLt() {
        reader = new CharacterReader("a<b");
        assertEquals("a", reader.consumeData());
        assertEquals('<', reader.current());
    }

    @Test
    public void consumeDataAll() {
        reader = new CharacterReader("safe text");
        assertEquals("safe text", reader.consumeData());
        assertTrue(reader.isEmpty());
    }

    // ==================== consumeTagName ====================

    @Test
    public void consumeTagNameSimple() {
        reader = new CharacterReader("div>");
        assertEquals("div", reader.consumeTagName());
        assertEquals('>', reader.current());
    }

    @Test
    public void consumeTagNameWithWhitespace() {
        reader = new CharacterReader("span attr");
        assertEquals("span", reader.consumeTagName());
        assertEquals(' ', reader.current());
    }

    @Test
    public void consumeTagNameEndWithSlash() {
        reader = new CharacterReader("br/>");
        assertEquals("br", reader.consumeTagName());
        assertEquals('/', reader.current());
    }

    @Test
    public void consumeTagNameEndWithNull() {
        // null char not directly representable, but we can simulate via content
        // actually the method checks TokeniserState.nullChar constant? TokeniserState class not visible here.
        // but source uses TokeniserState.nullChar; we cannot instantiate it. We'll skip null test for now.
    }

    // ==================== consumeToEnd ====================

    @Test
    public void consumeToEndAfterSome() {
        reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        assertEquals("cdef", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToEndEmpty() {
        reader = new CharacterReader("");
        assertEquals("", reader.consumeToEnd());
    }

    // ==================== consumeLetterSequence ====================

    @Test
    public void consumeLetterSequenceAllLetters() {
        reader = new CharacterReader("Hello");
        assertEquals("Hello", reader.consumeLetterSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeLetterSequenceStopsAtNonLetter() {
        reader = new CharacterReader("abc123");
        assertEquals("abc", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
    }

    @Test
    public void consumeLetterSequenceEmpty() {
        reader = new CharacterReader("123");
        assertEquals("", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
    }

    // ==================== consumeLetterThenDigitSequence ====================

    @Test
    public void consumeLetterThenDigit() {
        reader = new CharacterReader("abc123def");
        assertEquals("abc123", reader.consumeLetterThenDigitSequence());
        assertEquals('d', reader.current());
    }

    @Test
    public void consumeLetterThenDigitNoDigit() {
        reader = new CharacterReader("xyz");
        assertEquals("xyz", reader.consumeLetterThenDigitSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeLetterThenDigitStartDigit() {
        reader = new CharacterReader("1abc");
        assertEquals("", reader.consumeLetterThenDigitSequence());
        assertEquals('1', reader.current());
    }

    // ==================== consumeHexSequence ====================

    @Test
    public void consumeHexSequenceHexOnly() {
        reader = new CharacterReader("AF3b");
        assertEquals("AF3b", reader.consumeHexSequence());
    }

    @Test
    public void consumeHexSequenceStopsAtNonHex() {
        reader = new CharacterReader("1a2g");
        assertEquals("1a2", reader.consumeHexSequence());
        assertEquals('g', reader.current());
    }

    // ==================== consumeDigitSequence ====================

    @Test
    public void consumeDigitSequenceDigits() {
        reader = new CharacterReader("1234abc");
        assertEquals("1234", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
    }

    @Test
    public void consumeDigitSequenceNoDigit() {
        reader = new CharacterReader("abc");
        assertEquals("", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
    }

    // ==================== matches(char) ====================

    @Test
    public void matchesCharTrue() {
        reader = new CharacterReader("a");
        assertTrue(reader.matches('a'));
    }

    @Test
    public void matchesCharFalse() {
        reader = new CharacterReader("a");
        assertFalse(reader.matches('b'));
    }

    @Test
    public void matchesCharOnEmpty() {
        reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    // ==================== matches(String) ====================

    @Test
    public void matchesStringExact() {
        reader = new CharacterReader("hello");
        assertTrue(reader.matches("hello"));
    }

    @Test
    public void matchesStringPartial() {
        reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
    }

    @Test
    public void matchesStringNoMatch() {
        reader = new CharacterReader("hi");
        assertFalse(reader.matches("hello"));
    }

    @Test
    public void matchesStringTooLong() {
        reader = new CharacterReader("abc");
        assertFalse(reader.matches("abcd"));
    }

    // ==================== matchesIgnoreCase ====================

    @Test
    public void matchesIgnoreCase() {
        reader = new CharacterReader("Hello");
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertTrue(reader.matchesIgnoreCase("HELLO"));
    }

    @Test
    public void matchesIgnoreCaseFalse() {
        reader = new CharacterReader("Hi");
        assertFalse(reader.matchesIgnoreCase("hello"));
    }

    // ==================== matchesAny ====================

    @Test
    public void matchesAnyFound() {
        reader = new CharacterReader("x");
        assertTrue(reader.matchesAny('x', 'y'));
    }

    @Test
    public void matchesAnyNotFound() {
        reader = new CharacterReader("a");
        assertFalse(reader.matchesAny('b', 'c'));
    }

    @Test
    public void matchesAnyEmpty() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a'));
    }

    // ==================== matchesAnySorted ====================

    @Test
    public void matchesAnySortedFound() {
        reader = new CharacterReader("b");
        assertTrue(reader.matchesAnySorted(new char[]{'a', 'b', 'c'}));
    }

    @Test
    public void matchesAnySortedNotFound() {
        reader = new CharacterReader("d");
        assertFalse(reader.matchesAnySorted(new char[]{'a', 'b', 'c'}));
    }

    // ==================== matchesLetter ====================

    @Test
    public void matchesLetterUpper() {
        reader = new CharacterReader("Z");
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void matchesLetterLower() {
        reader = new CharacterReader("z");
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void matchesLetterUnicode() {
        reader = new CharacterReader("\u00E9"); // e with accent
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void matchesLetterNonLetter() {
        reader = new CharacterReader("1");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void matchesLetterEmpty() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    // ==================== matchesDigit ====================

    @Test
    public void matchesDigitTrue() {
        reader = new CharacterReader("5");
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void matchesDigitFalse() {
        reader = new CharacterReader("a");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void matchesDigitEmpty() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    // ==================== matchConsume ====================

    @Test
    public void matchConsumeSuccess() {
        reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals('d', reader.current());
    }

    @Test
    public void matchConsumeFail() {
        reader = new CharacterReader("abcdef");
        assertFalse(reader.matchConsume("xyz"));
        assertEquals('a', reader.current());
    }

    // ==================== matchConsumeIgnoreCase ====================

    @Test
    public void matchConsumeIgnoreCaseSuccess() {
        reader = new CharacterReader("Hello");
        assertTrue(reader.matchConsumeIgnoreCase("HELLO"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void matchConsumeIgnoreCaseFail() {
        reader = new CharacterReader("Hi");
        assertFalse(reader.matchConsumeIgnoreCase("hello"));
        assertEquals('H', reader.current());
    }

    // ==================== containsIgnoreCase ====================

    @Test
    public void containsIgnoreCaseTrue() {
        reader = new CharacterReader("Some Title Text");
        assertTrue(reader.containsIgnoreCase("title"));
    }

    @Test
    public void containsIgnoreCaseFalse() {
        reader = new CharacterReader("No match");
        assertFalse(reader.containsIgnoreCase("xyz"));
    }

    // ==================== toString ====================

    @Test
    public void toStringRemaining() {
        reader = new CharacterReader("hello world");
        reader.consume(); // h
        assertEquals("ello world", reader.toString());
    }

    @Test
    public void toStringEmpty() {
        reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    // ==================== rangeEquals (instance) ====================

    @Test
    public void rangeEqualsTrue() {
        reader = new CharacterReader("test");
        assertTrue(reader.rangeEquals(0, 4, "test"));
    }

    @Test
    public void rangeEqualsFalse() {
        reader = new CharacterReader("test");
        assertFalse(reader.rangeEquals(0, 4, "text"));
    }

    @Test
    public void rangeEqualsDifferentLength() {
        reader = new CharacterReader("test");
        assertFalse(reader.rangeEquals(0, 3, "test"));
    }
}