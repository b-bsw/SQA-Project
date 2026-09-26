package org.apache.commons.codec.language;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DoubleMetaphoneTest {
    private DoubleMetaphone doubleMetaphone;

    @Before
    public void setUp() {
        doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    public void testNullInput() {
        assertNull(doubleMetaphone.doubleMetaphone(null));
        assertNull(doubleMetaphone.doubleMetaphone(null, true));
    }

    @Test
    public void testEmptyInput() {
        assertNull(doubleMetaphone.doubleMetaphone(""));
        assertNull(doubleMetaphone.doubleMetaphone("   "));
    }

    @Test
    public void testSingleVowel() {
        assertEquals("A", doubleMetaphone.doubleMetaphone("A"));
        assertEquals("A", doubleMetaphone.doubleMetaphone("E"));
    }

    @Test
    public void testSilentStartGN() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("GNOME"));
    }

    @Test
    public void testSilentStartKN() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("KNIGHT"));
    }

    @Test
    public void testSilentStartPN() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("PNUEMONIA"));
    }

    @Test
    public void testSilentStartWR() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("WRONG"));
    }

    @Test
    public void testSilentStartPS() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("PSYCHOLOGY"));
    }

    @Test
    public void testBasicB() {
        assertEquals("P", doubleMetaphone.doubleMetaphone("B"));
    }

    @Test
    public void testDoubleB() {
        assertEquals("P", doubleMetaphone.doubleMetaphone("ABBEY"));
    }

    @Test
    public void testCedilla() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("\u00C7"));
    }

    @Test
    public void testCCHIA() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("CHIA"));
    }

    @Test
    public void testCCAESAR() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("CAESAR"));
    }

    @Test
    public void testCCH() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("CH"));
    }

    @Test
    public void testCCZ() {
        assertEquals("SX", doubleMetaphone.doubleMetaphone("CZECH"));
    }

    @Test
    public void testCCIA() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("CIA"));
    }

    @Test
    public void testCCCIA() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("ACCIA"));
    }

    @Test
    public void testCCK() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("CK"));
    }

    @Test
    public void testCCE() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("CELLO"));
    }

    @Test
    public void testDefaultC() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("CAT"));
    }

    @Test
    public void testDefaultCWithSpace() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("C AT"));
    }

    @Test
    public void testDefaultCWithCKQ() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("CKAT"));
    }

    @Test
    public void testDGDG() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("DGE"));
    }

    @Test
    public void testDGNotIEY() {
        assertEquals("TK", doubleMetaphone.doubleMetaphone("DGA"));
    }

    @Test
    public void testDD() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("ADD"));
    }

    @Test
    public void testDefaultD() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("D"));
    }

    @Test
    public void testF() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("F"));
    }

    @Test
    public void testDoubleF() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("AFFIX"));
    }

    @Test
    public void testGHNoVowelBefore() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("GH"));
    }

    @Test
    public void testGHWithBHD() {
        assertEquals("", doubleMetaphone.doubleMetaphone("BGH"));
    }

    @Test
    public void testGHUF() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("CUGH"));
    }

    @Test
    public void testGHNotI() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("AGH"));
    }

    @Test
    public void testGHE() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("GHE"));
    }

    @Test
    public void testGHI() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("GHI"));
    }

    @Test
    public void testGNWithVowelFirst() {
        assertEquals("KN", doubleMetaphone.doubleMetaphone("AGNE"));
    }

    @Test
    public void testGNWithSlavoGermanic() {
        assertEquals("KN", doubleMetaphone.doubleMetaphone("AGN", false));
    }

    @Test
    public void testGNNoEY() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("AGN"));
    }

    @Test
    public void testGNWithEY() {
        assertEquals("KN", doubleMetaphone.doubleMetaphone("AGNEY"));
    }

    @Test
    public void testGLI() {
        assertEquals("KL", doubleMetaphone.doubleMetaphone("GLI"));
    }

    @Test
    public void testGLIWithSlavoGermanic() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("GLI", true));
    }

    @Test
    public void testGYInitial() {
        assertEquals("KJ", doubleMetaphone.doubleMetaphone("Y"));
    }

    @Test
    public void testGER() {
        assertEquals("KJ", doubleMetaphone.doubleMetaphone("GER"));
    }

    @Test
    public void testGERWithDanger() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("DANGER"));
    }

    @Test
    public void testGE() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("GEM"));
    }

    @Test
    public void testGG() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("GG"));
    }

    @Test
    public void testDefaultG() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("G"));
    }

    @Test
    public void testHWithVowelBefore() {
        assertEquals("H", doubleMetaphone.doubleMetaphone("AH"));
    }

    @Test
    public void testHWithoutVowelBefore() {
        assertEquals("", doubleMetaphone.doubleMetaphone("H"));
    }

    @Test
    public void testJOSE() {
        assertEquals("HS", doubleMetaphone.doubleMetaphone("JOSE"));
    }

    @Test
    public void testJOSEShort() {
        assertEquals("H", doubleMetaphone.doubleMetaphone("JOSE "));
    }

    @Test
    public void testJOSESanPrefix() {
        assertEquals("H", doubleMetaphone.doubleMetaphone("SAN JOSE "));
    }

    @Test
    public void testJInitial() {
        assertEquals("JA", doubleMetaphone.doubleMetaphone("J"));
    }

    @Test
    public void testJVowelBeforeAO() {
        assertEquals("JH", doubleMetaphone.doubleMetaphone("AJA"));
    }

    @Test
    public void testJFinal() {
        assertEquals("J ", doubleMetaphone.doubleMetaphone("J"));
    }

    @Test
    public void testJWithConsonantBefore() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("SJ"));
    }

    @Test
    public void testK() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("K"));
    }

    @Test
    public void testDoubleK() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("AKK"));
    }

    @Test
    public void testL() {
        assertEquals("L", doubleMetaphone.doubleMetaphone("L"));
    }

    @Test
    public void testLLCondition() {
        assertEquals("L", doubleMetaphone.doubleMetaphone("ALLO"));
    }

    @Test
    public void testLLNoCondition() {
        assertEquals("L", doubleMetaphone.doubleMetaphone("ALLE"));
    }

    @Test
    public void testM() {
        assertEquals("M", doubleMetaphone.doubleMetaphone("M"));
    }

    @Test
    public void testMM() {
        assertEquals("M", doubleMetaphone.doubleMetaphone("AMM"));
    }

    @Test
    public void testMUMB() {
        assertEquals("M", doubleMetaphone.doubleMetaphone("UMB"));
    }

    @Test
    public void testN() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("N"));
    }

    @Test
    public void testDoubleN() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("ANN"));
    }

    @Test
    public void testNTilde() {
        assertEquals("N", doubleMetaphone.doubleMetaphone("\u00D1"));
    }

    @Test
    public void testPH() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("PH"));
    }

    @Test
    public void testPNotPH() {
        assertEquals("P", doubleMetaphone.doubleMetaphone("P"));
    }

    @Test
    public void testPB() {
        assertEquals("P", doubleMetaphone.doubleMetaphone("PP"));
    }

    @Test
    public void testQ() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("Q"));
    }

    @Test
    public void testDoubleQ() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("QQ"));
    }

    @Test
    public void testRIEEnd() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("RIE"));
    }

    @Test
    public void testRIEEndWithME() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("MERIE"));
    }

    @Test
    public void testRNotEnd() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("RABBIT"));
    }

    @Test
    public void testDoubleR() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("ARR"));
    }

    @Test
    public void testSISL() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("ISLAM"));
    }

    @Test
    public void testSSUGAR() {
        assertEquals("XS", doubleMetaphone.doubleMetaphone("SUGAR"));
    }

    @Test
    public void testSSH() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("SH"));
    }

    @Test
    public void testSSHHeim() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SHEIM"));
    }

    @Test
    public void testSSIO() {
        assertEquals("SX", doubleMetaphone.doubleMetaphone("SIO"));
    }

    @Test
    public void testSSIOWithSlavo() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SIO", true));
    }

    @Test
    public void testSInitialMNLW() {
        assertEquals("SX", doubleMetaphone.doubleMetaphone("SM"));
    }

    @Test
    public void testSZ() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SZ"));
    }

    @Test
    public void testSC() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SC"));
    }

    @Test
    public void testSCHA() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("SCH"));
    }

    @Test
    public void testSCHO() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("SCHO"));
    }

    @Test
    public void testSCHOO() {
        assertEquals("SK", doubleMetaphone.doubleMetaphone("SCHOO"));
    }

    @Test
    public void testSCHER() {
        assertEquals("XSK", doubleMetaphone.doubleMetaphone("SCHER"));
    }

    @Test
    public void testSCIE() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SCIE"));
    }

    @Test
    public void testDefaultSC() {
        assertEquals("SK", doubleMetaphone.doubleMetaphone("SCA"));
    }

    @Test
    public void testTION() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("TION"));
    }

    @Test
    public void testTIA() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("TIA"));
    }

    @Test
    public void testTCH() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("TCH"));
    }

    @Test
    public void testTH() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("TH"));
    }

    @Test
    public void testTTH() {
        assertEquals("0T", doubleMetaphone.doubleMetaphone("TTH"));
    }

    @Test
    public void testTHWithOM() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("THOM"));
    }

    @Test
    public void testDefaultT() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("T"));
    }

    @Test
    public void testDoubleT() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("ATT"));
    }

    @Test
    public void testV() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("V"));
    }

    @Test
    public void testDoubleV() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("AVV"));
    }

    @Test
    public void testWR() {
        assertEquals("R", doubleMetaphone.doubleMetaphone("WR"));
    }

    @Test
    public void testWH() {
        assertEquals("A", doubleMetaphone.doubleMetaphone("WH"));
    }

    @Test
    public void testWFinalVowel() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("AW"));
    }

    @Test
    public void testWEWSKI() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("EWSKI"));
    }

    @Test
    public void testWWICZ() {
        assertEquals("TSFX", doubleMetaphone.doubleMetaphone("WICZ"));
    }

    @Test
    public void testDefaultW() {
        assertEquals("", doubleMetaphone.doubleMetaphone("W"));
    }

    @Test
    public void testXInitial() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("X"));
    }

    @Test
    public void testXNotIAU() {
        assertEquals("KS", doubleMetaphone.doubleMetaphone("AX"));
    }

    @Test
    public void testXIAU() {
        assertEquals("", doubleMetaphone.doubleMetaphone("IAU"));
    }

    @Test
    public void testXC() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("XX"));
    }

    @Test
    public void testZH() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("ZH"));
    }

    @Test
    public void testZZ() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("ZZ"));
    }

    @Test
    public void testZWithZO() {
        assertEquals("STS", doubleMetaphone.doubleMetaphone("ZO"));
    }

    @Test
    public void testZWithSlavoNotT() {
        assertEquals("STS", doubleMetaphone.doubleMetaphone("AZO"));
    }

    @Test
    public void testDefaultZ() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("Z"));
    }

    @Test
    public void testDefaultCase() {
        assertEquals("", doubleMetaphone.doubleMetaphone("1"));
    }

    @Test
    public void testEncodeObject() throws Exception {
        assertEquals("N", doubleMetaphone.encode((Object) "KNIGHT"));
    }

    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeNonString() throws Exception {
        doubleMetaphone.encode((Object) 123);
    }

    @Test
    public void testEncodeString() {
        assertEquals("N", doubleMetaphone.encode("KNIGHT"));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("KNIGHT", "NIGHT"));
    }

    @Test
    public void testIsDoubleMetaphoneEqualAlternate() {
        assertFalse(doubleMetaphone.isDoubleMetaphoneEqual("KNIGHT", "NIGHT", true));
    }

    @Test
    public void testGetSetMaxCodeLen() {
        assertEquals(4, doubleMetaphone.getMaxCodeLen());
        doubleMetaphone.setMaxCodeLen(6);
        assertEquals(6, doubleMetaphone.getMaxCodeLen());
    }

    @Test
    public void testAlternateResult() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("CH", true));
    }

    @Test
    public void testSlavoGermanicW() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("W"));
    }

    @Test
    public void testSlavoGermanicK() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("K"));
    }

    @Test
    public void testSlavoGermanicCZ() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("CZ"));
    }

    @Test
    public void testSlavoGermanicWITZ() {
        assertEquals("TSFX", doubleMetaphone.doubleMetaphone("WITZ"));
    }

    @Test
    public void testIsComplete() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(2);
        assertFalse(result.isComplete());
        result.appendPrimary('a');
        result.appendAlternate('b');
        assertFalse(result.isComplete());
        result.appendPrimary('c');
        result.appendAlternate('d');
        assertTrue(result.isComplete());
    }

    @Test
    public void testResultAppendChar() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(2);
        result.append('x');
        assertEquals("x", result.getPrimary());
        assertEquals("x", result.getAlternate());
    }

    @Test
    public void testResultAppendCharPair() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(2);
        result.append('a', 'b');
        assertEquals("a", result.getPrimary());
        assertEquals("b", result.getAlternate());
    }

    @Test
    public void testResultAppendString() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(4);
        result.append("abc");
        assertEquals("abc", result.getPrimary());
        assertEquals("abc", result.getAlternate());
    }

    @Test
    public void testResultAppendStringPair() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(4);
        result.append("ab", "cd");
        assertEquals("ab", result.getPrimary());
        assertEquals("cd", result.getAlternate());
    }

    @Test
    public void testResultAppendPrimaryCharLimited() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(1);
        result.appendPrimary('x');
        result.appendPrimary('y');
        assertEquals("x", result.getPrimary());
    }

    @Test
    public void testResultAppendAlternateCharLimited() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(1);
        result.appendAlternate('x');
        result.appendAlternate('y');
        assertEquals("x", result.getAlternate());
    }

    @Test
    public void testResultAppendPrimaryStringLimited() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(2);
        result.appendPrimary("abc");
        assertEquals("ab", result.getPrimary());
    }

    @Test
    public void testResultAppendAlternateStringLimited() {
        DoubleMetaphone.DoubleMetaphoneResult result = doubleMetaphone.new DoubleMetaphoneResult(2);
        result.appendAlternate("abc");
        assertEquals("ab", result.getAlternate());
    }

    @Test
    public void testConditionC0CHIA() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("CHIA", "K"));
    }

    @Test
    public void testConditionC0VowelBefore() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("ACH", "AK"));
    }

    @Test
    public void testConditionC0NoACH() {
        assertFalse(doubleMetaphone.isDoubleMetaphoneEqual("BACH", "B"));
    }

    @Test
    public void testConditionC0IorE() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("BACHI", "B"));
    }

    @Test
    public void testConditionCH0Harac() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("HARAC", "K"));
    }

    @Test
    public void testConditionCH0Chore() {
        assertFalse(doubleMetaphone.isDoubleMetaphoneEqual("CHORE", "K"));
    }

    @Test
    public void testConditionCH1VanSch() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("VAN ACH", "K"));
    }

    @Test
    public void testConditionCH1Orches() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("ORCHES", "K"));
    }

    @Test
    public void testConditionCH1T() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("ACHT", "K"));
    }

    @Test
    public void testConditionCH1VowelBefore() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("AACH", "K"));
    }

    @Test
    public void testConditionL0() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("ILLO", "L"));
    }

    @Test
    public void testConditionL0Alasos() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("ALLE", "L"));
    }

    @Test
    public void testConditionM0() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("MM", "M"));
    }

    @Test
    public void testConditionM0UMB() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("UMB", "M"));
    }

    @Test
    public void testConditionM0UMBER() {
        assertTrue(doubleMetaphone.isDoubleMetaphoneEqual("UMBER", "M"));
    }

    @Test
    public void testHandleCCAcci() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("ACCIA"));
    }

    @Test
    public void testHandleCCUccee() {
        assertEquals("KS", doubleMetaphone.doubleMetaphone("UCCEE"));
    }

    @Test
    public void testHandleCCDefault() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("ACCAT"));
    }

    @Test
    public void testHandleCHChae() {
        assertEquals("KX", doubleMetaphone.doubleMetaphone("CHAEF"));
    }

    @Test
    public void testHandleCHMc() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("MCH"));
    }

    @Test
    public void testHandleCHInitial() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("CH"));
    }

    @Test
    public void testHandleGHInitialI() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("GHI"));
    }

    @Test
    public void testHandleGHInitialOther() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("GHA"));
    }

    @Test
    public void testHandleHInitial() {
        assertEquals("", doubleMetaphone.doubleMetaphone("HA"));
    }

    @Test
    public void testHandleJNotJose() {
        assertEquals("J ", doubleMetaphone.doubleMetaphone("J"));
    }

    @Test
    public void testHandleJVowelBeforeNotSlavo() {
        assertEquals("JH", doubleMetaphone.doubleMetaphone("AJA"));
    }

    @Test
    public void testHandleJFinalEmpty() {
        assertEquals("J ", doubleMetaphone.doubleMetaphone("J"));
    }

    @Test
    public void testHandleJJ() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("JJ"));
    }

    @Test
    public void testHandleLNoDouble() {
        assertEquals("L", doubleMetaphone.doubleMetaphone("LA"));
    }

    @Test
    public void testHandleSCSH() {
        assertEquals("X", doubleMetaphone.doubleMetaphone("SCH"));
    }

    @Test
    public void testHandleSCSHER() {
        assertEquals("XSK", doubleMetaphone.doubleMetaphone("SCHER"));
    }

    @Test
    public void testHandleSCIEY() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SCIE"));
    }

    @Test
    public void testHandleSDefault() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SA"));
    }

    @Test
    public void testHandleSWitSZ() {
        assertEquals("SX", doubleMetaphone.doubleMetaphone("SZ"));
    }

    @Test
    public void testHandleSWithAIEnd() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("SAI"));
    }

    @Test
    public void testHandleTWithOutTH() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("TA"));
    }

    @Test
    public void testHandleTWithDT() {
        assertEquals("T", doubleMetaphone.doubleMetaphone("TDT"));
    }

    @Test
    public void testHandleXNotInitial() {
        assertEquals("KS", doubleMetaphone.doubleMetaphone("AX"));
    }

    @Test
    public void testHandleXWithC() {
        assertEquals("K", doubleMetaphone.doubleMetaphone("XC"));
    }

    @Test
    public void testHandleXWithIAU() {
        assertEquals("", doubleMetaphone.doubleMetaphone("IAU"));
    }

    @Test
    public void testHandleZWithH() {
        assertEquals("J", doubleMetaphone.doubleMetaphone("ZH"));
    }

    @Test
    public void testHandleZWithZO() {
        assertEquals("STS", doubleMetaphone.doubleMetaphone("ZO"));
    }

    @Test
    public void testHandleZWithSlavo() {
        assertEquals("STS", doubleMetaphone.doubleMetaphone("AZO", true));
    }

    @Test
    public void testHandleZDefault() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("ZA"));
    }

    @Test
    public void testHandleZWithZZ() {
        assertEquals("S", doubleMetaphone.doubleMetaphone("ZZ"));
    }

    @Test
    public void testHandleWInitialVowel() {
        assertEquals("AF", doubleMetaphone.doubleMetaphone("WOMAN"));
    }

    @Test
    public void testHandleWFinal() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("AW"));
    }

    @Test
    public void testHandleWWithSCH() {
        assertEquals("F", doubleMetaphone.doubleMetaphone("SCHAW"));
    }

    @Test
    public void testHandleWWithWicz() {
        assertEquals("TSFX", doubleMetaphone.doubleMetaphone("WICZ"));
    }
}