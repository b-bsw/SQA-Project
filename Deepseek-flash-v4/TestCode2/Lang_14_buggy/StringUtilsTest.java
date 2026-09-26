package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty("abc"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("abc"));
        assertFalse(StringUtils.isBlank("  abc  "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank("   "));
        assertTrue(StringUtils.isNotBlank("abc"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null, null));
        assertEquals("", StringUtils.strip("", null));
        assertEquals("abc", StringUtils.strip("  abc  ", null));
        assertEquals("abc", StringUtils.strip("  abc  ", " "));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("", StringUtils.stripStart("", null));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        assertEquals("abc", StringUtils.stripStart("abc", "ab"));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("", StringUtils.stripEnd("", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        assertEquals("abc", StringUtils.stripEnd("abc", "abc"));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"  abc  ", "  def  "}));
    }

    @Test
    public void testStripAllWithStripChars() {
        assertNull(StringUtils.stripAll(null, null));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.stripAll(new String[]{"abc", "def"}, "x"));
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertTrue(StringUtils.equals("", ""));
        assertFalse(StringUtils.equals(null, ""));
        assertFalse(StringUtils.equals("", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, ""));
        assertFalse(StringUtils.equalsIgnoreCase("", null));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "ab"));
    }

    @Test
    public void testIndexOfInt() {
        assertEquals(-1, StringUtils.indexOf((CharSequence) null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(1, StringUtils.indexOf("abc", 'b'));
    }

    @Test
    public void testIndexOfIntStartPos() {
        assertEquals(-1, StringUtils.indexOf((CharSequence) null, 'a', 0));
        assertEquals(-1, StringUtils.indexOf("", 'a', 0));
        assertEquals(1, StringUtils.indexOf("abc", 'b', 0));
        assertEquals(-1, StringUtils.indexOf("abc", 'a', 1));
    }

    @Test
    public void testIndexOfCharSequence() {
        assertEquals(-1, StringUtils.indexOf((CharSequence) null, (CharSequence) "a"));
        assertEquals(-1, StringUtils.indexOf("abc", (CharSequence) null));
        assertEquals(0, StringUtils.indexOf("abc", (CharSequence) "a"));
        assertEquals(1, StringUtils.indexOf("abc", (CharSequence) "bc"));
    }

    @Test
    public void testIndexOfCharSequenceStartPos() {
        assertEquals(-1, StringUtils.indexOf((CharSequence) null, (CharSequence) "a", 0));
        assertEquals(1, StringUtils.indexOf("abc", (CharSequence) "bc", 0));
        assertEquals(-1, StringUtils.indexOf("abc", (CharSequence) "a", 1));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("abc", "a", 1));
        assertEquals(3, StringUtils.ordinalIndexOf("abcabc", "a", 2));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("abc", "A"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("abc", "B"));
    }

    @Test
    public void testLastIndexOfInt() {
        assertEquals(-1, StringUtils.lastIndexOf((CharSequence) null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(2, StringUtils.lastIndexOf("abc", 'c'));
    }

    @Test
    public void testLastIndexOfIntStartPos() {
        assertEquals(-1, StringUtils.lastIndexOf((CharSequence) null, 'a', 0));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a', 0));
        assertEquals(2, StringUtils.lastIndexOf("abc", 'c', 2));
    }

    @Test
    public void testLastIndexOfCharSequence() {
        assertEquals(-1, StringUtils.lastIndexOf((CharSequence) null, (CharSequence) "a"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", (CharSequence) null));
        assertEquals(1, StringUtils.lastIndexOf("abcabc", (CharSequence) "bc"));
    }

    @Test
    public void testLastOrdinalIndexOf() {
        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("abc", null, 1));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("abc", "a", 0));
        assertEquals(0, StringUtils.lastOrdinalIndexOf("abc", "a", 1));
        assertEquals(3, StringUtils.lastOrdinalIndexOf("abcabc", "a", 2));
    }

    @Test
    public void testLastIndexOfCharSequenceStartPos() {
        assertEquals(-1, StringUtils.lastIndexOf((CharSequence) null, (CharSequence) "a", 0));
        assertEquals(-1, StringUtils.lastIndexOf("abc", (CharSequence) null, 0));
        assertEquals(1, StringUtils.lastIndexOf("abcabc", (CharSequence) "bc", 3));
    }

    @Test
    public void testLastIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", null));
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("abcABC", "c"));
    }

    @Test
    public void testContainsInt() {
        assertFalse(StringUtils.contains((CharSequence) null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
    }

    @Test
    public void testContainsCharSequence() {
        assertFalse(StringUtils.contains((CharSequence) null, (CharSequence) "a"));
        assertFalse(StringUtils.contains("abc", (CharSequence) null));
        assertTrue(StringUtils.contains("abc", (CharSequence) "bc"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
    }

    @Test
    public void testContainsWhitespace() {
        assertFalse(StringUtils.containsWhitespace(null));
        assertFalse(StringUtils.containsWhitespace(""));
        assertTrue(StringUtils.containsWhitespace("abc def"));
        assertFalse(StringUtils.containsWhitespace("abc"));
    }

    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, 'a', 'b'));
        assertEquals(-1, StringUtils.indexOfAny("", 'a', 'b'));
        assertEquals(0, StringUtils.indexOfAny("abc", 'a', 'd'));
        assertEquals(1, StringUtils.indexOfAny("abc", 'd', 'b'));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "ab"));
        assertEquals(-1, StringUtils.indexOfAny("", "ab"));
        assertEquals(0, StringUtils.indexOfAny("abc", "ab"));
    }

    @Test
    public void testContainsAnyChars() {
        assertFalse(StringUtils.containsAny((CharSequence) null, 'a', 'b'));
        assertFalse(StringUtils.containsAny("", 'a', 'b'));
        assertTrue(StringUtils.containsAny("abc", 'a', 'd'));
        assertFalse(StringUtils.containsAny("abc", 'd', 'e'));
    }

    @Test
    public void testContainsAnyCharSequence() {
        assertFalse(StringUtils.containsAny((CharSequence) null, (CharSequence) "ab"));
        assertFalse(StringUtils.containsAny("abc", (CharSequence) null));
        assertTrue(StringUtils.containsAny("abc", (CharSequence) "ab"));
    }

    @Test
    public void testIndexOfAnyButChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut((CharSequence) null, 'a', 'b'));
        assertEquals(-1, StringUtils.indexOfAnyBut("", 'a', 'b'));
        assertEquals(2, StringUtils.indexOfAnyBut("abc", 'a', 'b'));
        assertEquals(-1, StringUtils.indexOfAnyBut("aaa", 'a'));
    }

    @Test
    public void testIndexOfAnyButCharSequence() {
        assertEquals(-1, StringUtils.indexOfAnyBut((CharSequence) null, "ab"));
        assertEquals(-1, StringUtils.indexOfAnyBut("", "ab"));
        assertEquals(2, StringUtils.indexOfAnyBut("abc", "ab"));
    }

    @Test
    public void testContainsOnlyChars() {
        assertFalse(StringUtils.containsOnly((CharSequence) null, 'a'));
        assertFalse(StringUtils.containsOnly("", (char[]) null));
        assertTrue(StringUtils.containsOnly("", 'a'));
        assertFalse(StringUtils.containsOnly("abc", 'a', 'b'));
        assertTrue(StringUtils.containsOnly("ab", 'a', 'b'));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly((CharSequence) null, "ab"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("ab", "ab"));
    }

    @Test
    public void testContainsNoneChars() {
        assertTrue(StringUtils.containsNone((CharSequence) null, 'a'));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("abc", 'd', 'e'));
        assertFalse(StringUtils.containsNone("abc", 'a', 'd'));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone((CharSequence) null, "ab"));
        assertTrue(StringUtils.containsNone("abc", (String) null));
        assertFalse(StringUtils.containsNone("abc", "ab"));
    }

    @Test
    public void testIndexOfAnySearchStrs() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "a", "b"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (CharSequence[]) null));
        assertEquals(0, StringUtils.indexOfAny("abc", "a", "d"));
        assertEquals(1, StringUtils.indexOfAny("abc", "d", "b"));
    }

    @Test
    public void testLastIndexOfAny() {
        assertEquals(-1, StringUtils.lastIndexOfAny((CharSequence) null, "a", "b"));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (CharSequence[]) null));
        assertEquals(1, StringUtils.lastIndexOfAny("abcabc", "b", "c"));
    }

    @Test
    public void testSubstringStart() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("", StringUtils.substring("abc", 5));
        assertEquals("c", StringUtils.substring("abc", -1));
    }

    @Test
    public void testSubstringStartEnd() {
        assertNull(StringUtils.substring(null, 0, 0));
        assertEquals("", StringUtils.substring("", 0, 0));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("", StringUtils.substring("abc", 2, 1));
        assertEquals("c", StringUtils.substring("abc", -1, 3));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 0));
        assertEquals("", StringUtils.left("", 0));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("ab", StringUtils.left("abc", 2));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 0));
        assertEquals("", StringUtils.right("", 0));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("bc", StringUtils.right("abc", 2));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 0, 0));
        assertEquals("", StringUtils.mid("", 0, 0));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 5, 1));
        assertEquals("abc", StringUtils.mid("abc", 0, 5));
        assertEquals("b", StringUtils.mid("abc", 1, 1));
    }

    @Test
    public void testSubstringBefore() {
        assertEquals("abc", StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("a", StringUtils.substringBefore("abc", "b"));
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
    }

    @Test
    public void testSubstringAfter() {
        assertEquals("abc", StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertEquals("abc", StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
        assertEquals("ab", StringUtils.substringBeforeLast("abcabc", "c"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", "d"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertEquals("abc", StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("c", StringUtils.substringAfterLast("abcabc", "c"));
        assertEquals("", StringUtils.substringAfterLast("abc", "d"));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertEquals("b", StringUtils.substringBetween("abc", "a", "c"));
        assertNull(StringUtils.substringBetween("abc", "a", "d"));
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "a", "c"));
        assertNull(StringUtils.substringsBetween("abc", "", "c"));
        assertNull(StringUtils.substringsBetween("abc", "a", ""));
        assertArrayEquals(new String[]{"b"}, StringUtils.substringsBetween("abc", "a", "c"));
        assertArrayEquals(new String[]{"b", "d"}, StringUtils.substringsBetween("abcabc", "a", "c"));
        assertNull(StringUtils.substringsBetween("", "a", "c"));
    }

    @Test
    public void testSplit() {
        assertArrayEquals(new String[]{"abc"}, StringUtils.split("abc"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c"));
    }

    @Test
    public void testSplitChar() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ','));
    }

    @Test
    public void testSplitString() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c", " "));
    }

    @Test
    public void testSplitStringMax() {
        assertArrayEquals(new String[]{"a", "b c"}, StringUtils.split("a b c", " ", 2));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitByWholeSeparator("a b c", " "));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("a,,b,c", ","));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a b c", ' '));
    }

    @Test
    public void testSplitByCharacterType() {
        assertArrayEquals(new String[]{"abc", " ", "def"}, StringUtils.splitByCharacterType("abc def"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(new String[]{"abc", "Def"}, StringUtils.splitByCharacterTypeCamelCase("abcDef"));
    }

    @Test
    public void testJoinVarargs() {
        assertEquals("abc", StringUtils.join("a", "b", "c"));
    }

    @Test
    public void testJoinArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ','));
        assertEquals("", StringUtils.join(new Object[0], ','));
        assertEquals("a,b", StringUtils.join(new Object[]{"a", "b"}, ','));
    }

    @Test
    public void testJoinArrayString() {
        assertEquals("a-b", StringUtils.join(new Object[]{"a", "b"}, "-"));
    }

    @Test
    public void testJoinIteratorChar() {
        assertNull(StringUtils.join((Iterator<?>) null, ','));
        assertEquals("", StringUtils.join(new ArrayList<Object>().iterator(), ','));
        List<String> list = Arrays.asList("a", "b");
        assertEquals("a,b", StringUtils.join(list.iterator(), ','));
    }

    @Test
    public void testJoinIteratorString() {
        assertEquals("a-b", StringUtils.join(Arrays.asList("a", "b").iterator(), "-"));
    }

    @Test
    public void testJoinIterableChar() {
        assertNull(StringUtils.join((Iterable<?>) null, ','));
        assertEquals("a,b", StringUtils.join(Arrays.asList("a", "b"), ','));
    }

    @Test
    public void testDeleteWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("a b c"));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testRemoveStart() {
        assertEquals("c", StringUtils.removeStart("abc", "ab"));
        assertEquals("abc", StringUtils.removeStart("abc", "d"));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
        assertEquals("", StringUtils.removeStart("", "a"));
        assertNull(StringUtils.removeStart(null, "a"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertEquals("c", StringUtils.removeStartIgnoreCase("abc", "AB"));
    }

    @Test
    public void testRemoveEnd() {
        assertEquals("a", StringUtils.removeEnd("abc", "bc"));
        assertEquals("abc", StringUtils.removeEnd("abc", "d"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertEquals("a", StringUtils.removeEndIgnoreCase("abc", "BC"));
    }

    @Test
    public void testRemoveString() {
        assertEquals("", StringUtils.remove("abc", "abc"));
        assertEquals("abc", StringUtils.remove("abc", "d"));
    }

    @Test
    public void testRemoveChar() {
        assertEquals("bc", StringUtils.remove("abc", 'a'));
        assertEquals("abc", StringUtils.remove("abc", 'd'));
    }

    @Test
    public void testReplaceOnce() {
        assertEquals("aXc", StringUtils.replaceOnce("abc", "b", "X"));
        assertEquals("abc", StringUtils.replaceOnce("abc", "d", "X"));
    }

    @Test
    public void testReplace() {
        assertEquals("aXc", StringUtils.replace("abc", "b", "X"));
        assertEquals("aXc", StringUtils.replace("abc", "b", "X", 1));
    }

    @Test
    public void testReplaceEach() {
        assertEquals("XY", StringUtils.replaceEach("ab", new String[]{"a", "b"}, new String[]{"X", "Y"}));
        assertEquals("ab", StringUtils.replaceEach("ab", new String[]{"c", "d"}, new String[]{"X", "Y"}));
    }

    @Test
    public void testReplaceEachRepeatedly() {
        assertEquals("Xz", StringUtils.replaceEachRepeatedly("abz", new String[]{"a", "ab"}, new String[]{"ab", "X"}));
    }

    @Test
    public void testReplaceCharsChar() {
        assertEquals("Xbc", StringUtils.replaceChars("abc", 'a', 'X'));
        assertEquals("abc", StringUtils.replaceChars(null, 'a', 'X'));
    }

    @Test
    public void testReplaceCharsString() {
        assertEquals("Xbc", StringUtils.replaceChars("abc", "a", "X"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", "X"));
        assertEquals("abc", StringUtils.replaceChars("abc", "d", "X"));
    }

    @Test
    public void testOverlay() {
        assertEquals("Xbc", StringUtils.overlay("abc", "X", 0, 1));
        assertEquals("abc", StringUtils.overlay(null, "X", 0, 1));
        assertEquals("aXc", StringUtils.overlay("abc", "X", 1, 2));
        assertEquals("Xbc", StringUtils.overlay("abc", "X", -1, 1));
        assertEquals("abcX", StringUtils.overlay("abc", "X", 3, 5));
        assertEquals("Xabc", StringUtils.overlay("abc", "X", 0, 0));
    }

    @Test
    public void testChomp() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("", StringUtils.chomp("\n"));
        assertEquals("abc", StringUtils.chomp("abc"));
        assertEquals("", StringUtils.chomp(""));
        assertNull(StringUtils.chomp(null));
    }

    @Test
    public void testChop() {
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("", StringUtils.chop(""));
        assertNull(StringUtils.chop(null));
        assertEquals("ab", StringUtils.chop("ab\n"));
    }

    @Test
    public void testRepeatString() {
        assertEquals("abcabc", StringUtils.repeat("abc", 2));
        assertEquals("", StringUtils.repeat("abc", 0));
        assertEquals("", StringUtils.repeat("abc", -1));
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("a", StringUtils.repeat("a", 1));
    }

    @Test
    public void testRepeatStringSeparator() {
        assertEquals("abc,abc", StringUtils.repeat("abc", ",", 2));
        assertEquals("abc", StringUtils.repeat("abc", ",", 1));
    }

    @Test
    public void testRepeatChar() {
        assertEquals("aaa", StringUtils.repeat('a', 3));
        assertEquals("", StringUtils.repeat('a', 0));
    }

    @Test
    public void testRightPad() {
        assertEquals("abc   ", StringUtils.rightPad("abc", 6));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
        assertNull(StringUtils.rightPad(null, 6));
        assertEquals("abc***", StringUtils.rightPad("abc", 6, '*'));
    }

    @Test
    public void testLeftPad() {
        assertEquals("   abc", StringUtils.leftPad("abc", 6));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
        assertNull(StringUtils.leftPad(null, 6));
        assertEquals("***abc", StringUtils.leftPad("abc", 6, '*'));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void testCenter() {
        assertEquals(" abc ", StringUtils.center("abc", 5));
        assertEquals("abc", StringUtils.center("abc", 2));
        assertNull(StringUtils.center(null, 5));
        assertEquals("*abc*", StringUtils.center("abc", 5, '*'));
    }

    @Test
    public void testUpperCase() {
        assertEquals("ABC", StringUtils.upperCase("abc"));
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testLowerCase() {
        assertEquals("abc", StringUtils.lowerCase("ABC"));
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testCapitalize() {
        assertEquals("Abc", StringUtils.capitalize("abc"));
        assertEquals("", StringUtils.capitalize(""));
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    public void testUncapitalize() {
        assertEquals("aBC", StringUtils.uncapitalize("ABC"));
        assertEquals("", StringUtils.uncapitalize(""));
        assertNull(StringUtils.uncapitalize(null));
    }

    @Test
    public void testSwapCase() {
        assertEquals("ABC", StringUtils.swapCase("abc"));
        assertEquals("abc", StringUtils.swapCase("ABC"));
        assertEquals("", StringUtils.swapCase(""));
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testCountMatches() {
        assertEquals(2, StringUtils.countMatches("abcabc", "a"));
        assertEquals(0, StringUtils.countMatches("abc", "d"));
        assertEquals(0, StringUtils.countMatches("abc", ""));
        assertEquals(0, StringUtils.countMatches("", "a"));
        assertEquals(0, StringUtils.countMatches((CharSequence) null, "a"));
    }

    @Test
    public void testIsAlpha() {
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("abc1"));
        assertFalse(StringUtils.isAlpha(""));
        assertFalse(StringUtils.isAlpha(null));
    }

    @Test
    public void testIsAlphaSpace() {
        assertTrue(StringUtils.isAlphaSpace("abc "));
        assertFalse(StringUtils.isAlphaSpace("abc1"));
        assertFalse(StringUtils.isAlphaSpace(null));
    }

    @Test
    public void testIsAlphanumeric() {
        assertTrue(StringUtils.isAlphanumeric("abc123"));
        assertFalse(StringUtils.isAlphanumeric("abc_"));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertFalse(StringUtils.isAlphanumeric(null));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertTrue(StringUtils.isAlphanumericSpace("abc 123"));
        assertFalse(StringUtils.isAlphanumericSpace("abc_"));
        assertFalse(StringUtils.isAlphanumericSpace(null));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertTrue(StringUtils.isAsciiPrintable("abc"));
        assertFalse(StringUtils.isAsciiPrintable("\u00e9"));
        assertFalse(StringUtils.isAsciiPrintable(null));
    }

    @Test
    public void testIsNumeric() {
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("abc"));
        assertFalse(StringUtils.isNumeric(""));
        assertFalse(StringUtils.isNumeric(null));
    }

    @Test
    public void testIsNumericSpace() {
        assertTrue(StringUtils.isNumericSpace("123 "));
        assertFalse(StringUtils.isNumericSpace("abc"));
        assertFalse(StringUtils.isNumericSpace(null));
    }

    @Test
    public void testIsWhitespace() {
        assertTrue(StringUtils.isWhitespace("   "));
        assertFalse(StringUtils.isWhitespace("abc"));
        assertFalse(StringUtils.isWhitespace(""));
        assertFalse(StringUtils.isWhitespace(null));
    }

    @Test
    public void testIsAllLowerCase() {
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("Abc"));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertFalse(StringUtils.isAllLowerCase(null));
    }

    @Test
    public void testIsAllUpperCase() {
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("Abc"));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertFalse(StringUtils.isAllUpperCase(null));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
    }

    @Test
    public void testDefaultStringWithDefault() {
        assertEquals("xyz", StringUtils.defaultString(null, "xyz"));
        assertEquals("abc", StringUtils.defaultString("abc", "xyz"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("xyz", StringUtils.defaultIfBlank("", "xyz"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "xyz"));
        assertEquals("xyz", StringUtils.defaultIfBlank(null, "xyz"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("xyz", StringUtils.defaultIfEmpty("", "xyz"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "xyz"));
        assertEquals("xyz", StringUtils.defaultIfEmpty(null, "xyz"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverseDelimited() {
        assertEquals("c/b/a", StringUtils.reverseDelimited("a/b/c", '/'));
        assertNull(StringUtils.reverseDelimited(null, '/'));
    }

    @Test
    public void testAbbreviate() {
        assertEquals("ab...", StringUtils.abbreviate("abcdefg", 5));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
        assertNull(StringUtils.abbreviate(null, 5));
        assertEquals("...f...", StringUtils.abbreviate("abcdefg", 0, 7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateMinWidth() {
        StringUtils.abbreviate("abc", 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateMinWidthWithOffset() {
        StringUtils.abbreviate("abcdefghij", 4, 6);
    }

    @Test
    public void testAbbreviateMiddle() {
        assertEquals("ab...fg", StringUtils.abbreviateMiddle("abcdefg", "...", 5));
        assertEquals("abcdefg", StringUtils.abbreviateMiddle("abcdefg", "...", 8));
    }

    @Test
    public void testDifference() {
        assertEquals("c", StringUtils.difference("ab", "abc"));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("ab", StringUtils.difference("ab", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testIndexOfDifference() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abc"));
        assertEquals(0, StringUtils.indexOfDifference(null, "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", null));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("ab", StringUtils.getCommonPrefix("abc", "ab"));
        assertEquals("", StringUtils.getCommonPrefix("abc", "def"));
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
    }

    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(3, StringUtils.getLevenshteinDistance("abc", "def"));
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc"));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "def"));
        assertEquals(3, StringUtils.getLevenshteinDistance("abc", ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNull() {
        StringUtils.getLevenshteinDistance(null, "abc");
    }

    @Test
    public void testGetLevenshteinDistanceWithThreshold() {
        assertEquals(3, StringUtils.getLevenshteinDistance("abc", "def", 3));
        assertEquals(-1, StringUtils.getLevenshteinDistance("abc", "def", 2));
        assertEquals(0, StringUtils.getLevenshteinDistance("abc", "abc", 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceWithThresholdNull() {
        StringUtils.getLevenshteinDistance(null, "abc", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceWithThresholdNegative() {
        StringUtils.getLevenshteinDistance("abc", "def", -1);
    }

    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith("abc", "ab"));
        assertFalse(StringUtils.startsWith("abc", "bc"));
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith("abc", null));
        assertFalse(StringUtils.startsWith(null, "ab"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("abc", "AB"));
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "bc"));
    }

    @Test
    public void testStartsWithAny() {
        assertTrue(StringUtils.startsWithAny("abc", "ab", "bc"));
        assertFalse(StringUtils.startsWithAny("abc", "bc", "cd"));
        assertFalse(StringUtils.startsWithAny(null, "ab"));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith("abc", "bc"));
        assertFalse(StringUtils.endsWith("abc", "ab"));
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith("abc", null));
        assertFalse(StringUtils.endsWith(null, "bc"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "ab"));
    }

    @Test
    public void testEndsWithAny() {
        assertTrue(StringUtils.endsWithAny("abc", "bc", "cd"));
        assertFalse(StringUtils.endsWithAny("abc", "ab", "cd"));
        assertFalse(StringUtils.endsWithAny(null, "bc"));
    }

    @Test
    public void testNormalizeSpace() {
        assertEquals("a b c", StringUtils.normalizeSpace("  a   b  c  "));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertNull(StringUtils.normalizeSpace(null));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-8");
        assertEquals("abc", StringUtils.toString(bytes, "UTF-8"));
        assertEquals("abc", StringUtils.toString(bytes, null));
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testToStringUnsupportedEncoding() throws UnsupportedEncodingException {
        StringUtils.toString(new byte[0], "unsupported");
    }
}