package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank(" a "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim("  abc  "));
        assertEquals("a b", StringUtils.trim(" a b "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.stripToNull(null));
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("--abc--", "-"));
        assertEquals("", StringUtils.strip("---", "-"));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "a"));
        assertFalse(StringUtils.equals("a", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(2, StringUtils.indexOf("abc", 'c'));
        assertEquals(-1, StringUtils.indexOf("abc", 'd'));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("aba", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("aba", "a", 1));
        assertEquals(2, StringUtils.ordinalIndexOf("aba", "a", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aba", "a", 3));
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
    }

    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[]{}, StringUtils.split(""));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ','));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,,b,c", ","));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.split("a b", " ", 2));
    }

    @Test
    public void testJoinObjectArray() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("a", StringUtils.join(new Object[]{"a"}));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
        assertEquals("a-b", StringUtils.join(new Object[]{"a", "b"}, "-"));
        assertEquals("a,,b", StringUtils.join(new Object[]{"a", null, "b"}, ","));
    }

    @Test
    public void testReplace() {
        assertEquals("aba", StringUtils.replace("aabaa", "aa", "ba"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", "", "d"));
        assertEquals("xbc", StringUtils.replace("abc", "a", "x"));
        assertEquals("xbc", StringUtils.replaceOnce("aabc", "a", "x"));
        assertEquals("xxc", StringUtils.replace("aabc", "a", "x", 2));
        assertEquals("abc", StringUtils.replace("abc", "d", "x"));
        assertNull(StringUtils.replace(null, "a", "b"));
    }

    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("ab", 0));
        assertEquals("ab", StringUtils.repeat("ab", 1));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("", StringUtils.repeat("a", -1));
    }

    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("     ", StringUtils.leftPad("", 5));
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
        assertEquals("--abc", StringUtils.leftPad("abc", 5, "-"));
        assertEquals("ababc", StringUtils.leftPad("abc", 5, "ab"));
    }

    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("abc", StringUtils.abbreviate("abc", 10));
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        assertEquals("...f...", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("...bc...", StringUtils.abbreviate("abcdefghij", 8));
        try {
            StringUtils.abbreviate("abc", 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            StringUtils.abbreviate("abc", 6, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("abc", ""));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        assertEquals(1, StringUtils.getLevenshteinDistance("abc", "abd"));
        assertEquals(2, StringUtils.getLevenshteinDistance("abc", "abx"));
        try {
            StringUtils.getLevenshteinDistance(null, "abc");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("a", null));
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABC", "abc"));
        assertFalse(StringUtils.startsWith("ABC", "abc"));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("a", null));
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABC", "abc"));
        assertFalse(StringUtils.endsWith("ABC", "abc"));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
        assertEquals("", StringUtils.deleteWhitespace("   "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("ABC", StringUtils.capitalize("ABC"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertFalse(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));
        assertFalse(StringUtils.isNumeric(" 123"));
        assertFalse(StringUtils.isNumeric("123 "));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("def", StringUtils.defaultString(null, "def"));
        assertEquals("abc", StringUtils.defaultString("abc", "def"));
    }
}