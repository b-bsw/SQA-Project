package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TarUtilsTest {

    // --- parseOctal tests ---
    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "0000755 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(493L, result);
    }

    @Test
    public void testParseOctalLeadingSpaces() {
        byte[] buffer = "   123 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, result);
    }

    @Test
    public void testParseOctalTrailingNull() {
        byte[] buffer = new byte[]{'1', '2', '3', 0, '4'};
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(83L, result);
    }

    @Test
    public void testParseOctalInvalidDigitThrows() {
        byte[] buffer = "12 34".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigitNonSpace() {
        byte[] buffer = "12g45".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    // --- parseName tests ---
    @Test
    public void testParseNameNormal() {
        byte[] buffer = "hello".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", name);
    }

    @Test
    public void testParseNameNullTerminated() {
        byte[] buffer = new byte[]{'a', 'b', 0, 'c'};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("ab", name);
    }

    @Test
    public void testParseNameEmpty() {
        byte[] buffer = new byte[10];
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);
    }

    // --- formatNameBytes tests ---
    @Test
    public void testFormatNameBytesNormal() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatNameBytes("hello", buf, 0, 10);
        assertEquals(10, result);
        String expected = "hello" + (char)0 + (char)0 + (char)0 + (char)0 + (char)0;
        assertEquals(expected, new String(buf));
    }

    @Test
    public void testFormatNameBytesShorterThanBuffer() {
        byte[] buf = new byte[8];
        TarUtils.formatNameBytes("abc", buf, 0, 8);
        String expected = "abc" + (char)0 + (char)0 + (char)0 + (char)0 + (char)0;
        assertEquals(expected, new String(buf));
    }

    @Test
    public void testFormatNameBytesNameLongerThanBufferTruncates() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("hello", buf, 0, 3);
        assertEquals("hel", new String(buf));
    }

    // --- formatUnsignedOctalString tests ---
    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[8];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 8);
        // expect "00000000"
        assertEquals("00000000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalStringSmall() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4);
        assertEquals("0010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(100L, buf, 0, 3);
    }

    // --- formatOctalBytes tests ---
    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[6];
        int result = TarUtils.formatOctalBytes(7L, buf, 0, 6);
        assertEquals(6, result);
        // value=7 -> "0000000007" only fits? Actually 6 bytes with idx=4, so 4 octal digits: "0007" then space and null = 6 chars
        String expected = "0007" + (char) ' ' + (char) 0;
        assertEquals(expected, new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytesOverflow() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(100L, buf, 0, 3);
    }

    // --- formatLongOctalBytes tests ---
    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[5];
        int result = TarUtils.formatLongOctalBytes(7L, buf, 0, 5);
        assertEquals(5, result);
        // idx=4 => "0007" + space
        String expected = "0007 ";
        assertEquals(expected, new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytesOverflow() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(100L, buf, 0, 2);
    }

    // --- formatCheckSumOctalBytes tests ---
    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[6];
        int result = TarUtils.formatCheckSumOctalBytes(7L, buf, 0, 6);
        assertEquals(6, result);
        // idx=4 => "0007"+null+space
        String expected = "0007" + (char) 0 + " ";
        assertEquals(expected, new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytesOverflow() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(100L, buf, 0, 3);
    }

    // --- computeCheckSum tests ---
    @Test
    public void testComputeCheckSumEmptyBuffer() {
        byte[] buf = new byte[0];
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSumNonEmpty() {
        byte[] buf = new byte[]{1, 2, 3};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(6L, sum);
    }

    @Test
    public void testComputeCheckSumLargeBuffer() {
        byte[] buf = new byte[512];
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(0L, sum);
    }
}