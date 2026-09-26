package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "000000064 ".getBytes();
        assertEquals(52L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalLeadingZeros() {
        byte[] buffer = "000000000 ".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalNullByte() {
        byte[] buffer = new byte[]{0, '1', '2', '3', ' ', ' ', ' '};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthLessThan2() {
        TarUtils.parseOctal(new byte[]{'1'}, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidChar() {
        byte[] buffer = "0000 0064 ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() {
        byte[] buffer = new byte[]{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0x01};
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseBooleanTrue() {
        assertEquals(true, TarUtils.parseBoolean(new byte[]{1}, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        assertEquals(false, TarUtils.parseBoolean(new byte[]{0}, 0));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[11];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 11);
        assertEquals("00000000000", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[11];
        TarUtils.formatUnsignedOctalString(Long.MAX_VALUE, buffer, 0, 11);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[12];
        int result = TarUtils.formatOctalBytes(64L, buffer, 0, 12);
        assertEquals(12, result);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[12];
        int result = TarUtils.formatLongOctalBytes(64L, buffer, 0, 12);
        assertEquals(12, result);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesAsOctal() {
        byte[] buffer = new byte[12];
        int result = TarUtils.formatLongOctalOrBinaryBytes(64L, buffer, 0, 12);
        assertEquals(12, result);
        assertTrue(buffer[10] == ' ');
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesAsBinaryNegative() {
        byte[] buffer = new byte[9];
        int result = TarUtils.formatLongOctalOrBinaryBytes(-1L, buffer, 0, 9);
        assertEquals(9, result);
        assertEquals((byte)0xff, buffer[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinaryOverflow() {
        byte[] buffer = new byte[9];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buffer, 0, 9);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[12];
        int result = TarUtils.formatCheckSumOctalBytes(64L, buffer, 0, 12);
        assertEquals(12, result);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[]{0, 1, 2, 3, 4};
        assertEquals(10L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSumValid() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) i;
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = new byte[100];
        assertEquals("", TarUtils.parseName(buffer, 0, 100));
    }

    @Test
    public void testParseNameNonNull() throws Exception {
        byte[] buffer = "hello\0\0\0\0".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatNameBytes() throws Exception {
        byte[] buf = new byte[100];
        int result = TarUtils.formatNameBytes("hello", buf, 0, 100);
        assertEquals(100, result);
    }
}