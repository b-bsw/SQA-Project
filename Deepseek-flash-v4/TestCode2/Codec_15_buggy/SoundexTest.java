package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class SoundexTest {

    @Test
    public void testSoundexNull() {
        Soundex s = new Soundex();
        assertNull(s.soundex(null));
    }

    @Test
    public void testSoundexEmpty() {
        Soundex s = new Soundex();
        assertEquals("", s.soundex(""));
    }

    @Test
    public void testSoundexNormal() {
        Soundex s = new Soundex();
        assertEquals("R163", s.soundex("Robert"));
        assertEquals("R163", s.soundex("Rupert"));
        assertEquals("A261", s.soundex("Ashcraft"));
        assertEquals("T522", s.soundex("Tymczak"));
    }

    @Test
    public void testSoundexSingleLetter() {
        Soundex s = new Soundex();
        assertEquals("A000", s.soundex("A"));
    }

    @Test
    public void testSoundexNonZeroAfterH() {
        Soundex s = new Soundex();
        assertEquals("A261", s.soundex("Ashcraft"));
    }

    @Test
    public void testSoundexHWRule() {
        Soundex s = new Soundex();
        assertEquals("J410", s.soundex("Jhonson"));
    }

    @Test
    public void testSoundexDuplicateLetters() {
        Soundex s = new Soundex();
        assertEquals("B650", s.soundex("Bobbitt"));
    }

    @Test
    public void testEncodeString() {
        Soundex s = new Soundex();
        assertEquals("R163", s.encode("Robert"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNonString() throws EncoderException {
        Soundex s = new Soundex();
        s.encode(Integer.valueOf(123));
    }

    @Test
    public void testEncodeObjectString() throws EncoderException {
        Soundex s = new Soundex();
        Object result = s.encode((Object) "Robert");
        assertEquals("R163", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapInvalidChar() {
        Soundex s = new Soundex();
        s.soundex("A@");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapNonLetter() {
        Soundex s = new Soundex();
        s.soundex("123");
    }

    @Test
    public void testDifference() throws EncoderException {
        Soundex s = new Soundex();
        assertEquals(1, s.difference("Robert", "Rupert"));
        assertEquals(2, s.difference("Robert", "Rubin"));
    }

    @Test
    public void testConstructorWithCharArray() {
        char[] mapping = "01230120022455012623010202".toCharArray();
        Soundex s = new Soundex(mapping);
        assertEquals("R163", s.soundex("Robert"));
    }

    @Test
    public void testConstructorWithString() {
        Soundex s = new Soundex("01230120022455012623010202");
        assertEquals("R163", s.soundex("Robert"));
    }

    @Test
    public void testUSEnglishInstance() {
        assertEquals("R163", Soundex.US_ENGLISH.soundex("Robert"));
    }

    @Test
    public void testGetMaxLength() {
        Soundex s = new Soundex();
        assertEquals(4, s.getMaxLength());
    }

    @Test
    public void testSetMaxLength() {
        Soundex s = new Soundex();
        s.setMaxLength(10);
        assertEquals(10, s.getMaxLength());
    }

    @Test
    public void testSoundexLowerCaseInput() {
        Soundex s = new Soundex();
        assertEquals("R163", s.soundex("robert"));
    }

    @Test
    public void testSoundexWithLongString() {
        Soundex s = new Soundex();
        String encoded = s.soundex("Washington");
        assertEquals("W252", encoded);
    }

    @Test
    public void testSoundexOnlyZeroMapping() {
        Soundex s = new Soundex("00000000000000000000000000");
        assertEquals("H000", s.soundex("Hello"));
    }
}