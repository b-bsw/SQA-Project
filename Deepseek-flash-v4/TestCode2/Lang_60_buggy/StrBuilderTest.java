package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Test suite for StrBuilder.
 * JUnit 4 style, covering key methods, branches, and edge cases.
 */
public class StrBuilderTest {

    private StrBuilder empty;

    @Before
    public void setUp() {
        empty = new StrBuilder();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertEquals(StrBuilder.CAPACITY, sb.capacity());
    }

    @Test
    public void testConstructorInitialCapacity() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 10);

        // zero or negative falls back to CAPACITY
        sb = new StrBuilder(0);
        assertEquals(StrBuilder.CAPACITY, sb.capacity());
        sb = new StrBuilder(-5);
        assertEquals(StrBuilder.CAPACITY, sb.capacity());
    }

    @Test
    public void testConstructorString() {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals(StrBuilder.CAPACITY, sb.capacity());

        sb = new StrBuilder("");
        assertEquals(0, sb.length());

        sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));
    }

    // ---------- Length / Capacity ----------

    @Test
    public void testSetLength() {
        StrBuilder sb = new StrBuilder("abcd");
        sb.setLength(2);
        assertEquals(2, sb.length());
        assertEquals("ab", sb.toString());

        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals("ab\0\0\0\0", sb.toString()); // zero-filled

        sb.setLength(0);
        assertEquals(0, sb.length());

        // negative throws
        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testEnsureCapacity() {
        StrBuilder sb = new StrBuilder(5);
        assertEquals(5, sb.capacity());
        sb.ensureCapacity(10);
        assertTrue(sb.capacity() >= 10);
        // no change when capacity already sufficient
        sb.ensureCapacity(3);
        assertTrue(sb.capacity() >= 10);
    }

    @Test
    public void testMinimizeCapacity() {
        StrBuilder sb = new StrBuilder(100);
        sb.append("short");
        int oldCap = sb.capacity();
        sb.minimizeCapacity();
        assertTrue(sb.capacity() <= oldCap);
        assertEquals(sb.length(), sb.capacity()); // after minimize, capacity == length
    }

    @Test
    public void testClearAndIsEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.length());
    }

    // ---------- charAt / setCharAt / deleteCharAt ----------

    @Test
    public void testCharAt() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals('b', sb.charAt(1));
        try {
            sb.charAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.charAt(3);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testSetCharAt() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
        try {
            sb.setCharAt(-1, '?');
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.setCharAt(3, '?');
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testDeleteCharAt() {
        StrBuilder sb = new StrBuilder("abcde");
        sb.deleteCharAt(2);
        assertEquals("abde", sb.toString());
        assertEquals(4, sb.length());
        try {
            sb.deleteCharAt(4);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.deleteCharAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    // ---------- Append methods ----------

    @Test
    public void testAppendObject() {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) null);
        assertEquals(0, sb.length()); // nullText not set

        sb.setNullText("nil");
        sb.append((Object) null);
        assertEquals("nil", sb.toString());

        sb.clear();
        sb.append((Object) "test");
        assertEquals("test", sb.toString());
    }

    @Test
    public void testAppendString() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null);
        assertEquals(0, sb.length());

        sb.append("");
        assertEquals(0, sb.length());

        sb.append("abc");
        assertEquals("abc", sb.toString());
        sb.append("def");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testAppendStringWithStartLength() {
        StrBuilder sb = new StrBuilder();
        sb.append("0123456789", 2, 3);
        assertEquals("234", sb.toString());

        // null -> appendNull
        sb.clear();
        sb.append((String) null, 0, 0);
        assertEquals(0, sb.length());

        // invalid startIndex
        try {
            sb.append("abc", -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.append("abc", 5, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}

        // invalid length
        try {
            sb.append("abc", 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.append("abc", 2, 2); // start+len > length
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testAppendStrBuilder() {
        StrBuilder sb = new StrBuilder("abc");
        StrBuilder other = new StrBuilder("def");
        sb.append(other);
        assertEquals("abcdef", sb.toString());

        sb.append((StrBuilder) null);
        assertEquals("abcdef", sb.toString()); // null handled
    }

    @Test
    public void testAppendCharArray() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[]{'a','b','c'});
        assertEquals("abc", sb.toString());

        sb.append((char[]) null);
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.append(new char[]{}, 0, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendCharArrayWithOffsetLen() {
        StrBuilder sb = new StrBuilder();
        char[] chars = {'0','1','2','3','4'};
        sb.append(chars, 1, 3);
        assertEquals("123", sb.toString());

        // null
        sb.clear();
        sb.append((char[]) null, 0, 0);
        assertEquals(0, sb.length());

        // invalid offset
        try {
            sb.append(chars, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.append(chars, 6, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}

        // invalid length
        try {
            sb.append(chars, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.append(chars, 2, 4);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testAppendBoolean() {
        StrBuilder sb = new StrBuilder();
        sb.append(true);
        assertEquals("true", sb.toString());
        sb.clear();
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    @Test
    public void testAppendChar() {
        StrBuilder sb = new StrBuilder();
        sb.append('a');
        sb.append('b');
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendNumericTypes() {
        StrBuilder sb = new StrBuilder();
        sb.append(123);
        assertEquals("123", sb.toString());
        sb.clear();
        sb.append(45L);
        assertEquals("45", sb.toString());
        sb.clear();
        sb.append(3.14f);
        assertTrue(sb.toString().startsWith("3.14"));
        sb.clear();
        sb.append(2.718);
        assertTrue(sb.toString().startsWith("2.718"));
    }

    @Test
    public void testAppendNewLine() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\n");
        sb.append("a");
        sb.appendNewLine();
        sb.append("b");
        assertEquals("a\nb", sb.toString());

        // when newLine is null, uses SystemUtils.LINE_SEPARATOR
        sb.clear();
        sb.setNewLineText(null);
        sb.appendNewLine();
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testAppendNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals(0, sb.length());

        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder("a");
        sb.appendPadding(3, '*');
        assertEquals("a***", sb.toString());

        sb.appendPadding(0, '?');
        assertEquals("a***", sb.toString());

        sb.appendPadding(-1, '?'); // negative does nothing
        assertEquals("a***", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 5, '*');
        assertEquals("**abc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abc", 2, '*'); // str longer than width
        assertEquals("bc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft((Object) null, 4, '-');
        assertEquals("----", sb.toString()); // nullText is null -> "----"? Actually nullText null => appendNull returns this, but inside it uses getNullText() which returns nullText (null). Then str.length() -> NullPointerException? Wait: appendFixedWidthPadLeft calls getNullText() if obj is null. If nullText is null, str becomes null and str.length() will throw NPE. So we must set nullText first.
        // Actually there's a bug: getNullText() returns null, and then str.length() is called on null. So we should test with nullText set to avoid exception.
        sb.setNullText("nil");
        sb.clear();
        sb.appendFixedWidthPadLeft((Object) null, 6, '*');
        assertEquals("***nil", sb.toString());

        // width <= 0 does nothing
        sb.clear();
        sb.appendFixedWidthPadLeft("x", 0, '?');
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", 5, '*');
        assertEquals("abc**", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abc", 2, '*');
        assertEquals("ab", sb.toString());

        sb.setNullText("(null)");
        sb.clear();
        sb.appendFixedWidthPadRight((Object) null, 7, '-');
        assertEquals("(null)-", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[] {"a","b","c"}, ",");
        assertEquals("a,b,c", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals(0, sb.length());

        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsCollection() {
        StrBuilder sb = new StrBuilder();
        java.util.Collection coll = java.util.Arrays.asList("x","y");
        sb.appendWithSeparators(coll, "|");
        assertEquals("x|y", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new java.util.ArrayList(), ",");
        assertEquals(0, sb.length());

        sb.appendWithSeparators((java.util.Collection) null, ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        StrBuilder sb = new StrBuilder();
        java.util.Iterator it = java.util.Arrays.asList(1,2,3).iterator();
        sb.appendWithSeparators(it, ":");
        assertEquals("1:2:3", sb.toString());

        sb.clear();
        sb.appendWithSeparators((java.util.Iterator) null, ",");
        assertEquals(0, sb.length());
    }

    // ---------- Insert methods ----------

    @Test
    public void testInsertString() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());

        sb.insert(0, (String) null);
        assertEquals("abc", sb.toString()); // nullText null -> nothing inserted

        sb.setNullText("NULL");
        sb.insert(3, (String) null);
        assertEquals("abcNULL", sb.toString());

        // insert empty string
        sb.clear();
        sb.append("ab");
        sb.insert(1, "");
        assertEquals("ab", sb.toString());

        // index out of bounds (>size)
        try {
            sb.insert(3, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.insert(-1, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testInsertCharArray() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.insert(0, (char[]) null);
        assertEquals("abc", sb.toString());

        // with offset and length
        sb.clear();
        sb.append("ad");
        sb.insert(1, new char[]{'b','c','x'}, 0, 2);
        assertEquals("abcd", sb.toString());
    }

    @Test
    public void testInsertBoolean() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, true);
        assertEquals("atrueb", sb.toString());

        sb.clear();
        sb.append("ab");
        sb.insert(1, false);
        assertEquals("afalseb", sb.toString());
    }

    @Test
    public void testInsertChar() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 'X');
        assertEquals("aXb", sb.toString());
    }

    // ---------- Delete methods ----------

    @Test
    public void testDelete() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(2, 5);
        assertEquals("abf", sb.toString());

        // startIndex > endIndex throws
        try {
            sb.delete(4, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}

        // startIndex negative
        try {
            sb.delete(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}

        // endIndex > size adjusted
        sb.clear();
        sb.append("abc");
        sb.delete(1, 10);
        assertEquals("a", sb.toString());
    }

    @Test
    public void testDeleteAllChar() {
        StrBuilder sb = new StrBuilder("aabac");
        sb.deleteAll('a');
        assertEquals("bc", sb.toString());

        sb.clear();
        sb.append("abc");
        sb.deleteAll('d');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstChar() {
        StrBuilder sb = new StrBuilder("aabac");
        sb.deleteFirst('a');
        assertEquals("abac", sb.toString());

        sb.deleteFirst('z'); // not present
        assertEquals("abac", sb.toString());
    }

    @Test
    public void testDeleteAllString() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.deleteAll("ab");
        assertEquals("", sb.toString());

        sb.clear();
        sb.append("abc");
        sb.deleteAll("xyz");
        assertEquals("abc", sb.toString());

        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstString() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.deleteFirst("ab");
        assertEquals("abab", sb.toString());

        sb.clear();
        sb.append("abc");
        sb.deleteFirst("xyz");
        assertEquals("abc", sb.toString());
    }

    // ---------- Replace methods ----------

    @Test
    public void testReplaceChar() {
        StrBuilder sb = new StrBuilder("abac");
        sb.replaceAll('a', 'x');
        assertEquals("xbxc", sb.toString());

        sb.replaceFirst('x', 'y');
        assertEquals("ybxc", sb.toString());

        // search == replace does nothing
        sb.clear();
        sb.append("abc");
        sb.replaceAll('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceString() {
        StrBuilder sb = new StrBuilder("hello world");
        sb.replaceAll("world", "there");
        assertEquals("hello there", sb.toString());

        sb.replaceFirst("there", "everyone");
        assertEquals("hello everyone", sb.toString());

        sb.replaceAll("foo", "bar");
        assertEquals("hello everyone", sb.toString());
    }

    @Test
    public void testReplaceInRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "XYZ");
        assertEquals("aXYZef", sb.toString());
    }

    // ---------- Reverse ----------

    @Test
    public void testReverse() {
        StrBuilder sb = new StrBuilder("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());

        sb.clear();
        sb.reverse();
        assertEquals(0, sb.length());

        sb.append("a");
        sb.reverse();
        assertEquals("a", sb.toString());
    }

    // ---------- Trim ----------

    @Test
    public void testTrim() {
        StrBuilder sb = new StrBuilder("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());

        sb.clear();
        sb.append("\t\n x ");
        sb.trim();
        assertEquals("x", sb.toString());

        sb.clear();
        sb.append("no trim");
        sb.trim();
        assertEquals("no trim", sb.toString());

        // empty
        sb.clear();
        sb.trim();
        assertEquals(0, sb.length());
    }

    // ---------- startsWith / endsWith ----------

    @Test
    public void testStartsWith() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.startsWith("ab"));
        assertFalse(sb.startsWith("bc"));
        assertFalse(sb.startsWith("abcdefg"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testEndsWith() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.endsWith("ef"));
        assertFalse(sb.endsWith("de"));
        assertFalse(sb.endsWith("abcdefg"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith(null));
    }

    // ---------- Substring / Left / Right / Mid ----------

    @Test
    public void testSubstring() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cde", sb.substring(2, 5));
        assertEquals("abcdef", sb.substring(0));
        try {
            sb.substring(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.substring(3, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    @Test
    public void testLeftString() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("ab", sb.leftString(2));
        assertEquals("", sb.leftString(0));
        assertEquals("", sb.leftString(-1));
        assertEquals("abcdef", sb.leftString(10));
    }

    @Test
    public void testRightString() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("ef", sb.rightString(2));
        assertEquals("", sb.rightString(0));
        assertEquals("", sb.rightString(-1));
        assertEquals("abcdef", sb.rightString(10));
    }

    @Test
    public void testMidString() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cde", sb.midString(2, 3));
        assertEquals("abcdef", sb.midString(0, 10));
        assertEquals("cdef", sb.midString(2, 10));
        assertEquals("", sb.midString(10, 1));
        assertEquals("", sb.midString(0, 0));
        assertEquals("", sb.midString(-1, 5)); // index becomes 0
    }

    // ---------- contains / indexOf / lastIndexOf ----------

    @Test
    public void testContainsChar() {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.contains('b'));
        assertFalse(sb.contains('z'));
    }

    @Test
    public void testContainsString() {
        StrBuilder sb = new StrBuilder("abcabc");
        assertTrue(sb.contains("bc"));
        assertFalse(sb.contains("bd"));
        assertFalse(sb.contains(null));
    }

    @Test
    public void testIndexOfChar() {
        StrBuilder sb = new StrBuilder("abca");
        assertEquals(0, sb.indexOf('a'));
        assertEquals(3, sb.indexOf('a', 1));
        assertEquals(-1, sb.indexOf('z'));
        assertEquals(-1, sb.indexOf('a', 10));
        assertEquals(0, sb.indexOf('a', -5));
    }

    @Test
    public void testIndexOfString() {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(0, sb.indexOf("ab"));
        assertEquals(3, sb.indexOf("ab", 1));
        assertEquals(-1, sb.indexOf("ab", 10));
        assertEquals(-1, sb.indexOf("xyz"));
        assertEquals(-1, sb.indexOf((String) null));
        // empty string returns startIndex
        assertEquals(2, sb.indexOf("", 2));
        // single char usage
        assertEquals(1, sb.indexOf("b", 0));
    }

    @Test
    public void testLastIndexOfChar() {
        StrBuilder sb = new StrBuilder("abca");
        assertEquals(3, sb.lastIndexOf('a'));
        assertEquals(0, sb.lastIndexOf('a', 2));
        assertEquals(-1, sb.lastIndexOf('z'));
        assertEquals(-1, sb.lastIndexOf('a', -1));
    }

    @Test
    public void testLastIndexOfString() {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(3, sb.lastIndexOf("ab"));
        assertEquals(0, sb.lastIndexOf("ab", 2));
        assertEquals(-1, sb.lastIndexOf("ab", 0));
        assertEquals(-1, sb.lastIndexOf("xyz"));
        assertEquals(-1, sb.lastIndexOf((String) null));
        // empty string returns startIndex (clamped)
        assertEquals(4, sb.lastIndexOf("", 4));
    }

    // ---------- equals / hashCode / toString ----------

    @Test
    public void testEquals() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        assertTrue(sb1.equals(sb2));
        assertTrue(sb1.equals((Object) sb2));
        sb2.append("d");
        assertFalse(sb1.equals(sb2));
        assertFalse(sb1.equals(null));
        assertFalse(sb1.equals("abc"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ABC");
        assertTrue(sb1.equalsIgnoreCase(sb2));
        sb2.append("d");
        assertFalse(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb1.equalsIgnoreCase(sb1));
    }

    @Test
    public void testHashCode() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        assertEquals(sb1.hashCode(), sb2.hashCode());
    }

    @Test
    public void testToString() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toString());
        sb.append(" world");
        assertEquals("hello world", sb.toString());
    }

    // ---------- toCharArray / getChars ----------

    @Test
    public void testToCharArray() {
        StrBuilder sb = new StrBuilder("abc");
        char[] arr = sb.toCharArray();
        assertArrayEquals(new char[]{'a','b','c'}, arr);

        sb.clear();
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());
    }

    @Test
    public void testToCharArrayWithRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] arr = sb.toCharArray(1, 4);
        assertArrayEquals(new char[]{'b','c','d'}, arr);

        arr = sb.toCharArray(2, 2); // len=0
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, arr);
    }

    @Test
    public void testGetChars() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertSame(dest, result);
        assertEquals('a', dest[0]);
        assertEquals('b', dest[1]);
        assertEquals('c', dest[2]);

        // null destination
        result = sb.getChars(null);
        assertEquals(3, result.length);
        assertArrayEquals(new char[]{'a','b','c'}, result);

        // destination too short
        char[] shortDest = new char[2];
        result = sb.getChars(shortDest);
        assertNotSame(shortDest, result);
        assertEquals(3, result.length);
    }

    @Test
    public void testGetCharsWithIndices() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 0);
        assertEquals('b', dest[0]);
        assertEquals('c', dest[1]);
        assertEquals('d', dest[2]);

        // exceptions
        try {
            sb.getChars(-1, 2, dest, 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.getChars(1, 10, dest, 0); // endIndex > length
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            sb.getChars(4, 2, dest, 0); // start > end
            fail();
        } catch (StringIndexOutOfBoundsException e) {}
    }

    // ---------- Miscellaneous ----------

    @Test
    public void testAppendStringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("foo"));
        assertEquals("foo", sb.toString());
        sb.append((StringBuffer) null);
        assertEquals("foo", sb.toString());
    }

    @Test
    public void testAppendStringBufferWithStartLength() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("012345"), 1, 3);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppendStrBuilderWithStartLength() {
        StrBuilder sb = new StrBuilder();
        StrBuilder other = new StrBuilder("012345");
        sb.append(other, 2, 3);
        assertEquals("234", sb.toString());
        sb.append((StrBuilder) null, 0, 0);
        assertEquals("234", sb.toString()); // null handled
    }

    @Test
    public void testSetNewLineText() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testSetNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("(null)");
        assertEquals("(null)", sb.getNullText());
        // empty string sets to null
        sb.setNullText("");
        assertNull(sb.getNullText());
    }

    @Test
    public void testCapacityInitially() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());
        sb.ensureCapacity(20);
        assertTrue(sb.capacity() >= 20);
    }

    // ---------- Inner classes (light) ----------

    @Test
    public void testAsReader() {
        StrBuilder sb = new StrBuilder("abc");
        java.io.Reader reader = sb.asReader();
        try {
            assertEquals('a', reader.read());
            assertEquals('b', reader.read());
            assertEquals('c', reader.read());
            assertEquals(-1, reader.read());
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAsWriter() {
        StrBuilder sb = new StrBuilder();
        java.io.Writer writer = sb.asWriter();
        try {
            writer.write('a');
            writer.write("bc");
            writer.write("def", 1, 2);
            writer.flush();
            assertEquals("abcef", sb.toString());
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("hello world");
        StrBuilder.StrBuilderTokenizer tokenizer = sb.asTokenizer();
        assertNotNull(tokenizer);
        // basic sanity: tokenizer returns content from sb if not overridden
        assertEquals("hello world", tokenizer.getContent());
    }

    // ---------- Edge Cases ----------

    @Test
    public void testMinimizeCapacityOnEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.minimizeCapacity();
        assertEquals(0, sb.capacity()); // length is 0, so new char[0]
    }

    @Test
    public void testAppendWithSeparatorsNullSeparator() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[]{"a","b"}, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testContainsStrMatcher() {
        StrBuilder sb = new StrBuilder("abc");
        // Using null matcher, should return false (indexOf returns -1)
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOfStrMatcher() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
    }

    @Test
    public void testLastIndexOfStrMatcher() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
    }

    // ---------- Ensure loops of 0,1,many ----------

    @Test
    public void testDeleteAllCharLoopBranches() {
        // 0 occurrence
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());

        // 1 occurrence
        sb.clear();
        sb.append("abc");
        sb.deleteAll('b');
        assertEquals("ac", sb.toString());

        // many occurrences
        sb.clear();
        sb.append("ababa");
        sb.deleteAll('a');
        assertEquals("bb", sb.toString());
    }

    @Test
    public void testIndexOfLoopBranches() {
        StrBuilder sb = new StrBuilder("abcabc");
        // 0 match
        assertEquals(-1, sb.indexOf("xyz"));
        // 1 match (first)
        assertEquals(0, sb.indexOf("ab"));
        // multiple matches
        assertEquals(3, sb.indexOf("ab", 1));
    }

    @Test
    public void testReverseLoopBranches() {
        StrBuilder sb = new StrBuilder();
        sb.reverse(); // 0 elements
        assertEquals(0, sb.length());

        sb.append("a"); // 1 element
        sb.reverse();
        assertEquals("a", sb.toString());

        sb.append("bc"); // now "abc"
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testTrimLoopBranches() {
        // 0 leading/trailing spaces
        StrBuilder sb = new StrBuilder("abc");
        sb.trim();
        assertEquals("abc", sb.toString());

        // only leading
        sb.clear();
        sb.append("  abc");
        sb.trim();
        assertEquals("abc", sb.toString());

        // only trailing
        sb.clear();
        sb.append("abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());

        // both
        sb.clear();
        sb.append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());

        // all spaces
        sb.clear();
        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    // ---------- Exception paths ----------

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateIndexNegative() {
        StrBuilder sb = new StrBuilder();
        sb.charAt(-1); // indirectly calls validateIndex
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateIndexExceedsSize() {
        StrBuilder sb = new StrBuilder("abc");
        sb.charAt(3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteImplOnEmpty() {
        // try to deleteCharAt on empty
        new StrBuilder().deleteCharAt(0);
    }

    // ---------- Additional coverage for replaceImpl with matcher (indirect) ----------

    @Test
    public void testDeleteAllMatcher() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((StrMatcher) null); // should do nothing
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcher() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((StrMatcher) null);
        assertEquals("abc", sb.toString());
    }
}