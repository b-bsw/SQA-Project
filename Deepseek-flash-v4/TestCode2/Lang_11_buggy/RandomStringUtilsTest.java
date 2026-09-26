package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.Test;

public class RandomStringUtilsTest {

    @Test
    public void zeroCountReturnsEmpty() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, false));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false));
        assertEquals("", RandomStringUtils.random(0, ""));
        assertEquals("", RandomStringUtils.random(0, new char[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeCountThrows() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeCountWithStringThrows() {
        RandomStringUtils.random(-1, "abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyCharsArrayThrows() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyStringCharsThrows() {
        RandomStringUtils.random(5, "");
    }

    @Test
    public void randomCountReturnsRequestedLength() {
        assertEquals(10, RandomStringUtils.random(10).length());
        assertEquals(1, RandomStringUtils.random(1).length());
    }

    @Test
    public void randomWithNullStringIsAllowed() {
        String s = RandomStringUtils.random(20, (String) null);
        assertEquals(20, s.length());
    }

    @Test
    public void randomWithStringCharsUsesOnlyThoseChars() {
        String s = RandomStringUtils.random(100, "ab");
        assertEquals(100, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(c == 'a' || c == 'b');
        }
    }

    @Test
    public void randomWithCharArrayUsesOnlyThoseChars() {
        char[] chars = {'x', 'y', 'z'};
        String s = RandomStringUtils.random(75, chars);
        assertEquals(75, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void asciiOnlyUsesAsciiRange() {
        String s = RandomStringUtils.randomAscii(200);
        assertEquals(200, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(c >= 32 && c <= 126);
        }
    }

    @Test
    public void alphabeticOnlyContainsLetters() {
        String s = RandomStringUtils.randomAlphabetic(200);
        assertEquals(200, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("not a letter: " + c, Character.isLetter(c));
        }
    }

    @Test
    public void numericOnlyContainsDigits() {
        String s = RandomStringUtils.randomNumeric(200);
        assertEquals(200, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("not a digit: " + c, Character.isDigit(c));
        }
    }

    @Test
    public void alphanumericOnlyContainsLettersOrDigits() {
        String s = RandomStringUtils.randomAlphanumeric(200);
        assertEquals(200, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void booleanOverloadRespectsLetterFlag() {
        String letters = RandomStringUtils.random(200, true, false);
        assertEquals(200, letters.length());
        for (char c : letters.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void startEndWithoutCharsArray() {
        String s = RandomStringUtils.random(100, 48, 58, false, false);
        assertEquals(100, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(c >= '0' && c <= '9');
        }
    }

    @Test
    public void suppliedRandomProducesDeterministicResult() {
        Random r1 = new Random(42L);
        Random r2 = new Random(42L);

        String a = RandomStringUtils.random(20, 0, 0, true, false, (char[]) null, r1);
        String b = RandomStringUtils.random(20, 0, 0, true, false, (char[]) null, r2);

        assertEquals(a, b);
        assertEquals(20, a.length());

        for (char c : a.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void startEndWithSuppliedRandomAndRange() {
        Random random = new Random(7L);
        String s = RandomStringUtils.random(100, '0', '9' + 1, false, false, (char[]) null, random);

        assertEquals(100, s.length());
        for (char c : s.toCharArray()) {
            assertTrue(c >= '0' && c <= '9');
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void tooSmallCharArrayThrows() {
        char[] chars = {'a'};
        Random random = new Random() {
            @Override
            public int nextInt(int bound) {
                return bound - 1;
            }
        };

        RandomStringUtils.random(10, 0, 10, false, false, chars, random);
    }
}