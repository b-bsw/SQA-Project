package org.apache.commons.codec.net;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class QuotedPrintableCodecTest {

    private QuotedPrintableCodec codec;

    @Before
    public void setUp() {
        codec = new QuotedPrintableCodec();
    }

    @Test
    public void testDefaultCharsetIsUtf8() {
        assertEquals("UTF-8", codec.getDefaultCharset());
        assertEquals("ISO-8859-1", new QuotedPrintableCodec("ISO-8859-1").getDefaultCharset());
    }

    @Test
    public void testEncodeByteArrayEscapesEqualSign() {
        assertArrayEquals(new byte[] {'=', '3', 'D'}, codec.encode(new byte[] {'='}));
    }

    @Test
    public void testEncodeByteArrayPreservesPrintableAscii() {
        assertArrayEquals("AZaz09 !".getBytes(StandardCharsets.US_ASCII),
                codec.encode("AZaz09 !".getBytes(StandardCharsets.US_ASCII)));
    }

    @Test
    public void testEncodeByteArrayEscapesNonPrintableAndHighBytes() {
        assertArrayEquals("=00=0A=80=FF".getBytes(StandardCharsets.US_ASCII),
                codec.encode(new byte[] {0x00, 0x0A, (byte) 0x80, (byte) 0xFF}));
    }

    @Test
    public void testDecodeByteArrayRoundTrip() throws DecoderException {
        byte[] input = new byte[] {0x00, 0x0A, (byte) 0xFF, '=', 'A'};
        assertArrayEquals(input, codec.decode(codec.encode(input)));
    }

    @Test
    public void testEncodeQuotedPrintableNullHandling() {
        assertNull(QuotedPrintableCodec.encodeQuotedPrintable(null, null));

        byte[] bytes = new byte[] {'A'};
        assertArrayEquals(bytes, QuotedPrintableCodec.encodeQuotedPrintable(null, bytes));
    }

    @Test
    public void testEncodeQuotedPrintableWithCustomBitSet() {
        BitSet printable = new BitSet();
        printable.set('A');

        assertArrayEquals("A=42=3D".getBytes(StandardCharsets.US_ASCII),
                QuotedPrintableCodec.encodeQuotedPrintable(printable,
                        new byte[] {'A', 'B', '='}));
    }

    @Test
    public void testDecodeQuotedPrintableNullAndEmptyInputs() throws DecoderException {
        assertNull(QuotedPrintableCodec.decodeQuotedPrintable(null));
        assertArrayEquals(new byte[0], QuotedPrintableCodec.decodeQuotedPrintable(new byte[0]));
    }

    @Test
    public void testEncodeStringEscapesNonAscii() throws Exception {
        assertEquals("=C3=A9", codec.encode("\u00e9"));
        assertEquals("A=C3=A9=E4=B8=AD", codec.encode("A\u00e9\u4e2d"));
    }

    @Test
    public void testDecodeStringUnescapesDefaultCharset() throws Exception {
        assertEquals("\u00e9", codec.decode("=C3=A9"));
        assertEquals("A\u00e9\u4e2d", codec.decode("A=C3=A9=E4=B8=AD"));
    }

    @Test
    public void testEncodeStringWithCharset() throws Exception {
        assertEquals("=E9", codec.encode("\u00e9", "ISO-8859-1"));
    }

    @Test
    public void testDecodeStringWithCharset() throws Exception {
        assertEquals("\u00e9", codec.decode("=E9", "ISO-8859-1"));
    }

    @Test
    public void testEmptyStringsAndByteArrays() throws Exception {
        assertEquals("", codec.encode(""));
        assertEquals("", codec.decode(""));
        assertArrayEquals(new byte[0], codec.encode(new byte[0]));
        assertArrayEquals(new byte[0], codec.decode(new byte[0]));
    }

    @Test
    public void testStringNullInputs() throws Exception {
        assertNull(codec.encode((String) null));
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testByteArrayNullInputs() throws Exception {
        assertNull(codec.encode((byte[]) null));
        assertNull(codec.decode((byte[]) null));
    }

    @Test
    public void testObjectNullInputs() throws Exception {
        assertNull(codec.encode((Object) null));
        assertNull(codec.decode((Object) null));
    }

    @Test
    public void testEncodeObjectDispatchesToByteArrayAndString() throws Exception {
        Object byteResult = codec.encode((Object) new byte[] {'='});
        assertTrue(byteResult instanceof byte[]);
        assertArrayEquals(new byte[] {'=', '3', 'D'}, (byte[]) byteResult);

        Object stringResult = codec.encode((Object) "=");
        assertTrue(stringResult instanceof String);
        assertEquals("=3D", stringResult);
    }

    @Test
    public void testDecodeObjectDispatchesToByteArrayAndString() throws Exception {
        Object byteResult = codec.decode((Object) new byte[] {'=', '3', 'D'});
        assertTrue(byteResult instanceof byte[]);
        assertArrayEquals(new byte[] {'='}, (byte[]) byteResult);

        Object stringResult = codec.decode((Object) "=3D");
        assertTrue(stringResult instanceof String);
        assertEquals("=", stringResult);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectRejectsUnsupportedType() throws Exception {
        codec.encode(new Object());
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObjectRejectsUnsupportedType() throws Exception {
        codec.decode(new Object());
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testEncodeStringWithUnsupportedCharset() throws Exception {
        codec.encode("abc", "not-a-real-charset");
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testDecodeStringWithUnsupportedCharset() throws Exception {
        codec.decode("abc", "not-a-real-charset");
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidQuotedPrintableThrows() throws Exception {
        codec.decode("=");
    }
}