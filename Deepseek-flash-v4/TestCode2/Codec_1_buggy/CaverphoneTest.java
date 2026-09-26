package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class CaverphoneTest {

    private Caverphone encoder;

    @Before
    public void setUp() {
        encoder = new Caverphone();
    }

    @Test
    public void testCaverphoneNull() {
        assertEquals("1111111111", encoder.caverphone(null));
    }

    @Test
    public void testCaverphoneEmpty() {
        assertEquals("1111111111", encoder.caverphone(""));
    }

    @Test
    public void testCaverphoneRemovesFinalE() {
        assertEquals("1111111111", encoder.caverphone("e"));
    }

    @Test
    public void testCaverphoneStripsNonAlpha() {
        assertEquals("1111111111", encoder.caverphone("123"));
    }

    @Test
    public void testCaverphoneVowelStart() {
        assertEquals("A111111111", encoder.caverphone("a"));
    }

    @Test
    public void testCaverphoneConsonantMapping() {
        assertEquals("APK1111111", encoder.caverphone("abc"));
    }

    @Test
    public void testCaverphoneStartOption() {
        assertEquals("KF11111111", encoder.caverphone("cough"));
    }

    @Test
    public void testCaverphoneAlwaysReturnsTenCharacters() {
        assertEquals(10, encoder.caverphone("abcdefghijklmnopqrstuvwxyz").length());
    }

    @Test
    public void testEncodeString() {
        assertEquals("APK1111111", encoder.encode("abc"));
    }

    @Test
    public void testEncodeObjectString() throws EncoderException {
        assertEquals("APK1111111", (String) encoder.encode((Object) "abc"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNonStringThrows() throws EncoderException {
        encoder.encode(new Object());
    }

    @Test
    public void testIsCaverphoneEqualTrue() {
        assertTrue(encoder.isCaverphoneEqual("a", "ae"));
    }

    @Test
    public void testIsCaverphoneEqualFalse() {
        assertFalse(encoder.isCaverphoneEqual("a", "b"));
    }
}