package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class RandomStringUtilsTest {

    // Controlled Random to produce deterministic sequences
    private static class ControlledRandom extends Random {
        private final int[] values;
        private int index;
        public ControlledRandom(int... values) {
            super(0L);
            this.values = values;
            this.index = 0;
        }
        @Override
        public int nextInt(int bound) {
            if (bound <= 0) return 0;
            if (index >= values.length) return 0;
            int v = values[index++];
            return v % bound;
        }
    }

    @Test
    public void testRandomCountZeroReturnsEmpty() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, true));
        assertEquals("", RandomStringUtils.randomAscii(0));
        assertEquals("", RandomStringUtils.randomAlphabetic(0));
        assertEquals("", RandomStringUtils.randomAlphanumeric(0));
        assertEquals("", RandomStringUtils.randomNumeric(0));
        assertEquals("", RandomStringUtils.random(0, "abc"));
        assertEquals("", RandomStringUtils.random(0, 'a', 'b'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCountThrowsIllegalArgument() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCountMainThrows() {
        RandomStringUtils.random(-1, 0, 0, false, false, null, new Random());
    }

    // Test default behaviour with controlled Random producing NULL char
    @Test
    public void testRandomDefaultsWithControlledRandom() {
        ControlledRandom cr = new ControlledRandom(0, 0, 0, 0, 0);
        String result = RandomStringUtils.random(5, 0, 0, false, false, null, cr);
        assertEquals(5, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertEquals(0, (int) result.charAt(i));
        }
    }

    // Test that letters filter is respected
    @Test
    public void testRandomLettersOnly() {
        // start=65 (A), end=91 (exclusive), only letters A-Z
        ControlledRandom cr = new ControlledRandom(0, 12, 25, 5);
        String result = RandomStringUtils.random(4, 65, 91, true, false, null, cr);
        assertEquals(4, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue("must be letter", Character.isLetter(result.charAt(i)));
        }
        // all produced characters are already letters, so no retry needed
    }

    // Test retry logic when generated char is not a letter (letters=true)
    @Test
    public void testRandomLettersRetry() {
        // start=48 (digits), end=58, letters=true, numbers=false
        // First three calls produce non-letter digits, fourth call produces letter 'A' (65)
        ControlledRandom cr = new ControlledRandom(0, 1, 2, 17); // 48+17=65
        String result = RandomStringUtils.random(1, 48, 58, true, false, null, cr);
        assertEquals(1, result.length());
        assertTrue("must be letter", Character.isLetter(result.charAt(0)));
        // Ensure that we used extra random calls: with singleton count, loop retries until letter
        assertTrue( cr.index >= 4); // at least 4 random calls
    }

    // Test that numbers filter is respected
    @Test
    public void testRandomNumbersOnly() {
        ControlledRandom cr = new ControlledRandom(0, 5, 9);
        String result = RandomStringUtils.random(3, 48, 58, false, true, null, cr);
        assertEquals(3, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue("must be digit", Character.isDigit(result.charAt(i)));
        }
    }

    // Test both filters (alphanumeric)
    @Test
    public void testRandomLettersAndNumbers() {
        // Use range 48-123 to include digits, letters, and others
        // Filter both true -> accept only letter or digit
        ControlledRandom cr = new ControlledRandom(0, 5, 25, 30, 45, 61, 75);
        String result = RandomStringUtils.random(7, 48, 123, true, true, null, cr);
        assertEquals(7, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue("must be letter or digit", Character.isLetter(c) || Character.isDigit(c));
        }
    }

    // Test neither letters nor numbers -> accept any
    @Test
    public void testRandomNeitherFilter() {
        ControlledRandom cr = new ControlledRandom(0, 1, 2, 3, 4);
        String result = RandomStringUtils.random(5, 32, 36, false, false, null, cr);
        assertEquals(5, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue("char out of range", c >= 32 && c < 36);
        }
    }

    // Test start / end when both are zero and letters/numbers false -> end becomes Integer.MAX_VALUE
    @Test
    public void testStartEndZeroBothFalse() {
        ControlledRandom cr = new ControlledRandom(0, 100000);
        String result = RandomStringUtils.random(2, 0, 0, false, false, null, cr);
        assertEquals(2, result.length());
        // just check length and no exception
    }

    // Test start / end when both zero and one flag true -> start=' ', end='z'+1
    @Test
    public void testStartEndZeroLettersTrue() {
        ControlledRandom cr = new ControlledRandom(0, 50);
        String result = RandomStringUtils.random(2, 0, 0, true, false, null, cr);
        assertEquals(2, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue("should be letter", Character.isLetter(c));
        }
    }

    // Test with non-null chars array
    @Test
    public void testRandomWithCharsArray() {
        char[] chars = new char[] {'a', 'b', 'c', 'd'};
        ControlledRandom cr = new ControlledRandom(0, 1, 2, 3);
        String result = RandomStringUtils.random(4, 0, chars.length, false, false, chars, cr);
        assertEquals(4, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue("must be from set", c >= 'a' && c <= 'd');
        }
    }

    // Test chars array empty causes exception
    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithEmptyCharsArray() {
        RandomStringUtils.random(5, new char[0]);
    }

    // Test chars array null (delegation)
    @Test
    public void testRandomWithNullCharsArray() {
        ControlledRandom cr = new ControlledRandom(0, 0, 0);
        String result = RandomStringUtils.random(3, 0, 0, false, false, null, cr);
        assertEquals(3, result.length());
        // equivalent to calling without chars
    }

    // Test chars array too small leads to ArrayIndexOutOfBoundsException
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRandomCharsArrayOutOfBounds() {
        char[] chars = new char[] {'a', 'b'};
        // gap = 10, start=5 -> indices from 5 to 15, but array length is 2
        RandomStringUtils.random(1, 5, 15, false, false, chars, new Random());
    }

    // Low surrogate branch (count != 0)
    @Test
    public void testRandomLowSurrogateCountNotZero() {
        // start=56320, end=56321, gap=1 => only char 56320 (low surrogate)
        ControlledRandom cr = new ControlledRandom(0, 0); // first for low surrogate, second for high surrogate
        String result = RandomStringUtils.random(2, 56320, 56321, false, false, null, cr);
        assertEquals(2, result.length());
        // first char (written after low) should be high surrogate
        // second char (written first) should be low surrogate
        assertTrue("index 0 must be high surrogate", (int)result.charAt(0) >= 55296 && (int)result.charAt(0) <= 56191);
        assertTrue("index 1 must be low surrogate", (int)result.charAt(1) >= 56320 && (int)result.charAt(1) <= 57343);
    }

    // High surrogate branch (count != 0)
    @Test
    public void testRandomHighSurrogateCountNotZero() {
        // start=55296, end=55297, gap=1 => only char 55296 (high surrogate)
        ControlledRandom cr = new ControlledRandom(0, 0); // first for high, second for low
        String result = RandomStringUtils.random(2, 55296, 55297, false, false, null, cr);
        assertEquals(2, result.length());
        // first char (written after high) should be low surrogate
        // second char (written first) should be high surrogate
        assertTrue("index 0 must be low surrogate", (int)result.charAt(0) >= 56320 && (int)result.charAt(0) <= 57343);
        assertTrue("index 1 must be high surrogate", (int)result.charAt(1) >= 55296 && (int)result.charAt(1) <= 56191);
    }

    // Private high surrogate branch (skip)
    @Test
    public void testRandomPrivateHighSurrogate() {
        // start=56192, end=56320, gap=128 => can get private high (56192-56319) and normal low (56320)
        // We feed: first call returns 0 -> 56192 (private high) -> skip (count++), second call returns 128 -> 56320 (low surrogate)
        // But careful: second call should be something acceptable eventually.
        ControlledRandom cr = new ControlledRandom(0, 128); // first private high -> skip, second 56320 -> low surrogate but we want normal? Actually 56320 is low surrogate, will be handled.
        String result = RandomStringUtils.random(1, 56192, 56320, false, false, null, cr);
        // With count=1, if first is private high, count++ makes count=1 again; then second char 56320 is low surrogate: count becomes 1 again? This could loop. To avoid, we use count=2 so that after skip, the next fill works.
        ControlledRandom cr2 = new ControlledRandom(0, 0, 128, 0);
        String result2 = RandomStringUtils.random(2, 56192, 56320, false, false, null, cr2);
        assertEquals(2, result2.length());
        // the two characters should be from the allowed set (low surrogate handled earlier? Actually one may be low surrogate inserted, but we just ensure no exception)
    }

    // Test convenience method random(int, String) with null
    @Test
    public void testRandomWithNullString() {
        ControlledRandom cr = new ControlledRandom(0,0,0);
        // Using the public method that accepts String; it delegates to final method with chars=null
        String result = RandomStringUtils.random(3, (String)null);
        assertEquals(3, result.length());
        // no explicit control, but length check
    }

    // Test convenience method random(int, char...) with null
    @Test
    public void testRandomWithNullVararg() {
        String result = RandomStringUtils.random(3, (char[]) null);
        assertEquals(3, result.length());
    }

    // Test that char... overload uses the array length correctly
    @Test
    public void testRandomWithNonEmptyVararg() {
        // char[] = {'x','y','z'}, count=2, should return chars only from those
        String result = RandomStringUtils.random(2, 'x', 'y', 'z');
        assertEquals(2, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue("unexpected char", c == 'x' || c == 'y' || c == 'z');
        }
    }

    // Integration: test randomAscii produces printable ascii
    @Test
    public void testRandomAsciiPrintable() {
        for (int i = 0; i < 10; i++) {
            String s = RandomStringUtils.randomAscii(10);
            assertEquals(10, s.length());
            for (char c : s.toCharArray()) {
                assertTrue("must be printable ASCII", c >= 32 && c <= 126);
            }
        }
    }

    // Integration: test randomAlphabetic produces only letters
    @Test
    public void testRandomAlphabeticOnlyLetters() {
        for (int i = 0; i < 5; i++) {
            String s = RandomStringUtils.randomAlphabetic(15);
            assertEquals(15, s.length());
            for (char c : s.toCharArray()) {
                assertTrue("must be letter", Character.isLetter(c));
            }
        }
    }

    // Integration: test randomAlphanumeric produces letters/digits
    @Test
    public void testRandomAlphanumericOnlyLettersDigits() {
        for (int i = 0; i < 5; i++) {
            String s = RandomStringUtils.randomAlphanumeric(12);
            assertEquals(12, s.length());
            for (char c : s.toCharArray()) {
                assertTrue("must be letter or digit", Character.isLetter(c) || Character.isDigit(c));
            }
        }
    }

    // Integration: test randomNumeric produces only digits
    @Test
    public void testRandomNumericOnlyDigits() {
        for (int i = 0; i < 5; i++) {
            String s = RandomStringUtils.randomNumeric(8);
            assertEquals(8, s.length());
            for (char c : s.toCharArray()) {
                assertTrue("must be digit", Character.isDigit(c));
            }
        }
    }

    // Test overflow: count large positive value
    @Test
    public void testRandomLargeCount() {
        String s = RandomStringUtils.random(10000);
        assertEquals(10000, s.length());
    }

    // Edge: count=1 with normal random – just verify length
    @Test
    public void testRandomCountOne() {
        String s = RandomStringUtils.random(1);
        assertEquals(1, s.length());
    }

    // Test the overload with both start/end non-zero and chars array
    @Test
    public void testRandomWithStartEndAndCharsArray() {
        char[] chars = "ABCD".toCharArray();
        ControlledRandom cr = new ControlledRandom(0, 1, 2, 3);
        String result = RandomStringUtils.random(4, 0, 4, false, false, chars, cr);
        assertEquals(4, result.length());
        for (boolean ok : new boolean[] {false, false, false, false}) {
            // just check each char is in 'A'-'D'
        }
        for (char c : result.toCharArray()) {
            assertTrue("not in set", c >= 'A' && c <= 'D');
        }
    }

    // Test that random(int, String) with empty string throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithEmptyStringArg() {
        RandomStringUtils.random(5, "");
    }
}