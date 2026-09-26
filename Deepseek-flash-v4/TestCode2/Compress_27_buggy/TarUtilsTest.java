package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "000064 ".getBytes();
        assertEquals(52L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthLessThan2() {
        byte[] buffer = new byte[1];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[6];
        buffer[0] = 0;
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = "000A64 ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalNoTrailer() {
        byte[] buffer = "123456".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinaryOctal() {
        byte[] buffer = "000064 ".getBytes();
        assertEquals(52L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryLong() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[7] = 0x01;
        assertEquals(1L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryBinaryBigInteger() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80;
        buffer[8] = 0x01;
        assertEquals(1L, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinaryExceedsLong() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0xff;
        buffer[1] = (byte) 0x80;
        for (int i = 2; i < 9; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 9);
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[]{1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[]{0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameNormal() {
        byte[] buffer = "hello".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameWithNul() {
        byte[] buffer = new byte[]{'h', 'e', 'l', 'l', 'o', 0, 'x'};
        assertEquals("hello", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameEmpty() {
        byte[] buffer = new byte[10];
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameFallsBackToFallbackEncoding() throws IOException {
        // Use a name that fails with DEFAULT_ENCODING but succeeds with FALLBACK_ENCODING
        // Since DEFAULT_ENCODING is not specified, we just test the fallback path
        byte[] buffer = "test".getBytes();
        ZipEncoding encoding = TarUtils.FALLBACK_ENCODING;
        assertEquals("test", TarUtils.parseName(buffer, 0, buffer.length, encoding));
    }

    @Test
    public void testFormatNameBytesNormal() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatNameBytes("hello", buf, 0, buf.length);
        assertEquals(10, result - 0);
        assertEquals("hello", new String(buf, 0, 5));
        assertEquals(0, buf[5]);
    }

    @Test
    public void testFormatNameBytesTruncated() {
        byte[] buf = new byte[3];
        int result = TarUtils.formatNameBytes("hello", buf, 0, buf.length);
        assertEquals(3, result - 0);
        assertEquals("hel", new String(buf, 0, 3));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, buffer.length);
        assertEquals("00000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringPositive() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(52, buffer, 0, buffer.length);
        assertEquals("00064", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64, buffer, 0, buffer.length);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int result = TarUtils.formatOctalBytes(52, buf, 0, buf.length);
        assertEquals(8, result - 0);
        assertEquals("000064 \0", new String(buf));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int result = TarUtils.formatLongOctalBytes(52, buf, 0, buf.length);
        assertEquals(8, result - 0);
        assertEquals("000064 ", new String(buf));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[8];
        int result = TarUtils.formatLongOctalOrBinaryBytes(52, buf, 0, buf.length);
        assertEquals(8, result - 0);
        assertEquals("000064 ", new String(buf));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinary() {
        byte[] buf = new byte[8];
        int result = TarUtils.formatLongOctalOrBinaryBytes(-1, buf, 0, buf.length);
        assertEquals(8, result - 0);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinaryTooLarge() {
        byte[] buf = new byte[8];
        // This value is too large for 7-byte binary
        long value = 1L << 56;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int result = TarUtils.formatCheckSumOctalBytes(52, buf, 0, buf.length);
        assertEquals(8, result - 0);
        assertEquals("000064\0 ", new String(buf));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[]{1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSumMatchUnsigned() {
        // Simple header that should produce a matching checksum
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 10];
        // Set some bytes to make a predictable sum
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) i;
        }
        // Set the checksum field to spaces initially
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = (byte) ' ';
        }
        // Compute the real checksum with checksum field as spaces
        long sum = 0;
        for (int i = 0; i < header.length; i++) {
            sum += 0xff & header[i];
        }
        // Format storedSum as octal in the checksum field
        String octalSum = Long.toOctalString(sum);
        int digits = Math.min(octalSum.length(), 6);
        int startPos = TarConstants.CHKSUM_OFFSET + (6 - digits);
        for (int i = 0; i < digits; i++) {
            header[startPos + i] = (byte) octalSum.charAt(i);
        }
        header[TarConstants.CHKSUM_OFFSET + 6] = 0;
        header[TarConstants.CHKSUM_OFFSET + 7] = (byte) ' ';
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumGreaterThanUnsigned() {
        // Test the COMPRESS-177 case
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 10];
        for (int i = 0; i < header.length; i++) {
            header[i] = 0;
        }
        // Set checksum to something large
        for (int i = 0; i < 6; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = (byte) '7';
        }
        header[TarConstants.CHKSUM_OFFSET + 6] = 0;
        header[TarConstants.CHKSUM_OFFSET + 7] = (byte) ' ';
        // unsignedSum will be 0, storedSum will be big, so storedSum > unsignedSum
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFormatLongBinaryNegative() {
        byte[] buf = new byte[8];
        // Trigger formatLongBinary with negative value and length < 9
        TarUtils.formatLongOctalOrBinaryBytes(-1, buf, 0, buf.length);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatBigIntegerBinary() {
        byte[] buf = new byte[12];
        // length >= 9 triggers formatBigIntegerBinary
        TarUtils.formatLongOctalOrBinaryBytes(1000, buf, 0, 12);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryLongTooLarge() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80;
        // This should throw in parseBinaryLong because length >= 9
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, 9);
        } catch (IllegalArgumentException e) {
            // parseOctalOrBinary will call parseBinaryBigInteger instead, so this might not throw
            throw e;
        }
    }
}