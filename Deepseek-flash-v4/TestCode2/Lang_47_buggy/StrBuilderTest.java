package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import org.junit.Before;
import org.junit.Test;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    @Test
    public void testConstructors() {
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());

        StrBuilder sb2 = new StrBuilder(10);
        assertTrue(sb2.capacity() >= 10);

        StrBuilder sb3 = new StrBuilder(-1);
        assertTrue(sb3.capacity() > 0);

        StrBuilder sb4 = new StrBuilder("hello");
        assertEquals("hello", sb4.toString());

        StrBuilder sb5 = new StrBuilder((String) null);
        assertEquals(0, sb5.length());
    }

    @Test
    public void testSetTexts() {
        assertSame(sb, sb.setNewLineText("\n"));
        assertEquals("\n", sb.getNewLineText());

        assertSame(sb, sb.setNullText("NULL"));
        assertEquals("NULL", sb.getNullText());

        sb.setNullText("");
        assertNull(sb.getNullText());

        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testLengthCapacityEnsureClear() {
        sb.append("hello");
        assertEquals(5, sb.length());
        assertEquals(5, sb.size());
        assertFalse(sb.isEmpty());

        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.length());

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.append("test");
        sb.minimizeCapacity();
        assertEquals(4, sb.capacity());

        sb.setLength(2);
        assertEquals(2, sb.length());
        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals('\0', sb.charAt(5));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        sb.setLength(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtOutOfBounds() {
        sb.charAt(0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtOutOfBounds() {
        sb.deleteCharAt(0);
    }

    @Test
    public void testAppendVariants() {
        sb.append("Hello");
        sb.append(' ');
        sb.append(123);
        sb.append(45L);
        sb.append(6.5f);
        sb.append(7.5d);
        sb.append(false);
        sb.append(true);

        String s = sb.toString();
        assertTrue(s.startsWith("Hello "));
        assertTrue(s.contains("123"));
        assertTrue(s.contains("45"));
        assertTrue(s.contains("6.5"));
        assertTrue(s.contains("7.5"));
        assertTrue(s.endsWith("true"));
    }

    @Test
    public void testAppendNullBehavior() {
        assertEquals("", sb.toString());
        sb.append((String) null);
        assertEquals("", sb.toString());

        sb.setNullText("NULL");
        sb.append((String) null);
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testAppendSubstringAndChars() {
        sb.append("hello", 1, 3);
        assertEquals("ell", sb.toString());

        sb.clear();
        sb.append(new char[]{'a', 'b', 'c', 'd'}, 1, 2);
        assertEquals("bc", sb.toString());

        sb.clear();
        sb.append((char[]) null);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendSubstringInvalidStart() {
        sb.append("hello", -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendSubstringInvalidLength() {
        sb.append("hello", 1, 5);
    }

    @Test
    public void testAppendAll() {
        sb.appendAll(new Object[]{"a", "b"});
        assertEquals("ab", sb.toString());

        sb.clear();
        sb.appendAll((Object[]) null);
        assertEquals("", sb.toString());

        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("x");
        list.add("y");

        sb.clear();
        sb.appendAll(list);
        assertEquals("xy", sb.toString());

        sb.clear();
        sb.appendAll((java.util.Collection<?>) null);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(list.iterator());
        assertEquals("xy", sb.toString());

        sb.clear();
        sb.appendAll((java.util.Iterator<?>) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparator() {
        sb.append("a");
        sb.appendSeparator(",");
        assertEquals("a,", sb.toString());

        sb.appendSeparator("-", 0);
        assertEquals("a,", sb.toString());

        sb.appendSeparator("-", 2);
        assertEquals("a,-", sb.toString());
    }

    @Test
    public void testFixedWidthPadLeftRight() {
        sb.appendFixedWidthPadLeft("abc", 5, '0');
        assertEquals("00abc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(5, 4, '0');
        assertEquals("0005", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abc", 5, '0');
        assertEquals("abc00", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(5, 4, '0');
        assertEquals("5000", sb.toString());
    }

    @Test
    public void testInsert() {
        sb.append("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());

        sb.insert(3, "d");
        assertEquals("abcd", sb.toString());

        sb.insert(0, false);
        assertEquals("falseabcd", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertInvalidIndex() {
        sb.insert(-1, "x");
    }

    @Test
    public void testDelete() {
        sb.append("hello");
        sb.deleteCharAt(1);
        assertEquals("hllo", sb.toString());

        sb.delete(1, 3);
        assertEquals("ho", sb.toString());

        sb.clear();
        sb.append("hallo");
        sb.deleteAll('l');
        assertEquals("hao", sb.toString());

        sb.clear();
        sb.append("hallo");
        sb.deleteFirst('l');
        assertEquals("halo", sb.toString());

        sb.clear();
        sb.append("hallo");
        sb.deleteAll("ll");
        assertEquals("hao", sb.toString());

        sb.clear();
        sb.append("hallo");
        sb.deleteFirst("ll");
        assertEquals("hao", sb.toString());

        sb.clear();
        sb.append("hello");
        sb.deleteAll((String) null);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testReplace() {
        sb.append("hello");
        sb.replace(0, 1, "H");
        assertEquals("Hello", sb.toString());

        sb.clear();
        sb.append("hello");
        sb.replace("l", "L", 0, 5, 1);
        assertEquals("heLlo", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceInvalidRange() {
        sb.replace(0, 1, "x");
    }

    @Test
    public void testReverseAndTrim() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());

        sb.clear();
        sb.append("  hello  ");
        sb.trim();
        assertEquals("hello", sb.toString());

        sb.clear();
        sb.append("  ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testSubstrings() {
        sb.append("hello");
        assertEquals("ello", sb.substring(1));
        assertEquals("el", sb.substring(1, 3));
        assertEquals("he", sb.leftString(2));
        assertEquals("", sb.leftString(0));
        assertEquals("hello", sb.leftString(10));
        assertEquals("lo", sb.rightString(2));
        assertEquals("", sb.rightString(0));
        assertEquals("hello", sb.rightString(10));
        assertEquals("ell", sb.midString(1, 3));
        assertEquals("o", sb.midString(4, 10));
        assertEquals("", sb.midString(1, 0));
    }

    @Test
    public void testStartsEndsContains() {
        sb.append("hello");
        assertTrue(sb.startsWith("he"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith(null));
        assertTrue(sb.endsWith("lo"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith(null));
        assertTrue(sb.contains('l'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("ell"));
        assertFalse(sb.contains(null));
    }

    @Test
    public void testIndexOfLastIndexOf() {
        sb.append("hello");
        assertEquals(2, sb.indexOf('l'));
        assertEquals(3, sb.indexOf('l', 3));
        assertEquals(-1, sb.indexOf('l', 10));
        assertEquals(2, sb.indexOf("l"));
        assertEquals(3, sb.indexOf("l", 3));
        assertEquals(2, sb.indexOf("", 2));
        assertEquals(-1, sb.indexOf(null));

        assertEquals(3, sb.lastIndexOf('l'));
        assertEquals(2, sb.lastIndexOf('l', 2));
        assertEquals(3, sb.lastIndexOf("l"));
        assertEquals(2, sb.lastIndexOf("l", 2));
        assertEquals(-1, sb.lastIndexOf(null));
        assertEquals(3, sb.lastIndexOf("lo"));
    }

    @Test
    public void testEqualsHashCode() {
        StrBuilder s1 = new StrBuilder("abc");
        StrBuilder s2 = new StrBuilder("abc");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
        assertFalse(s1.equals("abc"));
        assertFalse(s1.equals(new StrBuilder("abd")));
        assertFalse(s1.equals(null));
    }

    @Test
    public void testToStringBuffer() {
        sb.append("abc");
        StringBuffer buf = sb.toStringBuffer();
        assertEquals("abc", buf.toString());

        buf.append("d");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testWriter() throws Exception {
        Writer w = sb.asWriter();
        w.write("hello");
        w.flush();
        w.close();
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testReader() throws Exception {
        sb.append("hello");
        Reader r = sb.asReader();
        char[] buf = new char[2];
        assertEquals(2, r.read(buf, 0, 2));
        assertEquals("he", new String(buf));
        assertEquals(3, r.skip(10));
        assertEquals(-1, r.read());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReaderInvalidOffset() throws Exception {
        sb.append("hello");
        sb.asReader().read(new char[2], -1, 1);
    }

    @Test
    public void testTokenizer() {
        sb.append("hello");
        assertNotNull(sb.asTokenizer());
    }
}