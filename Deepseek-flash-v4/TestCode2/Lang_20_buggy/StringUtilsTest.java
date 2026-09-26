package org.apache.commons.lang3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtils();
    }

    @After
    public void tearDown() {
        stringUtils = null;
    }

    @Test
    public void testConstructor() {
        assertNotNull(stringUtils);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertTrue(StringUtils.isNotEmpty("x"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" \t\n"));
        assertFalse(StringUtils.isBlank("x"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void testTrimToNullAndTrimToEmpty() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull(" abc "));

        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("abc", StringUtils.trimToEmpty(" abc "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("xyabcxy", "xy"));
    }

    @Test
    public void testStripToNullAndStripToEmpty() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("a", StringUtils.stripToNull(" a "));

        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(" "));
    }

    @Test
    public void testStripAll() {
        assertArrayEquals(
            new String[] {"a", "b"},
            StringUtils.stripAll(" a ", " b ")
        );
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("e", StringUtils.stripAccents("\u00e9"));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals(null, ""));
        assertFalse(StringUtils.equals("abc", "abd"));

        assertTrue(StringUtils.equalsIgnoreCase("ABC", "abc"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(2, StringUtils.indexOf("aabbaa", 'b'));
        assertEquals(2, StringUtils.indexOf("aabbaa", "bb"));
        assertEquals(-1, StringUtils.indexOf(null, 'b'));
        assertEquals(4, StringUtils.ordinalIndexOf("aabbaabbaa", "aa", 2));
        assertEquals(1, StringUtils.indexOfIgnoreCase("ABc", "bc"));
    }

    @Test
    public void testContains() {
        assertTrue(StringUtils.contains("abc", 'b'));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains(null, 'a'));

        assertTrue(StringUtils.containsAny("abc", "b"));
        assertFalse(StringUtils.containsAny("abc", "x"));

        assertTrue(StringUtils.containsNone("ab", "cd"));
        assertFalse(StringUtils.containsNone("ab", "bc"));

        assertTrue(StringUtils.containsOnly("ab", "ab"));
        assertFalse(StringUtils.containsOnly("ab", "a"));
    }

    @Test
    public void testIndexOfAny() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "aby"));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[] {'b', 'y'}));
    }

    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSplit() {
        assertArrayEquals(
            new String[] {"a", "b", "c"},
            StringUtils.split(" a b  c ")
        );
        assertArrayEquals(
            new String[] {"a", "b", "c"},
            StringUtils.split("a:b:c", ':')
        );
        assertArrayEquals(
            new String[] {"a", "b:c"},
            StringUtils.split("a:b:c", ":", 2)
        );
    }

    @Test
    public void testSplitPreserveAllTokensAndWhole() {
        assertArrayEquals(
            new String[] {"a", "", "b"},
            StringUtils.splitPreserveAllTokens("a,,b", ',')
        );
        assertArrayEquals(
            new String[] {"ab", "cd", "ef"},
            StringUtils.splitByWholeSeparator("ab:cd:ef", ":")
        );
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(
            new String[] {"foo", "Bar"},
            StringUtils.splitByCharacterTypeCamelCase("fooBar")
        );
    }

    @Test
    public void testJoin() {
        assertEquals("a,b,c", StringUtils.join(new String[] {"a", "b", "c"}, ','));
        assertEquals("a-b", StringUtils.join(new String[] {"a", "b"}, "-"));
        assertNull(StringUtils.join((Object[]) null, ','));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace(" a b \t c "));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testReplace() {
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("zba", StringUtils.replace("aba", "a", "z", 1));
        assertEquals("heLLo", StringUtils.replaceChars("hello", "l", "L"));
        assertEquals("Hexyz World", StringUtils.overlay("Hello World", "xyz", 2, 5));
    }

    @Test
    public void testChompAndChop() {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc"));

        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("a"));
        assertNull(StringUtils.chop(null));
    }

    @Test
    public void testRepeat() {
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("", StringUtils.repeat("ab", 0));
        assertEquals("", StringUtils.repeat("ab", -1));
        assertEquals("ab-ab-ab", StringUtils.repeat("ab", "-", 3));
    }

    @Test
    public void testPadding() {
        assertEquals("ab   ", StringUtils.rightPad("ab", 5, ' '));
        assertEquals("00ab", StringUtils.leftPad("ab", 4, '0'));
        assertEquals("  ab  ", StringUtils.center("ab", 6, ' '));
    }

    @Test
    public void testCaseMethods() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("aBc"));
        assertEquals("abc", StringUtils.lowerCase("aBc"));
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("hello", StringUtils.uncapitalize("Hello"));
        assertEquals("AbC", StringUtils.swapCase("aBc"));
    }

    @Test
    public void testCountMatches() {
        assertEquals(2, StringUtils.countMatches("abcabc", "bc"));
        assertEquals(3, StringUtils.countMatches("ababa", "a"));
        assertEquals(0, StringUtils.countMatches("abc", "z"));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("x", StringUtils.defaultString("x"));
        assertEquals("D", StringUtils.defaultIfBlank(" ", "D"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "D"));
        assertEquals("D", StringUtils.defaultIfEmpty("", "D"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdef", StringUtils.abbreviate("abcdef", 6));
    }

    @Test
    public void testStartsEnds() {
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABC", "ab"));
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABC", "bc"));
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testNormalizeSpace() {
        assertEquals("a b", StringUtils.normalizeSpace("  a \t b  "));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertNull(StringUtils.normalizeSpace(null));
    }

    @Test
    public void testCommonPrefixAndDifference() {
        assertEquals("ab", StringUtils.getCommonPrefix("abcdef", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abc", "abx"));
        assertEquals("x", StringUtils.difference("abc", "abx"));
    }

    @Test
    public void testLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(3, StringUtils.getLevenshteinDistance("kitten", "sitting"));
    }
}