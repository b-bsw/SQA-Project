package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Assert;

public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertFalse(StringUtils.isEmpty(" "));
        Assert.assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsBlank() {
        Assert.assertTrue(StringUtils.isBlank(null));
        Assert.assertTrue(StringUtils.isBlank(""));
        Assert.assertTrue(StringUtils.isBlank("   "));
        Assert.assertFalse(StringUtils.isBlank(" a "));
        Assert.assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testTrim() {
        Assert.assertNull(StringUtils.trim(null));
        Assert.assertEquals("", StringUtils.trim(""));
        Assert.assertEquals("abc", StringUtils.trim("  abc  "));
        Assert.assertEquals("ab c", StringUtils.trim(" ab c "));
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(StringUtils.equals(null, null));
        Assert.assertFalse(StringUtils.equals(null, "a"));
        Assert.assertFalse(StringUtils.equals("a", null));
        Assert.assertTrue(StringUtils.equals("hello", "hello"));
        Assert.assertFalse(StringUtils.equals("hello", "HELLO"));
    }

    @Test
    public void testIndexOfChar() {
        Assert.assertEquals(-1, StringUtils.indexOf(null, 'a'));
        Assert.assertEquals(-1, StringUtils.indexOf("", 'a'));
        Assert.assertEquals(0, StringUtils.indexOf("abc", 'a'));
        Assert.assertEquals(2, StringUtils.indexOf("abc", 'c'));
        Assert.assertEquals(-1, StringUtils.indexOf("abc", 'd'));
    }

    @Test
    public void testIndexOfString() {
        Assert.assertEquals(-1, StringUtils.indexOf(null, "abc"));
        Assert.assertEquals(-1, StringUtils.indexOf("abc", null));
        Assert.assertEquals(0, StringUtils.indexOf("abc", "ab"));
        Assert.assertEquals(1, StringUtils.indexOf("abc", "bc"));
        Assert.assertEquals(-1, StringUtils.indexOf("abc", "d"));
    }

    @Test
    public void testContainsChar() {
        Assert.assertFalse(StringUtils.contains(null, 'a'));
        Assert.assertFalse(StringUtils.contains("", 'a'));
        Assert.assertTrue(StringUtils.contains("abc", 'a'));
        Assert.assertFalse(StringUtils.contains("abc", 'd'));
    }

    @Test
    public void testContainsString() {
        Assert.assertFalse(StringUtils.contains(null, "a"));
        Assert.assertFalse(StringUtils.contains("a", null));
        Assert.assertTrue(StringUtils.contains("abc", "ab"));
        Assert.assertFalse(StringUtils.contains("abc", "d"));
    }

    @Test
    public void testReplace() {
        Assert.assertNull(StringUtils.replace(null, "a", "b"));
        Assert.assertEquals("", StringUtils.replace("", "a", "b"));
        Assert.assertEquals("abcd", StringUtils.replace("abca", "a", "x", 1));
        Assert.assertEquals("xbca", StringUtils.replace("abca", "a", "x", 2));
        Assert.assertEquals("xbcd", StringUtils.replace("abca", "a", "x", -1));
        Assert.assertEquals("abc", StringUtils.replace("abc", "d", "x"));
    }

    @Test
    public void testSubstring() {
        Assert.assertNull(StringUtils.substring(null, 0));
        Assert.assertEquals("", StringUtils.substring("", 0));
        Assert.assertEquals("bc", StringUtils.substring("abc", 1));
        Assert.assertEquals("abc", StringUtils.substring("abc", -3));
        Assert.assertEquals("", StringUtils.substring("abc", 10));
        Assert.assertNull(StringUtils.substring(null, 0, 1));
        Assert.assertEquals("", StringUtils.substring("abc", 2, 1));
        Assert.assertEquals("ab", StringUtils.substring("abc", 0, 2));
        Assert.assertEquals("", StringUtils.substring("abc", 10, 20));
    }

    @Test
    public void testSplit() {
        Assert.assertNull(StringUtils.split((String) null));
        Assert.assertEquals(0, StringUtils.split("").length);
        Assert.assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
        Assert.assertArrayEquals(new String[]{"hello", "world"}, StringUtils.split("hello world"));
        Assert.assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a:b:c", ':'));
    }

    @Test
    public void testJoinObjectArray() {
        Assert.assertNull(StringUtils.join((Object[]) null));
        Assert.assertEquals("", StringUtils.join(new Object[]{}));
        Assert.assertEquals("a", StringUtils.join(new Object[]{"a"}));
        Assert.assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
        Assert.assertEquals("ab", StringUtils.join(new Object[]{"a", "b"}, ""));
        Assert.assertEquals("a-b", StringUtils.join(new Object[]{"a", "b"}, "-"));
    }

    @Test
    public void testRepeat() {
        Assert.assertNull(StringUtils.repeat(null, 2));
        Assert.assertEquals("", StringUtils.repeat("ab", 0));
        Assert.assertEquals("ab", StringUtils.repeat("ab", 1));
        Assert.assertEquals("abab", StringUtils.repeat("ab", 2));
        Assert.assertEquals("aaa", StringUtils.repeat("a", 3));
        Assert.assertEquals("", StringUtils.repeat("ab", -1));
    }

    @Test
    public void testLeftPad() {
        Assert.assertNull(StringUtils.leftPad(null, 5));
        Assert.assertEquals("  abc", StringUtils.leftPad("abc", 5));
        Assert.assertEquals("abc", StringUtils.leftPad("abc", 2));
        Assert.assertEquals("--abc", StringUtils.leftPad("abc", 5, '-'));
        Assert.assertEquals("ababc", StringUtils.leftPad("abc", 5, "ab"));
        Assert.assertEquals("ab", StringUtils.leftPad("", 2, "ab"));
    }

    @Test
    public void testRightPad() {
        Assert.assertNull(StringUtils.rightPad(null, 5));
        Assert.assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        Assert.assertEquals("abc", StringUtils.rightPad("abc", 2));
        Assert.assertEquals("abc--", StringUtils.rightPad("abc", 5, '-'));
        Assert.assertEquals("abc ab", StringUtils.rightPad("abc", 6, " ab"));
    }

    @Test
    public void testCapitalize() {
        Assert.assertNull(StringUtils.capitalize(null));
        Assert.assertEquals("", StringUtils.capitalize(""));
        Assert.assertEquals("Hello", StringUtils.capitalize("hello"));
        Assert.assertEquals("Hello", StringUtils.capitalize("Hello"));
    }

    @Test
    public void testDeleteWhitespace() {
        Assert.assertEquals("", StringUtils.deleteWhitespace(null));
        Assert.assertEquals("", StringUtils.deleteWhitespace(""));
        Assert.assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
        Assert.assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        Assert.assertEquals("", StringUtils.deleteWhitespace("   "));
    }

    @Test
    public void testDifference() {
        Assert.assertEquals("abc", StringUtils.difference(null, "abc"));
        Assert.assertEquals("xyz", StringUtils.difference("xyz", null));
        Assert.assertEquals("", StringUtils.difference("abc", "abc"));
        Assert.assertEquals("def", StringUtils.difference("abc", "abdef"));
        Assert.assertEquals("", StringUtils.difference("abc", "ab"));
    }

    @Test
    public void testStartsWith() {
        Assert.assertFalse(StringUtils.startsWith(null, "a"));
        Assert.assertFalse(StringUtils.startsWith("a", null));
        Assert.assertTrue(StringUtils.startsWith("abc", "ab"));
        Assert.assertFalse(StringUtils.startsWith("abc", "bc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNull() {
        StringUtils.getLevenshteinDistance(null, "abc");
    }

    @Test
    public void testGetLevenshteinDistance() {
        Assert.assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        Assert.assertEquals(3, StringUtils.getLevenshteinDistance("abc", ""));
        Assert.assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        Assert.assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        Assert.assertEquals(1, StringUtils.getLevenshteinDistance("abc", "abd"));
        Assert.assertEquals(2, StringUtils.getLevenshteinDistance("abc", "adc"));
    }
}