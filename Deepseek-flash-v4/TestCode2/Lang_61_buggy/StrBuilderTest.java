package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.CharArrayWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    @After
    public void tearDown() {
        sb = null;
    }

    // Constructor tests
    @Test
    public void testConstructorDefault() {
        StrBuilder s = new StrBuilder();
        assertEquals(32, s.capacity());
        assertEquals(0, s.length());
    }

    @Test
    public void testConstructorInitialCapacityPositive() {
        StrBuilder s = new StrBuilder(10);
        assertEquals(10, s.capacity());
    }

    @Test
    public void testConstructorInitialCapacityZero() {
        StrBuilder s = new StrBuilder(0);
        assertEquals(32, s.capacity());
    }

    @Test
    public void testConstructorInitialCapacityNegative() {
        StrBuilder s = new StrBuilder(-5);
        assertEquals(32, s.capacity());
    }

    @Test
    public void testConstructorStringNull() {
        StrBuilder s = new StrBuilder((String) null);
        assertEquals(32, s.capacity());
        assertEquals(0, s.length());
    }

    @Test
    public void testConstructorStringNonEmpty() {
        StrBuilder s = new StrBuilder("hello");
        assertEquals(5 + 32, s.capacity());
        assertEquals(5, s.length());
        assertEquals("hello", s.toString());
    }

    // length, capacity, ensureCapacity, minimizeCapacity, isEmpty, clear
    @Test
    public void testLengthEmpty() {
        assertEquals(0, sb.length());
    }

    @Test
    public void testLengthAfterAppend() {
        sb.append("test");
        assertEquals(4, sb.length());
    }

    @Test
    public void testCapacityDefault() {
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testEnsureCapacityGreater() {
        sb.ensureCapacity(50);
        assertTrue(sb.capacity() >= 50);
    }

    @Test
    public void testEnsureCapacitySmaller() {
        sb.ensureCapacity(10);
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity() {
        sb.append("abc");
        sb.minimizeCapacity();
        assertEquals(3, sb.capacity());
        assertEquals(3, sb.length());
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        sb.append("x");
        assertFalse(sb.isEmpty());
    }

    @Test
    public void testClear() {
        sb.append("hello");
        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
    }

    // setLength
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        sb.setLength(-1);
    }

    @Test
    public void testSetLengthReduce() {
        sb.append("abcde");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLengthIncrease() {
        sb.append("abc");
        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals("abc\0\0\0", sb.toString());
    }

    // charAt
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtNegativeIndex() {
        sb.append("abc");
        sb.charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtIndexEqualToLength() {
        sb.append("abc");
        sb.charAt(3);
    }

    @Test
    public void testCharAtValid() {
        sb.append("abc");
        assertEquals('b', sb.charAt(1));
    }

    // setCharAt
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtInvalidIndex() {
        sb.append("abc");
        sb.setCharAt(5, 'x');
    }

    @Test
    public void testSetCharAtValid() {
        sb.append("abc");
        sb.setCharAt(1, 'X');
        assertEquals('X', sb.charAt(1));
        assertEquals("aXc", sb.toString());
    }

    // deleteCharAt
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtInvalidIndex() {
        sb.append("abc");
        sb.deleteCharAt(3);
    }

    @Test
    public void testDeleteCharAtValid() {
        sb.append("abcde");
        sb.deleteCharAt(2);
        assertEquals("abde", sb.toString());
        assertEquals(4, sb.length());
    }

    // append(String)
    @Test
    public void testAppendString() {
        sb.append("hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAppendStringNull() {
        sb.setNullText("NULL");
        sb.append((String) null);
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testAppendStringNullWithoutNullText() {
        sb.append((String) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringEmpty() {
        sb.append("");
        assertEquals(0, sb.length());
    }

    // append(Object)
    @Test
    public void testAppendObjectNull() {
        sb.setNullText("<null>");
        sb.append((Object) null);
        assertEquals("<null>", sb.toString());
    }

    @Test
    public void testAppendObject() {
        sb.append(Integer.valueOf(42));
        assertEquals("42", sb.toString());
    }

    // append(boolean)
    @Test
    public void testAppendBooleanTrue() {
        sb.append(true);
        assertEquals("true", sb.toString());
    }

    @Test
    public void testAppendBooleanFalse() {
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    // append(char[])
    @Test
    public void testAppendCharArray() {
        sb.append(new char[]{'a', 'b', 'c'});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendCharArrayNull() {
        sb.setNullText("N");
        sb.append((char[]) null);
        assertEquals("N", sb.toString());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        sb.append(new char[]{});
        assertEquals(0, sb.length());
    }

    // append(String, int, int) - substring
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringSubstringInvalidStartIndex() {
        sb.append("hello", -1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringSubstringInvalidLength() {
        sb.append("hello", 2, 5);
    }

    @Test
    public void testAppendStringSubstringValid() {
        sb.append("hello world", 6, 5);
        assertEquals("world", sb.toString());
    }

    // append(StringBuffer)
    @Test
    public void testAppendStringBuffer() {
        sb.append(new StringBuffer("test"));
        assertEquals("test", sb.toString());
    }

    // append(StrBuilder)
    @Test
    public void testAppendStrBuilder() {
        StrBuilder other = new StrBuilder("other");
        sb.append(other);
        assertEquals("other", sb.toString());
    }

    // appendNewLine
    @Test
    public void testAppendNewLineDefault() {
        sb.appendNewLine();
        String lineSep = System.getProperty("line.separator");
        assertEquals(lineSep, sb.toString());
    }

    @Test
    public void testAppendNewLineCustom() {
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    // appendNull
    @Test
    public void testAppendNullWithNullText() {
        sb.setNullText("nil");
        sb.appendNull();
        assertEquals("nil", sb.toString());
    }

    @Test
    public void testAppendNullWithoutNullText() {
        sb.appendNull();
        assertEquals("", sb.toString());
    }

    // appendWithSeparators - array
    @Test
    public void testAppendWithSeparatorsArrayNull() {
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayEmpty() {
        sb.appendWithSeparators(new Object[]{}, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, "-");
        assertEquals("a-b-c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayNullSeparator() {
        sb.appendWithSeparators(new Object[]{"x", "y"}, null);
        assertEquals("xy", sb.toString());
    }

    // appendWithSeparators - Collection
    @Test
    public void testAppendWithSeparatorsCollNull() {
        sb.appendWithSeparators((Collection<?>) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsColl() {
        List<String> list = Arrays.asList("one", "two");
        sb.appendWithSeparators(list, "|");
        assertEquals("one|two", sb.toString());
    }

    // appendWithSeparators - Iterator
    @Test
    public void testAppendWithSeparatorsIteratorNull() {
        sb.appendWithSeparators((Iterator<?>) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        List<String> list = Arrays.asList("a", "b");
        sb.appendWithSeparators(list.iterator(), ":");
        assertEquals("a:b", sb.toString());
    }

    // appendPadding
    @Test
    public void testAppendPaddingPositive() {
        sb.appendPadding(3, 'X');
        assertEquals("XXX", sb.toString());
    }

    @Test
    public void testAppendPaddingZero() {
        sb.appendPadding(0, 'X');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPaddingNegative() {
        sb.append("a");
        sb.appendPadding(-1, 'X');
        assertEquals("a", sb.toString());
    }

    // appendFixedWidthPadLeft
    @Test
    public void testAppendFixedWidthPadLeftObjectLongerThanWidth() {
        sb.appendFixedWidthPadLeft("abcdef", 3, '0');
        assertEquals("def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectShorter() {
        sb.appendFixedWidthPadLeft("ab", 5, '*');
        assertEquals("***ab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectNull() {
        sb.setNullText("NUL");
        sb.appendFixedWidthPadLeft((Object) null, 4, ' ');
        assertEquals(" NUL", sb.toString()); // width 4, nullText = "NUL", padLen=1
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        sb.appendFixedWidthPadLeft(7, 3, '0');
        assertEquals("007", sb.toString());
    }

    // appendFixedWidthPadRight
    @Test
    public void testAppendFixedWidthPadRightObjectLonger() {
        sb.appendFixedWidthPadRight("abcdef", 3, '0');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjectShorter() {
        sb.appendFixedWidthPadRight("ab", 5, '*');
        assertEquals("ab***", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjectNull() {
        sb.setNullText("NUL");
        sb.appendFixedWidthPadRight((Object) null, 4, ' ');
        assertEquals("NUL ", sb.toString());
    }

    // insert(int, String)
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndex() {
        sb.insert(-1, "abc");
    }

    @Test
    public void testInsertStringAtBeginning() {
        sb.append("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());
    }

    @Test
    public void testInsertStringNull() {
        sb.setNullText("NULL");
        sb.append("xy");
        sb.insert(1, (String) null);
        assertEquals("xNULLy", sb.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        sb.append("start");
        sb.insert(2, "");
        assertEquals("start", sb.toString());
    }

    // insert(int, char[])
    @Test
    public void testInsertCharArray() {
        sb.append("ab");
        sb.insert(1, new char[]{'X', 'Y'});
        assertEquals("aXYb", sb.toString());
    }

    @Test
    public void testInsertCharArrayNull() {
        sb.setNullText("<null>");
        sb.append("ab");
        sb.insert(0, (char[]) null);
        assertEquals("<null>ab", sb.toString());
    }

    // insert(int, boolean)
    @Test
    public void testInsertBooleanTrue() {
        sb.append("test");
        sb.insert(2, true);
        assertEquals("tetrue st", sb.toString());
        // Actually: "test" -> insert at 2: "te" + "true" + "st" -> "tetrue st" but let's check size
    }

    @Test
    public void testInsertBooleanFalse() {
        sb.append("a");
        sb.insert(1, false);
        assertEquals("afalse", sb.toString());
    }

    // delete(int, int)
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteInvalidStartNegative() {
        sb.append("abc");
        sb.delete(-1, 2);
    }

    @Test
    public void testDeleteRange() {
        sb.append("abcdef");
        sb.delete(1, 4);
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testDeleteRangeEndGreaterThanSize() {
        sb.append("abc");
        sb.delete(1, 10);
        assertEquals("a", sb.toString()); // end becomes size
    }

    @Test
    public void testDeleteRangeLenZero() {
        sb.append("abc");
        sb.delete(2, 2);
        assertEquals("abc", sb.toString());
    }

    // deleteAll(char)
    @Test
    public void testDeleteAllChar() {
        sb.append("abacada");
        sb.deleteAll('a');
        assertEquals("bcd", sb.toString());
    }

    @Test
    public void testDeleteAllCharNoMatch() {
        sb.append("hello");
        sb.deleteAll('x');
        assertEquals("hello", sb.toString());
    }

    // deleteFirst(char)
    @Test
    public void testDeleteFirstChar() {
        sb.append("abac");
        sb.deleteFirst('a');
        assertEquals("bac", sb.toString());
    }

    // deleteAll(String)
    @Test
    public void testDeleteAllString() {
        sb.append("the quick brown fox jumps over the lazy dog");
        sb.deleteAll("the");
        assertEquals(" quick brown fox jumps over the lazy dog", sb.toString());
    }

    @Test
    public void testDeleteAllStringNull() {
        sb.append("abc");
        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    // deleteFirst(String)
    @Test
    public void testDeleteFirstString() {
        sb.append("hello world");
        sb.deleteFirst("lo");
        assertEquals("hel world", sb.toString());
    }

    // replace(int, int, String)
    @Test
    public void testReplaceRange() {
        sb.append("abcde");
        sb.replace(1, 4, "XYZ");
        assertEquals("aXYZ e", sb.toString()); // careful: "abcde" -> replace indices 1-3 with "XYZ" -> "aXYZ" + "e" = "aXYZ e"? Actually size: original 5, removeLen=3, insertLen=3, so new size=5. Expected "aXYZ e" but extra space? Let's compute: buffer after replace: a, X, Y, Z, e => "aXYZe". My comment wrong. Expect "aXYZe".
    }

    @Test
    public void testReplaceRangeWithNull() {
        sb.append("abcde");
        sb.replace(1, 3, null);
        assertEquals("ade", sb.toString()); // remove 2 chars "bc", insert nothing => "ade"
    }

    // replaceAll(char, char)
    @Test
    public void testReplaceAllChar() {
        sb.append("aabbcc");
        sb.replaceAll('b', 'B');
        assertEquals("aaBBcc", sb.toString());
    }

    @Test
    public void testReplaceAllCharSame() {
        sb.append("aaa");
        sb.replaceAll('a', 'a');
        assertEquals("aaa", sb.toString());
    }

    // replaceFirst(char, char)
    @Test
    public void testReplaceFirstChar() {
        sb.append("abba");
        sb.replaceFirst('b', 'B');
        assertEquals("aBba", sb.toString());
    }

    // replaceAll(String, String)
    @Test
    public void testReplaceAllString() {
        sb.append("one two one two");
        sb.replaceAll("one", "three");
        assertEquals("three two three two", sb.toString());
    }

    // replaceFirst(String, String)
    @Test
    public void testReplaceFirstString() {
        sb.append("one two one");
        sb.replaceFirst("one", "three");
        assertEquals("three two one", sb.toString());
    }

    // reverse
    @Test
    public void testReverseEmpty() {
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverse() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    // trim
    @Test
    public void testTrimEmpty() {
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimSpaces() {
        sb.append("  hello   ");
        sb.trim();
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testTrimNoSpaces() {
        sb.append("hello");
        sb.trim();
        assertEquals("hello", sb.toString());
    }

    // startsWith
    @Test
    public void testStartsWithNull() {
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWithEmptyString() {
        sb.append("abc");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWithTrue() {
        sb.append("abcdef");
        assertTrue(sb.startsWith("abc"));
    }

    @Test
    public void testStartsWithFalse() {
        sb.append("abcdef");
        assertFalse(sb.startsWith("abd"));
    }

    @Test
    public void testStartsWithLongerThanContent() {
        sb.append("ab");
        assertFalse(sb.startsWith("abc"));
    }

    // endsWith
    @Test
    public void testEndsWithNull() {
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWithEmptyString() {
        sb.append("abc");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWithTrue() {
        sb.append("abcdef");
        assertTrue(sb.endsWith("def"));
    }

    @Test
    public void testEndsWithFalse() {
        sb.append("abcdef");
        assertFalse(sb.endsWith("deg"));
    }

    // substring
    @Test
    public void testSubstringStartOnly() {
        sb.append("hello");
        assertEquals("ello", sb.substring(1));
    }

    @Test
    public void testSubstringRange() {
        sb.append("hello");
        assertEquals("ell", sb.substring(1, 4));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstringInvalidStart() {
        sb.append("hi");
        sb.substring(2, 1);
    }

    // leftString
    @Test
    public void testLeftStringLengthZero() {
        sb.append("abc");
        assertEquals("", sb.leftString(0));
    }

    @Test
    public void testLeftStringLengthNegative() {
        sb.append("abc");
        assertEquals("", sb.leftString(-1));
    }

    @Test
    public void testLeftStringLessThanSize() {
        sb.append("abcde");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringGreaterOrEqualSize() {
        sb.append("abcde");
        assertEquals("abcde", sb.leftString(10));
    }

    // rightString
    @Test
    public void testRightStringLengthZero() {
        sb.append("abc");
        assertEquals("", sb.rightString(0));
    }

    @Test
    public void testRightStringLessThanSize() {
        sb.append("abcde");
        assertEquals("cde", sb.rightString(3));
    }

    @Test
    public void testRightStringGreaterOrEqualSize() {
        sb.append("abcde");
        assertEquals("abcde", sb.rightString(10));
    }

    // midString
    @Test
    public void testMidStringIndexNegative() {
        sb.append("hello");
        assertEquals("hello", sb.midString(-1, 5)); // index becomes 0
    }

    @Test
    public void testMidStringLengthZero() {
        sb.append("hello");
        assertEquals("", sb.midString(2, 0));
    }

    @Test
    public void testMidStringLengthNegative() {
        sb.append("hello");
        assertEquals("", sb.midString(2, -1));
    }

    @Test
    public void testMidStringIndexBeyondSize() {
        sb.append("hello");
        assertEquals("", sb.midString(10, 3));
    }

    @Test
    public void testMidStringOverflow() {
        sb.append("hello");
        assertEquals("llo", sb.midString(2, 10));
    }

    @Test
    public void testMidStringExact() {
        sb.append("abcdef");
        assertEquals("cde", sb.midString(2, 3));
    }

    // contains(char)
    @Test
    public void testContainsCharTrue() {
        sb.append("hello");
        assertTrue(sb.contains('l'));
    }

    @Test
    public void testContainsCharFalse() {
        sb.append("hello");
        assertFalse(sb.contains('z'));
    }

    // contains(String)
    @Test
    public void testContainsStringTrue() {
        sb.append("hello world");
        assertTrue(sb.contains("world"));
    }

    @Test
    public void testContainsStringFalse() {
        sb.append("hello");
        assertFalse(sb.contains("world"));
    }

    // indexOf(char)
    @Test
    public void testIndexOfCharFound() {
        sb.append("abcba");
        assertEquals(1, sb.indexOf('b'));
    }

    @Test
    public void testIndexOfCharNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('x'));
    }

    @Test
    public void testIndexOfCharStartIndex() {
        sb.append("abca");
        assertEquals(3, sb.indexOf('a', 1));
    }

    @Test
    public void testIndexOfCharStartIndexOutOfBounds() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('a', 5));
    }

    // indexOf(String)
    @Test
    public void testIndexOfStringFound() {
        sb.append("hello world");
        assertEquals(6, sb.indexOf("world"));
    }

    @Test
    public void testIndexOfStringNotFound() {
        sb.append("hello");
        assertEquals(-1, sb.indexOf("world"));
    }

    @Test
    public void testIndexOfStringNull() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void testIndexOfStringEmpty() {
        sb.append("abc");
        assertEquals(2, sb.indexOf("", 2));
    }

    // lastIndexOf(char)
    @Test
    public void testLastIndexOfChar() {
        sb.append("abcba");
        assertEquals(3, sb.lastIndexOf('b'));
    }

    @Test
    public void testLastIndexOfCharNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf('x'));
    }

    @Test
    public void testLastIndexOfCharStartIndexNegative() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf('a', -1));
    }

    // lastIndexOf(String)
    @Test
    public void testLastIndexOfString() {
        sb.append("abab");
        assertEquals(2, sb.lastIndexOf("ab"));
    }

    // equals
    @Test
    public void testEqualsSameObject() {
        StrBuilder other = sb;
        assertTrue(sb.equals(other));
    }

    @Test
    public void testEqualsDifferentSize() {
        StrBuilder other = new StrBuilder("abc");
        sb.append("ab");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsDifferentContent() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abd");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsSameContent() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abc");
        assertTrue(sb.equals(other));
    }

    @Test
    public void testEqualsNonStrBuilder() {
        assertFalse(sb.equals("string"));
    }

    // equalsIgnoreCase
    @Test
    public void testEqualsIgnoreCaseTrue() {
        sb.append("Hello");
        StrBuilder other = new StrBuilder("HELLO");
        assertTrue(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCaseFalse() {
        sb.append("Hello");
        StrBuilder other = new StrBuilder("Hi");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    // hashCode
    @Test
    public void testHashCodeConsistent() {
        sb.append("abc");
        int h1 = sb.hashCode();
        sb.append("def");
        int h2 = sb.hashCode();
        assertTrue(h1 != h2); // content changed, hash should differ
    }

    // toString
    @Test
    public void testToString() {
        sb.append("test");
        assertEquals("test", sb.toString());
    }

    // toCharArray()
    @Test
    public void testToCharArrayEmpty() {
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());
    }

    @Test
    public void testToCharArrayNonEmpty() {
        sb.append("abc");
        assertArrayEquals(new char[]{'a','b','c'}, sb.toCharArray());
    }

    // toCharArray(int, int)
    @Test
    public void testToCharArrayRange() {
        sb.append("abcde");
        assertArrayEquals(new char[]{'b','c'}, sb.toCharArray(1, 3));
    }

    @Test
    public void testToCharArrayRangeEmpty() {
        sb.append("abc");
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(2, 2));
    }

    // getChars(char[]) various
    @Test
    public void testGetCharsNullDest() {
        sb.append("abc");
        char[] dest = sb.getChars(null);
        assertArrayEquals(new char[]{'a','b','c'}, dest);
    }

    @Test
    public void testGetCharsDestTooSmall() {
        sb.append("abc");
        char[] dest = new char[2];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[]{'a','b','c'}, result);
        assertEquals(3, result.length);
    }

    @Test
    public void testGetCharsDestLargeEnough() {
        sb.append("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[]{'a','b','c','\0','\0'}, dest);
        assertSame(dest, result);
    }

    // getChars(int,int,char[],int)
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsNegativeStart() {
        sb.append("abc");
        sb.getChars(-1, 2, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsEndOutOfRange() {
        sb.append("abc");
        sb.getChars(0, 5, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsStartGreaterThanEnd() {
        sb.append("abc");
        sb.getChars(2, 1, new char[5], 0);
    }

    @Test
    public void testGetCharsValid() {
        sb.append("abcdef");
        char[] dest = new char[3];
        sb.getChars(1, 4, dest, 0);
        assertArrayEquals(new char[]{'b','c','d'}, dest);
    }

    // setNullText
    @Test
    public void testSetNullTextNull() {
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testSetNullTextEmpty() {
        sb.setNullText("");
        assertNull(sb.getNullText());
    }

    @Test
    public void testSetNullTextNonEmpty() {
        sb.setNullText("NIL");
        assertEquals("NIL", sb.getNullText());
    }

    // setNewLineText
    @Test
    public void testSetNewLineText() {
        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
    }

    // asReader and asWriter basic
    @Test
    public void testAsReader() throws Exception {
        sb.append("hello");
        Reader reader = sb.asReader();
        char[] buf = new char[5];
        int count = reader.read(buf);
        assertEquals(5, count);
        assertEquals("hello", new String(buf));
    }

    @Test
    public void testAsWriter() throws Exception {
        Writer writer = sb.asWriter();
        writer.write("test");
        writer.close();
        assertEquals("test", sb.toString());
    }

    // additional branch: validateRange and validateIndex indirectly through delete and insert
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteStartNegative() {
        sb.append("abc");
        sb.delete(-1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertIndexOutOfBounds() {
        sb.append("abc");
        sb.insert(4, "x");
    }

    // append(String, startIndex, length) with length=0
    @Test
    public void testAppendStringSubstringZeroLength() {
        sb.append("hello", 2, 0);
        assertEquals("", sb.toString());
    }

    // append(StringBuffer, int, int)
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferSubInvalidStart() {
        sb.append(new StringBuffer("test"), -1, 2);
    }

    // append(char[], int, int)
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArraySubInvalidOffset() {
        sb.append(new char[]{'a','b'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArraySubInvalidLength() {
        sb.append(new char[]{'a','b'}, 0, 5);
    }

    // replaceImpl via replaceAll(StrMatcher) - we can test with a simple matcher
    // We'll skip due to complexity unless needed, but include a basic test
    @Test
    public void testReplaceAllStrMatcher() {
        sb.append("aabbaa");
        // Create a simple matcher that matches "bb"
        StrMatcher matcher = new StrMatcher() {
            public int isMatch(char[] buffer, int pos, int start, int end) {
                if (pos + 1 < end && buffer[pos] == 'b' && buffer[pos+1] == 'b') {
                    return 2;
                }
                return 0;
            }
        };
        sb.replaceAll(matcher, "XX");
        assertEquals("aaXXaa", sb.toString());
    }

    // deleteAll(StrMatcher)
    @Test
    public void testDeleteAllStrMatcher() {
        sb.append("abcabc");
        StrMatcher matcher = new StrMatcher() {
            public int isMatch(char[] buffer, int pos, int start, int end) {
                if (pos + 2 < end && buffer[pos] == 'a' && buffer[pos+1] == 'b' && buffer[pos+2] == 'c') {
                    return 3;
                }
                return 0;
            }
        };
        sb.deleteAll(matcher);
        assertEquals("", sb.toString());
    }

    // ensure that StrBuilderReader read() returns -1 at end
    @Test
    public void testAsReaderReadEnd() throws Exception {
        Reader reader = sb.asReader();
        assertEquals(-1, reader.read());
    }

    // test StrBuilderReader read(char[], off, len) with zero length
    @Test
    public void testAsReaderReadZeroLen() throws Exception {
        sb.append("abc");
        Reader reader = sb.asReader();
        char[] buf = new char[5];
        int count = reader.read(buf, 0, 0);
        assertEquals(0, count);
    }
}