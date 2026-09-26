package org.apache.commons.codec.language;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

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
    }

    @Test
    public void testEmptyInput() {
        assertNull(dp.doubleMetaphone(""));
        assertNull(dp.doubleMetaphone("   "));
    }

    @Test
    public void testSingleVowel() {
        assertEquals("A", dp.doubleMetaphone("A"));
        assertEquals("A", dp.doubleMetaphone("a"));
    }

    @Test
    public void testSilentStart() {
        assertEquals("N", dp.doubleMetaphone("KN"));
        assertEquals("N", dp.doubleMetaphone("GNOME"));
        assertEquals("N", dp.doubleMetaphone("PN"));
        assertEquals("R", dp.doubleMetaphone("WR"));
        assertEquals("S", dp.doubleMetaphone("PS"));
    }

    @Test
    public void testSimpleConsonant() {
        assertEquals("P", dp.doubleMetaphone("P"));
        assertEquals("T", dp.doubleMetaphone("T"));
        assertEquals("K", dp.doubleMetaphone("K"));
        assertEquals("S", dp.doubleMetaphone("S"));
        assertEquals("F", dp.doubleMetaphone("F"));
        assertEquals("M", dp.doubleMetaphone("M"));
        assertEquals("N", dp.doubleMetaphone("N"));
        assertEquals("L", dp.doubleMetaphone("L"));
        assertEquals("R", dp.doubleMetaphone("R"));
    }

    @Test
    public void testDoubleConsonant() {
        assertEquals("P", dp.doubleMetaphone("PP"));
        assertEquals("T", dp.doubleMetaphone("TT"));
        assertEquals("K", dp.doubleMetaphone("KK"));
        assertEquals("S", dp.doubleMetaphone("SS"));
        assertEquals("F", dp.doubleMetaphone("FF"));
        assertEquals("M", dp.doubleMetaphone("MM"));
        assertEquals("N", dp.doubleMetaphone("NN"));
        assertEquals("L", dp.doubleMetaphone("LL"));
        assertEquals("R", dp.doubleMetaphone("RR"));
    }

    @Test
    public void testCCases() {
        assertEquals("K", dp.doubleMetaphone("C"));
        assertEquals("S", dp.doubleMetaphone("CI"));
        assertEquals("S", dp.doubleMetaphone("CE"));
        assertEquals("S", dp.doubleMetaphone("CY"));
        assertEquals("K", dp.doubleMetaphone("CK"));
        assertEquals("K", dp.doubleMetaphone("CG"));
        assertEquals("K", dp.doubleMetaphone("CQ"));
        assertEquals("X", dp.doubleMetaphone("CIA"));
    }

    @Test
    public void testCHCases() {
        assertEquals("K", dp.doubleMetaphone("CH"));
        assertEquals("X", dp.doubleMetaphone("CH"));
    }

    @Test
    public void testDCases() {
        assertEquals("T", dp.doubleMetaphone("D"));
        assertEquals("J", dp.doubleMetaphone("DG"));
        assertEquals("J", dp.doubleMetaphone("DGE"));
        assertEquals("T", dp.doubleMetaphone("DT"));
        assertEquals("T", dp.doubleMetaphone("DD"));
    }

    @Test
    public void testGCases() {
        assertEquals("K", dp.doubleMetaphone("G"));
        assertEquals("J", dp.doubleMetaphone("GE"));
        assertEquals("J", dp.doubleMetaphone("GI"));
        assertEquals("J", dp.doubleMetaphone("GY"));
    }

    @Test
    public void testHCases() {
        assertEquals("H", dp.doubleMetaphone("HH"));
        assertEquals("", dp.doubleMetaphone("H"));
    }

    @Test
    public void testJCases() {
        assertEquals("J", dp.doubleMetaphone("J"));
        assertEquals("A", dp.doubleMetaphone("JA"));
    }

    @Test
    public void testLCases() {
        assertEquals("L", dp.doubleMetaphone("L"));
        assertEquals("L", dp.doubleMetaphone("LL"));
    }

    @Test
    public void testPCases() {
        assertEquals("P", dp.doubleMetaphone("P"));
        assertEquals("F", dp.doubleMetaphone("PH"));
    }

    @Test
    public void testQCases() {
        assertEquals("K", dp.doubleMetaphone("Q"));
        assertEquals("K", dp.doubleMetaphone("QQ"));
    }

    @Test
    public void testRCases() {
        assertEquals("R", dp.doubleMetaphone("R"));
        assertEquals("R", dp.doubleMetaphone("RR"));
    }

    @Test
    public void testSCases() {
        assertEquals("S", dp.doubleMetaphone("S"));
        assertEquals("X", dp.doubleMetaphone("SH"));
        assertEquals("S", dp.doubleMetaphone("SC"));
    }

    @Test
    public void testTCases() {
        assertEquals("T", dp.doubleMetaphone("T"));
        assertEquals("0", dp.doubleMetaphone("TH"));
        assertEquals("X", dp.doubleMetaphone("TION"));
        assertEquals("X", dp.doubleMetaphone("TIA"));
        assertEquals("X", dp.doubleMetaphone("TCH"));
    }

    @Test
    public void testVCases() {
        assertEquals("F", dp.doubleMetaphone("V"));
        assertEquals("F", dp.doubleMetaphone("VV"));
    }

    @Test
    public void testWCases() {
        assertEquals("R", dp.doubleMetaphone("WR"));
        assertEquals("A", dp.doubleMetaphone("WH"));
        assertEquals("", dp.doubleMetaphone("W"));
    }

    @Test
    public void testXCases() {
        assertEquals("S", dp.doubleMetaphone("X"));
        assertEquals("KS", dp.doubleMetaphone("AX"));
        assertEquals("S", dp.doubleMetaphone("X"));
    }

    @Test
    public void testZCases() {
        assertEquals("S", dp.doubleMetaphone("Z"));
        assertEquals("J", dp.doubleMetaphone("ZH"));
    }

    @Test
    public void testAlternateEncoding() {
        assertEquals("A", dp.doubleMetaphone("A", false));
        assertEquals("A", dp.doubleMetaphone("A", true));
    }

    @Test
    public void testEncodeObject() throws Exception {
        assertEquals("A", dp.encode((Object) "A"));
        assertEquals("N", dp.encode((Object) "KN"));
    }

    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeObjectNonString() throws Exception {
        dp.encode((Object) Integer.valueOf(123));
    }

    @Test
    public void testEncodeString() {
        assertEquals("A", dp.encode("A"));
        assertEquals("N", dp.encode("KN"));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(dp.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertFalse(dp.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testIsDoubleMetaphoneEqualAlternate() {
        assertTrue(dp.isDoubleMetaphoneEqual("Smith", "Smyth", false));
        assertTrue(dp.isDoubleMetaphoneEqual("Smith", "Smyth", true));
    }

    @Test
    public void testGetMaxCodeLen() {
        assertEquals(4, dp.getMaxCodeLen());
    }

    @Test
    public void testSetMaxCodeLen() {
        dp.setMaxCodeLen(8);
        assertEquals(8, dp.getMaxCodeLen());
        assertEquals("ANST", dp.doubleMetaphone("Andrew"));
    }

    @Test
    public void testSlavoGermanicDetection() {
        assertTrue(dp.isDoubleMetaphoneEqual("W", "W"));
    }

    @Test
    public void testHandleAEIOUYAtStart() {
        assertEquals("A", dp.doubleMetaphone("A"));
        assertEquals("A", dp.doubleMetaphone("E"));
        assertEquals("A", dp.doubleMetaphone("I"));
        assertEquals("A", dp.doubleMetaphone("O"));
        assertEquals("A", dp.doubleMetaphone("U"));
        assertEquals("A", dp.doubleMetaphone("Y"));
    }

    @Test
    public void testHandleCedilla() {
        assertEquals("S", dp.doubleMetaphone("\u00C7"));
    }

    @Test
    public void testHandleNWithTilde() {
        assertEquals("N", dp.doubleMetaphone("\u00D1"));
    }

    @Test
    public void testHandleBWithDoubleB() {
        assertEquals("P", dp.doubleMetaphone("BB"));
    }

    @Test
    public void testHandleFWithDoubleF() {
        assertEquals("F", dp.doubleMetaphone("FF"));
    }

    @Test
    public void testHandleKWithDoubleK() {
        assertEquals("K", dp.doubleMetaphone("KK"));
    }

    @Test
    public void testHandleNWithDoubleN() {
        assertEquals("N", dp.doubleMetaphone("NN"));
    }

    @Test
    public void testHandlePWithDoubleP() {
        assertEquals("P", dp.doubleMetaphone("PP"));
    }

    @Test
    public void testHandleQWithDoubleQ() {
        assertEquals("K", dp.doubleMetaphone("QQ"));
    }

    @Test
    public void testHandleVWithDoubleV() {
        assertEquals("F", dp.doubleMetaphone("VV"));
    }

    @Test
    public void testHandleXWithDoubleX() {
        assertEquals("KS", dp.doubleMetaphone("XX"));
    }

    @Test
    public void testHandleZWithDoubleZ() {
        assertEquals("S", dp.doubleMetaphone("ZZ"));
    }

    @Test
    public void testHandleMWithConditionM0() {
        assertEquals("M", dp.doubleMetaphone("M"));
        assertEquals("M", dp.doubleMetaphone("MM"));
    }

    @Test
    public void testConditionC0() {
        assertEquals("K", dp.doubleMetaphone("CHIA"));
        assertEquals("K", dp.doubleMetaphone("BACHER"));
        assertEquals("K", dp.doubleMetaphone("MACHER"));
    }

    @Test
    public void testConditionCH0() {
        assertEquals("K", dp.doubleMetaphone("HARAC"));
        assertEquals("K", dp.doubleMetaphone("HARIS"));
        assertEquals("K", dp.doubleMetaphone("HOR"));
        assertEquals("K", dp.doubleMetaphone("HYM"));
        assertEquals("K", dp.doubleMetaphone("HIA"));
        assertEquals("K", dp.doubleMetaphone("HEM"));
    }

    @Test
    public void testConditionCH1() {
        assertEquals("K", dp.doubleMetaphone("VAN CH"));
        assertEquals("K", dp.doubleMetaphone("VON CH"));
        assertEquals("K", dp.doubleMetaphone("SCH CH"));
        assertEquals("K", dp.doubleMetaphone("ORCHES"));
        assertEquals("K", dp.doubleMetaphone("ARCHIT"));
        assertEquals("K", dp.doubleMetaphone("ORCHID"));
    }

    @Test
    public void testConditionL0() {
        assertEquals("L", dp.doubleMetaphone("ILLO"));
        assertEquals("L", dp.doubleMetaphone("ILLA"));
        assertEquals("L", dp.doubleMetaphone("ALLE"));
    }

    @Test
    public void testConditionM0() {
        assertEquals("M", dp.doubleMetaphone("UMB"));
        assertEquals("M", dp.doubleMetaphone("UMBER"));
    }

    @Test
    public void testDoubleMetaphoneResult() {
        DoubleMetaphone.DoubleMetaphoneResult result = dp.new DoubleMetaphoneResult(4);
        assertTrue(result.isComplete() == false);
        result.appendPrimary('A');
        result.appendAlternate('B');
        assertEquals("A", result.getPrimary());
        assertEquals("B", result.getAlternate());
        result.append("CD");
        assertEquals("ACD", result.getPrimary());
        assertEquals("BCD", result.getAlternate());
    }

    @Test
    public void testDoubleMetaphoneResultOverflow() {
        DoubleMetaphone.DoubleMetaphoneResult result = dp.new DoubleMetaphoneResult(2);
        result.appendPrimary("ABCD");
        assertEquals("AB", result.getPrimary());
        result.appendAlternate("EFGH");
        assertEquals("EF", result.getAlternate());
    }

    @Test
    public void testHandleCEWithCAESAR() {
        assertEquals("S", dp.doubleMetaphone("CAESAR"));
    }

    @Test
    public void testHandleCZWithoutWICZ() {
        assertEquals("SX", dp.doubleMetaphone("CZ"));
    }

    @Test
    public void testHandleCZWithWICZ() {
        assertEquals("K", dp.doubleMetaphone("WICZ"));
    }

    @Test
    public void testHandleCCWithIEH() {
        assertEquals("X", dp.doubleMetaphone("CC"));
    }

    @Test
    public void testHandleCCWithA() {
        assertEquals("KS", dp.doubleMetaphone("ACC"));
    }

    @Test
    public void testHandleDGWithVowel() {
        assertEquals("J", dp.doubleMetaphone("DGI"));
        assertEquals("J", dp.doubleMetaphone("DGE"));
        assertEquals("J", dp.doubleMetaphone("DGY"));
    }

    @Test
    public void testHandleGNWithVowel() {
        assertEquals("N", dp.doubleMetaphone("GN"));
        assertEquals("KN", dp.doubleMetaphone("AGN"));
    }

    @Test
    public void testHandleGLI() {
        assertEquals("KL", dp.doubleMetaphone("GLI"));
    }

    @Test
    public void testHandleGYAtStart() {
        assertEquals("KJ", dp.doubleMetaphone("GY"));
    }

    @Test
    public void testHandleGER() {
        assertEquals("KJ", dp.doubleMetaphone("GER"));
    }

    @Test
    public void testHandleGG() {
        assertEquals("K", dp.doubleMetaphone("GG"));
    }

    @Test
    public void testHandleGHWithPrecedingConsonant() {
        assertEquals("K", dp.doubleMetaphone("AGH"));
    }

    @Test
    public void testHandleGHAtStart() {
        assertEquals("J", dp.doubleMetaphone("GHI"));
        assertEquals("K", dp.doubleMetaphone("GHA"));
    }

    @Test
    public void testHandleGHWithPrecedingBHD() {
        assertEquals("", dp.doubleMetaphone("ABGH"));
    }

    @Test
    public void testHandleGHWithUAndPrecedingCGLRT() {
        assertEquals("F", dp.doubleMetaphone("CUGH"));
        assertEquals("F", dp.doubleMetaphone("GUGH"));
        assertEquals("F", dp.doubleMetaphone("LUGH"));
        assertEquals("F", dp.doubleMetaphone("RUGH"));
        assertEquals("F", dp.doubleMetaphone("TUGH"));
    }

    @Test
    public void testHandleGHWithNonI() {
        assertEquals("K", dp.doubleMetaphone("AGHA"));
    }

    @Test
    public void testHandleHWithVowelContext() {
        assertEquals("H", dp.doubleMetaphone("AHA"));
    }

    @Test
    public void testHandleJOSE() {
        assertEquals("HS", dp.doubleMetaphone("JOSE"));
    }

    @Test
    public void testHandleSAN() {
        assertEquals("SN", dp.doubleMetaphone("SAN JOSE"));
    }

    @Test
    public void testHandleJWithVowelBefore() {
        assertEquals("JH", dp.doubleMetaphone("AJA"));
        assertEquals("JH", dp.doubleMetaphone("AJO"));
    }

    @Test
    public void testHandleJAtEnd() {
        assertEquals("J ", dp.doubleMetaphone("AJ"));
    }

    @Test
    public void testHandleJWithSpecialContext() {
        assertEquals("J", dp.doubleMetaphone("UJA"));
    }

    @Test
    public void testHandleLWithLLAndCondition() {
        assertEquals("L", dp.doubleMetaphone("ILLO"));
        assertEquals("LL", dp.doubleMetaphone("ILLA"));
        assertEquals("L", dp.doubleMetaphone("ALLE"));
    }

    @Test
    public void testHandlePWithPH() {
        assertEquals("F", dp.doubleMetaphone("PH"));
    }

    @Test
    public void testHandlePWithPB() {
        assertEquals("P", dp.doubleMetaphone("PB"));
    }

    @Test
    public void testHandleRWithIER() {
        assertEquals("R", dp.doubleMetaphone("IER"));
    }

    @Test
    public void testHandleRAtEndWithIEBefore() {
        assertEquals("R", dp.doubleMetaphone("RIE"));
    }

    @Test
    public void testHandleSWithISL() {
        assertEquals("S", dp.doubleMetaphone("ISL"));
    }

    @Test
    public void testHandleSUGAR() {
        assertEquals("XS", dp.doubleMetaphone("SUGAR"));
    }

    @Test
    public void testHandleSHWithSpecial() {
        assertEquals("S", dp.doubleMetaphone("SHEIM"));
        assertEquals("S", dp.doubleMetaphone("SHOEK"));
        assertEquals("S", dp.doubleMetaphone("SHOLM"));
        assertEquals("S", dp.doubleMetaphone("SHOLZ"));
    }

    @Test
    public void testHandleSIO() {
        assertEquals("S", dp.doubleMetaphone("SIO"));
    }

    @Test
    public void testHandleSWithMNW() {
        assertEquals("SX", dp.doubleMetaphone("SM"));
        assertEquals("SX", dp.doubleMetaphone("SN"));
        assertEquals("SX", dp.doubleMetaphone("SL"));
        assertEquals("SX", dp.doubleMetaphone("SW"));
    }

    @Test
    public void testHandleSWithZ() {
        assertEquals("SX", dp.doubleMetaphone("SZ"));
    }

    @Test
    public void testHandleSCWithH() {
        assertEquals("X", dp.doubleMetaphone("SCH"));
    }

    @Test
    public void testHandleSCWithVowel() {
        assertEquals("S", dp.doubleMetaphone("SCI"));
        assertEquals("S", dp.doubleMetaphone("SCE"));
        assertEquals("S", dp.doubleMetaphone("SCY"));
    }

    @Test
    public void testHandleSCElse() {
        assertEquals("SK", dp.doubleMetaphone("SCA"));
    }

    @Test
    public void testHandleTWithTH() {
        assertEquals("0", dp.doubleMetaphone("TH"));
    }

    @Test
    public void testHandleTWithTHOM() {
        assertEquals("T", dp.doubleMetaphone("THOM"));
    }

    @Test
    public void testHandleTWithTHAM() {
        assertEquals("T", dp.doubleMetaphone("THAM"));
    }

    @Test
    public void testHandleTWithVAN() {
        assertEquals("T", dp.doubleMetaphone("VAN TH"));
    }

    @Test
    public void testHandleTWithVON() {
        assertEquals("T", dp.doubleMetaphone("VON TH"));
    }

    @Test
    public void testHandleTWithSCH() {
        assertEquals("T", dp.doubleMetaphone("SCH TH"));
    }

    @Test
    public void testHandleTD() {
        assertEquals("T", dp.doubleMetaphone("TD"));
    }

    @Test
    public void testHandleWWithWR() {
        assertEquals("R", dp.doubleMetaphone("WR"));
    }

    @Test
    public void testHandleWWithVowelAfter() {
        assertEquals("AF", dp.doubleMetaphone("WA"));
    }

    @Test
    public void testHandleWWithWH() {
        assertEquals("A", dp.doubleMetaphone("WH"));
    }

    @Test
    public void testHandleWAtEnd() {
        assertEquals("F", dp.doubleMetaphone("EW"));
    }

    @Test
    public void testHandleWWithEWSKI() {
        assertEquals("F", dp.doubleMetaphone("EWSKI"));
    }

    @Test
    public void testHandleWWithOWSKI() {
        assertEquals("F", dp.doubleMetaphone("OWSKI"));
    }

    @Test
    public void testHandleWWithSCH() {
        assertEquals("F", dp.doubleMetaphone("SCHW"));
    }

    @Test
    public void testHandleWWithWICZ() {
        assertEquals("TSFX", dp.doubleMetaphone("WICZ"));
    }

    @Test
    public void testHandleXAtStart() {
        assertEquals("S", dp.doubleMetaphone("X"));
    }

    @Test
    public void testHandleXWithIAU() {
        assertEquals("KS", dp.doubleMetaphone("XIAU"));
    }

    @Test
    public void testHandleXWithEAU() {
        assertEquals("KS", dp.doubleMetaphone("XEAU"));
    }

    @Test
    public void testHandleXWithAU() {
        assertEquals("KS", dp.doubleMetaphone("XAU"));
    }

    @Test
    public void testHandleXWithOU() {
        assertEquals("KS", dp.doubleMetaphone("XOU"));
    }

    @Test
    public void testHandleXC() {
        assertEquals("KS", dp.doubleMetaphone("XX"));
    }

    @Test
    public void testHandleZWithZH() {
        assertEquals("J", dp.doubleMetaphone("ZH"));
    }

    @Test
    public void testHandleZWithZO() {
        assertEquals("STS", dp.doubleMetaphone("ZO"));
    }

    @Test
    public void testHandleZWithZI() {
        assertEquals("STS", dp.doubleMetaphone("ZI"));
    }

    @Test
    public void testHandleZWithZA() {
        assertEquals("STS", dp.doubleMetaphone("ZA"));
    }

    @Test
    public void testHandleZWithSlavoGermanic() {
        assertEquals("STS", dp.doubleMetaphone("WZ"));
    }

    @Test
    public void testDefaultCase() {
        assertEquals("", dp.doubleMetaphone(" "));
    }

    @Test
    public void testIsVowel() {
        assertTrue(dp.isVowel('A'));
        assertTrue(dp.isVowel('E'));
        assertTrue(dp.isVowel('I'));
        assertTrue(dp.isVowel('O'));
        assertTrue(dp.isVowel('U'));
        assertTrue(dp.isVowel('Y'));
        assertFalse(dp.isVowel('B'));
    }

    @Test
    public void testIsSlavoGermanic() {
        assertFalse(dp.isSlavoGermanic("ABC"));
        assertTrue(dp.isSlavoGermanic("W"));
        assertTrue(dp.isSlavoGermanic("K"));
        assertTrue(dp.isSlavoGermanic("CZ"));
        assertTrue(dp.isSlavoGermanic("WITZ"));
    }

    @Test
    public void testSilentStartDetection() {
        assertTrue(dp.isSilentStart("GNOME"));
        assertTrue(dp.isSilentStart("KNIFE"));
        assertTrue(dp.isSilentStart("PN"));
        assertTrue(dp.isSilentStart("WRONG"));
        assertTrue(dp.isSilentStart("PSYCH"));
        assertFalse(dp.isSilentStart("HELLO"));
    }

    @Test
    public void testCleanInput() {
        assertNull(dp.cleanInput(null));
        assertNull(dp.cleanInput("   "));
        assertEquals("A", dp.cleanInput(" a "));
    }

    @Test
    public void testCharAt() {
        assertEquals('A', dp.charAt("ABC", 0));
        assertEquals(Character.MIN_VALUE, dp.charAt("ABC", -1));
        assertEquals(Character.MIN_VALUE, dp.charAt("ABC", 10));
    }

    @Test
    public void testContains() {
        assertTrue(DoubleMetaphone.contains("ABCD", 0, 2, "AB"));
        assertTrue(DoubleMetaphone.contains("ABCD", 0, 1, "A", "B"));
        assertFalse(DoubleMetaphone.contains("ABCD", 0, 2, "BC"));
        assertFalse(DoubleMetaphone.contains("ABCD", -1, 2, "AB"));
        assertFalse(DoubleMetaphone.contains("ABCD", 0, 5, "ABCD"));
    }

    @Test
    public void testKnownWords() {
        assertEquals("SM0", dp.doubleMetaphone("Smith"));
        assertEquals("SN", dp.doubleMetaphone("Snow"));
        assertEquals("ALPR", dp.doubleMetaphone("Alpher"));
        assertEquals("PRKN", dp.doubleMetaphone("Parkin"));
        assertEquals("PRK", dp.doubleMetaphone("Park"));
        assertEquals("PRS", dp.doubleMetaphone("Price"));
        assertEquals("ANTR", dp.doubleMetaphone("Andrew"));
    }
}