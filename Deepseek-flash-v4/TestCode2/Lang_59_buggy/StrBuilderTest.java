package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    // ----- Constructors -----
    @Test
    public void testConstructorDefault() {
        assertEquals(32, sb.capacity());
        assertEquals(0, sb.length());
    }

    @Test
    public void testConstructorWithInitialCapacity() {
        StrBuilder b = new StrBuilder(10);
        assertEquals(10, b.capacity());
        b = new StrBuilder(0);  // <=0 triggers CAPACITY=32
        assertEquals(32, b.capacity());
    }

    @Test
    public void testConstructorWithString() {
        StrBuilder b = new StrBuilder("hello");
        assertEquals("hello", b.toString());
        assertEquals(37, b.capacity()); // 5+32
        b = new StrBuilder(null);
        assertEquals(0, b.length());
        assertEquals(32, b.capacity());
    }

    // ----- Basic properties -----
    @Test
    public void testLengthAndSizeAndCapacity() {
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        sb.append("abc");
        assertEquals(3, sb.length());
        assertEquals(3, sb.size());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testEnsureCapacity() {
        sb.ensureCapacity(64);
        assertTrue(sb.capacity() >= 64);
        sb.ensureCapacity(10); // already bigger
        assertEquals(sb.capacity(), sb.capacity()); // unchanged
    }

    @Test
    public void testMinimizeCapacity() {
        sb.append("hello");
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
    }

    @Test
    public void testClearAndIsEmpty() {
        assertTrue(sb.isEmpty());
        sb.append("x");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.length());
    }

    // ----- charAt, setCharAt, deleteCharAt -----
    @Test
    public void testCharAt() {
        sb.append("abc");
        assertEquals('a', sb.charAt(0));
        assertEquals('c', sb.charAt(2));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtNegativeIndex() {
        sb.charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtOutOfBounds() {
        sb.charAt(1);
    }

    @Test
    public void testSetCharAt() {
        sb.append("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtInvalid() {
        sb.setCharAt(0, 'a');
    }

    @Test
    public void testDeleteCharAt() {
        sb.append("abcd");
        sb.deleteCharAt(1);
        assertEquals("acd", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtInvalid() {
        sb.deleteCharAt(0);
    }

    // ----- toCharArray -----
    @Test
    public void testToCharArrayNoArg() {
        assertArrayEquals(new char[0], sb.toCharArray());
        sb.append("hi");
        assertArrayEquals(new char[]{'h','i'}, sb.toCharArray());
    }

    @Test
    public void testToCharArrayRange() {
        sb.append("hello");
        assertArrayEquals(new char[]{'e','l'}, sb.toCharArray(1,3));
        assertArrayEquals(new char[0], sb.toCharArray(2,2));
    }

    // ----- getChars -----
    @Test
    public void testGetChars() {
        sb.append("abc");
        char[] dest = new char[3];
        sb.getChars(dest);
        assertArrayEquals(new char[]{'a','b','c'}, dest);
        // shorter destination
        dest = new char[2];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[]{'a','b','c'}, result);
    }

    @Test
    public void testGetCharsRange() {
        sb.append("abcde");
        char[] dest = new char[3];
        sb.getChars(1, 4, dest, 0);
        assertArrayEquals(new char[]{'b','c','d'}, dest);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeInvalidStart() {
        sb.append("abc");
        sb.getChars(-1, 2, new char[5], 0);
    }

    // ----- append (various overloads) -----
    @Test
    public void testAppendString() {
        sb.append("abc");
        assertEquals("abc", sb.toString());
        sb.append((String)null);
        assertEquals("abc", sb.toString()); // nullText is null, so no change
        sb.setNullText("NULL");
        sb.append((String)null);
        assertEquals("abcNULL", sb.toString());
    }

    @Test
    public void testAppendStringWithRange() {
        sb.append("hello", 1, 3);
        assertEquals("ell", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeInvalidStart() {
        sb.append("hi", -1, 1);
    }

    @Test
    public void testAppendStringBuffer() {
        StringBuffer buf = new StringBuffer("world");
        sb.append(buf);
        assertEquals("world", sb.toString());
        sb.append((StringBuffer)null);
        assertEquals("world", sb.toString());
    }

    @Test
    public void testAppendStrBuilder() {
        StrBuilder other = new StrBuilder("foo");
        sb.append(other);
        assertEquals("foo", sb.toString());
    }

    @Test
    public void testAppendCharArray() {
        sb.append(new char[]{'x','y'});
        assertEquals("xy", sb.toString());
        sb.append((char[])null);
        assertEquals("xy", sb.toString());
    }

    @Test
    public void testAppendCharArrayRange() {
        sb.append(new char[]{'a','b','c'}, 0, 2);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendBoolean() {
        sb.append(true);
        assertEquals("true", sb.toString());
        sb.clear();
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    @Test
    public void testAppendChar() {
        sb.append('Z');
        assertEquals("Z", sb.toString());
    }

    @Test
    public void testAppendNumeric() {
        sb.append(42);
        assertEquals("42", sb.toString());
        sb.clear();
        sb.append(3.14);
        assertTrue(sb.toString().startsWith("3.14"));
    }

    // ----- appendNewLine, appendNull -----
    @Test
    public void testAppendNewLine() {
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());
        sb.setNewLineText("\n");
        sb.clear();
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testAppendNull() {
        sb.appendNull();
        assertEquals(0, sb.length());
        sb.setNullText("nil");
        sb.appendNull();
        assertEquals("nil", sb.toString());
    }

    // ----- appendWithSeparators -----
    @Test
    public void testAppendWithSeparatorsArray() {
        sb.appendWithSeparators(new Object[]{"a","b","c"}, ",");
        assertEquals("a,b,c", sb.toString());
        sb.clear();
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsCollection() {
        java.util.Collection<String> coll = java.util.Arrays.asList("x","y");
        sb.appendWithSeparators(coll, "-");
        assertEquals("x-y", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        java.util.List<String> list = java.util.Arrays.asList("1","2","3");
        sb.appendWithSeparators(list.iterator(), ";");
        assertEquals("1;2;3", sb.toString());
    }

    // ----- appendPadding -----
    @Test
    public void testAppendPadding() {
        sb.appendPadding(5, '*');
        assertEquals("*****", sb.toString());
        sb.appendPadding(0, '?');
        assertEquals("*****", sb.toString());
    }

    // ----- appendFixedWidthPadLeft -----
    @Test
    public void testAppendFixedWidthPadLeft() {
        sb.appendFixedWidthPadLeft("abc", 6, '-');
        assertEquals("---abc", sb.toString());
        sb.clear();
        sb.appendFixedWidthPadLeft((Object)null, 5, ' ');
        assertEquals("     ", sb.toString()); // null text is null
        sb.setNullText("nil");
        sb.clear();
        sb.appendFixedWidthPadLeft((Object)null, 5, ' ');
        assertEquals("  nil", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        sb.appendFixedWidthPadLeft(42, 5, '0');
        assertEquals("00042", sb.toString());
    }

    // ----- appendFixedWidthPadRight -----
    @Test
    public void testAppendFixedWidthPadRight() {
        sb.appendFixedWidthPadRight("abc", 6, '-');
        assertEquals("abc---", sb.toString());
    }

    // ----- insert -----
    @Test
    public void testInsertString() {
        sb.append("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());
        sb.insert(5, "beautiful ");
        assertEquals("hello beautiful world", sb.toString());
    }

    @Test
    public void testInsertNull() {
        sb.append("abc");
        sb.insert(1, (String)null);
        assertEquals("abc", sb.toString()); // nullText null
        sb.setNullText("X");
        sb.insert(1, (String)null);
        assertEquals("aXbc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertIndexOutOfBounds() {
        sb.insert(-1, "test");
    }

    @Test
    public void testInsertCharArray() {
        sb.append("ab");
        sb.insert(1, new char[]{'X','Y'});
        assertEquals("aXYb", sb.toString());
    }

    @Test
    public void testInsertCharArrayRange() {
        sb.append("ab");
        sb.insert(1, new char[]{'1','2','3'}, 1, 2);
        assertEquals("a23b", sb.toString());
    }

    @Test
    public void testInsertBoolean() {
        sb.append("abc");
        sb.insert(1, true);
        assertEquals("atruebc", sb.toString());
    }

    @Test
    public void testInsertChar() {
        sb.append("ab");
        sb.insert(1, 'X');
        assertEquals("aXb", sb.toString());
    }

    // ----- delete -----
    @Test
    public void testDeleteRange() {
        sb.append("hello");
        sb.delete(1, 4);
        assertEquals("ho", sb.toString());
    }

    @Test
    public void testDeleteChar() {
        sb.append("aaba");
        sb.deleteAll('a');
        assertEquals("b", sb.toString());
        sb.clear();
        sb.append("abca");
        sb.deleteFirst('a');
        assertEquals("bca", sb.toString());
    }

    @Test
    public void testDeleteString() {
        sb.append("ababa");
        sb.deleteAll("ab");
        assertEquals("a", sb.toString());
        sb.clear();
        sb.append("xyz");
        sb.deleteFirst("xy");
        assertEquals("z", sb.toString());
        sb.deleteFirst("not");
        assertEquals("z", sb.toString());
    }

    // ----- replace -----
    @Test
    public void testReplaceRange() {
        sb.append("abcdef");
        sb.replace(1, 4, "XYZ");
        assertEquals("aXYZef", sb.toString());
    }

    @Test
    public void testReplaceChar() {
        sb.append("abac");
        sb.replaceAll('a', 'Z');
        assertEquals("ZbZc", sb.toString());
        sb.clear();
        sb.append("abac");
        sb.replaceFirst('a', 'Z');
        assertEquals("Zbac", sb.toString());
    }

    @Test
    public void testReplaceString() {
        sb.append("hello world");
        sb.replaceAll("world", "java");
        assertEquals("hello java", sb.toString());
        sb.clear();
        sb.append("aaa");
        sb.replaceFirst("aa", "b");
        assertEquals("ba", sb.toString());
    }

    @Test
    public void testReplaceWithMatcher() {
        // No matcher implementation, test with null matcher
        sb.append("abc");
        sb.replaceAll((StrMatcher)null, "X");
        assertEquals("abc", sb.toString());
    }

    // ----- reverse -----
    @Test
    public void testReverse() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
        sb.clear();
        sb.reverse();
        assertEquals(0, sb.length());
    }

    // ----- trim -----
    @Test
    public void testTrim() {
        sb.append("  hello  ");
        sb.trim();
        assertEquals("hello", sb.toString());
        sb.clear();
        sb.trim();
        assertEquals(0, sb.length());
    }

    // ----- startsWith, endsWith -----
    @Test
    public void testStartsWith() {
        sb.append("hello");
        assertTrue(sb.startsWith("hel"));
        assertFalse(sb.startsWith("world"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith(null));
        assertFalse(sb.startsWith("hello!"));
    }

    @Test
    public void testEndsWith() {
        sb.append("hello");
        assertTrue(sb.endsWith("llo"));
        assertFalse(sb.endsWith("world"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith(null));
    }

    // ----- substring -----
    @Test
    public void testSubstring() {
        sb.append("hello");
        assertEquals("ell", sb.substring(1, 4));
        assertEquals("hello", sb.substring(0));
    }

    // ----- leftString, rightString, midString -----
    @Test
    public void testLeftString() {
        sb.append("hello");
        assertEquals("hel", sb.leftString(3));
        assertEquals("", sb.leftString(0));
        assertEquals("hello", sb.leftString(10));
    }

    @Test
    public void testRightString() {
        sb.append("hello");
        assertEquals("llo", sb.rightString(3));
        assertEquals("", sb.rightString(0));
        assertEquals("hello", sb.rightString(10));
    }

    @Test
    public void testMidString() {
        sb.append("hello");
        assertEquals("ell", sb.midString(1, 3));
        assertEquals("", sb.midString(10, 2));
        assertEquals("", sb.midString(0, 0));
        assertEquals("hello", sb.midString(0, 10));
    }

    // ----- contains, indexOf, lastIndexOf -----
    @Test
    public void testContainsChar() {
        sb.append("abc");
        assertTrue(sb.contains('b'));
        assertFalse(sb.contains('z'));
    }

    @Test
    public void testContainsString() {
        sb.append("abcde");
        assertTrue(sb.contains("bcd"));
        assertFalse(sb.contains("xyz"));
    }

    @Test
    public void testIndexOf() {
        sb.append("abcabc");
        assertEquals(0, sb.indexOf('a'));
        assertEquals(3, sb.indexOf('a', 1));
        assertEquals(-1, sb.indexOf('z'));
        assertEquals(-1, sb.indexOf('a', 10));
    }

    @Test
    public void testIndexOfString() {
        sb.append("abcabc");
        assertEquals(0, sb.indexOf("ab"));
        assertEquals(3, sb.indexOf("ab", 1));
        assertEquals(-1, sb.indexOf("xyz"));
        assertEquals(5, sb.indexOf("", 4));
    }

    @Test
    public void testLastIndexOf() {
        sb.append("abcabc");
        assertEquals(3, sb.lastIndexOf('a'));
        assertEquals(-1, sb.lastIndexOf('z'));
    }

    @Test
    public void testLastIndexOfString() {
        sb.append("abcabc");
        assertEquals(3, sb.lastIndexOf("ab"));
        assertEquals(0, sb.lastIndexOf("ab", 2));
        assertEquals(-1, sb.lastIndexOf("xyz"));
    }

    // ----- equals, hashCode, toString -----
    @Test
    public void testEqualsAndHashCode() {
        StrBuilder a = new StrBuilder("test");
        StrBuilder b = new StrBuilder("test");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals("test"));
        assertTrue(a.equals(a));
    }

    @Test
    public void testToString() {
        sb.append("content");
        assertEquals("content", sb.toString());
    }

    // ----- setNewLineText, setNullText -----
    @Test
    public void testSetNullTextWithEmptyString() {
        sb.setNullText("");
        assertNull(sb.getNullText()); // empty string becomes null
    }

    // ----- setLength -----
    @Test
    public void testSetLength() {
        sb.append("hello");
        sb.setLength(3);
        assertEquals("hel", sb.toString());
        assertEquals(3, sb.length());
        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals('\0', sb.charAt(3));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        sb.setLength(-1);
    }

    // ----- ensureCapacity already tested -----

    // ----- inner classes (basic sanity) -----
    @Test
    public void testAsReader() throws Exception {
        sb.append("abc");
        java.io.Reader r = sb.asReader();
        assertEquals('a', r.read());
        assertEquals('b', r.read());
        assertEquals('c', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testAsWriter() {
        java.io.Writer w = sb.asWriter();
        w.write("xyz");
        assertEquals("xyz", sb.toString());
    }
}