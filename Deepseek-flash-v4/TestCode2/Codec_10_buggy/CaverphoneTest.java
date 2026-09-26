package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CaverphoneTest {

    private final Caverphone encoder = new Caverphone();

    @Test
    public void testCaverphoneNull() {
        assertEquals("1111111111", encoder.caverphone(null));
    }

    @Test
    public void testCaverphoneEmpty() {
        assertEquals("1111111111", encoder.caverphone(""));
    }

    @Test
    public void testCaverphoneNonAlphabeticCharactersIgnored() {
        assertEquals("1111111111", encoder.caverphone("12345!@#$%"));
    }

    @Test
    public void testCaverphoneSingleVowel() {
        assertEquals("A111111111", encoder.caverphone("a"));
    }

    @Test
    public void testCaverphoneSingleConsonant() {
        assertEquals("P111111111", encoder.caverphone("b"));
    }

    @Test
    public void testCaverphoneMixedInput() {
        assertEquals("AP11111111", encoder.caverphone("ab"));
    }

    @Test
    public void testCaverphoneAllVowels() {
        assertEquals("AA11111111", encoder.caverphone("aeiou"));
    }

    @Test
    public void testEncodeString() {
        assertEquals("A111111111", encoder.encode("a"));
    }

    @Test
    public void testEncodeStringNull() {
        assertEquals("1111111111", encoder.encode((String) null));
    }

    @Test
    public void testEncodeObjectAcceptsString() throws EncoderException {
        assertEquals("A111111111", encoder.encode((Object) "a"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectRejectsNonString() throws EncoderException {
        encoder.encode(new Object());
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNullRejected() throws EncoderException {
        encoder.encode((Object) null);
    }

    @Test
    public void testIsCaverphoneEqualTrue() {
        assertTrue(encoder.isCaverphoneEqual("b", "bb"));
        assertTrue(encoder.isCaverphoneEqual("a", "y"));
    }

    @Test
    public void testIsCaverphoneEqualFalse() {
        assertFalse(encoder.isCaverphoneEqual("a", "b"));
    }

    @Test
    public void testIsCaverphoneEqualNull() {
        assertTrue(encoder.isCaverphoneEqual(null, null));
        assertFalse(encoder.isCaverphoneEqual(null, "a"));
    }
}