package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean34 = characterReader30.rangeEquals((int) (byte) 100, (int) (short) 100, "i");
        java.lang.String str36 = characterReader30.consumeTo('4');
        int int37 = characterReader30.pos();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean43 = characterReader39.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray50 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str51 = characterReader45.consumeToAnySorted(charArray50);
        char[] charArray52 = new char[] {};
        java.lang.String str53 = characterReader45.consumeToAnySorted(charArray52);
        boolean boolean54 = characterReader39.matchesAnySorted(charArray52);
        boolean boolean55 = characterReader30.matchesAnySorted(charArray52);
        boolean boolean56 = characterReader1.matchesAnySorted(charArray52);
        char char57 = characterReader1.current();
        boolean boolean58 = characterReader1.matchesDigit();
        boolean boolean62 = characterReader1.rangeEquals((-1), (int) (short) -1, "hi!");
        int int64 = characterReader1.nextIndexOf(' ');
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + 'i' + "'", char57 == 'i');
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        java.lang.String str7 = characterReader1.consumeTo("!");
        java.lang.String str8 = characterReader1.consumeTagName();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i" + "'", str7, "i");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches('\uffff');
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        char char5 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        int int9 = characterReader7.nextIndexOf((java.lang.CharSequence) "hi");
        char char10 = characterReader7.current();
        boolean boolean12 = characterReader7.matchesIgnoreCase("hi");
        boolean boolean13 = characterReader7.isEmpty();
        boolean boolean17 = characterReader7.rangeEquals((int) '4', (int) '#', "!");
        java.lang.String str19 = characterReader7.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader21.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean46 = characterReader42.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray53 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        char[] charArray55 = new char[] {};
        java.lang.String str56 = characterReader48.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader42.matchesAnySorted(charArray55);
        boolean boolean59 = characterReader42.matchConsumeIgnoreCase("");
        java.lang.String str60 = characterReader42.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray67 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str68 = characterReader62.consumeToAnySorted(charArray67);
        boolean boolean69 = characterReader42.matchesAnySorted(charArray67);
        java.lang.String str70 = characterReader21.consumeToAnySorted(charArray67);
        java.lang.String str71 = characterReader7.consumeToAny(charArray67);
        boolean boolean72 = characterReader1.matchesAny(charArray67);
        boolean boolean74 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean76 = characterReader1.matches('#');
        org.jsoup.parser.CharacterReader characterReader78 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray83 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str84 = characterReader78.consumeToAnySorted(charArray83);
        char[] charArray85 = new char[] {};
        java.lang.String str86 = characterReader78.consumeToAnySorted(charArray85);
        java.lang.String str87 = characterReader78.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader89 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray94 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str95 = characterReader89.consumeToAnySorted(charArray94);
        java.lang.String str96 = characterReader78.consumeToAny(charArray94);
        boolean boolean97 = characterReader1.matchesAny(charArray94);
        int int98 = characterReader1.pos();
        java.lang.Class<?> wildcardClass99 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'h' + "'", char10 == 'h');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] {});
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(charArray94);
        org.junit.Assert.assertArrayEquals(charArray94, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 3 + "'", int98 == 3);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        java.lang.String str20 = characterReader1.consumeTagName();
        char char21 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        boolean boolean3 = characterReader1.matches("");
        boolean boolean5 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray14 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        char[] charArray16 = new char[] {};
        java.lang.String str17 = characterReader9.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader9.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray25 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str26 = characterReader20.consumeToAnySorted(charArray25);
        java.lang.String str27 = characterReader9.consumeToAny(charArray25);
        boolean boolean28 = characterReader9.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean34 = characterReader30.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray41 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str42 = characterReader36.consumeToAnySorted(charArray41);
        char[] charArray43 = new char[] {};
        java.lang.String str44 = characterReader36.consumeToAnySorted(charArray43);
        boolean boolean45 = characterReader30.matchesAnySorted(charArray43);
        boolean boolean47 = characterReader30.matchConsumeIgnoreCase("");
        java.lang.String str48 = characterReader30.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray55 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str56 = characterReader50.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader30.matchesAnySorted(charArray55);
        java.lang.String str58 = characterReader9.consumeToAnySorted(charArray55);
        java.lang.String str59 = characterReader9.consumeDigitSequence();
        java.lang.String str60 = characterReader9.consumeHexSequence();
        java.lang.String str61 = characterReader9.consumeTagName();
        characterReader9.advance();
        characterReader9.mark();
        char[] charArray64 = new char[] {};
        java.lang.String str65 = characterReader9.consumeToAnySorted(charArray64);
        java.lang.String str66 = characterReader1.consumeToAnySorted(charArray64);
        int int68 = characterReader1.nextIndexOf('h');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "h" + "'", str48, "h");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi" + "'", str66, "hi");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        java.lang.String str3 = characterReader1.consumeAsString();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        characterReader1.rewindToMark();
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean13 = characterReader9.rangeEquals(10, 0, "");
        java.lang.String str14 = characterReader9.consumeData();
        java.lang.String str15 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        java.lang.String str24 = characterReader9.consumeToAnySorted(charArray22);
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader26.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray42 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str43 = characterReader37.consumeToAnySorted(charArray42);
        java.lang.String str44 = characterReader26.consumeToAny(charArray42);
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray51 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str52 = characterReader46.consumeToAnySorted(charArray51);
        char[] charArray53 = new char[] {};
        java.lang.String str54 = characterReader46.consumeToAnySorted(charArray53);
        java.lang.String str55 = characterReader46.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        java.lang.String str64 = characterReader46.consumeToAny(charArray62);
        boolean boolean65 = characterReader26.matchesAny(charArray62);
        boolean boolean66 = characterReader9.matchesAnySorted(charArray62);
        java.lang.String str67 = characterReader1.consumeToAnySorted(charArray62);
        java.lang.String str68 = characterReader1.consumeToEnd();
        characterReader1.unconsume();
        java.lang.String str70 = characterReader1.consumeHexSequence();
        int int72 = characterReader1.nextIndexOf(' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'i' + "'", char7 == 'i');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "i!" + "'", str67, "i!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        int int51 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        char char52 = characterReader1.consume();
        boolean boolean53 = characterReader1.isEmpty();
        java.lang.String str54 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\uffff' + "'", char52 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray27 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        char[] charArray29 = new char[] {};
        java.lang.String str30 = characterReader22.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray38 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str39 = characterReader33.consumeToAnySorted(charArray38);
        java.lang.String str40 = characterReader22.consumeToAny(charArray38);
        boolean boolean41 = characterReader22.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader43.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray68 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str69 = characterReader63.consumeToAnySorted(charArray68);
        boolean boolean70 = characterReader43.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader22.consumeToAnySorted(charArray68);
        boolean boolean72 = characterReader1.matchesAny(charArray68);
        characterReader1.mark();
        java.lang.String str74 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str75 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "i" + "'", str74, "i");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str32 = characterReader1.consumeTo('\uffff');
        java.lang.String str33 = characterReader1.consumeData();
        boolean boolean35 = characterReader1.matchesIgnoreCase("h");
        boolean boolean39 = characterReader1.rangeEquals((int) (short) 1, (-1), "i!");
        boolean boolean43 = characterReader1.rangeEquals(1, (int) (short) 0, "!");
        java.lang.String str44 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        boolean boolean47 = characterReader1.matches("i!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "i!" + "'", str32, "i!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        java.lang.String str19 = characterReader1.consumeData();
        char char20 = characterReader1.consume();
        boolean boolean22 = characterReader1.matches("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 4, count 0, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        char[] charArray24 = new char[] {};
        java.lang.String str25 = characterReader17.consumeToAnySorted(charArray24);
        java.lang.String str26 = characterReader17.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader17.consumeToAny(charArray33);
        boolean boolean36 = characterReader1.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader1.isEmpty();
        boolean boolean39 = characterReader1.matches('\uffff');
        java.lang.String str40 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader1.isEmpty();
        java.lang.String str10 = characterReader1.consumeTagName();
        java.lang.String str11 = characterReader1.consumeData();
        java.lang.String str12 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!" + "'", str10, "!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader22.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        char[] charArray35 = new char[] {};
        java.lang.String str36 = characterReader28.consumeToAnySorted(charArray35);
        boolean boolean37 = characterReader22.matchesAnySorted(charArray35);
        boolean boolean39 = characterReader22.matchConsumeIgnoreCase("");
        java.lang.String str40 = characterReader22.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray47 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str48 = characterReader42.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader22.matchesAnySorted(charArray47);
        java.lang.String str50 = characterReader1.consumeToAnySorted(charArray47);
        java.lang.String str51 = characterReader1.consumeDigitSequence();
        java.lang.String str52 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        java.lang.String str54 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "h" + "'", str40, "h");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        boolean boolean51 = characterReader1.matchConsumeIgnoreCase("i");
        boolean boolean52 = characterReader1.matchesLetter();
        int int54 = characterReader1.nextIndexOf(' ');
        java.lang.String str55 = characterReader1.consumeData();
        char char56 = characterReader1.consume();
        boolean boolean58 = characterReader1.matches("hi");
        boolean boolean59 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        java.lang.String str19 = characterReader1.consumeToEnd();
        int int21 = characterReader1.nextIndexOf('#');
        characterReader1.unconsume();
        boolean boolean24 = characterReader1.matches("i!");
        java.lang.String str25 = characterReader1.consumeTagName();
        java.lang.String str26 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!" + "'", str25, "!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches('\uffff');
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        char char5 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        int int9 = characterReader7.nextIndexOf((java.lang.CharSequence) "hi");
        char char10 = characterReader7.current();
        boolean boolean12 = characterReader7.matchesIgnoreCase("hi");
        boolean boolean13 = characterReader7.isEmpty();
        boolean boolean17 = characterReader7.rangeEquals((int) '4', (int) '#', "!");
        java.lang.String str19 = characterReader7.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader21.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean46 = characterReader42.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray53 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        char[] charArray55 = new char[] {};
        java.lang.String str56 = characterReader48.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader42.matchesAnySorted(charArray55);
        boolean boolean59 = characterReader42.matchConsumeIgnoreCase("");
        java.lang.String str60 = characterReader42.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray67 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str68 = characterReader62.consumeToAnySorted(charArray67);
        boolean boolean69 = characterReader42.matchesAnySorted(charArray67);
        java.lang.String str70 = characterReader21.consumeToAnySorted(charArray67);
        java.lang.String str71 = characterReader7.consumeToAny(charArray67);
        boolean boolean72 = characterReader1.matchesAny(charArray67);
        boolean boolean73 = characterReader1.isEmpty();
        java.lang.String str75 = characterReader1.consumeTo('4');
        java.lang.String str76 = characterReader1.consumeDigitSequence();
        boolean boolean80 = characterReader1.rangeEquals((int) (short) -1, (int) ' ', "hi!");
        char char81 = characterReader1.consume();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'h' + "'", char10 == 'h');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + char81 + "' != '" + '\uffff' + "'", char81 == '\uffff');
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean55 = characterReader51.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        char[] charArray64 = new char[] {};
        java.lang.String str65 = characterReader57.consumeToAnySorted(charArray64);
        boolean boolean66 = characterReader51.matchesAnySorted(charArray64);
        java.lang.String str67 = characterReader1.consumeToAny(charArray64);
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean71 = characterReader1.matchConsume("hi");
        java.lang.String str72 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        java.lang.String str20 = characterReader1.consumeTo('h');
        boolean boolean22 = characterReader1.matches('i');
        java.lang.String str23 = characterReader1.toString();
        boolean boolean25 = characterReader1.containsIgnoreCase("!");
        boolean boolean26 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str8 = characterReader1.consumeTo('a');
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        int int12 = characterReader10.nextIndexOf((java.lang.CharSequence) "hi");
        char char13 = characterReader10.current();
        boolean boolean15 = characterReader10.matchesIgnoreCase("hi");
        boolean boolean16 = characterReader10.isEmpty();
        boolean boolean20 = characterReader10.rangeEquals((int) '4', (int) '#', "!");
        java.lang.String str22 = characterReader10.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        java.lang.String str33 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray40 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str41 = characterReader35.consumeToAnySorted(charArray40);
        java.lang.String str42 = characterReader24.consumeToAny(charArray40);
        boolean boolean43 = characterReader24.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean49 = characterReader45.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray56 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str57 = characterReader51.consumeToAnySorted(charArray56);
        char[] charArray58 = new char[] {};
        java.lang.String str59 = characterReader51.consumeToAnySorted(charArray58);
        boolean boolean60 = characterReader45.matchesAnySorted(charArray58);
        boolean boolean62 = characterReader45.matchConsumeIgnoreCase("");
        java.lang.String str63 = characterReader45.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray70 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str71 = characterReader65.consumeToAnySorted(charArray70);
        boolean boolean72 = characterReader45.matchesAnySorted(charArray70);
        java.lang.String str73 = characterReader24.consumeToAnySorted(charArray70);
        java.lang.String str74 = characterReader10.consumeToAny(charArray70);
        boolean boolean75 = characterReader1.matchesAny(charArray70);
        boolean boolean77 = characterReader1.matches("!");
        boolean boolean78 = characterReader1.matchesDigit();
        java.lang.String str79 = characterReader1.toString();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'h' + "'", char13 == 'h');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "h" + "'", str63, "h");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        char char21 = characterReader1.current();
        java.lang.String str22 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str7 = characterReader1.consumeHexSequence();
        char char8 = characterReader1.consume();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'h' + "'", char8 == 'h');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        int int20 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean22 = characterReader1.matches('#');
        boolean boolean26 = characterReader1.rangeEquals(4, (int) '#', "i");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean55 = characterReader51.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        char[] charArray64 = new char[] {};
        java.lang.String str65 = characterReader57.consumeToAnySorted(charArray64);
        boolean boolean66 = characterReader51.matchesAnySorted(charArray64);
        java.lang.String str67 = characterReader1.consumeToAny(charArray64);
        int int68 = characterReader1.pos();
        int int69 = characterReader1.pos();
        boolean boolean70 = characterReader1.matchesLetter();
        java.lang.String str71 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.toString();
        java.lang.String str8 = characterReader1.consumeToEnd();
        boolean boolean9 = characterReader1.matchesDigit();
        char char10 = characterReader1.current();
        java.lang.String str11 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = characterReader1.rangeEquals((int) '#', (int) (short) 1, "i");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        characterReader1.mark();
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        java.lang.String str23 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean27 = characterReader1.rangeEquals((int) (byte) 0, (int) (byte) 0, "h");
        boolean boolean29 = characterReader1.matchConsume("!");
        int int30 = characterReader1.pos();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean3 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean9 = characterReader1.rangeEquals((int) '!', 3, "");
        char char10 = characterReader1.current();
        char char11 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!" + "'", str5, "i!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        java.lang.String str21 = characterReader1.consumeToEnd();
        int int23 = characterReader1.nextIndexOf('h');
        characterReader1.advance();
        boolean boolean26 = characterReader1.matches("");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        int int51 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        int int53 = characterReader1.nextIndexOf('\uffff');
        int int55 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        java.lang.String str56 = characterReader1.consumeHexSequence();
        java.lang.String str57 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str22 = characterReader1.consumeTo('!');
        boolean boolean24 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean25 = characterReader1.matchesLetter();
        boolean boolean27 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        java.lang.String str20 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader22.rangeEquals(10, 0, "");
        java.lang.String str27 = characterReader22.consumeLetterSequence();
        int int28 = characterReader22.pos();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray35 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str36 = characterReader30.consumeToAnySorted(charArray35);
        char[] charArray37 = new char[] {};
        java.lang.String str38 = characterReader30.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader30.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray46 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str47 = characterReader41.consumeToAnySorted(charArray46);
        java.lang.String str48 = characterReader30.consumeToAny(charArray46);
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray55 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str56 = characterReader50.consumeToAnySorted(charArray55);
        char[] charArray57 = new char[] {};
        java.lang.String str58 = characterReader50.consumeToAnySorted(charArray57);
        java.lang.String str59 = characterReader50.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray66 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str67 = characterReader61.consumeToAnySorted(charArray66);
        java.lang.String str68 = characterReader50.consumeToAny(charArray66);
        boolean boolean69 = characterReader30.matchesAny(charArray66);
        java.lang.String str70 = characterReader22.consumeToAny(charArray66);
        java.lang.String str71 = characterReader1.consumeToAny(charArray66);
        boolean boolean72 = characterReader1.matchesLetter();
        int int74 = characterReader1.nextIndexOf('\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi" + "'", str27, "hi");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "!" + "'", str70, "!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "i!" + "'", str71, "i!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader22.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        char[] charArray35 = new char[] {};
        java.lang.String str36 = characterReader28.consumeToAnySorted(charArray35);
        boolean boolean37 = characterReader22.matchesAnySorted(charArray35);
        boolean boolean39 = characterReader22.matchConsumeIgnoreCase("");
        java.lang.String str40 = characterReader22.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray47 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str48 = characterReader42.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader22.matchesAnySorted(charArray47);
        java.lang.String str50 = characterReader1.consumeToAnySorted(charArray47);
        java.lang.String str51 = characterReader1.consumeDigitSequence();
        java.lang.String str53 = characterReader1.consumeTo('#');
        java.lang.String str54 = characterReader1.consumeTagName();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "h" + "'", str40, "h");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        characterReader1.mark();
        java.lang.String str20 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("!");
        boolean boolean8 = characterReader1.matches("");
        java.lang.String str9 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        characterReader1.unconsume();
        java.lang.String str21 = characterReader1.consumeTo("hi!");
        java.lang.String str22 = characterReader1.consumeTagName();
        boolean boolean23 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.containsIgnoreCase("!");
        boolean boolean27 = characterReader1.matches("i");
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        java.lang.String str29 = characterReader1.toString();
        boolean boolean31 = characterReader1.matches(' ');
        java.lang.String str32 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!" + "'", str21, "!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        boolean boolean50 = characterReader1.matchConsumeIgnoreCase("h");
        int int52 = characterReader1.nextIndexOf(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 3, count 1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches('\uffff');
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean10 = characterReader6.rangeEquals(10, 0, "");
        java.lang.String str11 = characterReader6.consumeData();
        java.lang.String str12 = characterReader6.toString();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray19 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str20 = characterReader14.consumeToAnySorted(charArray19);
        java.lang.String str21 = characterReader6.consumeToAnySorted(charArray19);
        java.lang.String str23 = characterReader6.consumeTo("i!");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray30 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str31 = characterReader25.consumeToAnySorted(charArray30);
        char[] charArray32 = new char[] {};
        java.lang.String str33 = characterReader25.consumeToAnySorted(charArray32);
        java.lang.String str34 = characterReader25.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray41 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str42 = characterReader36.consumeToAnySorted(charArray41);
        java.lang.String str43 = characterReader25.consumeToAny(charArray41);
        boolean boolean44 = characterReader25.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean50 = characterReader46.rangeEquals(10, 0, "");
        java.lang.String str51 = characterReader46.consumeData();
        java.lang.String str52 = characterReader46.toString();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray59 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str60 = characterReader54.consumeToAnySorted(charArray59);
        java.lang.String str61 = characterReader46.consumeToAnySorted(charArray59);
        java.lang.String str62 = characterReader25.consumeToAny(charArray59);
        boolean boolean63 = characterReader6.matchesAny(charArray59);
        java.lang.String str64 = characterReader1.consumeToAny(charArray59);
        java.lang.String str65 = characterReader1.consumeData();
        java.lang.String str66 = characterReader1.toString();
        int int68 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "i!" + "'", str64, "i!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.toString();
        java.lang.String str8 = characterReader1.consumeToEnd();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean15 = characterReader11.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        char[] charArray24 = new char[] {};
        java.lang.String str25 = characterReader17.consumeToAnySorted(charArray24);
        boolean boolean26 = characterReader11.matchesAnySorted(charArray24);
        boolean boolean28 = characterReader11.matchConsumeIgnoreCase("");
        java.lang.String str29 = characterReader11.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray36 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str37 = characterReader31.consumeToAnySorted(charArray36);
        boolean boolean38 = characterReader11.matchesAnySorted(charArray36);
        java.lang.String str40 = characterReader11.consumeTo('a');
        java.lang.String str41 = characterReader11.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        java.lang.String str59 = characterReader11.consumeToAny(charArray56);
        int int61 = characterReader11.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean62 = characterReader11.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray69 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str70 = characterReader64.consumeToAnySorted(charArray69);
        char[] charArray71 = new char[] {};
        java.lang.String str72 = characterReader64.consumeToAnySorted(charArray71);
        java.lang.String str73 = characterReader64.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray80 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str81 = characterReader75.consumeToAnySorted(charArray80);
        java.lang.String str82 = characterReader64.consumeToAny(charArray80);
        boolean boolean83 = characterReader11.matchesAny(charArray80);
        boolean boolean84 = characterReader1.matchesAnySorted(charArray80);
        boolean boolean86 = characterReader1.matchConsume("hi");
        characterReader1.advance();
        boolean boolean89 = characterReader1.matches('h');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "i!" + "'", str40, "i!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str31 = characterReader1.consumeToEnd();
        boolean boolean33 = characterReader1.containsIgnoreCase("h");
        java.lang.String str34 = characterReader1.toString();
        characterReader1.unconsume();
        boolean boolean37 = characterReader1.matchesIgnoreCase("h");
        java.lang.String str38 = characterReader1.consumeData();
        java.lang.String str39 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "!" + "'", str38, "!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean12 = characterReader8.rangeEquals(10, 0, "");
        java.lang.String str13 = characterReader8.consumeData();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray20 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str21 = characterReader15.consumeToAnySorted(charArray20);
        java.lang.String str22 = characterReader8.consumeToAnySorted(charArray20);
        boolean boolean23 = characterReader1.matchesAny(charArray20);
        java.lang.String str24 = characterReader1.consumeLetterThenDigitSequence();
        int int26 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        boolean boolean27 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi" + "'", str24, "hi");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean3 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean9 = characterReader1.rangeEquals((int) '!', 3, "");
        char char10 = characterReader1.current();
        java.lang.String str11 = characterReader1.consumeHexSequence();
        boolean boolean13 = characterReader1.matchConsume("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!" + "'", str5, "i!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str9 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi" + "'", str10, "hi");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader1.matchesAny(charArray37);
        int int41 = characterReader1.pos();
        java.lang.String str42 = characterReader1.consumeHexSequence();
        int int44 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str46 = characterReader1.consumeTo('a');
        int int47 = characterReader1.pos();
        boolean boolean49 = characterReader1.matches('\uffff');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str32 = characterReader1.consumeTo('\uffff');
        java.lang.String str33 = characterReader1.consumeData();
        boolean boolean35 = characterReader1.matchesIgnoreCase("h");
        boolean boolean39 = characterReader1.rangeEquals((int) (byte) 10, (int) (short) -1, "");
        int int40 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "i!" + "'", str32, "i!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean2 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.containsIgnoreCase("h");
        java.lang.String str5 = characterReader1.consumeData();
        boolean boolean7 = characterReader1.containsIgnoreCase("i!");
        characterReader1.unconsume();
        boolean boolean10 = characterReader1.matchConsume("hi!");
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        int int51 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        java.lang.String str52 = characterReader1.consumeLetterThenDigitSequence();
        int int53 = characterReader1.pos();
        java.lang.String str54 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeToEnd();
        char char50 = characterReader1.current();
        boolean boolean52 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\uffff' + "'", char50 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.rewindToMark();
        characterReader1.advance();
        java.lang.String str6 = characterReader1.consumeAsString();
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        java.lang.String str8 = characterReader1.consumeTagName();
        java.lang.String str9 = characterReader1.consumeToEnd();
        char char10 = characterReader1.current();
        java.lang.String str11 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "i" + "'", str6, "i");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.toString();
        java.lang.String str8 = characterReader1.consumeToEnd();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matchesDigit();
        boolean boolean11 = characterReader1.isEmpty();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean10 = characterReader6.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        char[] charArray19 = new char[] {};
        java.lang.String str20 = characterReader12.consumeToAnySorted(charArray19);
        boolean boolean21 = characterReader6.matchesAnySorted(charArray19);
        java.lang.String str23 = characterReader6.consumeTo("hi");
        int int25 = characterReader6.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader6.mark();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean32 = characterReader28.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray39 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str40 = characterReader34.consumeToAnySorted(charArray39);
        char[] charArray41 = new char[] {};
        java.lang.String str42 = characterReader34.consumeToAnySorted(charArray41);
        boolean boolean43 = characterReader28.matchesAnySorted(charArray41);
        boolean boolean45 = characterReader28.matchConsumeIgnoreCase("");
        java.lang.String str46 = characterReader28.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray53 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        boolean boolean55 = characterReader28.matchesAnySorted(charArray53);
        characterReader28.mark();
        int int57 = characterReader28.pos();
        characterReader28.advance();
        characterReader28.mark();
        boolean boolean60 = characterReader28.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray67 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str68 = characterReader62.consumeToAnySorted(charArray67);
        boolean boolean69 = characterReader28.matchesAny(charArray67);
        java.lang.String str70 = characterReader6.consumeToAnySorted(charArray67);
        boolean boolean71 = characterReader1.matchesAny(charArray67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "h" + "'", str46, "h");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray25 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str26 = characterReader20.consumeToAnySorted(charArray25);
        char[] charArray27 = new char[] {};
        java.lang.String str28 = characterReader20.consumeToAnySorted(charArray27);
        java.lang.String str29 = characterReader20.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray36 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str37 = characterReader31.consumeToAnySorted(charArray36);
        java.lang.String str38 = characterReader20.consumeToAny(charArray36);
        java.lang.String str39 = characterReader20.consumeData();
        characterReader20.mark();
        characterReader20.unconsume();
        int int42 = characterReader20.pos();
        boolean boolean44 = characterReader20.matchConsume("h");
        int int46 = characterReader20.nextIndexOf((java.lang.CharSequence) "!");
        java.lang.String str47 = characterReader20.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean53 = characterReader49.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray60 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str61 = characterReader55.consumeToAnySorted(charArray60);
        char[] charArray62 = new char[] {};
        java.lang.String str63 = characterReader55.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader49.matchesAnySorted(charArray62);
        boolean boolean66 = characterReader49.matchConsumeIgnoreCase("");
        java.lang.String str67 = characterReader49.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray74 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str75 = characterReader69.consumeToAnySorted(charArray74);
        boolean boolean76 = characterReader49.matchesAnySorted(charArray74);
        characterReader49.mark();
        int int78 = characterReader49.pos();
        characterReader49.advance();
        characterReader49.mark();
        boolean boolean81 = characterReader49.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader83 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray88 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str89 = characterReader83.consumeToAnySorted(charArray88);
        boolean boolean90 = characterReader49.matchesAny(charArray88);
        boolean boolean91 = characterReader20.matchesAnySorted(charArray88);
        java.lang.String str92 = characterReader1.consumeToAnySorted(charArray88);
        char char93 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "h" + "'", str67, "h");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + char93 + "' != '" + '\uffff' + "'", char93 == '\uffff');
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean3 = characterReader1.matches('h');
        boolean boolean5 = characterReader1.matches("i");
        boolean boolean6 = characterReader1.matchesLetter();
        int int7 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray14 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        char[] charArray16 = new char[] {};
        java.lang.String str17 = characterReader9.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader9.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray25 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str26 = characterReader20.consumeToAnySorted(charArray25);
        java.lang.String str27 = characterReader9.consumeToAny(charArray25);
        java.lang.String str28 = characterReader9.consumeData();
        characterReader9.mark();
        boolean boolean30 = characterReader9.matchesDigit();
        java.lang.String str31 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean34 = characterReader33.isEmpty();
        boolean boolean36 = characterReader33.containsIgnoreCase("h");
        java.lang.String str37 = characterReader33.consumeData();
        boolean boolean39 = characterReader33.containsIgnoreCase("i!");
        characterReader33.unconsume();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi");
        boolean boolean44 = characterReader42.matches("");
        int int45 = characterReader42.pos();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean51 = characterReader47.rangeEquals(10, 0, "");
        java.lang.String str52 = characterReader47.consumeData();
        java.lang.String str53 = characterReader47.toString();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray60 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str61 = characterReader55.consumeToAnySorted(charArray60);
        java.lang.String str62 = characterReader47.consumeToAnySorted(charArray60);
        java.lang.String str63 = characterReader42.consumeToAny(charArray60);
        boolean boolean64 = characterReader33.matchesAnySorted(charArray60);
        boolean boolean65 = characterReader9.matchesAny(charArray60);
        boolean boolean66 = characterReader1.matchesAny(charArray60);
        boolean boolean68 = characterReader1.matchesIgnoreCase("i");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "i" + "'", str37, "i");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi" + "'", str63, "hi");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader1.matchesAny(charArray37);
        int int41 = characterReader1.pos();
        boolean boolean43 = characterReader1.matches('\uffff');
        boolean boolean44 = characterReader1.isEmpty();
        java.lang.String str45 = characterReader1.consumeDigitSequence();
        java.lang.String str47 = characterReader1.consumeTo('#');
        java.lang.String str49 = characterReader1.consumeTo("i!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str22 = characterReader1.consumeTo('!');
        boolean boolean24 = characterReader1.containsIgnoreCase("h");
        java.lang.String str25 = characterReader1.consumeData();
        java.lang.String str26 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        boolean boolean22 = characterReader1.matchesIgnoreCase("i");
        boolean boolean23 = characterReader1.matchesDigit();
        int int25 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean27 = characterReader1.matches("!");
        java.lang.String str28 = characterReader1.toString();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "i!" + "'", str28, "i!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str9 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!" + "'", str9, "!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchesDigit();
        java.lang.String str23 = characterReader1.consumeToEnd();
        java.lang.String str24 = characterReader1.consumeData();
        boolean boolean26 = characterReader1.matches(' ');
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.mark();
        characterReader1.rewindToMark();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("i");
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        java.lang.String str14 = characterReader1.consumeTagName();
        java.lang.String str15 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi" + "'", str13, "hi");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!" + "'", str14, "!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean2 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.containsIgnoreCase("h");
        java.lang.String str5 = characterReader1.consumeData();
        int int7 = characterReader1.nextIndexOf('a');
        char char8 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        char[] charArray24 = new char[] {};
        java.lang.String str25 = characterReader17.consumeToAnySorted(charArray24);
        java.lang.String str26 = characterReader17.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader17.consumeToAny(charArray33);
        boolean boolean36 = characterReader1.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        java.lang.String str48 = characterReader39.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray55 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str56 = characterReader50.consumeToAnySorted(charArray55);
        java.lang.String str57 = characterReader39.consumeToAny(charArray55);
        boolean boolean58 = characterReader39.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean64 = characterReader60.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray71 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str72 = characterReader66.consumeToAnySorted(charArray71);
        char[] charArray73 = new char[] {};
        java.lang.String str74 = characterReader66.consumeToAnySorted(charArray73);
        boolean boolean75 = characterReader60.matchesAnySorted(charArray73);
        boolean boolean77 = characterReader60.matchConsumeIgnoreCase("");
        java.lang.String str78 = characterReader60.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray85 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str86 = characterReader80.consumeToAnySorted(charArray85);
        boolean boolean87 = characterReader60.matchesAnySorted(charArray85);
        java.lang.String str88 = characterReader39.consumeToAnySorted(charArray85);
        boolean boolean89 = characterReader1.matchesAnySorted(charArray85);
        boolean boolean91 = characterReader1.matchesIgnoreCase("i");
        java.lang.Class<?> wildcardClass92 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] {});
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "h" + "'", str78, "h");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeToEnd();
        characterReader1.mark();
        java.lang.String str52 = characterReader1.consumeTo("!");
        java.lang.String str54 = characterReader1.consumeTo("i!");
        java.lang.String str55 = characterReader1.consumeTagName();
        characterReader1.mark();
        boolean boolean57 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        java.lang.String str19 = characterReader1.consumeToEnd();
        int int21 = characterReader1.nextIndexOf('#');
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean28 = characterReader24.rangeEquals(10, 0, "");
        java.lang.String str29 = characterReader24.consumeData();
        java.lang.String str30 = characterReader24.toString();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        char[] charArray39 = new char[] {};
        java.lang.String str40 = characterReader32.consumeToAnySorted(charArray39);
        java.lang.String str41 = characterReader32.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        java.lang.String str50 = characterReader32.consumeToAny(charArray48);
        boolean boolean51 = characterReader32.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean57 = characterReader53.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray64 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str65 = characterReader59.consumeToAnySorted(charArray64);
        char[] charArray66 = new char[] {};
        java.lang.String str67 = characterReader59.consumeToAnySorted(charArray66);
        boolean boolean68 = characterReader53.matchesAnySorted(charArray66);
        boolean boolean70 = characterReader53.matchConsumeIgnoreCase("");
        java.lang.String str71 = characterReader53.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray78 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str79 = characterReader73.consumeToAnySorted(charArray78);
        boolean boolean80 = characterReader53.matchesAnySorted(charArray78);
        java.lang.String str81 = characterReader32.consumeToAnySorted(charArray78);
        boolean boolean82 = characterReader24.matchesAny(charArray78);
        java.lang.String str83 = characterReader1.consumeToAny(charArray78);
        boolean boolean84 = characterReader1.matchesDigit();
        boolean boolean86 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str87 = characterReader1.consumeDigitSequence();
        java.lang.String str88 = characterReader1.consumeLetterSequence();
        char char89 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] {});
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "h" + "'", str71, "h");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!" + "'", str83, "!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + char89 + "' != '" + '\uffff' + "'", char89 == '\uffff');
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean21 = characterReader1.isEmpty();
        char char22 = characterReader1.current();
        boolean boolean23 = characterReader1.matchesDigit();
        int int25 = characterReader1.nextIndexOf('#');
        boolean boolean27 = characterReader1.matches(' ');
        java.lang.String str28 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeToEnd();
        int int22 = characterReader1.nextIndexOf('h');
        int int24 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        boolean boolean26 = characterReader1.matchConsume("h");
        boolean boolean28 = characterReader1.matchConsume("h");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("!");
        java.lang.String str3 = characterReader1.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray10 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str11 = characterReader5.consumeToAnySorted(charArray10);
        char[] charArray12 = new char[] {};
        java.lang.String str13 = characterReader5.consumeToAnySorted(charArray12);
        java.lang.String str14 = characterReader5.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray21 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        java.lang.String str23 = characterReader5.consumeToAny(charArray21);
        java.lang.String str24 = characterReader5.consumeData();
        boolean boolean26 = characterReader5.containsIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader5.matchesAnySorted(charArray33);
        java.lang.String str36 = characterReader1.consumeToAny(charArray33);
        boolean boolean37 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str40 = characterReader1.consumeTo('\uffff');
        boolean boolean42 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        boolean boolean3 = characterReader1.matches("");
        boolean boolean5 = characterReader1.matches("hi!");
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        characterReader1.mark();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean24 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.isEmpty();
        boolean boolean27 = characterReader1.matchesIgnoreCase("!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray11 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str12 = characterReader6.consumeToAnySorted(charArray11);
        boolean boolean13 = characterReader1.matchesAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToEnd();
        int int15 = characterReader1.pos();
        java.lang.String str17 = characterReader1.consumeTo('a');
        java.lang.String str18 = characterReader1.toString();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("i!");
        int int90 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean92 = characterReader1.matchesIgnoreCase("h");
        java.lang.String str93 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi" + "'", str93, "hi");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str23 = characterReader1.consumeData();
        java.lang.String str24 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        int int28 = characterReader26.nextIndexOf((java.lang.CharSequence) "hi");
        char char29 = characterReader26.current();
        int int30 = characterReader26.pos();
        int int32 = characterReader26.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean33 = characterReader26.isEmpty();
        java.lang.String str35 = characterReader26.consumeTo("!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        boolean boolean57 = characterReader37.matches("i");
        java.lang.String str58 = characterReader37.consumeDigitSequence();
        boolean boolean60 = characterReader37.matchesIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean66 = characterReader62.rangeEquals(10, 0, "");
        java.lang.String str67 = characterReader62.consumeLetterSequence();
        characterReader62.rewindToMark();
        characterReader62.advance();
        boolean boolean71 = characterReader62.matches("");
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray80 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str81 = characterReader75.consumeToAnySorted(charArray80);
        boolean boolean82 = characterReader73.matchesAny(charArray80);
        java.lang.String str83 = characterReader62.consumeToAnySorted(charArray80);
        java.lang.String str84 = characterReader37.consumeToAny(charArray80);
        boolean boolean85 = characterReader26.matchesAny(charArray80);
        boolean boolean86 = characterReader1.matchesAnySorted(charArray80);
        char[] charArray87 = null;
        java.lang.String str88 = characterReader1.consumeToAnySorted(charArray87);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'h' + "'", char29 == 'h');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi" + "'", str35, "hi");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi" + "'", str67, "hi");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "i!" + "'", str83, "i!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "i!" + "'", str84, "i!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        char char16 = characterReader1.current();
        boolean boolean18 = characterReader1.matches("i");
        characterReader1.unconsume();
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean22 = characterReader1.matchesLetter();
        boolean boolean24 = characterReader1.matchConsumeIgnoreCase("i!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean21 = characterReader1.isEmpty();
        char char22 = characterReader1.current();
        java.lang.String str23 = characterReader1.consumeToEnd();
        char char24 = characterReader1.current();
        int int26 = characterReader1.nextIndexOf('\uffff');
        java.lang.String str28 = characterReader1.consumeTo("i");
        java.lang.String str29 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean31 = characterReader1.matchConsume("i");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray14 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        java.lang.String str16 = characterReader1.consumeToAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("i!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray25 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str26 = characterReader20.consumeToAnySorted(charArray25);
        char[] charArray27 = new char[] {};
        java.lang.String str28 = characterReader20.consumeToAnySorted(charArray27);
        java.lang.String str29 = characterReader20.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray36 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str37 = characterReader31.consumeToAnySorted(charArray36);
        java.lang.String str38 = characterReader20.consumeToAny(charArray36);
        boolean boolean39 = characterReader20.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean45 = characterReader41.rangeEquals(10, 0, "");
        java.lang.String str46 = characterReader41.consumeData();
        java.lang.String str47 = characterReader41.toString();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        java.lang.String str56 = characterReader41.consumeToAnySorted(charArray54);
        java.lang.String str57 = characterReader20.consumeToAny(charArray54);
        boolean boolean58 = characterReader1.matchesAny(charArray54);
        java.lang.String str59 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean61 = characterReader1.matches("");
        java.lang.String str62 = characterReader1.consumeTagName();
        java.lang.String str63 = characterReader1.toString();
        java.lang.String str65 = characterReader1.consumeTo("i!");
        boolean boolean67 = characterReader1.matchConsumeIgnoreCase("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean2 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.containsIgnoreCase("h");
        java.lang.String str5 = characterReader1.consumeData();
        boolean boolean7 = characterReader1.containsIgnoreCase("i!");
        characterReader1.unconsume();
        java.lang.String str9 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i" + "'", str9, "i");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray27 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        char[] charArray29 = new char[] {};
        java.lang.String str30 = characterReader22.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray38 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str39 = characterReader33.consumeToAnySorted(charArray38);
        java.lang.String str40 = characterReader22.consumeToAny(charArray38);
        boolean boolean41 = characterReader22.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader43.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray68 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str69 = characterReader63.consumeToAnySorted(charArray68);
        boolean boolean70 = characterReader43.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader22.consumeToAnySorted(charArray68);
        boolean boolean72 = characterReader1.matchesAny(charArray68);
        characterReader1.mark();
        char char74 = characterReader1.current();
        characterReader1.unconsume();
        java.lang.String str77 = characterReader1.consumeTo('a');
        characterReader1.mark();
        boolean boolean79 = characterReader1.matchesLetter();
        int int81 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        java.lang.String str83 = characterReader1.consumeTo('!');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + 'i' + "'", char74 == 'i');
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        boolean boolean31 = characterReader1.matchConsumeIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray27 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        char[] charArray29 = new char[] {};
        java.lang.String str30 = characterReader22.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray38 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str39 = characterReader33.consumeToAnySorted(charArray38);
        java.lang.String str40 = characterReader22.consumeToAny(charArray38);
        boolean boolean41 = characterReader22.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader43.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray68 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str69 = characterReader63.consumeToAnySorted(charArray68);
        boolean boolean70 = characterReader43.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader22.consumeToAnySorted(charArray68);
        boolean boolean72 = characterReader1.matchesAny(charArray68);
        characterReader1.mark();
        boolean boolean74 = characterReader1.isEmpty();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("i!");
        characterReader1.advance();
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean25 = characterReader1.rangeEquals(100, (int) (short) 0, "");
        boolean boolean26 = characterReader1.matchesDigit();
        java.lang.String str27 = characterReader1.toString();
        char char28 = characterReader1.consume();
        characterReader1.advance();
        boolean boolean31 = characterReader1.matches("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 5, count -2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        java.lang.String str30 = characterReader1.consumeTo('a');
        java.lang.String str31 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader33.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray46);
        java.lang.String str49 = characterReader1.consumeToAny(charArray46);
        boolean boolean51 = characterReader1.matches("i");
        boolean boolean53 = characterReader1.matches('\uffff');
        char char54 = characterReader1.consume();
        characterReader1.mark();
        characterReader1.unconsume();
        int int57 = characterReader1.pos();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\uffff' + "'", char54 == '\uffff');
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean21 = characterReader1.matchesLetter();
        java.lang.String str23 = characterReader1.consumeTo("!");
        boolean boolean25 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str27 = characterReader1.consumeTo("h");
        char char28 = characterReader1.current();
        java.lang.String str29 = characterReader1.consumeToEnd();
        boolean boolean31 = characterReader1.matches("");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        boolean boolean51 = characterReader1.matches('\uffff');
        java.lang.String str53 = characterReader1.consumeTo('\uffff');
        java.lang.String str54 = characterReader1.consumeDigitSequence();
        java.lang.String str55 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals((int) (byte) 100, (int) (short) 100, "i");
        java.lang.String str7 = characterReader1.consumeTo('4');
        boolean boolean9 = characterReader1.matches("hi");
        boolean boolean11 = characterReader1.containsIgnoreCase("!");
        boolean boolean15 = characterReader1.rangeEquals((int) 'a', (int) (short) 100, "h");
        boolean boolean17 = characterReader1.matches(' ');
        char char18 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        char[] charArray24 = new char[] {};
        java.lang.String str25 = characterReader17.consumeToAnySorted(charArray24);
        java.lang.String str26 = characterReader17.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader17.consumeToAny(charArray33);
        boolean boolean36 = characterReader1.matchesAnySorted(charArray33);
        java.lang.String str38 = characterReader1.consumeTo("i!");
        characterReader1.rewindToMark();
        int int41 = characterReader1.nextIndexOf(' ');
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        java.lang.String str48 = characterReader43.consumeData();
        java.lang.String str49 = characterReader43.toString();
        java.lang.String str50 = characterReader43.consumeToEnd();
        java.lang.String str51 = characterReader43.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("hi!");
        int int55 = characterReader53.nextIndexOf((java.lang.CharSequence) "hi");
        char char56 = characterReader53.current();
        characterReader53.mark();
        java.lang.String str58 = characterReader53.consumeData();
        java.lang.String str60 = characterReader53.consumeTo('#');
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        boolean boolean64 = characterReader62.matchConsume("hi");
        boolean boolean66 = characterReader62.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        java.lang.String str73 = characterReader68.consumeData();
        java.lang.String str74 = characterReader68.toString();
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray81 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str82 = characterReader76.consumeToAnySorted(charArray81);
        java.lang.String str83 = characterReader68.consumeToAnySorted(charArray81);
        java.lang.String str84 = characterReader62.consumeToAnySorted(charArray81);
        java.lang.String str85 = characterReader53.consumeToAnySorted(charArray81);
        java.lang.String str86 = characterReader43.consumeToAny(charArray81);
        java.lang.String str87 = characterReader1.consumeToAnySorted(charArray81);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + 'h' + "'", char56 == 'h');
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("i!");
        characterReader1.advance();
        boolean boolean90 = characterReader1.isEmpty();
        boolean boolean92 = characterReader1.matches('i');
        java.lang.String str93 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean95 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "i" + "'", str93, "i");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader20.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        char[] charArray33 = new char[] {};
        java.lang.String str34 = characterReader26.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader20.matchConsumeIgnoreCase("");
        java.lang.String str38 = characterReader20.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        boolean boolean47 = characterReader20.matchesAnySorted(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        java.lang.String str49 = characterReader1.consumeDigitSequence();
        boolean boolean51 = characterReader1.matchConsumeIgnoreCase("i");
        boolean boolean52 = characterReader1.matchesLetter();
        java.lang.String str54 = characterReader1.consumeTo("!");
        int int55 = characterReader1.pos();
        boolean boolean57 = characterReader1.containsIgnoreCase("h");
        boolean boolean61 = characterReader1.rangeEquals((int) (byte) 100, (int) (byte) 10, "hi!");
        boolean boolean63 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        characterReader1.rewindToMark();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        characterReader1.advance();
        java.lang.String str12 = characterReader1.consumeToEnd();
        boolean boolean13 = characterReader1.isEmpty();
        java.lang.String str14 = characterReader1.consumeHexSequence();
        boolean boolean15 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i!" + "'", str12, "i!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean12 = characterReader8.rangeEquals(10, 0, "");
        java.lang.String str13 = characterReader8.consumeData();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray20 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str21 = characterReader15.consumeToAnySorted(charArray20);
        java.lang.String str22 = characterReader8.consumeToAnySorted(charArray20);
        boolean boolean23 = characterReader1.matchesAny(charArray20);
        java.lang.String str24 = characterReader1.toString();
        java.lang.String str26 = characterReader1.consumeTo("h");
        java.lang.String str27 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        java.lang.String str30 = characterReader1.consumeTo('a');
        boolean boolean32 = characterReader1.matches("i!");
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        java.lang.String str30 = characterReader1.consumeTo('a');
        java.lang.String str31 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader33.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray46);
        java.lang.String str49 = characterReader1.consumeToAny(charArray46);
        int int51 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean55 = characterReader1.rangeEquals((int) (short) 10, (int) 'a', "i!");
        java.lang.String str56 = characterReader1.consumeData();
        boolean boolean58 = characterReader1.matchConsume("i!");
        java.lang.String str59 = characterReader1.consumeHexSequence();
        java.lang.String str60 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        boolean boolean22 = characterReader1.matchesIgnoreCase("i");
        boolean boolean23 = characterReader1.matchesDigit();
        int int25 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean26 = characterReader1.isEmpty();
        java.lang.String str27 = characterReader1.toString();
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        java.lang.String str29 = characterReader1.consumeData();
        int int30 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "i!" + "'", str27, "i!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "i" + "'", str28, "i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!" + "'", str29, "!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str31 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        int int35 = characterReader33.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader33.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray43 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str44 = characterReader38.consumeToAnySorted(charArray43);
        boolean boolean45 = characterReader33.matchesAny(charArray43);
        java.lang.String str46 = characterReader1.consumeToAny(charArray43);
        boolean boolean47 = characterReader1.isEmpty();
        java.lang.String str48 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matches("i!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        java.lang.String str21 = characterReader1.consumeToEnd();
        char char22 = characterReader1.current();
        boolean boolean24 = characterReader1.matches('i');
        java.lang.String str26 = characterReader1.consumeTo("i!");
        int int27 = characterReader1.pos();
        char char28 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeToEnd();
        char char21 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray28 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str29 = characterReader23.consumeToAnySorted(charArray28);
        char[] charArray30 = new char[] {};
        java.lang.String str31 = characterReader23.consumeToAnySorted(charArray30);
        java.lang.String str32 = characterReader23.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray39 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str40 = characterReader34.consumeToAnySorted(charArray39);
        java.lang.String str41 = characterReader23.consumeToAny(charArray39);
        java.lang.String str42 = characterReader1.consumeToAnySorted(charArray39);
        boolean boolean44 = characterReader1.matchConsume("!");
        char char45 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\uffff' + "'", char45 == '\uffff');
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeToEnd();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        java.lang.String str22 = characterReader1.consumeToEnd();
        characterReader1.advance();
        boolean boolean24 = characterReader1.matchesDigit();
        int int26 = characterReader1.nextIndexOf('h');
        java.lang.String str27 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matches("hi");
        characterReader1.advance();
        char char6 = characterReader1.current();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        char char9 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '!' + "'", char6 == '!');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        characterReader1.rewindToMark();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str11 = characterReader1.toString();
        int int12 = characterReader1.pos();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.toString();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader1.consumeToAny(charArray62);
        java.lang.String str67 = characterReader1.consumeToEnd();
        boolean boolean69 = characterReader1.matches('\uffff');
        java.lang.String str70 = characterReader1.consumeDigitSequence();
        java.lang.String str71 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        boolean boolean21 = characterReader1.matches("i");
        boolean boolean23 = characterReader1.containsIgnoreCase("hi");
        int int25 = characterReader1.nextIndexOf('a');
        boolean boolean29 = characterReader1.rangeEquals((int) '#', (int) (byte) 10, "i!");
        java.lang.String str31 = characterReader1.consumeTo('h');
        boolean boolean33 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        java.lang.String str30 = characterReader1.consumeTo('a');
        java.lang.String str31 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader33.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray46);
        java.lang.String str49 = characterReader1.consumeToAny(charArray46);
        int int51 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean53 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str54 = characterReader1.consumeLetterSequence();
        boolean boolean55 = characterReader1.isEmpty();
        characterReader1.unconsume();
        java.lang.String str57 = characterReader1.consumeHexSequence();
        boolean boolean58 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals((int) (byte) 100, (int) (short) 100, "i");
        java.lang.String str7 = characterReader1.consumeTo('4');
        boolean boolean9 = characterReader1.matches("hi");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("i");
        boolean boolean13 = characterReader11.matches('h');
        boolean boolean15 = characterReader11.matches("i");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray22 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str23 = characterReader17.consumeToAnySorted(charArray22);
        char[] charArray24 = new char[] {};
        java.lang.String str25 = characterReader17.consumeToAnySorted(charArray24);
        java.lang.String str26 = characterReader17.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader17.consumeToAny(charArray33);
        boolean boolean36 = characterReader11.matchesAnySorted(charArray33);
        boolean boolean37 = characterReader1.matchesAnySorted(charArray33);
        java.lang.String str39 = characterReader1.consumeTo('\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str31 = characterReader1.consumeToEnd();
        boolean boolean33 = characterReader1.containsIgnoreCase("h");
        java.lang.String str34 = characterReader1.toString();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        java.lang.String str42 = characterReader37.consumeData();
        java.lang.String str43 = characterReader37.toString();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray50 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str51 = characterReader45.consumeToAnySorted(charArray50);
        java.lang.String str52 = characterReader37.consumeToAnySorted(charArray50);
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray59 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str60 = characterReader54.consumeToAnySorted(charArray59);
        char[] charArray61 = new char[] {};
        java.lang.String str62 = characterReader54.consumeToAnySorted(charArray61);
        java.lang.String str63 = characterReader54.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray70 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str71 = characterReader65.consumeToAnySorted(charArray70);
        java.lang.String str72 = characterReader54.consumeToAny(charArray70);
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        java.lang.String str83 = characterReader74.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader85 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray90 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str91 = characterReader85.consumeToAnySorted(charArray90);
        java.lang.String str92 = characterReader74.consumeToAny(charArray90);
        boolean boolean93 = characterReader54.matchesAny(charArray90);
        boolean boolean94 = characterReader37.matchesAnySorted(charArray90);
        java.lang.String str95 = characterReader1.consumeToAnySorted(charArray90);
        java.lang.String str96 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "!" + "'", str95, "!");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean33 = characterReader1.matchesDigit();
        java.lang.String str34 = characterReader1.consumeAsString();
        java.lang.String str36 = characterReader1.consumeTo("!");
        boolean boolean38 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!" + "'", str34, "!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals((int) (byte) 100, (int) (short) 100, "i");
        java.lang.String str7 = characterReader1.consumeTo('4');
        boolean boolean9 = characterReader1.matches("hi");
        char char10 = characterReader1.consume();
        boolean boolean12 = characterReader1.matchConsume("!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        java.lang.String str30 = characterReader1.consumeTo('a');
        java.lang.String str31 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader33.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray46);
        java.lang.String str49 = characterReader1.consumeToAny(charArray46);
        boolean boolean51 = characterReader1.matches("i");
        boolean boolean53 = characterReader1.matches('\uffff');
        char char54 = characterReader1.consume();
        characterReader1.mark();
        characterReader1.unconsume();
        boolean boolean58 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str60 = characterReader1.consumeTo('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\uffff' + "'", char54 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        int int5 = characterReader1.pos();
        java.lang.String str7 = characterReader1.consumeTo("hi");
        characterReader1.unconsume();
        characterReader1.advance();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        java.lang.String str9 = characterReader1.consumeAsString();
        characterReader1.advance();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("!");
        char char13 = characterReader1.consume();
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 0, 3, "i");
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i" + "'", str9, "i");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.mark();
        int int10 = characterReader1.nextIndexOf('a');
        boolean boolean12 = characterReader1.containsIgnoreCase("i!");
        boolean boolean14 = characterReader1.matches('i');
        java.lang.String str15 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("!");
        java.lang.String str3 = characterReader1.consumeTo("hi");
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean8 = characterReader1.rangeEquals((int) (byte) 1, (int) '#', "i");
        characterReader1.mark();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchesDigit();
        java.lang.String str23 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean24 = characterReader1.matchesDigit();
        java.lang.String str25 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        java.lang.String str27 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str28 = characterReader1.consumeAsString();
        boolean boolean29 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "!" + "'", str28, "!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray13 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str14 = characterReader8.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray13);
        boolean boolean17 = characterReader1.matchesIgnoreCase("");
        characterReader1.rewindToMark();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str21 = characterReader1.consumeToEnd();
        int int22 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        java.lang.String str31 = characterReader1.consumeTo(' ');
        int int32 = characterReader1.pos();
        char char33 = characterReader1.current();
        java.lang.String str34 = characterReader1.consumeData();
        int int36 = characterReader1.nextIndexOf('a');
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("i!");
        boolean boolean89 = characterReader1.matchesDigit();
        int int91 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str92 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean94 = characterReader1.containsIgnoreCase("!");
        boolean boolean95 = characterReader1.isEmpty();
        java.lang.String str96 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi" + "'", str92, "hi");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "!" + "'", str96, "!");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray8 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str9 = characterReader3.consumeToAnySorted(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        char char11 = characterReader1.consume();
        boolean boolean13 = characterReader1.containsIgnoreCase("!");
        boolean boolean15 = characterReader1.matches("h");
        characterReader1.rewindToMark();
        java.lang.String str17 = characterReader1.consumeToEnd();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.mark();
        int int10 = characterReader1.nextIndexOf('a');
        boolean boolean12 = characterReader1.containsIgnoreCase("i!");
        boolean boolean14 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str15 = characterReader1.consumeHexSequence();
        java.lang.String str16 = characterReader1.consumeAsString();
        java.lang.String str17 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        int int5 = characterReader1.pos();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.consumeTo("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.containsIgnoreCase("!");
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean10 = characterReader6.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        char[] charArray19 = new char[] {};
        java.lang.String str20 = characterReader12.consumeToAnySorted(charArray19);
        boolean boolean21 = characterReader6.matchesAnySorted(charArray19);
        boolean boolean23 = characterReader6.matchConsumeIgnoreCase("");
        java.lang.String str24 = characterReader6.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray31 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader6.matchesAnySorted(charArray31);
        java.lang.String str35 = characterReader6.consumeTo('a');
        java.lang.String str36 = characterReader6.consumeLetterSequence();
        characterReader6.advance();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean43 = characterReader39.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray50 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str51 = characterReader45.consumeToAnySorted(charArray50);
        char[] charArray52 = new char[] {};
        java.lang.String str53 = characterReader45.consumeToAnySorted(charArray52);
        boolean boolean54 = characterReader39.matchesAnySorted(charArray52);
        boolean boolean56 = characterReader39.matchConsumeIgnoreCase("");
        java.lang.String str57 = characterReader39.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray64 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str65 = characterReader59.consumeToAnySorted(charArray64);
        boolean boolean66 = characterReader39.matchesAnySorted(charArray64);
        java.lang.String str68 = characterReader39.consumeTo('a');
        java.lang.String str69 = characterReader39.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean75 = characterReader71.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray82 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str83 = characterReader77.consumeToAnySorted(charArray82);
        char[] charArray84 = new char[] {};
        java.lang.String str85 = characterReader77.consumeToAnySorted(charArray84);
        boolean boolean86 = characterReader71.matchesAnySorted(charArray84);
        java.lang.String str87 = characterReader39.consumeToAny(charArray84);
        java.lang.String str88 = characterReader6.consumeToAny(charArray84);
        boolean boolean89 = characterReader1.matchesAnySorted(charArray84);
        java.lang.String str90 = characterReader1.consumeHexSequence();
        boolean boolean92 = characterReader1.matches("hi");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "i!" + "'", str35, "i!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "h" + "'", str57, "h");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "i!" + "'", str68, "i!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] {});
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matches("hi");
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!" + "'", str5, "i!");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray14 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        char[] charArray16 = new char[] {};
        java.lang.String str17 = characterReader9.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader9.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray25 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str26 = characterReader20.consumeToAnySorted(charArray25);
        java.lang.String str27 = characterReader9.consumeToAny(charArray25);
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray34 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str35 = characterReader29.consumeToAnySorted(charArray34);
        char[] charArray36 = new char[] {};
        java.lang.String str37 = characterReader29.consumeToAnySorted(charArray36);
        java.lang.String str38 = characterReader29.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray45 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str46 = characterReader40.consumeToAnySorted(charArray45);
        java.lang.String str47 = characterReader29.consumeToAny(charArray45);
        boolean boolean48 = characterReader9.matchesAny(charArray45);
        java.lang.String str49 = characterReader1.consumeToAny(charArray45);
        java.lang.String str50 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "!" + "'", str49, "!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("!");
        boolean boolean89 = characterReader1.matchesLetter();
        char char90 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + char90 + "' != '" + 'h' + "'", char90 == 'h');
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        characterReader1.mark();
        characterReader1.unconsume();
        int int23 = characterReader1.pos();
        boolean boolean25 = characterReader1.matchConsume("h");
        int int27 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        char char28 = characterReader1.current();
        characterReader1.unconsume();
        java.lang.String str30 = characterReader1.consumeAsString();
        java.lang.String str31 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '!' + "'", char28 == '!');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i" + "'", str30, "i");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "!" + "'", str31, "!");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        char char9 = characterReader1.current();
        boolean boolean11 = characterReader1.matches('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'i' + "'", char9 == 'i');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader1.matchesAny(charArray37);
        int int41 = characterReader1.pos();
        boolean boolean43 = characterReader1.matches('\uffff');
        boolean boolean44 = characterReader1.isEmpty();
        java.lang.String str45 = characterReader1.consumeDigitSequence();
        int int47 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        int int5 = characterReader1.pos();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.consumeTo("hi!");
        boolean boolean13 = characterReader1.rangeEquals((int) (short) 10, (int) '4', "i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader22.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray33 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        char[] charArray35 = new char[] {};
        java.lang.String str36 = characterReader28.consumeToAnySorted(charArray35);
        boolean boolean37 = characterReader22.matchesAnySorted(charArray35);
        boolean boolean39 = characterReader22.matchConsumeIgnoreCase("");
        java.lang.String str40 = characterReader22.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray47 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str48 = characterReader42.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader22.matchesAnySorted(charArray47);
        java.lang.String str50 = characterReader1.consumeToAnySorted(charArray47);
        java.lang.String str51 = characterReader1.consumeDigitSequence();
        java.lang.String str53 = characterReader1.consumeTo('#');
        characterReader1.mark();
        java.lang.String str56 = characterReader1.consumeTo("!");
        java.lang.String str57 = characterReader1.consumeHexSequence();
        boolean boolean59 = characterReader1.matches('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 3, count 1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "h" + "'", str40, "h");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches('\uffff');
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        char char5 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        int int9 = characterReader7.nextIndexOf((java.lang.CharSequence) "hi");
        char char10 = characterReader7.current();
        boolean boolean12 = characterReader7.matchesIgnoreCase("hi");
        boolean boolean13 = characterReader7.isEmpty();
        boolean boolean17 = characterReader7.rangeEquals((int) '4', (int) '#', "!");
        java.lang.String str19 = characterReader7.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader21.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray37 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader21.consumeToAny(charArray37);
        boolean boolean40 = characterReader21.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean46 = characterReader42.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray53 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        char[] charArray55 = new char[] {};
        java.lang.String str56 = characterReader48.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader42.matchesAnySorted(charArray55);
        boolean boolean59 = characterReader42.matchConsumeIgnoreCase("");
        java.lang.String str60 = characterReader42.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray67 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str68 = characterReader62.consumeToAnySorted(charArray67);
        boolean boolean69 = characterReader42.matchesAnySorted(charArray67);
        java.lang.String str70 = characterReader21.consumeToAnySorted(charArray67);
        java.lang.String str71 = characterReader7.consumeToAny(charArray67);
        boolean boolean72 = characterReader1.matchesAny(charArray67);
        boolean boolean73 = characterReader1.isEmpty();
        java.lang.String str74 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'h' + "'", char10 == 'h');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean21 = characterReader1.isEmpty();
        char char22 = characterReader1.current();
        boolean boolean23 = characterReader1.matchesDigit();
        characterReader1.advance();
        boolean boolean26 = characterReader1.matchesIgnoreCase("i!");
        boolean boolean27 = characterReader1.matchesLetter();
        boolean boolean29 = characterReader1.matches('a');
        boolean boolean31 = characterReader1.matches('4');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("i!");
        java.lang.String str89 = characterReader1.consumeDigitSequence();
        boolean boolean91 = characterReader1.matches("hi");
        java.lang.String str93 = characterReader1.consumeTo('!');
        java.lang.String str94 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi" + "'", str93, "hi");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "!" + "'", str94, "!");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        java.lang.String str20 = characterReader1.consumeTagName();
        characterReader1.rewindToMark();
        boolean boolean23 = characterReader1.matchConsume("hi!");
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        characterReader1.mark();
        int int30 = characterReader1.pos();
        java.lang.String str31 = characterReader1.consumeToEnd();
        boolean boolean33 = characterReader1.containsIgnoreCase("h");
        boolean boolean35 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean37 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean22 = characterReader18.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray29 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        char[] charArray31 = new char[] {};
        java.lang.String str32 = characterReader24.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader18.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader37.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray48 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        char[] charArray50 = new char[] {};
        java.lang.String str51 = characterReader43.consumeToAnySorted(charArray50);
        boolean boolean52 = characterReader37.matchesAnySorted(charArray50);
        boolean boolean54 = characterReader37.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader37.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray62 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader37.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader18.consumeToAny(charArray62);
        java.lang.String str66 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean72 = characterReader68.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray79 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        char[] charArray81 = new char[] {};
        java.lang.String str82 = characterReader74.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader18.consumeToAny(charArray81);
        boolean boolean85 = characterReader1.matchesAny(charArray81);
        int int86 = characterReader1.pos();
        boolean boolean88 = characterReader1.matches("i!");
        boolean boolean89 = characterReader1.matchesDigit();
        java.lang.String str90 = characterReader1.consumeTagName();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str8 = characterReader1.consumeTo('a');
        boolean boolean12 = characterReader1.rangeEquals((int) 'a', (int) (byte) 10, "!");
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.consumeHexSequence();
        int int16 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        java.lang.String str17 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean21 = characterReader1.matchesLetter();
        java.lang.String str23 = characterReader1.consumeTo("!");
        java.lang.String str24 = characterReader1.consumeDigitSequence();
        java.lang.String str25 = characterReader1.consumeLetterSequence();
        boolean boolean27 = characterReader1.matchesIgnoreCase("i!");
        java.lang.String str29 = characterReader1.consumeTo('i');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray6 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray8 = new char[] {};
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray17 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeToEnd();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean12 = characterReader8.rangeEquals(10, 0, "");
        java.lang.String str13 = characterReader8.consumeData();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray20 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str21 = characterReader15.consumeToAnySorted(charArray20);
        java.lang.String str22 = characterReader8.consumeToAnySorted(charArray20);
        boolean boolean23 = characterReader1.matchesAny(charArray20);
        java.lang.String str24 = characterReader1.consumeDigitSequence();
        java.lang.String str26 = characterReader1.consumeTo("i");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray27 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        char[] charArray29 = new char[] {};
        java.lang.String str30 = characterReader22.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray38 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str39 = characterReader33.consumeToAnySorted(charArray38);
        java.lang.String str40 = characterReader22.consumeToAny(charArray38);
        boolean boolean41 = characterReader22.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader43.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray68 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str69 = characterReader63.consumeToAnySorted(charArray68);
        boolean boolean70 = characterReader43.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader22.consumeToAnySorted(charArray68);
        boolean boolean72 = characterReader1.matchesAny(charArray68);
        java.lang.String str73 = characterReader1.consumeData();
        boolean boolean75 = characterReader1.matchesIgnoreCase("");
        java.lang.String str76 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "i!" + "'", str73, "i!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray26 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str27 = characterReader21.consumeToAnySorted(charArray26);
        boolean boolean28 = characterReader1.matchesAnySorted(charArray26);
        java.lang.String str30 = characterReader1.consumeTo('a');
        java.lang.String str31 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader33.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray44 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str45 = characterReader39.consumeToAnySorted(charArray44);
        char[] charArray46 = new char[] {};
        java.lang.String str47 = characterReader39.consumeToAnySorted(charArray46);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray46);
        java.lang.String str49 = characterReader1.consumeToAny(charArray46);
        boolean boolean51 = characterReader1.matches("i");
        boolean boolean53 = characterReader1.matches('\uffff');
        int int55 = characterReader1.nextIndexOf('h');
        boolean boolean57 = characterReader1.matchConsume("h");
        java.lang.String str58 = characterReader1.consumeTagName();
        java.lang.String str59 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader1.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray12 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str13 = characterReader7.consumeToAnySorted(charArray12);
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader7.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        java.lang.String str18 = characterReader1.consumeTo("hi");
        char char19 = characterReader1.consume();
        int int20 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray27 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        char[] charArray29 = new char[] {};
        java.lang.String str30 = characterReader22.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray38 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str39 = characterReader33.consumeToAnySorted(charArray38);
        java.lang.String str40 = characterReader22.consumeToAny(charArray38);
        boolean boolean41 = characterReader22.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader43.rangeEquals(10, 0, "");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray54 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        char[] charArray56 = new char[] {};
        java.lang.String str57 = characterReader49.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader43.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray68 = new char[] { '\uffff', ' ', '\uffff', '4' };
        java.lang.String str69 = characterReader63.consumeToAnySorted(charArray68);
        boolean boolean70 = characterReader43.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader22.consumeToAnySorted(charArray68);
        boolean boolean72 = characterReader1.matchesAny(charArray68);
        java.lang.String str73 = characterReader1.consumeData();
        boolean boolean75 = characterReader1.matchesIgnoreCase("");
        boolean boolean76 = characterReader1.isEmpty();
        int int78 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean79 = characterReader1.isEmpty();
        boolean boolean83 = characterReader1.rangeEquals(3, (int) (byte) 100, "");
        boolean boolean84 = characterReader1.matchesLetter();
        boolean boolean85 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', ' ', '\uffff', '4' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "i!" + "'", str73, "i!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }
}

