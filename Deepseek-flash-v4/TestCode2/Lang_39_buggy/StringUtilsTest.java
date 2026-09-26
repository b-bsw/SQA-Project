package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

    // isEmpty
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    // isBlank
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank(" a "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    // trim
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    // strip
    @Test
    public void testStrip() {
        assertNull(StringUtils.stripToNull(null));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.strip("  abc  "));
        // strip with stripChars
        assertEquals("abc", StringUtils.strip("xyabcxy", "xy"));
        assertEquals("abc", StringUtils.strip("  abc  ", null));
    }

    // equals
    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "a"));
        assertFalse(StringUtils.equals("a", null));
        assertTrue(StringUtils.equals("a", "a"));
        assertFalse(StringUtils.equals("a", "b"));
    }

    // contains (char)
    @Test
    public void testContainsChar() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("abc", 'd'));
    }

    // contains (String)
    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", null));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains("abc", "bd"));
    }

    // substring (start)
    @Test
    public void testSubstringStart() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("abc", 5));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("abc", StringUtils.substring("abc", -5));
    }

    // substring (start, end)
    @Test
    public void testSubstringStartEnd() {
        assertNull(StringUtils.substring(null, 0, 1));
        assertEquals("", StringUtils.substring("abc", 2, 1));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("abc", StringUtils.substring("abc", -1, 5));
    }

    // replace
    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", null, "b"));
        assertEquals("abc", StringUtils.replace("abc", "d", "e"));
        assertEquals("xbc", StringUtils.replace("abc", "a", "x"));
        assertEquals("xaxbc", StringUtils.replace("abac", "a", "x", 2));
    }

    // join (Object[], char)
    @Test
    public void testJoinArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ','));
        assertEquals("", StringUtils.join(new Object[]{}, ','));
        assertEquals("a,b,c", StringUtils.join(new Object[]{"a","b","c"}, ','));
        assertEquals("a,,c", StringUtils.join(new Object[]{"a",null,"c"}, ','));
    }

    // deleteWhitespace
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("a b c"));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    // capitalize
    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("Abc", StringUtils.capitalize("Abc"));
    }

    // reverse
    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    // abbreviate
    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateMaxWidthLessThan4() {
        StringUtils.abbreviate("abc", 3);
    }

    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 10));
        assertEquals("abc", StringUtils.abbreviate("abc", 4));
        assertEquals("ab...", StringUtils.abbreviate("abcdef", 5));
    }

    // startsWith
    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "a"));
        assertFalse(StringUtils.startsWith("a", null));
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
    }

    // endsWith
    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "a"));
        assertFalse(StringUtils.endsWith("a", null));
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
    }

    // getLevenshteinDistance
    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNull() {
        StringUtils.getLevenshteinDistance(null, "a");
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        assertEquals(1, StringUtils.getLevenshteinDistance("abc", "abd"));
    }

    // repeat
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("ab", 0));
        assertEquals("ab", StringUtils.repeat("ab", 1));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
    }

    // leftPad / rightPad (basic)
    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
        assertEquals("xyabc", StringUtils.leftPad("abc", 5, "xy"));
    }

    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 5));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
        assertEquals("abcxy", StringUtils.rightPad("abc", 5, "xy"));
    }

    // isAlpha etc.
    @Test
    public void testIsAlpha() {
        assertFalse(StringUtils.isAlpha(null));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("abc1"));
    }

    // split (simple)
    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[]{}, StringUtils.split(""));
        assertArrayEquals(new String[]{"a","b","c"}, StringUtils.split("a b c"));
        assertArrayEquals(new String[]{"a","b"}, StringUtils.split("a b ", null));
    }

    // substringBefore
    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, ","));
        assertEquals("abc", StringUtils.substringBefore("abc", ","));
        assertEquals("a", StringUtils.substringBefore("abc", "b"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
    }
}