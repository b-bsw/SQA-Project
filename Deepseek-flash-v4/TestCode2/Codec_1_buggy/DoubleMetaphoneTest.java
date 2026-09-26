package org.apache.commons.codec.language;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DoubleMetaphoneTest {

    private DoubleMetaphone dp;

    @Before
    public void setUp() {
        dp = new DoubleMetaphone();
    }

    @Test
    public void testNullInput() {
        assertNull(dp.doubleMetaphone(null));
        assertNull(dp.doubleMetaphone(null, false));
        assertNull(dp.doubleMetaphone(null, true));
        assertNull(dp.encode((String) null));
    }

    @Test
    public void testEmptyInput() {
        assertNull(dp.doubleMetaphone(""));
    }

    @Test
    public void testWhitespaceInput() {
        assertNull(dp.doubleMetaphone("   "));
    }

    @Test
    public void testBasicVowelStart() {
        assertEquals("A", dp.doubleMetaphone("A"));
    }

    @Test
    public void testBasicConsonantB() {
        assertEquals("P", dp.doubleMetaphone("B"));
    }

    @Test
    public void testSilentStartGN() {
        assertEquals("NK", dp.doubleMetaphone("GNOME"));
    }

    @Test
    public void testSimpleWord() {
        assertEquals("JNS", dp.doubleMetaphone("JONES"));
    }

    @Test
    public void testCHToK() {
        assertEquals("K", dp.doubleMetaphone("CH"));
    }

    @Test
    public void testCHToX() {
        assertEquals("X", dp.doubleMetaphone("CHARA"));
    }

    @Test
    public void testCipherCH() {
        assertEquals("KFK", dp.doubleMetaphone("COUGH"));
    }

    @Test
    public void testHandleDG() {
        assertEquals("JK", dp.doubleMetaphone("EDGE"));
    }

    @Test
    public void testHandleGH() {
        assertEquals("LF", dp.doubleMetaphone("LAUGH"));
    }

    @Test
    public void testHandleGNWithVowel() {
        assertEquals("NKN", dp.doubleMetaphone("SIGN"));
    }

    @Test
    public void testHandleHNonVowelBefore() {
        assertEquals("K", dp.doubleMetaphone("CH"));
    }

    @Test
    public void testHandleJosé() {
        assertEquals("HS", dp.doubleMetaphone("JOSE"));
    }

    @Test
    public void testHandleLLWithCondition() {
        assertEquals("L", dp.doubleMetaphone("ALLE"));
    }

    @Test
    public void testHandlePH() {
        assertEquals("F", dp.doubleMetaphone("PH"));
    }

    @Test
    public void testHandleWR() {
        assertEquals("R", dp.doubleMetaphone("WRITE"));
    }

    @Test
    public void testHandleXAtStart() {
        assertEquals("S", dp.doubleMetaphone("XENON"));
    }

    @Test
    public void testHandleXNotStart() {
        assertEquals("KS", dp.doubleMetaphone("BOX"));
    }

    @Test
    public void testHandleZWithH() {
        assertEquals("J", dp.doubleMetaphone("ZHANG"));
    }

    @Test
    public void testEncodeObjectNonStringThrows() {
        try {
            dp.encode(123);
            fail("Expected EncoderException");
        } catch (org.apache.commons.codec.EncoderException e) {
            // expected
        }
    }

    @Test
    public void testEncodeObjectString() throws Exception {
        assertEquals("JNS", dp.encode("JONES"));
    }

    @Test
    public void testIsEqualTrue() {
        assertTrue(dp.isDoubleMetaphoneEqual("JONES", "JOANS"));
    }

    @Test
    public void testIsEqualFalse() {
        assertFalse(dp.isDoubleMetaphoneEqual("JONES", "SMITH"));
    }

    @Test
    public void testIsEqualWithAlternate() {
        assertTrue(dp.isDoubleMetaphoneEqual("JOSE", "JOSE", true));
    }

    @Test
    public void testMaxCodeLenDefault() {
        assertEquals(4, dp.getMaxCodeLen());
    }

    @Test
    public void testSetMaxCodeLen() {
        dp.setMaxCodeLen(8);
        assertEquals(8, dp.getMaxCodeLen());
    }

    @Test
    public void testMaxCodeLenAffectsOutput() {
        dp.setMaxCodeLen(2);
        assertEquals("JN", dp.doubleMetaphone("JONES"));
    }

    @Test
    public void testHandleCWithKCOnsonant() {
        assertEquals("K", dp.doubleMetaphone("C"));
    }

    @Test
    public void testHandleCCWithIE() {
        assertEquals("X", dp.doubleMetaphone("ACCI"));
    }

    @Test
    public void testHandleSWithSH() {
        assertEquals("X", dp.doubleMetaphone("SHIP"));
    }

    @Test
    public void testHandleTWithTION() {
        assertEquals("XN", dp.doubleMetaphone("ACTION"));
    }

    @Test
    public void testHandleTHWithOM() {
        assertEquals("TM", dp.doubleMetaphone("THOMAS"));
    }

    @Test
    public void testHandleWSlavic() {
        assertEquals("TS", dp.doubleMetaphone("WICZ"));
    }

    @Test
    public void testHandleZSlavoGermanic() {
        assertEquals("TS", dp.doubleMetaphone("KOWALSKI"));
    }

    @Test
    public void testAlternateResultDiffers() {
        // "CHAE" -> primary K, alternate X
        String primary = dp.doubleMetaphone("CHAE", false);
        String alternate = dp.doubleMetaphone("CHAE", true);
        assertNotEquals(primary, alternate);
        assertEquals("K", primary);
        assertEquals("X", alternate);
    }

    @Test
    public void testIsSlavoGermanic() {
        assertTrue(dp.isDoubleMetaphoneEqual("KOWALSKI", "KOWALSKI", true));
    }

    @Test
    public void testConditionC0_CHIA() {
        assertEquals("K", dp.doubleMetaphone("CHIA"));
    }

    @Test
    public void testConditionCH0_Mc() {
        assertEquals("MK", dp.doubleMetaphone("MCHALE"));
    }

    @Test
    public void testHandlePWithPB() {
        assertEquals("P", dp.doubleMetaphone("APB"));
    }
}