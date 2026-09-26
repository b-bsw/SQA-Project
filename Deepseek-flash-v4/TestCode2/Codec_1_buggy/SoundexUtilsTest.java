package org.apache.commons.codec.language;

import junit.framework.TestCase;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class SoundexUtilsTest extends TestCase {

    public SoundexUtilsTest(String name) {
        super(name);
    }

    public void testCleanNull() {
        assertNull(SoundexUtils.clean(null));
    }

    public void testCleanEmpty() {
        assertEquals("", SoundexUtils.clean(""));
    }

    public void testCleanOnlyLettersUpperCases() {
        assertEquals("ABC", SoundexUtils.clean("aBc"));
    }

    public void testCleanMixedWithNonLetters() {
        assertEquals("ABCD", SoundexUtils.clean("a1b2C d"));
    }

    public void testCleanNoLetters() {
        assertEquals("", SoundexUtils.clean("123!@#"));
    }

    public void testDifferenceEncodedNullFirst() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "ABC"));
    }

    public void testDifferenceEncodedNullSecond() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABC", null));
    }

    public void testDifferenceEncodedEmpty() {
        assertEquals(0, SoundexUtils.differenceEncoded("", "ABC"));
    }

    public void testDifferenceEncodedSingleCharacterMatch() {
        assertEquals(1, SoundexUtils.differenceEncoded("A", "A"));
    }

    public void testDifferenceEncodedPartialMatch() {
        assertEquals(3, SoundexUtils.differenceEncoded("ABXD", "ABCD"));
    }

    public void testDifferenceEncodedDifferentLengths() {
        assertEquals(3, SoundexUtils.differenceEncoded("ABC", "ABCDEF"));
    }

    public void testDifferenceWithEncoder() throws Exception {
        assertEquals(3, SoundexUtils.difference(new UpperCaseStringEncoder(), "abC", "ABC"));
    }

    public void testDifferenceWithNullFirst() throws Exception {
        assertEquals(0, SoundexUtils.difference(new UpperCaseStringEncoder(), null, "ABC"));
    }

    public void testDifferenceWithNullSecond() throws Exception {
        assertEquals(0, SoundexUtils.difference(new UpperCaseStringEncoder(), "ABC", null));
    }

    public void testDifferenceEncoderException() {
        try {
            SoundexUtils.difference(new FailingEncoder(), "a", "b");
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // expected
        }
    }

    private static class UpperCaseStringEncoder implements StringEncoder {
        public String encode(String pString) throws EncoderException {
            if (pString == null) {
                return null;
            }
            return pString.toUpperCase(java.util.Locale.ENGLISH);
        }

        public Object encode(Object pObject) throws EncoderException {
            return encode((String) pObject);
        }
    }

    private static class FailingEncoder implements StringEncoder {
        public String encode(String pString) throws EncoderException {
            throw new EncoderException("failure");
        }

        public Object encode(Object pObject) throws EncoderException {
            return encode((String) pObject);
        }
    }
}